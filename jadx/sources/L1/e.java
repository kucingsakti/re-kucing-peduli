package L1;

import U1.n;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Handler;

/* JADX INFO: loaded from: classes.dex */
public final class e implements R1.c {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final int f2751s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final int f2752t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public Q1.c f2753u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final Handler f2754v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final int f2755w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final long f2756x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public Bitmap f2757y;

    public e(Handler handler, int i10, long j) {
        if (!n.j(Integer.MIN_VALUE, Integer.MIN_VALUE)) {
            throw new IllegalArgumentException("Width and height must both be > 0 or Target#SIZE_ORIGINAL, but given width: -2147483648 and height: -2147483648");
        }
        this.f2751s = Integer.MIN_VALUE;
        this.f2752t = Integer.MIN_VALUE;
        this.f2754v = handler;
        this.f2755w = i10;
        this.f2756x = j;
    }

    @Override // R1.c
    public final void d(Q1.f fVar) {
        fVar.j(this.f2751s, this.f2752t);
    }

    @Override // R1.c
    public final void f(Q1.c cVar) {
        this.f2753u = cVar;
    }

    @Override // R1.c
    public final void g(Object obj, S1.c cVar) {
        this.f2757y = (Bitmap) obj;
        Handler handler = this.f2754v;
        handler.sendMessageAtTime(handler.obtainMessage(1, this), this.f2756x);
    }

    @Override // R1.c
    public final Q1.c i() {
        return this.f2753u;
    }

    @Override // R1.c
    public final void j(Drawable drawable) {
        this.f2757y = null;
    }

    @Override // N1.i
    public final void c() {
    }

    @Override // N1.i
    public final void e() {
    }

    @Override // N1.i
    public final void k() {
    }

    @Override // R1.c
    public final void a(Q1.f fVar) {
    }

    @Override // R1.c
    public final void b(Drawable drawable) {
    }

    @Override // R1.c
    public final void h(Drawable drawable) {
    }
}
