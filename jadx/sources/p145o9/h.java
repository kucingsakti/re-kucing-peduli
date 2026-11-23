package p145o9;

import I8.k;
import O8.C;
import com.bumptech.glide.d;
import e2.b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p086i8.s;
import p210v8.i;

/* JADX INFO: loaded from: classes.dex */
public final class h {
    public static final h a = new h();

    public final b a(List list, C c10, k kVar) {
        List listS0 = p086i8.k.s0(list);
        ArrayList arrayList = new ArrayList();
        Iterator it = listS0.iterator();
        while (it.hasNext()) {
            g gVarB = b(null, it.next());
            if (gVarB != null) {
                arrayList.add(gVarB);
            }
        }
        return c10 != null ? new w(arrayList, c10.f3622v.q(kVar)) : new b(arrayList, new b(kVar, 6));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [i8.s] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v10, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v11, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v12, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v9, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r6v0, types: [o9.h] */
    public final g b(C c10, Object obj) {
        if (obj instanceof Byte) {
            return new d(((Number) obj).byteValue());
        }
        if (obj instanceof Short) {
            return new u(((Number) obj).shortValue());
        }
        if (obj instanceof Integer) {
            return new k(((Number) obj).intValue());
        }
        if (obj instanceof Long) {
            return new s(((Number) obj).longValue());
        }
        if (obj instanceof Character) {
            Character ch = (Character) obj;
            ch.getClass();
            return new e(ch);
        }
        if (obj instanceof Float) {
            return new c(((Number) obj).floatValue());
        }
        if (obj instanceof Double) {
            return new c(((Number) obj).doubleValue());
        }
        if (obj instanceof Boolean) {
            Boolean bool = (Boolean) obj;
            bool.getClass();
            return new c(bool);
        }
        if (obj instanceof String) {
            String str = (String) obj;
            i.f(str, "value");
            return new v(str);
        }
        boolean z6 = obj instanceof byte[];
        ?? U6 = s.f12328s;
        int i10 = 0;
        if (z6) {
            byte[] bArr = (byte[]) obj;
            i.f(bArr, "<this>");
            int length = bArr.length;
            if (length != 0) {
                if (length != 1) {
                    U6 = new ArrayList(bArr.length);
                    int length2 = bArr.length;
                    while (i10 < length2) {
                        U6.add(Byte.valueOf(bArr[i10]));
                        i10++;
                    }
                } else {
                    U6 = d.u(Byte.valueOf(bArr[0]));
                }
            }
            return a(U6, c10, k.BYTE);
        }
        if (obj instanceof short[]) {
            short[] sArr = (short[]) obj;
            i.f(sArr, "<this>");
            int length3 = sArr.length;
            if (length3 != 0) {
                if (length3 != 1) {
                    U6 = new ArrayList(sArr.length);
                    int length4 = sArr.length;
                    while (i10 < length4) {
                        U6.add(Short.valueOf(sArr[i10]));
                        i10++;
                    }
                } else {
                    U6 = d.u(Short.valueOf(sArr[0]));
                }
            }
            return a(U6, c10, k.SHORT);
        }
        if (obj instanceof int[]) {
            return a(p086i8.i.F((int[]) obj), c10, k.INT);
        }
        if (obj instanceof long[]) {
            return a(p086i8.i.G((long[]) obj), c10, k.LONG);
        }
        if (obj instanceof char[]) {
            char[] cArr = (char[]) obj;
            i.f(cArr, "<this>");
            int length5 = cArr.length;
            if (length5 != 0) {
                if (length5 != 1) {
                    U6 = new ArrayList(cArr.length);
                    int length6 = cArr.length;
                    while (i10 < length6) {
                        U6.add(Character.valueOf(cArr[i10]));
                        i10++;
                    }
                } else {
                    U6 = d.u(Character.valueOf(cArr[0]));
                }
            }
            return a(U6, c10, k.CHAR);
        }
        if (obj instanceof float[]) {
            return a(p086i8.i.E((float[]) obj), c10, k.FLOAT);
        }
        if (!(obj instanceof double[])) {
            if (obj instanceof boolean[]) {
                return a(p086i8.i.I((boolean[]) obj), c10, k.BOOLEAN);
            }
            if (obj == null) {
                return new t(null);
            }
            return null;
        }
        double[] dArr = (double[]) obj;
        i.f(dArr, "<this>");
        int length7 = dArr.length;
        if (length7 != 0) {
            if (length7 != 1) {
                U6 = new ArrayList(dArr.length);
                int length8 = dArr.length;
                while (i10 < length8) {
                    U6.add(Double.valueOf(dArr[i10]));
                    i10++;
                }
            } else {
                U6 = d.u(Double.valueOf(dArr[0]));
            }
        }
        return a(U6, c10, k.DOUBLE);
    }
}
