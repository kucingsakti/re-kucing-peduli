package com.google.android.gms.internal.measurement;

import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes.dex */
public final class H0 extends I0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f8347b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ H0(Unsafe unsafe, int i10) {
        super(unsafe);
        this.f8347b = i10;
    }

    @Override // com.google.android.gms.internal.measurement.I0
    public final double a(long j, Object obj) {
        switch (this.f8347b) {
            case 0:
                break;
        }
        return Double.longBitsToDouble(k(j, obj));
    }

    @Override // com.google.android.gms.internal.measurement.I0
    public final void b(Object obj, long j, byte b3) {
        switch (this.f8347b) {
            case 0:
                if (!J0.f8353g) {
                    J0.i(obj, j, b3);
                } else {
                    J0.h(obj, j, b3);
                }
                break;
            default:
                if (!J0.f8353g) {
                    J0.i(obj, j, b3);
                } else {
                    J0.h(obj, j, b3);
                }
                break;
        }
    }

    @Override // com.google.android.gms.internal.measurement.I0
    public final void c(Object obj, long j, double d3) {
        switch (this.f8347b) {
            case 0:
                f(obj, j, Double.doubleToLongBits(d3));
                break;
            default:
                f(obj, j, Double.doubleToLongBits(d3));
                break;
        }
    }

    @Override // com.google.android.gms.internal.measurement.I0
    public final void d(Object obj, long j, float f10) {
        switch (this.f8347b) {
            case 0:
                e(obj, j, Float.floatToIntBits(f10));
                break;
            default:
                e(obj, j, Float.floatToIntBits(f10));
                break;
        }
    }

    @Override // com.google.android.gms.internal.measurement.I0
    public final void g(Object obj, long j, boolean z6) {
        switch (this.f8347b) {
            case 0:
                if (!J0.f8353g) {
                    J0.i(obj, j, z6 ? (byte) 1 : (byte) 0);
                } else {
                    J0.h(obj, j, z6 ? (byte) 1 : (byte) 0);
                }
                break;
            default:
                if (!J0.f8353g) {
                    J0.i(obj, j, z6 ? (byte) 1 : (byte) 0);
                } else {
                    J0.h(obj, j, z6 ? (byte) 1 : (byte) 0);
                }
                break;
        }
    }

    @Override // com.google.android.gms.internal.measurement.I0
    public final float h(long j, Object obj) {
        switch (this.f8347b) {
            case 0:
                break;
        }
        return Float.intBitsToFloat(j(j, obj));
    }

    @Override // com.google.android.gms.internal.measurement.I0
    public final boolean i(long j, Object obj) {
        switch (this.f8347b) {
            case 0:
                if (J0.f8353g) {
                    if (((byte) (J0.f8349c.j((-4) & j, obj) >>> ((int) (((~j) & 3) << 3)))) == 0) {
                        return false;
                    }
                } else {
                    if (((byte) (J0.f8349c.j((-4) & j, obj) >>> ((int) ((j & 3) << 3)))) == 0) {
                        return false;
                    }
                }
                return true;
            default:
                if (J0.f8353g) {
                    if (((byte) (J0.f8349c.j((-4) & j, obj) >>> ((int) (((~j) & 3) << 3)))) == 0) {
                        return false;
                    }
                } else {
                    if (((byte) (J0.f8349c.j((-4) & j, obj) >>> ((int) ((j & 3) << 3)))) == 0) {
                        return false;
                    }
                }
                return true;
        }
    }
}
