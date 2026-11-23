package p238y9;

import A9.AbstractC0151y;
import B9.f;
import I4.c;
import J7.a;
import L8.InterfaceC0271e;
import L8.InterfaceC0273g;
import N8.d;
import O8.r;
import V3.b;
import com.unity3d.ads.metadata.MediationMetaData;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import o1.h;
import p047e9.C0618j;
import p086i8.m;
import p086i8.q;
import p086i8.s;
import p247z9.i;
import p247z9.j;
import p247z9.l;

/* JADX INFO: loaded from: classes.dex */
public final class e extends m {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final f f16059g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final i f16060h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final i f16061i;
    public final /* synthetic */ g j;

    public e(g gVar, f fVar) {
        p210v8.i.f(fVar, "kotlinTypeRefiner");
        this.j = gVar;
        b bVar = gVar.f16067D;
        C0618j c0618j = gVar.f16079w;
        List list = c0618j.f11107I;
        p210v8.i.e(list, "classProto.functionList");
        List list2 = c0618j.f11108J;
        p210v8.i.e(list2, "classProto.propertyList");
        List list3 = c0618j.f11109K;
        p210v8.i.e(list3, "classProto.typeAliasList");
        List list4 = c0618j.f11101C;
        p210v8.i.e(list4, "classProto.nestedClassNameList");
        List list5 = list4;
        p067g9.f fVar2 = (p067g9.f) gVar.f16067D.f5172b;
        ArrayList arrayList = new ArrayList(m.H(list5, 10));
        Iterator it = list5.iterator();
        while (it.hasNext()) {
            arrayList.add(a.i(fVar2, ((Number) it.next()).intValue()));
        }
        super(bVar, list, list2, list3, new B9.i(2, arrayList));
        this.f16059g = fVar;
        c cVar = (c) bVar.a;
        l lVar = (l) cVar.a;
        d dVar = new d(this, 0);
        lVar.getClass();
        this.f16060h = new i(lVar, dVar);
        l lVar2 = (l) cVar.a;
        d dVar2 = new d(this, 1);
        lVar2.getClass();
        this.f16061i = new i(lVar2, dVar2);
    }

    @Override // p238y9.m, t9.o, t9.p
    public final InterfaceC0273g a(p096j9.f fVar, T8.b bVar) {
        InterfaceC0271e interfaceC0271e;
        p210v8.i.f(fVar, MediationMetaData.KEY_NAME);
        p210v8.i.f(bVar, "location");
        s(fVar, bVar);
        h hVar = this.j.f16071H;
        return (hVar == null || (interfaceC0271e = (InterfaceC0271e) ((j) hVar.f13633t).invoke(fVar)) == null) ? super.a(fVar, bVar) : interfaceC0271e;
    }

    @Override // p238y9.m, t9.o, t9.n
    public final Collection b(p096j9.f fVar, T8.b bVar) {
        p210v8.i.f(fVar, MediationMetaData.KEY_NAME);
        s(fVar, bVar);
        return super.b(fVar, bVar);
    }

    @Override // p238y9.m, t9.o, t9.n
    public final Collection c(p096j9.f fVar, T8.b bVar) {
        p210v8.i.f(fVar, MediationMetaData.KEY_NAME);
        s(fVar, bVar);
        return super.c(fVar, bVar);
    }

    @Override // t9.o, t9.p
    public final Collection f(t9.f fVar, p200u8.b bVar) {
        p210v8.i.f(fVar, "kindFilter");
        return (Collection) this.f16060h.invoke();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r1v3, types: [i8.s] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.util.ArrayList] */
    @Override // p238y9.m
    public final void h(ArrayList arrayList, p200u8.b bVar) {
        ?? arrayList2;
        h hVar = this.j.f16071H;
        if (hVar != null) {
            Set<p096j9.f> setKeySet = ((LinkedHashMap) hVar.f13632s).keySet();
            arrayList2 = new ArrayList();
            for (p096j9.f fVar : setKeySet) {
                p210v8.i.f(fVar, MediationMetaData.KEY_NAME);
                InterfaceC0271e interfaceC0271e = (InterfaceC0271e) ((j) hVar.f13633t).invoke(fVar);
                if (interfaceC0271e != null) {
                    arrayList2.add(interfaceC0271e);
                }
            }
        } else {
            arrayList2 = 0;
        }
        if (arrayList2 == 0) {
            arrayList2 = s.f12328s;
        }
        arrayList.addAll(arrayList2);
    }

