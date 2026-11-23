package Y8;

import L8.InterfaceC0273g;
import L8.InterfaceC0276j;
import L8.K;
import com.unity3d.ads.metadata.MediationMetaData;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p188t1.Y;

/* JADX INFO: loaded from: classes.dex */
public final class D extends E {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ int f5727p = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final R8.n f5728n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final j f5729o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D(Fa.e eVar, R8.n nVar, j jVar) {
        super(eVar, null);
        p210v8.i.f(nVar, "jClass");
        this.f5728n = nVar;
        this.f5729o = jVar;
    }

    public static K v(K k3) {
        if (k3.V() != 2) {
            return k3;
        }
        Collection collectionX = k3.x();
        p210v8.i.e(collectionX, "this.overriddenDescriptors");
        Collection<K> collection = collectionX;
        ArrayList arrayList = new ArrayList(p086i8.m.H(collection, 10));
        for (K k10 : collection) {
            p210v8.i.e(k10, "it");
            arrayList.add(v(k10));
        }
        return (K) p086i8.k.k0(p086i8.k.s0(p086i8.k.v0(arrayList)));
    }

    @Override // t9.o, t9.p
    public final InterfaceC0273g a(p096j9.f fVar, T8.b bVar) {
        p210v8.i.f(fVar, MediationMetaData.KEY_NAME);
        p210v8.i.f(bVar, "location");
        return null;
    }

    @Override // Y8.A
    public final Set h(t9.f fVar, t9.k kVar) {
        p210v8.i.f(fVar, "kindFilter");
        return p086i8.u.f12330s;
    }

    @Override // Y8.A
    public final Set i(t9.f fVar, t9.k kVar) {
        p210v8.i.f(fVar, "kindFilter");
        Set setV0 = p086i8.k.v0(((InterfaceC0474c) this.f5716e.invoke()).a());
        j jVar = this.f5729o;
        D dO = xa.d.o(jVar);
        Set setD = dO != null ? dO.d() : null;
        if (setD == null) {
            setD = p086i8.u.f12330s;
        }
        setV0.addAll(setD);
        if (this.f5728n.a.isEnum()) {
            setV0.addAll(p086i8.l.C(I8.o.f2190c, I8.o.a));
        }
        Fa.e eVar = this.f5713b;
        setV0.addAll(((p176r9.a) ((p176r9.e) ((I4.a) eVar.f1659t).f2068x)).g(eVar, jVar));
        return setV0;
    }

    @Override // Y8.A
    public final void j(p096j9.f fVar, ArrayList arrayList) {
        p210v8.i.f(fVar, MediationMetaData.KEY_NAME);
        Fa.e eVar = this.f5713b;
        ((p176r9.a) ((p176r9.e) ((I4.a) eVar.f1659t).f2068x)).d(eVar, this.f5729o, fVar, arrayList);
    }

    @Override // Y8.A
    public final InterfaceC0474c k() {
        return new C0472a(this.f5728n, k.f5774v);
    }

    @Override // Y8.A
    public final void m(LinkedHashSet linkedHashSet, p096j9.f fVar) {
        p210v8.i.f(fVar, MediationMetaData.KEY_NAME);
        j jVar = this.f5729o;
        D dO = xa.d.o(jVar);
        Collection collectionW0 = dO == null ? p086i8.u.f12330s : p086i8.k.w0(dO.c(fVar, T8.b.f4763w));
        I4.a aVar = (I4.a) this.f5713b.f1659t;
        linkedHashSet.addAll(Y.x(fVar, collectionW0, linkedHashSet, this.f5729o, (Q8.d) aVar.f2051f, ((B9.m) aVar.f2065u).f795d));
        if (this.f5728n.a.isEnum()) {
            if (fVar.equals(I8.o.f2190c)) {
                linkedHashSet.add(p124m9.m.i(jVar));
            } else if (fVar.equals(I8.o.a)) {
                linkedHashSet.add(p124m9.m.j(jVar));
            }
        }
    }

    @Override // Y8.E, Y8.A
    public final void n(p096j9.f fVar, ArrayList arrayList) {
        p210v8.i.f(fVar, MediationMetaData.KEY_NAME);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        K8.m mVar = new K8.m(fVar, 1);
        j jVar = this.f5729o;
        J9.l.f(com.bumptech.glide.d.u(jVar), B.f5723s, new C(jVar, linkedHashSet, mVar));
        boolean zIsEmpty = arrayList.isEmpty();
        Fa.e eVar = this.f5713b;
        if (zIsEmpty) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Object obj : linkedHashSet) {
                K kV = v((K) obj);
                Object arrayList2 = linkedHashMap.get(kV);
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                    linkedHashMap.put(kV, arrayList2);
                }
                ((List) arrayList2).add(obj);
            }
            ArrayList arrayList3 = new ArrayList();
            Iterator it = linkedHashMap.entrySet().iterator();
            while (it.hasNext()) {
                Collection collection = (Collection) ((Map.Entry) it.next()).getValue();
                I4.a aVar = (I4.a) eVar.f1659t;
                p086i8.q.J(arrayList3, Y.x(fVar, collection, arrayList, this.f5729o, (Q8.d) aVar.f2051f, ((B9.m) aVar.f2065u).f795d));
            }
            arrayList.addAll(arrayList3);
        } else {
            I4.a aVar2 = (I4.a) eVar.f1659t;
            arrayList.addAll(Y.x(fVar, linkedHashSet, arrayList, this.f5729o, (Q8.d) aVar2.f2051f, ((B9.m) aVar2.f2065u).f795d));
        }
        if (this.f5728n.a.isEnum() && fVar.equals(I8.o.f2189b)) {
            J9.l.b(arrayList, p124m9.m.h(jVar));
        }
    }

    @Override // Y8.A
    public final Set o(t9.f fVar) {
        p210v8.i.f(fVar, "kindFilter");
        Set setV0 = p086i8.k.v0(((InterfaceC0474c) this.f5716e.invoke()).c());
        k kVar = k.f5775w;
        j jVar = this.f5729o;
        J9.l.f(com.bumptech.glide.d.u(jVar), B.f5723s, new C(jVar, setV0, kVar));
        if (this.f5728n.a.isEnum()) {
            setV0.add(I8.o.f2189b);
        }
        return setV0;
    }

    @Override // Y8.A
    public final InterfaceC0276j q() {
        return this.f5729o;
    }
}
