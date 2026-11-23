package L;

import C8.E;
import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.FontVariationAxis;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class j extends h {
    public final Class j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Constructor f2726k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Method f2727l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Method f2728m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Method f2729n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Method f2730o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Method f2731p;

    public j() {
        Class<?> cls;
        Method method;
        Constructor<?> constructor;
        Method methodP;
        Method method2;
        Method method3;
        Method methodQ;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            constructor = cls.getConstructor(new Class[0]);
            methodP = P(cls);
            Class<?> cls2 = Integer.TYPE;
            method2 = cls.getMethod("addFontFromBuffer", ByteBuffer.class, cls2, FontVariationAxis[].class, cls2, cls2);
            method3 = cls.getMethod("freeze", new Class[0]);
            method = cls.getMethod("abortCreation", new Class[0]);
            methodQ = Q(cls);
        } catch (ClassNotFoundException | NoSuchMethodException unused) {
            cls = null;
            method = null;
            constructor = null;
            methodP = null;
            method2 = null;
            method3 = null;
            methodQ = null;
        }
        this.j = cls;
        this.f2726k = constructor;
        this.f2727l = methodP;
        this.f2728m = method2;
        this.f2729n = method3;
        this.f2730o = method;
        this.f2731p = methodQ;
    }

    public static Method P(Class cls) {
        Class<?> cls2 = Integer.TYPE;
        return cls.getMethod("addFontFromAssetManager", AssetManager.class, String.class, cls2, Boolean.TYPE, cls2, cls2, cls2, FontVariationAxis[].class);
    }

    public final void K(Object obj) {
        try {
            this.f2730o.invoke(obj, new Object[0]);
        } catch (IllegalAccessException | InvocationTargetException unused) {
        }
    }

    public final boolean L(Context context, Object obj, String str, int i10, int i11, int i12, FontVariationAxis[] fontVariationAxisArr) {
        try {
            return ((Boolean) this.f2727l.invoke(obj, context.getAssets(), str, 0, Boolean.FALSE, Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12), fontVariationAxisArr)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public Typeface M(Object obj) {
        try {
            Object objNewInstance = Array.newInstance((Class<?>) this.j, 1);
            Array.set(objNewInstance, 0, obj);
            return (Typeface) this.f2731p.invoke(null, objNewInstance, -1, -1);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    public final boolean N(Object obj) {
        try {
            return ((Boolean) this.f2729n.invoke(obj, new Object[0])).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public final Object O() {
        try {
            return this.f2726k.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            return null;
        }
    }

    public Method Q(Class cls) throws NoSuchMethodException {
        Class cls2 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", Array.newInstance((Class<?>) cls, 1).getClass(), cls2, cls2);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }

    @Override // L.h, C4.a
    public final Typeface i(Context context, K.f fVar, Resources resources, int i10) {
        Method method = this.f2727l;
        if (method == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        if (method == null) {
            return super.i(context, fVar, resources, i10);
        }
        Object objO = O();
        if (objO != null) {
            K.g[] gVarArr = fVar.a;
            int length = gVarArr.length;
            int i11 = 0;
            while (i11 < length) {
                K.g gVar = gVarArr[i11];
                String str = gVar.a;
                FontVariationAxis[] fontVariationAxisArrFromFontVariationSettings = FontVariationAxis.fromFontVariationSettings(gVar.f2489d);
                Context context2 = context;
                if (!L(context2, objO, str, gVar.f2490e, gVar.f2487b, gVar.f2488c ? 1 : 0, fontVariationAxisArrFromFontVariationSettings)) {
                    K(objO);
                    return null;
                }
                i11++;
                context = context2;
            }
            if (N(objO)) {
                return M(objO);
            }
        }
        return null;
    }

    @Override // L.h, C4.a
    public final Typeface j(Context context, R.h[] hVarArr, int i10) {
        Typeface typefaceM;
        boolean zBooleanValue;
        if (hVarArr.length >= 1) {
            Method method = this.f2727l;
            if (method == null) {
                Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
            }
            if (method != null) {
                HashMap map = new HashMap();
                for (R.h hVar : hVarArr) {
                    if (hVar.f4428e == 0) {
                        Uri uri = hVar.a;
                        if (!map.containsKey(uri)) {
                            map.put(uri, E.w(context, uri));
                        }
                    }
                }
                Map mapUnmodifiableMap = Collections.unmodifiableMap(map);
                Object objO = O();
                if (objO != null) {
                    int length = hVarArr.length;
                    int i11 = 0;
                    boolean z6 = false;
                    while (i11 < length) {
                        R.h hVar2 = hVarArr[i11];
                        ByteBuffer byteBuffer = (ByteBuffer) mapUnmodifiableMap.get(hVar2.a);
                        if (byteBuffer != null) {
                            try {
                                zBooleanValue = ((Boolean) this.f2728m.invoke(objO, byteBuffer, Integer.valueOf(hVar2.f4425b), null, Integer.valueOf(hVar2.f4426c), Integer.valueOf(hVar2.f4427d ? 1 : 0))).booleanValue();
                            } catch (IllegalAccessException | InvocationTargetException unused) {
                                zBooleanValue = false;
                            }
                            if (!zBooleanValue) {
                                K(objO);
                                return null;
                            }
                            z6 = true;
                        }
                        i11++;
                        z6 = z6;
                    }
                    if (!z6) {
                        K(objO);
                        return null;
                    }
                    if (N(objO) && (typefaceM = M(objO)) != null) {
                        return Typeface.create(typefaceM, i10);
                    }
                }
            } else {
                R.h hVarR = r(i10, hVarArr);
                try {
                    ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = context.getContentResolver().openFileDescriptor(hVarR.a, "r", null);
                    if (parcelFileDescriptorOpenFileDescriptor != null) {
                        try {
                            Typeface typefaceBuild = new Typeface.Builder(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor()).setWeight(hVarR.f4426c).setItalic(hVarR.f4427d).build();
                            parcelFileDescriptorOpenFileDescriptor.close();
                            return typefaceBuild;
                        } catch (Throwable th) {
                            try {
                                parcelFileDescriptorOpenFileDescriptor.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                            throw th;
                        }
                    }
                    if (parcelFileDescriptorOpenFileDescriptor != null) {
                        parcelFileDescriptorOpenFileDescriptor.close();
                        return null;
                    }
                } catch (IOException unused2) {
                }
            }
        }
        return null;
    }

    @Override // C4.a
    public final Typeface l(Context context, Resources resources, int i10, String str, int i11) {
        Method method = this.f2727l;
        if (method == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        if (method == null) {
            return super.l(context, resources, i10, str, i11);
        }
        Object objO = O();
        if (objO != null) {
            if (!L(context, objO, str, 0, -1, -1, null)) {
                K(objO);
                return null;
            }
            if (N(objO)) {
                return M(objO);
            }
        }
        return null;
    }
}
