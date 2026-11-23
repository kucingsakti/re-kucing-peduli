package A9;

/* JADX INFO: loaded from: classes.dex */
public final class C extends AbstractC0143p {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f326u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C(D d3, int i10) {
        super(d3);
        this.f326u = i10;
    }

    @Override // A9.AbstractC0142o, A9.AbstractC0151y
    public final boolean H() {
        switch (this.f326u) {
            case 0:
                return false;
            default:
                return true;
        }
    }

    @Override // A9.AbstractC0142o
    public final AbstractC0142o S0(D d3) {
        switch (this.f326u) {
            case 0:
                return new C(d3, 0);
            default:
                return new C(d3, 1);
        }
    }
}
