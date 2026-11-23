package na;

import java.io.EOFException;
import ma.f;
import ma.p;
import ma.s;
import p210v8.i;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    public static final byte[] a;

    static {
        byte[] bytes = "0123456789abcdef".getBytes(L9.a.a);
        i.e(bytes, "(this as java.lang.String).getBytes(charset)");
        a = bytes;
    }

    public static final String a(f fVar, long j) throws EOFException {
        i.f(fVar, "<this>");
        if (j > 0) {
            long j10 = j - 1;
            if (fVar.l(j10) == ((byte) 13)) {
                String strH = fVar.H(j10, L9.a.a);
                fVar.X(2L);
                return strH;
            }
        }
        String strH2 = fVar.H(j, L9.a.a);
        fVar.X(1L);
        return strH2;
    }

    /* JADX WARN: Code duplicated, block: B:48:0x00ab A[LOOP:0: B:8:0x0021->B:48:0x00ab, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:54:0x00aa A[SYNTHETIC] */
    public static final int b(f fVar, p pVar, boolean z6) {
        int i10;
        byte[] bArr;
        int i11;
        int i12;
        s sVar;
        byte[] bArr2;
        int i13;
        i.f(fVar, "<this>");
        i.f(pVar, "options");
        s sVar2 = fVar.f13189s;
        if (sVar2 == null) {
            return z6 ? -2 : -1;
        }
        int i14 = sVar2.f13215b;
        int i15 = sVar2.f13216c;
        byte[] bArr3 = sVar2.a;
        s sVar3 = sVar2;
        int i16 = -1;
        int i17 = 0;
        loop0: while (true) {
            int i18 = i17 + 1;
            int[] iArr = pVar.f13208t;
            int i19 = iArr[i17];
            int i20 = i17 + 2;
            int i21 = iArr[i18];
            if (i21 != -1) {
                i16 = i21;
            }
            if (sVar3 == null) {
                break;
            }
            if (i19 >= 0) {
                int i22 = i14 + 1;
                int i23 = bArr3[i14] & 255;
                int i24 = i20 + i19;
                while (i20 != i24) {
                    if (i23 == iArr[i20]) {
                        i10 = iArr[i20 + i19];
                        if (i22 == i15) {
                            sVar3 = sVar3.f13219f;
                            i.c(sVar3);
                            i12 = sVar3.f13215b;
                            i11 = sVar3.f13216c;
                            bArr = sVar3.a;
                            if (sVar3 == sVar2) {
                                sVar3 = null;
                            }
                        } else {
                            bArr = bArr3;
                            i11 = i15;
                            i12 = i22;
                        }
                        if (i10 >= 0) {
                            return i10;
                        }
                        byte[] bArr4 = bArr;
                        i17 = -i10;
                        i14 = i12;
                        i15 = i11;
                        bArr3 = bArr4;
                    } else {
                        i20++;
                    }
                }
                return i16;
            }
            int i25 = (i19 * (-1)) + i20;
            while (true) {
                int i26 = i14 + 1;
                int i27 = i20 + 1;
                if ((bArr3[i14] & 255) == iArr[i20]) {
                    boolean z10 = i27 == i25;
                    if (i26 == i15) {
                        i.c(sVar3);
                        s sVar4 = sVar3.f13219f;
                        i.c(sVar4);
                        i13 = sVar4.f13215b;
                        int i28 = sVar4.f13216c;
                        bArr2 = sVar4.a;
                        if (sVar4 != sVar2) {
                            sVar = sVar4;
                            i15 = i28;
                        } else {
                            if (!z10) {
                                break loop0;
                            }
                            i15 = i28;
                            sVar = null;
                        }
                    } else {
                        sVar = sVar3;
                        bArr2 = bArr3;
                        i13 = i26;
                    }
                    if (z10) {
                        i10 = iArr[i27];
                        int i29 = i13;
                        i11 = i15;
                        i12 = i29;
                        byte[] bArr5 = bArr2;
                        sVar3 = sVar;
                        bArr = bArr5;
                        break;
                    }
                    i14 = i13;
                    bArr3 = bArr2;
                    sVar3 = sVar;
                    i20 = i27;
                }
                return i16;
            }
            if (i10 >= 0) {
                return i10;
            }
            byte[] bArr6 = bArr;
            i17 = -i10;
            i14 = i12;
            i15 = i11;
            bArr3 = bArr6;
        }
        if (z6) {
            return -2;
        }
        return i16;
    }
}
