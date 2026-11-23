package androidx.datastore.preferences.protobuf;

/* JADX INFO: loaded from: classes.dex */
public final class r0 extends s0 {
    @Override // androidx.datastore.preferences.protobuf.s0
    public final boolean c(long j, Object obj) {
        return this.a.getBoolean(obj, j);
    }

    @Override // androidx.datastore.preferences.protobuf.s0
    public final byte d(long j, Object obj) {
        return this.a.getByte(obj, j);
    }

    @Override // androidx.datastore.preferences.protobuf.s0
    public final double e(long j, Object obj) {
        return this.a.getDouble(obj, j);
    }

    @Override // androidx.datastore.preferences.protobuf.s0
    public final float f(long j, Object obj) {
        return this.a.getFloat(obj, j);
    }

    @Override // androidx.datastore.preferences.protobuf.s0
    public final void k(Object obj, long j, boolean z6) {
        this.a.putBoolean(obj, j, z6);
    }

    @Override // androidx.datastore.preferences.protobuf.s0
    public final void l(Object obj, long j, byte b3) {
        this.a.putByte(obj, j, b3);
    }

    @Override // androidx.datastore.preferences.protobuf.s0
    public final void m(Object obj, long j, double d3) {
        this.a.putDouble(obj, j, d3);
    }

    @Override // androidx.datastore.preferences.protobuf.s0
    public final void n(Object obj, long j, float f10) {
        this.a.putFloat(obj, j, f10);
    }
}
