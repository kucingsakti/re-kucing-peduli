package com.google.android.gms.internal.measurement;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes.dex */
public abstract class J0 {
    public static final Unsafe a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Class f8348b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final I0 f8349c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final boolean f8350d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final boolean f8351e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final long f8352f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final boolean f8353g;

    /* JADX WARN: Code duplicated, block: B:11:0x0048  */
    /* JADX WARN: Code duplicated, block: B:49:0x016d A[PHI: r0
      0x016d: PHI (r0v41 java.lang.reflect.Field) = (r0v34 java.lang.reflect.Field), (r0v36 java.lang.reflect.Field) binds: [B:48:0x016b, B:55:0x017b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:8:0x002b  */
    static {
        H0 h10;
        Unsafe unsafe;
        Field declaredField;
        boolean z6;
        Unsafe unsafe2;
        boolean z10;
        Field declaredField2;
        Field field;
        I0 i10;
        Unsafe unsafeF = f();
        a = unsafeF;
        f8348b = V.a;
        Class<?> cls = Long.TYPE;
        boolean zJ = j(cls);
        Class<?> cls2 = Integer.TYPE;
        boolean zJ2 = j(cls2);
        if (unsafeF == null) {
            h10 = null;
        } else if (zJ) {
            h10 = new H0(unsafeF, 1);
        } else if (zJ2) {
            h10 = new H0(unsafeF, 0);
        } else {
            h10 = null;
        }
        f8349c = h10;
        if (h10 == null || (unsafe = h10.a) == null) {
            z6 = false;
        } else {
            try {
                Class<?> cls3 = unsafe.getClass();
                cls3.getMethod("objectFieldOffset", Field.class);
                cls3.getMethod("getLong", Object.class, cls);
                try {
                    declaredField = Buffer.class.getDeclaredField("effectiveDirectAddress");
                } catch (Throwable unused) {
                    declaredField = null;
                }
                if (declaredField == null) {
                    try {
                        declaredField = Buffer.class.getDeclaredField("address");
                    } catch (Throwable unused2) {
                        declaredField = null;
                    }
                    if (declaredField == null || declaredField.getType() != cls) {
                        declaredField = null;
                    }
                }
                if (declaredField == null) {
                    z6 = false;
                } else {
                    z6 = true;
                }
            } catch (Throwable th) {
                Logger.getLogger(J0.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(String.valueOf(th)));
            }
        }
        f8350d = z6;
        I0 i11 = f8349c;
        if (i11 == null || (unsafe2 = i11.a) == null) {
            z10 = false;
        } else {
            try {
                Class<?> cls4 = unsafe2.getClass();
                cls4.getMethod("objectFieldOffset", Field.class);
                cls4.getMethod("arrayBaseOffset", Class.class);
                cls4.getMethod("arrayIndexScale", Class.class);
                cls4.getMethod("getInt", Object.class, cls);
                cls4.getMethod("putInt", Object.class, cls, cls2);
                cls4.getMethod("getLong", Object.class, cls);
                cls4.getMethod("putLong", Object.class, cls, cls);
                cls4.getMethod("getObject", Object.class, cls);
                cls4.getMethod("putObject", Object.class, cls, Object.class);
                z10 = true;
            } catch (Throwable th2) {
                Logger.getLogger(J0.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(String.valueOf(th2)));
                z10 = false;
            }
        }
        f8351e = z10;
        f8352f = e(byte[].class);
        e(boolean[].class);
        g(boolean[].class);
        e(int[].class);
        g(int[].class);
        e(long[].class);
        g(long[].class);
        e(float[].class);
        g(float[].class);
        e(double[].class);
        g(double[].class);
        e(Object[].class);
        g(Object[].class);
        try {
            declaredField2 = Buffer.class.getDeclaredField("effectiveDirectAddress");
        } catch (Throwable unused3) {
            declaredField2 = null;
        }
        if (declaredField2 != null) {
            field = declaredField2;
        } else {
            try {
                declaredField2 = Buffer.class.getDeclaredField("address");
            } catch (Throwable unused4) {
                declaredField2 = null;
            }
            if (declaredField2 == null || declaredField2.getType() != cls) {
                field = null;
            } else {
                field = declaredField2;
            }
        }
        if (field != null && (i10 = f8349c) != null) {
            i10.a.objectFieldOffset(field);
        }
        f8353g = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    public static Object a(Class cls) {
        try {
            return a.allocateInstance(cls);
        } catch (InstantiationException e10) {
            throw new IllegalStateException(e10);
        }
    }

    public static void b(long j, Object obj, Object obj2) {
        f8349c.a.putObject(obj, j, obj2);
    }

    public static void c(Object obj, long j, int i10) {
        f8349c.e(obj, j, i10);
    }

    public static void d(Object obj, long j, long j10) {
        f8349c.f(obj, j, j10);
    }

    public static int e(Class cls) {
        if (f8351e) {
            return f8349c.a.arrayBaseOffset(cls);
        }
        return -1;
    }

    public static Unsafe f() {
        try {
            return (Unsafe) AccessController.doPrivileged(new K0());
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void g(Class cls) {
        if (f8351e) {
            f8349c.a.arrayIndexScale(cls);
        }
    }

    public static void h(Object obj, long j, byte b3) {
        long j10 = (-4) & j;
        int iJ = f8349c.j(j10, obj);
        int i10 = ((~((int) j)) & 3) << 3;
        c(obj, j10, ((255 & b3) << i10) | (iJ & (~(255 << i10))));
    }

    public static void i(Object obj, long j, byte b3) {
        long j10 = (-4) & j;
        int i10 = (((int) j) & 3) << 3;
        c(obj, j10, ((255 & b3) << i10) | (f8349c.j(j10, obj) & (~(255 << i10))));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean j(Class cls) {
        try {
            Class cls2 = f8348b;
            Class cls3 = Boolean.TYPE;
            cls2.getMethod("peekLong", cls, cls3);
            cls2.getMethod("pokeLong", cls, Long.TYPE, cls3);
            Class cls4 = Integer.TYPE;
            cls2.getMethod("pokeInt", cls, cls4, cls3);
            cls2.getMethod("peekInt", cls, cls3);
            cls2.getMethod("pokeByte", cls, Byte.TYPE);
            cls2.getMethod("peekByte", cls);
            cls2.getMethod("pokeByteArray", cls, byte[].class, cls4, cls4);
            cls2.getMethod("peekByteArray", cls, byte[].class, cls4, cls4);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static Object k(long j, Object obj) {
        return f8349c.a.getObject(obj, j);
    }
}
