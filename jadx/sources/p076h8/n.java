package p076h8;

import java.io.Serializable;
import p210v8.i;
import p210v8.k;

/* JADX INFO: loaded from: classes.dex */
public final class n implements d, Serializable {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public k f11802s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public Object f11803t;

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, u8.a, v8.k] */
    @Override // p076h8.d
    public final Object getValue() {
        if (this.f11803t == l.a) {
            ?? r10 = this.f11802s;
            i.c(r10);
            this.f11803t = r10.invoke();
            this.f11802s = null;
        }
        return this.f11803t;
    }

    public final String toString() {
        return this.f11803t != l.a ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
