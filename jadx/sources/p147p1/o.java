package p147p1;

import D4.a;
import M2.O;
import P2.g;
import Y1.c;
import android.content.Context;
import android.os.Build;
import p050f1.p;
import p050f1.q;
import p157q1.k;

/* JADX INFO: loaded from: classes.dex */
public final class o implements Runnable {

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final /* synthetic */ int f14185y = 0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final k f14186s = new k();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Context f14187t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final o1.o f14188u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final p f14189v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final p f14190w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final c f14191x;

    static {
        q.c("WorkForegroundRunnable");
    }

    public o(Context context, o1.o oVar, p pVar, p pVar2, c cVar) {
        this.f14187t = context;
        this.f14188u = oVar;
        this.f14189v = pVar;
        this.f14190w = pVar2;
        this.f14191x = cVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (!this.f14188u.f13660q || Build.VERSION.SDK_INT >= 31) {
            this.f14186s.j(null);
            return;
        }
        k kVar = new k();
        c cVar = this.f14191x;
        ((O) cVar.f5672v).execute(new a(this, 21, kVar));
        kVar.f(new g((Object) this, (Object) kVar, 23, false), (O) cVar.f5672v);
    }
}
