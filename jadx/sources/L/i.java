package L;

import C8.E;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.net.Uri;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class i extends C4.a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Class f2722e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Constructor f2723f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Method f2724g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Method f2725h;

    static {
        Class<?> cls;
        Method method;
        Constructor<?> constructor;
        Method method2;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            constructor = cls.getConstructor(new Class[0]);
            Class<?> cls2 = Integer.TYPE;
            method2 = cls.getMethod("addFontWeightStyle", ByteBuffer.class, cls2, List.class, cls2, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
        } catch (ClassNotFoundException | NoSuchMethodException unused) {
            cls = null;
            method = null;
            constructor = null;
            method2 = null;
        }
        f2723f = constructor;
        f2722e = cls;
        f2724g = method2;
        f2725h = method;
    }

    public static boolean I(Object obj, ByteBuffer byteBuffer, int i10, int i11, boolean z6) {
        try {
            return ((Boolean) f2724g.invoke(obj, byteBuffer, Integer.valueOf(i10), null, Integer.valueOf(i11), Boolean.valueOf(z6))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public static Typeface J(Object obj) {
        try {
            Object objNewInstance = Array.newInstance((Class<?>) f2722e, 1);
            Array.set(objNewInstance, 0, obj);
            return (Typeface) f2725h.invoke(null, objNewInstance);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:33:0x005c  */
    /* JADX WARN: Code duplicated, block: B:36:0x0069 A[LOOP:0: B:9:0x0015->B:36:0x0069, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:54:0x0068 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:55:0x0068 A[SYNTHETIC] */
    @Override // C4.a
    public final Typeface i(Context context, K.f fVar, Resources resources, int i10) {
        Object objNewInstance;
        MappedByteBuffer map;
        try {
            objNewInstance = f2723f.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            objNewInstance = null;
        }
        if (objNewInstance != null) {
            for (K.g gVar : fVar.a) {
                int i11 = gVar.f2491f;
                File fileS = E.s(context);
                if (fileS != null) {
                    try {
                        if (E.h(fileS, resources, i11)) {
                            try {
                                FileInputStream fileInputStream = new FileInputStream(fileS);
                                try {
                                    FileChannel channel = fileInputStream.getChannel();
                                    map = channel.map(FileChannel.MapMode.READ_ONLY, 0L, channel.size());
                                    fileInputStream.close();
                                    fileS.delete();
                                } catch (Throwable th) {
                                    try {
                                        fileInputStream.close();
                                    } catch (Throwable th2) {
                                        th.addSuppressed(th2);
                                    }
                                    throw th;
                                }
                            } catch (IOException unused2) {
                                map = null;
                            }
                        } else {
                            fileS.delete();
                        }
                        if (map == null) {
                            if (!I(objNewInstance, map, gVar.f2490e, gVar.f2487b, gVar.f2488c)) {
                            }
                        }
                    } catch (Throwable th3) {
                        fileS.delete();
                        throw th3;
                    }
                }
                map = null;
                if (map == null) {
                    if (!I(objNewInstance, map, gVar.f2490e, gVar.f2487b, gVar.f2488c)) {
                    }
                }
            }
            return J(objNewInstance);
        }
        return null;
    }

    @Override // C4.a
    public final Typeface j(Context context, R.h[] hVarArr, int i10) {
        Object objNewInstance;
        try {
            objNewInstance = f2723f.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            objNewInstance = null;
        }
        if (objNewInstance != null) {
            p212w.i iVar = new p212w.i(0);
            for (R.h hVar : hVarArr) {
                Uri uri = hVar.a;
                ByteBuffer byteBufferW = (ByteBuffer) iVar.get(uri);
                if (byteBufferW == null) {
                    byteBufferW = E.w(context, uri);
                    iVar.put(uri, byteBufferW);
                }
                if (byteBufferW != null) {
                    if (I(objNewInstance, byteBufferW, hVar.f4425b, hVar.f4426c, hVar.f4427d)) {
                    }
                }
            }
            Typeface typefaceJ = J(objNewInstance);
            if (typefaceJ != null) {
                return Typeface.create(typefaceJ, i10);
            }
        }
        return null;
    }
}
