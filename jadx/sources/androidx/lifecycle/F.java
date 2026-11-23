package androidx.lifecycle;

import android.os.Handler;

/* JADX INFO: loaded from: classes.dex */
public final class F implements InterfaceC0523s {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static final F f6714A = new F();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f6715s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f6716t;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Handler f6719w;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f6717u = true;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f6718v = true;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final C0525u f6720x = new C0525u(this);

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final B6.d f6721y = new B6.d(this, 5);

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final V.h f6722z = new V.h(this, 6);

    public final void b() {
        int i10 = this.f6716t + 1;
        this.f6716t = i10;
        if (i10 == 1) {
            if (this.f6717u) {
                this.f6720x.d(EnumC0518m.ON_RESUME);
                this.f6717u = false;
            } else {
                Handler handler = this.f6719w;
                p210v8.i.c(handler);
                handler.removeCallbacks(this.f6721y);
            }
        }
    }

    @Override // androidx.lifecycle.InterfaceC0523s
    public final C0525u g() {
        return this.f6720x;
    }
}
