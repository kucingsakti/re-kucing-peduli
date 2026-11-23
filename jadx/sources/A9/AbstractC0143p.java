package A9;

/* JADX INFO: renamed from: A9.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0143p extends AbstractC0142o {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final D f380t;

    public AbstractC0143p(D d3) {
        this.f380t = d3;
    }

    @Override // A9.D
    /* JADX INFO: renamed from: O0 */
    public final D G0(boolean z6) {
        return z6 == H() ? this : this.f380t.G0(z6).N0(o());
    }

    @Override // A9.D
    /* JADX INFO: renamed from: P0 */
    public final D N0(K k3) {
        p210v8.i.f(k3, "newAttributes");
        return k3 != o() ? new F(this, k3) : this;
    }

    @Override // A9.AbstractC0142o
    public final D Q0() {
        return this.f380t;
    }
}
