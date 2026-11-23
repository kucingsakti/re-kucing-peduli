package A3;

/* JADX INFO: loaded from: classes.dex */
public final class Y extends F {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final transient Object f257u;

    public Y(Object obj) {
        obj.getClass();
        this.f257u = obj;
    }

    @Override // A3.AbstractC0113k, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f257u.equals(obj);
    }

    @Override // A3.AbstractC0113k
    public final AbstractC0119q d() {
        return new X(this.f257u);
    }

    @Override // A3.AbstractC0113k
    public final int e(Object[] objArr) {
        objArr[0] = this.f257u;
        return 1;
    }

    @Override // A3.F, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f257u.hashCode();
    }

    @Override // A3.AbstractC0113k
    public final boolean m() {
        return false;
    }

    @Override // A3.AbstractC0113k
    /* JADX INFO: renamed from: n */
    public final Z iterator() {
        return new J(this.f257u);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 1;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return "[" + this.f257u.toString() + ']';
    }
}
