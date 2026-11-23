package A3;

/* JADX INFO: loaded from: classes.dex */
public final class T extends AbstractC0119q {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final U f241u;

    public T(U u3) {
        this.f241u = u3;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        return this.f241u.f243w[i10].getValue();
    }

    @Override // A3.AbstractC0113k
    public final boolean m() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f241u.f243w.length;
    }
}
