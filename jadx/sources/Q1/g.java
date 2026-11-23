package Q1;

/* JADX INFO: loaded from: classes.dex */
public final class g implements d, c {
    public final Object a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f3984b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile f f3985c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile c f3986d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f3987e = 3;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f3988f = 3;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f3989g;

    public g(Object obj, d dVar) {
        this.f3984b = obj;
        this.a = dVar;
    }

    @Override // Q1.d, Q1.c
    public final boolean a() {
        boolean z6;
        synchronized (this.f3984b) {
            try {
                z6 = this.f3986d.a() || this.f3985c.a();
            } catch (Throwable th) {
                throw th;
            }
        }
        return z6;
    }

    @Override // Q1.c
    public final boolean b(c cVar) {
        if (!(cVar instanceof g)) {
            return false;
        }
        g gVar = (g) cVar;
        if (this.f3985c == null) {
            if (gVar.f3985c != null) {
                return false;
            }
        } else if (!this.f3985c.b(gVar.f3985c)) {
            return false;
        }
        if (this.f3986d == null) {
            return gVar.f3986d == null;
        }
        return this.f3986d.b(gVar.f3986d);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [Q1.d, java.lang.Object] */
    @Override // Q1.d
    public final boolean c(c cVar) {
        boolean z6;
        synchronized (this.f3984b) {
            try {
                ?? r10 = this.a;
                z6 = (r10 == 0 || r10.c(this)) && cVar.equals(this.f3985c) && this.f3987e != 2;
            } catch (Throwable th) {
                throw th;
            }
        }
        return z6;
    }

    @Override // Q1.c
    public final void clear() {
        synchronized (this.f3984b) {
            this.f3989g = false;
            this.f3987e = 3;
            this.f3988f = 3;
            this.f3986d.clear();
            this.f3985c.clear();
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [Q1.d, java.lang.Object] */
    @Override // Q1.d
    public final boolean d(c cVar) {
        boolean z6;
        synchronized (this.f3984b) {
            try {
                ?? r10 = this.a;
                z6 = (r10 == 0 || r10.d(this)) && cVar.equals(this.f3985c) && !a();
            } catch (Throwable th) {
                throw th;
            }
        }
        return z6;
    }

    /* JADX WARN: Type inference failed for: r3v3, types: [Q1.d, java.lang.Object] */
    @Override // Q1.d
    public final void e(c cVar) {
        synchronized (this.f3984b) {
            try {
                if (cVar.equals(this.f3986d)) {
                    this.f3988f = 4;
                    return;
                }
                this.f3987e = 4;
                ?? r10 = this.a;
                if (r10 != 0) {
                    r10.e(this);
                }
                if (!E0.a.c(this.f3988f)) {
                    this.f3986d.clear();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r3v3, types: [Q1.d, java.lang.Object] */
    @Override // Q1.d
    public final void f(c cVar) {
        synchronized (this.f3984b) {
            try {
                if (!cVar.equals(this.f3985c)) {
                    this.f3988f = 5;
                    return;
                }
                this.f3987e = 5;
                ?? r10 = this.a;
                if (r10 != 0) {
                    r10.f(this);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // Q1.c
    public final boolean g() {
        boolean z6;
        synchronized (this.f3984b) {
            z6 = this.f3987e == 3;
        }
        return z6;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [Q1.d, java.lang.Object] */
    @Override // Q1.d
    public final d h() {
        d dVarH;
        synchronized (this.f3984b) {
            try {
                ?? r10 = this.a;
                dVarH = r10 != 0 ? r10.h() : this;
            } catch (Throwable th) {
                throw th;
            }
        }
        return dVarH;
    }

    @Override // Q1.c
    public final void i() {
        synchronized (this.f3984b) {
            try {
                this.f3989g = true;
                try {
                    if (this.f3987e != 4 && this.f3988f != 1) {
                        this.f3988f = 1;
                        this.f3986d.i();
                    }
                    if (this.f3989g && this.f3987e != 1) {
                        this.f3987e = 1;
                        this.f3985c.i();
                    }
                    this.f3989g = false;
                } catch (Throwable th) {
                    this.f3989g = false;
                    throw th;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // Q1.c
    public final boolean isRunning() {
        boolean z6;
        synchronized (this.f3984b) {
            z6 = true;
            if (this.f3987e != 1) {
                z6 = false;
            }
        }
        return z6;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [Q1.d, java.lang.Object] */
    @Override // Q1.d
    public final boolean j(c cVar) {
        boolean z6;
        synchronized (this.f3984b) {
            try {
                ?? r10 = this.a;
                z6 = (r10 == 0 || r10.j(this)) && (cVar.equals(this.f3985c) || this.f3987e != 4);
            } catch (Throwable th) {
                throw th;
            }
        }
        return z6;
    }

    @Override // Q1.c
    public final boolean k() {
        boolean z6;
        synchronized (this.f3984b) {
            z6 = this.f3987e == 4;
        }
        return z6;
    }

    @Override // Q1.c
    public final void pause() {
        synchronized (this.f3984b) {
            try {
                if (!E0.a.c(this.f3988f)) {
                    this.f3988f = 2;
                    this.f3986d.pause();
                }
                if (!E0.a.c(this.f3987e)) {
                    this.f3987e = 2;
                    this.f3985c.pause();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
