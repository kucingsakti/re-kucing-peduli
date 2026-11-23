package p076h8;

import java.io.Serializable;
import p210v8.i;

/* JADX INFO: loaded from: classes.dex */
public final class h implements Serializable {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Object f11792s;

    public static final Throwable a(Object obj) {
        if (obj instanceof g) {
            return ((g) obj).f11791s;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof h) {
            return i.a(this.f11792s, ((h) obj).f11792s);
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.f11792s;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        Object obj = this.f11792s;
        if (obj instanceof g) {
            return ((g) obj).toString();
        }
        return "Success(" + obj + ')';
    }
}
