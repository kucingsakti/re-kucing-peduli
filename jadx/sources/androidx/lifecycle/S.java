package androidx.lifecycle;

import android.app.Application;
import java.lang.reflect.InvocationTargetException;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class S extends p204v1.g {

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static S f6745y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final p170r3.e f6746z = new p170r3.e(14);

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final Application f6747x;

    public S(Application application) {
        super(14);
        this.f6747x = application;
    }

    @Override // p204v1.g, androidx.lifecycle.T
    public final Q e(Class cls) {
        Application application = this.f6747x;
        if (application != null) {
            return q(cls, application);
        }
        throw new UnsupportedOperationException("AndroidViewModelFactory constructed with empty constructor works only with create(modelClass: Class<T>, extras: CreationExtras).");
    }

    @Override // p204v1.g, androidx.lifecycle.T
    public final Q i(Class cls, u0.b bVar) {
        if (this.f6747x != null) {
            return e(cls);
        }
        Application application = (Application) ((LinkedHashMap) bVar.f577s).get(f6746z);
        if (application != null) {
            return q(cls, application);
        }
        if (AbstractC0506a.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("CreationExtras must have an application by `APPLICATION_KEY`");
        }
        return C3.a.e(cls);
    }

    public final Q q(Class cls, Application application) {
        if (!AbstractC0506a.class.isAssignableFrom(cls)) {
            return C3.a.e(cls);
        }
        try {
            Q q10 = (Q) cls.getConstructor(Application.class).newInstance(application);
            p210v8.i.e(q10, "{\n                try {\n…          }\n            }");
            return q10;
        } catch (IllegalAccessException e10) {
            throw new RuntimeException("Cannot create an instance of " + cls, e10);
        } catch (InstantiationException e11) {
            throw new RuntimeException("Cannot create an instance of " + cls, e11);
        } catch (NoSuchMethodException e12) {
            throw new RuntimeException("Cannot create an instance of " + cls, e12);
        } catch (InvocationTargetException e13) {
            throw new RuntimeException("Cannot create an instance of " + cls, e13);
        }
    }
}
