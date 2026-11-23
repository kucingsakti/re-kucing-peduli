package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes.dex */
public abstract class L0 {
    public static final C0587o0 a;

    static {
        if (J0.f8351e) {
            boolean z6 = J0.f8350d;
        }
        a = new C0587o0(7);
    }

    public static int a(String str) {
        int length = str.length();
        int i10 = 0;
        int i11 = 0;
        while (i11 < length && str.charAt(i11) < 128) {
            i11++;
        }
        int i12 = length;
        while (i11 < length) {
            char cCharAt = str.charAt(i11);
            if (cCharAt >= 2048) {
                int length2 = str.length();
                while (i11 < length2) {
                    char cCharAt2 = str.charAt(i11);
                    if (cCharAt2 < 2048) {
                        i10 += (127 - cCharAt2) >>> 31;
                    } else {
                        i10 += 2;
                        if (55296 <= cCharAt2 && cCharAt2 <= 57343) {
                            if (Character.codePointAt(str, i11) < 65536) {
                                throw new M0(i11, length2);
                            }
                            i11++;
                        }
                    }
                    i11++;
                }
                i12 += i10;
                break;
            }
            i12 += (127 - cCharAt) >>> 31;
            i11++;
        }
        if (i12 >= length) {
            return i12;
        }
        throw new IllegalArgumentException("UTF-8 length does not fit in int: " + (((long) i12) + 4294967296L));
    }

    public static int b(String str, byte[] bArr, int i10, int i11) {
        int i12;
        int i13;
        char cCharAt;
        a.getClass();
        int length = str.length();
        int i14 = i11 + i10;
        int i15 = 0;
        while (i15 < length && (i13 = i15 + i10) < i14 && (cCharAt = str.charAt(i15)) < 128) {
            bArr[i13] = (byte) cCharAt;
            i15++;
        }
        if (i15 == length) {
            return i10 + length;
        }
        int i16 = i10 + i15;
        while (i15 < length) {
            char cCharAt2 = str.charAt(i15);
            if (cCharAt2 < 128 && i16 < i14) {
                bArr[i16] = (byte) cCharAt2;
                i16++;
            } else if (cCharAt2 < 2048 && i16 <= i14 - 2) {
                int i17 = i16 + 1;
                bArr[i16] = (byte) ((cCharAt2 >>> 6) | 960);
                i16 += 2;
                bArr[i17] = (byte) ((cCharAt2 & '?') | 128);
            } else {
                if ((cCharAt2 >= 55296 && 57343 >= cCharAt2) || i16 > i14 - 3) {
                    if (i16 > i14 - 4) {
                        if (55296 <= cCharAt2 && cCharAt2 <= 57343 && ((i12 = i15 + 1) == str.length() || !Character.isSurrogatePair(cCharAt2, str.charAt(i12)))) {
                            throw new M0(i15, length);
                        }
                        throw new ArrayIndexOutOfBoundsException("Failed writing " + cCharAt2 + " at index " + i16);
                    }
                    int i18 = i15 + 1;
                    if (i18 != str.length()) {
                        char cCharAt3 = str.charAt(i18);
                        if (Character.isSurrogatePair(cCharAt2, cCharAt3)) {
                            int codePoint = Character.toCodePoint(cCharAt2, cCharAt3);
                            bArr[i16] = (byte) ((codePoint >>> 18) | 240);
                            bArr[i16 + 1] = (byte) (((codePoint >>> 12) & 63) | 128);
                            int i19 = i16 + 3;
                            bArr[i16 + 2] = (byte) (((codePoint >>> 6) & 63) | 128);
                            i16 += 4;
                            bArr[i19] = (byte) ((codePoint & 63) | 128);
                            i15 = i18;
                        } else {
                            i15 = i18;
                        }
                    }
                    throw new M0(i15 - 1, length);
                }
                bArr[i16] = (byte) ((cCharAt2 >>> '\f') | 480);
                int i20 = i16 + 2;
                bArr[i16 + 1] = (byte) (((cCharAt2 >>> 6) & 63) | 128);
                i16 += 3;
                bArr[i20] = (byte) ((cCharAt2 & '?') | 128);
            }
            i15++;
        }
        return i16;
    }

    public static /* synthetic */ int c(byte[] bArr, int i10, int i11) {
        byte b3 = bArr[i10 - 1];
        int i12 = i11 - i10;
        if (i12 == 0) {
            if (b3 > -12) {
                return -1;
            }
            return b3;
        }
        if (i12 == 1) {
            byte b7 = bArr[i10];
            if (b3 > -12 || b7 > -65) {
                return -1;
            }
            return (b7 << 8) ^ b3;
        }
        if (i12 != 2) {
            throw new AssertionError();
        }
        byte b10 = bArr[i10];
        byte b11 = bArr[i10 + 1];
        if (b3 > -12 || b10 > -65 || b11 > -65) {
            return -1;
        }
        return (b11 << 16) ^ ((b10 << 8) ^ b3);
    }

