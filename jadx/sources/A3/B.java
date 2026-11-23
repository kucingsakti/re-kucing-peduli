package A3;

/* JADX INFO: loaded from: classes.dex */
public abstract class B extends F {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public transient AbstractC0119q f220u;

    @Override // A3.AbstractC0113k
    public final AbstractC0119q d() {
        AbstractC0119q abstractC0119q = this.f220u;
        if (abstractC0119q != null) {
            return abstractC0119q;
        }
        AbstractC0119q abstractC0119qS = s();
        this.f220u = abstractC0119qS;
        return abstractC0119qS;
    }

    public abstract AbstractC0119q s();
}
