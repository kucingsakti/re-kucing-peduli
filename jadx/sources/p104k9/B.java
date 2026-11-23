package p104k9;

/* JADX INFO: loaded from: classes.dex */
public abstract class B {
    public static final z a = new z();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final A f12764b = new A();

    public static int a(int i10, int i11) {
        if (i10 > -12 || i11 > -65) {
            return -1;
        }
        return i10 ^ (i11 << 8);
    }

    public static int b(byte[] bArr, int i10, int i11) {
        byte b3 = bArr[i10 - 1];
        int i12 = i11 - i10;
        if (i12 == 0) {
            if (b3 > -12) {
                return -1;
            }
            return b3;
        }
        if (i12 == 1) {
            return a(b3, bArr[i10]);
        }
        if (i12 != 2) {
            throw new AssertionError();
        }
        byte b7 = bArr[i10];
        byte b10 = bArr[i10 + 1];
        if (b3 > -12 || b7 > -65 || b10 > -65) {
            return -1;
        }
        return (b10 << 16) ^ ((b7 << 8) ^ b3);
    }

    public static int c(byte[] bArr, int i10, int i11) {
        while (i10 < i11 && bArr[i10] >= 0) {
            i10++;
        }
        if (i10 >= i11) {
            return 0;
        }
        while (i10 < i11) {
            int i12 = i10 + 1;
            byte b3 = bArr[i10];
            if (b3 >= 0) {
                i10 = i12;
            } else if (b3 < -32) {
                if (i12 >= i11) {
                    return b3;
                }
                if (b3 < -62) {
                    return -1;
                }
                i10 += 2;
                if (bArr[i12] > -65) {
                    return -1;
                }
            } else if (b3 < -16) {
                if (i12 >= i11 - 1) {
                    return b(bArr, i12, i11);
                }
                int i13 = i10 + 2;
                byte b7 = bArr[i12];
                if (b7 > -65) {
                    return -1;
                }
                if (b3 == -32 && b7 < -96) {
                    return -1;
                }
                if (b3 == -19 && b7 >= -96) {
                    return -1;
                }
                i10 += 3;
                if (bArr[i13] > -65) {
                    return -1;
                }
            } else {
                if (i12 >= i11 - 2) {
                    return b(bArr, i12, i11);
                }
                int i14 = i10 + 2;
                byte b10 = bArr[i12];
                if (b10 > -65) {
                    return -1;
                }
                if ((((b10 + 112) + (b3 << 28)) >> 30) != 0) {
                    return -1;
                }
                int i15 = i10 + 3;
                if (bArr[i14] > -65) {
                    return -1;
                }
                i10 += 4;
                if (bArr[i15] > -65) {
                    return -1;
                }
            }
        }
        return 0;
    }
}
