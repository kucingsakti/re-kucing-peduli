package y0;

import android.os.Bundle;
import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public class L extends M {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Class f15878r;

    public L(Class cls) {
        super(true);
        if (!Serializable.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException((cls + " does not implement Serializable.").toString());
        }
        if (!cls.isEnum()) {
            this.f15878r = cls;
            return;
        }
        throw new IllegalArgumentException((cls + " is an Enum. You should use EnumType instead.").toString());
    }

    @Override // y0.M
    public final Object a(String str, Bundle bundle) {
        return (Serializable) p231y.a.b(bundle, "bundle", str, "key", str);
    }

    @Override // y0.M
    public String b() {
        return this.f15878r.getName();
    }

    @Override // y0.M
    public final void e(Bundle bundle, String str, Object obj) {
        Serializable serializable = (Serializable) obj;
        p210v8.i.f(str, "key");
        p210v8.i.f(serializable, "value");
        this.f15878r.cast(serializable);
        bundle.putSerializable(str, serializable);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof L)) {
            return false;
        }
        return p210v8.i.a(this.f15878r, ((L) obj).f15878r);
    }

    @Override // y0.M
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public Serializable d(String str) {
        p210v8.i.f(str, "value");
        throw new UnsupportedOperationException("Serializables don't support default values.");
    }

    public final int hashCode() {
        return this.f15878r.hashCode();
    }

    public L(int i10, Class cls) {
        super(false);
        if (Serializable.class.isAssignableFrom(cls)) {
            this.f15878r = cls;
            return;
        }
        throw new IllegalArgumentException((cls + " does not implement Serializable.").toString());
    }
}
