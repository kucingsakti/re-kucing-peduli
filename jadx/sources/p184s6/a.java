package p184s6;

import p064g5.f;
import p064g5.g;
import p074h5.b;
import p210v8.i;

/* JADX INFO: loaded from: classes.dex */
public final class a extends b {
    private final com.onesignal.core.internal.config.b _configModelStore;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(p162q6.b bVar, f fVar, com.onesignal.core.internal.config.b bVar2) {
        super(bVar, fVar);
        i.f(bVar, "store");
        i.f(fVar, "opRepo");
        i.f(bVar2, "_configModelStore");
        this._configModelStore = bVar2;
    }

    @Override // p074h5.b
    public g getReplaceOperation(p162q6.a aVar) {
        i.f(aVar, "model");
        return null;
    }

    @Override // p074h5.b
    public g getUpdateOperation(p162q6.a aVar, String str, String str2, Object obj, Object obj2) {
        i.f(aVar, "model");
        i.f(str, "path");
        i.f(str2, "property");
        return (obj2 == null || !(obj2 instanceof String)) ? new p173r6.b(((com.onesignal.core.internal.config.a) this._configModelStore.getModel()).getAppId(), aVar.getOnesignalId(), str2) : new p173r6.i(((com.onesignal.core.internal.config.a) this._configModelStore.getModel()).getAppId(), aVar.getOnesignalId(), str2, (String) obj2);
    }
}
