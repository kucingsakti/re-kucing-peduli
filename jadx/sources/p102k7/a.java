package p102k7;

import Fa.e;
import P2.g;
import V3.b;
import Y1.c;
import android.content.Context;
import com.tonyodev.fetch2.Download;
import com.tonyodev.fetch2.database.DownloadInfo;
import com.tonyodev.fetch2.exception.FetchException;
import h7.d;
import java.io.Closeable;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import o1.k;
import o1.r;
import p163q7.f;
import p210v8.i;

/* JADX INFO: loaded from: classes.dex */
public final class a implements Closeable {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final p143o7.a f12701A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final p122m7.a f12702B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final r f12703C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final b f12704D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final d f12705E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public final k f12706F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public final Context f12707G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public final c f12708H;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Object f12709s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final ExecutorService f12710t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public volatile int f12711u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final HashMap f12712v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public volatile int f12713w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public volatile boolean f12714x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final p185s7.a f12715y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final f f12716z;

    public a(p185s7.a aVar, f fVar, p143o7.a aVar2, p122m7.a aVar3, r rVar, b bVar, d dVar, k kVar, Context context, c cVar) {
        i.g(fVar, "logger");
        i.g(dVar, "fileServerDownloader");
        i.g(context, "context");
        this.f12715y = aVar;
        this.f12716z = fVar;
        this.f12701A = aVar2;
        this.f12702B = aVar3;
        this.f12703C = rVar;
        this.f12704D = bVar;
        this.f12705E = dVar;
        this.f12706F = kVar;
        this.f12707G = context;
        this.f12708H = cVar;
        this.f12709s = new Object();
        this.f12710t = Executors.newFixedThreadPool(999);
        this.f12711u = 999;
        this.f12712v = new HashMap();
    }

    public static final void a(a aVar, Download download) {
        synchronized (aVar.f12709s) {
            try {
                if (aVar.f12712v.containsKey(Integer.valueOf(((DownloadInfo) download).f10360s))) {
                    aVar.f12712v.remove(Integer.valueOf(((DownloadInfo) download).f10360s));
                    aVar.f12713w--;
                }
                aVar.f12703C.v(((DownloadInfo) download).f10360s);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean b() {
        boolean z6;
        synchronized (this.f12709s) {
            z6 = !this.f12714x && this.f12713w < this.f12711u;
        }
        return z6;
    }

    public final void c() {
        synchronized (this.f12709s) {
            if (this.f12714x) {
                throw new FetchException("DownloadManager is already shutdown.");
            }
            g();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        synchronized (this.f12709s) {
            try {
                if (this.f12714x) {
                    return;
                }
                this.f12714x = true;
                if (this.f12711u > 0) {
                    o();
                }
                this.f12716z.getClass();
                try {
                    ExecutorService executorService = this.f12710t;
                    if (executorService != null) {
                        executorService.shutdown();
                    }
                } catch (Exception unused) {
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void g() {
        List<b> listS0;
        if (this.f12711u > 0) {
            r rVar = this.f12703C;
            synchronized (rVar.f13675t) {
                listS0 = p086i8.k.s0(((LinkedHashMap) rVar.f13676u).values());
            }
            for (b bVar : listS0) {
                if (bVar != null) {
                    bVar.h();
                    this.f12703C.v(bVar.l().f10360s);
                    this.f12716z.a("DownloadManager cancelled download " + bVar.l());
                }
            }
        }
        this.f12712v.clear();
        this.f12713w = 0;
    }

    public final boolean h(int i10) {
        if (this.f12714x) {
            throw new FetchException("DownloadManager is already shutdown.");
        }
        b bVar = (b) this.f12712v.get(Integer.valueOf(i10));
        if (bVar == null) {
            r rVar = this.f12703C;
            synchronized (rVar.f13675t) {
                b bVar2 = (b) ((LinkedHashMap) rVar.f13676u).get(Integer.valueOf(i10));
                if (bVar2 != null) {
                    bVar2.h();
                    ((LinkedHashMap) rVar.f13676u).remove(Integer.valueOf(i10));
                }
            }
            return false;
        }
        bVar.h();
        this.f12712v.remove(Integer.valueOf(i10));
        this.f12713w--;
        this.f12703C.v(i10);
        this.f12716z.a("DownloadManager cancelled download " + bVar.l());
        return bVar.p();
    }

    public final boolean i(int i10) {
        boolean z6;
        synchronized (this.f12709s) {
            z6 = !this.f12714x && this.f12703C.k(i10);
        }
        return z6;
    }

    public final b j(Download download, p163q7.d dVar) {
        e eVarT = p068ga.d.t(download);
        dVar.L(eVarT);
        p163q7.b bVarS = dVar.s(eVarT, dVar.r(eVarT));
        p163q7.b bVar = p163q7.b.f14419s;
        p143o7.a aVar = this.f12701A;
        k kVar = this.f12706F;
        if (bVarS == bVar) {
            return new f(download, dVar, this.f12716z, aVar, kVar);
        }
        return new c(download, dVar, this.f12716z, aVar, (String) kVar.f13639t, kVar);
    }

    public final b l(Download download) {
        return !C3.b.I(((DownloadInfo) download).f10362u) ? j(download, this.f12715y) : j(download, this.f12705E);
    }

    public final void n(Download download) {
        synchronized (this.f12709s) {
            if (this.f12714x) {
                throw new FetchException("DownloadManager is already shutdown.");
            }
            if (this.f12712v.containsKey(Integer.valueOf(((DownloadInfo) download).f10360s))) {
                this.f12716z.a("DownloadManager already running download " + download);
                return;
            }
            if (this.f12713w >= this.f12711u) {
                this.f12716z.a("DownloadManager cannot init download " + download + " because the download queue is full");
                return;
            }
            this.f12713w++;
            this.f12712v.put(Integer.valueOf(((DownloadInfo) download).f10360s), null);
            this.f12703C.f(((DownloadInfo) download).f10360s, null);
            ExecutorService executorService = this.f12710t;
            if (executorService == null || executorService.isShutdown()) {
                return;
            }
            executorService.execute(new g(this, 10, download));
        }
    }

    public final void o() {
        for (Map.Entry entry : this.f12712v.entrySet()) {
            b bVar = (b) entry.getValue();
            if (bVar != null) {
                bVar.j();
                this.f12716z.a("DownloadManager terminated download " + bVar.l());
                this.f12703C.v(((Number) entry.getKey()).intValue());
            }
        }
        this.f12712v.clear();
        this.f12713w = 0;
    }
}
