package p086i8;

import J7.a;
import K9.e;
import K9.l;
import K9.p;
import com.bumptech.glide.c;
import com.bumptech.glide.d;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import p200u8.b;

/* JADX INFO: loaded from: classes.dex */
public abstract class i extends c {
    public static String A(Object[] objArr, String str, String str2, b bVar, int i10) {
        CharSequence charSequence = (i10 & 1) != 0 ? ", " : "";
        String str3 = (i10 & 2) != 0 ? "" : str;
        String str4 = (i10 & 4) != 0 ? "" : str2;
        if ((i10 & 32) != 0) {
            bVar = null;
        }
        StringBuilder sb = new StringBuilder();
        z(objArr, sb, charSequence, str3, str4, "...", bVar);
        String string = sb.toString();
        p210v8.i.e(string, "toString(...)");
        return string;
    }

    public static Object B(Object[] objArr) {
        p210v8.i.f(objArr, "<this>");
        if (objArr.length != 0) {
            return objArr[objArr.length - 1];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    public static Object C(Object[] objArr) {
        int length = objArr.length;
        if (length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        if (length == 1) {
            return objArr[0];
        }
        throw new IllegalArgumentException("Array has more than one element.");
    }

    public static final void D(Object[] objArr, LinkedHashSet linkedHashSet) {
        p210v8.i.f(objArr, "<this>");
        for (Object obj : objArr) {
            linkedHashSet.add(obj);
        }
    }

    public static List E(float[] fArr) {
        p210v8.i.f(fArr, "<this>");
        int length = fArr.length;
        if (length == 0) {
            return s.f12328s;
        }
        if (length == 1) {
            return d.u(Float.valueOf(fArr[0]));
        }
        ArrayList arrayList = new ArrayList(fArr.length);
        for (float f10 : fArr) {
            arrayList.add(Float.valueOf(f10));
        }
        return arrayList;
    }

    public static List F(int[] iArr) {
        p210v8.i.f(iArr, "<this>");
        int length = iArr.length;
        if (length != 0) {
            return length != 1 ? J(iArr) : d.u(Integer.valueOf(iArr[0]));
        }
        return s.f12328s;
    }

    public static List G(long[] jArr) {
        p210v8.i.f(jArr, "<this>");
        int length = jArr.length;
        if (length == 0) {
            return s.f12328s;
        }
        if (length == 1) {
            return d.u(Long.valueOf(jArr[0]));
        }
        ArrayList arrayList = new ArrayList(jArr.length);
        for (long j : jArr) {
            arrayList.add(Long.valueOf(j));
        }
        return arrayList;
    }

    public static List H(Object[] objArr) {
        p210v8.i.f(objArr, "<this>");
        int length = objArr.length;
        if (length != 0) {
            return length != 1 ? new ArrayList(new g(objArr, false)) : d.u(objArr[0]);
        }
        return s.f12328s;
    }

    public static List I(boolean[] zArr) {
        p210v8.i.f(zArr, "<this>");
        int length = zArr.length;
        if (length == 0) {
            return s.f12328s;
        }
        if (length == 1) {
            return d.u(Boolean.valueOf(zArr[0]));
        }
        ArrayList arrayList = new ArrayList(zArr.length);
        for (boolean z6 : zArr) {
            arrayList.add(Boolean.valueOf(z6));
        }
        return arrayList;
    }

    public static ArrayList J(int[] iArr) {
        p210v8.i.f(iArr, "<this>");
        ArrayList arrayList = new ArrayList(iArr.length);
        for (int i10 : iArr) {
            arrayList.add(Integer.valueOf(i10));
        }
        return arrayList;
    }

    public static Set K(Object[] objArr) {
        p210v8.i.f(objArr, "<this>");
        int length = objArr.length;
        if (length == 0) {
            return u.f12330s;
        }
        if (length == 1) {
            return C.w(objArr[0]);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(z.s(objArr.length));
        D(objArr, linkedHashSet);
        return linkedHashSet;
    }

    public static List l(Object[] objArr) {
        p210v8.i.f(objArr, "<this>");
        List listAsList = Arrays.asList(objArr);
        p210v8.i.e(listAsList, "asList(...)");
        return listAsList;
    }

    public static l m(Object[] objArr) {
        return objArr.length == 0 ? e.a : new p(objArr, 1);
    }

    public static boolean n(Object obj, Object[] objArr) {
        p210v8.i.f(objArr, "<this>");
        return y(obj, objArr) >= 0;
    }

    public static void o(int i10, int i11, int i12, byte[] bArr, byte[] bArr2) {
        p210v8.i.f(bArr, "<this>");
        p210v8.i.f(bArr2, "destination");
        System.arraycopy(bArr, i11, bArr2, i10, i12 - i11);
    }

    public static void p(int i10, int i11, int i12, int[] iArr, int[] iArr2) {
        p210v8.i.f(iArr, "<this>");
        p210v8.i.f(iArr2, "destination");
        System.arraycopy(iArr, i11, iArr2, i10, i12 - i11);
    }

    public static void q(Object[] objArr, Object[] objArr2, int i10, int i11, int i12) {
        p210v8.i.f(objArr, "<this>");
        p210v8.i.f(objArr2, "destination");
        System.arraycopy(objArr, i11, objArr2, i10, i12 - i11);
    }

    public static /* synthetic */ void r(Object[] objArr, Object[] objArr2, int i10, int i11, int i12) {
        if ((i12 & 4) != 0) {
            i10 = 0;
        }
        q(objArr, objArr2, 0, i10, i11);
    }

    public static Object[] s(int i10, int i11, Object[] objArr) {
        p210v8.i.f(objArr, "<this>");
        c.d(i11, objArr.length);
        Object[] objArrCopyOfRange = Arrays.copyOfRange(objArr, i10, i11);
        p210v8.i.e(objArrCopyOfRange, "copyOfRange(...)");
        return objArrCopyOfRange;
    }

    public static void t(int i10, int i11, Object[] objArr) {
        p210v8.i.f(objArr, "<this>");
        Arrays.fill(objArr, i10, i11, (Object) null);
    }

    public static ArrayList u(Object[] objArr) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : objArr) {
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static Object v(Object[] objArr) {
        p210v8.i.f(objArr, "<this>");
        if (objArr.length != 0) {
            return objArr[0];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    public static Object w(Object[] objArr) {
        p210v8.i.f(objArr, "<this>");
        if (objArr.length == 0) {
            return null;
        }
        return objArr[0];
    }

    public static Integer x(int[] iArr, int i10) {
        p210v8.i.f(iArr, "<this>");
        if (i10 < 0 || i10 > iArr.length - 1) {
            return null;
        }
        return Integer.valueOf(iArr[i10]);
    }

    public static int y(Object obj, Object[] objArr) {
        p210v8.i.f(objArr, "<this>");
        int i10 = 0;
        if (obj == null) {
            int length = objArr.length;
            while (i10 < length) {
                if (objArr[i10] == null) {
                    return i10;
                }
                i10++;
            }
            return -1;
        }
        int length2 = objArr.length;
        while (i10 < length2) {
            if (obj.equals(objArr[i10])) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    public static final void z(Object[] objArr, StringBuilder sb, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, CharSequence charSequence4, b bVar) {
        p210v8.i.f(objArr, "<this>");
        sb.append(charSequence2);
        int i10 = 0;
        for (Object obj : objArr) {
            i10++;
            if (i10 > 1) {
                sb.append(charSequence);
            }
            a.a(sb, obj, bVar);
        }
        sb.append(charSequence3);
    }
}
