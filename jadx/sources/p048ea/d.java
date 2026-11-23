package p048ea;

import Y9.c;
import com.unity3d.services.core.device.reader.JsonStorageKeyNames;
import java.io.EOFException;
import java.util.ArrayList;
import java.util.Arrays;
import ma.f;
import p210v8.i;

/* JADX INFO: loaded from: classes.dex */
public final class d {
    public final f a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f11275c;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f11279g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f11280h;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f11274b = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f11276d = 4096;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public b[] f11277e = new b[8];

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f11278f = 7;

    public d(f fVar) {
        this.a = fVar;
    }

    public final void a(int i10) {
        int i11;
        if (i10 > 0) {
            int length = this.f11277e.length - 1;
            int i12 = 0;
            while (true) {
                i11 = this.f11278f;
                if (length < i11 || i10 <= 0) {
                    break;
                }
                b bVar = this.f11277e[length];
                i.c(bVar);
                i10 -= bVar.f11267c;
                int i13 = this.f11280h;
                b bVar2 = this.f11277e[length];
                i.c(bVar2);
                this.f11280h = i13 - bVar2.f11267c;
                this.f11279g--;
                i12++;
                length--;
            }
            b[] bVarArr = this.f11277e;
            int i14 = i11 + 1;
            System.arraycopy(bVarArr, i14, bVarArr, i14 + i12, this.f11279g);
            b[] bVarArr2 = this.f11277e;
            int i15 = this.f11278f + 1;
            Arrays.fill(bVarArr2, i15, i15 + i12, (Object) null);
            this.f11278f += i12;
        }
    }

    public final void b(b bVar) {
        int i10 = this.f11276d;
        int i11 = bVar.f11267c;
        if (i11 > i10) {
            b[] bVarArr = this.f11277e;
            p086i8.i.t(0, bVarArr.length, bVarArr);
            this.f11278f = this.f11277e.length - 1;
            this.f11279g = 0;
            this.f11280h = 0;
            return;
        }
        a((this.f11280h + i11) - i10);
        int i12 = this.f11279g + 1;
        b[] bVarArr2 = this.f11277e;
        if (i12 > bVarArr2.length) {
            b[] bVarArr3 = new b[bVarArr2.length * 2];
            System.arraycopy(bVarArr2, 0, bVarArr3, bVarArr2.length, bVarArr2.length);
            this.f11278f = this.f11277e.length - 1;
            this.f11277e = bVarArr3;
        }
        int i13 = this.f11278f;
        this.f11278f = i13 - 1;
        this.f11277e[i13] = bVar;
        this.f11279g++;
        this.f11280h += i11;
    }

    public final void c(ma.i iVar) throws EOFException {
        i.f(iVar, JsonStorageKeyNames.DATA_KEY);
        f fVar = this.a;
        int[] iArr = x.a;
        int iH = iVar.h();
        int i10 = 0;
        int i11 = 0;
        long j = 0;
        while (i11 < iH) {
            int i12 = i11 + 1;
            byte bK = iVar.k(i11);
            byte[] bArr = c.a;
            j += (long) x.f11374b[bK & 255];
            i11 = i12;
        }
        if (((int) ((j + ((long) 7)) >> 3)) >= iVar.h()) {
            e(iVar.h(), 127, 0);
            fVar.a0(iVar);
            return;
        }
        f fVar2 = new f();
        int[] iArr2 = x.a;
        int iH2 = iVar.h();
        long j10 = 0;
        int i13 = 0;
        while (i10 < iH2) {
            int i14 = i10 + 1;
            byte bK2 = iVar.k(i10);
            byte[] bArr2 = c.a;
            int i15 = bK2 & 255;
            int i16 = x.a[i15];
            byte b3 = x.f11374b[i15];
            j10 = (j10 << b3) | ((long) i16);
            i13 += b3;
            while (i13 >= 8) {
                i13 -= 8;
                fVar2.d0((int) (j10 >> i13));
            }
            i10 = i14;
        }
        if (i13 > 0) {
            fVar2.d0((int) ((255 >>> i13) | (j10 << (8 - i13))));
        }
        ma.i iVarB = fVar2.B(fVar2.f13190t);
        e(iVarB.h(), 127, 128);
        fVar.a0(iVarB);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x006b  */
    public final void d(ArrayList arrayList) throws EOFException {
        int length;
        int length2;
        if (this.f11275c) {
            int i10 = this.f11274b;
            if (i10 < this.f11276d) {
                e(i10, 31, 32);
            }
            this.f11275c = false;
            this.f11274b = Integer.MAX_VALUE;
            e(this.f11276d, 31, 32);
        }
        int size = arrayList.size();
        int i11 = 0;
        while (i11 < size) {
            int i12 = i11 + 1;
            b bVar = (b) arrayList.get(i11);
            ma.i iVarN = bVar.a.n();
            Integer num = (Integer) e.f11281b.get(iVarN);
            ma.i iVar = bVar.f11266b;
            if (num != null) {
                int iIntValue = num.intValue();
                length2 = iIntValue + 1;
                if (2 > length2 || length2 >= 8) {
                    length = length2;
                    length2 = -1;
                } else {
                    b[] bVarArr = e.a;
                    if (i.a(bVarArr[iIntValue].f11266b, iVar)) {
                        length = length2;
                    } else if (i.a(bVarArr[length2].f11266b, iVar)) {
                        length2 = iIntValue + 2;
                        length = length2;
                    } else {
                        length = length2;
                        length2 = -1;
                    }
                }
            } else {
                length = -1;
                length2 = -1;
            }
            if (length2 == -1) {
                int i13 = this.f11278f + 1;
                int length3 = this.f11277e.length;
                while (i13 < length3) {
                    int i14 = i13 + 1;
                    b bVar2 = this.f11277e[i13];
                    i.c(bVar2);
                    if (i.a(bVar2.a, iVarN)) {
                        b bVar3 = this.f11277e[i13];
                        i.c(bVar3);
                        if (i.a(bVar3.f11266b, iVar)) {
                            length2 = e.a.length + (i13 - this.f11278f);
                            break;
                        } else if (length == -1) {
                            length = e.a.length + (i13 - this.f11278f);
                        }
                    }
                    i13 = i14;
                }
            }
            if (length2 != -1) {
                e(length2, 127, 128);
            } else if (length == -1) {
                this.a.d0(64);
                c(iVarN);
                c(iVar);
                b(bVar);
            } else {
                ma.i iVar2 = b.f11260d;
                iVarN.getClass();
                i.f(iVar2, "prefix");
                if (!iVarN.m(iVar2, iVar2.h()) || i.a(b.f11265i, iVarN)) {
                    e(length, 63, 64);
                    c(iVar);
                    b(bVar);
                } else {
                    e(length, 15, 0);
                    c(iVar);
                }
            }
            i11 = i12;
        }
    }

    public final void e(int i10, int i11, int i12) {
        f fVar = this.a;
        if (i10 < i11) {
            fVar.d0(i10 | i12);
            return;
        }
        fVar.d0(i12 | i11);
        int i13 = i10 - i11;
        while (i13 >= 128) {
            fVar.d0(128 | (i13 & 127));
            i13 >>>= 7;
        }
        fVar.d0(i13);
    }
}
