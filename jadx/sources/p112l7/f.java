package p112l7;

import J4.c;
import N4.e;
import V3.b;
import com.tonyodev.fetch2.Download;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class f implements Runnable {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f12952s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ c f12953t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Download f12954u;

    public /* synthetic */ f(c cVar, Download download, int i10) {
        this.f12952s = i10;
        this.f12953t = cVar;
        this.f12954u = download;
    }

    private final void a() {
        synchronized (((b) this.f12953t.f2406b).a) {
            Iterator it = ((ArrayList) ((b) this.f12953t.f2406b).f5174d).iterator();
            if (it.hasNext()) {
                ((e) it.next()).f(this.f12954u);
            }
        }
    }

    private final void b() {
        synchronized (((b) this.f12953t.f2406b).a) {
            Iterator it = ((ArrayList) ((b) this.f12953t.f2406b).f5174d).iterator();
            if (it.hasNext()) {
                ((e) it.next()).f(this.f12954u);
            }
        }
    }

    private final void c() {
        synchronized (((b) this.f12953t.f2406b).a) {
            Iterator it = ((ArrayList) ((b) this.f12953t.f2406b).f5174d).iterator();
            if (it.hasNext()) {
                ((e) it.next()).f(this.f12954u);
            }
        }
    }

    private final void d() {
        synchronized (((b) this.f12953t.f2406b).a) {
            Iterator it = ((ArrayList) ((b) this.f12953t.f2406b).f5174d).iterator();
            if (it.hasNext()) {
                ((e) it.next()).f(this.f12954u);
            }
        }
    }

    private final void e() {
        synchronized (((b) this.f12953t.f2406b).a) {
            Iterator it = ((ArrayList) ((b) this.f12953t.f2406b).f5174d).iterator();
            if (it.hasNext()) {
                ((e) it.next()).f(this.f12954u);
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f12952s) {
            case 0:
                a();
                return;
            case 1:
                b();
                return;
            case 2:
                c();
                return;
            case 3:
                d();
                return;
            case 4:
                e();
                return;
            default:
                synchronized (((b) this.f12953t.f2406b).a) {
                    Iterator it = ((ArrayList) ((b) this.f12953t.f2406b).f5174d).iterator();
                    if (it.hasNext()) {
                        ((e) it.next()).f(this.f12954u);
                    }
                    break;
                }
                return;
        }
    }
}
