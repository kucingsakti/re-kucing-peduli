package com.onesignal.inAppMessages.internal.triggers.impl;

import com.onesignal.inAppMessages.internal.l;
import java.util.ArrayList;
import java.util.List;
import java.util.TimerTask;
import p076h8.m;
import p210v8.i;
import p210v8.k;

/* JADX INFO: loaded from: classes.dex */
public final class a implements com.onesignal.common.events.d {
    public static final C0049a Companion = new C0049a(null);
    private static final long DEFAULT_LAST_IN_APP_TIME_AGO = 999999;
    private static final double REQUIRED_ACCURACY = 0.3d;
    private final p111l6.b _session;
    private final p244z5.a _state;
    private final p110l5.a _time;
    private final com.onesignal.common.events.b events;
    private final List<String> scheduledMessages;

    /* JADX INFO: renamed from: com.onesignal.inAppMessages.internal.triggers.impl.a$a, reason: collision with other inner class name */
    public static final class C0049a {
        public /* synthetic */ C0049a(p210v8.e eVar) {
            this();
        }

        private C0049a() {
        }
    }

    public static final class b extends k implements p200u8.b {
        final /* synthetic */ String $triggerId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str) {
            super(1);
            this.$triggerId = str;
        }

        @Override // p200u8.b
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((A5.b) obj);
            return m.a;
        }

        public final void invoke(A5.b bVar) {
            i.f(bVar, "it");
            bVar.onTriggerCompleted(this.$triggerId);
        }
    }

    public static final class c extends TimerTask {
        final /* synthetic */ String $triggerId;

        /* JADX INFO: renamed from: com.onesignal.inAppMessages.internal.triggers.impl.a$c$a, reason: collision with other inner class name */
        public static final class C0050a extends k implements p200u8.b {
            final /* synthetic */ String $triggerId;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0050a(String str) {
                super(1);
                this.$triggerId = str;
            }

            @Override // p200u8.b
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((A5.b) obj);
                return m.a;
            }

            public final void invoke(A5.b bVar) {
                i.f(bVar, "it");
                bVar.onTriggerConditionChanged(this.$triggerId);
            }
        }

        public c(String str) {
            this.$triggerId = str;
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            a.this.scheduledMessages.remove(this.$triggerId);
            a.this.getEvents().fire(new C0050a(this.$triggerId));
        }
    }

    public a(p244z5.a aVar, p111l6.b bVar, p110l5.a aVar2) {
        i.f(aVar, "_state");
        i.f(bVar, "_session");
        i.f(aVar2, "_time");
        this._state = aVar;
        this._session = bVar;
        this._time = aVar2;
        this.events = new com.onesignal.common.events.b();
        this.scheduledMessages = new ArrayList();
    }

    private final boolean evaluateTimeIntervalWithOperator(double d3, double d8, l.b bVar) {
        switch (com.onesignal.inAppMessages.internal.triggers.impl.b.$EnumSwitchMapping$1[bVar.ordinal()]) {
            case 1:
                return d8 < d3;
            case 2:
                return d8 <= d3 || roughlyEqual(d3, d8);
            case 3:
                return d8 >= d3;
            case 4:
                return d8 >= d3 || roughlyEqual(d3, d8);
            case 5:
                return roughlyEqual(d3, d8);
            case 6:
                return !roughlyEqual(d3, d8);
            default:
                com.onesignal.debug.internal.logging.b.error$default("Attempted to apply an invalid operator on a time-based in-app-message trigger: " + bVar, null, 2, null);
                return false;
        }
    }

    private final boolean roughlyEqual(double d3, double d8) {
        return Math.abs(d3 - d8) < REQUIRED_ACCURACY;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0089 A[Catch: all -> 0x0057, TRY_LEAVE, TryCatch #0 {all -> 0x0057, blocks: (B:7:0x0014, B:11:0x001e, B:29:0x0067, B:31:0x0089, B:38:0x009c, B:42:0x00a6, B:16:0x0034, B:20:0x003e, B:23:0x004a, B:28:0x0065, B:27:0x0059), top: B:47:0x0014 }] */
    /* JADX WARN: Code duplicated, block: B:34:0x0095  */
    /* JADX WARN: Code duplicated, block: B:36:0x009a A[DONT_GENERATE] */
    /* JADX WARN: Code duplicated, block: B:38:0x009c A[Catch: all -> 0x0057, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0057, blocks: (B:7:0x0014, B:11:0x001e, B:29:0x0067, B:31:0x0089, B:38:0x009c, B:42:0x00a6, B:16:0x0034, B:20:0x003e, B:23:0x004a, B:28:0x0065, B:27:0x0059), top: B:47:0x0014 }] */
    /* JADX WARN: Code duplicated, block: B:40:0x00a4 A[DONT_GENERATE] */
    /* JADX WARN: Code duplicated, block: B:42:0x00a6 A[Catch: all -> 0x0057, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0057, blocks: (B:7:0x0014, B:11:0x001e, B:29:0x0067, B:31:0x0089, B:38:0x009c, B:42:0x00a6, B:16:0x0034, B:20:0x003e, B:23:0x004a, B:28:0x0065, B:27:0x0059), top: B:47:0x0014 }] */
    public final boolean dynamicTriggerShouldFire(l lVar) {
        long currentTimeMillis;
        long startTime;
        long j;
        long j10;
        String triggerId;
        long jDoubleValue;
        long j11;
        i.f(lVar, "trigger");
        if (lVar.getValue() == null) {
            return false;
        }
        synchronized (this.scheduledMessages) {
            try {
                if (!(lVar.getValue() instanceof Number)) {
                    return false;
                }
                int i10 = com.onesignal.inAppMessages.internal.triggers.impl.b.$EnumSwitchMapping$0[lVar.getKind().ordinal()];
                if (i10 != 1) {
                    if (i10 != 2) {
                        j10 = 0;
                    } else {
                        if (this._state.getInAppMessageIdShowing() != null) {
                            return false;
                        }
                        Long lastTimeInAppDismissed = this._state.getLastTimeInAppDismissed();
                        if (lastTimeInAppDismissed == null) {
                            j = DEFAULT_LAST_IN_APP_TIME_AGO;
                        } else {
                            currentTimeMillis = this._time.getCurrentTimeMillis();
                            startTime = lastTimeInAppDismissed.longValue();
                        }
                        j10 = j;
                    }
                    triggerId = lVar.getTriggerId();
                    Number number = (Number) lVar.getValue();
                    i.c(number);
                    jDoubleValue = (long) (number.doubleValue() * ((double) 1000));
                    if (evaluateTimeIntervalWithOperator(jDoubleValue, j10, lVar.getOperatorType())) {
                        this.events.fire(new b(triggerId));
                        return true;
                    }
                    j11 = jDoubleValue - j10;
                    if (j11 <= 0) {
                        return false;
                    }
                    if (this.scheduledMessages.contains(triggerId)) {
                        return false;
                    }
                    com.onesignal.inAppMessages.internal.triggers.impl.c.INSTANCE.scheduleTrigger(new c(triggerId), triggerId, j11);
                    this.scheduledMessages.add(triggerId);
                    return false;
                }
                currentTimeMillis = this._time.getCurrentTimeMillis();
                startTime = this._session.getStartTime();
                j = currentTimeMillis - startTime;
                j10 = j;
                triggerId = lVar.getTriggerId();
                Number number2 = (Number) lVar.getValue();
                i.c(number2);
                jDoubleValue = (long) (number2.doubleValue() * ((double) 1000));
                if (evaluateTimeIntervalWithOperator(jDoubleValue, j10, lVar.getOperatorType())) {
                    this.events.fire(new b(triggerId));
                    return true;
                }
                j11 = jDoubleValue - j10;
                if (j11 <= 0) {
                    return false;
                }
                if (this.scheduledMessages.contains(triggerId)) {
                    return false;
                }
                com.onesignal.inAppMessages.internal.triggers.impl.c.INSTANCE.scheduleTrigger(new c(triggerId), triggerId, j11);
                this.scheduledMessages.add(triggerId);
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final com.onesignal.common.events.b getEvents() {
        return this.events;
    }

    @Override // com.onesignal.common.events.d
    public boolean getHasSubscribers() {
        return this.events.getHasSubscribers();
    }

    @Override // com.onesignal.common.events.d
    public void subscribe(A5.b bVar) {
        i.f(bVar, "handler");
        this.events.subscribe(bVar);
    }

    @Override // com.onesignal.common.events.d
    public void unsubscribe(A5.b bVar) {
        i.f(bVar, "handler");
        this.events.unsubscribe(bVar);
    }
}
