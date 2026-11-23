package p;

import android.graphics.drawable.Drawable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: p.h0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0706h0 {
    public static final boolean a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Method f14064b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Field f14065c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Field f14066d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Field f14067e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Field f14068f;

    /* JADX WARN: Code duplicated, block: B:25:0x004c  */
    /* JADX WARN: Code duplicated, block: B:26:0x0059  */
    static {
        Method method;
        Field field;
        Field field2;
        Field field3;
        Field field4;
        boolean z6;
        try {
            Class<?> cls = Class.forName("android.graphics.Insets");
            method = Drawable.class.getMethod("getOpticalInsets", new Class[0]);
            try {
                field = cls.getField("left");
                try {
                    field2 = cls.getField("top");
                    try {
                        field3 = cls.getField("right");
                        try {
                            field4 = cls.getField("bottom");
                            z6 = true;
                        } catch (ClassNotFoundException | NoSuchFieldException | NoSuchMethodException unused) {
                            field4 = null;
                            z6 = false;
                        }
                    } catch (ClassNotFoundException | NoSuchFieldException | NoSuchMethodException unused2) {
                        field3 = null;
                    }
                } catch (ClassNotFoundException unused3) {
                    field2 = null;
                    field3 = field2;
                    field4 = null;
                    z6 = false;
                    if (z6) {
                        f14064b = method;
                        f14065c = field;
                        f14066d = field2;
                        f14067e = field3;
                        f14068f = field4;
                        a = true;
                        return;
                    }
                    f14064b = null;
                    f14065c = null;
                    f14066d = null;
                    f14067e = null;
                    f14068f = null;
                    a = false;
                } catch (NoSuchFieldException unused4) {
                    field2 = null;
                    field3 = field2;
                    field4 = null;
                    z6 = false;
                    if (z6) {
                        f14064b = method;
                        f14065c = field;
                        f14066d = field2;
                        f14067e = field3;
                        f14068f = field4;
                        a = true;
                        return;
                    }
                    f14064b = null;
                    f14065c = null;
                    f14066d = null;
                    f14067e = null;
                    f14068f = null;
                    a = false;
                } catch (NoSuchMethodException unused5) {
                    field2 = null;
                    field3 = field2;
                    field4 = null;
                    z6 = false;
                    if (z6) {
                        f14064b = method;
                        f14065c = field;
                        f14066d = field2;
                        f14067e = field3;
                        f14068f = field4;
                        a = true;
                        return;
                    }
                    f14064b = null;
                    f14065c = null;
                    f14066d = null;
                    f14067e = null;
                    f14068f = null;
                    a = false;
                }
            } catch (ClassNotFoundException unused6) {
                field = null;
                field2 = field;
                field3 = field2;
                field4 = null;
                z6 = false;
                if (z6) {
                    f14064b = method;
                    f14065c = field;
                    f14066d = field2;
                    f14067e = field3;
                    f14068f = field4;
                    a = true;
                    return;
                }
                f14064b = null;
                f14065c = null;
                f14066d = null;
                f14067e = null;
                f14068f = null;
                a = false;
            } catch (NoSuchFieldException unused7) {
                field = null;
                field2 = field;
                field3 = field2;
                field4 = null;
                z6 = false;
                if (z6) {
                    f14064b = method;
                    f14065c = field;
                    f14066d = field2;
                    f14067e = field3;
                    f14068f = field4;
                    a = true;
                    return;
                }
                f14064b = null;
                f14065c = null;
                f14066d = null;
                f14067e = null;
                f14068f = null;
                a = false;
            } catch (NoSuchMethodException unused8) {
                field = null;
                field2 = field;
                field3 = field2;
                field4 = null;
                z6 = false;
                if (z6) {
                    f14064b = method;
                    f14065c = field;
                    f14066d = field2;
                    f14067e = field3;
                    f14068f = field4;
                    a = true;
                    return;
                }
                f14064b = null;
                f14065c = null;
                f14066d = null;
                f14067e = null;
                f14068f = null;
                a = false;
            }
        } catch (ClassNotFoundException unused9) {
            method = null;
            field = null;
        } catch (NoSuchFieldException unused10) {
            method = null;
            field = null;
        } catch (NoSuchMethodException unused11) {
            method = null;
            field = null;
        }
        if (z6) {
            f14064b = method;
            f14065c = field;
            f14066d = field2;
            f14067e = field3;
            f14068f = field4;
            a = true;
            return;
        }
        f14064b = null;
        f14065c = null;
        f14066d = null;
        f14067e = null;
        f14068f = null;
        a = false;
    }
}
