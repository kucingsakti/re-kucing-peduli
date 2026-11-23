package G9;

import A9.AbstractC0151y;
import A9.C0133f;
import A9.D;
import A9.I;
import A9.K;
import A9.b0;
import L8.AbstractC0287v;
import L8.InterfaceC0271e;
import L8.InterfaceC0290y;
import L8.P;
import O8.U;
import java.util.Collection;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class l implements e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final l f1770b = new l(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final l f1771c = new l(1);
    public final /* synthetic */ int a;

    public /* synthetic */ l(int i10) {
        this.a = i10;
    }

    @Override // G9.e
    public final boolean a(W8.f fVar) {
        D dQ;
        switch (this.a) {
            case 0:
                U u3 = (U) fVar.H0().get(1);
                p204v1.g gVar = I8.m.f2134d;
                p210v8.i.e(u3, "secondParameter");
                InterfaceC0290y interfaceC0290yJ = p165q9.d.j(u3);
                gVar.getClass();
                InterfaceC0271e interfaceC0271eD = AbstractC0287v.d(interfaceC0290yJ, I8.n.f2153Q);
                if (interfaceC0271eD == null) {
                    dQ = null;
                } else {
                    K.f338t.getClass();
                    K k3 = K.f339u;
                    List listU = interfaceC0271eD.I().u();
                    p210v8.i.e(listU, "kPropertyClass.typeConstructor.parameters");
                    Object objK0 = p086i8.k.k0(listU);
                    p210v8.i.e(objK0, "kPropertyClass.typeConstructor.parameters.single()");
                    dQ = C0133f.q(k3, interfaceC0271eD, com.bumptech.glide.d.u(new I((P) objK0)));
                }
                if (dQ == null) {
                    return false;
                }
                AbstractC0151y type = u3.getType();
                p210v8.i.e(type, "secondParameter.type");
                return B9.d.a.b(dQ, b0.g(type, false));
            default:
                List listH0 = fVar.H0();
                p210v8.i.e(listH0, "functionDescriptor.valueParameters");
                List<U> list = listH0;
                if (!(list instanceof Collection) || !list.isEmpty()) {
                    for (U u10 : list) {
                        p210v8.i.e(u10, "it");
                        if (p165q9.d.a(u10) || u10.f3689B != null) {
                            return false;
                        }
                    }
                }
                return true;
        }
    }

    @Override // G9.e
    public final String b(W8.f fVar) {
        switch (this.a) {
            case 0:
                break;
        }
        return D3.b.n(this, fVar);
    }

    @Override // G9.e
    public final String getDescription() {
        switch (this.a) {
            case 0:
                return "second parameter must be of type KProperty<*> or its supertype";
            default:
                return "should not have varargs or parameters with default values";
        }
    }
}
