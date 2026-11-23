package androidx.datastore.preferences.protobuf;

/* JADX INFO: loaded from: classes.dex */
public final class u0 extends P {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f6523c;

    public static int m(long j, byte[] bArr, int i10, int i11) {
        if (i11 == 0) {
            P p10 = w0.a;
            if (i10 > -12) {
                return -1;
            }
            return i10;
        }
        if (i11 == 1) {
            return w0.c(i10, t0.f(bArr, j));
        }
        if (i11 == 2) {
            return w0.d(i10, t0.f(bArr, j), t0.f(bArr, j + 1));
        }
        throw new AssertionError();
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0124 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:101:0x016b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:102:0x0143 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:103:0x0159 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:104:0x0186 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:110:0x0138 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:13:0x0039  */
    /* JADX WARN: Code duplicated, block: B:15:0x0042  */
    /* JADX WARN: Code duplicated, block: B:17:0x0049  */
    /* JADX WARN: Code duplicated, block: B:19:0x0050 A[LOOP:2: B:16:0x0047->B:19:0x0050, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:21:0x005f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:22:0x0061 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:23:0x0063  */
    /* JADX WARN: Code duplicated, block: B:26:0x0079 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:27:0x007b  */
    /* JADX WARN: Code duplicated, block: B:29:0x007f  */
    /* JADX WARN: Code duplicated, block: B:32:0x009c  */
    /* JADX WARN: Code duplicated, block: B:34:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:51:0x011e  */
    /* JADX WARN: Code duplicated, block: B:55:0x012b  */
    /* JADX WARN: Code duplicated, block: B:57:0x012f A[LOOP:5: B:54:0x0129->B:57:0x012f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:60:0x013f  */
    /* JADX WARN: Code duplicated, block: B:63:0x0145  */
    /* JADX WARN: Code duplicated, block: B:70:0x015d  */
    /* JADX WARN: Code duplicated, block: B:75:0x0174  */
    /* JADX WARN: Code duplicated, block: B:84:0x00ca A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:86:0x0074 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:87:0x0097 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:93:0x0058 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:97:0x0155 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:98:0x0150 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:99:0x0170 A[SYNTHETIC] */
    @Override // androidx.datastore.preferences.protobuf.P
    public final String e(byte[] bArr, int i10, int i11) throws InvalidProtocolBufferException {
        int i12;
        int i13;
        byte b3;
        int i14;
        byte b7;
        int i15;
        int i16;
        byte bF;
        int i17;
        byte bF2;
        byte b10 = -16;
        byte b11 = -32;
        int i18 = 2;
        int i19 = 1;
        switch (this.f6523c) {
            case 0:
                if ((i10 | i11 | ((bArr.length - i10) - i11)) < 0) {
                    throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(bArr.length), Integer.valueOf(i10), Integer.valueOf(i11)));
                }
                int i20 = i10 + i11;
                char[] cArr = new char[i11];
                int i21 = i10;
                int i22 = 0;
                while (i21 < i20) {
                    byte b12 = bArr[i21];
                    if (b12 < 0) {
                        i12 = i22;
                        while (i21 < i20) {
                            i13 = i21 + 1;
                            b3 = bArr[i21];
                            if (b3 >= 0) {
                                i14 = i12 + 1;
                                cArr[i12] = (char) b3;
                                while (i13 < i20) {
                                    b7 = bArr[i13];
                                    if (b7 >= 0) {
                                        i13++;
                                        cArr[i14] = (char) b7;
                                        i14++;
                                    } else {
                                        i12 = i14;
                                        i21 = i13;
                                    }
                                }
                                i12 = i14;
                                i21 = i13;
                            } else if (b3 < -32) {
                                if (i13 < i20) {
                                    throw InvalidProtocolBufferException.a();
                                }
                                i21 += 2;
                                P.b(b3, bArr[i13], cArr, i12);
                                i12++;
                            } else if (b3 < -16) {
                                if (i13 < i20 - 1) {
                                    throw InvalidProtocolBufferException.a();
                                }
                                int i23 = i21 + 2;
                                i21 += 3;
                                P.c(b3, bArr[i13], bArr[i23], cArr, i12);
                                i12++;
                            } else {
                                if (i13 < i20 - 2) {
                                    throw InvalidProtocolBufferException.a();
                                }
                                byte b13 = bArr[i13];
                                int i24 = i21 + 3;
                                byte b14 = bArr[i21 + 2];
                                i21 += 4;
                                P.a(b3, b13, b14, bArr[i24], cArr, i12);
                                i12 += 2;
                            }
                        }
                        return new String(cArr, 0, i12);
                    }
                    i21++;
                    cArr[i22] = (char) b12;
                    i22++;
                }
                i12 = i22;
                while (i21 < i20) {
                    i13 = i21 + 1;
                    b3 = bArr[i21];
                    if (b3 >= 0) {
                        i14 = i12 + 1;
                        cArr[i12] = (char) b3;
                        while (i13 < i20) {
                            b7 = bArr[i13];
                            if (b7 >= 0) {
                                i13++;
                                cArr[i14] = (char) b7;
                                i14++;
                            } else {
                                i12 = i14;
                                i21 = i13;
                            }
                        }
                        i12 = i14;
                        i21 = i13;
                    } else if (b3 < -32) {
                        if (i13 < i20) {
                            throw InvalidProtocolBufferException.a();
                        }
                        i21 += 2;
                        P.b(b3, bArr[i13], cArr, i12);
                        i12++;
                    } else if (b3 < -16) {
                        if (i13 < i20 - 1) {
                            throw InvalidProtocolBufferException.a();
                        }
                        int i25 = i21 + 2;
                        i21 += 3;
                        P.c(b3, bArr[i13], bArr[i25], cArr, i12);
                        i12++;
                    } else {
                        if (i13 < i20 - 2) {
                            throw InvalidProtocolBufferException.a();
                        }
                        byte b15 = bArr[i13];
                        int i26 = i21 + 3;
                        byte b16 = bArr[i21 + 2];
                        i21 += 4;
                        P.a(b3, b15, b16, bArr[i26], cArr, i12);
                        i12 += 2;
                    }
                }
                return new String(cArr, 0, i12);
            default:
                if ((i10 | i11 | ((bArr.length - i10) - i11)) < 0) {
                    throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(bArr.length), Integer.valueOf(i10), Integer.valueOf(i11)));
                }
                int i27 = i10 + i11;
                char[] cArr2 = new char[i11];
                int i28 = i10;
                int i29 = 0;
                while (i28 < i27) {
                    byte bF3 = t0.f(bArr, i28);
                    if (bF3 < 0) {
                        i15 = i29;
                        while (i28 < i27) {
                            i16 = i28 + 1;
                            bF = t0.f(bArr, i28);
                            if (bF >= 0) {
                                i17 = i15 + 1;
                                cArr2[i15] = (char) bF;
                                while (i16 < i27) {
                                    bF2 = t0.f(bArr, i16);
                                    if (bF2 >= 0) {
                                        i16 += i19;
                                        cArr2[i17] = (char) bF2;
                                        i17++;
                                    } else {
                                        i15 = i17;
                                        i28 = i16;
                                    }
                                }
                                i15 = i17;
                                i28 = i16;
                            } else if (bF < b11) {
                                if (i16 < i27) {
                                    throw InvalidProtocolBufferException.a();
                                }
                                i28 += i18;
                                P.b(bF, t0.f(bArr, i16), cArr2, i15);
                                i15++;
                            } else if (bF < b10) {
                                if (i16 < i27 - 1) {
                                    throw InvalidProtocolBufferException.a();
                                }
                                int i30 = i28 + 2;
                                i28 += 3;
                                P.c(bF, t0.f(bArr, i16), t0.f(bArr, i30), cArr2, i15);
                                i15++;
                            } else {
                                if (i16 < i27 - 2) {
                                    throw InvalidProtocolBufferException.a();
                                }
                                byte bF4 = t0.f(bArr, i16);
                                int i31 = i28 + 3;
                                byte bF5 = t0.f(bArr, i28 + 2);
                                i28 += 4;
                                P.a(bF, bF4, bF5, t0.f(bArr, i31), cArr2, i15);
                                i15 += 2;
                            }
                            i18 = i18;
                            i19 = i19;
                            b10 = -16;
                            b11 = -32;
                        }
                        return new String(cArr2, 0, i15);
                    }
                    i28++;
                    cArr2[i29] = (char) bF3;
                    i29++;
                }
                i15 = i29;
                while (i28 < i27) {
                    i16 = i28 + 1;
                    bF = t0.f(bArr, i28);
                    if (bF >= 0) {
                        i17 = i15 + 1;
                        cArr2[i15] = (char) bF;
                        while (i16 < i27) {
                            bF2 = t0.f(bArr, i16);
                            if (bF2 >= 0) {
                                i16 += i19;
                                cArr2[i17] = (char) bF2;
                                i17++;
                            } else {
                                i15 = i17;
                                i28 = i16;
                            }
                        }
                        i15 = i17;
                        i28 = i16;
                    } else if (bF < b11) {
                        if (i16 < i27) {
                            throw InvalidProtocolBufferException.a();
                        }
                        i28 += i18;
                        P.b(bF, t0.f(bArr, i16), cArr2, i15);
                        i15++;
                    } else if (bF < b10) {
                        if (i16 < i27 - 1) {
                            throw InvalidProtocolBufferException.a();
                        }
                        int i32 = i28 + 2;
                        i28 += 3;
                        P.c(bF, t0.f(bArr, i16), t0.f(bArr, i32), cArr2, i15);
                        i15++;
                    } else {
                        if (i16 < i27 - 2) {
                            throw InvalidProtocolBufferException.a();
                        }
                        byte bF6 = t0.f(bArr, i16);
                        int i33 = i28 + 3;
                        byte bF7 = t0.f(bArr, i28 + 2);
                        i28 += 4;
                        P.a(bF, bF6, bF7, t0.f(bArr, i33), cArr2, i15);
                        i15 += 2;
                    }
                    i18 = i18;
                    i19 = i19;
                    b10 = -16;
                    b11 = -32;
                }
                return new String(cArr2, 0, i15);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.P
    public final int f(String str, byte[] bArr, int i10, int i11) {
        int i12;
        int i13;
        char cCharAt;
        long j;
        long j10;
        long j11;
        int i14;
        char cCharAt2;
        switch (this.f6523c) {
            case 0:
                int length = str.length();
                int i15 = i11 + i10;
                int i16 = 0;
                while (i16 < length && (i13 = i16 + i10) < i15 && (cCharAt = str.charAt(i16)) < 128) {
                    bArr[i13] = (byte) cCharAt;
                    i16++;
                }
                if (i16 == length) {
                    return i10 + length;
                }
                int i17 = i10 + i16;
                while (i16 < length) {
                    char cCharAt3 = str.charAt(i16);
                    if (cCharAt3 < 128 && i17 < i15) {
                        bArr[i17] = (byte) cCharAt3;
                        i17++;
                    } else if (cCharAt3 < 2048 && i17 <= i15 - 2) {
                        int i18 = i17 + 1;
                        bArr[i17] = (byte) ((cCharAt3 >>> 6) | 960);
                        i17 += 2;
                        bArr[i18] = (byte) ((cCharAt3 & '?') | 128);
                    } else {
                        if ((cCharAt3 >= 55296 && 57343 >= cCharAt3) || i17 > i15 - 3) {
                            if (i17 > i15 - 4) {
                                if (55296 <= cCharAt3 && cCharAt3 <= 57343 && ((i12 = i16 + 1) == str.length() || !Character.isSurrogatePair(cCharAt3, str.charAt(i12)))) {
                                    throw new v0(i16, length);
                                }
                                throw new ArrayIndexOutOfBoundsException("Failed writing " + cCharAt3 + " at index " + i17);
                            }
                            int i19 = i16 + 1;
                            if (i19 != str.length()) {
                                char cCharAt4 = str.charAt(i19);
                                if (Character.isSurrogatePair(cCharAt3, cCharAt4)) {
                                    int codePoint = Character.toCodePoint(cCharAt3, cCharAt4);
                                    bArr[i17] = (byte) ((codePoint >>> 18) | 240);
                                    bArr[i17 + 1] = (byte) (((codePoint >>> 12) & 63) | 128);
                                    int i20 = i17 + 3;
                                    bArr[i17 + 2] = (byte) (((codePoint >>> 6) & 63) | 128);
                                    i17 += 4;
                                    bArr[i20] = (byte) ((codePoint & 63) | 128);
                                    i16 = i19;
                                } else {
                                    i16 = i19;
                                }
                            }
                            throw new v0(i16 - 1, length);
                        }
                        bArr[i17] = (byte) ((cCharAt3 >>> '\f') | 480);
                        int i21 = i17 + 2;
                        bArr[i17 + 1] = (byte) (((cCharAt3 >>> 6) & 63) | 128);
                        i17 += 3;
                        bArr[i21] = (byte) ((cCharAt3 & '?') | 128);
                    }
                    i16++;
                }
                return i17;
            default:
                long j12 = i10;
                long j13 = ((long) i11) + j12;
                int length2 = str.length();
                if (length2 > i11 || bArr.length - i11 < i10) {
                    throw new ArrayIndexOutOfBoundsException("Failed writing " + str.charAt(length2 - 1) + " at index " + (i10 + i11));
                }
                int i22 = 0;
                while (true) {
                    j = 1;
                    if (i22 < length2 && (cCharAt2 = str.charAt(i22)) < 128) {
                        t0.j(bArr, j12, (byte) cCharAt2);
                        i22++;
                        j12 = 1 + j12;
                    }
                }
                if (i22 != length2) {
                    while (i22 < length2) {
                        char cCharAt5 = str.charAt(i22);
                        if (cCharAt5 < 128 && j12 < j13) {
                            t0.j(bArr, j12, (byte) cCharAt5);
                            j11 = j13;
                            j10 = j;
                            j12 += j;
                        } else if (cCharAt5 >= 2048 || j12 > j13 - 2) {
                            j10 = j;
                            if ((cCharAt5 >= 55296 && 57343 >= cCharAt5) || j12 > j13 - 3) {
                                j11 = j13;
                                if (j12 > j11 - 4) {
                                    if (55296 <= cCharAt5 && cCharAt5 <= 57343 && ((i14 = i22 + 1) == length2 || !Character.isSurrogatePair(cCharAt5, str.charAt(i14)))) {
                                        throw new v0(i22, length2);
                                    }
                                    throw new ArrayIndexOutOfBoundsException("Failed writing " + cCharAt5 + " at index " + j12);
                                }
                                int i23 = i22 + 1;
                                if (i23 != length2) {
                                    char cCharAt6 = str.charAt(i23);
                                    if (Character.isSurrogatePair(cCharAt5, cCharAt6)) {
                                        int codePoint2 = Character.toCodePoint(cCharAt5, cCharAt6);
                                        t0.j(bArr, j12, (byte) ((codePoint2 >>> 18) | 240));
                                        t0.j(bArr, j12 + j10, (byte) (((codePoint2 >>> 12) & 63) | 128));
                                        long j14 = j12 + 3;
                                        t0.j(bArr, j12 + 2, (byte) (((codePoint2 >>> 6) & 63) | 128));
                                        j12 += 4;
                                        t0.j(bArr, j14, (byte) ((codePoint2 & 63) | 128));
                                        i22 = i23;
                                    } else {
                                        i22 = i23;
                                    }
                                }
                                throw new v0(i22 - 1, length2);
                            }
                            t0.j(bArr, j12, (byte) ((cCharAt5 >>> '\f') | 480));
                            j11 = j13;
                            long j15 = j12 + 2;
                            t0.j(bArr, j12 + j10, (byte) (((cCharAt5 >>> 6) & 63) | 128));
                            j12 += 3;
                            t0.j(bArr, j15, (byte) ((cCharAt5 & '?') | 128));
                        } else {
                            j10 = j;
                            long j16 = j12 + j10;
                            t0.j(bArr, j12, (byte) ((cCharAt5 >>> 6) | 960));
                            j12 += 2;
                            t0.j(bArr, j16, (byte) ((cCharAt5 & '?') | 128));
                            j11 = j13;
                        }
                        i22++;
                        j = j10;
                        j13 = j11;
                    }
                }
                return (int) j12;
        }
    }

    /* JADX WARN: Code duplicated, block: B:112:0x005f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:113:0x0069 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:114:0x00d9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:115:0x00d9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:116:0x0084 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:121:0x00a7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:25:0x0063  */
    /* JADX WARN: Code duplicated, block: B:27:0x0067 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:29:0x006c  */
    /* JADX WARN: Code duplicated, block: B:31:0x0070  */
    /* JADX WARN: Code duplicated, block: B:34:0x007a  */
    /* JADX WARN: Code duplicated, block: B:36:0x007e  */
    /* JADX WARN: Code duplicated, block: B:38:0x0082 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:40:0x0089  */
    /* JADX WARN: Code duplicated, block: B:49:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:52:0x00ac  */
    @Override // androidx.datastore.preferences.protobuf.P
    public final int i(byte[] bArr, int i10, int i11) {
        int i12;
        int i13;
        int i14;
        byte bF;
        byte bF2;
        long j;
        int i15 = i10;
        int i16 = 2;
        switch (this.f6523c) {
            case 0:
                while (i15 < i11 && bArr[i15] >= 0) {
                    i15++;
                }
                if (i15 < i11) {
                    while (i15 < i11) {
                        int i17 = i15 + 1;
                        byte b3 = bArr[i15];
                        if (b3 < 0) {
                            if (b3 < -32) {
                                if (i17 >= i11) {
                                    return b3;
                                }
                                if (b3 >= -62) {
                                    i15 += 2;
                                    if (bArr[i17] > -65) {
                                    }
                                }
                                return -1;
                            }
                            if (b3 < -16) {
                                if (i17 >= i11 - 1) {
                                    return w0.a(bArr, i17, i11);
                                }
                                int i18 = i15 + 2;
                                byte b7 = bArr[i17];
                                if (b7 <= -65 && ((b3 != -32 || b7 >= -96) && (b3 != -19 || b7 < -96))) {
                                    i15 += 3;
                                    if (bArr[i18] > -65) {
                                    }
                                }
                            } else {
                                if (i17 >= i11 - 2) {
                                    return w0.a(bArr, i17, i11);
                                }
                                int i19 = i15 + 2;
                                byte b10 = bArr[i17];
                                if (b10 <= -65 && (((b10 + 112) + (b3 << 28)) >> 30) == 0) {
                                    int i20 = i15 + 3;
                                    if (bArr[i19] <= -65) {
                                        i15 += 4;
                                        if (bArr[i20] > -65) {
                                        }
                                    }
                                }
                            }
                            return -1;
                        }
                        i15 = i17;
                    }
                }
                return 0;
            default:
                if (((bArr.length - i11) | i15 | i11) < 0) {
                    throw new ArrayIndexOutOfBoundsException(String.format("Array length=%d, index=%d, limit=%d", Integer.valueOf(bArr.length), Integer.valueOf(i15), Integer.valueOf(i11)));
                }
                long j10 = i15;
                int i21 = (int) (((long) i11) - j10);
                if (i21 < 16) {
                    i12 = -1;
                    i13 = 0;
                } else {
                    i12 = -1;
                    long j11 = j10;
                    i13 = 0;
                    while (true) {
                        if (i13 < i21) {
                            long j12 = j11 + 1;
                            if (t0.f(bArr, j11) >= 0) {
                                i13++;
                                j11 = j12;
                            }
                        } else {
                            i13 = i21;
                        }
                    }
                }
                int i22 = i21 - i13;
                long j13 = j10 + ((long) i13);
                while (true) {
                    byte bF3 = 0;
                    while (i22 > 0) {
                        long j14 = j13 + 1;
                        bF3 = t0.f(bArr, j13);
                        if (bF3 >= 0) {
                            i22--;
                            j13 = j14;
                        } else {
                            j13 = j14;
                            if (i22 == 0) {
                                return 0;
                            }
                            i14 = i22 - 1;
                            if (bF3 < -32) {
                                if (i14 == 0) {
                                    return bF3;
                                }
                                i22 -= 2;
                                if (bF3 >= -62) {
                                    j = j13 + 1;
                                    if (t0.f(bArr, j13) > -65) {
                                        j13 = j;
                                    }
                                }
                                return i12;
                            }
                            if (bF3 < -16) {
                                if (i14 < i16) {
                                    return m(j13, bArr, bF3, i14);
                                }
                                i22 -= 3;
                                long j15 = j13 + 1;
                                bF2 = t0.f(bArr, j13);
                                if (bF2 > -65 && ((bF3 != -32 || bF2 >= -96) && (bF3 != -19 || bF2 < -96))) {
                                    j13 += 2;
                                    if (t0.f(bArr, j15) > -65) {
                                    }
                                }
                            } else {
                                if (i14 < 3) {
                                    return m(j13, bArr, bF3, i14);
                                }
                                i22 -= 4;
                                long j16 = j13 + 1;
                                bF = t0.f(bArr, j13);
                                if (bF > -65 && (((bF + 112) + (bF3 << 28)) >> 30) == 0) {
                                    long j17 = j13 + 2;
                                    if (t0.f(bArr, j16) <= -65) {
                                        j13 += 3;
                                        if (t0.f(bArr, j17) > -65) {
                                        }
                                    }
                                }
                            }
                            return i12;
                            i16 = i16;
                        }
                    }
                    if (i22 == 0) {
                        return 0;
                    }
                    i14 = i22 - 1;
                    if (bF3 < -32) {
                        if (i14 == 0) {
                            return bF3;
                        }
                        i22 -= 2;
                        if (bF3 >= -62) {
                            j = j13 + 1;
                            if (t0.f(bArr, j13) > -65) {
                                j13 = j;
                            }
                        }
                        return i12;
                    }
                    if (bF3 < -16) {
                        if (i14 < i16) {
                            return m(j13, bArr, bF3, i14);
                        }
                        i22 -= 3;
                        long j18 = j13 + 1;
                        bF2 = t0.f(bArr, j13);
                        if (bF2 > -65) {
                        }
                    } else {
                        if (i14 < 3) {
                            return m(j13, bArr, bF3, i14);
                        }
                        i22 -= 4;
                        long j19 = j13 + 1;
                        bF = t0.f(bArr, j13);
                        if (bF > -65) {
                        }
                    }
                    return i12;
                    i16 = i16;
                }
                break;
        }
    }
}
