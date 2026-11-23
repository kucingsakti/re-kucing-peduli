package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes.dex */
public abstract class Y {
    public static int a(int i10, byte[] bArr, int i11, int i12, X x8) throws zzjs {
        if ((i10 >>> 3) == 0) {
            throw new zzjs("Protocol message contained an invalid tag (zero).");
        }
        int i13 = i10 & 7;
        if (i13 == 0) {
            return j(bArr, i11, x8);
        }
        if (i13 == 1) {
            return i11 + 8;
        }
        if (i13 == 2) {
            return i(bArr, i11, x8) + x8.a;
        }
        if (i13 != 3) {
            if (i13 == 5) {
                return i11 + 4;
            }
            throw new zzjs("Protocol message contained an invalid tag (zero).");
        }
        int i14 = (i10 & (-8)) | 4;
        int i15 = 0;
        while (i11 < i12) {
            i11 = i(bArr, i11, x8);
            i15 = x8.a;
            if (i15 == i14) {
                break;
            }
            i11 = a(i15, bArr, i11, i12, x8);
        }
        if (i11 > i12 || i15 != i14) {
            throw zzjs.d();
        }
        return i11;
    }

    public static int b(int i10, byte[] bArr, int i11, int i12, zzjt zzjtVar, X x8) {
        C0589p0 c0589p0 = (C0589p0) zzjtVar;
        int i13 = i(bArr, i11, x8);
        c0589p0.e(x8.a);
        while (i13 < i12) {
            int i14 = i(bArr, i13, x8);
            if (i10 != x8.a) {
                break;
            }
            i13 = i(bArr, i14, x8);
            c0589p0.e(x8.a);
        }
        return i13;
    }

    public static int c(int i10, byte[] bArr, int i11, int i12, zzme zzmeVar, X x8) throws zzjs {
        if ((i10 >>> 3) == 0) {
            throw new zzjs("Protocol message contained an invalid tag (zero).");
        }
        int i13 = i10 & 7;
        if (i13 == 0) {
            int iJ = j(bArr, i11, x8);
            zzmeVar.c(i10, Long.valueOf(x8.f8366b));
            return iJ;
        }
        if (i13 == 1) {
            zzmeVar.c(i10, Long.valueOf(k(i11, bArr)));
            return i11 + 8;
        }
        if (i13 == 2) {
            int i14 = i(bArr, i11, x8);
            int i15 = x8.a;
            if (i15 < 0) {
                throw zzjs.c();
            }
            if (i15 > bArr.length - i14) {
                throw zzjs.e();
            }
            if (i15 == 0) {
                zzmeVar.c(i10, zzia.f8668t);
            } else {
                zzmeVar.c(i10, zzia.g(bArr, i14, i15));
            }
            return i14 + i15;
        }
        if (i13 != 3) {
            if (i13 != 5) {
                throw new zzjs("Protocol message contained an invalid tag (zero).");
            }
            zzmeVar.c(i10, Integer.valueOf(h(i11, bArr)));
            return i11 + 4;
        }
        zzme zzmeVarE = zzme.e();
        int i16 = (i10 & (-8)) | 4;
        int i17 = 0;
        while (i11 < i12) {
            int i18 = i(bArr, i11, x8);
            int i19 = x8.a;
            if (i19 == i16) {
                i17 = i19;
                i11 = i18;
                break;
            }
            i11 = c(i19, bArr, i18, i12, zzmeVarE, x8);
            i17 = i19;
        }
        if (i11 > i12 || i17 != i16) {
            throw zzjs.d();
        }
        zzmeVar.c(i10, zzmeVarE);
        return i11;
    }

    public static int d(int i10, byte[] bArr, int i11, X x8) {
        int i12 = i10 & 127;
        int i13 = i11 + 1;
        byte b3 = bArr[i11];
        if (b3 >= 0) {
            x8.a = i12 | (b3 << 7);
            return i13;
        }
        int i14 = i12 | ((b3 & 127) << 7);
        int i15 = i11 + 2;
        byte b7 = bArr[i13];
        if (b7 >= 0) {
            x8.a = i14 | (b7 << 14);
            return i15;
        }
        int i16 = i14 | ((b7 & 127) << 14);
        int i17 = i11 + 3;
        byte b10 = bArr[i15];
        if (b10 >= 0) {
            x8.a = i16 | (b10 << 21);
            return i17;
        }
        int i18 = i16 | ((b10 & 127) << 21);
        int i19 = i11 + 4;
        byte b11 = bArr[i17];
        if (b11 >= 0) {
            x8.a = i18 | (b11 << 28);
            return i19;
        }
        int i20 = i18 | ((b11 & 127) << 28);
        while (true) {
            int i21 = i19 + 1;
            if (bArr[i19] >= 0) {
                x8.a = i20;
                return i21;
            }
            i19 = i21;
        }
    }

