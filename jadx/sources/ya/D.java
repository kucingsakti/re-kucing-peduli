package ya;

/* JADX INFO: loaded from: classes.dex */
public final class D extends T {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f16144b;

    public D(boolean z6) {
        this.f16144b = z6;
    }

    @Override // ya.T
    public final void a(I i10, Object obj) {
        if (obj == null) {
            return;
        }
        i10.d(obj.toString(), null, this.f16144b);
    }
}
