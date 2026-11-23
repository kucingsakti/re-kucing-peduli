package androidx.lifecycle;

import android.app.Application;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class P {
    public static final List a = p086i8.l.C(Application.class, J.class);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final List f6744b = com.bumptech.glide.d.u(J.class);

    public static final Constructor a(Class cls, List list) {
        p210v8.i.f(list, InAppPurchaseMetaData.KEY_SIGNATURE);
        Constructor<?>[] constructors = cls.getConstructors();
        p210v8.i.e(constructors, "modelClass.constructors");
        for (Constructor<?> constructor : constructors) {
            Class<?>[] parameterTypes = constructor.getParameterTypes();
            p210v8.i.e(parameterTypes, "constructor.parameterTypes");
            List listH = p086i8.i.H(parameterTypes);
            if (list.equals(listH)) {
                return constructor;
            }
            if (list.size() == listH.size() && listH.containsAll(list)) {
                throw new UnsupportedOperationException("Class " + cls.getSimpleName() + " must have parameters in the proper order: " + list);
            }
        }
        return null;
    }

    public static final Q b(Class cls, Constructor constructor, Object... objArr) {
        try {
            return (Q) constructor.newInstance(Arrays.copyOf(objArr, objArr.length));
        } catch (IllegalAccessException e10) {
            throw new RuntimeException("Failed to access " + cls, e10);
        } catch (InstantiationException e11) {
            throw new RuntimeException("A " + cls + " cannot be instantiated.", e11);
        } catch (InvocationTargetException e12) {
            throw new RuntimeException("An exception happened in constructor of " + cls, e12.getCause());
        }
    }
}
