package ma;

import com.unity3d.services.core.device.reader.JsonStorageKeyNames;
import java.io.Serializable;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public class i implements Serializable, Comparable {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final i f13191v = new i(new byte[0]);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final byte[] f13192s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public transient int f13193t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public transient String f13194u;

    public i(byte[] bArr) {
        p210v8.i.f(bArr, JsonStorageKeyNames.DATA_KEY);
        this.f13192s = bArr;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        i iVar = (i) obj;
        p210v8.i.f(iVar, "other");
        int iH = h();
        int iH2 = iVar.h();
        int iMin = Math.min(iH, iH2);
        for (int i10 = 0; i10 < iMin; i10++) {
            int iK = k(i10) & 255;
            int iK2 = iVar.k(i10) & 255;
            if (iK != iK2) {
                return iK < iK2 ? -1 : 1;
            }
        }
        if (iH == iH2) {
            return 0;
        }
        return iH < iH2 ? -1 : 1;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof i) {
            i iVar = (i) obj;
            int iH = iVar.h();
            byte[] bArr = this.f13192s;
            if (iH == bArr.length && iVar.l(0, 0, bArr.length, bArr)) {
                return true;
            }
        }
        return false;
    }

    public String f() {
        byte[] bArr = z.a;
        byte[] bArr2 = this.f13192s;
        p210v8.i.f(bArr2, "<this>");
        p210v8.i.f(bArr, "map");
        byte[] bArr3 = new byte[((bArr2.length + 2) / 3) * 4];
        int length = bArr2.length - (bArr2.length % 3);
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            byte b3 = bArr2[i10];
            int i12 = i10 + 2;
            byte b7 = bArr2[i10 + 1];
            i10 += 3;
            byte b10 = bArr2[i12];
            bArr3[i11] = bArr[(b3 & 255) >> 2];
            bArr3[i11 + 1] = bArr[((b3 & 3) << 4) | ((b7 & 255) >> 4)];
            int i13 = i11 + 3;
            bArr3[i11 + 2] = bArr[((b7 & 15) << 2) | ((b10 & 255) >> 6)];
            i11 += 4;
            bArr3[i13] = bArr[b10 & 63];
        }
        int length2 = bArr2.length - length;
        if (length2 == 1) {
            byte b11 = bArr2[i10];
            bArr3[i11] = bArr[(b11 & 255) >> 2];
            bArr3[i11 + 1] = bArr[(b11 & 3) << 4];
            byte b12 = (byte) 61;
            bArr3[i11 + 2] = b12;
            bArr3[i11 + 3] = b12;
        } else if (length2 == 2) {
            int i14 = i10 + 1;
            byte b13 = bArr2[i10];
            byte b14 = bArr2[i14];
            bArr3[i11] = bArr[(b13 & 255) >> 2];
            bArr3[i11 + 1] = bArr[((b13 & 3) << 4) | ((b14 & 255) >> 4)];
            bArr3[i11 + 2] = bArr[(b14 & 15) << 2];
            bArr3[i11 + 3] = (byte) 61;
        }
        return new String(bArr3, L9.a.a);
    }

    public i g(String str) throws NoSuchAlgorithmException {
        MessageDigest messageDigest = MessageDigest.getInstance(str);
        messageDigest.update(this.f13192s, 0, h());
        byte[] bArrDigest = messageDigest.digest();
        p210v8.i.e(bArrDigest, "digestBytes");
        return new i(bArrDigest);
    }

    public int h() {
        return this.f13192s.length;
    }

    public int hashCode() {
        int i10 = this.f13193t;
        if (i10 != 0) {
            return i10;
        }
        int iHashCode = Arrays.hashCode(this.f13192s);
        this.f13193t = iHashCode;
        return iHashCode;
    }

    public String i() {
        byte[] bArr = this.f13192s;
        char[] cArr = new char[bArr.length * 2];
        int length = bArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            byte b3 = bArr[i10];
            i10++;
            int i12 = i11 + 1;
            char[] cArr2 = na.b.a;
            cArr[i11] = cArr2[(b3 >> 4) & 15];
            i11 += 2;
            cArr[i12] = cArr2[b3 & 15];
        }
        return new String(cArr);
    }

    public byte[] j() {
        return this.f13192s;
    }

    public byte k(int i10) {
        return this.f13192s[i10];
    }

    public boolean l(int i10, int i11, int i12, byte[] bArr) {
        p210v8.i.f(bArr, "other");
        if (i10 < 0) {
            return false;
        }
        byte[] bArr2 = this.f13192s;
        return i10 <= bArr2.length - i12 && i11 >= 0 && i11 <= bArr.length - i12 && o1.f.a(i10, i11, i12, bArr2, bArr);
    }

    public boolean m(i iVar, int i10) {
        p210v8.i.f(iVar, "other");
        return iVar.l(0, 0, i10, this.f13192s);
    }

    public i n() {
        byte b3;
        int i10 = 0;
        while (true) {
            byte[] bArr = this.f13192s;
            if (i10 >= bArr.length) {
                return this;
            }
            byte b7 = bArr[i10];
            byte b10 = (byte) 65;
            if (b7 >= b10 && b7 <= (b3 = (byte) 90)) {
                byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
                p210v8.i.e(bArrCopyOf, "java.util.Arrays.copyOf(this, size)");
                bArrCopyOf[i10] = (byte) (b7 + 32);
                for (int i11 = i10 + 1; i11 < bArrCopyOf.length; i11++) {
                    byte b11 = bArrCopyOf[i11];
                    if (b11 >= b10 && b11 <= b3) {
                        bArrCopyOf[i11] = (byte) (b11 + 32);
                    }
                }
                return new i(bArrCopyOf);
            }
            i10++;
        }
    }

    public final String o() {
        String str = this.f13194u;
        if (str != null) {
            return str;
        }
        byte[] bArrJ = j();
        p210v8.i.f(bArrJ, "<this>");
        String str2 = new String(bArrJ, L9.a.a);
        this.f13194u = str2;
        return str2;
    }

    public void p(f fVar, int i10) {
        p210v8.i.f(fVar, "buffer");
        fVar.b0(this.f13192s, 0, i10);
    }

    /* JADX WARN: Code duplicated, block: B:182:0x01ae A[EDGE_INSN: B:182:0x01ae->B:183:0x01af BREAK  A[LOOP:0: B:7:0x000e->B:244:0x000e]] */
    public String toString() {
        i iVar;
        byte b3;
        int i10;
        byte[] bArr = this.f13192s;
        if (bArr.length == 0) {
            return "[size=0]";
        }
        int length = bArr.length;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        loop0: while (i11 < length) {
            byte b7 = bArr[i11];
            if (b7 < 0) {
                if ((b7 >> 5) != -2) {
                    if ((b7 >> 4) != -2) {
                        if ((b7 >> 3) != -2) {
                            if (i13 == 64) {
                                break;
                            }
                            i12 = -1;
                            break;
                        }
                        int i14 = i11 + 3;
                        if (length > i14) {
                            byte b10 = bArr[i11 + 1];
                            if ((b10 & 192) != 128) {
                                if (i13 == 64) {
                                    break;
                                }
                                i12 = -1;
                                break;
                            }
                            byte b11 = bArr[i11 + 2];
                            if ((b11 & 192) != 128) {
                                if (i13 == 64) {
                                    break;
                                }
                                i12 = -1;
                                break;
                            }
                            byte b12 = bArr[i14];
                            if ((b12 & 192) != 128) {
                                if (i13 == 64) {
                                    break;
                                }
                                i12 = -1;
                                break;
                            }
                            int i15 = (((b12 ^ 3678080) ^ (b11 << 6)) ^ (b10 << 12)) ^ (b7 << 18);
                            if (i15 <= 1114111) {
                                if (55296 <= i15 && i15 <= 57343) {
                                    if (i13 == 64) {
                                        break;
                                    }
                                    i12 = -1;
                                    break;
                                }
                                if (i15 >= 65536) {
                                    i10 = i13 + 1;
                                    if (i13 == 64) {
                                        break;
                                    }
                                    if ((i15 != 10 && i15 != 13 && ((i15 >= 0 && i15 <= 31) || (127 <= i15 && i15 <= 159))) || i15 == 65533) {
                                        i12 = -1;
                                        break;
                                    }
                                    i12 += i15 < 65536 ? 1 : 2;
                                    i11 += 4;
                                    i13 = i10;
                                } else {
                                    if (i13 == 64) {
                                        break;
                                    }
                                    i12 = -1;
                                    break;
                                }
                            } else {
                                if (i13 == 64) {
                                    break;
                                }
                                i12 = -1;
                                break;
                            }
                        } else {
                            if (i13 == 64) {
                                break;
                            }
                            i12 = -1;
                            break;
                        }
                    } else {
                        int i16 = i11 + 2;
                        if (length > i16) {
                            byte b13 = bArr[i11 + 1];
                            if ((b13 & 192) != 128) {
                                if (i13 == 64) {
                                    break;
                                }
                                i12 = -1;
                                break;
                            }
                            byte b14 = bArr[i16];
                            if ((b14 & 192) != 128) {
                                if (i13 == 64) {
                                    break;
                                }
                                i12 = -1;
                                break;
                            }
                            int i17 = ((b14 ^ (-123008)) ^ (b13 << 6)) ^ (b7 << 12);
                            if (i17 >= 2048) {
                                if (55296 <= i17 && i17 <= 57343) {
                                    if (i13 == 64) {
                                        break;
                                    }
                                    i12 = -1;
                                    break;
                                }
                                i10 = i13 + 1;
                                if (i13 == 64) {
                                    break;
                                }
                                if ((i17 != 10 && i17 != 13 && ((i17 >= 0 && i17 <= 31) || (127 <= i17 && i17 <= 159))) || i17 == 65533) {
                                    i12 = -1;
                                    break;
                                }
                                i12 += i17 < 65536 ? 1 : 2;
                                i11 += 3;
                                i13 = i10;
                            } else {
                                if (i13 == 64) {
                                    break;
                                }
                                i12 = -1;
                                break;
                            }
                        } else {
                            if (i13 == 64) {
                                break;
                            }
                            i12 = -1;
                            break;
                        }
                    }
                } else {
                    int i18 = i11 + 1;
                    if (length > i18) {
                        byte b15 = bArr[i18];
                        if ((b15 & 192) != 128) {
                            if (i13 == 64) {
                                break;
                            }
                            i12 = -1;
                            break;
                        }
                        int i19 = (b15 ^ 3968) ^ (b7 << 6);
                        if (i19 >= 128) {
                            i10 = i13 + 1;
                            if (i13 == 64) {
                                break;
                            }
                            if ((i19 != 10 && i19 != 13 && ((i19 >= 0 && i19 <= 31) || (127 <= i19 && i19 <= 159))) || i19 == 65533) {
                                i12 = -1;
                                break;
                            }
                            i12 += i19 < 65536 ? 1 : 2;
                            i11 += 2;
                            i13 = i10;
                        } else {
                            if (i13 == 64) {
                                break;
                            }
                            i12 = -1;
                            break;
                        }
                    } else {
                        if (i13 == 64) {
                            break;
                        }
                        i12 = -1;
                        break;
                    }
                }
            } else {
                int i20 = i13 + 1;
                if (i13 == 64) {
                    break;
                }
                if ((b7 == 10 || b7 == 13 || ((b7 < 0 || b7 > 31) && (127 > b7 || b7 > 159))) && b7 != 65533) {
                    i12 += b7 < 65536 ? 1 : 2;
                    i11++;
                    while (true) {
                        i13 = i20;
                        if (i11 < length && (b3 = bArr[i11]) >= 0) {
                            i11++;
                            i20 = i13 + 1;
                            if (i13 == 64) {
                                break loop0;
                            }
                            if ((b3 == 10 || b3 == 13 || ((b3 < 0 || b3 > 31) && (127 > b3 || b3 > 159))) && b3 != 65533) {
                                i12 += b3 < 65536 ? 1 : 2;
                            }
                        }
                    }
                }
                i12 = -1;
                break;
            }
        }
        if (i12 != -1) {
            String strO = o();
            String strSubstring = strO.substring(0, i12);
            p210v8.i.e(strSubstring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            String strG = L9.n.G(L9.n.G(L9.n.G(strSubstring, "\\", "\\\\"), "\n", "\\n"), "\r", "\\r");
            if (i12 >= strO.length()) {
                return "[text=" + strG + ']';
            }
            return "[size=" + bArr.length + " text=" + strG + "…]";
        }
        if (bArr.length <= 64) {
            return "[hex=" + i() + ']';
        }
        StringBuilder sb = new StringBuilder("[size=");
        sb.append(bArr.length);
        sb.append(" hex=");
        if (64 > bArr.length) {
            throw new IllegalArgumentException(("endIndex > length(" + bArr.length + ')').toString());
        }
        if (64 == bArr.length) {
            iVar = this;
        } else {
            com.bumptech.glide.c.d(64, bArr.length);
            byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, 0, 64);
            p210v8.i.e(bArrCopyOfRange, "copyOfRange(...)");
            iVar = new i(bArrCopyOfRange);
        }
        sb.append(iVar.i());
        sb.append("…]");
        return sb.toString();
    }
}
