package Y9;

import L9.e;
import U.Z;
import X9.E;
import X9.L;
import X9.N;
import X9.w;
import X9.y;
import com.unity3d.ads.metadata.MediationMetaData;
import java.io.Closeable;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.Socket;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import ma.f;
import ma.h;
import ma.i;
import ma.p;
import ma.r;
import p086i8.C;
import p086i8.g;
import p086i8.k;
import p086i8.l;
import p210v8.x;
import p230x9.d;

/* JADX INFO: loaded from: classes.dex */
public abstract class c {
    public static final byte[] a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final w f5821b = C.t(new String[0]);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final N f5822c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final p f5823d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final TimeZone f5824e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final e f5825f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f5826g;

    static {
        int i10;
        int i11 = 0;
        byte[] bArr = new byte[0];
        a = bArr;
        f fVar = new f();
        fVar.b0(bArr, 0, 0);
        long j = 0;
        f5822c = new N(null, j, fVar, 0);
        c(j, j, j);
        i iVar = i.f13191v;
        i[] iVarArr = {d.q("efbbbf"), d.q("feff"), d.q("fffe"), d.q("0000ffff"), d.q("ffff0000")};
        ArrayList arrayList = new ArrayList(new g(iVarArr, false));
        if (arrayList.size() > 1) {
            Collections.sort(arrayList);
        }
        ArrayList arrayList2 = new ArrayList(5);
        for (int i12 = 0; i12 < 5; i12++) {
            i iVar2 = iVarArr[i12];
            arrayList2.add(-1);
        }
        Object[] array = arrayList2.toArray(new Integer[0]);
        if (array == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
        }
        Integer[] numArr = (Integer[]) array;
        ArrayList arrayListE = l.E(Arrays.copyOf(numArr, numArr.length));
        int i13 = 0;
        int i14 = 0;
        while (i13 < 5) {
            i iVar3 = iVarArr[i13];
            int i15 = i14 + 1;
            int size = arrayList.size();
            int size2 = arrayList.size();
            if (size < 0) {
                throw new IllegalArgumentException(E0.a.g("fromIndex (0) is greater than toIndex (", size, ")."));
            }
            if (size > size2) {
                throw new IndexOutOfBoundsException("toIndex (" + size + ") is greater than size (" + size2 + ").");
            }
            int i16 = size - 1;
            int i17 = 0;
            while (true) {
                if (i17 > i16) {
                    i10 = -(i17 + 1);
                    break;
                }
                i10 = (i17 + i16) >>> 1;
                int iD = C3.a.d((Comparable) arrayList.get(i10), iVar3);
                if (iD < 0) {
                    i17 = i10 + 1;
                } else if (iD <= 0) {
                    break;
                } else {
                    i16 = i10 - 1;
                }
            }
            arrayListE.set(i10, Integer.valueOf(i14));
            i13++;
            i14 = i15;
        }
        if (((i) arrayList.get(0)).h() <= 0) {
            throw new IllegalArgumentException("the empty byte string is not a supported option");
        }
        int i18 = 0;
        while (i18 < arrayList.size()) {
            i iVar4 = (i) arrayList.get(i18);
            int i19 = i18 + 1;
            int i20 = i19;
            while (i20 < arrayList.size()) {
                i iVar5 = (i) arrayList.get(i20);
                iVar5.getClass();
                p210v8.i.f(iVar4, "prefix");
                if (!iVar5.m(iVar4, iVar4.h())) {
                    break;
                }
                if (iVar5.h() == iVar4.h()) {
                    throw new IllegalArgumentException(p210v8.i.k(iVar5, "duplicate option: ").toString());
                }
                if (((Number) arrayListE.get(i20)).intValue() > ((Number) arrayListE.get(i18)).intValue()) {
                    arrayList.remove(i20);
                    arrayListE.remove(i20);
                } else {
                    i20++;
                }
            }
            i18 = i19;
        }
        f fVar2 = new f();
        p068ga.l.a(0L, fVar2, 0, arrayList, 0, arrayList.size(), arrayListE);
        int[] iArr = new int[(int) (fVar2.f13190t / ((long) 4))];
        while (!fVar2.j()) {
            iArr[i11] = fVar2.E();
            i11++;
        }
        Object[] objArrCopyOf = Arrays.copyOf(iVarArr, 5);
        p210v8.i.e(objArrCopyOf, "java.util.Arrays.copyOf(this, size)");
        f5823d = new p((i[]) objArrCopyOf, iArr);
        TimeZone timeZone = TimeZone.getTimeZone("GMT");
        p210v8.i.c(timeZone);
        f5824e = timeZone;
        f5825f = new e("([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)");
        f5826g = L9.f.X(L9.f.W(E.class.getName(), "okhttp3."), "Client");
    }

