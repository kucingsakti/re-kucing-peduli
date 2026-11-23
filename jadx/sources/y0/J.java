package y0;

import android.os.Bundle;
import android.os.Parcelable;
import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public final class J extends M {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Class f15876r;

    public J(Class cls) {
        super(true);
        if (Parcelable.class.isAssignableFrom(cls) || Serializable.class.isAssignableFrom(cls)) {
            this.f15876r = cls;
            return;
        }
        throw new IllegalArgumentException((cls + " does not implement Parcelable or Serializable.").toString());
    }

    @Override // y0.M
    public final Object a(String str, Bundle bundle) {
        return p231y.a.b(bundle, "bundle", str, "key", str);
    }

    @Override // y0.M
    public final String b() {
        return this.f15876r.getName();
    }

    @Override // y0.M
    public final Object d(String str) {
        p210v8.i.f(str, "value");
        throw new UnsupportedOperationException("Parcelables don't support default values.");
    }

    @Override // y0.M
    public final void e(Bundle bundle, String str, Object obj) {
        p210v8.i.f(str, "key");
        this.f15876r.cast(obj);
        if (obj == null || (obj instanceof Parcelable)) {
            bundle.putParcelable(str, (Parcelable) obj);
        } else if (obj instanceof Serializable) {
            bundle.putSerializable(str, (Serializable) obj);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !J.class.equals(obj.getClass())) {
            return false;
        }
        return p210v8.i.a(this.f15876r, ((J) obj).f15876r);
    }

    public final int hashCode() {
        return this.f15876r.hashCode();
    }
}
