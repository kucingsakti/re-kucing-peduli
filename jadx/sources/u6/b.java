package u6;

import X4.f;
import com.onesignal.common.d;
import p064g5.e;
import p173r6.h;
import p210v8.i;

/* JADX INFO: loaded from: classes.dex */
public final class b implements p100k5.b, p111l6.a {
    private final f _applicationService;
    private final com.onesignal.core.internal.config.b _configModelStore;
    private final p162q6.b _identityModelStore;
    private final p064g5.f _operationRepo;
    private final p111l6.b _sessionService;

    public b(f fVar, p111l6.b bVar, p064g5.f fVar2, com.onesignal.core.internal.config.b bVar2, p162q6.b bVar3) {
        i.f(fVar, "_applicationService");
        i.f(bVar, "_sessionService");
        i.f(fVar2, "_operationRepo");
        i.f(bVar2, "_configModelStore");
        i.f(bVar3, "_identityModelStore");
        this._applicationService = fVar;
        this._sessionService = bVar;
        this._operationRepo = fVar2;
        this._configModelStore = bVar2;
        this._identityModelStore = bVar3;
    }

    private final void refreshUser() {
        if (d.INSTANCE.isLocalId(((p162q6.a) this._identityModelStore.getModel()).getOnesignalId()) || !this._applicationService.isInForeground()) {
            return;
        }
        e.enqueue$default(this._operationRepo, new h(((com.onesignal.core.internal.config.a) this._configModelStore.getModel()).getAppId(), ((p162q6.a) this._identityModelStore.getModel()).getOnesignalId()), false, 2, null);
    }

    @Override // p111l6.a
    public void onSessionStarted() {
        refreshUser();
    }

    @Override // p100k5.b
    public void start() {
        this._sessionService.subscribe(this);
    }

    @Override // p111l6.a
    public void onSessionActive() {
    }

    @Override // p111l6.a
    public void onSessionEnded(long j) {
    }
}
