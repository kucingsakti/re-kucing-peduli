package ma;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* JADX INFO: loaded from: classes.dex */
public final class u extends i {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final transient byte[][] f13223w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final transient int[] f13224x;

    public u(byte[][] bArr, int[] iArr) {
        super(i.f13191v.f13192s);
        this.f13223w = bArr;
        this.f13224x = iArr;
    }

    @Override // ma.i
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return iVar.h() == h() && m(iVar, h());
    }

    @Override // ma.i
    public final String f() {
        throw null;
    }

    @Override // ma.i
    public final i g(String str) throws NoSuchAlgorithmException {
        MessageDigest messageDigest = MessageDigest.getInstance(str);
        byte[][] bArr = this.f13223w;
        int length = bArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            int[] iArr = this.f13224x;
            int i12 = iArr[length + i10];
            int i13 = iArr[i10];
            messageDigest.update(bArr[i10], i12, i13 - i11);
            i10++;
            i11 = i13;
        }
        byte[] bArrDigest = messageDigest.digest();
        p210v8.i.e(bArrDigest, "digestBytes");
        return new i(bArrDigest);
    }

    @Override // ma.i
    public final int h() {
        return this.f13224x[this.f13223w.length - 1];
    }

    @Override // ma.i
    public final int hashCode() {
        int i10 = this.f13193t;
        if (i10 != 0) {
            return i10;
        }
        byte[][] bArr = this.f13223w;
        int length = bArr.length;
        int i11 = 0;
        int i12 = 1;
        int i13 = 0;
        while (i11 < length) {
            int[] iArr = this.f13224x;
            int i14 = iArr[length + i11];
            int i15 = iArr[i11];
            byte[] bArr2 = bArr[i11];
            int i16 = (i15 - i13) + i14;
            while (i14 < i16) {
                i12 = (i12 * 31) + bArr2[i14];
                i14++;
            }
            i11++;
            i13 = i15;
        }
        this.f13193t = i12;
        return i12;
    }

    @Override // ma.i
    public final String i() {
        return new i(q()).i();
    }

    @Override // ma.i
    public final byte[] j() {
        return q();
    }

    @Override // ma.i
    public final byte k(int i10) {
        byte[][] bArr = this.f13223w;
        int length = bArr.length - 1;
        int[] iArr = this.f13224x;
        o1.f.c(iArr[length], i10, 1L);
        int iB = na.b.b(this, i10);
        return bArr[iB][(i10 - (iB == 0 ? 0 : iArr[iB - 1])) + iArr[bArr.length + iB]];
    }

    @Override // ma.i
    public final boolean l(int i10, int i11, int i12, byte[] bArr) {
        p210v8.i.f(bArr, "other");
        if (i10 < 0 || i10 > h() - i12 || i11 < 0 || i11 > bArr.length - i12) {
            return false;
        }
        int i13 = i12 + i10;
        int iB = na.b.b(this, i10);
        while (i10 < i13) {
            int[] iArr = this.f13224x;
            int i14 = iB == 0 ? 0 : iArr[iB - 1];
            int i15 = iArr[iB] - i14;
            byte[][] bArr2 = this.f13223w;
            int i16 = iArr[bArr2.length + iB];
            int iMin = Math.min(i13, i15 + i14) - i10;
            if (!o1.f.a((i10 - i14) + i16, i11, iMin, bArr2[iB], bArr)) {
                return false;
            }
            i11 += iMin;
            i10 += iMin;
            iB++;
        }
        return true;
    }

    @Override // ma.i
    public final boolean m(i iVar, int i10) {
        p210v8.i.f(iVar, "other");
        if (h() - i10 >= 0) {
            int iB = na.b.b(this, 0);
            int i11 = 0;
            int i12 = 0;
            while (i11 < i10) {
                int[] iArr = this.f13224x;
                int i13 = iB == 0 ? 0 : iArr[iB - 1];
                int i14 = iArr[iB] - i13;
                byte[][] bArr = this.f13223w;
                int i15 = iArr[bArr.length + iB];
                int iMin = Math.min(i10, i14 + i13) - i11;
                if (iVar.l(i12, (i11 - i13) + i15, iMin, bArr[iB])) {
                    i12 += iMin;
                    i11 += iMin;
                    iB++;
                }
            }
            return true;
        }
        return false;
    }

    @Override // ma.i
    public final i n() {
        return new i(q()).n();
    }

    @Override // ma.i
    public final void p(f fVar, int i10) {
        p210v8.i.f(fVar, "buffer");
        int iB = na.b.b(this, 0);
        int i11 = 0;
        while (i11 < i10) {
            int[] iArr = this.f13224x;
            int i12 = iB == 0 ? 0 : iArr[iB - 1];
            int i13 = iArr[iB] - i12;
            byte[][] bArr = this.f13223w;
            int i14 = iArr[bArr.length + iB];
            int iMin = Math.min(i10, i13 + i12) - i11;
            int i15 = (i11 - i12) + i14;
            s sVar = new s(bArr[iB], i15, i15 + iMin, true);
            s sVar2 = fVar.f13189s;
            if (sVar2 == null) {
                sVar.f13220g = sVar;
                sVar.f13219f = sVar;
                fVar.f13189s = sVar;
            } else {
                s sVar3 = sVar2.f13220g;
                p210v8.i.c(sVar3);
                sVar3.b(sVar);
            }
            i11 += iMin;
            iB++;
        }
        fVar.f13190t += (long) i10;
    }

    public final byte[] q() {
        byte[] bArr = new byte[h()];
        byte[][] bArr2 = this.f13223w;
        int length = bArr2.length;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        while (i10 < length) {
            int[] iArr = this.f13224x;
            int i13 = iArr[length + i10];
            int i14 = iArr[i10];
            int i15 = i14 - i11;
            p086i8.i.o(i12, i13, i13 + i15, bArr2[i10], bArr);
            i12 += i15;
            i10++;
            i11 = i14;
        }
        return bArr;
    }

    @Override // ma.i
    public final String toString() {
        return new i(q()).toString();
    }
}
