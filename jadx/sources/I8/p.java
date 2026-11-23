package I8;

import A9.C0138k;
import L8.AbstractC0281o;
import L8.C0280n;
import L8.InterfaceC0285t;
import O8.C0355k;
import O8.D;
import O8.S;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public abstract class p {
    public static final D a;

    static {
        C9.i iVar = C9.i.a;
        K8.k kVar = new K8.k(C9.i.f1015b, o.f2192e, 1);
        p096j9.f fVarF = o.f2193f.f();
        p247z9.b bVar = p247z9.l.f16335e;
        D d3 = new D(kVar, fVarF, bVar);
        d3.f3633z = 4;
        C0280n c0280n = AbstractC0281o.f2822e;
        if (c0280n == null) {
            D.d(9);
            throw null;
        }
        d3.f3627A = c0280n;
        List listU = com.bumptech.glide.d.u(S.c1(d3, 2, p096j9.f.j("T"), 0, bVar));
        if (d3.f3629C != null) {
            throw new IllegalStateException("Type parameters are already set for " + d3.getName());
        }
        ArrayList arrayList = new ArrayList(listU);
        d3.f3629C = arrayList;
        d3.f3628B = new C0138k(d3, arrayList, d3.f3630D, d3.f3631E);
        Set set = Collections.EMPTY_SET;
        if (set == null) {
            D.d(13);
            throw null;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            ((C0355k) ((InterfaceC0285t) it.next())).f3787y = d3.p();
        }
        a = d3;
    }
}
