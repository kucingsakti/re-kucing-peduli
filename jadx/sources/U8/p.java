package U8;

import L8.InterfaceC0268b;
import L8.InterfaceC0269c;
import L8.InterfaceC0271e;
import L8.InterfaceC0285t;
import O8.AbstractC0359o;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class p implements p124m9.f {
    @Override // p124m9.f
    public final int a() {
        return 1;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0043  */
    /* JADX WARN: Code duplicated, block: B:16:0x004e  */
    /* JADX WARN: Code duplicated, block: B:17:0x0052  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // p124m9.f
    public final int b(InterfaceC0268b interfaceC0268b, InterfaceC0268b interfaceC0268b2, InterfaceC0271e interfaceC0271e) {
        InterfaceC0269c interfaceC0269cM;
        boolean z6;
        InterfaceC0285t interfaceC0285t;
        p210v8.i.f(interfaceC0268b, "superDescriptor");
        p210v8.i.f(interfaceC0268b2, "subDescriptor");
        if ((interfaceC0268b instanceof InterfaceC0269c) && (interfaceC0268b2 instanceof InterfaceC0285t) && !I8.i.z(interfaceC0268b2)) {
            int i10 = C0445f.f4971l;
            InterfaceC0285t interfaceC0285t2 = (InterfaceC0285t) interfaceC0268b2;
            AbstractC0359o abstractC0359o = (AbstractC0359o) interfaceC0285t2;
            p096j9.f name = abstractC0359o.getName();
            p210v8.i.e(name, "subDescriptor.name");
            if (C0445f.b(name)) {
                interfaceC0269cM = p086i8.C.m((InterfaceC0269c) interfaceC0268b);
                z6 = interfaceC0268b instanceof InterfaceC0285t;
                if (z6) {
                    interfaceC0285t = (InterfaceC0285t) interfaceC0268b;
                } else {
                    interfaceC0285t = null;
                }
                return interfaceC0285t == null ? 3 : 3;
                if (interfaceC0271e instanceof W8.c) {
                    return interfaceC0269cM instanceof InterfaceC0285t ? 3 : 3;
                }
            } else {
                ArrayList arrayList = F.a;
                p096j9.f name2 = abstractC0359o.getName();
                p210v8.i.e(name2, "subDescriptor.name");
                if (F.j.contains(name2)) {
                    interfaceC0269cM = p086i8.C.m((InterfaceC0269c) interfaceC0268b);
                    z6 = interfaceC0268b instanceof InterfaceC0285t;
                    if (z6) {
                        interfaceC0285t = (InterfaceC0285t) interfaceC0268b;
                    } else {
                        interfaceC0285t = null;
                    }
                    if (!(interfaceC0285t == null && interfaceC0285t2.n0() == interfaceC0285t.n0()) && (interfaceC0269cM == null || !interfaceC0285t2.n0())) {
                        return 3;
                    }
                    if ((interfaceC0271e instanceof W8.c) && interfaceC0285t2.C() == null && interfaceC0269cM != null && !p086i8.C.p(interfaceC0271e, interfaceC0269cM)) {
                        if ((interfaceC0269cM instanceof InterfaceC0285t) || !z6 || C0445f.a((InterfaceC0285t) interfaceC0269cM) == null) {
                            return 3;
                        }
                        String strC = qa.b.c(interfaceC0285t2, 2);
                        InterfaceC0285t interfaceC0285tC = ((InterfaceC0285t) interfaceC0268b).c();
                        p210v8.i.e(interfaceC0285tC, "superDescriptor.original");
                        if (!strC.equals(qa.b.c(interfaceC0285tC, 2))) {
                            return 3;
                        }
                    }
                }
            }
        }
        return com.bumptech.glide.d.l(interfaceC0268b, interfaceC0268b2) ? 3 : 4;
    }
}
