package androidx.datastore.preferences.protobuf;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class k0 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final k0 f6494f = new k0(0, new int[0], new Object[0], false);
    public int a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int[] f6495b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object[] f6496c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f6497d = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f6498e;

    public k0(int i10, int[] iArr, Object[] objArr, boolean z6) {
        this.a = i10;
        this.f6495b = iArr;
        this.f6496c = objArr;
        this.f6498e = z6;
    }

    public static k0 b() {
        return new k0(0, new int[8], new Object[8], true);
    }

    public final int a() {
        int iY;
        int iA;
        int iU;
        int i10 = this.f6497d;
        if (i10 != -1) {
            return i10;
        }
        int i11 = 0;
        for (int i12 = 0; i12 < this.a; i12++) {
            int i13 = this.f6495b[i12];
            int i14 = i13 >>> 3;
            int i15 = i13 & 7;
            if (i15 != 0) {
                if (i15 == 1) {
                    ((Long) this.f6496c[i12]).getClass();
                    iU = C0491k.u(i14);
                } else if (i15 == 2) {
                    iU = C0491k.r(i14, (C0488h) this.f6496c[i12]);
                } else if (i15 == 3) {
                    iY = C0491k.y(i14) * 2;
                    iA = ((k0) this.f6496c[i12]).a();
                } else {
                    if (i15 != 5) {
                        throw new IllegalStateException(InvalidProtocolBufferException.b());
                    }
                    ((Integer) this.f6496c[i12]).getClass();
                    iU = C0491k.t(i14);
                }
                i11 = iU + i11;
            } else {
                long jLongValue = ((Long) this.f6496c[i12]).longValue();
                iY = C0491k.y(i14);
                iA = C0491k.A(jLongValue);
            }
            i11 = iA + iY + i11;
        }
        this.f6497d = i11;
        return i11;
    }

    public final void c(int i10, Object obj) {
        if (!this.f6498e) {
            throw new UnsupportedOperationException();
        }
        int i11 = this.a;
        int[] iArr = this.f6495b;
        if (i11 == iArr.length) {
            int i12 = i11 + (i11 < 4 ? 8 : i11 >> 1);
            this.f6495b = Arrays.copyOf(iArr, i12);
            this.f6496c = Arrays.copyOf(this.f6496c, i12);
        }
        int[] iArr2 = this.f6495b;
        int i13 = this.a;
        iArr2[i13] = i10;
        this.f6496c[i13] = obj;
        this.a = i13 + 1;
    }

    public final void d(I i10) {
        if (this.a == 0) {
            return;
        }
        i10.getClass();
        for (int i11 = 0; i11 < this.a; i11++) {
            int i12 = this.f6495b[i11];
            Object obj = this.f6496c[i11];
            int i13 = i12 >>> 3;
            int i14 = i12 & 7;
            C0491k c0491k = (C0491k) i10.a;
            if (i14 == 0) {
                c0491k.U(i13, ((Long) obj).longValue());
            } else if (i14 == 1) {
                c0491k.K(i13, ((Long) obj).longValue());
            } else if (i14 == 2) {
                i10.a(i13, (C0488h) obj);
            } else if (i14 == 3) {
                c0491k.R(i13, 3);
                ((k0) obj).d(i10);
                c0491k.R(i13, 4);
            } else {
                if (i14 != 5) {
                    throw new RuntimeException(InvalidProtocolBufferException.b());
                }
                c0491k.I(i13, ((Integer) obj).intValue());
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof k0)) {
            return false;
        }
        k0 k0Var = (k0) obj;
        int i10 = this.a;
        if (i10 == k0Var.a) {
            int[] iArr = this.f6495b;
            int[] iArr2 = k0Var.f6495b;
            for (int i11 = 0; i11 < i10; i11++) {
                if (iArr[i11] == iArr2[i11]) {
                }
            }
            Object[] objArr = this.f6496c;
            Object[] objArr2 = k0Var.f6496c;
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
        int i11 = (527 + i10) * 31;
        int[] iArr = this.f6495b;
        int iHashCode = 17;
        int i12 = 17;
        for (int i13 = 0; i13 < i10; i13++) {
            i12 = (i12 * 31) + iArr[i13];
        }
        int i14 = (i11 + i12) * 31;
        Object[] objArr = this.f6496c;
        int i15 = this.a;
        for (int i16 = 0; i16 < i15; i16++) {
            iHashCode = (iHashCode * 31) + objArr[i16].hashCode();
        }
        return i14 + iHashCode;
    }
}
