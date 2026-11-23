package U8;

import A9.AbstractC0151y;
import A9.Z;
import L8.InterfaceC0268b;
import L8.InterfaceC0271e;
import O8.N;
import androidx.datastore.preferences.protobuf.AbstractC0487g;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class j implements p124m9.f {
    @Override // p124m9.f
    public final int a() {
        return 2;
    }

    @Override // p124m9.f
    public final int b(InterfaceC0268b interfaceC0268b, InterfaceC0268b interfaceC0268b2, InterfaceC0271e interfaceC0271e) {
        p210v8.i.f(interfaceC0268b, "superDescriptor");
        p210v8.i.f(interfaceC0268b2, "subDescriptor");
        if (!(interfaceC0268b2 instanceof W8.f)) {
            return 4;
        }
        W8.f fVar = (W8.f) interfaceC0268b2;
        if (!fVar.z().isEmpty()) {
            return 4;
        }
        p124m9.k kVarI = p124m9.l.i(interfaceC0268b, interfaceC0268b2);
        if ((kVarI != null ? kVarI.c() : 0) != 0) {
            return 4;
        }
        List listH0 = fVar.H0();
        p210v8.i.e(listH0, "subDescriptor.valueParameters");
        K9.u uVarZ = K9.n.z(p086i8.k.N(listH0), C0444e.f4966w);
        AbstractC0151y abstractC0151y = fVar.f3787y;
        p210v8.i.c(abstractC0151y);
        K9.i iVarW = K9.n.w(p086i8.i.m(new K9.l[]{uVarZ, p086i8.i.m(new Object[]{abstractC0151y})}));
        O8.x xVar = fVar.f3765A;
        K9.h hVar = new K9.h(K9.n.w(p086i8.i.m(new K9.l[]{iVarW, p086i8.k.N(p086i8.l.D(xVar != null ? xVar.getType() : null))})));
        while (hVar.a()) {
            AbstractC0151y abstractC0151y2 = (AbstractC0151y) hVar.next();
            if (!abstractC0151y2.l().isEmpty() && !(abstractC0151y2.D0() instanceof Z8.f)) {
                return 4;
            }
        }
        InterfaceC0268b interfaceC0268bBuild = (InterfaceC0268b) interfaceC0268b.j(new Z(new Z8.d()));
        if (interfaceC0268bBuild == null) {
            return 4;
        }
        if (interfaceC0268bBuild instanceof N) {
            N n10 = (N) interfaceC0268bBuild;
            if (!n10.z().isEmpty()) {
                interfaceC0268bBuild = n10.y0().j().build();
                p210v8.i.c(interfaceC0268bBuild);
            }
        }
        int iC = p124m9.l.f13174c.n(interfaceC0268bBuild, interfaceC0268b2, false).c();
        AbstractC0487g.u(iC, "DEFAULT.isOverridableByW…Descriptor, false).result");
        return i.a[p239z.e.d(iC)] == 1 ? 1 : 4;
    }
}
