package p122m7;

import J4.j;
import V3.b;
import android.content.Context;
import android.content.IntentFilter;
import androidx.datastore.preferences.protobuf.AbstractC0487g;
import java.io.Closeable;
import p102k7.a;
import p163q7.f;
import p163q7.i;

/* JADX INFO: loaded from: classes.dex */
public final class e implements Closeable {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final a f13145A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final p143o7.a f13146B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final f f13147C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final b f13148D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final Context f13149E;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Object f13150s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public volatile boolean f13151t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public volatile long f13152u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final c f13153v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final j f13154w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final d f13155x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final i f13156y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final a f13157z;

    public e(i iVar, a aVar, a aVar2, p143o7.a aVar3, f fVar, b bVar, Context context) {
        p210v8.i.g(fVar, "logger");
        p210v8.i.g(context, "context");
        AbstractC0487g.v(1, "prioritySort");
        this.f13156y = iVar;
        this.f13157z = aVar;
        this.f13145A = aVar2;
        this.f13146B = aVar3;
        this.f13147C = fVar;
        this.f13148D = bVar;
        this.f13149E = context;
        this.f13150s = new Object();
        this.f13151t = true;
        this.f13152u = 500L;
        c cVar = new c(this);
        this.f13153v = cVar;
        j jVar = new j(this, 5);
        this.f13154w = jVar;
        synchronized (aVar3.a) {
            aVar3.f13820b.add(cVar);
        }
        context.registerReceiver(jVar, new IntentFilter("com.tonyodev.fetch2.action.QUEUE_BACKOFF_RESET"));
        this.f13155x = new d(this, 0);
    }

    public static final boolean a(e eVar) {
        return !eVar.f13151t;
    }

    public final void b() {
        i iVar = this.f13156y;
        d dVar = this.f13155x;
        long j = this.f13152u;
        p210v8.i.g(dVar, "runnable");
        synchronized (iVar.a) {
            if (!iVar.f14432b) {
                iVar.f14434d.postDelayed(dVar, j);
            }
        }
    }

    public final void c() {
        synchronized (this.f13150s) {
            this.f13152u = 500L;
            i();
            b();
            this.f13147C.a("PriorityIterator backoffTime reset to " + this.f13152u + " milliseconds");
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        synchronized (this.f13150s) {
            this.f13146B.d(this.f13153v);
            this.f13149E.unregisterReceiver(this.f13154w);
        }
    }

    public final void g() {
        synchronized (this.f13150s) {
            c();
            this.f13151t = false;
            b();
            this.f13147C.getClass();
        }
    }

    public final void h() {
        synchronized (this.f13150s) {
            i();
            this.f13151t = true;
            this.f13145A.c();
            this.f13147C.getClass();
        }
    }

    public final void i() {
        i iVar = this.f13156y;
        d dVar = this.f13155x;
        p210v8.i.g(dVar, "runnable");
        synchronized (iVar.a) {
            if (!iVar.f14432b) {
                iVar.f14434d.removeCallbacks(dVar);
            }
        }
    }
}
