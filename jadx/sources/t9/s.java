package t9;

import A9.W;
import A9.Z;
import L8.InterfaceC0273g;
import L8.InterfaceC0276j;
import L8.O;
import com.unity3d.ads.metadata.MediationMetaData;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import p188t1.Y;

/* JADX INFO: loaded from: classes.dex */
public final class s implements n {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n f15266b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Z f15267c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public HashMap f15268d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final p076h8.j f15269e;

    public s(n nVar, Z z6) {
        p210v8.i.f(nVar, "workerScope");
        p210v8.i.f(z6, "givenSubstitutor");
        this.f15266b = nVar;
        D3.b.s(new c2.a(z6, 20));
        W wF = z6.f();
        p210v8.i.e(wF, "givenSubstitutor.substitution");
        this.f15267c = new Z(Y.A(wF));
        this.f15269e = D3.b.s(new c2.a(this, 19));
    }

    @Override // t9.p
    public final InterfaceC0273g a(p096j9.f fVar, T8.b bVar) {
        p210v8.i.f(fVar, MediationMetaData.KEY_NAME);
        p210v8.i.f(bVar, "location");
        InterfaceC0273g interfaceC0273gA = this.f15266b.a(fVar, bVar);
        if (interfaceC0273gA != null) {
            return (InterfaceC0273g) h(interfaceC0273gA);
        }
        return null;
    }

    @Override // t9.n
    public final Collection b(p096j9.f fVar, T8.b bVar) {
        p210v8.i.f(fVar, MediationMetaData.KEY_NAME);
        return i(this.f15266b.b(fVar, bVar));
    }

    @Override // t9.n
    public final Collection c(p096j9.f fVar, T8.b bVar) {
        p210v8.i.f(fVar, MediationMetaData.KEY_NAME);
        return i(this.f15266b.c(fVar, bVar));
    }

    @Override // t9.n
    public final Set d() {
        return this.f15266b.d();
    }

    @Override // t9.n
    public final Set e() {
        return this.f15266b.e();
    }

    @Override // t9.p
    public final Collection f(f fVar, p200u8.b bVar) {
        p210v8.i.f(fVar, "kindFilter");
        return (Collection) this.f15269e.getValue();
    }

    @Override // t9.n
    public final Set g() {
        return this.f15266b.g();
    }

    public final InterfaceC0276j h(InterfaceC0276j interfaceC0276j) {
        Z z6 = this.f15267c;
        if (z6.a.e()) {
            return interfaceC0276j;
        }
        if (this.f15268d == null) {
            this.f15268d = new HashMap();
        }
        HashMap map = this.f15268d;
        p210v8.i.c(map);
        Object objJ = map.get(interfaceC0276j);
        if (objJ == null) {
            if (!(interfaceC0276j instanceof O)) {
                throw new IllegalStateException(("Unknown descriptor in scope: " + interfaceC0276j).toString());
            }
            objJ = ((O) interfaceC0276j).j(z6);
            if (objJ == null) {
                throw new AssertionError("We expect that no conflict should happen while substitution is guaranteed to generate invariant projection, but " + interfaceC0276j + " substitution fails");
            }
            map.put(interfaceC0276j, objJ);
        }
        return (InterfaceC0276j) objJ;
    }

    public final Collection i(Collection collection) {
        if (this.f15267c.a.e() || collection.isEmpty()) {
            return collection;
        }
        int size = collection.size();
        LinkedHashSet linkedHashSet = new LinkedHashSet(size >= 3 ? (size / 3) + size + 1 : 3);
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            linkedHashSet.add(h((InterfaceC0276j) it.next()));
        }
        return linkedHashSet;
    }
}
