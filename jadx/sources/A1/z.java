package A1;

/* JADX INFO: loaded from: classes.dex */
public final class z implements F {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final boolean f213s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final boolean f214t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final F f215u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final t f216v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final y f217w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f218x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f219y;

    public z(F f10, boolean z6, boolean z10, y yVar, t tVar) {
        U1.f.c(f10, "Argument must not be null");
        this.f215u = f10;
        this.f213s = z6;
        this.f214t = z10;
        this.f217w = yVar;
        U1.f.c(tVar, "Argument must not be null");
        this.f216v = tVar;
    }

    @Override // A1.F
    public final int a() {
        return this.f215u.a();
    }

    @Override // A1.F
    public final Class b() {
        return this.f215u.b();
    }

    @Override // A1.F
    public final synchronized void c() {
        if (this.f218x > 0) {
            throw new IllegalStateException("Cannot recycle a resource while it is still acquired");
        }
        if (this.f219y) {
            throw new IllegalStateException("Cannot recycle a resource that has already been recycled");
        }
        this.f219y = true;
        if (this.f214t) {
            this.f215u.c();
        }
    }

    public final synchronized void d() {
        if (this.f219y) {
            throw new IllegalStateException("Cannot acquire a recycled resource");
        }
        this.f218x++;
    }

    public final void e() {
        boolean z6;
        synchronized (this) {
            int i10 = this.f218x;
            if (i10 <= 0) {
                throw new IllegalStateException("Cannot release a recycled or not yet acquired resource");
            }
            z6 = true;
            int i11 = i10 - 1;
            this.f218x = i11;
            if (i11 != 0) {
                z6 = false;
            }
        }
        if (z6) {
            this.f216v.e(this.f217w, this);
        }
    }

    @Override // A1.F
    public final Object get() {
        return this.f215u.get();
    }

    public final synchronized String toString() {
        return "EngineResource{isMemoryCacheable=" + this.f213s + ", listener=" + this.f216v + ", key=" + this.f217w + ", acquired=" + this.f218x + ", isRecycled=" + this.f219y + ", resource=" + this.f215u + '}';
    }
}
