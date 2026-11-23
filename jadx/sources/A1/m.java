package A1;

/* JADX INFO: loaded from: classes.dex */
public final class m {
    public boolean a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f124b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f125c;

    public m(boolean z6, boolean z10, boolean z11) {
        this.a = z6;
        this.f124b = z10;
        this.f125c = z11;
    }

    public boolean a() {
        return (this.f125c || this.f124b) && this.a;
    }
}
