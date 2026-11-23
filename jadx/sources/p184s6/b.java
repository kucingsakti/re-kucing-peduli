package p184s6;

import L9.n;
import com.onesignal.user.internal.properties.a;
import p064g5.f;
import p064g5.g;
import p173r6.d;
import p173r6.j;
import p173r6.k;
import p210v8.i;

/* JADX INFO: loaded from: classes.dex */
public final class b extends p074h5.b {
    private final com.onesignal.core.internal.config.b _configModelStore;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(com.onesignal.user.internal.properties.b bVar, f fVar, com.onesignal.core.internal.config.b bVar2) {
        super(bVar, fVar);
        i.f(bVar, "store");
        i.f(fVar, "opRepo");
        i.f(bVar2, "_configModelStore");
        this._configModelStore = bVar2;
    }

    @Override // p074h5.b
    public g getReplaceOperation(a aVar) {
        i.f(aVar, "model");
        return null;
    }

    @Override // p074h5.b
    public g getUpdateOperation(a aVar, String str, String str2, Object obj, Object obj2) {
        i.f(aVar, "model");
        i.f(str, "path");
        i.f(str2, "property");
        if (n.I(str, "locationTimestamp", false) || n.I(str, "locationBackground", false) || n.I(str, "locationType", false) || n.I(str, "locationAccuracy", false)) {
            return null;
        }
        if (n.I(str, "tags", false)) {
            return (obj2 == null || !(obj2 instanceof String)) ? new d(((com.onesignal.core.internal.config.a) this._configModelStore.getModel()).getAppId(), aVar.getOnesignalId(), str2) : new k(((com.onesignal.core.internal.config.a) this._configModelStore.getModel()).getAppId(), aVar.getOnesignalId(), str2, (String) obj2);
        }
        return new j(((com.onesignal.core.internal.config.a) this._configModelStore.getModel()).getAppId(), aVar.getOnesignalId(), str2, obj2);
    }
}
