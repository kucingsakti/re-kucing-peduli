package p102k7;

import D6.a;
import E.g;
import Fa.e;
import android.content.ContentResolver;
import android.content.Context;
import com.tonyodev.fetch2.Download;
import com.tonyodev.fetch2.database.DownloadInfo;
import com.tonyodev.fetch2.exception.FetchException;
import com.tonyodev.fetch2core.DownloadBlockInfo;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import o1.k;
import p076h8.j;
import p081i3.b;
import p086i8.C;
import p086i8.m;
import p086i8.s;
import p163q7.d;
import p163q7.f;
import p163q7.h;
import p210v8.i;

/* JADX INFO: loaded from: classes.dex */
public final class c implements b {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final g f12717A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public long f12718B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public ExecutorService f12719C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public volatile int f12720D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public int f12721E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public final Object f12722F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public volatile Exception f12723G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public List f12724H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public a f12725I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public int f12726J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public final b f12727K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public final Download f12728L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public final d f12729M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public final f f12730N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public final p143o7.a f12731O;
    public final String P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public final k f12732Q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public volatile boolean f12733s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public volatile boolean f12734t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public p122m7.b f12735u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final j f12736v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public volatile long f12737w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public volatile long f12738x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public volatile boolean f12739y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public double f12740z;

    public c(Download download, d dVar, f fVar, p143o7.a aVar, String str, k kVar) {
        i.g(dVar, "downloader");
        i.g(fVar, "logger");
        i.g(str, "fileTempDir");
        this.f12728L = download;
        this.f12729M = dVar;
        this.f12730N = fVar;
        this.f12731O = aVar;
        this.P = str;
        this.f12732Q = kVar;
        this.f12736v = D3.b.s(new c2.a(this, 10));
        this.f12738x = -1L;
        this.f12717A = new g(5);
        this.f12718B = -1L;
        this.f12722F = new Object();
        this.f12724H = s.f12328s;
        this.f12727K = new b(this, 3);
    }

    public static final void a(c cVar) {
        synchronized (cVar.f12722F) {
            cVar.f12720D++;
        }
    }

