package y0;

import android.os.Bundle;
import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public final class K extends M {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Class f15877r;

    public K(Class cls) {
        super(true);
        if (!Serializable.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException((cls + " does not implement Serializable.").toString());
        }
        try {
            this.f15877r = Class.forName("[L" + cls.getName() + ';');
        } catch (ClassNotFoundException e10) {
            throw new RuntimeException(e10);
        }
    }

    @Override // y0.M
    public final Object a(String str, Bundle bundle) {
        return (Serializable[]) p231y.a.b(bundle, "bundle", str, "key", str);
    }

    @Override // y0.M
    public final String b() {
        return this.f15877r.getName();
    }

    @Override // y0.M
    public final Object d(String str) {
        p210v8.i.f(str, "value");
        throw new UnsupportedOperationException("Arrays don't support default values.");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.io.Serializable, java.io.Serializable[], java.lang.Object] */
    @Override // y0.M
    public final void e(Bundle bundle, String str, Object obj) {
        ?? r10 = (Serializable[]) obj;
        p210v8.i.f(str, "key");
        this.f15877r.cast(r10);
        bundle.putSerializable(str, r10);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !K.class.equals(obj.getClass())) {
            return false;
        }
        return p210v8.i.a(this.f15877r, ((K) obj).f15877r);
    }

    public final int hashCode() {
        return this.f15877r.hashCode();
    }
}
