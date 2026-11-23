.class public Lcom/rollbar/notifier/sender/BufferedSender;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/rollbar/notifier/sender/Sender;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/rollbar/notifier/sender/BufferedSender$FailureListener;,
        Lcom/rollbar/notifier/sender/BufferedSender$SenderThreadFactory;,
        Lcom/rollbar/notifier/sender/BufferedSender$SendTask;,
        Lcom/rollbar/notifier/sender/BufferedSender$Builder;
    }
.end annotation


# static fields
.field private static final DEFAULT_BATCH_SIZE:I = 0x7fffffff

.field private static final DEFAULT_FLUSH_FREQ:J

.field private static final DEFAULT_INITIAL_FLUSH_DELAY:J

.field private static final DEFAULT_MAX_SEND_ATTEMPT_COUNT:I = 0x1e

.field private static LOGGER:Lva/a;


# instance fields
.field private final batchSize:I

.field private executorService:Ljava/util/concurrent/ScheduledExecutorService;

.field private final maxSendAttemptCount:I

.field private queue:Ljava/util/Queue;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Queue<",
            "Lcom/rollbar/api/payload/Payload;",
            ">;"
        }
    .end annotation
.end field

.field private sendTask:Lcom/rollbar/notifier/sender/BufferedSender$SendTask;

.field private sender:Lcom/rollbar/notifier/sender/Sender;

.field private final senderFailureStrategy:Lcom/rollbar/notifier/sender/SenderFailureStrategy;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    sget-object v0, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    .line 2
    .line 3
    const-wide/16 v1, 0x5

    .line 4
    .line 5
    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    .line 6
    .line 7
    .line 8
    move-result-wide v0

    .line 9
    sput-wide v0, Lcom/rollbar/notifier/sender/BufferedSender;->DEFAULT_FLUSH_FREQ:J

    .line 10
    .line 11
    sput-wide v0, Lcom/rollbar/notifier/sender/BufferedSender;->DEFAULT_INITIAL_FLUSH_DELAY:J

    .line 12
    .line 13
    const-class v0, Lcom/rollbar/notifier/sender/BufferedSender;

    .line 14
    .line 15
    invoke-static {v0}, Lva/b;->e(Ljava/lang/Class;)Lva/a;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    sput-object v0, Lcom/rollbar/notifier/sender/BufferedSender;->LOGGER:Lva/a;

    .line 20
    .line 21
    return-void
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
.end method

.method public constructor <init>(Lcom/rollbar/notifier/sender/BufferedSender$Builder;)V
    .locals 1

    .line 1
    new-instance v0, Lcom/rollbar/notifier/sender/BufferedSender$SenderThreadFactory;

    invoke-direct {v0}, Lcom/rollbar/notifier/sender/BufferedSender$SenderThreadFactory;-><init>()V

    invoke-static {v0}, Ljava/util/concurrent/Executors;->newSingleThreadScheduledExecutor(Ljava/util/concurrent/ThreadFactory;)Ljava/util/concurrent/ScheduledExecutorService;

    move-result-object v0

    invoke-direct {p0, p1, v0}, Lcom/rollbar/notifier/sender/BufferedSender;-><init>(Lcom/rollbar/notifier/sender/BufferedSender$Builder;Ljava/util/concurrent/ScheduledExecutorService;)V

    return-void
.end method

