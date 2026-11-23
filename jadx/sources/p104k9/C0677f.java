package p104k9;

/* JADX INFO: renamed from: k9.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0677f {
    public final AbstractC0672a a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f12804b;

    public C0677f(int i10, AbstractC0672a abstractC0672a) {
        this.a = abstractC0672a;
        this.f12804b = i10;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0677f)) {
            return false;
        }
        C0677f c0677f = (C0677f) obj;
        return this.a == c0677f.a && this.f12804b == c0677f.f12804b;
    }

    public final int hashCode() {
        return (System.identityHashCode(this.a) * 65535) + this.f12804b;
    }
}
