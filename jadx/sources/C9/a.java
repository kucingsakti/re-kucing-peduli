package C9;

import A9.W;
import A9.Z;
import L8.AbstractC0281o;
import L8.InterfaceC0271e;
import L8.InterfaceC0277k;
import L8.M;
import L8.N;
import O8.C0355k;
import O8.C0357m;
import java.util.List;
import p086i8.C;
import p086i8.s;
import p247z9.l;
import t9.n;

/* JADX INFO: loaded from: classes.dex */
public final class a extends C0357m {
    /* JADX WARN: Illegal instructions before constructor call */
    public a(p096j9.f fVar) {
        i iVar = i.a;
        c cVar = i.f1015b;
        List list = s.f12328s;
        N n10 = M.a;
        super(cVar, fVar, 3, 1, list, l.f16335e);
        C0355k c0355k = new C0355k(this, null, M8.g.a, true, 1, n10);
        c0355k.n1(list, AbstractC0281o.f2821d);
        String str = c0355k.getName().f12551s;
        p210v8.i.e(str, "errorConstructor.name.toString()");
        e eVarB = i.b(new String[]{str, ""}, 9);
        h hVar = h.ERROR_CLASS;
        c0355k.f3787y = new f(i.d(hVar, new String[0]), eVarB, hVar, list, false, new String[0]);
        l(eVarB, C.w(c0355k), c0355k);
    }

    @Override // O8.AbstractC0346b, O8.B
    public final n a(W w2, B9.f fVar) {
        String str = getName().f12551s;
        p210v8.i.e(str, "name.toString()");
        return i.b(new String[]{str, w2.toString()}, 9);
    }

    @Override // O8.AbstractC0346b
    /* JADX INFO: renamed from: i */
    public final InterfaceC0271e j(Z z6) {
        p210v8.i.f(z6, "substitutor");
        return this;
    }

    @Override // O8.AbstractC0346b, L8.O
    public final InterfaceC0277k j(Z z6) {
        p210v8.i.f(z6, "substitutor");
        return this;
    }

    @Override // O8.C0357m
    public final String toString() {
        String strG = getName().g();
        p210v8.i.e(strG, "name.asString()");
        return strG;
    }
}