    public static final void A(IOException iOException, List list) {
        p210v8.i.f(iOException, "<this>");
        if (list.size() > 1) {
            System.out.println(list);
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C8.E.e(iOException, (Exception) it.next());
        }
    }

    public static final boolean a(y yVar, y yVar2) {
        p210v8.i.f(yVar, "<this>");
        p210v8.i.f(yVar2, "other");
        return p210v8.i.a(yVar.f5658d, yVar2.f5658d) && yVar.f5659e == yVar2.f5659e && p210v8.i.a(yVar.a, yVar2.a);
    }

    public static final int b(long j, TimeUnit timeUnit) {
        if (j < 0) {
            throw new IllegalStateException(p210v8.i.k(" < 0", "timeout").toString());
        }
        if (timeUnit == null) {
            throw new IllegalStateException("unit == null");
        }
        long millis = timeUnit.toMillis(j);
        if (millis > 2147483647L) {
            throw new IllegalArgumentException(p210v8.i.k(" too large.", "timeout").toString());
        }
        if (millis != 0 || j <= 0) {
            return (int) millis;
        }
        throw new IllegalArgumentException(p210v8.i.k(" too small.", "timeout").toString());
    }

    public static final void c(long j, long j10, long j11) {
        if ((j10 | j11) < 0 || j10 > j || j - j10 < j11) {
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    public static final void d(Closeable closeable) {
        p210v8.i.f(closeable, "<this>");
        try {
            closeable.close();
        } catch (RuntimeException e10) {
            throw e10;
        } catch (Exception unused) {
        }
    }

    public static final void e(Socket socket) {
        p210v8.i.f(socket, "<this>");
        try {
            socket.close();
        } catch (AssertionError e10) {
            throw e10;
        } catch (RuntimeException e11) {
            if (!p210v8.i.a(e11.getMessage(), "bio == null")) {
                throw e11;
            }
        } catch (Exception unused) {
        }
    }

    public static final int f(String str, char c10, int i10, int i11) {
        p210v8.i.f(str, "<this>");
        while (i10 < i11) {
            int i12 = i10 + 1;
            if (str.charAt(i10) == c10) {
                return i10;
            }
            i10 = i12;
        }
        return i11;
    }

    public static final int g(String str, int i10, String str2, int i11) {
        p210v8.i.f(str, "<this>");
        while (i10 < i11) {
            int i12 = i10 + 1;
            if (L9.f.K(str2, str.charAt(i10))) {
                return i10;
            }
            i10 = i12;
        }
        return i11;
    }

    public static final boolean h(ma.w wVar) {
        p210v8.i.f(TimeUnit.MILLISECONDS, "timeUnit");
        try {
            return u(wVar, 100);
        } catch (IOException unused) {
            return false;
        }
    }

    public static final String i(String str, Object... objArr) {
        p210v8.i.f(str, "format");
        Locale locale = Locale.US;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        return String.format(locale, str, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
    }

    public static final boolean j(String[] strArr, String[] strArr2, Comparator comparator) {
        p210v8.i.f(strArr, "<this>");
        if (strArr.length != 0 && strArr2 != null && strArr2.length != 0) {
            int length = strArr.length;
            int i10 = 0;
            while (i10 < length) {
                String str = strArr[i10];
                i10++;
                Z zG = x.g(strArr2);
                while (zG.hasNext()) {
                    if (comparator.compare(str, (String) zG.next()) == 0) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static final long k(L l4) {
        String strE = l4.f5536x.e("Content-Length");
        if (strE == null) {
            return -1L;
        }
        try {
            return Long.parseLong(strE);
        } catch (NumberFormatException unused) {
            return -1L;
        }
    }

    public static final List l(Object... objArr) {
        p210v8.i.f(objArr, "elements");
        Object[] objArr2 = (Object[]) objArr.clone();
        List listUnmodifiableList = Collections.unmodifiableList(l.C(Arrays.copyOf(objArr2, objArr2.length)));
        p210v8.i.e(listUnmodifiableList, "unmodifiableList(listOf(*elements.clone()))");
        return listUnmodifiableList;
    }

    public static final int m(String str) {
        int length = str.length();
        int i10 = 0;
        while (i10 < length) {
            int i11 = i10 + 1;
            char cCharAt = str.charAt(i10);
            if (p210v8.i.h(cCharAt, 31) <= 0 || p210v8.i.h(cCharAt, 127) >= 0) {
                return i10;
            }
            i10 = i11;
        }
        return -1;
    }

    public static final int n(int i10, String str, int i11) {
        p210v8.i.f(str, "<this>");
        while (i10 < i11) {
            int i12 = i10 + 1;
            char cCharAt = str.charAt(i10);
            if (cCharAt != '\t' && cCharAt != '\n' && cCharAt != '\f' && cCharAt != '\r' && cCharAt != ' ') {
                return i10;
            }
            i10 = i12;
        }
        return i11;
    }

    public static final int o(int i10, String str, int i11) {
        p210v8.i.f(str, "<this>");
        int i12 = i11 - 1;
        if (i10 <= i12) {
            while (true) {
                int i13 = i12 - 1;
                char cCharAt = str.charAt(i12);
                if (cCharAt != '\t' && cCharAt != '\n' && cCharAt != '\f' && cCharAt != '\r' && cCharAt != ' ') {
                    return i12 + 1;
                }
                if (i12 != i10) {
                    i12 = i13;
                }
            }
        }
        return i10;
    }

    public static final String[] p(String[] strArr, String[] strArr2, Comparator comparator) {
        p210v8.i.f(strArr2, "other");
        ArrayList arrayList = new ArrayList();
        int length = strArr.length;
        int i10 = 0;
        while (i10 < length) {
            String str = strArr[i10];
            i10++;
            int length2 = strArr2.length;
            int i11 = 0;
            while (i11 < length2) {
                String str2 = strArr2[i11];
                i11++;
                if (comparator.compare(str, str2) == 0) {
                    arrayList.add(str);
                    break;
                }
            }
        }
        Object[] array = arrayList.toArray(new String[0]);
        if (array != null) {
            return (String[]) array;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
    }

    public static final boolean q(String str) {
        p210v8.i.f(str, MediationMetaData.KEY_NAME);
        return str.equalsIgnoreCase("Authorization") || str.equalsIgnoreCase("Cookie") || str.equalsIgnoreCase("Proxy-Authorization") || str.equalsIgnoreCase("Set-Cookie");
    }

    public static final int r(char c10) {
        if ('0' <= c10 && c10 < ':') {
            return c10 - '0';
        }
        if ('a' <= c10 && c10 < 'g') {
            return c10 - 'W';
        }
        if ('A' > c10 || c10 >= 'G') {
            return -1;
        }
        return c10 - '7';
    }

    public static final Charset s(h hVar, Charset charset) {
        p210v8.i.f(hVar, "<this>");
        p210v8.i.f(charset, "default");
        int iX = hVar.x(f5823d);
        if (iX == -1) {
            return charset;
        }
        if (iX == 0) {
            Charset charset2 = StandardCharsets.UTF_8;
            p210v8.i.e(charset2, "UTF_8");
            return charset2;
        }
        if (iX == 1) {
            Charset charset3 = StandardCharsets.UTF_16BE;
            p210v8.i.e(charset3, "UTF_16BE");
            return charset3;
        }
        if (iX == 2) {
            Charset charset4 = StandardCharsets.UTF_16LE;
            p210v8.i.e(charset4, "UTF_16LE");
            return charset4;
        }
        if (iX == 3) {
            Charset charset5 = L9.a.a;
            Charset charset6 = L9.a.f2844d;
            if (charset6 != null) {
                return charset6;
            }
            Charset charsetForName = Charset.forName("UTF-32BE");
            p210v8.i.e(charsetForName, "forName(...)");
            L9.a.f2844d = charsetForName;
            return charsetForName;
        }
        if (iX != 4) {
            throw new AssertionError();
        }
        Charset charset7 = L9.a.a;
        Charset charset8 = L9.a.f2843c;
        if (charset8 != null) {
            return charset8;
        }
        Charset charsetForName2 = Charset.forName("UTF-32LE");
        p210v8.i.e(charsetForName2, "forName(...)");
        L9.a.f2843c = charsetForName2;
        return charsetForName2;
    }

    public static final int t(r rVar) {
        p210v8.i.f(rVar, "<this>");
        return (rVar.c() & 255) | ((rVar.c() & 255) << 16) | ((rVar.c() & 255) << 8);
    }

    public static final boolean u(ma.w wVar, int i10) {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        p210v8.i.f(timeUnit, "timeUnit");
        long jNanoTime = System.nanoTime();
        long jC = wVar.e().e() ? wVar.e().c() - jNanoTime : Long.MAX_VALUE;
        wVar.e().d(Math.min(jC, timeUnit.toNanos(i10)) + jNanoTime);
        try {
            f fVar = new f();
            while (wVar.u(fVar, 8192L) != -1) {
                fVar.a();
            }
            if (jC == Long.MAX_VALUE) {
                wVar.e().a();
                return true;
            }
            wVar.e().d(jNanoTime + jC);
            return true;
        } catch (InterruptedIOException unused) {
            if (jC == Long.MAX_VALUE) {
                wVar.e().a();
                return false;
            }
            wVar.e().d(jNanoTime + jC);
            return false;
        } catch (Throwable th) {
            if (jC == Long.MAX_VALUE) {
                wVar.e().a();
            } else {
                wVar.e().d(jNanoTime + jC);
            }
            throw th;
        }
    }

    public static final w v(List list) {
        ArrayList arrayList = new ArrayList(20);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            p048ea.b bVar = (p048ea.b) it.next();
            String strO = bVar.a.o();
            String strO2 = bVar.f11266b.o();
            arrayList.add(strO);
            arrayList.add(L9.f.j0(strO2).toString());
        }
        Object[] array = arrayList.toArray(new String[0]);
        if (array != null) {
            return new w((String[]) array);
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
    }

    public static final String w(y yVar, boolean z6) {
        int i10;
        p210v8.i.f(yVar, "<this>");
        String str = yVar.f5658d;
        if (L9.f.J(str, ":", false)) {
            str = "[" + str + ']';
        }
        int i11 = yVar.f5659e;
        if (!z6) {
            String str2 = yVar.a;
            p210v8.i.f(str2, "scheme");
            if (str2.equals("http")) {
                i10 = 80;
            } else {
                i10 = str2.equals("https") ? 443 : -1;
            }
            if (i11 == i10) {
                return str;
            }
        }
        return str + ':' + i11;
    }

    public static final List x(List list) {
        p210v8.i.f(list, "<this>");
        List listUnmodifiableList = Collections.unmodifiableList(k.t0(list));
        p210v8.i.e(listUnmodifiableList, "unmodifiableList(toMutableList())");
        return listUnmodifiableList;
    }

    public static final int y(int i10, String str) {
        Long lValueOf;
        if (str == null) {
            lValueOf = null;
        } else {
            try {
                lValueOf = Long.valueOf(Long.parseLong(str));
            } catch (NumberFormatException unused) {
                return i10;
            }
        }
        if (lValueOf == null) {
            return i10;
        }
        long jLongValue = lValueOf.longValue();
        if (jLongValue > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        if (jLongValue < 0) {
            return 0;
        }
        return (int) jLongValue;
    }

    public static final String z(int i10, String str, int i11) {
        int iN = n(i10, str, i11);
        String strSubstring = str.substring(iN, o(iN, str, i11));
        p210v8.i.e(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }
}
