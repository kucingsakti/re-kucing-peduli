package Y8;

import L8.InterfaceC0271e;
import L8.InterfaceC0273g;
import L8.InterfaceC0276j;
import com.unity3d.ads.metadata.MediationMetaData;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class w extends E {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final R8.x f5807n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final r f5808o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final p247z9.h f5809p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final p247z9.j f5810q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(Fa.e eVar, R8.x xVar, r rVar) {
        super(eVar, null);
        p210v8.i.f(rVar, "ownerDescriptor");
        this.f5807n = xVar;
        this.f5808o = rVar;
        p247z9.l lVar = (p247z9.l) ((I4.a) eVar.f1659t).a;
        A9.A a = new A9.A(eVar, 27, this);
        lVar.getClass();
        this.f5809p = new p247z9.h(lVar, a);
        this.f5810q = lVar.c(new E0.b(this, 5, eVar));
    }

    @Override // t9.o, t9.p
    public final InterfaceC0273g a(p096j9.f fVar, T8.b bVar) {
        p210v8.i.f(fVar, MediationMetaData.KEY_NAME);
        p210v8.i.f(bVar, "location");
        return v(fVar, null);
    }

    @Override // Y8.A, t9.o, t9.n
    public final Collection b(p096j9.f fVar, T8.b bVar) {
        p210v8.i.f(fVar, MediationMetaData.KEY_NAME);
        return p086i8.s.f12328s;
    }

    @Override // Y8.A, t9.o, t9.p
    public final Collection f(t9.f fVar, p200u8.b bVar) {
        p210v8.i.f(fVar, "kindFilter");
        if (!fVar.a(t9.f.f15237l | t9.f.f15231e)) {
            return p086i8.s.f12328s;
        }
        Iterable iterable = (Iterable) this.f5715d.invoke();
        ArrayList arrayList = new ArrayList();
        for (Object obj : iterable) {
            InterfaceC0276j interfaceC0276j = (InterfaceC0276j) obj;
            if (interfaceC0276j instanceof InterfaceC0271e) {
                p096j9.f name = ((InterfaceC0271e) interfaceC0276j).getName();
                p210v8.i.e(name, "it.name");
                if (((Boolean) bVar.invoke(name)).booleanValue()) {
                    arrayList.add(obj);
                }
            }
        }
        return arrayList;
    }

    @Override // Y8.A
    public final Set h(t9.f fVar, t9.k kVar) {
        p210v8.i.f(fVar, "kindFilter");
        if (!fVar.a(t9.f.f15231e)) {
            return p086i8.u.f12330s;
        }
        Set set = (Set) this.f5809p.invoke();
        if (set == null) {
            this.f5807n.getClass();
            return new LinkedHashSet();
        }
        HashSet hashSet = new HashSet();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            hashSet.add(p096j9.f.j((String) it.next()));
        }
        return hashSet;
    }

    @Override // Y8.A
    public final Set i(t9.f fVar, t9.k kVar) {
        p210v8.i.f(fVar, "kindFilter");
        return p086i8.u.f12330s;
    }

    @Override // Y8.A
    public final InterfaceC0474c k() {
        return C0473b.a;
    }

    @Override // Y8.A
    public final void m(LinkedHashSet linkedHashSet, p096j9.f fVar) {
        p210v8.i.f(fVar, MediationMetaData.KEY_NAME);
    }

    @Override // Y8.A
    public final Set o(t9.f fVar) {
        p210v8.i.f(fVar, "kindFilter");
        return p086i8.u.f12330s;
    }

    @Override // Y8.A
    public final InterfaceC0276j q() {
        return this.f5808o;
    }

    public final InterfaceC0271e v(p096j9.f fVar, R8.n nVar) {
        p096j9.f fVar2 = p096j9.h.a;
        p210v8.i.f(fVar, MediationMetaData.KEY_NAME);
        String strG = fVar.g();
        p210v8.i.e(strG, "name.asString()");
        if (strG.length() <= 0 || fVar.f12552t) {
            return null;
        }
        Set set = (Set) this.f5809p.invoke();
        if (nVar != null || set == null || set.contains(fVar.g())) {
            return (InterfaceC0271e) this.f5810q.invoke(new s(fVar, nVar));
        }
        return null;
    }
}