    @Override // p238y9.m
    public final void j(p096j9.f fVar, ArrayList arrayList) {
        p210v8.i.f(fVar, MediationMetaData.KEY_NAME);
        ArrayList arrayList2 = new ArrayList();
        Iterator it = ((Collection) this.f16061i.invoke()).iterator();
        while (it.hasNext()) {
            arrayList2.addAll(((AbstractC0151y) it.next()).E0().c(fVar, T8.b.f4761u));
        }
        b bVar = this.f16097b;
        arrayList.addAll(((N8.b) ((c) bVar.a).f2090n).d(fVar, this.j));
        ArrayList arrayList3 = new ArrayList(arrayList);
        ((B9.m) ((B9.l) ((c) bVar.a).f2093q)).f795d.h(fVar, arrayList2, arrayList3, this.j, new r(arrayList, 1));
    }

    @Override // p238y9.m
    public final void k(p096j9.f fVar, ArrayList arrayList) {
        p210v8.i.f(fVar, MediationMetaData.KEY_NAME);
        ArrayList arrayList2 = new ArrayList();
        Iterator it = ((Collection) this.f16061i.invoke()).iterator();
        while (it.hasNext()) {
            arrayList2.addAll(((AbstractC0151y) it.next()).E0().b(fVar, T8.b.f4761u));
        }
        ArrayList arrayList3 = new ArrayList(arrayList);
        ((B9.m) ((B9.l) ((c) this.f16097b.a).f2093q)).f795d.h(fVar, arrayList2, arrayList3, this.j, new r(arrayList, 1));
    }

    @Override // p238y9.m
    public final p096j9.b l(p096j9.f fVar) {
        p210v8.i.f(fVar, MediationMetaData.KEY_NAME);
        return this.j.f16082z.d(fVar);
    }

    @Override // p238y9.m
    public final Set n() {
        List listT = this.j.f16069F.t();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = listT.iterator();
        while (it.hasNext()) {
            Set setG = ((AbstractC0151y) it.next()).E0().g();
            if (setG == null) {
                return null;
            }
            q.J(linkedHashSet, setG);
        }
        return linkedHashSet;
    }

    @Override // p238y9.m
    public final Set o() {
        g gVar = this.j;
        List listT = gVar.f16069F.t();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = listT.iterator();
        while (it.hasNext()) {
            q.J(linkedHashSet, ((AbstractC0151y) it.next()).E0().d());
        }
        linkedHashSet.addAll(((N8.b) ((c) this.f16097b.a).f2090n).b(gVar));
        return linkedHashSet;
    }

    @Override // p238y9.m
    public final Set p() {
        List listT = this.j.f16069F.t();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = listT.iterator();
        while (it.hasNext()) {
            q.J(linkedHashSet, ((AbstractC0151y) it.next()).E0().e());
        }
        return linkedHashSet;
    }

    @Override // p238y9.m
    public final boolean r(p pVar) {
        return ((d) ((c) this.f16097b.a).f2091o).a(this.j, pVar);
    }

    public final void s(p096j9.f fVar, T8.b bVar) {
        p210v8.i.f(fVar, MediationMetaData.KEY_NAME);
        p210v8.i.f(bVar, "location");
        p210v8.i.f((T8.a) ((c) this.f16097b.a).f2086i, "<this>");
        p210v8.i.f(this.j, "scopeOwner");
    }
}