    public static String d(byte[] bArr, int i10, int i11) throws zzjs {
        a.getClass();
        if ((i10 | i11 | ((bArr.length - i10) - i11)) < 0) {
            throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(bArr.length), Integer.valueOf(i10), Integer.valueOf(i11)));
        }
        int i12 = i10 + i11;
        char[] cArr = new char[i11];
        int i13 = 0;
        while (i10 < i12) {
            byte b3 = bArr[i10];
            if (b3 < 0) {
                break;
            }
            i10++;
            cArr[i13] = (char) b3;
            i13++;
        }
        while (i10 < i12) {
            int i14 = i10 + 1;
            byte b7 = bArr[i10];
            if (b7 >= 0) {
                int i15 = i13 + 1;
                cArr[i13] = (char) b7;
                while (i14 < i12) {
                    byte b10 = bArr[i14];
                    if (b10 < 0) {
                        break;
                    }
                    i14++;
                    cArr[i15] = (char) b10;
                    i15++;
                }
                i13 = i15;
                i10 = i14;
            } else if (b7 < -32) {
                if (i14 >= i12) {
                    throw zzjs.b();
                }
                i10 += 2;
                byte b11 = bArr[i14];
                int i16 = i13 + 1;
                if (b7 < -62 || E0.f(b11)) {
                    throw zzjs.b();
                }
                cArr[i13] = (char) ((b11 & 63) | ((b7 & 31) << 6));
                i13 = i16;
            } else if (b7 < -16) {
                if (i14 >= i12 - 1) {
                    throw zzjs.b();
                }
                int i17 = i10 + 2;
                byte b12 = bArr[i14];
                i10 += 3;
                byte b13 = bArr[i17];
                int i18 = i13 + 1;
                if (E0.f(b12) || ((b7 == -32 && b12 < -96) || ((b7 == -19 && b12 >= -96) || E0.f(b13)))) {
                    throw zzjs.b();
                }
                cArr[i13] = (char) (((b12 & 63) << 6) | ((b7 & 15) << 12) | (b13 & 63));
                i13 = i18;
            } else {
                if (i14 >= i12 - 2) {
                    throw zzjs.b();
                }
                byte b14 = bArr[i14];
                int i19 = i10 + 3;
                byte b15 = bArr[i10 + 2];
                i10 += 4;
                byte b16 = bArr[i19];
                int i20 = i13 + 1;
                if (E0.f(b14) || (((b14 + 112) + (b7 << 28)) >> 30) != 0 || E0.f(b15) || E0.f(b16)) {
                    throw zzjs.b();
                }
                int i21 = ((b14 & 63) << 12) | ((b7 & 7) << 18) | ((b15 & 63) << 6) | (b16 & 63);
                cArr[i13] = (char) ((i21 >>> 10) + 55232);
                cArr[i20] = (char) ((i21 & 1023) + 56320);
                i13 += 2;
            }
        }
        return new String(cArr, 0, i13);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean e(byte[] bArr, int i10, int i11) {
        int iC;
        a.getClass();
        while (i10 < i11 && bArr[i10] >= 0) {
            i10++;
        }
        if (i10 >= i11) {
            iC = 0;
            break;
        }
        while (true) {
            if (i10 >= i11) {
                iC = 0;
                break;
            }
            int i12 = i10 + 1;
            iC = bArr[i10];
            if (iC < 0) {
                if (iC >= -32) {
                    if (iC >= -16) {
                        if (i12 < i11 - 2) {
                            int i13 = i10 + 2;
                            int i14 = bArr[i12];
                            if (i14 <= -65) {
                                if ((((i14 + 112) + (iC << 28)) >> 30) == 0) {
                                    int i15 = i10 + 3;
                                    if (bArr[i13] <= -65) {
                                        i10 += 4;
                                        if (bArr[i15] > -65) {
                                        }
                                    }
                                }
                            }
                            iC = -1;
                            break;
                        }
                        iC = c(bArr, i12, i11);
                        break;
                    }
                    if (i12 < i11 - 1) {
                        int i16 = i10 + 2;
                        char c10 = bArr[i12];
                        if (c10 <= -65 && ((iC != -32 || c10 >= -96) && (iC != -19 || c10 < -96))) {
                            i10 += 3;
                            if (bArr[i16] > -65) {
                            }
                        }
                        iC = -1;
                        break;
                    }
                    iC = c(bArr, i12, i11);
                    break;
                }
                if (i12 >= i11) {
                    break;
                }
                if (iC >= -62) {
                    i10 += 2;
                    if (bArr[i12] > -65) {
                    }
                }
                iC = -1;
                break;
            }
            i10 = i12;
        }
        return iC == 0;
    }
}
