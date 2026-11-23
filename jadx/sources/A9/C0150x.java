package A9;

import L8.InterfaceC0273g;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;

/* JADX INFO: renamed from: A9.x, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0150x implements O, D9.f {
    public AbstractC0151y a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LinkedHashSet f392b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f393c;

    public C0150x(AbstractCollection abstractCollection) {
        p210v8.i.f(abstractCollection, "typesToIntersect");
        abstractCollection.isEmpty();
        LinkedHashSet linkedHashSet = new LinkedHashSet(abstractCollection);
        this.f392b = linkedHashSet;
        this.f393c = linkedHashSet.hashCode();
    }

    public final D b() {
        K.f338t.getClass();
        return C0133f.t(K.f339u, this, p086i8.s.f12328s, false, qa.b.g("member scope for intersection type", this.f392b), new A0.m(this, 2));
    }

    public final String c(p200u8.b bVar) {
        p210v8.i.f(bVar, "getProperTypeRelatedToStringify");
        return p086i8.k.Z(p086i8.k.o0(this.f392b, new C0148v(bVar, 0)), " & ", "{", "}", new A0.m(bVar, 3), 24);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0150x) {
            return p210v8.i.a(this.f392b, ((C0150x) obj).f392b);
        }
        return false;
    }

    public final int hashCode() {
        return this.f393c;
    }

    @Override // A9.O
    public final I8.i s() {
        I8.i iVarS = ((AbstractC0151y) this.f392b.iterator().next()).D().s();
        p210v8.i.e(iVarS, "intersectedTypes.iterato…xt().constructor.builtIns");
        return iVarS;
    }

    @Override // A9.O
    public final Collection t() {
        return this.f392b;
    }

    public final String toString() {
        return c(C0149w.f391s);
    }

    @Override // A9.O
    public final List u() {
        return p086i8.s.f12328s;
    }

    @Override // A9.O
    public final boolean v() {
        return false;
    }

    @Override // A9.O
    public final InterfaceC0273g w() {
        return null;
    }
}
