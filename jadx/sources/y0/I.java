package y0;

import android.os.Bundle;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class I extends M {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Class f15875r;

    public I(Class cls) {
        super(true);
        if (!Parcelable.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException((cls + " does not implement Parcelable.").toString());
        }
        try {
            this.f15875r = Class.forName("[L" + cls.getName() + ';');
        } catch (ClassNotFoundException e10) {
            throw new RuntimeException(e10);
        }
    }

    @Override // y0.M
    public final Object a(String str, Bundle bundle) {
        return (Parcelable[]) p231y.a.b(bundle, "bundle", str, "key", str);
    }

    @Override // y0.M
    public final String b() {
        return this.f15875r.getName();
    }

    @Override // y0.M
    public final Object d(String str) {
        p210v8.i.f(str, "value");
        throw new UnsupportedOperationException("Arrays don't support default values.");
    }

    @Override // y0.M
    public final void e(Bundle bundle, String str, Object obj) {
        Parcelable[] parcelableArr = (Parcelable[]) obj;
        p210v8.i.f(str, "key");
        this.f15875r.cast(parcelableArr);
        bundle.putParcelableArray(str, parcelableArr);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !I.class.equals(obj.getClass())) {
            return false;
        }
        return p210v8.i.a(this.f15875r, ((I) obj).f15875r);
    }

    public final int hashCode() {
        return this.f15875r.hashCode();
    }
}
