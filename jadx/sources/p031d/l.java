package p031d;

import B6.d;
import android.os.Looper;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewTreeObserver;
import java.util.concurrent.Executor;
import p078i.AbstractActivityC0655l;
import p195u1.b;

/* JADX INFO: loaded from: classes.dex */
public final class l implements Executor, ViewTreeObserver.OnDrawListener, Runnable {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public Runnable f10454t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ AbstractActivityC0655l f10456v;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final long f10453s = SystemClock.uptimeMillis() + 10000;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f10455u = false;

    public l(AbstractActivityC0655l abstractActivityC0655l) {
        this.f10456v = abstractActivityC0655l;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f10454t = runnable;
        View decorView = this.f10456v.getWindow().getDecorView();
        if (!this.f10455u) {
            decorView.postOnAnimation(new d(this, 16));
        } else if (Looper.myLooper() == Looper.getMainLooper()) {
            decorView.invalidate();
        } else {
            decorView.postInvalidate();
        }
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        boolean z6;
        Runnable runnable = this.f10454t;
        if (runnable == null) {
            if (SystemClock.uptimeMillis() > this.f10453s) {
                this.f10455u = false;
                this.f10456v.getWindow().getDecorView().post(this);
                return;
            }
            return;
        }
        runnable.run();
        this.f10454t = null;
        b bVar = this.f10456v.f10457A;
        synchronized (bVar.f15290u) {
            z6 = bVar.f15289t;
        }
        if (z6) {
            this.f10455u = false;
            this.f10456v.getWindow().getDecorView().post(this);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f10456v.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(this);
    }
}
