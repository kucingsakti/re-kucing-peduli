package u6;

import com.onesignal.common.modeling.g;
import com.onesignal.common.modeling.j;
import p064g5.e;
import p064g5.f;
import p210v8.i;

/* JADX INFO: loaded from: classes.dex */
public final class a implements p100k5.a, g {
    private final com.onesignal.core.internal.config.b _configModelStore;
    private final p162q6.b _identityModelStore;
    private final f opRepo;

    public a(com.onesignal.core.internal.config.b bVar, p162q6.b bVar2, f fVar) {
        i.f(bVar, "_configModelStore");
        i.f(bVar2, "_identityModelStore");
        i.f(fVar, "opRepo");
        this._configModelStore = bVar;
        this._identityModelStore = bVar2;
        this.opRepo = fVar;
    }

    @Override // p100k5.a
    public void bootstrap() {
        this._configModelStore.subscribe((g) this);
    }

    @Override // com.onesignal.common.modeling.g
    public void onModelUpdated(j jVar, String str) {
        i.f(jVar, "args");
        i.f(str, "tag");
    }

    @Override // com.onesignal.common.modeling.g
    public void onModelReplaced(com.onesignal.core.internal.config.a aVar, String str) {
        i.f(aVar, "model");
        i.f(str, "tag");
        if (str.equals("HYDRATE")) {
            if (!aVar.getUseIdentityVerification() || ((p162q6.a) this._identityModelStore.getModel()).getJwtToken() != null) {
                e.enqueue$default(this.opRepo, new p173r6.f(((com.onesignal.core.internal.config.a) this._configModelStore.getModel()).getAppId(), ((p162q6.a) this._identityModelStore.getModel()).getOnesignalId(), ((p162q6.a) this._identityModelStore.getModel()).getExternalId(), null, 8, null), false, 2, null);
                return;
            }
            com.onesignal.debug.internal.logging.b.log(p131n5.b.INFO, "A valid JWT is required for user " + ((p162q6.a) this._identityModelStore.getModel()).getExternalId() + '.');
        }
    }
}
