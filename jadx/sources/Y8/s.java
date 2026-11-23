package Y8;

import com.unity3d.ads.metadata.MediationMetaData;

/* JADX INFO: loaded from: classes.dex */
public final class s {
    public final p096j9.f a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final R8.n f5803b;

    public s(p096j9.f fVar, R8.n nVar) {
        p210v8.i.f(fVar, MediationMetaData.KEY_NAME);
        this.a = fVar;
        this.f5803b = nVar;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof s) {
            return p210v8.i.a(this.a, ((s) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
