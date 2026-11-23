package p238y9;

import L8.D;
import L8.InterfaceC0273g;
import O8.E;
import V3.b;
import com.unity3d.ads.metadata.MediationMetaData;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import p047e9.C;
import p047e9.X;
import p047e9.e0;
import p067g9.a;
import p067g9.f;
import p067g9.g;
import p067g9.h;
import p086i8.k;
import p086i8.q;
import p086i8.u;
import p096j9.c;
import p188t1.Y;
import p210v8.i;

/* JADX INFO: loaded from: classes.dex */
public final class n extends m {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final D f16101g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f16102h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final c f16103i;

    public n(D d3, C c10, f fVar, a aVar, p029c9.f fVar2, I4.c cVar, String str, p200u8.a aVar2) {
        i.f(d3, "packageDescriptor");
        i.f(c10, "proto");
        i.f(fVar, "nameResolver");
        i.f(aVar, "metadataVersion");
        i.f(cVar, "components");
        i.f(str, "debugName");
        X x8 = c10.f10752y;
        i.e(x8, "proto.typeTable");
        g gVar = new g(x8);
        h hVar = h.f11586b;
        e0 e0Var = c10.f10753z;
        i.e(e0Var, "proto.versionRequirementTable");
        b bVarA = cVar.a(d3, fVar, gVar, C3.b.h(e0Var), aVar, fVar2);
        List list = c10.f10749v;
        i.e(list, "proto.functionList");
        List list2 = c10.f10750w;
        i.e(list2, "proto.propertyList");
        List list3 = c10.f10751x;
        i.e(list3, "proto.typeAliasList");
        super(bVarA, list, list2, list3, aVar2);
        this.f16101g = d3;
        this.f16102h = str;
        this.f16103i = ((E) d3).f3634w;
    }

    @Override // p238y9.m, t9.o, t9.p
    public final InterfaceC0273g a(p096j9.f fVar, T8.b bVar) {
        i.f(fVar, MediationMetaData.KEY_NAME);
        i.f(bVar, "location");
        Y.t((T8.a) ((I4.c) this.f16097b.a).f2086i, bVar, this.f16101g, fVar);
        return super.a(fVar, bVar);
    }

    @Override // t9.o, t9.p
    public final Collection f(t9.f fVar, p200u8.b bVar) {
        i.f(fVar, "kindFilter");
        Collection collectionI = i(fVar, bVar);
        Iterable iterable = (Iterable) ((I4.c) this.f16097b.a).f2087k;
        ArrayList arrayList = new ArrayList();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            q.J(arrayList, ((N8.c) it.next()).c(this.f16103i));
        }
        return k.g0(collectionI, arrayList);
    }

    @Override // p238y9.m
    public final p096j9.b l(p096j9.f fVar) {
        i.f(fVar, MediationMetaData.KEY_NAME);
        return new p096j9.b(this.f16103i, fVar);
    }

    @Override // p238y9.m
    public final Set n() {
        return u.f12330s;
    }

    @Override // p238y9.m
    public final Set o() {
        return u.f12330s;
    }

    @Override // p238y9.m
    public final Set p() {
        return u.f12330s;
    }

    @Override // p238y9.m
    public final boolean q(p096j9.f fVar) {
        i.f(fVar, MediationMetaData.KEY_NAME);
        if (super.q(fVar)) {
            return true;
        }
        Iterable iterable = (Iterable) ((I4.c) this.f16097b.a).f2087k;
        if ((iterable instanceof Collection) && ((Collection) iterable).isEmpty()) {
            return false;
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            if (((N8.c) it.next()).b(this.f16103i, fVar)) {
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        return this.f16102h;
    }

    @Override // p238y9.m
    public final void h(ArrayList arrayList, p200u8.b bVar) {
    }
}
