package J8;

import A9.AbstractC0151y;
import A9.Z;
import G9.t;
import L8.InterfaceC0276j;
import L8.InterfaceC0285t;
import L8.M;
import M8.h;
import O8.C0365v;
import O8.N;
import O8.U;
import O8.w;
import androidx.datastore.preferences.protobuf.AbstractC0487g;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import p086i8.k;
import p086i8.m;
import p210v8.i;

/* JADX INFO: loaded from: classes.dex */
public final class g extends N {
    public g(InterfaceC0276j interfaceC0276j, g gVar, int i10, boolean z6) {
        super(interfaceC0276j, gVar, M8.g.a, t.f1787g, i10, M.a);
        this.f3769E = true;
        this.f3777M = z6;
        this.f3778N = false;
    }

    @Override // O8.w, L8.InterfaceC0288w
    public final boolean F() {
        return false;
    }

    @Override // O8.N, O8.w
    public final w b1(int i10, InterfaceC0276j interfaceC0276j, InterfaceC0285t interfaceC0285t, M m2, h hVar, p096j9.f fVar) {
        i.f(interfaceC0276j, "newOwner");
        AbstractC0487g.p(i10, "kind");
        i.f(hVar, "annotations");
        return new g(interfaceC0276j, (g) interfaceC0285t, i10, this.f3777M);
    }

    @Override // O8.w
    public final w c1(C0365v c0365v) {
        p096j9.f fVar;
        i.f(c0365v, "configuration");
        g gVar = (g) super.c1(c0365v);
        if (gVar == null) {
            return null;
        }
        List listH0 = gVar.H0();
        i.e(listH0, "substituted.valueParameters");
        List list = listH0;
        if ((list instanceof Collection) && list.isEmpty()) {
            return gVar;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AbstractC0151y type = ((U) it.next()).getType();
            i.e(type, "it.type");
            if (com.bumptech.glide.d.m(type) != null) {
                List listH1 = gVar.H0();
                i.e(listH1, "substituted.valueParameters");
                List list2 = listH1;
                ArrayList arrayList = new ArrayList(m.H(list2, 10));
                Iterator it2 = list2.iterator();
                while (it2.hasNext()) {
                    AbstractC0151y type2 = ((U) it2.next()).getType();
                    i.e(type2, "it.type");
                    arrayList.add(com.bumptech.glide.d.m(type2));
                }
                int size = gVar.H0().size() - arrayList.size();
                boolean z6 = true;
                if (size == 0) {
                    List listH2 = gVar.H0();
                    i.e(listH2, "valueParameters");
                    ArrayList<p076h8.f> arrayListZ0 = k.z0(arrayList, listH2);
                    if (arrayListZ0.isEmpty()) {
                        return gVar;
                    }
                    for (p076h8.f fVar2 : arrayListZ0) {
                        if (!i.a((p096j9.f) fVar2.f11789s, ((U) fVar2.f11790t).getName())) {
                        }
                    }
                    return gVar;
                }
                List listH3 = gVar.H0();
                i.e(listH3, "valueParameters");
                List<U> list3 = listH3;
                ArrayList arrayList2 = new ArrayList(m.H(list3, 10));
                for (U u3 : list3) {
                    p096j9.f name = u3.getName();
                    i.e(name, "it.name");
                    int i10 = u3.f3691x;
                    int i11 = i10 - size;
                    if (i11 >= 0 && (fVar = (p096j9.f) arrayList.get(i11)) != null) {
                        name = fVar;
                    }
                    arrayList2.add(u3.Z0(gVar, name, i10));
                }
                C0365v c0365vF1 = gVar.f1(Z.f355b);
                if (arrayList.isEmpty()) {
                    z6 = false;
                } else {
                    Iterator it3 = arrayList.iterator();
                    while (it3.hasNext()) {
                        if (((p096j9.f) it3.next()) == null) {
                        }
                    }
                    z6 = false;
                }
                c0365vF1.f3755N = Boolean.valueOf(z6);
                c0365vF1.f3763y = arrayList2;
                c0365vF1.f3761w = gVar.c();
                w wVarC1 = super.c1(c0365vF1);
                i.c(wVarC1);
                return wVarC1;
            }
        }
        return gVar;
    }

    @Override // O8.w, L8.InterfaceC0285t
    public final boolean q0() {
        return false;
    }

    @Override // O8.w, L8.InterfaceC0285t
    public final boolean u() {
        return false;
    }
}
