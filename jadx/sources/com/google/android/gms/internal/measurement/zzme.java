package com.google.android.gms.internal.measurement;

import androidx.datastore.preferences.protobuf.AbstractC0487g;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class zzme {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final zzme f8702f = new zzme(0, new int[0], new Object[0], false);
    public int a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int[] f8703b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object[] f8704c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f8705d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f8706e;

    private zzme() {
        this(0, new int[8], new Object[8], true);
    }

    public static zzme e() {
        return new zzme();
    }

    public final int a() {
        int iG;
        int iE;
        int i10 = this.f8705d;
        if (i10 != -1) {
            return i10;
        }
        int iT = 0;
        for (int i11 = 0; i11 < this.a; i11++) {
            int i12 = this.f8703b[i11];
            int i13 = i12 >>> 3;
            int i14 = i12 & 7;
            if (i14 != 0) {
                if (i14 == 1) {
                    ((Long) this.f8704c[i11]).getClass();
                    iT = AbstractC0487g.t(i13 << 3, 8, iT);
                } else if (i14 == 2) {
                    iT = zzit.d(i13, (zzia) this.f8704c[i11]) + iT;
                } else if (i14 == 3) {
                    iG = zzit.f(i13) << 1;
                    iE = ((zzme) this.f8704c[i11]).a();
                } else {
                    if (i14 != 5) {
                        throw new IllegalStateException(zzjs.a());
                    }
                    ((Integer) this.f8704c[i11]).getClass();
                    iT = AbstractC0487g.t(i13 << 3, 4, iT);
                }
            } else {
                long jLongValue = ((Long) this.f8704c[i11]).longValue();
                iG = zzit.g(i13 << 3);
                iE = zzit.e(jLongValue);
            }
            iT = iE + iG + iT;
        }
        this.f8705d = iT;
        return iT;
    }

    public final void b(int i10) {
        int[] iArr = this.f8703b;
        if (i10 > iArr.length) {
            int i11 = this.a;
            int i12 = (i11 / 2) + i11;
            if (i12 >= i10) {
                i10 = i12;
            }
            if (i10 < 8) {
                i10 = 8;
            }
            this.f8703b = Arrays.copyOf(iArr, i10);
            this.f8704c = Arrays.copyOf(this.f8704c, i10);
        }
    }

    public final void c(int i10, Object obj) {
        if (!this.f8706e) {
            throw new UnsupportedOperationException();
        }
        b(this.a + 1);
        int[] iArr = this.f8703b;
        int i11 = this.a;
        iArr[i11] = i10;
        this.f8704c[i11] = obj;
        this.a = i11 + 1;
    }

    public final void d(t0 t0Var) {
        if (this.a == 0) {
            return;
        }
        t0Var.getClass();
        for (int i10 = 0; i10 < this.a; i10++) {
            int i11 = this.f8703b[i10];
            Object obj = this.f8704c[i10];
            int i12 = i11 >>> 3;
            int i13 = i11 & 7;
            C0569f0 c0569f0 = (C0569f0) t0Var.a;
            if (i13 == 0) {
                c0569f0.u(i12, ((Long) obj).longValue());
            } else if (i13 == 1) {
                c0569f0.m(i12, ((Long) obj).longValue());
            } else if (i13 == 2) {
                c0569f0.n(i12, (zzia) obj);
            } else if (i13 == 3) {
                c0569f0.x(i12, 3);
                ((zzme) obj).d(t0Var);
                c0569f0.x(i12, 4);
            } else {
                if (i13 != 5) {
                    throw new RuntimeException(zzjs.a());
                }
                c0569f0.l(i12, ((Integer) obj).intValue());
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof zzme)) {
            return false;
        }
        zzme zzmeVar = (zzme) obj;
        int i10 = this.a;
        if (i10 == zzmeVar.a) {
            int[] iArr = this.f8703b;
            int[] iArr2 = zzmeVar.f8703b;
            for (int i11 = 0; i11 < i10; i11++) {
                if (iArr[i11] == iArr2[i11]) {
                }
            }
            Object[] objArr = this.f8704c;
            Object[] objArr2 = zzmeVar.f8704c;
            int i12 = this.a;
            for (int i13 = 0; i13 < i12; i13++) {
                if (objArr[i13].equals(objArr2[i13])) {
                }
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10 = this.a;
        int i11 = (i10 + 527) * 31;
        int[] iArr = this.f8703b;
        int iHashCode = 17;
        int i12 = 17;
        for (int i13 = 0; i13 < i10; i13++) {
            i12 = (i12 * 31) + iArr[i13];
        }
        int i14 = (i11 + i12) * 31;
        Object[] objArr = this.f8704c;
        int i15 = this.a;
        for (int i16 = 0; i16 < i15; i16++) {
            iHashCode = (iHashCode * 31) + objArr[i16].hashCode();
        }
        return i14 + iHashCode;
    }

    public zzme(int i10, int[] iArr, Object[] objArr, boolean z6) {
        this.f8705d = -1;
        this.a = i10;
        this.f8703b = iArr;
        this.f8704c = objArr;
        this.f8706e = z6;
    }
}
