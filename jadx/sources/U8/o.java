package U8;

import L8.AbstractC0281o;
import L8.C0280n;
import L8.InterfaceC0269c;
import L8.InterfaceC0276j;
import L8.InterfaceC0279m;
import L8.N;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class o {
    public static final C0280n a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C0280n f4978b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C0280n f4979c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final HashMap f4980d;

    static {
        P8.a aVar = P8.a.f3899v;
        C0280n c0280n = new C0280n(aVar, 9);
        a = c0280n;
        P8.c cVar = P8.c.f3901v;
        C0280n c0280n2 = new C0280n(cVar, 10);
        f4978b = c0280n2;
        P8.b bVar = P8.b.f3900v;
        C0280n c0280n3 = new C0280n(bVar, 11);
        f4979c = c0280n3;
        HashMap map = new HashMap();
        f4980d = map;
        map.put(aVar, c0280n);
        map.put(cVar, c0280n2);
        map.put(bVar, c0280n3);
    }

    public static /* synthetic */ void a(int i10) {
        String str = (i10 == 5 || i10 == 6) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i10 == 5 || i10 == 6) ? 2 : 3];
        switch (i10) {
            case 1:
                objArr[0] = "from";
                break;
            case 2:
                objArr[0] = "first";
                break;
            case 3:
                objArr[0] = "second";
                break;
            case 4:
                objArr[0] = "visibility";
                break;
            case 5:
            case 6:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/JavaDescriptorVisibilities";
                break;
            default:
                objArr[0] = "what";
                break;
        }
        if (i10 == 5 || i10 == 6) {
            objArr[1] = "toDescriptorVisibility";
        } else {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/JavaDescriptorVisibilities";
        }
        if (i10 == 2 || i10 == 3) {
            objArr[2] = "areInSamePackage";
        } else if (i10 == 4) {
            objArr[2] = "toDescriptorVisibility";
        } else if (i10 != 5 && i10 != 6) {
            objArr[2] = "isVisibleForProtectedAndPackage";
        }
        String str2 = String.format(str, objArr);
        if (i10 != 5 && i10 != 6) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    public static boolean b(N n10, InterfaceC0279m interfaceC0279m, InterfaceC0276j interfaceC0276j) {
        if (interfaceC0276j == null) {
            a(1);
            throw null;
        }
        int i10 = p124m9.e.a;
        if (c(interfaceC0279m instanceof InterfaceC0269c ? p124m9.e.t((InterfaceC0269c) interfaceC0279m) : interfaceC0279m, interfaceC0276j)) {
            return true;
        }
        return AbstractC0281o.f2820c.a(n10, interfaceC0279m, interfaceC0276j);
    }

    public static boolean c(InterfaceC0279m interfaceC0279m, InterfaceC0276j interfaceC0276j) {
        if (interfaceC0279m == null) {
            a(2);
            throw null;
        }
        if (interfaceC0276j == null) {
            a(3);
            throw null;
        }
        L8.D d3 = (L8.D) p124m9.e.i(interfaceC0279m, L8.D.class, false);
        L8.D d8 = (L8.D) p124m9.e.i(interfaceC0276j, L8.D.class, false);
        return (d8 == null || d3 == null || !((O8.E) d3).f3634w.equals(((O8.E) d8).f3634w)) ? false : true;
    }
}
