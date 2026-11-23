package C9;

import L8.InterfaceC0273g;
import androidx.datastore.preferences.protobuf.AbstractC0487g;
import com.unity3d.ads.metadata.MediationMetaData;
import java.util.Collection;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class j extends e {
    @Override // C9.e, t9.p
    public final InterfaceC0273g a(p096j9.f fVar, T8.b bVar) {
        p210v8.i.f(fVar, MediationMetaData.KEY_NAME);
        p210v8.i.f(bVar, "location");
        throw new IllegalStateException(this.f974b + ", required name: " + fVar);
    }

    @Override // C9.e, t9.n
    public final /* bridge */ /* synthetic */ Collection b(p096j9.f fVar, T8.b bVar) {
        b(fVar, bVar);
        throw null;
    }

    @Override // C9.e, t9.n
    public final /* bridge */ /* synthetic */ Collection c(p096j9.f fVar, T8.b bVar) {
        c(fVar, bVar);
        throw null;
    }

    @Override // C9.e, t9.n
    public final Set d() {
        throw new IllegalStateException();
    }

    @Override // C9.e, t9.n
    public final Set e() {
        throw new IllegalStateException();
    }

    @Override // C9.e, t9.p
    public final Collection f(t9.f fVar, p200u8.b bVar) {
        p210v8.i.f(fVar, "kindFilter");
        throw new IllegalStateException(this.f974b);
    }

    @Override // C9.e, t9.n
    public final Set g() {
        throw new IllegalStateException();
    }

    @Override // C9.e
    /* JADX INFO: renamed from: h */
    public final Set c(p096j9.f fVar, T8.b bVar) {
        p210v8.i.f(fVar, MediationMetaData.KEY_NAME);
        throw new IllegalStateException(this.f974b + ", required name: " + fVar);
    }

    @Override // C9.e
    /* JADX INFO: renamed from: i */
    public final Set b(p096j9.f fVar, T8.b bVar) {
        p210v8.i.f(fVar, MediationMetaData.KEY_NAME);
        throw new IllegalStateException(this.f974b + ", required name: " + fVar);
    }

    @Override // C9.e
    public final String toString() {
        return AbstractC0487g.j(new StringBuilder("ThrowingScope{"), this.f974b, '}');
    }
}
