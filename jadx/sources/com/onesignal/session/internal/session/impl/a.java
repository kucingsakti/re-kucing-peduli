package com.onesignal.session.internal.session.impl;

import p064g5.f;
import p076h8.m;
import p123m8.d;
import p144o8.g;
import p173r6.n;
import p210v8.e;
import p210v8.i;

/* JADX INFO: loaded from: classes.dex */
public final class a implements p100k5.b, p111l6.a {
    public static final C0078a Companion = new C0078a(null);
    public static final long SECONDS_IN_A_DAY = 86400;
    private final com.onesignal.core.internal.config.b _configModelStore;
    private final p162q6.b _identityModelStore;
    private final f _operationRepo;
    private final j6.b _outcomeEventsController;
    private final p111l6.b _sessionService;

    /* JADX INFO: renamed from: com.onesignal.session.internal.session.impl.a$a, reason: collision with other inner class name */
    public static final class C0078a {
        public /* synthetic */ C0078a(e eVar) {
            this();
        }

        private C0078a() {
        }
    }

    public static final class b extends g implements p200u8.b {
        final /* synthetic */ long $durationInSeconds;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(long j, d<? super b> dVar) {
            super(1, dVar);
            this.$durationInSeconds = j;
        }

        @Override // p144o8.a
        public final d<m> create(d<?> dVar) {
            return a.this.new b(this.$durationInSeconds, dVar);
        }

        @Override // p144o8.a
        public final Object invokeSuspend(Object obj) {
            p134n8.a aVar = p134n8.a.f13404s;
            int i10 = this.label;
            if (i10 == 0) {
                J7.a.v(obj);
                j6.b bVar = a.this._outcomeEventsController;
                long j = this.$durationInSeconds;
                this.label = 1;
                if (bVar.sendSessionEndOutcomeEvent(j, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                J7.a.v(obj);
            }
            return m.a;
        }

        @Override // p200u8.b
        public final Object invoke(d<? super m> dVar) {
            return ((b) create(dVar)).invokeSuspend(m.a);
        }
    }

    public a(f fVar, p111l6.b bVar, com.onesignal.core.internal.config.b bVar2, p162q6.b bVar3, j6.b bVar4) {
        i.f(fVar, "_operationRepo");
        i.f(bVar, "_sessionService");
        i.f(bVar2, "_configModelStore");
        i.f(bVar3, "_identityModelStore");
        i.f(bVar4, "_outcomeEventsController");
        this._operationRepo = fVar;
        this._sessionService = bVar;
        this._configModelStore = bVar2;
        this._identityModelStore = bVar3;
        this._outcomeEventsController = bVar4;
    }

    @Override // p111l6.a
    public void onSessionActive() {
    }

    @Override // p111l6.a
    public void onSessionEnded(long j) {
        long j10 = j / ((long) 1000);
        if (j10 < 1 || j10 > SECONDS_IN_A_DAY) {
            com.onesignal.debug.internal.logging.b.error$default("SessionListener.onSessionEnded sending duration of " + j10 + " seconds", null, 2, null);
        }
        p064g5.e.enqueue$default(this._operationRepo, new p173r6.m(((com.onesignal.core.internal.config.a) this._configModelStore.getModel()).getAppId(), ((p162q6.a) this._identityModelStore.getModel()).getOnesignalId(), j10), false, 2, null);
        com.onesignal.common.threading.a.suspendifyOnThread$default(0, new b(j10, null), 1, null);
    }

    @Override // p111l6.a
    public void onSessionStarted() {
        this._operationRepo.enqueue(new n(((com.onesignal.core.internal.config.a) this._configModelStore.getModel()).getAppId(), ((p162q6.a) this._identityModelStore.getModel()).getOnesignalId()), true);
    }

    @Override // p100k5.b
    public void start() {
        this._sessionService.subscribe(this);
    }
}