    public final void b(e eVar, ArrayList arrayList) throws IOException {
        this.f12720D = 0;
        this.f12721E = arrayList.size();
        if (!this.f12732Q.k((String) eVar.f1661v)) {
            this.f12732Q.f((String) eVar.f1661v, ((DownloadInfo) this.f12728L).f10352G == 2);
        }
        this.f12732Q.s((String) eVar.f1661v, e().f10346A);
        ContentResolver contentResolver = ((Context) this.f12732Q.f13638s).getContentResolver();
        i.b(contentResolver, "context.contentResolver");
        a aVarV = C4.a.v(contentResolver, (String) eVar.f1661v);
        this.f12725I = aVarV;
        aVarV.a(0L);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            p163q7.g gVar = (p163q7.g) it.next();
            if (this.f12733s || this.f12734t) {
                return;
            }
            ExecutorService executorService = this.f12719C;
            if (executorService != null) {
                executorService.execute(new P2.g(this, 11, gVar));
            }
        }
    }

    public final long c() {
        double d3 = this.f12740z;
        if (d3 < 1) {
            return 0L;
        }
        return (long) Math.ceil(d3);
    }

    public final p122m7.b d() {
        return this.f12735u;
    }

    public final DownloadInfo e() {
        return (DownloadInfo) this.f12736v.getValue();
    }

    public final List f(boolean z6, e eVar) {
        long jLongValue;
        h hVar;
        long jLongValue2;
        if (!this.f12732Q.k(e().f10363v)) {
            p068ga.d.j(e().f10360s, this.P);
        }
        int i10 = e().f10360s;
        String str = this.P;
        i.g(str, "fileTempDir");
        int iLongValue = -1;
        try {
            Long lY = C3.b.y(p068ga.d.s(i10, str));
            if (lY != null) {
                iLongValue = (int) lY.longValue();
            }
        } catch (Exception unused) {
        }
        if (!z6 || this.f12739y) {
            if (iLongValue != 1) {
                p068ga.d.j(e().f10360s, this.P);
            }
            p068ga.d.A(e().f10360s, this.P, 1);
            int i11 = e().f10360s;
            long j = this.f12738x;
            int i12 = e().f10360s;
            String str2 = this.P;
            i.g(str2, "fileTempDir");
            try {
                Long lY2 = C3.b.y(p068ga.d.n(i12, str2, 1));
                jLongValue = lY2 != null ? lY2.longValue() : 0L;
            } catch (Exception unused2) {
            }
            p163q7.g gVar = new p163q7.g(i11, 1, 0L, j, jLongValue);
            this.f12737w += gVar.f14430e;
            return com.bumptech.glide.d.u(gVar);
        }
        this.f12729M.q(eVar);
        long j10 = this.f12738x;
        float f10 = j10;
        float f11 = (f10 / 1024.0f) * 1024.0f;
        if (1024.0f * f11 >= 1.0f) {
            hVar = new h(6, (long) Math.ceil(f10 / 6));
        } else {
            hVar = f11 >= 1.0f ? new h(4, (long) Math.ceil(f10 / 4)) : new h(2, j10);
        }
        if (iLongValue != hVar.a) {
            p068ga.d.j(e().f10360s, this.P);
        }
        p068ga.d.A(e().f10360s, this.P, hVar.a);
        ArrayList arrayList = new ArrayList();
        int i13 = hVar.a;
        if (1 > i13) {
            return arrayList;
        }
        int i14 = 1;
        long j11 = 0;
        while (!this.f12733s && !this.f12734t) {
            long j12 = hVar.a == i14 ? this.f12738x : hVar.f14431b + j11;
            int i15 = e().f10360s;
            int i16 = e().f10360s;
            String str3 = this.P;
            i.g(str3, "fileTempDir");
            try {
                Long lY3 = C3.b.y(p068ga.d.n(i16, str3, i14));
                jLongValue2 = lY3 != null ? lY3.longValue() : 0L;
            } catch (Exception unused3) {
            }
            p163q7.g gVar2 = new p163q7.g(i15, i14, j11, j12, jLongValue2);
            this.f12737w += gVar2.f14430e;
            arrayList.add(gVar2);
            if (i14 == i13) {
                return arrayList;
            }
            i14++;
            j11 = j12;
        }
        return arrayList;
    }

    public final boolean g() {
        return this.f12734t;
    }

    @Override // p102k7.b
    public final void h() {
        p122m7.b bVar = this.f12735u;
        if (!(bVar instanceof p122m7.b)) {
            bVar = null;
        }
        if (bVar != null) {
            bVar.a = true;
        }
        this.f12733s = true;
    }

    @Override // p102k7.b
    public final void i(p122m7.b bVar) {
        this.f12735u = bVar;
    }

    @Override // p102k7.b
    public final void j() {
        p122m7.b bVar = this.f12735u;
        if (!(bVar instanceof p122m7.b)) {
            bVar = null;
        }
        if (bVar != null) {
            bVar.a = true;
        }
        this.f12734t = true;
    }

    public final boolean k() {
        return ((this.f12737w > 0 && this.f12738x > 0) || this.f12739y) && this.f12737w >= this.f12738x;
    }

    @Override // p102k7.b
    public final DownloadInfo l() {
        e().f10367z = this.f12737w;
        e().f10346A = this.f12738x;
        return e();
    }

    public final void m(p163q7.c cVar) {
        if (cVar.f14422b && cVar.f14423c == -1) {
            this.f12739y = true;
        }
    }

    public final void n() {
        long j = this.f12737w;
        long jNanoTime = System.nanoTime();
        long jNanoTime2 = System.nanoTime();
        while (this.f12720D != this.f12721E && !this.f12733s && !this.f12734t) {
            e().f10367z = this.f12737w;
            e().f10346A = this.f12738x;
            boolean zC = C3.b.C(jNanoTime2, System.nanoTime(), 1000L);
            long j10 = jNanoTime2;
            if (zC) {
                this.f12717A.a(this.f12737w - j);
                this.f12740z = g.b(this.f12717A);
                this.f12718B = C3.b.c(this.f12737w, this.f12738x, c());
                j = this.f12737w;
            }
            if (C3.b.C(jNanoTime, System.nanoTime(), 400L)) {
                synchronized (this.f12722F) {
                    try {
                        if (!this.f12733s && !this.f12734t) {
                            e().f10367z = this.f12737w;
                            e().f10346A = this.f12738x;
                            p122m7.b bVar = this.f12735u;
                            if (bVar != null) {
                                bVar.e(e());
                            }
                            e().f10358M = this.f12718B;
                            e().f10359N = c();
                            p122m7.b bVar2 = this.f12735u;
                            if (bVar2 != null) {
                                bVar2.c(e(), e().f10358M, e().f10359N);
                            }
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                jNanoTime = System.nanoTime();
            }
            jNanoTime2 = zC ? System.nanoTime() : j10;
            try {
                Thread.sleep(400L);
            } catch (InterruptedException unused) {
                this.f12730N.getClass();
            }
        }
    }

    @Override // p102k7.b
    public final boolean p() {
        return this.f12733s;
    }

    /* JADX WARN: Code duplicated, block: B:182:0x03d8 A[Catch: all -> 0x03ca, TryCatch #5 {all -> 0x03ca, blocks: (B:163:0x0384, B:165:0x038a, B:167:0x0390, B:171:0x03bb, B:172:0x03be, B:182:0x03d8, B:183:0x03da, B:185:0x03fb, B:187:0x0401, B:189:0x0413, B:175:0x03c7, B:179:0x03d0), top: B:237:0x0384, inners: #10 }] */
    /* JADX WARN: Code duplicated, block: B:189:0x0413 A[Catch: all -> 0x03ca, TRY_LEAVE, TryCatch #5 {all -> 0x03ca, blocks: (B:163:0x0384, B:165:0x038a, B:167:0x0390, B:171:0x03bb, B:172:0x03be, B:182:0x03d8, B:183:0x03da, B:185:0x03fb, B:187:0x0401, B:189:0x0413, B:175:0x03c7, B:179:0x03d0), top: B:237:0x0384, inners: #10 }] */
    /* JADX WARN: Code duplicated, block: B:192:0x041e A[Catch: Exception -> 0x0422, TRY_LEAVE, TryCatch #13 {Exception -> 0x0422, blocks: (B:190:0x041a, B:192:0x041e), top: B:250:0x041a }] */
    /* JADX WARN: Code duplicated, block: B:198:0x042c A[Catch: Exception -> 0x0430, TRY_LEAVE, TryCatch #0 {Exception -> 0x0430, blocks: (B:196:0x0428, B:198:0x042c), top: B:227:0x0428 }] */
    /* JADX WARN: Code duplicated, block: B:210:0x0447 A[Catch: Exception -> 0x044b, TRY_LEAVE, TryCatch #2 {Exception -> 0x044b, blocks: (B:208:0x0443, B:210:0x0447), top: B:231:0x0443 }] */
    /* JADX WARN: Code duplicated, block: B:216:0x0455 A[Catch: Exception -> 0x0459, TRY_LEAVE, TryCatch #11 {Exception -> 0x0459, blocks: (B:214:0x0451, B:216:0x0455), top: B:246:0x0451 }] */
    /* JADX WARN: Code duplicated, block: B:240:0x0438 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:248:0x0461 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        Throwable th;
        a aVar;
        ExecutorService executorService;
        a aVar2;
        ExecutorService executorService2;
        p122m7.b bVarD;
        p122m7.b bVarD2;
        boolean z6 = true;
        p163q7.c cVar = null;
        try {
            try {
                this.f12737w = ((DownloadInfo) this.f12728L).getF10367z();
                this.f12738x = ((DownloadInfo) this.f12728L).getF10346A();
                e().e(this.f12737w);
                e().h(this.f12738x);
                this.f12729M.L(p068ga.d.t(this.f12728L));
                e eVarT = p068ga.d.t(this.f12728L);
                p163q7.c cVarP = this.f12729M.P(eVarT, this.f12727K);
                if (cVarP != null) {
                    m(cVarP);
                }
                if (p() || g() || cVarP == null || !cVarP.f14422b) {
                    if (cVarP == null && !p() && !g() && !k()) {
                        throw new FetchException("empty_response_body");
                    }
                    if (cVarP != null && !cVarP.f14422b && !p() && !g() && !k()) {
                        throw new FetchException("request_not_successful");
                    }
                    if (!p() && !g() && !k()) {
                        throw new FetchException("unknown");
                    }
                } else {
                    this.f12738x = cVarP.b();
                    if (!this.f12739y && this.f12738x <= 0) {
                        throw new FetchException("empty_response_body");
                    }
                    this.f12737w = 0L;
                    e().e(this.f12737w);
                    e().h(this.f12738x);
                    List listF = f(cVarP.a(), eVarT);
                    this.f12724H = listF;
                    this.f12726J = listF.size();
                    try {
                        this.f12729M.k(cVarP);
                    } catch (Exception e10) {
                        this.f12730N.b("FileDownloader", e10);
                    }
                    List list = this.f12724H;
                    ArrayList arrayList = new ArrayList();
                    for (Object obj : list) {
                        if (!((p163q7.g) obj).e()) {
                            arrayList.add(obj);
                        }
                    }
                    if (!p() && !g()) {
                        e().e(this.f12737w);
                        e().h(this.f12738x);
                        List<p163q7.g> list2 = this.f12724H;
                        ArrayList<DownloadBlockInfo> arrayList2 = new ArrayList(m.H(list2, 10));
                        for (p163q7.g gVar : list2) {
                            DownloadBlockInfo downloadBlockInfo = new DownloadBlockInfo();
                            downloadBlockInfo.b(gVar.b());
                            downloadBlockInfo.a(gVar.c());
                            downloadBlockInfo.c(gVar.f14430e);
                            downloadBlockInfo.e(gVar.d());
                            downloadBlockInfo.d(gVar.a());
                            arrayList2.add(downloadBlockInfo);
                        }
                        if (!p() && !g()) {
                            e().f10358M = -1L;
                            e().f10359N = -1L;
                            p122m7.b bVarD3 = d();
                            if (bVarD3 != null) {
                                bVarD3.d(e(), arrayList2, this.f12726J);
                            }
                            for (DownloadBlockInfo downloadBlockInfo2 : arrayList2) {
                                p122m7.b bVarD4 = d();
                                if (bVarD4 != null) {
                                    bVarD4.a(e(), downloadBlockInfo2, this.f12726J);
                                }
                            }
                        }
                        if (!arrayList.isEmpty()) {
                            this.f12719C = Executors.newFixedThreadPool(arrayList.size());
                        }
                        b(eVarT, arrayList);
                        n();
                        e().e(this.f12737w);
                        e().h(this.f12738x);
                    }
                }
                e().e(this.f12737w);
                e().h(this.f12738x);
                Exception exc = this.f12723G;
                if (exc != null) {
                    throw exc;
                }
                if (!k() && !g() && !p()) {
                    p122m7.b bVarD5 = d();
                    if (bVarD5 != null) {
                        bVarD5.e(e());
                    }
                    e().f10358M = this.f12718B;
                    e().f10359N = c();
                    p122m7.b bVarD6 = d();
                    if (bVarD6 != null) {
                        bVarD6.c(e(), e().f10358M, e().f10359N);
                    }
                } else if (!p() && !g() && k()) {
                    if (this.f12739y) {
                        this.f12738x = this.f12737w;
                        e().e(this.f12737w);
                        e().h(this.f12738x);
                    } else {
                        Iterator it = this.f12724H.iterator();
                        long j = 0;
                        while (it.hasNext()) {
                            j += ((p163q7.g) it.next()).f14430e;
                        }
                        if (j != this.f12738x) {
                            this.f12723G = new FetchException("download_incomplete");
                            Exception exc2 = this.f12723G;
                            if (exc2 != null) {
                                throw exc2;
                            }
                        }
                    }
                    if (!g() && !p() && (bVarD2 = d()) != null) {
                        bVarD2.e(e());
                    }
                    p068ga.d.j(e().getF10360s(), this.P);
                    if (!p() && !g()) {
                        e().f10358M = this.f12718B;
                        e().f10359N = c();
                        DownloadInfo downloadInfoE = e();
                        downloadInfoE.getClass();
                        DownloadInfo downloadInfo = new DownloadInfo();
                        C.z(downloadInfoE, downloadInfo);
                        p122m7.b bVarD7 = d();
                        if (bVarD7 != null) {
                            bVarD7.c(e(), e().f10358M, e().f10359N);
                        }
                        e().f10358M = -1L;
                        e().f10359N = -1L;
                        p122m7.b bVarD8 = d();
                        if (bVarD8 != null && !bVarD8.a) {
                            downloadInfo.f10347B = h7.f.COMPLETED;
                            bVarD8.f13141b.b(downloadInfo);
                            bVarD8.f13142c.b(downloadInfo);
                        }
                    }
                }
                try {
                    ExecutorService executorService3 = this.f12719C;
                    if (executorService3 != null) {
                        executorService3.shutdown();
                    }
                } catch (Exception e11) {
                    this.f12730N.b("FileDownloader", e11);
                }
                try {
                    a aVar3 = this.f12725I;
                    if (aVar3 != null) {
                        aVar3.close();
                    }
                } catch (Exception e12) {
                    this.f12730N.b("FileDownloader", e12);
                }
                if (cVarP != null) {
                    try {
                        this.f12729M.k(cVarP);
                    } catch (Exception e13) {
                        e = e13;
                        this.f12730N.b("FileDownloader", e);
                    }
                }
                j();
            } catch (Exception e14) {
                try {
                    if (!p() && !g()) {
                        this.f12730N.b("FileDownloader download:" + l(), e14);
                        h7.b bVarT = C4.a.t(e14);
                        boolean z10 = !this.f12731O.b();
                        int i10 = 1;
                        while (true) {
                            if (i10 <= 10) {
                                try {
                                    Thread.sleep(500L);
                                    if (!this.f12731O.b()) {
                                        break;
                                    } else {
                                        i10++;
                                    }
                                } catch (InterruptedException e15) {
                                    this.f12730N.b("FileDownloader", e15);
                                    z6 = z10;
                                    if (z6) {
                                        bVarT = h7.b.NO_NETWORK_CONNECTION;
                                    }
                                    e().e(this.f12737w);
                                    e().h(this.f12738x);
                                    DownloadInfo downloadInfoE2 = e();
                                    downloadInfoE2.getClass();
                                    downloadInfoE2.f10348C = bVarT;
                                    if (!g()) {
                                        e().f10358M = -1L;
                                        e().f10359N = -1L;
                                        bVarD = d();
                                        if (bVarD != null) {
                                            bVarD.b(e(), bVarT, e14);
                                        }
                                    }
                                    executorService2 = this.f12719C;
                                    if (executorService2 != null) {
                                        executorService2.shutdown();
                                    }
                                    aVar2 = this.f12725I;
                                    if (aVar2 != null) {
                                        aVar2.close();
                                    }
                                    if (0 != 0) {
                                        try {
                                            this.f12729M.k(null);
                                        } catch (Exception e16) {
                                            e = e16;
                                            this.f12730N.b("FileDownloader", e);
                                        }
                                    }
                                    j();
                                }
                            }
                            z6 = z10;
                            break;
                        }
                        if (z6) {
                            bVarT = h7.b.NO_NETWORK_CONNECTION;
                        }
                        e().e(this.f12737w);
                        e().h(this.f12738x);
                        DownloadInfo downloadInfoE3 = e();
                        downloadInfoE3.getClass();
                        downloadInfoE3.f10348C = bVarT;
                        if (!g() && !p()) {
                            e().f10358M = -1L;
                            e().f10359N = -1L;
                            bVarD = d();
                            if (bVarD != null) {
                                bVarD.b(e(), bVarT, e14);
                            }
                        }
                    }
                    try {
                        executorService2 = this.f12719C;
                        if (executorService2 != null) {
                            executorService2.shutdown();
                        }
                    } catch (Exception e17) {
                        this.f12730N.b("FileDownloader", e17);
                    }
                    try {
                        aVar2 = this.f12725I;
                        if (aVar2 != null) {
                            aVar2.close();
                        }
                    } catch (Exception e18) {
                        this.f12730N.b("FileDownloader", e18);
                    }
                    if (0 != 0) {
                        this.f12729M.k(null);
                    }
                } catch (Throwable th2) {
                    th = th2;
                    cVar = null;
                    try {
                        executorService = this.f12719C;
                        if (executorService != null) {
                            executorService.shutdown();
                        }
                    } catch (Exception e19) {
                        this.f12730N.b("FileDownloader", e19);
                    }
                    try {
                        aVar = this.f12725I;
                        if (aVar != null) {
                            aVar.close();
                        }
                    } catch (Exception e20) {
                        this.f12730N.b("FileDownloader", e20);
                    }
                    if (cVar != null) {
                        try {
                            this.f12729M.k(cVar);
                        } catch (Exception e21) {
                            this.f12730N.b("FileDownloader", e21);
                        }
                    }
                    j();
                    throw th;
                }
            }
        } catch (Throwable th3) {
            th = th3;
            executorService = this.f12719C;
            if (executorService != null) {
                executorService.shutdown();
            }
            aVar = this.f12725I;
            if (aVar != null) {
                aVar.close();
            }
            if (cVar != null) {
                this.f12729M.k(cVar);
            }
            j();
            throw th;
        }
    }
}
