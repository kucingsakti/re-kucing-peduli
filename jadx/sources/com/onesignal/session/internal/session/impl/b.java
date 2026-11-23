package com.onesignal.session.internal.session.impl;

import X4.e;
import X4.f;
import java.util.UUID;
import p076h8.m;
import p111l6.d;
import p210v8.i;
import p210v8.k;

/* JADX INFO: loaded from: classes.dex */
public final class b implements p111l6.b, p100k5.a, p100k5.b, Z4.b, e {
    private final f _applicationService;
    private final com.onesignal.core.internal.config.b _configModelStore;
    private final d _sessionModelStore;
    private final p110l5.a _time;
    private com.onesignal.core.internal.config.a config;
    private boolean hasFocused;
    private p111l6.c session;
    private final com.onesignal.common.events.b sessionLifeCycleNotifier;
    private boolean shouldFireOnSubscribe;

    public static final class a extends k implements p200u8.b {
        final /* synthetic */ long $activeDuration;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(long j) {
            super(1);
            this.$activeDuration = j;
        }

        @Override // p200u8.b
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((p111l6.a) obj);
            return m.a;
        }

        public final void invoke(p111l6.a aVar) {
            i.f(aVar, "it");
            aVar.onSessionEnded(this.$activeDuration);
        }
    }

    /* JADX INFO: renamed from: com.onesignal.session.internal.session.impl.b$b, reason: collision with other inner class name */
    public static final class C0079b extends k implements p200u8.b {
        public static final C0079b INSTANCE = new C0079b();

        public C0079b() {
            super(1);
        }

        @Override // p200u8.b
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((p111l6.a) obj);
            return m.a;
        }

        public final void invoke(p111l6.a aVar) {
            i.f(aVar, "it");
            aVar.onSessionStarted();
        }
    }

    public static final class c extends k implements p200u8.b {
        public static final c INSTANCE = new c();

        public c() {
            super(1);
        }

        @Override // p200u8.b
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((p111l6.a) obj);
            return m.a;
        }

        public final void invoke(p111l6.a aVar) {
            i.f(aVar, "it");
            aVar.onSessionActive();
        }
    }

    public b(f fVar, com.onesignal.core.internal.config.b bVar, d dVar, p110l5.a aVar) {
        i.f(fVar, "_applicationService");
        i.f(bVar, "_configModelStore");
        i.f(dVar, "_sessionModelStore");
        i.f(aVar, "_time");
        this._applicationService = fVar;
        this._configModelStore = bVar;
        this._sessionModelStore = dVar;
        this._time = aVar;
        this.sessionLifeCycleNotifier = new com.onesignal.common.events.b();
    }

    private final void endSession() {
        p111l6.c cVar = this.session;
        i.c(cVar);
        if (cVar.isValid()) {
            p111l6.c cVar2 = this.session;
            i.c(cVar2);
            long activeDuration = cVar2.getActiveDuration();
            com.onesignal.debug.internal.logging.b.debug$default("SessionService.backgroundRun: Session ended. activeDuration: " + activeDuration, null, 2, null);
            p111l6.c cVar3 = this.session;
            i.c(cVar3);
            cVar3.setValid(false);
            this.sessionLifeCycleNotifier.fire(new a(activeDuration));
            p111l6.c cVar4 = this.session;
            i.c(cVar4);
            cVar4.setActiveDuration(0L);
        }
    }

    @Override // Z4.b
    public Object backgroundRun(p123m8.d<? super m> dVar) {
        endSession();
        return m.a;
    }

    @Override // p100k5.a
    public void bootstrap() {
        this.session = (p111l6.c) this._sessionModelStore.getModel();
        this.config = (com.onesignal.core.internal.config.a) this._configModelStore.getModel();
    }

    @Override // p111l6.b, com.onesignal.common.events.d
    public boolean getHasSubscribers() {
        return this.sessionLifeCycleNotifier.getHasSubscribers();
    }

    @Override // Z4.b
    public Long getScheduleBackgroundRunIn() {
        p111l6.c cVar = this.session;
        i.c(cVar);
        if (!cVar.isValid()) {
            return null;
        }
        com.onesignal.core.internal.config.a aVar = this.config;
        i.c(aVar);
        return Long.valueOf(aVar.getSessionFocusTimeout());
    }

    @Override // p111l6.b
    public long getStartTime() {
        p111l6.c cVar = this.session;
        i.c(cVar);
        return cVar.getStartTime();
    }

    @Override // X4.e
    public void onFocus(boolean z6) {
        com.onesignal.debug.internal.logging.b.log(p131n5.b.DEBUG, "SessionService.onFocus() - fired from start: " + z6);
        if (!this.hasFocused) {
            this.hasFocused = true;
            endSession();
        }
        p111l6.c cVar = this.session;
        i.c(cVar);
        if (cVar.isValid()) {
            p111l6.c cVar2 = this.session;
            i.c(cVar2);
            cVar2.setFocusTime(this._time.getCurrentTimeMillis());
            this.sessionLifeCycleNotifier.fire(c.INSTANCE);
            return;
        }
        this.shouldFireOnSubscribe = z6;
        p111l6.c cVar3 = this.session;
        i.c(cVar3);
        String string = UUID.randomUUID().toString();
        i.e(string, "randomUUID().toString()");
        cVar3.setSessionId(string);
        p111l6.c cVar4 = this.session;
        i.c(cVar4);
        cVar4.setStartTime(this._time.getCurrentTimeMillis());
        p111l6.c cVar5 = this.session;
        i.c(cVar5);
        p111l6.c cVar6 = this.session;
        i.c(cVar6);
        cVar5.setFocusTime(cVar6.getStartTime());
        p111l6.c cVar7 = this.session;
        i.c(cVar7);
        cVar7.setValid(true);
        StringBuilder sb = new StringBuilder("SessionService: New session started at ");
        p111l6.c cVar8 = this.session;
        i.c(cVar8);
        sb.append(cVar8.getStartTime());
        com.onesignal.debug.internal.logging.b.debug$default(sb.toString(), null, 2, null);
        this.sessionLifeCycleNotifier.fire(C0079b.INSTANCE);
    }

    @Override // X4.e
    public void onUnfocused() {
        long currentTimeMillis = this._time.getCurrentTimeMillis();
        p111l6.c cVar = this.session;
        i.c(cVar);
        long focusTime = currentTimeMillis - cVar.getFocusTime();
        p111l6.c cVar2 = this.session;
        i.c(cVar2);
        cVar2.setActiveDuration(cVar2.getActiveDuration() + focusTime);
        p131n5.b bVar = p131n5.b.DEBUG;
        StringBuilder sb = new StringBuilder("SessionService.onUnfocused adding time ");
        sb.append(focusTime);
        sb.append(" for total: ");
        p111l6.c cVar3 = this.session;
        i.c(cVar3);
        sb.append(cVar3.getActiveDuration());
        com.onesignal.debug.internal.logging.b.log(bVar, sb.toString());
    }

    @Override // p100k5.b
    public void start() {
        this._applicationService.addApplicationLifecycleHandler(this);
    }

    @Override // p111l6.b, com.onesignal.common.events.d
    public void subscribe(p111l6.a aVar) {
        i.f(aVar, "handler");
        this.sessionLifeCycleNotifier.subscribe(aVar);
        if (this.shouldFireOnSubscribe) {
            aVar.onSessionStarted();
        }
    }

    @Override // p111l6.b, com.onesignal.common.events.d
    public void unsubscribe(p111l6.a aVar) {
        i.f(aVar, "handler");
        this.sessionLifeCycleNotifier.unsubscribe(aVar);
    }
}
