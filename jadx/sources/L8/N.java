package L8;

import A9.AbstractC0151y;

/* JADX INFO: loaded from: classes.dex */
public final class N implements p201u9.d, M {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final N f2800t = new N(0);

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final N f2801u = new N(1);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f2802s;

    public /* synthetic */ N(int i10) {
        this.f2802s = i10;
    }

    @Override // p201u9.d
    public AbstractC0151y getType() {
        switch (this.f2802s) {
            case 2:
                throw new IllegalStateException("This method should not be called");
            case 3:
                throw new IllegalStateException("This method should not be called");
            default:
                throw new IllegalStateException("This method should not be called");
        }
    }

    public String toString() {
        switch (this.f2802s) {
            case 6:
                return "NO_SOURCE";
            default:
                return super.toString();
        }
    }
}
