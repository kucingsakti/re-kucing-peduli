package com.rollbar.notifier.sender;

import L6.b;
import com.rollbar.api.payload.Payload;
import com.rollbar.notifier.sender.exception.SenderException;
import com.rollbar.notifier.sender.listener.SenderListener;
import com.rollbar.notifier.sender.result.Response;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import va.a;

/* JADX INFO: loaded from: classes.dex */
public class BufferedSender implements Sender {
    private static final int DEFAULT_BATCH_SIZE = Integer.MAX_VALUE;
    private static final long DEFAULT_FLUSH_FREQ;
    private static final long DEFAULT_INITIAL_FLUSH_DELAY;
    private static final int DEFAULT_MAX_SEND_ATTEMPT_COUNT = 30;
    private static a LOGGER;
    private final int batchSize;
    private ScheduledExecutorService executorService;
    private final int maxSendAttemptCount;
    private Queue<Payload> queue;
    private SendTask sendTask;
    private Sender sender;
    private final SenderFailureStrategy senderFailureStrategy;

    /* JADX INFO: renamed from: com.rollbar.notifier.sender.BufferedSender$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$rollbar$notifier$sender$SenderFailureStrategy$PayloadAction;

        static {
            int[] iArr = new int[SenderFailureStrategy.PayloadAction.values().length];
            $SwitchMap$com$rollbar$notifier$sender$SenderFailureStrategy$PayloadAction = iArr;
            try {
                iArr[SenderFailureStrategy.PayloadAction.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$rollbar$notifier$sender$SenderFailureStrategy$PayloadAction[SenderFailureStrategy.PayloadAction.CAN_BE_RETRIED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public static final class Builder {
        private Queue<Payload> queue;
        private SenderFailureStrategy senderFailureStrategy;
        private int batchSize = BufferedSender.DEFAULT_BATCH_SIZE;
        private long initialFlushDelay = BufferedSender.DEFAULT_INITIAL_FLUSH_DELAY;
        private long flushFreq = BufferedSender.DEFAULT_FLUSH_FREQ;
        private Sender sender = null;

        public Builder batchSize(int i10) {
            this.batchSize = i10;
            return this;
        }

        public BufferedSender build() {
            if (this.queue == null) {
                this.queue = new ConcurrentLinkedQueue();
            }
            if (this.sender == null) {
                this.sender = new SyncSender.Builder().build();
            }
            return new BufferedSender(this);
        }

        public Builder flushFreq(long j) {
            this.flushFreq = j;
            return this;
        }

        public Builder initialFlushDelay(long j) {
            this.initialFlushDelay = j;
            return this;
        }

        public Builder queue(Queue<Payload> queue) {
            this.queue = queue;
            return this;
        }

        public Builder sender(Sender sender) {
            this.sender = sender;
            return this;
        }

        public Builder senderFailureStrategy(SenderFailureStrategy senderFailureStrategy) {
            this.senderFailureStrategy = senderFailureStrategy;
            return this;
        }
    }

    public class FailureListener implements SenderListener {
        private final SenderFailureStrategy senderFailureStrategy;

        public FailureListener(SenderFailureStrategy senderFailureStrategy) {
            b.b(senderFailureStrategy, "The senderFailureStrategy cannot be null");
            this.senderFailureStrategy = senderFailureStrategy;
        }

        private void apply(Payload payload, SenderFailureStrategy.PayloadAction payloadAction) {
            int i10 = AnonymousClass1.$SwitchMap$com$rollbar$notifier$sender$SenderFailureStrategy$PayloadAction[payloadAction.ordinal()];
            if (i10 != 1) {
                if (i10 != 2) {
                    throw new IllegalArgumentException("Unknown action type " + payloadAction);
                }
                if (!BufferedSender.this.tooManySendAttempts(payload)) {
                    BufferedSender.this.send(payload);
                    return;
                }
                BufferedSender.LOGGER.c("Discarding payload after " + payload.getSendAttemptCount() + " attempts");
            }
        }

        @Override // com.rollbar.notifier.sender.listener.SenderListener
        public void onError(Payload payload, Exception exc) {
            apply(payload, this.senderFailureStrategy.getAction(payload, exc));
        }

        @Override // com.rollbar.notifier.sender.listener.SenderListener
        public void onResponse(Payload payload, Response response) {
            apply(payload, this.senderFailureStrategy.getAction(payload, response));
        }
    }

    public static final class SendTask implements Runnable {
        private final int batchSize;
        private final Queue<Payload> queue;
        private final Sender sender;
        private final SenderFailureStrategy senderFailureStrategy;

        public SendTask(int i10, Queue<Payload> queue, Sender sender, SenderFailureStrategy senderFailureStrategy) {
            this.batchSize = i10;
            this.queue = queue;
            this.sender = sender;
            this.senderFailureStrategy = senderFailureStrategy;
        }

        private Payload getItemFromQueue() {
            if (isSuspended()) {
                return null;
            }
            return this.queue.poll();
        }

        private boolean isSuspended() {
            SenderFailureStrategy senderFailureStrategy = this.senderFailureStrategy;
            if (senderFailureStrategy == null) {
                return false;
            }
            return senderFailureStrategy.isSendingSuspended();
        }

        @Override // java.lang.Runnable
        public void run() {
            Payload itemFromQueue = null;
            for (int i10 = 0; i10 < this.batchSize && (itemFromQueue = getItemFromQueue()) != null; i10++) {
                try {
                    try {
                        itemFromQueue.incrementSendAttemptCount();
                        this.sender.send(itemFromQueue);
                    } catch (Exception unused) {
                    } catch (Throwable th) {
                        throw th;
                    }
                } catch (Exception e10) {
                    BufferedSender.LOGGER.b("Error sending the payload.", e10);
                    Iterator<SenderListener> it = this.sender.getListeners().iterator();
                    while (it.hasNext()) {
                        it.next().onError(itemFromQueue, new SenderException(e10));
                    }
                    return;
                } catch (Throwable th2) {
                    BufferedSender.LOGGER.b("Fatal error sending the payload.", th2);
                    return;
                }
            }
        }
    }

    public static final class SenderThreadFactory implements ThreadFactory {
        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable);
            thread.setName("rollbar-buffered_sender");
            thread.setDaemon(true);
            return thread;
        }
    }

    static {
        long millis = TimeUnit.SECONDS.toMillis(5L);
        DEFAULT_FLUSH_FREQ = millis;
        DEFAULT_INITIAL_FLUSH_DELAY = millis;
        LOGGER = va.b.e(BufferedSender.class);
    }

    public BufferedSender(Builder builder) {
        this(builder, Executors.newSingleThreadScheduledExecutor(new SenderThreadFactory()));
    }

    private void flushQueue() {
        while (this.queue.size() > 0) {
            this.sendTask.run();
        }
    }

    private void notifyError(Payload payload, Exception exc) {
        Iterator<SenderListener> it = this.sender.getListeners().iterator();
        while (it.hasNext()) {
            it.next().onError(payload, exc);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean tooManySendAttempts(Payload payload) {
        return payload.getSendAttemptCount() >= this.maxSendAttemptCount;
    }

    @Override // com.rollbar.notifier.sender.Sender
    public void addListener(SenderListener senderListener) {
        this.sender.addListener(senderListener);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        SenderFailureStrategy senderFailureStrategy = this.senderFailureStrategy;
        if (senderFailureStrategy != null) {
            senderFailureStrategy.close();
        }
        this.executorService.shutdown();
        this.sender.close();
    }

    @Override // com.rollbar.notifier.sender.Sender
    public List<SenderListener> getListeners() {
        return this.sender.getListeners();
    }

    public Queue<Payload> queue() {
        return this.queue;
    }

    @Override // com.rollbar.notifier.sender.Sender
    public void send(Payload payload) {
        try {
            this.queue.add(payload);
        } catch (Exception e10) {
            notifyError(payload, new SenderException(e10));
        }
    }

    public Sender sender() {
        return this.sender;
    }

    public BufferedSender(Builder builder, ScheduledExecutorService scheduledExecutorService) {
        b.b(builder.sender, "The sender can not be null");
        b.b(builder.queue, "The queue can not be null");
        int i10 = builder.batchSize;
        this.batchSize = i10;
        this.maxSendAttemptCount = DEFAULT_MAX_SEND_ATTEMPT_COUNT;
        this.sender = builder.sender;
        this.queue = builder.queue;
        SenderFailureStrategy senderFailureStrategy = builder.senderFailureStrategy;
        this.senderFailureStrategy = senderFailureStrategy;
        if (senderFailureStrategy != null) {
            this.sender.addListener(new FailureListener(builder.senderFailureStrategy));
        }
        SendTask sendTask = new SendTask(i10, this.queue, this.sender, senderFailureStrategy);
        this.sendTask = sendTask;
        this.executorService = scheduledExecutorService;
        scheduledExecutorService.scheduleWithFixedDelay(sendTask, builder.initialFlushDelay, builder.flushFreq, TimeUnit.MILLISECONDS);
    }

    @Override // com.rollbar.notifier.sender.Sender
    public void close(boolean z6) throws Exception {
        if (z6) {
            flushQueue();
        }
        close();
    }
}
