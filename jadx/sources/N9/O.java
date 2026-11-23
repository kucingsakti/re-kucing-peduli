package N9;

/* JADX INFO: loaded from: classes.dex */
public final class O extends P {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final u0 f3422u;

    public O(long j, u0 u0Var) {
        super(j);
        this.f3422u = u0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f3422u.run();
    }

    @Override // N9.P
    public final String toString() {
        return super.toString() + this.f3422u;
    }
}
