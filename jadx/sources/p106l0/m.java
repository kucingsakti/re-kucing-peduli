package p106l0;

import A1.l;
import C8.E;
import E0.a;
import Fa.e;
import K3.d;
import N9.t0;
import R.c;
import R.h;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Handler;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class m implements f {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Context f12868s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final e f12869t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final d f12870u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final Object f12871v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Handler f12872w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public ThreadPoolExecutor f12873x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public ThreadPoolExecutor f12874y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public E f12875z;

    public m(Context context, e eVar) {
        d dVar = n.f12876d;
        this.f12871v = new Object();
        xa.d.d(context, "Context cannot be null");
        this.f12868s = context.getApplicationContext();
        this.f12869t = eVar;
        this.f12870u = dVar;
    }

    @Override // p106l0.f
    public final void a(E e10) {
        synchronized (this.f12871v) {
            this.f12875z = e10;
        }
        c();
    }

    public final void b() {
        synchronized (this.f12871v) {
            try {
                this.f12875z = null;
                Handler handler = this.f12872w;
                if (handler != null) {
                    handler.removeCallbacks(null);
                }
                this.f12872w = null;
                ThreadPoolExecutor threadPoolExecutor = this.f12874y;
                if (threadPoolExecutor != null) {
                    threadPoolExecutor.shutdown();
                }
                this.f12873x = null;
                this.f12874y = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void c() {
        synchronized (this.f12871v) {
            try {
                if (this.f12875z == null) {
                    return;
                }
                if (this.f12873x == null) {
                    ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new t0("emojiCompat"));
                    threadPoolExecutor.allowCoreThreadTimeOut(true);
                    this.f12874y = threadPoolExecutor;
                    this.f12873x = threadPoolExecutor;
                }
                this.f12873x.execute(new B6.d(this, 21));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final h d() {
        try {
            d dVar = this.f12870u;
            Context context = this.f12868s;
            e eVar = this.f12869t;
            dVar.getClass();
            l lVarA = c.a(context, eVar);
            int i10 = lVarA.f122s;
            if (i10 != 0) {
                throw new RuntimeException(a.g("fetchFonts failed (", i10, ")"));
            }
            h[] hVarArr = (h[]) lVarA.f123t;
            if (hVarArr == null || hVarArr.length == 0) {
                throw new RuntimeException("fetchFonts failed (empty result)");
            }
            return hVarArr[0];
        } catch (PackageManager.NameNotFoundException e10) {
            throw new RuntimeException("provider not found", e10);
        }
    }
}
