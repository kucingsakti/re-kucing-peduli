package L8;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.ServiceConfigurationError;
import org.chromium.net.UrlRequest;

/* JADX INFO: renamed from: L8.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0281o {
    public static final C0280n a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C0280n f2819b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C0280n f2820c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final C0280n f2821d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final C0280n f2822e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final C0280n f2823f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final C0280n f2824g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final C0280n f2825h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final C0280n f2826i;
    public static final C0280n j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final N f2827k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final N f2828l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final N f2829m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final G9.o f2830n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final HashMap f2831o;

    static {
        Y y6 = Y.f2807v;
        C0280n c0280n = new C0280n(y6, 0);
        a = c0280n;
        Z z6 = Z.f2808v;
        C0280n c0280n2 = new C0280n(z6, 1);
        f2819b = c0280n2;
        a0 a0Var = a0.f2809v;
        C0280n c0280n3 = new C0280n(a0Var, 2);
        f2820c = c0280n3;
        V v4 = V.f2804v;
        C0280n c0280n4 = new C0280n(v4, 3);
        f2821d = c0280n4;
        b0 b0Var = b0.f2810v;
        C0280n c0280n5 = new C0280n(b0Var, 4);
        f2822e = c0280n5;
        X x8 = X.f2806v;
        C0280n c0280n6 = new C0280n(x8, 5);
        f2823f = c0280n6;
        U u3 = U.f2803v;
        C0280n c0280n7 = new C0280n(u3, 6);
        f2824g = c0280n7;
        W w2 = W.f2805v;
        C0280n c0280n8 = new C0280n(w2, 7);
        f2825h = c0280n8;
        c0 c0Var = c0.f2811v;
        C0280n c0280n9 = new C0280n(c0Var, 8);
        f2826i = c0280n9;
        Collections.unmodifiableSet(p086i8.i.K(new C0280n[]{c0280n, c0280n2, c0280n4, c0280n6}));
        HashMap map = new HashMap(6);
        map.put(c0280n2, 0);
        map.put(c0280n, 0);
        map.put(c0280n4, 1);
        map.put(c0280n3, 1);
        map.put(c0280n5, 2);
        Collections.unmodifiableMap(map);
        j = c0280n5;
        f2827k = new N(2);
        f2828l = new N(3);
        f2829m = new N(4);
        try {
            Iterator it = Arrays.asList(new G9.o[0]).iterator();
            f2830n = it.hasNext() ? (G9.o) it.next() : G9.o.a;
            HashMap map2 = new HashMap();
            f2831o = map2;
            map2.put(y6, c0280n);
            map2.put(z6, c0280n2);
            map2.put(a0Var, c0280n3);
            map2.put(v4, c0280n4);
            map2.put(b0Var, c0280n5);
            map2.put(x8, c0280n6);
            map2.put(u3, c0280n7);
            map2.put(w2, c0280n8);
            map2.put(c0Var, c0280n9);
        } catch (Throwable th) {
            throw new ServiceConfigurationError(th.getMessage(), th);
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x003a  */
    public static /* synthetic */ void a(int i10) {
        String str = i10 != 16 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        Object[] objArr = new Object[i10 != 16 ? 3 : 2];
        if (i10 != 1 && i10 != 3 && i10 != 5 && i10 != 7) {
            switch (i10) {
                case 9:
                    objArr[0] = "from";
                    break;
                case 10:
                case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                    objArr[0] = "first";
                    break;
                case 11:
                case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                    objArr[0] = "second";
                    break;
                case UrlRequest.Status.READING_RESPONSE /* 14 */:
                case 15:
                    objArr[0] = "visibility";
                    break;
                case 16:
                    objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities";
                    break;
                default:
                    objArr[0] = "what";
                    break;
            }
        } else {
            objArr[0] = "from";
        }
        if (i10 != 16) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities";
        } else {
            objArr[1] = "toDescriptorVisibility";
        }
        switch (i10) {
            case 2:
            case 3:
                objArr[2] = "isVisibleIgnoringReceiver";
                break;
            case 4:
            case 5:
                objArr[2] = "isVisibleWithAnyReceiver";
                break;
            case 6:
            case 7:
                objArr[2] = "inSameFile";
                break;
            case 8:
            case 9:
                objArr[2] = "findInvisibleMember";
                break;
            case 10:
            case 11:
                objArr[2] = "compareLocal";
                break;
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                objArr[2] = "compare";
                break;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                objArr[2] = "isPrivate";
                break;
            case 15:
                objArr[2] = "toDescriptorVisibility";
                break;
            case 16:
                break;
            default:
                objArr[2] = "isVisible";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i10 == 16) {
            throw new IllegalStateException(str2);
        }
    }

    public static Integer b(C0280n c0280n, C0280n c0280n2) {
        if (c0280n == null) {
            a(12);
            throw null;
        }
        if (c0280n2 == null) {
            a(13);
            throw null;
        }
        e0 e0Var = c0280n.a;
        e0 e0Var2 = c0280n2.a;
        Integer numA = e0Var.a(e0Var2);
        if (numA != null) {
            return numA;
        }
        Integer numA2 = e0Var2.a(e0Var);
        if (numA2 != null) {
            return Integer.valueOf(-numA2.intValue());
        }
        return null;
    }

    public static InterfaceC0279m c(N n10, InterfaceC0269c interfaceC0269c, InterfaceC0276j interfaceC0276j) {
        InterfaceC0279m interfaceC0279mC;
        if (interfaceC0269c == null) {
            a(8);
            throw null;
        }
        if (interfaceC0276j == null) {
            a(9);
            throw null;
        }
        for (InterfaceC0279m interfaceC0279m = (InterfaceC0279m) interfaceC0269c.c(); interfaceC0279m != null && interfaceC0279m.f() != f2823f; interfaceC0279m = (InterfaceC0279m) p124m9.e.i(interfaceC0279m, InterfaceC0279m.class, true)) {
            if (!interfaceC0279m.f().a(n10, interfaceC0279m, interfaceC0276j)) {
                return interfaceC0279m;
            }
        }
        if (!(interfaceC0269c instanceof O8.P) || (interfaceC0279mC = c(n10, ((O8.Q) ((O8.P) interfaceC0269c)).f3684X, interfaceC0276j)) == null) {
            return null;
        }
        return interfaceC0279mC;
    }

    public static boolean d(InterfaceC0279m interfaceC0279m, InterfaceC0276j interfaceC0276j) {
        if (interfaceC0276j == null) {
            a(7);
            throw null;
        }
        N nF = p124m9.e.f(interfaceC0276j);
        if (nF != N.f2800t) {
            return nF.equals(p124m9.e.f(interfaceC0279m));
        }
        return false;
    }

    public static boolean e(C0280n c0280n) {
        if (c0280n != null) {
            return c0280n == a || c0280n == f2819b;
        }
        a(14);
        throw null;
    }

    public static C0280n f(e0 e0Var) {
        if (e0Var == null) {
            a(15);
            throw null;
        }
        C0280n c0280n = (C0280n) f2831o.get(e0Var);
        if (c0280n != null) {
            return c0280n;
        }
        throw new IllegalArgumentException("Inapplicable visibility: " + e0Var);
    }
}
