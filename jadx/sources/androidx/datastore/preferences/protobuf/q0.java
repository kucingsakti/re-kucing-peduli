package androidx.datastore.preferences.protobuf;

import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes.dex */
public final class q0 extends s0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f6506b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q0(Unsafe unsafe, int i10) {
        super(unsafe);
        this.f6506b = i10;
    }

    @Override // androidx.datastore.preferences.protobuf.s0
    public final boolean c(long j, Object obj) {
        switch (this.f6506b) {
            case 0:
                if (t0.f6519h) {
                    if (t0.g(j, obj) == 0) {
                        return false;
                    }
                } else if (t0.h(j, obj) == 0) {
                    return false;
                }
                return true;
            default:
                if (t0.f6519h) {
                    if (t0.g(j, obj) == 0) {
                        return false;
                    }
                } else if (t0.h(j, obj) == 0) {
                    return false;
                }
                return true;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.s0
    public final byte d(long j, Object obj) {
        switch (this.f6506b) {
            case 0:
                return t0.f6519h ? t0.g(j, obj) : t0.h(j, obj);
            default:
                return t0.f6519h ? t0.g(j, obj) : t0.h(j, obj);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.s0
    public final double e(long j, Object obj) {
        switch (this.f6506b) {
            case 0:
                break;
        }
        return Double.longBitsToDouble(h(j, obj));
    }

    @Override // androidx.datastore.preferences.protobuf.s0
    public final float f(long j, Object obj) {
        switch (this.f6506b) {
            case 0:
                break;
        }
        return Float.intBitsToFloat(g(j, obj));
    }

    @Override // androidx.datastore.preferences.protobuf.s0
    public final void k(Object obj, long j, boolean z6) {
        switch (this.f6506b) {
            case 0:
                if (!t0.f6519h) {
                    t0.l(obj, j, z6 ? (byte) 1 : (byte) 0);
                } else {
                    t0.k(obj, j, z6 ? (byte) 1 : (byte) 0);
                }
                break;
            default:
                if (!t0.f6519h) {
                    t0.l(obj, j, z6 ? (byte) 1 : (byte) 0);
                } else {
                    t0.k(obj, j, z6 ? (byte) 1 : (byte) 0);
                }
                break;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.s0
    public final void l(Object obj, long j, byte b3) {
        switch (this.f6506b) {
            case 0:
                if (!t0.f6519h) {
                    t0.l(obj, j, b3);
                } else {
                    t0.k(obj, j, b3);
                }
                break;
            default:
                if (!t0.f6519h) {
                    t0.l(obj, j, b3);
                } else {
                    t0.k(obj, j, b3);
                }
                break;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.s0
    public final void m(Object obj, long j, double d3) {
        switch (this.f6506b) {
            case 0:
                p(obj, j, Double.doubleToLongBits(d3));
                break;
            default:
                p(obj, j, Double.doubleToLongBits(d3));
                break;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.s0
    public final void n(Object obj, long j, float f10) {
        switch (this.f6506b) {
            case 0:
                o(obj, j, Float.floatToIntBits(f10));
                break;
            default:
                o(obj, j, Float.floatToIntBits(f10));
                break;
        }
    }
}
