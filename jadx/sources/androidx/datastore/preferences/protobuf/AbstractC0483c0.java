package androidx.datastore.preferences.protobuf;

import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.c0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0483c0 {
    public static final Class a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final j0 f6449b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final j0 f6450c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final l0 f6451d;

    static {
        Class<?> cls;
        try {
            cls = Class.forName("androidx.datastore.preferences.protobuf.GeneratedMessageV3");
        } catch (Throwable unused) {
            cls = null;
        }
        a = cls;
        f6449b = w(false);
        f6450c = w(true);
        f6451d = new l0();
    }

    public static void A(int i10, List list, I i11) {
        if (list == null || list.isEmpty()) {
            return;
        }
        i11.getClass();
        for (int i12 = 0; i12 < list.size(); i12++) {
            ((C0491k) i11.a).G(i10, (C0488h) list.get(i12));
        }
    }

    public static void B(int i10, List list, I i11, boolean z6) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0491k c0491k = (C0491k) i11.a;
        int i12 = 0;
        if (!z6) {
            while (i12 < list.size()) {
                double dDoubleValue = ((Double) list.get(i12)).doubleValue();
                c0491k.getClass();
                c0491k.K(i10, Double.doubleToRawLongBits(dDoubleValue));
                i12++;
            }
            return;
        }
        c0491k.R(i10, 2);
        int i13 = 0;
        for (int i14 = 0; i14 < list.size(); i14++) {
            ((Double) list.get(i14)).getClass();
            Logger logger = C0491k.f6487h;
            i13 += 8;
        }
        c0491k.T(i13);
        while (i12 < list.size()) {
            c0491k.L(Double.doubleToRawLongBits(((Double) list.get(i12)).doubleValue()));
            i12++;
        }
    }

    public static void C(int i10, List list, I i11, boolean z6) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0491k c0491k = (C0491k) i11.a;
        int i12 = 0;
        if (!z6) {
            while (i12 < list.size()) {
                c0491k.M(i10, ((Integer) list.get(i12)).intValue());
                i12++;
            }
            return;
        }
        c0491k.R(i10, 2);
        int iW = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            iW += C0491k.w(((Integer) list.get(i13)).intValue());
        }
        c0491k.T(iW);
        while (i12 < list.size()) {
            c0491k.N(((Integer) list.get(i12)).intValue());
            i12++;
        }
    }

    public static void D(int i10, List list, I i11, boolean z6) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0491k c0491k = (C0491k) i11.a;
        int i12 = 0;
        if (!z6) {
            while (i12 < list.size()) {
                c0491k.I(i10, ((Integer) list.get(i12)).intValue());
                i12++;
            }
            return;
        }
        c0491k.R(i10, 2);
        int i13 = 0;
        for (int i14 = 0; i14 < list.size(); i14++) {
            ((Integer) list.get(i14)).getClass();
            Logger logger = C0491k.f6487h;
            i13 += 4;
        }
        c0491k.T(i13);
        while (i12 < list.size()) {
            c0491k.J(((Integer) list.get(i12)).intValue());
            i12++;
        }
    }

    public static void E(int i10, List list, I i11, boolean z6) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0491k c0491k = (C0491k) i11.a;
        int i12 = 0;
        if (!z6) {
            while (i12 < list.size()) {
                c0491k.K(i10, ((Long) list.get(i12)).longValue());
                i12++;
            }
            return;
        }
        c0491k.R(i10, 2);
        int i13 = 0;
        for (int i14 = 0; i14 < list.size(); i14++) {
            ((Long) list.get(i14)).getClass();
            Logger logger = C0491k.f6487h;
            i13 += 8;
        }
        c0491k.T(i13);
        while (i12 < list.size()) {
            c0491k.L(((Long) list.get(i12)).longValue());
            i12++;
        }
    }

    public static void F(int i10, List list, I i11, boolean z6) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0491k c0491k = (C0491k) i11.a;
        int i12 = 0;
        if (!z6) {
            while (i12 < list.size()) {
                float fFloatValue = ((Float) list.get(i12)).floatValue();
                c0491k.getClass();
                c0491k.I(i10, Float.floatToRawIntBits(fFloatValue));
                i12++;
            }
            return;
        }
        c0491k.R(i10, 2);
        int i13 = 0;
        for (int i14 = 0; i14 < list.size(); i14++) {
            ((Float) list.get(i14)).getClass();
            Logger logger = C0491k.f6487h;
            i13 += 4;
        }
        c0491k.T(i13);
        while (i12 < list.size()) {
            c0491k.J(Float.floatToRawIntBits(((Float) list.get(i12)).floatValue()));
            i12++;
        }
    }

    public static void G(int i10, List list, I i11, InterfaceC0481b0 interfaceC0481b0) {
        if (list == null || list.isEmpty()) {
            return;
        }
        i11.getClass();
        for (int i12 = 0; i12 < list.size(); i12++) {
            i11.b(i10, list.get(i12), interfaceC0481b0);
        }
    }

    public static void H(int i10, List list, I i11, boolean z6) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0491k c0491k = (C0491k) i11.a;
        int i12 = 0;
        if (!z6) {
            while (i12 < list.size()) {
                c0491k.M(i10, ((Integer) list.get(i12)).intValue());
                i12++;
            }
            return;
        }
        c0491k.R(i10, 2);
        int iW = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            iW += C0491k.w(((Integer) list.get(i13)).intValue());
        }
        c0491k.T(iW);
        while (i12 < list.size()) {
            c0491k.N(((Integer) list.get(i12)).intValue());
            i12++;
        }
    }

    public static void I(int i10, List list, I i11, boolean z6) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0491k c0491k = (C0491k) i11.a;
        int i12 = 0;
        if (!z6) {
            while (i12 < list.size()) {
                c0491k.U(i10, ((Long) list.get(i12)).longValue());
                i12++;
            }
            return;
        }
        c0491k.R(i10, 2);
        int iA = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            iA += C0491k.A(((Long) list.get(i13)).longValue());
        }
        c0491k.T(iA);
        while (i12 < list.size()) {
            c0491k.V(((Long) list.get(i12)).longValue());
            i12++;
        }
    }

    public static void J(int i10, List list, I i11, InterfaceC0481b0 interfaceC0481b0) {
        if (list == null || list.isEmpty()) {
            return;
        }
        i11.getClass();
        for (int i12 = 0; i12 < list.size(); i12++) {
            ((C0491k) i11.a).O(i10, (AbstractC0478a) list.get(i12), interfaceC0481b0);
        }
    }

    public static void K(int i10, List list, I i11, boolean z6) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0491k c0491k = (C0491k) i11.a;
        int i12 = 0;
        if (!z6) {
            while (i12 < list.size()) {
                c0491k.I(i10, ((Integer) list.get(i12)).intValue());
                i12++;
            }
            return;
        }
        c0491k.R(i10, 2);
        int i13 = 0;
        for (int i14 = 0; i14 < list.size(); i14++) {
            ((Integer) list.get(i14)).getClass();
            Logger logger = C0491k.f6487h;
            i13 += 4;
        }
        c0491k.T(i13);
        while (i12 < list.size()) {
            c0491k.J(((Integer) list.get(i12)).intValue());
            i12++;
        }
    }

    public static void L(int i10, List list, I i11, boolean z6) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0491k c0491k = (C0491k) i11.a;
        int i12 = 0;
        if (!z6) {
            while (i12 < list.size()) {
                c0491k.K(i10, ((Long) list.get(i12)).longValue());
                i12++;
            }
            return;
        }
        c0491k.R(i10, 2);
        int i13 = 0;
        for (int i14 = 0; i14 < list.size(); i14++) {
            ((Long) list.get(i14)).getClass();
            Logger logger = C0491k.f6487h;
            i13 += 8;
        }
        c0491k.T(i13);
        while (i12 < list.size()) {
            c0491k.L(((Long) list.get(i12)).longValue());
            i12++;
        }
    }

    public static void M(int i10, List list, I i11, boolean z6) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0491k c0491k = (C0491k) i11.a;
        int i12 = 0;
        if (!z6) {
            while (i12 < list.size()) {
                int iIntValue = ((Integer) list.get(i12)).intValue();
                c0491k.S(i10, (iIntValue >> 31) ^ (iIntValue << 1));
                i12++;
            }
            return;
        }
        c0491k.R(i10, 2);
        int iZ = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            int iIntValue2 = ((Integer) list.get(i13)).intValue();
            iZ += C0491k.z((iIntValue2 >> 31) ^ (iIntValue2 << 1));
        }
        c0491k.T(iZ);
        while (i12 < list.size()) {
            int iIntValue3 = ((Integer) list.get(i12)).intValue();
            c0491k.T((iIntValue3 >> 31) ^ (iIntValue3 << 1));
            i12++;
        }
    }

    public static void N(int i10, List list, I i11, boolean z6) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0491k c0491k = (C0491k) i11.a;
        int i12 = 0;
        if (!z6) {
            while (i12 < list.size()) {
                long jLongValue = ((Long) list.get(i12)).longValue();
                c0491k.U(i10, (jLongValue >> 63) ^ (jLongValue << 1));
                i12++;
            }
            return;
        }
        c0491k.R(i10, 2);
        int iA = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            long jLongValue2 = ((Long) list.get(i13)).longValue();
            iA += C0491k.A((jLongValue2 >> 63) ^ (jLongValue2 << 1));
        }
        c0491k.T(iA);
        while (i12 < list.size()) {
            long jLongValue3 = ((Long) list.get(i12)).longValue();
            c0491k.V((jLongValue3 >> 63) ^ (jLongValue3 << 1));
            i12++;
        }
    }

    public static void O(int i10, List list, I i11) throws CodedOutputStream$OutOfSpaceException {
        if (list == null || list.isEmpty()) {
            return;
        }
        i11.getClass();
        boolean z6 = list instanceof C;
        C0491k c0491k = (C0491k) i11.a;
        int i12 = 0;
        if (!z6) {
            while (i12 < list.size()) {
                c0491k.P(i10, (String) list.get(i12));
                i12++;
            }
            return;
        }
        C c10 = (C) list;
        while (i12 < list.size()) {
            Object objJ = c10.J(i12);
            if (objJ instanceof String) {
                c0491k.P(i10, (String) objJ);
            } else {
                c0491k.G(i10, (C0488h) objJ);
            }
            i12++;
        }
    }

    public static void P(int i10, List list, I i11, boolean z6) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0491k c0491k = (C0491k) i11.a;
        int i12 = 0;
        if (!z6) {
            while (i12 < list.size()) {
                c0491k.S(i10, ((Integer) list.get(i12)).intValue());
                i12++;
            }
            return;
        }
        c0491k.R(i10, 2);
        int iZ = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            iZ += C0491k.z(((Integer) list.get(i13)).intValue());
        }
        c0491k.T(iZ);
        while (i12 < list.size()) {
            c0491k.T(((Integer) list.get(i12)).intValue());
            i12++;
        }
    }

    public static void Q(int i10, List list, I i11, boolean z6) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0491k c0491k = (C0491k) i11.a;
        int i12 = 0;
        if (!z6) {
            while (i12 < list.size()) {
                c0491k.U(i10, ((Long) list.get(i12)).longValue());
                i12++;
            }
            return;
        }
        c0491k.R(i10, 2);
        int iA = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            iA += C0491k.A(((Long) list.get(i13)).longValue());
        }
        c0491k.T(iA);
        while (i12 < list.size()) {
            c0491k.V(((Long) list.get(i12)).longValue());
            i12++;
        }
    }

    public static int a(List list, int i10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iY = C0491k.y(i10) * size;
        for (int i11 = 0; i11 < list.size(); i11++) {
            iY += C0491k.s((C0488h) list.get(i11));
        }
        return iY;
    }

    public static int b(List list, int i10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (C0491k.y(i10) * size) + c(list);
    }

    public static int c(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof AbstractC0503x) {
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int iW = 0;
        for (int i10 = 0; i10 < size; i10++) {
            iW += C0491k.w(((Integer) list.get(i10)).intValue());
        }
        return iW;
    }

    public static int d(List list, int i10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return C0491k.t(i10) * size;
    }

    public static int e(List list) {
        return list.size() * 4;
    }

    public static int f(List list, int i10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return C0491k.u(i10) * size;
    }

    public static int g(List list) {
        return list.size() * 8;
    }

    public static int h(List list, int i10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (C0491k.y(i10) * size) + i(list);
    }

    public static int i(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof AbstractC0503x) {
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int iW = 0;
        for (int i10 = 0; i10 < size; i10++) {
            iW += C0491k.w(((Integer) list.get(i10)).intValue());
        }
        return iW;
    }

    public static int j(List list, int i10) {
        if (list.size() == 0) {
            return 0;
        }
        return (C0491k.y(i10) * list.size()) + k(list);
    }

    public static int k(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof G) {
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int iA = 0;
        for (int i10 = 0; i10 < size; i10++) {
            iA += C0491k.A(((Long) list.get(i10)).longValue());
        }
        return iA;
    }

    public static int l(int i10, List list, InterfaceC0481b0 interfaceC0481b0) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iY = C0491k.y(i10) * size;
        for (int i11 = 0; i11 < size; i11++) {
            int iB = ((AbstractC0478a) list.get(i11)).b(interfaceC0481b0);
            iY += C0491k.z(iB) + iB;
        }
        return iY;
    }

    public static int m(List list, int i10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (C0491k.y(i10) * size) + n(list);
    }

    public static int n(List list) {
        int size = list.size();
        if (size != 0) {
            if (!(list instanceof AbstractC0503x)) {
                int iZ = 0;
                for (int i10 = 0; i10 < size; i10++) {
                    int iIntValue = ((Integer) list.get(i10)).intValue();
                    iZ += C0491k.z((iIntValue >> 31) ^ (iIntValue << 1));
                }
                return iZ;
            }
            if (size > 0) {
                throw null;
            }
        }
        return 0;
    }

    public static int o(List list, int i10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (C0491k.y(i10) * size) + p(list);
    }

    public static int p(List list) {
        int size = list.size();
        if (size != 0) {
            if (!(list instanceof G)) {
                int iA = 0;
                for (int i10 = 0; i10 < size; i10++) {
                    long jLongValue = ((Long) list.get(i10)).longValue();
                    iA += C0491k.A((jLongValue >> 63) ^ (jLongValue << 1));
                }
                return iA;
            }
            if (size > 0) {
                throw null;
            }
        }
        return 0;
    }

    public static int q(List list, int i10) {
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        int iY = C0491k.y(i10) * size;
        if (!(list instanceof C)) {
            while (i11 < size) {
                Object obj = list.get(i11);
                iY = (obj instanceof C0488h ? C0491k.s((C0488h) obj) : C0491k.x((String) obj)) + iY;
                i11++;
            }
            return iY;
        }
        C c10 = (C) list;
        while (i11 < size) {
            Object objJ = c10.J(i11);
            iY = (objJ instanceof C0488h ? C0491k.s((C0488h) objJ) : C0491k.x((String) objJ)) + iY;
            i11++;
        }
        return iY;
    }

    public static int r(List list, int i10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (C0491k.y(i10) * size) + s(list);
    }

    public static int s(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof AbstractC0503x) {
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int iZ = 0;
        for (int i10 = 0; i10 < size; i10++) {
            iZ += C0491k.z(((Integer) list.get(i10)).intValue());
        }
        return iZ;
    }

    public static int t(List list, int i10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (C0491k.y(i10) * size) + u(list);
    }

    public static int u(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof G) {
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int iA = 0;
        for (int i10 = 0; i10 < size; i10++) {
            iA += C0491k.A(((Long) list.get(i10)).longValue());
        }
        return iA;
    }

    public static j0 w(boolean z6) {
        Class<?> cls;
        try {
            cls = Class.forName("androidx.datastore.preferences.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            cls = null;
        }
        if (cls != null) {
            try {
                return (j0) cls.getConstructor(Boolean.TYPE).newInstance(Boolean.valueOf(z6));
            } catch (Throwable unused2) {
            }
        }
        return null;
    }

    public static void x(j0 j0Var, AbstractC0502w abstractC0502w, AbstractC0502w abstractC0502w2) {
        ((l0) j0Var).getClass();
        k0 k0Var = abstractC0502w.unknownFields;
        k0 k0Var2 = abstractC0502w2.unknownFields;
        if (!k0Var2.equals(k0.f6494f)) {
            int i10 = k0Var.a + k0Var2.a;
            int[] iArrCopyOf = Arrays.copyOf(k0Var.f6495b, i10);
            System.arraycopy(k0Var2.f6495b, 0, iArrCopyOf, k0Var.a, k0Var2.a);
            Object[] objArrCopyOf = Arrays.copyOf(k0Var.f6496c, i10);
            System.arraycopy(k0Var2.f6496c, 0, objArrCopyOf, k0Var.a, k0Var2.a);
            k0Var = new k0(i10, iArrCopyOf, objArrCopyOf, true);
        }
        abstractC0502w.unknownFields = k0Var;
    }

    public static boolean y(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static void z(int i10, List list, I i11, boolean z6) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0491k c0491k = (C0491k) i11.a;
        int i12 = 0;
        if (!z6) {
            while (i12 < list.size()) {
                c0491k.F(i10, ((Boolean) list.get(i12)).booleanValue());
                i12++;
            }
            return;
        }
        c0491k.R(i10, 2);
        int i13 = 0;
        for (int i14 = 0; i14 < list.size(); i14++) {
            ((Boolean) list.get(i14)).getClass();
            Logger logger = C0491k.f6487h;
            i13++;
        }
        c0491k.T(i13);
        while (i12 < list.size()) {
            c0491k.D(((Boolean) list.get(i12)).booleanValue() ? (byte) 1 : (byte) 0);
            i12++;
        }
    }

    public static Object v(int i10, List list, Object obj, j0 j0Var) {
        return obj;
    }
}