    public static int e(D0 d3, int i10, byte[] bArr, int i11, int i12, zzjt zzjtVar, X x8) throws zzjs {
        Object objB = d3.b();
        D0 d8 = d3;
        byte[] bArr2 = bArr;
        int i13 = i12;
        X x10 = x8;
        int iF = f(objB, d8, bArr2, i11, i13, x10);
        d8.g(objB);
        x10.f8367c = objB;
        zzjtVar.add(objB);
        while (iF < i13) {
            X x11 = x10;
            int i14 = i13;
            int i15 = i(bArr2, iF, x11);
            if (i10 != x11.a) {
                break;
            }
            byte[] bArr3 = bArr2;
            D0 d10 = d8;
            Object objB2 = d10.b();
            iF = f(objB2, d10, bArr3, i15, i14, x11);
            d8 = d10;
            bArr2 = bArr3;
            i13 = i14;
            x10 = x11;
            d8.g(objB2);
            x10.f8367c = objB2;
            zzjtVar.add(objB2);
        }
        return iF;
    }

    public static int f(Object obj, D0 d3, byte[] bArr, int i10, int i11, X x8) throws zzjs {
        int iD = i10 + 1;
        int i12 = bArr[i10];
        if (i12 < 0) {
            iD = d(i12, bArr, iD, x8);
            i12 = x8.a;
        }
        int i13 = iD;
        if (i12 < 0 || i12 > i11 - i13) {
            throw zzjs.e();
        }
        int i14 = i13 + i12;
        d3.c(obj, bArr, i13, i14, x8);
        x8.f8367c = obj;
        return i14;
    }

    public static int g(byte[] bArr, int i10, X x8) throws zzjs {
        int i11 = i(bArr, i10, x8);
        int i12 = x8.a;
        if (i12 < 0) {
            throw zzjs.c();
        }
        if (i12 > bArr.length - i11) {
            throw zzjs.e();
        }
        if (i12 == 0) {
            x8.f8367c = zzia.f8668t;
            return i11;
        }
        x8.f8367c = zzia.g(bArr, i11, i12);
        return i11 + i12;
    }

    public static int h(int i10, byte[] bArr) {
        return ((bArr[i10 + 3] & 255) << 24) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16);
    }

    public static int i(byte[] bArr, int i10, X x8) {
        int i11 = i10 + 1;
        byte b3 = bArr[i10];
        if (b3 < 0) {
            return d(b3, bArr, i11, x8);
        }
        x8.a = b3;
        return i11;
    }

    public static int j(byte[] bArr, int i10, X x8) {
        int i11 = i10 + 1;
        long j = bArr[i10];
        if (j >= 0) {
            x8.f8366b = j;
            return i11;
        }
        int i12 = i10 + 2;
        byte b3 = bArr[i11];
        long j10 = (j & 127) | (((long) (b3 & 127)) << 7);
        int i13 = 7;
        while (b3 < 0) {
            int i14 = i12 + 1;
            byte b7 = bArr[i12];
            i13 += 7;
            j10 |= ((long) (b7 & 127)) << i13;
            b3 = b7;
            i12 = i14;
        }
        x8.f8366b = j10;
        return i12;
    }

    public static long k(int i10, byte[] bArr) {
        return ((((long) bArr[i10 + 7]) & 255) << 56) | (((long) bArr[i10]) & 255) | ((((long) bArr[i10 + 1]) & 255) << 8) | ((((long) bArr[i10 + 2]) & 255) << 16) | ((((long) bArr[i10 + 3]) & 255) << 24) | ((((long) bArr[i10 + 4]) & 255) << 32) | ((((long) bArr[i10 + 5]) & 255) << 40) | ((((long) bArr[i10 + 6]) & 255) << 48);
    }
}
