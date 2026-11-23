package T7;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public final class j implements J7.f, L7.b {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f4725s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public ua.a f4726t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public long f4727u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f4728v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final Object f4729w;

    public /* synthetic */ j(Object obj, int i10) {
        this.f4725s = i10;
        this.f4729w = obj;
    }

    @Override // J7.f
    public final void a() {
        switch (this.f4725s) {
            case 0:
                this.f4726t = p018b8.a.f7319s;
                if (!this.f4728v) {
                    this.f4728v = true;
                    ((J7.i) this.f4729w).a();
                }
                break;
            default:
                this.f4726t = p018b8.a.f7319s;
                if (!this.f4728v) {
                    this.f4728v = true;
                    ((J7.p) this.f4729w).onError(new NoSuchElementException());
                }
                break;
        }
    }

    @Override // J7.f
    public final void c(ua.a aVar) {
        switch (this.f4725s) {
            case 0:
                if (p018b8.a.h(this.f4726t, aVar)) {
                    this.f4726t = aVar;
                    ((J7.i) this.f4729w).b(this);
                    aVar.f(Long.MAX_VALUE);
                }
                break;
            default:
                if (p018b8.a.h(this.f4726t, aVar)) {
                    this.f4726t = aVar;
                    ((J7.p) this.f4729w).b(this);
                    aVar.f(Long.MAX_VALUE);
                }
                break;
        }
    }

    @Override // J7.f
    public final void d(Object obj) {
        switch (this.f4725s) {
            case 0:
                if (!this.f4728v) {
                    long j = this.f4727u;
                    if (j != 0) {
                        this.f4727u = j + 1;
                    } else {
                        this.f4728v = true;
                        this.f4726t.cancel();
                        this.f4726t = p018b8.a.f7319s;
                        ((J7.i) this.f4729w).c(obj);
                    }
                    break;
                }
                break;
            default:
                if (!this.f4728v) {
                    long j10 = this.f4727u;
                    if (j10 != 0) {
                        this.f4727u = j10 + 1;
                    } else {
                        this.f4728v = true;
                        this.f4726t.cancel();
                        this.f4726t = p018b8.a.f7319s;
                        ((J7.p) this.f4729w).c(obj);
                    }
                    break;
                }
                break;
        }
    }

    @Override // L7.b
    public final void f() {
        switch (this.f4725s) {
            case 0:
                this.f4726t.cancel();
                this.f4726t = p018b8.a.f7319s;
                break;
            default:
                this.f4726t.cancel();
                this.f4726t = p018b8.a.f7319s;
                break;
        }
    }

    @Override // J7.f
    public final void onError(Throwable th) {
        switch (this.f4725s) {
            case 0:
                if (!this.f4728v) {
                    this.f4728v = true;
                    this.f4726t = p018b8.a.f7319s;
                    ((J7.i) this.f4729w).onError(th);
                } else {
                    J7.j.y(th);
                }
                break;
            default:
                if (!this.f4728v) {
                    this.f4728v = true;
                    this.f4726t = p018b8.a.f7319s;
                    ((J7.p) this.f4729w).onError(th);
                } else {
                    J7.j.y(th);
                }
                break;
        }
    }
}
