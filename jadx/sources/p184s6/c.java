package p184s6;

import com.onesignal.core.internal.config.b;
import p064g5.g;
import p076h8.f;
import p173r6.p;
import p208v6.d;
import p210v8.e;
import p210v8.i;

/* JADX INFO: loaded from: classes.dex */
public final class c extends p074h5.a {
    public static final a Companion = new a(null);
    private final b _configModelStore;
    private final p162q6.b _identityModelStore;

    public static final class a {
        public /* synthetic */ a(e eVar) {
            this();
        }

        /* JADX WARN: Code duplicated, block: B:16:0x0048  */
        /* JADX WARN: Code duplicated, block: B:18:0x004e  */
        /* JADX WARN: Code duplicated, block: B:20:0x0052  */
        public final f getSubscriptionEnabledAndStatus(d dVar, p162q6.b bVar, b bVar2) {
            p208v6.f fVar;
            boolean z6;
            p208v6.f status;
            String externalId;
            i.f(dVar, "model");
            i.f(bVar, "identityModelStore");
            i.f(bVar2, "configModelStore");
            if (!(((com.onesignal.core.internal.config.a) bVar2.getModel()).getUseIdentityVerification() && ((externalId = ((p162q6.a) bVar.getModel()).getExternalId()) == null || externalId.length() == 0)) && dVar.getOptedIn()) {
                p208v6.f status2 = dVar.getStatus();
                fVar = p208v6.f.SUBSCRIBED;
                if (status2 != fVar || dVar.getAddress().length() <= 0) {
                    if (dVar.getOptedIn()) {
                        status = dVar.getStatus();
                    } else {
                        status = p208v6.f.UNSUBSCRIBE;
                    }
                    fVar = status;
                    z6 = false;
                } else {
                    z6 = true;
                }
            } else {
                if (dVar.getOptedIn()) {
                    status = p208v6.f.UNSUBSCRIBE;
                } else {
                    status = dVar.getStatus();
                }
                fVar = status;
                z6 = false;
            }
            return new f(Boolean.valueOf(z6), fVar);
        }

        private a() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(p208v6.e eVar, p064g5.f fVar, p162q6.b bVar, b bVar2) {
        super(eVar, fVar);
        i.f(eVar, "store");
        i.f(fVar, "opRepo");
        i.f(bVar, "_identityModelStore");
        i.f(bVar2, "_configModelStore");
        this._identityModelStore = bVar;
        this._configModelStore = bVar2;
    }

    @Override // p074h5.a
    public g getAddOperation(d dVar) {
        i.f(dVar, "model");
        f subscriptionEnabledAndStatus = Companion.getSubscriptionEnabledAndStatus(dVar, this._identityModelStore, this._configModelStore);
        return new p173r6.a(((com.onesignal.core.internal.config.a) this._configModelStore.getModel()).getAppId(), ((p162q6.a) this._identityModelStore.getModel()).getOnesignalId(), dVar.getId(), dVar.getType(), ((Boolean) subscriptionEnabledAndStatus.f11789s).booleanValue(), dVar.getAddress(), (p208v6.f) subscriptionEnabledAndStatus.f11790t);
    }

    @Override // p074h5.a
    public g getRemoveOperation(d dVar) {
        i.f(dVar, "model");
        return new p173r6.c(((com.onesignal.core.internal.config.a) this._configModelStore.getModel()).getAppId(), ((p162q6.a) this._identityModelStore.getModel()).getOnesignalId(), dVar.getId());
    }

    @Override // p074h5.a
    public g getUpdateOperation(d dVar, String str, String str2, Object obj, Object obj2) {
        i.f(dVar, "model");
        i.f(str, "path");
        i.f(str2, "property");
        f subscriptionEnabledAndStatus = Companion.getSubscriptionEnabledAndStatus(dVar, this._identityModelStore, this._configModelStore);
        return new p(((com.onesignal.core.internal.config.a) this._configModelStore.getModel()).getAppId(), ((p162q6.a) this._identityModelStore.getModel()).getOnesignalId(), dVar.getId(), dVar.getType(), ((Boolean) subscriptionEnabledAndStatus.f11789s).booleanValue(), dVar.getAddress(), (p208v6.f) subscriptionEnabledAndStatus.f11790t, null, 128, null);
    }
}
