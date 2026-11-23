package com.google.android.gms.internal.measurement;

import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes.dex */
public abstract class I0 {
    public final Unsafe a;

    public I0(Unsafe unsafe) {
        this.a = unsafe;
    }

    public abstract double a(long j, Object obj);

    public abstract void b(Object obj, long j, byte b3);

    public abstract void c(Object obj, long j, double d3);

    public abstract void d(Object obj, long j, float f10);

    public final void e(Object obj, long j, int i10) {
        this.a.putInt(obj, j, i10);
    }

    public final void f(Object obj, long j, long j10) {
        this.a.putLong(obj, j, j10);
    }

    public abstract void g(Object obj, long j, boolean z6);

    public abstract float h(long j, Object obj);

    public abstract boolean i(long j, Object obj);

    public final int j(long j, Object obj) {
        return this.a.getInt(obj, j);
    }

    public final long k(long j, Object obj) {
        return this.a.getLong(obj, j);
    }
}
