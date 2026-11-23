package androidx.datastore.preferences.protobuf;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes.dex */
public abstract class t0 {
    public static final Logger a = Logger.getLogger(t0.class.getName());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Unsafe f6513b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Class f6514c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final s0 f6515d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final boolean f6516e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final boolean f6517f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final long f6518g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final boolean f6519h;

    /* JADX WARN: Code duplicated, block: B:69:0x0267  */
    /* JADX WARN: Code duplicated, block: B:70:0x026a  */
    static {
        boolean z6;
        boolean z10;
        boolean z11;
        Field fieldD;
        boolean z12;
        s0 s0Var;
        Unsafe unsafeI = i();
        f6513b = unsafeI;
        f6514c = AbstractC0482c.a;
        Class<?> cls = Long.TYPE;
        boolean zE = e(cls);
        Class<?> cls2 = Integer.TYPE;
        boolean zE2 = e(cls2);
        s0 r0Var = null;
        if (unsafeI != null) {
            if (!AbstractC0482c.a()) {
                r0Var = new r0(unsafeI);
            } else if (zE) {
                r0Var = new q0(unsafeI, 1);
            } else if (zE2) {
                r0Var = new q0(unsafeI, 0);
            }
        }
        f6515d = r0Var;
        Class<?> cls3 = Byte.TYPE;
        if (unsafeI == null) {
            z6 = false;
        } else {
            try {
                Class<?> cls4 = unsafeI.getClass();
                cls4.getMethod("objectFieldOffset", Field.class);
                cls4.getMethod("getLong", Object.class, cls);
                if (d() == null) {
                    z6 = false;
                } else if (AbstractC0482c.a()) {
                    z6 = true;
                } else {
                    cls4.getMethod("getByte", cls);
                    cls4.getMethod("putByte", cls, cls3);
                    cls4.getMethod("getInt", cls);
                    cls4.getMethod("putInt", cls, cls2);
                    cls4.getMethod("getLong", cls);
                    cls4.getMethod("putLong", cls, cls);
                    cls4.getMethod("copyMemory", cls, cls, cls);
                    cls4.getMethod("copyMemory", Object.class, cls, Object.class, cls, cls);
                    z6 = true;
                }
            } catch (Throwable th) {
                a.log(Level.WARNING, "platform method missing - proto runtime falling back to safer methods: " + th);
            }
        }
        f6516e = z6;
        Unsafe unsafe = f6513b;
        if (unsafe != null) {
            try {
                Class<?> cls5 = unsafe.getClass();
                try {
                    cls5.getMethod("objectFieldOffset", Field.class);
                    cls5.getMethod("arrayBaseOffset", Class.class);
                    cls5.getMethod("arrayIndexScale", Class.class);
                    cls5.getMethod("getInt", Object.class, cls);
                    cls5.getMethod("putInt", Object.class, cls, cls2);
                    cls5.getMethod("getLong", Object.class, cls);
                    Class<?>[] clsArr = new Class[3];
                    clsArr[0] = Object.class;
                    clsArr[1] = cls;
                    clsArr[2] = cls;
                    cls5.getMethod("putLong", clsArr);
                    Class<?>[] clsArr2 = new Class[2];
                    clsArr2[0] = Object.class;
                    z10 = true;
                    try {
                        clsArr2[1] = cls;
                        cls5.getMethod("getObject", clsArr2);
                        Class<?>[] clsArr3 = new Class[3];
                        clsArr3[0] = Object.class;
                        clsArr3[1] = cls;
                        clsArr3[2] = Object.class;
                        cls5.getMethod("putObject", clsArr3);
                        if (AbstractC0482c.a()) {
                            z11 = true;
                        } else {
                            Class<?>[] clsArr4 = new Class[2];
                            clsArr4[0] = Object.class;
                            clsArr4[1] = cls;
                            cls5.getMethod("getByte", clsArr4);
                            Class<?>[] clsArr5 = new Class[3];
                            clsArr5[0] = Object.class;
                            clsArr5[1] = cls;
                            clsArr5[2] = cls3;
                            cls5.getMethod("putByte", clsArr5);
                            Class<?>[] clsArr6 = new Class[2];
                            clsArr6[0] = Object.class;
                            clsArr6[1] = cls;
                            cls5.getMethod("getBoolean", clsArr6);
                            Class<?>[] clsArr7 = new Class[3];
                            clsArr7[0] = Object.class;
                            clsArr7[1] = cls;
                            clsArr7[2] = Boolean.TYPE;
                            cls5.getMethod("putBoolean", clsArr7);
                            Class<?>[] clsArr8 = new Class[2];
                            clsArr8[0] = Object.class;
                            clsArr8[1] = cls;
                            cls5.getMethod("getFloat", clsArr8);
                            Class<?>[] clsArr9 = new Class[3];
                            clsArr9[0] = Object.class;
                            clsArr9[1] = cls;
                            clsArr9[2] = Float.TYPE;
                            cls5.getMethod("putFloat", clsArr9);
                            Class<?>[] clsArr10 = new Class[2];
                            clsArr10[0] = Object.class;
                            z10 = true;
                            clsArr10[1] = cls;
                            cls5.getMethod("getDouble", clsArr10);
                            cls5.getMethod("putDouble", Object.class, cls, Double.TYPE);
                            z11 = true;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        a.log(Level.WARNING, "platform method missing - proto runtime falling back to safer methods: " + th);
                        z11 = false;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    z10 = true;
                }
            } catch (Throwable th4) {
                th = th4;
                z10 = true;
            }
            f6517f = z11;
            f6518g = b(byte[].class);
            b(boolean[].class);
            c(boolean[].class);
            b(int[].class);
            c(int[].class);
            b(long[].class);
            c(long[].class);
            b(float[].class);
            c(float[].class);
            b(double[].class);
            c(double[].class);
            b(Object[].class);
            c(Object[].class);
            fieldD = d();
            if (fieldD != null && (s0Var = f6515d) != null) {
                s0Var.j(fieldD);
            }
            if (ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN) {
                z12 = z10;
            } else {
                z12 = false;
            }
            f6519h = z12;
        }
        z11 = false;
        z10 = true;
        f6517f = z11;
        f6518g = b(byte[].class);
        b(boolean[].class);
        c(boolean[].class);
        b(int[].class);
        c(int[].class);
        b(long[].class);
        c(long[].class);
        b(float[].class);
        c(float[].class);
        b(double[].class);
        c(double[].class);
        b(Object[].class);
        c(Object[].class);
        fieldD = d();
        if (fieldD != null) {
            s0Var.j(fieldD);
        }
        if (ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN) {
            z12 = z10;
        } else {
            z12 = false;
        }
        f6519h = z12;
    }

    public static Object a(Class cls) {
        try {
            return f6513b.allocateInstance(cls);
        } catch (InstantiationException e10) {
            throw new IllegalStateException(e10);
        }
    }

    public static int b(Class cls) {
        if (f6517f) {
            return f6515d.a(cls);
        }
        return -1;
    }

    public static void c(Class cls) {
        if (f6517f) {
            f6515d.b(cls);
        }
    }

    public static Field d() {
        Field declaredField;
        Field declaredField2;
        if (AbstractC0482c.a()) {
            try {
                declaredField2 = Buffer.class.getDeclaredField("effectiveDirectAddress");
            } catch (Throwable unused) {
                declaredField2 = null;
            }
            if (declaredField2 != null) {
                return declaredField2;
            }
        }
        try {
            declaredField = Buffer.class.getDeclaredField("address");
        } catch (Throwable unused2) {
            declaredField = null;
        }
        if (declaredField == null || declaredField.getType() != Long.TYPE) {
            return null;
        }
        return declaredField;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean e(Class cls) {
        if (!AbstractC0482c.a()) {
            return false;
        }
        try {
            Class cls2 = f6514c;
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

    public static byte f(byte[] bArr, long j) {
        return f6515d.d(f6518g + j, bArr);
    }

    public static byte g(long j, Object obj) {
        return (byte) ((f6515d.g((-4) & j, obj) >>> ((int) (((~j) & 3) << 3))) & 255);
    }

    public static byte h(long j, Object obj) {
        return (byte) ((f6515d.g((-4) & j, obj) >>> ((int) ((j & 3) << 3))) & 255);
    }

    public static Unsafe i() {
        try {
            return (Unsafe) AccessController.doPrivileged(new p0());
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void j(byte[] bArr, long j, byte b3) {
        f6515d.l(bArr, f6518g + j, b3);
    }

    public static void k(Object obj, long j, byte b3) {
        long j10 = (-4) & j;
        int iG = f6515d.g(j10, obj);
        int i10 = ((~((int) j)) & 3) << 3;
        m(obj, j10, ((255 & b3) << i10) | (iG & (~(255 << i10))));
    }

    public static void l(Object obj, long j, byte b3) {
        long j10 = (-4) & j;
        int i10 = (((int) j) & 3) << 3;
        m(obj, j10, ((255 & b3) << i10) | (f6515d.g(j10, obj) & (~(255 << i10))));
    }

    public static void m(Object obj, long j, int i10) {
        f6515d.o(obj, j, i10);
    }

    public static void n(Object obj, long j, long j10) {
        f6515d.p(obj, j, j10);
    }

    public static void o(long j, Object obj, Object obj2) {
        f6515d.q(j, obj, obj2);
    }
}
