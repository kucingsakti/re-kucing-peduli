package A3;

/* JADX INFO: loaded from: classes.dex */
public final class K extends AbstractC0103a {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final K f231v = new K(0, 0, new Object[0]);

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final Object[] f232u;

    public K(int i10, int i11, Object[] objArr) {
        super(i10, i11);
        this.f232u = objArr;
    }

    @Override // A3.AbstractC0103a
    public final Object a(int i10) {
        return this.f232u[i10];
    }
}
