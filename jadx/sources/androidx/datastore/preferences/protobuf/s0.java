package androidx.datastore.preferences.protobuf;

import java.lang.reflect.Field;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes.dex */
public abstract class s0 {
    public final Unsafe a;

    public s0(Unsafe unsafe) {
        this.a = unsafe;
    }

    public final int a(Class cls) {
        return this.a.arrayBaseOffset(cls);
    }

    public final int b(Class cls) {
        return this.a.arrayIndexScale(cls);
    }

    public abstract boolean c(long j, Object obj);

    public abstract byte d(long j, Object obj);

    public abstract double e(long j, Object obj);

    public abstract float f(long j, Object obj);

    public final int g(long j, Object obj) {
        return this.a.getInt(obj, j);
    }

    public final long h(long j, Object obj) {
        return this.a.getLong(obj, j);
    }

    public final Object i(long j, Object obj) {
        return this.a.getObject(obj, j);
    }

    public final long j(Field field) {
        return this.a.objectFieldOffset(field);
    }

    public abstract void k(Object obj, long j, boolean z6);

    public abstract void l(Object obj, long j, byte b3);

    public abstract void m(Object obj, long j, double d3);

    public abstract void n(Object obj, long j, float f10);

    public final void o(Object obj, long j, int i10) {
        this.a.putInt(obj, j, i10);
    }

    public final void p(Object obj, long j, long j10) {
        this.a.putLong(obj, j, j10);
    }

    public final void q(long j, Object obj, Object obj2) {
        this.a.putObject(obj, j, obj2);
    }
}
