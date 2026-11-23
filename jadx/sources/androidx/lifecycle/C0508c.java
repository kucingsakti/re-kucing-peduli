package androidx.lifecycle;

import java.lang.reflect.Method;

/* JADX INFO: renamed from: androidx.lifecycle.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0508c {
    public final int a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Method f6749b;

    public C0508c(int i10, Method method) {
        this.a = i10;
        this.f6749b = method;
        method.setAccessible(true);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0508c)) {
            return false;
        }
        C0508c c0508c = (C0508c) obj;
        return this.a == c0508c.a && this.f6749b.getName().equals(c0508c.f6749b.getName());
    }

    public final int hashCode() {
        return this.f6749b.getName().hashCode() + (this.a * 31);
    }
}
