package p104k9;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public final class m {
    public final AbstractC0682k a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f12815b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final n f12816c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final l f12817d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Method f12818e;

    public m(AbstractC0682k abstractC0682k, Object obj, n nVar, l lVar, Class cls) {
        if (abstractC0682k == null) {
            throw new IllegalArgumentException("Null containingTypeDefaultInstance");
        }
        if (lVar.f12813t == J.f12773x && nVar == null) {
            throw new IllegalArgumentException("Null messageDefaultInstance");
        }
        this.a = abstractC0682k;
        this.f12815b = obj;
        this.f12816c = nVar;
        this.f12817d = lVar;
        if (!o.class.isAssignableFrom(cls)) {
            this.f12818e = null;
            return;
        }
        try {
            this.f12818e = cls.getMethod("valueOf", Integer.TYPE);
        } catch (NoSuchMethodException e10) {
            String name = cls.getName();
            StringBuilder sb = new StringBuilder(name.length() + 52);
            sb.append("Generated message class \"");
            sb.append(name);
            sb.append("\" missing method \"valueOf\".");
            throw new RuntimeException(sb.toString(), e10);
        }
    }

    public final Object a(Object obj) {
        if (this.f12817d.f12813t.f12776s != K.f12778A) {
            return obj;
        }
        try {
            return this.f12818e.invoke(null, (Integer) obj);
        } catch (IllegalAccessException e10) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e10);
        } catch (InvocationTargetException e11) {
            Throwable cause = e11.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
        }
    }

    public final Object b(Object obj) {
        return this.f12817d.f12813t.f12776s == K.f12778A ? Integer.valueOf(((o) obj).getNumber()) : obj;
    }
}
