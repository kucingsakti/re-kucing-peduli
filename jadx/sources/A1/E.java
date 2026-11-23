package A1;

/* JADX INFO: loaded from: classes.dex */
public final class E implements F, V1.b {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final C0099h f50w = V1.d.a(20, new p170r3.e(1));

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final V1.e f51s = new V1.e();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public F f52t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f53u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f54v;

    @Override // A1.F
    public final int a() {
        return this.f52t.a();
    }

    @Override // A1.F
    public final Class b() {
        return this.f52t.b();
    }

    @Override // A1.F
    public final synchronized void c() {
        this.f51s.a();
        this.f54v = true;
        if (!this.f53u) {
            this.f52t.c();
            this.f52t = null;
            f50w.q(this);
        }
    }

    public final synchronized void d() {
        this.f51s.a();
        if (!this.f53u) {
            throw new IllegalStateException("Already unlocked");
        }
        this.f53u = false;
        if (this.f54v) {
            c();
        }
    }

    @Override // V1.b
    public final V1.e g() {
        return this.f51s;
    }

    @Override // A1.F
    public final Object get() {
        return this.f52t.get();
    }
}
