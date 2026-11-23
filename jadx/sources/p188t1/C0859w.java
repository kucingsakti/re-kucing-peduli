package p188t1;

import E4.B;
import android.content.pm.ApplicationInfo;
import com.kcstream.cing.MainApp;
import dalvik.system.DexFile;
import java.io.BufferedReader;
import java.io.IOException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import p086i8.C;
import p204v1.d;
import p204v1.e;
import p204v1.j;

/* JADX INFO: renamed from: t1.w, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0859w extends AbstractC0862z {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static final byte[] f15102A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public static final byte[] f15103B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public static final byte[] f15104C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public static final byte[] f15105D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public static final byte[] f15106E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public static final byte[] f15107F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public static final byte[] f15108G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public static final byte[] f15109H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public static final byte[] f15110I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public static final byte[] f15111J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public static final byte[] f15112K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public static final byte[] f15113L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public static final byte[] f15114M;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final byte[] f15115i;
    public static final byte[] j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final byte[] f15116k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final byte[] f15117l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final byte[] f15118m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final byte[] f15119n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final byte[] f15120o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final byte[] f15121p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final byte[] f15122q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final byte[] f15123r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final byte[] f15124s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final byte[] f15125t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final byte[] f15126u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final byte[] f15127v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final byte[] f15128w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final byte[] f15129x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final byte[] f15130y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final byte[] f15131z;

    static {
        C.a(C.c("036AB1CA01D6D1A6857C3B1A9A4E71"));
        C.a(C.c("0467A0CC09F1F6AF87650A0CB44F7E27E2C7AACA52C4213155E3A1313BCC3771056FBBDB13"));
        C.a(C.c("036AB1CA01CBC4B38F610A259E597C3BC7DA"));
        C.a(C.c("036AB1CA01C3D7A68B721807894667"));
        C.a(C.c("09718CD905F6C0A3B0721D1B92427A15D5C8A7EC52D43E18"));
        C.a(C.c("4F71ADDA1EE0C8E880650E059E5A7B26C88696F05CC5371978F0AC3038E077560170"));
        C.a(C.c("036EBBDA0FD6D1B5837602"));
        C.a(C.c("156CB9C819EEF6B3947E010F"));
        f15115i = new byte[]{-41, 9, -18, 78, -123, 19, 114, -84, -61, 106, 51, -76, 124, -95, -106, -58, 119, -28, -114, -98, -58, -91, -118, 116, -92, -54, -66, 72, -115, 27, 71, -94};
        j = new byte[]{-125, 123, -101, 11};
        f15116k = new byte[]{-79, 72, -126, 29, -32};
        f15117l = new byte[]{-77, 108, -64, 60, -22, 113, 4, -126, -94, 4, 87, -58, 19, -56, -14, -24, 15, -108, -31, -19, -93, -63, -92, 29, -54, -71, -54, 41, -31, 119, 34, -48};
        f15118m = new byte[]{-76, 102, -125, 96, -10, 114, 7, -34, -86, 1, 29, -57, 9, -61, -27, -78, 5, -123, -6, -5};
        f15119n = new byte[]{-76, 102, -125, 96, -28, 125, 22, -34, -84, 3, 87, -102, 21, -49, -30, -93, 5, -118, -17, -14, -24, -54, -7, 90, -2, -77, -39, 39, -7, 126, 14, -52, -66, 125};
        f15120o = new byte[]{-76, 102, -125, 96, -10, 114, 7, -34, -86, 1, 29, -57, 9, -61, -27, -78, 5, -123, -6, -5, -24, -24, -39, 80, -106};
        f15121p = new byte[]{-66, 103, -104, 33, -18, 118, 22};
        f15122q = new byte[]{-77, 108, -64, 60, -22, 113, 4, -126, -94, 4, 87, -58, 19, -56, -14, -24, 15, -108, -31, -19, -93, -63, -92, 44, -44, -91, -51, 45, -23, 89, 53, -53, -77, 110, -117};
        f15123r = new byte[]{-70, 104, -121, 32};
        f15124s = new byte[]{-65, 104, -128, 42, -23, 118, 58, -61, -84, 1, 86, -48, 49, -60, -30, -82, 24, -128};
        f15125t = new byte[]{-113, 121, -127, 61, -32, 119, 48, -34, -86, 14, 84, -47, 82, -53, -9, -76};
        f15126u = new byte[]{-74};
        f15127v = new byte[]{-75};
        f15128w = new byte[]{-76};
        f15129x = new byte[]{-77};
        f15130y = new byte[]{-78};
        f15131z = new byte[]{-79};
        f15102A = new byte[]{-80};
        f15103B = new byte[]{-65};
        f15104C = new byte[]{-66};
        f15105D = new byte[]{-67};
        f15106E = new byte[]{-69};
        f15107F = new byte[]{-89, 107, -123, 42, -29, 33};
        f15108G = new byte[]{-83};
        f15109H = new byte[]{-82};
        f15110I = new byte[]{-81};
        f15111J = new byte[]{-92, 125, -113, 60, -15};
        f15112K = new byte[]{-92, 125, -127, 62};
        f15113L = new byte[]{-70};
        f15114M = new byte[]{-71};
    }

    public static HashSet o(ApplicationInfo applicationInfo) {
        HashSet hashSet = new HashSet();
        try {
            DexFile dexFile = new DexFile(applicationInfo.sourceDir);
            Enumeration<String> enumerationEntries = dexFile.entries();
            while (enumerationEntries.hasMoreElements()) {
                hashSet.add(enumerationEntries.nextElement());
            }
            dexFile.close();
            return hashSet;
        } catch (IOException e10) {
            C.a(C.c("036AB1CA01CBC4B38F610A259E597C3BC7DA"));
            if (e10.getMessage() != null) {
                e10.getMessage();
            }
            return hashSet;
        }
    }

    public static void p(BufferedReader bufferedReader) {
        if (bufferedReader != null) {
            try {
                bufferedReader.close();
            } catch (IOException e10) {
                C.a(C.c("036EBBDA0FD6D1B5837602"));
                if (e10.getMessage() == null) {
                    return;
                }
                e10.getMessage();
            }
        }
    }

    @Override // p188t1.Q
    public final void a(MainApp mainApp) {
        s(mainApp);
    }

    @Override // p188t1.Q
    public final boolean c() {
        return false;
    }

    public final String n(byte[] bArr) {
        byte[] bArr2 = new byte[bArr.length];
        for (int i10 = 0; i10 < bArr.length; i10++) {
            byte b3 = bArr[i10];
            byte[] bArr3 = f15115i;
            bArr2[i10] = (byte) (b3 ^ bArr3[i10 % bArr3.length]);
        }
        return new String(bArr2, StandardCharsets.UTF_8);
    }

    public final byte[] q(HashSet hashSet) {
        List listAsList = Arrays.asList(n(f15126u), n(f15107F), n(f15128w), n(f15127v), n(f15130y), n(f15129x), n(f15131z), n(f15102A), n(f15103B), n(f15104C), n(f15105D), n(f15106E), n(f15108G), n(f15109H), n(f15110I), n(f15111J), n(f15112K), n(f15113L), n(f15114M));
        Iterator it = hashSet.iterator();
        byte[] bArr = f15116k;
        while (it.hasNext()) {
            String str = (String) it.next();
            if (str.startsWith(C.a(C.c("036DB9870BEDC0A6827E1B0D98036035CFDAABE36CC5371E4FF0AC2026")))) {
                try {
                    Class<?> cls = Class.forName(str);
                    for (Method method : cls.getDeclaredMethods()) {
                        if (!listAsList.contains(method.getName()) && Modifier.isNative(method.getModifiers())) {
                            l(C.a(C.c("036AB1CA01CBC4B38F610A259E597C3BC7DA")), C.a(C.c("2E63A0C01CE085A193790C1C92427A74C5C6BBEE578C72")) + cls.getCanonicalName() + C.a(C.c("4D3C")) + method.getName());
                            bArr = j;
                        }
                    }
                } catch (ClassNotFoundException | NoClassDefFoundError e10) {
                    e10.getMessage();
                    C.a(C.c("036AB1CA01CBC4B38F610A259E597C3BC7DA"));
                    e10.getMessage();
                }
            }
        }
        return bArr;
    }

    public final byte[] r(HashSet hashSet) {
        String strN = n(f15118m);
        String strN2 = n(f15125t);
        Iterator it = hashSet.iterator();
        byte[] bArr = f15116k;
        while (it.hasNext()) {
            String str = (String) it.next();
            boolean zContains = str.contains(strN);
            byte[] bArr2 = j;
            if (zContains) {
                l(C.a(C.c("0467A0CC09F1F6AF87650A0CB44F7E27E2C7AACA52C4213155E3A1313BCC3771056FBBDB13")), C.a(C.c("3377B6DA1EF7C4B383371C009A5F713083C6ACEA56D5265D5CEDB03A3BBF79")).concat(str));
                bArr = bArr2;
            }
            if (str.contains(strN2)) {
                l(C.a(C.c("0467A0CC09F1F6AF87650A0CB44F7E27E2C7AACA52C4213155E3A1313BCC3771056FBBDB13")), C.a(C.c("3872BBDA0FE1858DA7454F")).concat(str));
                bArr = bArr2;
            }
        }
        return bArr;
    }

    public final void s(MainApp mainApp) {
        F fB = d.b(new B(this, 15, mainApp));
        j jVar = this.f15139h;
        d.f(jVar.f15407c, 8);
        e eVar = jVar.f15406b;
        eVar.getClass();
        this.f15138g.j(EnumC0840c.f15015A, fB.a());
        e(C.a(C.c("086DBBC219")), fB);
        if (fB.b()) {
            String strA = C.a(C.c("086DBBC219"));
            eVar.getClass();
            c(null, strA);
        }
        if (fB.a()) {
            eVar.getClass();
            jVar.b(C.a(C.c("086DBBC219")));
        }
    }
}
