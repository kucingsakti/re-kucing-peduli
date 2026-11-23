package L1;

import A1.p;
import B4.C0163k;
import U1.n;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import com.bumptech.glide.j;
import com.bumptech.glide.l;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class g {
    public final p223x1.d a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Handler f2758b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f2759c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final l f2760d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final B1.b f2761e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f2762f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f2763g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public j f2764h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public e f2765i;
    public boolean j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public e f2766k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Bitmap f2767l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public e f2768m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f2769n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f2770o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f2771p;

    public g(com.bumptech.glide.b bVar, p223x1.d dVar, int i10, int i11, Bitmap bitmap) {
        G1.c cVar = G1.c.f1689b;
        B1.b bVar2 = bVar.f7587s;
        com.bumptech.glide.f fVar = bVar.f7589u;
        Context baseContext = fVar.getBaseContext();
        U1.f.c(baseContext, "You cannot start a load on a not yet attached View or a Fragment where getActivity() returns null (which usually occurs when getActivity() is called before the Fragment is attached or after the Fragment is destroyed).");
        l lVarF = com.bumptech.glide.b.b(baseContext).f7591w.f(baseContext);
        Context baseContext2 = fVar.getBaseContext();
        U1.f.c(baseContext2, "You cannot start a load on a not yet attached View or a Fragment where getActivity() returns null (which usually occurs when getActivity() is called before the Fragment is attached or after the Fragment is destroyed).");
        l lVarF2 = com.bumptech.glide.b.b(baseContext2).f7591w.f(baseContext2);
        lVarF2.getClass();
        j jVarU = new j(lVarF2.f7632s, lVarF2, Bitmap.class, lVarF2.f7633t).a(l.f7629C).a(((Q1.e) ((Q1.e) ((Q1.e) new Q1.e().e(p.f160c)).s()).p()).i(i10, i11));
        this.f2759c = new ArrayList();
        this.f2760d = lVarF;
        Handler handler = new Handler(Looper.getMainLooper(), new C0163k(this, 1));
        this.f2761e = bVar2;
        this.f2758b = handler;
        this.f2764h = jVarU;
        this.a = dVar;
        c(cVar, bitmap);
    }

    public final void a() {
        int i10;
        int i11;
        if (!this.f2762f || this.f2763g) {
            return;
        }
        e eVar = this.f2768m;
        if (eVar != null) {
            this.f2768m = null;
            b(eVar);
            return;
        }
        this.f2763g = true;
        p223x1.d dVar = this.a;
        p223x1.b bVar = dVar.f15741l;
        int i12 = bVar.f15721c;
        if (i12 <= 0 || (i11 = dVar.f15740k) < 0) {
            i10 = 0;
        } else {
            i10 = (i11 < 0 || i11 >= i12) ? -1 : ((p223x1.a) bVar.f15723e.get(i11)).f15718i;
        }
        long jUptimeMillis = SystemClock.uptimeMillis() + ((long) i10);
        int i13 = (dVar.f15740k + 1) % dVar.f15741l.f15721c;
        dVar.f15740k = i13;
        this.f2766k = new e(this.f2758b, i13, jUptimeMillis);
        j jVarA = this.f2764h.a((Q1.e) new Q1.e().m(new T1.b(Double.valueOf(Math.random())))).A(dVar);
        jVarA.x(this.f2766k, jVarA);
    }

    public final void b(e eVar) {
        this.f2763g = false;
        boolean z6 = this.j;
        Handler handler = this.f2758b;
        if (z6) {
            handler.obtainMessage(2, eVar).sendToTarget();
            return;
        }
        if (!this.f2762f) {
            this.f2768m = eVar;
            return;
        }
        if (eVar.f2757y != null) {
            Bitmap bitmap = this.f2767l;
            if (bitmap != null) {
                this.f2761e.h(bitmap);
                this.f2767l = null;
            }
            e eVar2 = this.f2765i;
            this.f2765i = eVar;
            ArrayList arrayList = this.f2759c;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                c cVar = (c) ((f) arrayList.get(size));
                Object callback = cVar.getCallback();
                while (callback instanceof Drawable) {
                    callback = ((Drawable) callback).getCallback();
                }
                if (callback == null) {
                    cVar.stop();
                    cVar.invalidateSelf();
                } else {
                    cVar.invalidateSelf();
                    g gVar = (g) cVar.f2742s.f2739b;
                    e eVar3 = gVar.f2765i;
                    if ((eVar3 != null ? eVar3.f2755w : -1) == gVar.a.f15741l.f15721c - 1) {
                        cVar.f2747x++;
                    }
                    int i10 = cVar.f2748y;
                    if (i10 != -1 && cVar.f2747x >= i10) {
                        cVar.stop();
                    }
                }
            }
            if (eVar2 != null) {
                handler.obtainMessage(2, eVar2).sendToTarget();
            }
        }
        a();
    }

    public final void c(p232y1.l lVar, Bitmap bitmap) {
        U1.f.c(lVar, "Argument must not be null");
        U1.f.c(bitmap, "Argument must not be null");
        this.f2767l = bitmap;
        this.f2764h = this.f2764h.a(new Q1.e().r(lVar, true));
        this.f2769n = n.c(bitmap);
        this.f2770o = bitmap.getWidth();
        this.f2771p = bitmap.getHeight();
    }
}
