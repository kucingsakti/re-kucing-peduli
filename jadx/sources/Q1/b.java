package Q1;

/* JADX INFO: loaded from: classes.dex */
public final class b implements d, c {
    public final Object a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f3955b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile c f3956c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile c f3957d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f3958e = 3;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f3959f = 3;

    public b(Object obj, d dVar) {
        this.a = obj;
        this.f3955b = dVar;
    }

    @Override // Q1.d, Q1.c
    public final boolean a() {
        boolean z6;
        synchronized (this.a) {
            try {
                z6 = this.f3956c.a() || this.f3957d.a();
            } catch (Throwable th) {
                throw th;
            }
        }
        return z6;
    }

    @Override // Q1.c
    public final boolean b(c cVar) {
        if (cVar instanceof b) {
            b bVar = (b) cVar;
            if (this.f3956c.b(bVar.f3956c) && this.f3957d.b(bVar.f3957d)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [Q1.d, java.lang.Object] */
    @Override // Q1.d
    public final boolean c(c cVar) {
        boolean z6;
        synchronized (this.a) {
            ?? r10 = this.f3955b;
            z6 = (r10 == 0 || r10.c(this)) && cVar.equals(this.f3956c);
        }
        return z6;
    }

    @Override // Q1.c
    public final void clear() {
        synchronized (this.a) {
            try {
                this.f3958e = 3;
                this.f3956c.clear();
                if (this.f3959f != 3) {
                    this.f3959f = 3;
                    this.f3957d.clear();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [Q1.d, java.lang.Object] */
    @Override // Q1.d
    public final boolean d(c cVar) {
        boolean z6;
        boolean zEquals;
        int i10;
        synchronized (this.a) {
            ?? r10 = this.f3955b;
            z6 = false;
            if (r10 == 0 || r10.d(this)) {
                if (this.f3958e != 5) {
                    zEquals = cVar.equals(this.f3956c);
                } else {
                    zEquals = cVar.equals(this.f3957d) && ((i10 = this.f3959f) == 4 || i10 == 5);
                }
                if (zEquals) {
                    z6 = true;
                }
            }
        }
        return z6;
    }

    /* JADX WARN: Type inference failed for: r4v3, types: [Q1.d, java.lang.Object] */
    @Override // Q1.d
    public final void e(c cVar) {
        synchronized (this.a) {
            try {
                if (cVar.equals(this.f3956c)) {
                    this.f3958e = 4;
                } else if (cVar.equals(this.f3957d)) {
                    this.f3959f = 4;
                }
                ?? r10 = this.f3955b;
                if (r10 != 0) {
                    r10.e(this);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r3v3, types: [Q1.d, java.lang.Object] */
    @Override // Q1.d
    public final void f(c cVar) {
        synchronized (this.a) {
            try {
                if (cVar.equals(this.f3957d)) {
                    this.f3959f = 5;
                    ?? r10 = this.f3955b;
                    if (r10 != 0) {
                        r10.f(this);
                    }
                    return;
                }
                this.f3958e = 5;
                if (this.f3959f != 1) {
                    this.f3959f = 1;
                    this.f3957d.i();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // Q1.c
    public final boolean g() {
        boolean z6;
        synchronized (this.a) {
            try {
                z6 = this.f3958e == 3 && this.f3959f == 3;
            } catch (Throwable th) {
                throw th;
            }
        }
        return z6;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [Q1.d, java.lang.Object] */
    @Override // Q1.d
    public final d h() {
        d dVarH;
        synchronized (this.a) {
            try {
                ?? r10 = this.f3955b;
                dVarH = r10 != 0 ? r10.h() : this;
            } catch (Throwable th) {
                throw th;
            }
        }
        return dVarH;
    }

    @Override // Q1.c
    public final void i() {
        synchronized (this.a) {
            try {
                if (this.f3958e != 1) {
                    this.f3958e = 1;
                    this.f3956c.i();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // Q1.c
    public final boolean isRunning() {
        boolean z6;
        synchronized (this.a) {
            try {
                z6 = true;
                if (this.f3958e != 1 && this.f3959f != 1) {
                    z6 = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return z6;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [Q1.d, java.lang.Object] */
    @Override // Q1.d
    public final boolean j(c cVar) {
        boolean z6;
        synchronized (this.a) {
            ?? r10 = this.f3955b;
            z6 = r10 == 0 || r10.j(this);
        }
        return z6;
    }

    @Override // Q1.c
    public final boolean k() {
        boolean z6;
        synchronized (this.a) {
            try {
                z6 = this.f3958e == 4 || this.f3959f == 4;
            } catch (Throwable th) {
                throw th;
            }
        }
        return z6;
    }

    @Override // Q1.c
    public final void pause() {
        synchronized (this.a) {
            try {
                if (this.f3958e == 1) {
                    this.f3958e = 2;
                    this.f3956c.pause();
                }
                if (this.f3959f == 1) {
                    this.f3959f = 2;
                    this.f3957d.pause();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
