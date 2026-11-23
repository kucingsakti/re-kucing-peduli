package p048ea;

import E.g;
import java.io.IOException;
import java.util.ArrayList;
import ma.f;
import ma.r;
import p068ga.d;
import p210v8.i;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final r f11269c;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f11272f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f11273g;
    public int a = 4096;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f11268b = new ArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public b[] f11270d = new b[8];

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f11271e = 7;

    public c(r rVar) {
        this.f11269c = d.d(rVar);
    }

    public final int a(int i10) {
        int i11;
        int i12 = 0;
        if (i10 > 0) {
            int length = this.f11270d.length;
            while (true) {
                length--;
                i11 = this.f11271e;
                if (length < i11 || i10 <= 0) {
                    break;
                }
                b bVar = this.f11270d[length];
                i.c(bVar);
                int i13 = bVar.f11267c;
                i10 -= i13;
                this.f11273g -= i13;
                this.f11272f--;
                i12++;
            }
            b[] bVarArr = this.f11270d;
            System.arraycopy(bVarArr, i11 + 1, bVarArr, i11 + 1 + i12, this.f11272f);
            this.f11271e += i12;
        }
        return i12;
    }

    public final ma.i b(int i10) throws IOException {
        if (i10 >= 0) {
            b[] bVarArr = e.a;
            if (i10 <= bVarArr.length - 1) {
                return bVarArr[i10].a;
            }
        }
        int length = this.f11271e + 1 + (i10 - e.a.length);
        if (length >= 0) {
            b[] bVarArr2 = this.f11270d;
            if (length < bVarArr2.length) {
                b bVar = bVarArr2[length];
                i.c(bVar);
                return bVar.a;
            }
        }
        throw new IOException(i.k(Integer.valueOf(i10 + 1), "Header index too large "));
    }

    public final void c(b bVar) {
        this.f11268b.add(bVar);
        int i10 = this.a;
        int i11 = bVar.f11267c;
        if (i11 > i10) {
            b[] bVarArr = this.f11270d;
            p086i8.i.t(0, bVarArr.length, bVarArr);
            this.f11271e = this.f11270d.length - 1;
            this.f11272f = 0;
            this.f11273g = 0;
            return;
        }
        a((this.f11273g + i11) - i10);
        int i12 = this.f11272f + 1;
        b[] bVarArr2 = this.f11270d;
        if (i12 > bVarArr2.length) {
            b[] bVarArr3 = new b[bVarArr2.length * 2];
            System.arraycopy(bVarArr2, 0, bVarArr3, bVarArr2.length, bVarArr2.length);
            this.f11271e = this.f11270d.length - 1;
            this.f11270d = bVarArr3;
        }
        int i13 = this.f11271e;
        this.f11271e = i13 - 1;
        this.f11270d[i13] = bVar;
        this.f11272f++;
        this.f11273g += i11;
    }

    public final ma.i d() {
        int i10;
        r rVar = this.f11269c;
        byte bC = rVar.c();
        byte[] bArr = Y9.c.a;
        int i11 = bC & 255;
        int i12 = 0;
        boolean z6 = (bC & 128) == 128;
        long jE = e(i11, 127);
        if (!z6) {
            return rVar.g(jE);
        }
        f fVar = new f();
        int[] iArr = x.a;
        i.f(rVar, "source");
        g gVar = x.f11375c;
        g gVar2 = gVar;
        long j = 0;
        int i13 = 0;
        while (j < jE) {
            j++;
            byte bC2 = rVar.c();
            byte[] bArr2 = Y9.c.a;
            i12 = (i12 << 8) | (bC2 & 255);
            i13 += 8;
            while (i13 >= 8) {
                g[] gVarArr = (g[]) gVar2.f1166u;
                i.c(gVarArr);
                gVar2 = gVarArr[(i12 >>> (i13 - 8)) & 255];
                i.c(gVar2);
                if (((g[]) gVar2.f1166u) == null) {
                    fVar.d0(gVar2.f1164s);
                    i13 -= gVar2.f1165t;
                    gVar2 = gVar;
                } else {
                    i13 -= 8;
                }
            }
        }
        while (i13 > 0) {
            g[] gVarArr2 = (g[]) gVar2.f1166u;
            i.c(gVarArr2);
            g gVar3 = gVarArr2[(i12 << (8 - i13)) & 255];
            i.c(gVar3);
            if (((g[]) gVar3.f1166u) != null || (i10 = gVar3.f1165t) > i13) {
                break;
            }
            fVar.d0(gVar3.f1164s);
            i13 -= i10;
            gVar2 = gVar;
        }
        return fVar.B(fVar.f13190t);
    }

    public final int e(int i10, int i11) {
        int i12 = i10 & i11;
        if (i12 < i11) {
            return i12;
        }
        int i13 = 0;
        while (true) {
            byte bC = this.f11269c.c();
            byte[] bArr = Y9.c.a;
            int i14 = bC & 255;
            if ((bC & 128) == 0) {
                return i11 + (i14 << i13);
            }
            i11 += (bC & 127) << i13;
            i13 += 7;
        }
    }
}
