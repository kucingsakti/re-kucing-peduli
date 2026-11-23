package p048ea;

import L9.n;
import Y9.c;
import ma.i;
import p230x9.d;

/* JADX INFO: loaded from: classes.dex */
public abstract class f {
    public static final i a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String[] f11282b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String[] f11283c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String[] f11284d;

    static {
        int i10 = 0;
        i iVar = i.f13191v;
        a = d.r("PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n");
        f11282b = new String[]{"DATA", "HEADERS", "PRIORITY", "RST_STREAM", "SETTINGS", "PUSH_PROMISE", "PING", "GOAWAY", "WINDOW_UPDATE", "CONTINUATION"};
        f11283c = new String[64];
        String[] strArr = new String[256];
        for (int i11 = 0; i11 < 256; i11++) {
            String binaryString = Integer.toBinaryString(i11);
            p210v8.i.e(binaryString, "toBinaryString(it)");
            strArr[i11] = n.F(c.i("%8s", binaryString), ' ', '0');
        }
        f11284d = strArr;
        String[] strArr2 = f11283c;
        strArr2[0] = "";
        strArr2[1] = "END_STREAM";
        int[] iArr = {1};
        strArr2[8] = "PADDED";
        int i12 = iArr[0];
        strArr2[i12 | 8] = p210v8.i.k("|PADDED", strArr2[i12]);
        strArr2[4] = "END_HEADERS";
        strArr2[32] = "PRIORITY";
        strArr2[36] = "END_HEADERS|PRIORITY";
        int[] iArr2 = {4, 32, 36};
        int i13 = 0;
        while (i13 < 3) {
            int i14 = iArr2[i13];
            i13++;
            int i15 = iArr[0];
            String[] strArr3 = f11283c;
            int i16 = i15 | i14;
            StringBuilder sb = new StringBuilder();
            sb.append((Object) strArr3[i15]);
            sb.append('|');
            sb.append((Object) strArr3[i14]);
            strArr3[i16] = sb.toString();
            strArr3[i16 | 8] = ((Object) strArr3[i15]) + '|' + ((Object) strArr3[i14]) + "|PADDED";
        }
        int length = f11283c.length;
        while (i10 < length) {
            int i17 = i10 + 1;
            String[] strArr4 = f11283c;
            if (strArr4[i10] == null) {
                strArr4[i10] = f11284d[i10];
            }
            i10 = i17;
        }
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0068  */
    public static String a(boolean z6, int i10, int i11, int i12, int i13) {
        String strG;
        String str;
        String[] strArr = f11282b;
        String strI = i12 < strArr.length ? strArr[i12] : c.i("0x%02x", Integer.valueOf(i12));
        if (i13 == 0) {
            strG = "";
        } else {
            String[] strArr2 = f11284d;
            if (i12 == 2 || i12 == 3) {
                strG = strArr2[i13];
            } else if (i12 == 4 || i12 == 6) {
                strG = i13 == 1 ? "ACK" : strArr2[i13];
            } else if (i12 == 7 || i12 == 8) {
                strG = strArr2[i13];
            } else {
                String[] strArr3 = f11283c;
                if (i13 < strArr3.length) {
                    str = strArr3[i13];
                    p210v8.i.c(str);
                } else {
                    str = strArr2[i13];
                }
                if (i12 != 5 || (i13 & 4) == 0) {
                    strG = (i12 != 0 || (i13 & 32) == 0) ? str : n.G(str, "PRIORITY", "COMPRESSED");
                } else {
                    strG = n.G(str, "HEADERS", "PUSH_PROMISE");
                }
            }
        }
        return c.i("%s 0x%08x %5d %-13s %s", z6 ? "<<" : ">>", Integer.valueOf(i10), Integer.valueOf(i11), strI, strG);
    }
}
