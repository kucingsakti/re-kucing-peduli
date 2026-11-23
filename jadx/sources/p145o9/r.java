package p145o9;

import A9.AbstractC0151y;
import A9.C0133f;
import A9.D;
import A9.K;
import A9.T;
import A9.d0;
import C9.h;
import I8.n;
import L8.AbstractC0287v;
import L8.InterfaceC0271e;
import L8.InterfaceC0290y;
import com.bumptech.glide.d;
import kotlin.NoWhenBranchMatchedException;
import p096j9.b;
import p210v8.i;

/* JADX INFO: loaded from: classes.dex */
public final class r extends g {
    public r(b bVar, int i10) {
        super(new p(new f(bVar, i10)));
    }

    @Override // p145o9.g
    public final AbstractC0151y a(InterfaceC0290y interfaceC0290y) {
        AbstractC0151y abstractC0151yC;
        i.f(interfaceC0290y, "module");
        K.f338t.getClass();
        K k3 = K.f339u;
        I8.i iVarS = interfaceC0290y.s();
        iVarS.getClass();
        InterfaceC0271e interfaceC0271eI = iVarS.i(n.P.g());
        Object obj = this.a;
        q qVar = (q) obj;
        if (qVar instanceof o) {
            abstractC0151yC = ((o) obj).a;
        } else {
            if (!(qVar instanceof p)) {
                throw new NoWhenBranchMatchedException();
            }
            f fVar = ((p) obj).a;
            b bVar = fVar.a;
            InterfaceC0271e interfaceC0271eD = AbstractC0287v.d(interfaceC0290y, bVar);
            int i10 = fVar.f13830b;
            if (interfaceC0271eD == null) {
                h hVar = h.UNRESOLVED_KCLASS_CONSTANT_VALUE;
                String string = bVar.toString();
                i.e(string, "classId.toString()");
                abstractC0151yC = C9.i.c(hVar, string, String.valueOf(i10));
            } else {
                D dP = interfaceC0271eD.p();
                i.e(dP, "descriptor.defaultType");
                d0 d0VarY = qa.b.y(dP);
                for (int i11 = 0; i11 < i10; i11++) {
                    d0VarY = interfaceC0290y.s().h(d0VarY);
                }
                abstractC0151yC = d0VarY;
            }
        }
        return C0133f.q(k3, interfaceC0271eI, d.u(new T(abstractC0151yC)));
    }
}
