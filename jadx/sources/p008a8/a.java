package p008a8;

import J7.j;
import Q7.c;

/* JADX INFO: loaded from: classes.dex */
public abstract class a implements Q7.a, c {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Q7.a f6007s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public ua.a f6008t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public c f6009u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f6010v;

    public a(Q7.a aVar) {
        this.f6007s = aVar;
    }

    @Override // J7.f
    public void a() {
        if (this.f6010v) {
            return;
        }
        this.f6010v = true;
        this.f6007s.a();
    }

    @Override // J7.f
    public final void c(ua.a aVar) {
        if (p018b8.a.h(this.f6008t, aVar)) {
            this.f6008t = aVar;
            if (aVar instanceof c) {
                this.f6009u = (c) aVar;
            }
            this.f6007s.c(this);
        }
    }

    @Override // ua.a
    public final void cancel() {
        this.f6008t.cancel();
    }

    @Override // Q7.d
    public final void clear() {
        this.f6009u.clear();
    }

    @Override // ua.a
    public final void f(long j) {
        this.f6008t.f(j);
    }

    public int g() {
        return 0;
    }

    @Override // Q7.d
    public final boolean isEmpty() {
        return this.f6009u.isEmpty();
    }

    @Override // Q7.d
    public final boolean offer(Object obj) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override // J7.f
    public void onError(Throwable th) {
        if (this.f6010v) {
            j.y(th);
        } else {
            this.f6010v = true;
            this.f6007s.onError(th);
        }
    }
}
