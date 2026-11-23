package H1;

/* JADX INFO: loaded from: classes.dex */
public final class D extends RuntimeException {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f1852s = 1;

    public /* synthetic */ D() {
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        switch (this.f1852s) {
            case 1:
                return "Chain of Causes for CompositeException In Order Received =>";
            default:
                return super.getMessage();
        }
    }

    public /* synthetic */ D(String str) {
        super(str);
    }
}
