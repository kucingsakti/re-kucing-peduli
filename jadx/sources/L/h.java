package L;

import C8.E;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.ParcelFileDescriptor;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public class h extends C4.a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static Class f2717e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static Constructor f2718f = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static Method f2719g = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static Method f2720h = null;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static boolean f2721i = false;

    public static boolean I(Object obj, String str, int i10, boolean z6) {
        J();
        try {
            try {
                return ((Boolean) f2719g.invoke(obj, str, Integer.valueOf(i10), Boolean.valueOf(z6))).booleanValue();
            } catch (InvocationTargetException e10) {
                e = e10;
                throw new RuntimeException(e);
            }
        } catch (IllegalAccessException | InvocationTargetException e11) {
            e = e11;
        }
    }

    public static void J() {
        Class<?> cls;
        Method method;
        Constructor<?> constructor;
        Method method2;
        if (f2721i) {
            return;
        }
        f2721i = true;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            constructor = cls.getConstructor(new Class[0]);
            method2 = cls.getMethod("addFontWeightStyle", String.class, Integer.TYPE, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
        } catch (ClassNotFoundException | NoSuchMethodException unused) {
            cls = null;
            method = null;
            constructor = null;
            method2 = null;
        }
        f2718f = constructor;
        f2717e = cls;
        f2719g = method2;
        f2720h = method;
    }

    @Override // C4.a
    public Typeface i(Context context, K.f fVar, Resources resources, int i10) {
        J();
        try {
            Object objNewInstance = f2718f.newInstance(new Object[0]);
            for (K.g gVar : fVar.a) {
                File fileS = E.s(context);
                if (fileS == null) {
                    return null;
                }
                try {
                    if (!E.h(fileS, resources, gVar.f2491f)) {
                        return null;
                    }
                    if (!I(objNewInstance, fileS.getPath(), gVar.f2487b, gVar.f2488c)) {
                        return null;
                    }
                    fileS.delete();
                } catch (RuntimeException unused) {
                    return null;
                } finally {
                    fileS.delete();
                }
            }
            J();
            try {
                Object objNewInstance2 = Array.newInstance((Class<?>) f2717e, 1);
                Array.set(objNewInstance2, 0, objNewInstance);
                return (Typeface) f2720h.invoke(null, objNewInstance2);
            } catch (IllegalAccessException | InvocationTargetException e10) {
                throw new RuntimeException(e10);
            }
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e11) {
            throw new RuntimeException(e11);
        }
    }

    @Override // C4.a
    public Typeface j(Context context, R.h[] hVarArr, int i10) {
        File file;
        if (hVarArr.length >= 1) {
            try {
                ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = context.getContentResolver().openFileDescriptor(r(i10, hVarArr).a, "r", null);
                if (parcelFileDescriptorOpenFileDescriptor != null) {
                    try {
                        try {
                            String str = Os.readlink("/proc/self/fd/" + parcelFileDescriptorOpenFileDescriptor.getFd());
                            file = OsConstants.S_ISREG(Os.stat(str).st_mode) ? new File(str) : null;
                        } catch (Throwable th) {
                            try {
                                parcelFileDescriptorOpenFileDescriptor.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                            throw th;
                        }
                    } catch (ErrnoException unused) {
                    }
                    if (file != null && file.canRead()) {
                        Typeface typefaceCreateFromFile = Typeface.createFromFile(file);
                        parcelFileDescriptorOpenFileDescriptor.close();
                        return typefaceCreateFromFile;
                    }
                    FileInputStream fileInputStream = new FileInputStream(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor());
                    try {
                        Typeface typefaceK = k(context, fileInputStream);
                        fileInputStream.close();
                        parcelFileDescriptorOpenFileDescriptor.close();
                        return typefaceK;
                    } catch (Throwable th3) {
                        try {
                            fileInputStream.close();
                        } catch (Throwable th4) {
                            th3.addSuppressed(th4);
                        }
                        throw th3;
                    }
                }
                if (parcelFileDescriptorOpenFileDescriptor != null) {
                    parcelFileDescriptorOpenFileDescriptor.close();
                    return null;
                }
            } catch (IOException unused2) {
            }
        }
        return null;
    }
}
