package C3;

import A1.q;
import G8.e;
import L9.n;
import N9.AbstractC0317a;
import N9.C0324g;
import P2.f;
import X9.F;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import androidx.lifecycle.Q;
import com.onesignal.inAppMessages.internal.display.impl.k;
import java.lang.reflect.InvocationTargetException;
import java.net.IDN;
import java.net.InetAddress;
import java.net.ProtocolException;
import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import kotlin.TypeCastException;
import o1.o;
import p047e9.C0632y;
import p047e9.G;
import p047e9.Z;
import p067g9.g;
import p076h8.m;
import p182s4.C0779p;
import p210v8.i;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    public static final Object a(f fVar, C0779p c0779p) throws Exception {
        if (!fVar.j()) {
            C0324g c0324g = new C0324g(1, qa.b.q(c0779p));
            c0324g.w();
            fVar.m(W9.a.f5369s, new W9.b(c0324g));
            return c0324g.v();
        }
        Exception excF = fVar.f();
        if (excF != null) {
            throw excF;
        }
        if (!fVar.f3856d) {
            return fVar.g();
        }
        throw new CancellationException("Task " + fVar + " was cancelled normally.");
    }

    public static void b(e eVar, Object[] objArr) {
        i.f(objArr, "args");
        if (b.o(eVar) == objArr.length) {
            return;
        }
        StringBuilder sb = new StringBuilder("Callable expects ");
        sb.append(b.o(eVar));
        sb.append(" arguments, but ");
        throw new IllegalArgumentException(E0.a.j(sb, objArr.length, " were provided."));
    }

    public static void c(Object obj, Object obj2) {
        if (obj == null) {
            throw new NullPointerException("null key in entry: null=" + obj2);
        }
        if (obj2 != null) {
            return;
        }
        throw new NullPointerException("null value in entry: " + obj + "=null");
    }

    public static int d(Comparable comparable, Comparable comparable2) {
        if (comparable == comparable2) {
            return 0;
        }
        if (comparable == null) {
            return -1;
        }
        if (comparable2 == null) {
            return 1;
        }
        return comparable.compareTo(comparable2);
    }

    public static Q e(Class cls) throws InvocationTargetException {
        try {
            Object objNewInstance = cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            i.e(objNewInstance, "{\n            modelClass…).newInstance()\n        }");
            return (Q) objNewInstance;
        } catch (IllegalAccessException e10) {
            throw new RuntimeException("Cannot create an instance of " + cls, e10);
        } catch (InstantiationException e11) {
            throw new RuntimeException("Cannot create an instance of " + cls, e11);
        } catch (NoSuchMethodException e12) {
            throw new RuntimeException("Cannot create an instance of " + cls, e12);
        }
    }

    /* JADX WARN: Code duplicated, block: B:55:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:58:0x00ad A[LOOP:1: B:54:0x00a0->B:58:0x00ad, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:80:0x00b3 A[EDGE_INSN: B:80:0x00b3->B:59:0x00b3 BREAK  A[LOOP:1: B:54:0x00a0->B:58:0x00ad], SYNTHETIC] */
    public static final InetAddress f(int i10, String str, int i11) {
        int i12;
        int i13;
        int iR;
        byte[] bArr = new byte[16];
        int i14 = i10;
        int i15 = 0;
        int i16 = -1;
        int i17 = -1;
        while (i14 < i11) {
            if (i15 == 16) {
                return null;
            }
            int i18 = i14 + 2;
            if (i18 <= i11 && n.H(str, i14, "::", false)) {
                if (i16 != -1) {
                    return null;
                }
                i15 += 2;
                i16 = i15;
                if (i18 == i11) {
                    break;
                }
                i17 = i18;
                i12 = 0;
                i14 = i17;
                while (i14 < i11) {
                    iR = Y9.c.r(str.charAt(i14));
                    if (iR == -1) {
                        break;
                        break;
                    }
                    i12 = (i12 << 4) + iR;
                    i14++;
                }
                i13 = i14 - i17;
                return i13 == 0 ? null : null;
            }
            if (i15 != 0) {
                if (!n.H(str, i14, ":", false)) {
                    if (!n.H(str, i14, ".", false)) {
                        return null;
                    }
                    int i19 = i15 - 2;
                    int i20 = i19;
                    while (i17 < i11) {
                        if (i20 == 16) {
                            return null;
                        }
                        if (i20 != i19) {
                            if (str.charAt(i17) != '.') {
                                return null;
                            }
                            i17++;
                        }
                        int i21 = 0;
                        int i22 = i17;
                        while (i22 < i11) {
                            char cCharAt = str.charAt(i22);
                            if (i.h(cCharAt, 48) < 0 || i.h(cCharAt, 57) > 0) {
                                break;
                            }
                            if ((i21 == 0 && i17 != i22) || (i21 = ((i21 * 10) + cCharAt) - 48) > 255) {
                                return null;
                            }
                            i22++;
                        }
                        if (i22 - i17 == 0) {
                            return null;
                        }
                        bArr[i20] = (byte) i21;
                        i20++;
                        i17 = i22;
                    }
                    if (i20 != i15 + 2) {
                        return null;
                    }
                    i15 += 2;
                    break;
                }
                i14++;
            }
            i17 = i14;
            i12 = 0;
            i14 = i17;
            while (i14 < i11) {
                iR = Y9.c.r(str.charAt(i14));
                if (iR == -1) {
                    break;
                }
                i12 = (i12 << 4) + iR;
                i14++;
            }
            i13 = i14 - i17;
            if (i13 == 0 && i13 <= 4) {
                int i23 = i15 + 1;
                bArr[i15] = (byte) (255 & (i12 >>> 8));
                i15 += 2;
                bArr[i23] = (byte) (i12 & 255);
            }
        }
        if (i15 != 16) {
            if (i16 == -1) {
                return null;
            }
            int i24 = i15 - i16;
            System.arraycopy(bArr, i16, bArr, 16 - i24, i24);
            Arrays.fill(bArr, i16, (16 - i15) + i16, (byte) 0);
        }
        return InetAddress.getByAddress(bArr);
    }

    public static final o1.i g(o oVar) {
        i.f(oVar, "<this>");
        return new o1.i(oVar.a, oVar.f13663t);
    }

    public static String h(long j) {
        if (j < 0) {
            j = 0;
        }
        DecimalFormat decimalFormat = new DecimalFormat("####.00");
        if (j < 1024) {
            return j + " bytes";
        }
        if (j < 1048576) {
            return decimalFormat.format(Float.valueOf(j / 1024.0f)) + " KB";
        }
        if (j < 1073741824) {
            return decimalFormat.format(Float.valueOf((j / 1024.0f) / 1024.0f)) + " MB";
        }
        return decimalFormat.format(Float.valueOf(((j / 1024.0f) / 1024.0f) / 1024.0f)) + " GB";
    }

    public static boolean i(Uri uri) {
        return uri != null && "content".equals(uri.getScheme()) && "media".equals(uri.getAuthority());
    }

    public static final boolean j(Context context) {
        Boolean boolValueOf;
        i.g(context, "$this$isNetworkAvailable");
        Object systemService = context.getSystemService("connectivity");
        if (systemService == null) {
            throw new TypeCastException("null cannot be cast to non-null type android.net.ConnectivityManager");
        }
        ConnectivityManager connectivityManager = (ConnectivityManager) systemService;
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        boolean z6 = false;
        boolean z10 = activeNetworkInfo != null && activeNetworkInfo.isConnected();
        if (z10) {
            return z10;
        }
        NetworkInfo[] allNetworkInfo = connectivityManager.getAllNetworkInfo();
        if (allNetworkInfo != null) {
            for (NetworkInfo networkInfo : allNetworkInfo) {
                i.b(networkInfo, "it");
                if (networkInfo.isConnected()) {
                    z6 = true;
                    break;
                }
            }
            boolValueOf = Boolean.valueOf(z6);
        } else {
            boolValueOf = null;
        }
        return boolValueOf.booleanValue();
    }

    public static final p047e9.Q k(p047e9.Q q10, g gVar) {
        i.f(q10, "<this>");
        int i10 = q10.f10883u;
        if ((i10 & 256) == 256) {
            return q10.f10875E;
        }
        if ((i10 & 512) == 512) {
            return gVar.a(q10.f10876F);
        }
        return null;
    }

    public static q l(String str) throws ProtocolException {
        int i10;
        String strSubstring;
        i.f(str, "statusLine");
        boolean zI = n.I(str, "HTTP/1.", false);
        F f10 = F.HTTP_1_0;
        if (zI) {
            i10 = 9;
            if (str.length() < 9 || str.charAt(8) != ' ') {
                throw new ProtocolException(i.k(str, "Unexpected status line: "));
            }
            int iCharAt = str.charAt(7) - '0';
            if (iCharAt != 0) {
                if (iCharAt != 1) {
                    throw new ProtocolException(i.k(str, "Unexpected status line: "));
                }
                f10 = F.HTTP_1_1;
            }
        } else {
            if (!n.I(str, "ICY ", false)) {
                throw new ProtocolException(i.k(str, "Unexpected status line: "));
            }
            i10 = 4;
        }
        int i11 = i10 + 3;
        if (str.length() < i11) {
            throw new ProtocolException(i.k(str, "Unexpected status line: "));
        }
        try {
            String strSubstring2 = str.substring(i10, i11);
            i.e(strSubstring2, "this as java.lang.String…ing(startIndex, endIndex)");
            int i12 = Integer.parseInt(strSubstring2);
            if (str.length() <= i11) {
                strSubstring = "";
            } else {
                if (str.charAt(i11) != ' ') {
                    throw new ProtocolException(i.k(str, "Unexpected status line: "));
                }
                strSubstring = str.substring(i10 + 4);
                i.e(strSubstring, "this as java.lang.String).substring(startIndex)");
            }
            return new q(f10, i12, strSubstring);
        } catch (NumberFormatException unused) {
            throw new ProtocolException(i.k(str, "Unexpected status line: "));
        }
    }

    public static final p047e9.Q m(C0632y c0632y, g gVar) {
        i.f(c0632y, "<this>");
        i.f(gVar, "typeTable");
        int i10 = c0632y.f11244u;
        if ((i10 & 32) == 32) {
            return c0632y.f11232B;
        }
        if ((i10 & 64) == 64) {
            return gVar.a(c0632y.f11233C);
        }
        return null;
    }

    public static final p047e9.Q n(C0632y c0632y, g gVar) {
        i.f(c0632y, "<this>");
        i.f(gVar, "typeTable");
        int i10 = c0632y.f11244u;
        if ((i10 & 8) == 8) {
            p047e9.Q q10 = c0632y.f11248y;
            i.e(q10, "returnType");
            return q10;
        }
        if ((i10 & 16) == 16) {
            return gVar.a(c0632y.f11249z);
        }
        throw new IllegalStateException("No returnType in ProtoBuf.Function");
    }

    public static final p047e9.Q o(G g8, g gVar) {
        i.f(g8, "<this>");
        i.f(gVar, "typeTable");
        int i10 = g8.f10799u;
        if ((i10 & 8) == 8) {
            p047e9.Q q10 = g8.f10803y;
            i.e(q10, "returnType");
            return q10;
        }
        if ((i10 & 16) == 16) {
            return gVar.a(g8.f10804z);
        }
        throw new IllegalStateException("No returnType in ProtoBuf.Property");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void p(p200u8.c cVar, AbstractC0317a abstractC0317a, AbstractC0317a abstractC0317a2) {
        try {
            S9.a.g(m.a, qa.b.q(((p144o8.a) cVar).create(abstractC0317a, abstractC0317a2)));
        } catch (Throwable th) {
            abstractC0317a2.resumeWith(J7.a.d(th));
            throw th;
        }
    }

    public static final String q(String str) {
        i.f(str, "<this>");
        int i10 = 0;
        int i11 = -1;
        if (!L9.f.J(str, ":", false)) {
            try {
                String ascii = IDN.toASCII(str);
                i.e(ascii, "toASCII(host)");
                Locale locale = Locale.US;
                i.e(locale, "US");
                String lowerCase = ascii.toLowerCase(locale);
                i.e(lowerCase, "this as java.lang.String).toLowerCase(locale)");
                if (lowerCase.length() == 0) {
                    return null;
                }
                int length = lowerCase.length();
                int i12 = 0;
                while (i12 < length) {
                    int i13 = i12 + 1;
                    char cCharAt = lowerCase.charAt(i12);
                    if (i.h(cCharAt, 31) <= 0 || i.h(cCharAt, 127) >= 0 || L9.f.O(" #%/:?@[\\]", cCharAt, 0, 6) != -1) {
                        return null;
                    }
                    i12 = i13;
                }
                return lowerCase;
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }
        InetAddress inetAddressF = (n.I(str, "[", false) && n.B(str, "]")) ? f(1, str, str.length() - 1) : f(0, str, str.length());
        if (inetAddressF == null) {
            return null;
        }
        byte[] address = inetAddressF.getAddress();
        if (address.length != 16) {
            if (address.length == 4) {
                return inetAddressF.getHostAddress();
            }
            throw new AssertionError("Invalid IPv6 address: '" + str + '\'');
        }
        int i14 = 0;
        int i15 = 0;
        while (i14 < address.length) {
            int i16 = i14;
            while (i16 < 16 && address[i16] == 0 && address[i16 + 1] == 0) {
                i16 += 2;
            }
            int i17 = i16 - i14;
            if (i17 > i15 && i17 >= 4) {
                i11 = i14;
                i15 = i17;
            }
            i14 = i16 + 2;
        }
        ma.f fVar = new ma.f();
        while (i10 < address.length) {
            if (i10 == i11) {
                fVar.d0(58);
                i10 += i15;
                if (i10 == 16) {
                    fVar.d0(58);
                }
            } else {
                if (i10 > 0) {
                    fVar.d0(58);
                }
                byte b3 = address[i10];
                byte[] bArr = Y9.c.a;
                fVar.f0(((b3 & 255) << 8) | (address[i10 + 1] & 255));
                i10 += 2;
            }
        }
        return fVar.J();
    }

    public static final p047e9.Q r(Z z6, g gVar) {
        i.f(gVar, "typeTable");
        int i10 = z6.f10960u;
        if ((i10 & 4) == 4) {
            p047e9.Q q10 = z6.f10963x;
            i.e(q10, k.EVENT_TYPE_KEY);
            return q10;
        }
        if ((i10 & 8) == 8) {
            return gVar.a(z6.f10964y);
        }
        throw new IllegalStateException("No type in ProtoBuf.ValueParameter");
    }
}
