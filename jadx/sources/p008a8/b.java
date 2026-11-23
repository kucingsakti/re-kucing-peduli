package p008a8;

import J7.f;
import J7.j;
import Q7.c;
import ua.a;

/* JADX INFO: loaded from: classes.dex */
public abstract class b implements f, c {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final f f6011s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public a f6012t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public c f6013u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f6014v;

    public b(f fVar) {
        this.f6011s = fVar;
    }

    @Override // J7.f
    public void a() {
        if (this.f6014v) {
            return;
        }
        this.f6014v = true;
        this.f6011s.a();
    }

    @Override // J7.f
    public final void c(a aVar) {
        if (p018b8.a.h(this.f6012t, aVar)) {
            this.f6012t = aVar;
            if (aVar instanceof c) {
                this.f6013u = (c) aVar;
            }
            this.f6011s.c(this);
        }
    }

    @Override // ua.a
    public final void cancel() {
        this.f6012t.cancel();
    }

    @Override // Q7.d
    public final void clear() {
        this.f6013u.clear();
    }

    @Override // ua.a
    public final void f(long j) {
        this.f6012t.f(j);
    }

    public int g() {
        return 0;
    }

    @Override // Q7.d
    public final boolean isEmpty() {
        return this.f6013u.isEmpty();
    }

    @Override // Q7.d
    public final boolean offer(Object obj) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override // J7.f
    public void onError(Throwable th) {
        if (this.f6014v) {
            j.y(th);
        } else {
            this.f6014v = true;
            this.f6011s.onError(th);
        }
    }
}
