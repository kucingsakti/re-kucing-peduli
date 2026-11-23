package Y8;

import L8.InterfaceC0271e;
import L8.InterfaceC0273g;
import L8.InterfaceC0274h;
import com.unity3d.ads.metadata.MediationMetaData;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import p188t1.Y;

/* JADX INFO: renamed from: Y8.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0475d implements t9.n {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ C8.u[] f5737f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Fa.e f5738b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final r f5739c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final w f5740d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final p247z9.i f5741e;

    static {
        p210v8.v vVar = p210v8.u.a;
        f5737f = new C8.u[]{vVar.f(new p210v8.n(vVar.b(C0475d.class), "kotlinScopes", "getKotlinScopes()[Lorg/jetbrains/kotlin/resolve/scopes/MemberScope;"))};
    }

    public C0475d(Fa.e eVar, R8.x xVar, r rVar) {
        p210v8.i.f(rVar, "packageFragment");
        this.f5738b = eVar;
        this.f5739c = rVar;
        this.f5740d = new w(eVar, xVar, rVar);
        p247z9.l lVar = (p247z9.l) ((I4.a) eVar.f1659t).a;
        A0.r rVar2 = new A0.r(this, 25);
        lVar.getClass();
        this.f5741e = new p247z9.i(lVar, rVar2);
    }

    @Override // t9.p
    public final InterfaceC0273g a(p096j9.f fVar, T8.b bVar) {
        p210v8.i.f(fVar, MediationMetaData.KEY_NAME);
        p210v8.i.f(bVar, "location");
        i(fVar, bVar);
        w wVar = this.f5740d;
        wVar.getClass();
        InterfaceC0273g interfaceC0273g = null;
        InterfaceC0271e interfaceC0271eV = wVar.v(fVar, null);
        if (interfaceC0271eV != null) {
            return interfaceC0271eV;
        }
        for (t9.n nVar : h()) {
            InterfaceC0273g interfaceC0273gA = nVar.a(fVar, bVar);
            if (interfaceC0273gA != null) {
                if (!(interfaceC0273gA instanceof InterfaceC0274h) || !((InterfaceC0274h) interfaceC0273gA).i0()) {
                    return interfaceC0273gA;
                }
                if (interfaceC0273g == null) {
                    interfaceC0273g = interfaceC0273gA;
                }
            }
        }
        return interfaceC0273g;
    }

    @Override // t9.n
    public final Collection b(p096j9.f fVar, T8.b bVar) {
        p210v8.i.f(fVar, MediationMetaData.KEY_NAME);
        i(fVar, bVar);
        t9.n[] nVarArrH = h();
        this.f5740d.getClass();
        Collection collectionD = p086i8.s.f12328s;
        for (t9.n nVar : nVarArrH) {
            collectionD = com.bumptech.glide.e.d(collectionD, nVar.b(fVar, bVar));
        }
        return collectionD == null ? p086i8.u.f12330s : collectionD;
    }

    @Override // t9.n
    public final Collection c(p096j9.f fVar, T8.b bVar) {
        p210v8.i.f(fVar, MediationMetaData.KEY_NAME);
        i(fVar, bVar);
        t9.n[] nVarArrH = h();
        Collection collectionC = this.f5740d.c(fVar, bVar);
        for (t9.n nVar : nVarArrH) {
            collectionC = com.bumptech.glide.e.d(collectionC, nVar.c(fVar, bVar));
        }
        return collectionC == null ? p086i8.u.f12330s : collectionC;
    }

    @Override // t9.n
    public final Set d() {
        t9.n[] nVarArrH = h();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (t9.n nVar : nVarArrH) {
            p086i8.q.J(linkedHashSet, nVar.d());
        }
        linkedHashSet.addAll(this.f5740d.d());
        return linkedHashSet;
    }

    @Override // t9.n
    public final Set e() {
        t9.n[] nVarArrH = h();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (t9.n nVar : nVarArrH) {
            p086i8.q.J(linkedHashSet, nVar.e());
        }
        linkedHashSet.addAll(this.f5740d.e());
        return linkedHashSet;
    }

    @Override // t9.p
    public final Collection f(t9.f fVar, p200u8.b bVar) {
        p210v8.i.f(fVar, "kindFilter");
        t9.n[] nVarArrH = h();
        Collection collectionF = this.f5740d.f(fVar, bVar);
        for (t9.n nVar : nVarArrH) {
            collectionF = com.bumptech.glide.e.d(collectionF, nVar.f(fVar, bVar));
        }
        return collectionF == null ? p086i8.u.f12330s : collectionF;
    }

    @Override // t9.n
    public final Set g() {
        t9.n[] nVarArrH = h();
        p210v8.i.f(nVarArrH, "<this>");
        HashSet hashSetF = o1.f.f(nVarArrH.length == 0 ? p086i8.s.f12328s : new K9.r(nVarArrH, 1));
        if (hashSetF == null) {
            return null;
        }
        hashSetF.addAll(this.f5740d.g());
        return hashSetF;
    }

    public final t9.n[] h() {
        return (t9.n[]) J7.j.o(this.f5741e, f5737f[0]);
    }

    public final void i(p096j9.f fVar, T8.b bVar) {
        p210v8.i.f(fVar, MediationMetaData.KEY_NAME);
        p210v8.i.f(bVar, "location");
        I4.a aVar = (I4.a) this.f5738b.f1659t;
        Y.t((T8.a) aVar.f2058n, bVar, this.f5739c, fVar);
    }

    public final String toString() {
        return "scope for " + this.f5739c;
    }
}
