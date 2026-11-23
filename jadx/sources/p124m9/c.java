package p124m9;

import A9.O;
import L8.D;
import L8.InterfaceC0268b;
import L8.InterfaceC0269c;
import L8.InterfaceC0271e;
import L8.InterfaceC0276j;
import L8.InterfaceC0288w;
import L8.M;
import L8.P;
import N1.t;
import O8.E;
import R5.a;
import java.util.Collection;
import p086i8.k;
import p210v8.i;

/* JADX INFO: loaded from: classes.dex */
public final class c implements B9.c {
    public static final c a = new c();

    public static /* synthetic */ void b(int i10) {
        Object[] objArr = new Object[3];
        if (i10 != 1) {
            objArr[0] = a.PUSH_ADDITIONAL_DATA_KEY;
        } else {
            objArr[0] = "b";
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/OverridingUtil$1";
        objArr[2] = "equals";
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    public static M e(InterfaceC0268b interfaceC0268b) {
        while (interfaceC0268b instanceof InterfaceC0269c) {
            InterfaceC0269c interfaceC0269c = (InterfaceC0269c) interfaceC0268b;
            if (interfaceC0269c.V() != 2) {
                break;
            }
            Collection collectionX = interfaceC0269c.x();
            i.e(collectionX, "overriddenDescriptors");
            interfaceC0268b = (InterfaceC0269c) k.l0(collectionX);
            if (interfaceC0268b == null) {
                return null;
            }
        }
        return interfaceC0268b.g();
    }

    @Override // B9.c
    public boolean a(O o10, O o11) {
        if (o10 == null) {
            b(0);
            throw null;
        }
        if (o11 != null) {
            return o10.equals(o11);
        }
        b(1);
        throw null;
    }

    public boolean c(InterfaceC0276j interfaceC0276j, InterfaceC0276j interfaceC0276j2, boolean z6) {
        if ((interfaceC0276j instanceof InterfaceC0271e) && (interfaceC0276j2 instanceof InterfaceC0271e)) {
            return i.a(((InterfaceC0271e) interfaceC0276j).I(), ((InterfaceC0271e) interfaceC0276j2).I());
        }
        if ((interfaceC0276j instanceof P) && (interfaceC0276j2 instanceof P)) {
            return d((P) interfaceC0276j, (P) interfaceC0276j2, z6, b.f13167s);
        }
        if (!(interfaceC0276j instanceof InterfaceC0268b) || !(interfaceC0276j2 instanceof InterfaceC0268b)) {
            return ((interfaceC0276j instanceof D) && (interfaceC0276j2 instanceof D)) ? i.a(((E) ((D) interfaceC0276j)).f3634w, ((E) ((D) interfaceC0276j2)).f3634w) : i.a(interfaceC0276j, interfaceC0276j2);
        }
        InterfaceC0268b interfaceC0268b = (InterfaceC0268b) interfaceC0276j;
        InterfaceC0268b interfaceC0268b2 = (InterfaceC0268b) interfaceC0276j2;
        i.f(interfaceC0268b, a.PUSH_ADDITIONAL_DATA_KEY);
        i.f(interfaceC0268b2, "b");
        if (!interfaceC0268b.equals(interfaceC0268b2)) {
            if (i.a(interfaceC0268b.getName(), interfaceC0268b2.getName()) && ((!(interfaceC0268b instanceof InterfaceC0288w) || !(interfaceC0268b2 instanceof InterfaceC0288w) || ((InterfaceC0288w) interfaceC0268b).i0() == ((InterfaceC0288w) interfaceC0268b2).i0()) && ((!i.a(interfaceC0268b.v(), interfaceC0268b2.v()) || (z6 && i.a(e(interfaceC0268b), e(interfaceC0268b2)))) && !e.o(interfaceC0268b) && !e.o(interfaceC0268b2)))) {
                InterfaceC0276j interfaceC0276jV = interfaceC0268b.v();
                InterfaceC0276j interfaceC0276jV2 = interfaceC0268b2.v();
                if (((interfaceC0276jV instanceof InterfaceC0269c) || (interfaceC0276jV2 instanceof InterfaceC0269c)) ? false : c(interfaceC0276jV, interfaceC0276jV2, z6)) {
                    l lVar = new l(new t(interfaceC0268b, interfaceC0268b2, z6));
                    if (lVar.m(interfaceC0268b, interfaceC0268b2, null, true).c() != 1 || lVar.m(interfaceC0268b2, interfaceC0268b, null, true).c() != 1) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    public boolean d(P p10, P p11, boolean z6, p200u8.c cVar) {
        i.f(p10, a.PUSH_ADDITIONAL_DATA_KEY);
        i.f(p11, "b");
        if (p10.equals(p11)) {
            return true;
        }
        if (i.a(p10.v(), p11.v())) {
            return false;
        }
        InterfaceC0276j interfaceC0276jV = p10.v();
        InterfaceC0276j interfaceC0276jV2 = p11.v();
        return (((interfaceC0276jV instanceof InterfaceC0269c) || (interfaceC0276jV2 instanceof InterfaceC0269c)) ? ((Boolean) cVar.invoke(interfaceC0276jV, interfaceC0276jV2)).booleanValue() : c(interfaceC0276jV, interfaceC0276jV2, z6)) && p10.d0() == p11.d0();
    }
}
