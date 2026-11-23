package p230x9;

import L8.D;
import L8.InterfaceC0290y;
import O8.E;
import e2.b;
import java.util.LinkedHashMap;
import java.util.List;
import o1.m;
import p047e9.C;
import p047e9.C0618j;
import p047e9.K;
import p047e9.L;
import p057f9.a;
import p086i8.z;
import p165q9.d;
import p210v8.i;
import p238y9.n;
import p247z9.l;

/* JADX INFO: loaded from: classes.dex */
public final class c extends E implements D {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final m f15788A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public p047e9.E f15789B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public n f15790C;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final a f15791y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final o1.c f15792z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(p096j9.c cVar, l lVar, InterfaceC0290y interfaceC0290y, p047e9.E e10, a aVar) {
        super(interfaceC0290y, cVar);
        i.f(cVar, "fqName");
        i.f(interfaceC0290y, "module");
        this.f15791y = aVar;
        L l4 = e10.f10764v;
        i.e(l4, "proto.strings");
        K k3 = e10.f10765w;
        i.e(k3, "proto.qualifiedNames");
        o1.c cVar2 = new o1.c(l4, k3);
        this.f15792z = cVar2;
        b bVar = new b(this, 11);
        m mVar = new m();
        mVar.f13641s = cVar2;
        mVar.f13642t = aVar;
        mVar.f13643u = bVar;
        List list = e10.f10767y;
        i.e(list, "proto.class_List");
        List list2 = list;
        int iS = z.s(p086i8.m.H(list2, 10));
        LinkedHashMap linkedHashMap = new LinkedHashMap(iS < 16 ? 16 : iS);
        for (Object obj : list2) {
            linkedHashMap.put(J7.a.e((o1.c) mVar.f13641s, ((C0618j) obj).f11128w), obj);
        }
        mVar.f13644v = linkedHashMap;
        this.f15788A = mVar;
        this.f15789B = e10;
    }

    @Override // L8.D
    public final t9.n E0() {
        n nVar = this.f15790C;
        if (nVar != null) {
            return nVar;
        }
        i.n("_memberScope");
        throw null;
    }

    public final void a1(I4.c cVar) {
        i.f(cVar, "components");
        p047e9.E e10 = this.f15789B;
        if (e10 == null) {
            throw new IllegalStateException("Repeated call to DeserializedPackageFragmentImpl::initialize");
        }
        this.f15789B = null;
        C c10 = e10.f10766x;
        i.e(c10, "proto.`package`");
        this.f15790C = new n(this, c10, this.f15792z, this.f15791y, null, cVar, "scope of " + this, new c2.a(this, 22));
    }

    @Override // O8.E, O8.AbstractC0359o
    public final String toString() {
        return "builtins package fragment for " + this.f3634w + " from " + d.j(this);
    }
}
