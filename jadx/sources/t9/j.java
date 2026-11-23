package t9;

import L8.InterfaceC0268b;
import L8.InterfaceC0273g;
import L8.InterfaceC0276j;
import com.unity3d.ads.metadata.MediationMetaData;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class j implements n {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f15252b = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f15253c;

    public j(n nVar) {
        this.f15253c = nVar;
    }

    @Override // t9.p
    public final InterfaceC0273g a(p096j9.f fVar, T8.b bVar) {
        p210v8.i.f(fVar, MediationMetaData.KEY_NAME);
        p210v8.i.f(bVar, "location");
        return l().a(fVar, bVar);
    }

    @Override // t9.n
    public Collection b(p096j9.f fVar, T8.b bVar) {
        switch (this.f15252b) {
            case 1:
                p210v8.i.f(fVar, MediationMetaData.KEY_NAME);
                return p124m9.m.o(k(fVar, bVar), k.f15257w);
            default:
                return k(fVar, bVar);
        }
    }

    @Override // t9.n
    public Collection c(p096j9.f fVar, T8.b bVar) {
        switch (this.f15252b) {
            case 1:
                p210v8.i.f(fVar, MediationMetaData.KEY_NAME);
                return p124m9.m.o(j(fVar, bVar), k.f15256v);
            default:
                return j(fVar, bVar);
        }
    }

    @Override // t9.n
    public final Set d() {
        return l().d();
    }

    @Override // t9.n
    public final Set e() {
        return l().e();
    }

    @Override // t9.p
    public Collection f(f fVar, p200u8.b bVar) {
        switch (this.f15252b) {
            case 1:
                p210v8.i.f(fVar, "kindFilter");
                Collection collectionI = i(fVar, bVar);
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                for (Object obj : collectionI) {
                    if (((InterfaceC0276j) obj) instanceof InterfaceC0268b) {
                        arrayList.add(obj);
                    } else {
                        arrayList2.add(obj);
                    }
                }
                return p086i8.k.g0(p124m9.m.o(arrayList, k.f15255u), arrayList2);
            default:
                return i(fVar, bVar);
        }
    }

    @Override // t9.n
    public final Set g() {
        return l().g();
    }

    public final n h() {
        if (!(l() instanceof j)) {
            return l();
        }
        n nVarL = l();
        p210v8.i.d(nVarL, "null cannot be cast to non-null type org.jetbrains.kotlin.resolve.scopes.AbstractScopeAdapter");
        return ((j) nVarL).h();
    }

    public final Collection i(f fVar, p200u8.b bVar) {
        p210v8.i.f(fVar, "kindFilter");
        return l().f(fVar, bVar);
    }

    public final Collection j(p096j9.f fVar, T8.b bVar) {
        p210v8.i.f(fVar, MediationMetaData.KEY_NAME);
        return l().c(fVar, bVar);
    }

    public final Collection k(p096j9.f fVar, T8.b bVar) {
        p210v8.i.f(fVar, MediationMetaData.KEY_NAME);
        return l().b(fVar, bVar);
    }

    public final n l() {
        switch (this.f15252b) {
            case 0:
                return (n) ((p247z9.i) this.f15253c).invoke();
            default:
                return (n) this.f15253c;
        }
    }

    public j(p247z9.o oVar, p200u8.a aVar) {
        p210v8.i.f(oVar, "storageManager");
        this.f15253c = new p247z9.i((p247z9.l) oVar, new c2.a(aVar, 18));
    }
}