.method public constructor <init>(Lcom/rollbar/notifier/sender/BufferedSender$Builder;Ljava/util/concurrent/ScheduledExecutorService;)V
    .locals 11

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    invoke-static {p1}, Lcom/rollbar/notifier/sender/BufferedSender$Builder;->access$000(Lcom/rollbar/notifier/sender/BufferedSender$Builder;)Lcom/rollbar/notifier/sender/Sender;

    move-result-object v0

    const-string v1, "The sender can not be null"

    invoke-static {v0, v1}, LL6/b;->b(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    invoke-static {p1}, Lcom/rollbar/notifier/sender/BufferedSender$Builder;->access$100(Lcom/rollbar/notifier/sender/BufferedSender$Builder;)Ljava/util/Queue;

    move-result-object v0

    const-string v1, "The queue can not be null"

    invoke-static {v0, v1}, LL6/b;->b(Ljava/lang/Object;Ljava/lang/String;)V

    .line 5
    invoke-static {p1}, Lcom/rollbar/notifier/sender/BufferedSender$Builder;->access$200(Lcom/rollbar/notifier/sender/BufferedSender$Builder;)I

    move-result v0

    iput v0, p0, Lcom/rollbar/notifier/sender/BufferedSender;->batchSize:I

    const/16 v1, 0x1e

    .line 6
    iput v1, p0, Lcom/rollbar/notifier/sender/BufferedSender;->maxSendAttemptCount:I

    .line 7
    invoke-static {p1}, Lcom/rollbar/notifier/sender/BufferedSender$Builder;->access$000(Lcom/rollbar/notifier/sender/BufferedSender$Builder;)Lcom/rollbar/notifier/sender/Sender;

    move-result-object v1

    iput-object v1, p0, Lcom/rollbar/notifier/sender/BufferedSender;->sender:Lcom/rollbar/notifier/sender/Sender;

    .line 8
    invoke-static {p1}, Lcom/rollbar/notifier/sender/BufferedSender$Builder;->access$100(Lcom/rollbar/notifier/sender/BufferedSender$Builder;)Ljava/util/Queue;

    move-result-object v1

    iput-object v1, p0, Lcom/rollbar/notifier/sender/BufferedSender;->queue:Ljava/util/Queue;

    .line 9
    invoke-static {p1}, Lcom/rollbar/notifier/sender/BufferedSender$Builder;->access$300(Lcom/rollbar/notifier/sender/BufferedSender$Builder;)Lcom/rollbar/notifier/sender/SenderFailureStrategy;

    move-result-object v1

    iput-object v1, p0, Lcom/rollbar/notifier/sender/BufferedSender;->senderFailureStrategy:Lcom/rollbar/notifier/sender/SenderFailureStrategy;

    if-eqz v1, :cond_0

    .line 10
    new-instance v2, Lcom/rollbar/notifier/sender/BufferedSender$FailureListener;

    invoke-static {p1}, Lcom/rollbar/notifier/sender/BufferedSender$Builder;->access$300(Lcom/rollbar/notifier/sender/BufferedSender$Builder;)Lcom/rollbar/notifier/sender/SenderFailureStrategy;

    move-result-object v3

    invoke-direct {v2, p0, v3}, Lcom/rollbar/notifier/sender/BufferedSender$FailureListener;-><init>(Lcom/rollbar/notifier/sender/BufferedSender;Lcom/rollbar/notifier/sender/SenderFailureStrategy;)V

    .line 11
    iget-object v3, p0, Lcom/rollbar/notifier/sender/BufferedSender;->sender:Lcom/rollbar/notifier/sender/Sender;

    invoke-interface {v3, v2}, Lcom/rollbar/notifier/sender/Sender;->addListener(Lcom/rollbar/notifier/sender/listener/SenderListener;)V

    .line 12
    :cond_0
    new-instance v5, Lcom/rollbar/notifier/sender/BufferedSender$SendTask;

    iget-object v2, p0, Lcom/rollbar/notifier/sender/BufferedSender;->queue:Ljava/util/Queue;

    iget-object v3, p0, Lcom/rollbar/notifier/sender/BufferedSender;->sender:Lcom/rollbar/notifier/sender/Sender;

    invoke-direct {v5, v0, v2, v3, v1}, Lcom/rollbar/notifier/sender/BufferedSender$SendTask;-><init>(ILjava/util/Queue;Lcom/rollbar/notifier/sender/Sender;Lcom/rollbar/notifier/sender/SenderFailureStrategy;)V

    iput-object v5, p0, Lcom/rollbar/notifier/sender/BufferedSender;->sendTask:Lcom/rollbar/notifier/sender/BufferedSender$SendTask;

    .line 13
    iput-object p2, p0, Lcom/rollbar/notifier/sender/BufferedSender;->executorService:Ljava/util/concurrent/ScheduledExecutorService;

    .line 14
    invoke-static {p1}, Lcom/rollbar/notifier/sender/BufferedSender$Builder;->access$400(Lcom/rollbar/notifier/sender/BufferedSender$Builder;)J

    move-result-wide v6

    invoke-static {p1}, Lcom/rollbar/notifier/sender/BufferedSender$Builder;->access$500(Lcom/rollbar/notifier/sender/BufferedSender$Builder;)J

    move-result-wide v8

    sget-object v10, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    move-object v4, p2

    .line 15
    invoke-interface/range {v4 .. v10}, Ljava/util/concurrent/ScheduledExecutorService;->scheduleWithFixedDelay(Ljava/lang/Runnable;JJLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    return-void
.end method

.method public static synthetic access$600()J
    .locals 2

    .line 1
    sget-wide v0, Lcom/rollbar/notifier/sender/BufferedSender;->DEFAULT_INITIAL_FLUSH_DELAY:J

    .line 2
    .line 3
    return-wide v0
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
.end method

.method public static synthetic access$700()J
    .locals 2

    .line 1
    sget-wide v0, Lcom/rollbar/notifier/sender/BufferedSender;->DEFAULT_FLUSH_FREQ:J

    .line 2
    .line 3
    return-wide v0
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
.end method

.method public static synthetic access$800()Lva/a;
    .locals 1

    .line 1
    sget-object v0, Lcom/rollbar/notifier/sender/BufferedSender;->LOGGER:Lva/a;

    .line 2
    .line 3
    return-object v0
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
.end method

.method public static synthetic access$900(Lcom/rollbar/notifier/sender/BufferedSender;Lcom/rollbar/api/payload/Payload;)Z
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/rollbar/notifier/sender/BufferedSender;->tooManySendAttempts(Lcom/rollbar/api/payload/Payload;)Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
.end method

.method private flushQueue()V
    .locals 1

    .line 1
    :goto_0
    iget-object v0, p0, Lcom/rollbar/notifier/sender/BufferedSender;->queue:Ljava/util/Queue;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/Collection;->size()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-lez v0, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, Lcom/rollbar/notifier/sender/BufferedSender;->sendTask:Lcom/rollbar/notifier/sender/BufferedSender$SendTask;

    .line 10
    .line 11
    invoke-virtual {v0}, Lcom/rollbar/notifier/sender/BufferedSender$SendTask;->run()V

    .line 12
    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    return-void
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
.end method

.method private notifyError(Lcom/rollbar/api/payload/Payload;Ljava/lang/Exception;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/rollbar/notifier/sender/BufferedSender;->sender:Lcom/rollbar/notifier/sender/Sender;

    .line 2
    .line 3
    invoke-interface {v0}, Lcom/rollbar/notifier/sender/Sender;->getListeners()Ljava/util/List;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-eqz v1, :cond_0

    .line 16
    .line 17
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    check-cast v1, Lcom/rollbar/notifier/sender/listener/SenderListener;

    .line 22
    .line 23
    invoke-interface {v1, p1, p2}, Lcom/rollbar/notifier/sender/listener/SenderListener;->onError(Lcom/rollbar/api/payload/Payload;Ljava/lang/Exception;)V

    .line 24
    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_0
    return-void
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
.end method

.method private tooManySendAttempts(Lcom/rollbar/api/payload/Payload;)Z
    .locals 1

    .line 1
    invoke-virtual {p1}, Lcom/rollbar/api/payload/Payload;->getSendAttemptCount()I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    iget v0, p0, Lcom/rollbar/notifier/sender/BufferedSender;->maxSendAttemptCount:I

    .line 6
    .line 7
    if-lt p1, v0, :cond_0

    .line 8
    .line 9
    const/4 p1, 0x1

    .line 10
    return p1

    .line 11
    :cond_0
    const/4 p1, 0x0

    .line 12
    return p1
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
.end method


# virtual methods
.method public addListener(Lcom/rollbar/notifier/sender/listener/SenderListener;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/rollbar/notifier/sender/BufferedSender;->sender:Lcom/rollbar/notifier/sender/Sender;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Lcom/rollbar/notifier/sender/Sender;->addListener(Lcom/rollbar/notifier/sender/listener/SenderListener;)V

    .line 4
    .line 5
    .line 6
    return-void
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
.end method

.method public close()V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/rollbar/notifier/sender/BufferedSender;->senderFailureStrategy:Lcom/rollbar/notifier/sender/SenderFailureStrategy;

    if-eqz v0, :cond_0

    .line 2
    invoke-interface {v0}, Ljava/io/Closeable;->close()V

    .line 3
    :cond_0
    iget-object v0, p0, Lcom/rollbar/notifier/sender/BufferedSender;->executorService:Ljava/util/concurrent/ScheduledExecutorService;

    invoke-interface {v0}, Ljava/util/concurrent/ExecutorService;->shutdown()V

    .line 4
    iget-object v0, p0, Lcom/rollbar/notifier/sender/BufferedSender;->sender:Lcom/rollbar/notifier/sender/Sender;

    invoke-interface {v0}, Ljava/io/Closeable;->close()V

    return-void
.end method

.method public close(Z)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    if-eqz p1, :cond_0

    .line 5
    invoke-direct {p0}, Lcom/rollbar/notifier/sender/BufferedSender;->flushQueue()V

    .line 6
    :cond_0
    invoke-virtual {p0}, Lcom/rollbar/notifier/sender/BufferedSender;->close()V

    return-void
.end method

.method public getListeners()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/rollbar/notifier/sender/listener/SenderListener;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/rollbar/notifier/sender/BufferedSender;->sender:Lcom/rollbar/notifier/sender/Sender;

    .line 2
    .line 3
    invoke-interface {v0}, Lcom/rollbar/notifier/sender/Sender;->getListeners()Ljava/util/List;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
.end method

.method public queue()Ljava/util/Queue;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Queue<",
            "Lcom/rollbar/api/payload/Payload;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/rollbar/notifier/sender/BufferedSender;->queue:Ljava/util/Queue;

    .line 2
    .line 3
    return-object v0
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
.end method

.method public send(Lcom/rollbar/api/payload/Payload;)V
    .locals 2

    .line 1
    :try_start_0
    iget-object v0, p0, Lcom/rollbar/notifier/sender/BufferedSender;->queue:Ljava/util/Queue;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Ljava/util/Queue;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 4
    .line 5
    .line 6
    return-void

    .line 7
    :catch_0
    move-exception v0

    .line 8
    new-instance v1, Lcom/rollbar/notifier/sender/exception/SenderException;

    .line 9
    .line 10
    invoke-direct {v1, v0}, Lcom/rollbar/notifier/sender/exception/SenderException;-><init>(Ljava/lang/Exception;)V

    .line 11
    .line 12
    .line 13
    invoke-direct {p0, p1, v1}, Lcom/rollbar/notifier/sender/BufferedSender;->notifyError(Lcom/rollbar/api/payload/Payload;Ljava/lang/Exception;)V

    .line 14
    .line 15
    .line 16
    return-void
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
.end method

.method public sender()Lcom/rollbar/notifier/sender/Sender;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/rollbar/notifier/sender/BufferedSender;->sender:Lcom/rollbar/notifier/sender/Sender;

    .line 2
    .line 3
    return-object v0
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
.end method
