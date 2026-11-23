package O8;

import L8.InterfaceC0273g;
import java.util.Collection;
import java.util.List;

/* JADX INFO: renamed from: O8.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0349e implements A9.O {
    public final /* synthetic */ p238y9.q a;

    public C0349e(p238y9.q qVar) {
        this.a = qVar;
    }

    @Override // A9.O
    public final I8.i s() {
        return p165q9.d.e(this.a);
    }

    @Override // A9.O
    public final Collection t() {
        Collection collectionT = this.a.b1().D().t();
        p210v8.i.e(collectionT, "declarationDescriptor.un…pe.constructor.supertypes");
        return collectionT;
    }

    public final String toString() {
        return "[typealias " + this.a.getName().g() + ']';
    }

    @Override // A9.O
    public final List u() {
        List list = this.a.f16122I;
        if (list != null) {
            return list;
        }
        p210v8.i.n("typeConstructorParameters");
        throw null;
    }

    @Override // A9.O
    public final boolean v() {
        return true;
    }

    @Override // A9.O
    public final InterfaceC0273g w() {
        return this.a;
    }
}
