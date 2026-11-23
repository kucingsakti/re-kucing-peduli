package F8;

import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public final class z0 {
    public final WeakReference a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f1651b;

    public z0(ClassLoader classLoader) {
        this.a = new WeakReference(classLoader);
        this.f1651b = System.identityHashCode(classLoader);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof z0) && this.a.get() == ((z0) obj).a.get();
    }

    public final int hashCode() {
        return this.f1651b;
    }

    public final String toString() {
        String string;
        ClassLoader classLoader = (ClassLoader) this.a.get();
        return (classLoader == null || (string = classLoader.toString()) == null) ? "<null>" : string;
    }
}
