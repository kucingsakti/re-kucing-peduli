package B8;

/* JADX INFO: loaded from: classes.dex */
public final class c extends a {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final c f776v = new c(1, 0, 1);

    @Override // B8.a
    public final boolean equals(Object obj) {
        if (!(obj instanceof c)) {
            return false;
        }
        if (isEmpty() && ((c) obj).isEmpty()) {
            return true;
        }
        c cVar = (c) obj;
        if (this.f769s == cVar.f769s) {
            return this.f770t == cVar.f770t;
        }
        return false;
    }

    public final boolean f(int i10) {
        return this.f769s <= i10 && i10 <= this.f770t;
    }

    @Override // B8.a
    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (this.f769s * 31) + this.f770t;
    }

    @Override // B8.a
    public final boolean isEmpty() {
        return this.f769s > this.f770t;
    }

    @Override // B8.a
    public final String toString() {
        return this.f769s + ".." + this.f770t;
    }
}
