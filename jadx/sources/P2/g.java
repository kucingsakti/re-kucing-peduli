package P2;

import A0.j;
import A1.r;
import E4.C0187a;
import M2.e0;
import N9.AbstractC0342z;
import N9.C0324g;
import S9.h;
import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.IBinder;
import android.os.IInterface;
import android.util.Log;
import androidx.work.Worker;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.api.internal.zact;
import com.google.android.gms.common.api.internal.zap;
import com.google.android.gms.common.internal.IAccountAccessor;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.zav;
import com.google.android.gms.common.internal.zzw;
import com.google.android.gms.signin.internal.zak;
import com.tonyodev.fetch2.Download;
import com.tonyodev.fetch2.database.DownloadInfo;
import com.tonyodev.fetch2.exception.FetchException;
import com.tonyodev.fetch2core.DownloadBlockInfo;
import com.unity3d.services.ads.gmascar.bridges.mobileads.MobileAdsBridge;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import o1.o;
import org.chromium.net.UrlRequest;
import org.json.JSONObject;
import p050f1.q;
import p061g1.p;
import p078i.ExecutorC0659p;
import p157q1.k;
import p210v8.i;
import p224x2.s;
import ya.C0896q;

/* JADX INFO: loaded from: classes.dex */
public final class g implements Runnable {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f3859s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public Object f3860t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final Object f3861u;

    public /* synthetic */ g(Object obj, int i10, Object obj2) {
        this.f3859s = i10;
        this.f3860t = obj;
        this.f3861u = obj2;
    }

    /* JADX WARN: Code duplicated, block: B:173:0x030a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:177:0x032d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:179:0x02f5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:190:0x0318 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    private final void a() throws Throwable {
        RandomAccessFile randomAccessFile;
        p163q7.f fVar;
        p163q7.c cVar;
        int i10;
        boolean z6;
        int i11;
        try {
            Thread threadCurrentThread = Thread.currentThread();
            i.b(threadCurrentThread, "Thread.currentThread()");
            threadCurrentThread.setName(((p102k7.c) this.f3860t).e().f10361t + '-' + ((p102k7.c) this.f3860t).e().f10360s + "-Slice-" + ((p163q7.g) this.f3861u).f14427b);
        } catch (Exception unused) {
        }
        DownloadBlockInfo downloadBlockInfo = new DownloadBlockInfo();
        p163q7.g gVar = (p163q7.g) this.f3861u;
        downloadBlockInfo.f10368s = gVar.a;
        downloadBlockInfo.f10369t = gVar.f14427b;
        downloadBlockInfo.f10372w = gVar.f14430e;
        downloadBlockInfo.f10370u = gVar.f14428c;
        downloadBlockInfo.f10371v = gVar.f14429d;
        DownloadInfo downloadInfoE = ((p102k7.c) this.f3860t).e();
        p163q7.g gVar2 = (p163q7.g) this.f3861u;
        Fa.e eVarU = p068ga.d.u(downloadInfoE, gVar2.f14428c + gVar2.f14430e, null, gVar2.f14427b + 1, 12);
        p163q7.c cVarP = null;
        try {
            try {
                p163q7.g gVar3 = (p163q7.g) this.f3861u;
                randomAccessFile = new RandomAccessFile(C3.b.t(p068ga.d.n(gVar3.a, ((p102k7.c) this.f3860t).P, gVar3.f14427b)), "rw");
                try {
                    p102k7.c cVar2 = (p102k7.c) this.f3860t;
                    cVarP = cVar2.f12729M.P(eVarU, cVar2.f12727K);
                    try {
                        try {
                            if (((p102k7.c) this.f3860t).f12734t || ((p102k7.c) this.f3860t).f12733s || cVarP == null || !cVarP.f14422b) {
                                cVar = cVarP;
                                if (cVar == null && !((p102k7.c) this.f3860t).f12733s && !((p102k7.c) this.f3860t).f12734t) {
                                    throw new FetchException("empty_response_body");
                                }
                                if (cVar != null && !cVar.f14422b && !((p102k7.c) this.f3860t).f12733s && !((p102k7.c) this.f3860t).f12734t) {
                                    throw new FetchException("request_not_successful");
                                }
                                if (!((p102k7.c) this.f3860t).f12733s && !((p102k7.c) this.f3860t).f12734t) {
                                    throw new FetchException("unknown");
                                }
                            } else {
                                ((p102k7.c) this.f3860t).f12729M.y(eVarU);
                                try {
                                    byte[] bArr = new byte[8192];
                                    InputStream inputStream = cVarP.f14424d;
                                    int i12 = -1;
                                    int i13 = inputStream != null ? inputStream.read(bArr, 0, 8192) : -1;
                                    p163q7.g gVar4 = (p163q7.g) this.f3861u;
                                    long j = gVar4.f14429d;
                                    if (j < 1) {
                                        j = 0;
                                    }
                                    cVar = cVarP;
                                    long j10 = 0;
                                    long j11 = j - (gVar4.f14428c + gVar4.f14430e);
                                    long jNanoTime = System.nanoTime();
                                    while (true) {
                                        if ((!((p102k7.c) this.f3860t).f12739y && j11 <= j10) || i13 == i12 || ((p102k7.c) this.f3860t).f12733s || ((p102k7.c) this.f3860t).f12734t) {
                                            break;
                                        }
                                        if (((p102k7.c) this.f3860t).f12739y || i13 <= j11) {
                                            i10 = i13;
                                        } else {
                                            i13 = (int) j11;
                                            i10 = i12;
                                        }
                                        p163q7.g gVar5 = (p163q7.g) this.f3861u;
                                        long j12 = gVar5.f14428c + gVar5.f14430e;
                                        synchronized (((p102k7.c) this.f3860t).f12722F) {
                                            try {
                                                if (((p102k7.c) this.f3860t).f12733s || ((p102k7.c) this.f3860t).f12734t) {
                                                    j11 = j11;
                                                } else {
                                                    D6.a aVar = ((p102k7.c) this.f3860t).f12725I;
                                                    if (aVar != null) {
                                                        aVar.a(j12);
                                                    }
                                                    D6.a aVar2 = ((p102k7.c) this.f3860t).f12725I;
                                                    if (aVar2 != null) {
                                                        aVar2.c(i13, bArr);
                                                    }
                                                    if (!((p102k7.c) this.f3860t).f12733s && !((p102k7.c) this.f3860t).f12734t) {
                                                        long j13 = i13;
                                                        ((p163q7.g) this.f3861u).f14430e += j13;
                                                        long j14 = j10;
                                                        randomAccessFile.seek(j14);
                                                        randomAccessFile.setLength(j14);
                                                        randomAccessFile.writeLong(((p163q7.g) this.f3861u).f14430e);
                                                        ((p102k7.c) this.f3860t).f12737w += j13;
                                                    }
                                                    long jNanoTime2 = System.nanoTime();
                                                    ((p102k7.c) this.f3860t).getClass();
                                                    if (C3.b.C(jNanoTime, jNanoTime2, 400L)) {
                                                        if (!((p102k7.c) this.f3860t).f12733s && !((p102k7.c) this.f3860t).f12734t) {
                                                            downloadBlockInfo.f10372w = ((p163q7.g) this.f3861u).f14430e;
                                                            p102k7.c cVar3 = (p102k7.c) this.f3860t;
                                                            p122m7.b bVar = cVar3.f12735u;
                                                            if (bVar != null) {
                                                                bVar.a(cVar3.e(), downloadBlockInfo, ((p102k7.c) this.f3860t).f12726J);
                                                            }
                                                        }
                                                        jNanoTime = System.nanoTime();
                                                    }
                                                }
                                            } catch (Throwable th) {
                                                throw th;
                                            }
                                        }
                                        if (((p102k7.c) this.f3860t).f12733s || ((p102k7.c) this.f3860t).f12734t || i10 == -1) {
                                            z6 = false;
                                        } else {
                                            InputStream inputStream2 = cVar.f14424d;
                                            if (inputStream2 != null) {
                                                z6 = false;
                                                i11 = inputStream2.read(bArr, 0, 8192);
                                            } else {
                                                z6 = false;
                                                i11 = -1;
                                            }
                                            if (((p102k7.c) this.f3860t).f12739y) {
                                                i10 = i11;
                                            } else {
                                                p163q7.g gVar6 = (p163q7.g) this.f3861u;
                                                j11 = j - (gVar6.f14428c + gVar6.f14430e);
                                                i13 = i11;
                                            }
                                            i12 = -1;
                                            j10 = 0;
                                        }
                                        i13 = i10;
                                        j11 = j11;
                                        i12 = -1;
                                        j10 = 0;
                                    }
                                } catch (Exception e10) {
                                    e = e10;
                                    ((p102k7.c) this.f3860t).f12730N.b("FileDownloader downloads slice " + ((p163q7.g) this.f3861u), e);
                                    ((p102k7.c) this.f3860t).f12723G = e;
                                    if (cVarP != null) {
                                        try {
                                            ((p102k7.c) this.f3860t).f12729M.k(cVarP);
                                        } catch (Exception unused2) {
                                            ((p102k7.c) this.f3860t).f12730N.getClass();
                                        }
                                    }
                                    if (randomAccessFile != null) {
                                        try {
                                            randomAccessFile.close();
                                        } catch (Exception unused3) {
                                            fVar = ((p102k7.c) this.f3860t).f12730N;
                                            fVar.getClass();
                                        }
                                    }
                                } catch (Throwable th2) {
                                    th = th2;
                                    if (cVarP != null) {
                                        try {
                                            ((p102k7.c) this.f3860t).f12729M.k(cVarP);
                                        } catch (Exception unused4) {
                                            ((p102k7.c) this.f3860t).f12730N.getClass();
                                        }
                                    }
                                    if (randomAccessFile != null) {
                                        try {
                                            randomAccessFile.close();
                                        } catch (Exception unused5) {
                                            ((p102k7.c) this.f3860t).f12730N.getClass();
                                        }
                                    }
                                    p102k7.c.a((p102k7.c) this.f3860t);
                                    throw th;
                                }
                            }
                            if (cVar != null) {
                                try {
                                    ((p102k7.c) this.f3860t).f12729M.k(cVar);
                                } catch (Exception unused6) {
                                    ((p102k7.c) this.f3860t).f12730N.getClass();
                                }
                            }
                            try {
                                randomAccessFile.close();
                            } catch (Exception unused7) {
                                fVar = ((p102k7.c) this.f3860t).f12730N;
                                fVar.getClass();
                            }
                        } catch (Exception e11) {
                            e = e11;
                            cVarP = cVarP;
                            ((p102k7.c) this.f3860t).f12730N.b("FileDownloader downloads slice " + ((p163q7.g) this.f3861u), e);
                            ((p102k7.c) this.f3860t).f12723G = e;
                            if (cVarP != null) {
                                ((p102k7.c) this.f3860t).f12729M.k(cVarP);
                            }
                            if (randomAccessFile != null) {
                                randomAccessFile.close();
                            }
                            p102k7.c.a((p102k7.c) this.f3860t);
                        } catch (Throwable th3) {
                            th = th3;
                            cVarP = cVarP;
                            if (cVarP != null) {
                                ((p102k7.c) this.f3860t).f12729M.k(cVarP);
                            }
                            if (randomAccessFile != null) {
                                randomAccessFile.close();
                            }
                            p102k7.c.a((p102k7.c) this.f3860t);
                            throw th;
                        }
                    } catch (Exception e12) {
                        e = e12;
                    } catch (Throwable th4) {
                        th = th4;
                    }
                } catch (Exception e13) {
                    e = e13;
                }
            } catch (Throwable th5) {
                th = th5;
            }
        } catch (Exception e14) {
            e = e14;
            randomAccessFile = null;
        } catch (Throwable th6) {
            th = th6;
            randomAccessFile = null;
        }
        p102k7.c.a((p102k7.c) this.f3860t);
    }

    private final void b() {
        synchronized (((V3.b) this.f3860t).a) {
            ((N4.e) this.f3861u).a();
        }
    }

    private final void c() {
        synchronized (((V3.b) ((J4.c) this.f3860t).f2406b).a) {
            Iterator it = ((ArrayList) ((V3.b) ((J4.c) this.f3860t).f2406b).f5174d).iterator();
            if (it.hasNext()) {
                ((N4.e) it.next()).f((DownloadInfo) this.f3861u);
            }
        }
    }

    private final void d() {
        o oVarB = ((p127n1.a) this.f3861u).f13302s.f11502f.b((String) this.f3860t);
        if (oVarB == null || !oVarB.b()) {
            return;
        }
        synchronized (((p127n1.a) this.f3861u).f13304u) {
            ((p127n1.a) this.f3861u).f13307x.put(C3.a.g(oVarB), oVarB);
            ((p127n1.a) this.f3861u).f13308y.add(oVarB);
            p127n1.a aVar = (p127n1.a) this.f3861u;
            aVar.f13309z.K(aVar.f13308y);
        }
    }

    private final void e() {
        synchronized (((p133n7.a) this.f3860t).a) {
            try {
                Iterator it = ((p133n7.a) this.f3860t).a.iterator();
                if (it.hasNext()) {
                    if (it.next() != null) {
                        throw new ClassCastException();
                    }
                    throw null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private final void f() {
        try {
            ((Runnable) this.f3861u).run();
            synchronized (((ExecutorC0659p) this.f3860t).f12104v) {
                ((ExecutorC0659p) this.f3860t).c();
            }
        } catch (Throwable th) {
            synchronized (((ExecutorC0659p) this.f3860t).f12104v) {
                ((ExecutorC0659p) this.f3860t).c();
                throw th;
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        h hVar;
        Intent intent;
        p102k7.a aVar;
        J4.a aVar2;
        boolean z6;
        Set set;
        IAccountAccessor zzwVar = null;
        boolean z10 = true;
        int i10 = 0;
        switch (this.f3859s) {
            case 0:
                f fVar = (f) this.f3860t;
                try {
                    fVar.p(((Callable) this.f3861u).call());
                    return;
                } catch (Exception e10) {
                    fVar.o(e10);
                    return;
                } catch (Throwable th) {
                    fVar.o(new RuntimeException(th));
                    return;
                }
            case 1:
                K.b bVar = (K.b) ((r) this.f3860t).f167t;
                if (bVar != null) {
                    bVar.j((Typeface) this.f3861u);
                    return;
                }
                return;
            case 2:
                ((R.e) this.f3860t).accept(this.f3861u);
                return;
            case 3:
                break;
            case 4:
                ((W7.b) this.f3861u).f5359b.U((R7.a) this.f3860t);
                return;
            case 5:
                C0324g c0324g = (C0324g) this.f3860t;
                try {
                    c0324g.resumeWith(((C3.d) this.f3861u).get());
                    return;
                } catch (Throwable th2) {
                    Throwable cause = th2.getCause();
                    if (cause == null) {
                        cause = th2;
                    }
                    if (th2 instanceof CancellationException) {
                        c0324g.r(cause);
                        return;
                    } else {
                        c0324g.resumeWith(J7.a.d(cause));
                        return;
                    }
                }
            case 6:
                try {
                    ((Worker) this.f3861u).getClass();
                    throw new IllegalStateException("Expedited WorkRequests require a Worker to provide an implementation for \n `getForegroundInfo()`");
                } catch (Throwable th3) {
                    ((k) this.f3860t).k(th3);
                    return;
                }
            case 7:
                if (((p) this.f3861u).f11515I.f14401s instanceof p157q1.a) {
                    return;
                }
                try {
                    ((k) this.f3860t).get();
                    q qVarA = q.a();
                    String str = p.f11506K;
                    String str2 = ((p) this.f3861u).f11521w.f13647c;
                    qVarA.getClass();
                    p pVar = (p) this.f3861u;
                    pVar.f11515I.l(pVar.f11522x.startWork());
                    return;
                } catch (Throwable th4) {
                    ((p) this.f3861u).f11515I.k(th4);
                    return;
                }
            case 8:
                p pVar2 = (p) this.f3861u;
                try {
                    p050f1.o oVar = (p050f1.o) pVar2.f11515I.get();
                    if (oVar == null) {
                        q qVarA2 = q.a();
                        String str3 = p.f11506K;
                        String str4 = pVar2.f11521w.f13647c;
                        qVarA2.getClass();
                    } else {
                        q qVarA3 = q.a();
                        String str5 = p.f11506K;
                        String str6 = pVar2.f11521w.f13647c;
                        oVar.toString();
                        qVarA3.getClass();
                        pVar2.f11524z = oVar;
                    }
                    break;
                } catch (InterruptedException | ExecutionException unused) {
                    q qVarA4 = q.a();
                    String str7 = p.f11506K;
                    qVarA4.getClass();
                } catch (CancellationException e11) {
                    q qVarA5 = q.a();
                    String str8 = p.f11506K;
                    String str9 = ((String) this.f3860t) + " was cancelled";
                    if (qVarA5.a <= 4) {
                        Log.i(str8, str9, e11);
                    }
                } finally {
                    pVar2.b();
                }
                return;
            case 9:
                q qVarA6 = q.a();
                int i11 = p071h1.a.f11642d;
                o oVar2 = (o) this.f3860t;
                qVarA6.getClass();
                ((p071h1.a) this.f3861u).a.b(oVar2);
                return;
            case 10:
                try {
                    Thread threadCurrentThread = Thread.currentThread();
                    i.b(threadCurrentThread, "Thread.currentThread()");
                    threadCurrentThread.setName(((DownloadInfo) ((Download) this.f3861u)).f10361t + '-' + ((DownloadInfo) ((Download) this.f3861u)).f10360s);
                    break;
                } catch (Exception unused2) {
                }
                try {
                    try {
                        p102k7.b bVarL = ((p102k7.a) this.f3860t).l((Download) this.f3861u);
                        synchronized (((p102k7.a) this.f3860t).f12709s) {
                            if (((p102k7.a) this.f3860t).f12712v.containsKey(Integer.valueOf(((DownloadInfo) ((Download) this.f3861u)).f10360s))) {
                                p102k7.a aVar3 = (p102k7.a) this.f3860t;
                                bVarL.i(new p122m7.b(aVar3.f12702B, (J4.c) aVar3.f12704D.f5177g));
                                ((p102k7.a) this.f3860t).f12712v.put(Integer.valueOf(((DownloadInfo) ((Download) this.f3861u)).f10360s), bVarL);
                                ((p102k7.a) this.f3860t).f12703C.f(((DownloadInfo) ((Download) this.f3861u)).f10360s, bVarL);
                                ((p102k7.a) this.f3860t).f12716z.a("DownloadManager starting download " + ((Download) this.f3861u));
                            } else {
                                z10 = false;
                            }
                            break;
                        }
                        if (z10) {
                            bVarL.run();
                        }
                        p102k7.a.a((p102k7.a) this.f3860t, (Download) this.f3861u);
                        ((p102k7.a) this.f3860t).f12708H.o();
                        p102k7.a.a((p102k7.a) this.f3860t, (Download) this.f3861u);
                        intent = new Intent("com.tonyodev.fetch2.action.QUEUE_BACKOFF_RESET");
                        intent.setPackage(((p102k7.a) this.f3860t).f12707G.getPackageName());
                        ((p102k7.a) this.f3860t).getClass();
                        intent.putExtra("com.tonyodev.fetch2.extra.NAMESPACE", "LibGlobalFetchLib");
                        aVar = (p102k7.a) this.f3860t;
                    } catch (Exception e12) {
                        ((p102k7.a) this.f3860t).f12716z.b("DownloadManager failed to start download " + ((Download) this.f3861u), e12);
                        p102k7.a.a((p102k7.a) this.f3860t, (Download) this.f3861u);
                        intent = new Intent("com.tonyodev.fetch2.action.QUEUE_BACKOFF_RESET");
                        intent.setPackage(((p102k7.a) this.f3860t).f12707G.getPackageName());
                        ((p102k7.a) this.f3860t).getClass();
                        intent.putExtra("com.tonyodev.fetch2.extra.NAMESPACE", "LibGlobalFetchLib");
                        aVar = (p102k7.a) this.f3860t;
                    }
                    aVar.f12707G.sendBroadcast(intent);
                    return;
                } catch (Throwable th5) {
                    p102k7.a.a((p102k7.a) this.f3860t, (Download) this.f3861u);
                    Intent intent2 = new Intent("com.tonyodev.fetch2.action.QUEUE_BACKOFF_RESET");
                    intent2.setPackage(((p102k7.a) this.f3860t).f12707G.getPackageName());
                    ((p102k7.a) this.f3860t).getClass();
                    intent2.putExtra("com.tonyodev.fetch2.extra.NAMESPACE", "LibGlobalFetchLib");
                    ((p102k7.a) this.f3860t).f12707G.sendBroadcast(intent2);
                    throw th5;
                }
            case 11:
                a();
                return;
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                p204v1.g gVar = (p204v1.g) ((j) this.f3860t).f26v;
                if (gVar != null) {
                    List list = (List) this.f3861u;
                    gVar.getClass();
                    List list2 = list;
                    i.g(list2, "downloads");
                    list2.isEmpty();
                    return;
                }
                return;
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                p230x9.d dVar = (p230x9.d) ((j) this.f3860t).f26v;
                if (dVar != null) {
                    List list3 = (List) this.f3861u;
                    dVar.getClass();
                    List list4 = list3;
                    i.g(list4, "downloads");
                    list4.isEmpty();
                    return;
                }
                return;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                C0187a c0187a = (C0187a) ((j) this.f3860t).f26v;
                List list5 = (List) this.f3861u;
                c0187a.getClass();
                List<Download> list6 = list5;
                J4.d dVar2 = (J4.d) c0187a.f1398t;
                i.f(dVar2, "this$0");
                i.f(list6, "it");
                for (Download download : list6) {
                    ArrayList arrayList = dVar2.f2408K0;
                    int size = arrayList.size();
                    int i12 = 0;
                    while (true) {
                        if (i12 < size) {
                            Object obj = arrayList.get(i12);
                            i.e(obj, "get(...)");
                            aVar2 = (J4.a) obj;
                            if (aVar2.a == ((DownloadInfo) download).f10360s) {
                                z6 = true;
                            } else {
                                i12++;
                            }
                        } else {
                            i12 = -1;
                            aVar2 = null;
                            z6 = false;
                        }
                    }
                    if (z6) {
                        if (aVar2 != null) {
                            aVar2.f2405b = download;
                        }
                        Ca.c cVar = dVar2.f2409L0;
                        if (cVar != null) {
                            cVar.a.c(i12, 1, null);
                        }
                    } else {
                        J4.a aVar4 = new J4.a();
                        aVar4.a = ((DownloadInfo) download).f10360s;
                        aVar4.f2405b = download;
                        arrayList.add(aVar4);
                        Ca.c cVar2 = dVar2.f2409L0;
                        if (cVar2 != null) {
                            cVar2.f1031i.add(download);
                            cVar2.q();
                        }
                        za.c cVar3 = Ha.a.a;
                        Object[] objArr = {Integer.valueOf(arrayList.size() - 1)};
                        cVar3.getClass();
                        za.c.h(objArr);
                    }
                }
                return;
            case 15:
                za.c cVar4 = (za.c) ((j) this.f3860t).f26v;
                if (cVar4 != null) {
                    Object obj2 = this.f3861u;
                    cVar4.getClass();
                    List list7 = (List) obj2;
                    i.g(list7, "downloads");
                    list7.isEmpty();
                    return;
                }
                return;
            case 16:
                K3.d dVar3 = (K3.d) ((j) this.f3860t).f26v;
                if (dVar3 != null) {
                    Object obj3 = this.f3861u;
                    dVar3.getClass();
                    List list8 = (List) obj3;
                    i.g(list8, "downloads");
                    list8.isEmpty();
                    return;
                }
                return;
            case 17:
                p053f4.e eVar = (p053f4.e) ((j) this.f3860t).f26v;
                if (eVar != null) {
                    ArrayList arrayList2 = (ArrayList) this.f3861u;
                    eVar.getClass();
                    ArrayList arrayList3 = arrayList2;
                    i.g(arrayList3, "downloads");
                    arrayList3.isEmpty();
                    return;
                }
                return;
            case 18:
                b();
                return;
            case 19:
                c();
                return;
            case 20:
                d();
                return;
            case MobileAdsBridge.CODE_21 /* 21 */:
                e();
                return;
            case 22:
                f();
                return;
            case 23:
                if (((p147p1.o) this.f3861u).f14186s.f14401s instanceof p157q1.a) {
                    return;
                }
                try {
                    p050f1.i iVar = (p050f1.i) ((k) this.f3860t).get();
                    if (iVar == null) {
                        throw new IllegalStateException("Worker was marked important (" + ((p147p1.o) this.f3861u).f14188u.f13647c + ") but did not provide ForegroundInfo");
                    }
                    q qVarA7 = q.a();
                    int i13 = p147p1.o.f14185y;
                    String str10 = ((p147p1.o) this.f3861u).f14188u.f13647c;
                    qVarA7.getClass();
                    p147p1.o oVar3 = (p147p1.o) this.f3861u;
                    k kVar = oVar3.f14186s;
                    p147p1.p pVar3 = oVar3.f14190w;
                    Context context = oVar3.f14187t;
                    UUID id = oVar3.f14189v.getId();
                    pVar3.getClass();
                    k kVar2 = new k();
                    pVar3.a.t(new e0(pVar3, kVar2, id, iVar, context, 2));
                    kVar.l(kVar2);
                    return;
                } catch (Throwable th6) {
                    ((p147p1.o) this.f3861u).f14186s.k(th6);
                    return;
                }
            case 24:
                o1.c cVar5 = (o1.c) this.f3861u;
                HashMap map = (HashMap) cVar5.f13623t;
                int size2 = map.size();
                p209v7.a aVar5 = (p209v7.a) this.f3860t;
                if (size2 > 0) {
                    aVar5.onSignalsCollected(new JSONObject(map).toString());
                    return;
                }
                String str11 = (String) cVar5.f13624u;
                if (str11 == null) {
                    aVar5.onSignalsCollected("");
                    return;
                } else {
                    aVar5.onSignalsCollectionFailed(str11);
                    return;
                }
            case 25:
                N2.a aVar6 = zact.f8006i;
                zak zakVar = (zak) this.f3860t;
                ConnectionResult connectionResult = zakVar.f9378t;
                boolean zT = connectionResult.T();
                zact zactVar = (zact) this.f3861u;
                if (zT) {
                    zav zavVar = zakVar.f9379u;
                    Preconditions.i(zavVar);
                    ConnectionResult connectionResult2 = zavVar.f8157u;
                    if (!connectionResult2.T()) {
                        Log.wtf("SignInCoordinator", "Sign-in succeeded with resolve account failure: ".concat(String.valueOf(connectionResult2)), new Exception());
                        zactVar.f8013h.b(connectionResult2);
                        zactVar.f8012g.q();
                        return;
                    }
                    p224x2.o oVar4 = zactVar.f8013h;
                    IBinder iBinder = zavVar.f8156t;
                    if (iBinder != null) {
                        int i14 = IAccountAccessor.Stub.f8112b;
                        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                        zzwVar = iInterfaceQueryLocalInterface instanceof IAccountAccessor ? (IAccountAccessor) iInterfaceQueryLocalInterface : new zzw(iBinder, "com.google.android.gms.common.internal.IAccountAccessor");
                    }
                    oVar4.getClass();
                    if (zzwVar == null || (set = zactVar.f8010e) == null) {
                        Log.wtf("GoogleApiManager", "Received null response from onSignInSuccess", new Exception());
                        oVar4.b(new ConnectionResult(4));
                    } else {
                        oVar4.f15768c = zzwVar;
                        oVar4.f15769d = set;
                        if (oVar4.f15770e) {
                            oVar4.a.d(zzwVar, set);
                        }
                    }
                } else {
                    zactVar.f8013h.b(connectionResult);
                }
                zactVar.f8012g.q();
                return;
            case 26:
                if (((zap) this.f3861u).f8020s) {
                    ConnectionResult connectionResult3 = ((s) this.f3860t).f15773b;
                    if (!connectionResult3.K()) {
                        ((zap) this.f3861u).b();
                        throw null;
                    }
                    zap zapVar = (zap) this.f3861u;
                    zapVar.getClass();
                    Activity activityB = zapVar.b();
                    PendingIntent pendingIntent = connectionResult3.f7823u;
                    Preconditions.i(pendingIntent);
                    int i15 = ((s) this.f3860t).a;
                    int i16 = GoogleApiActivity.f7860t;
                    Intent intent3 = new Intent(activityB, (Class<?>) GoogleApiActivity.class);
                    intent3.putExtra("pending_intent", pendingIntent);
                    intent3.putExtra("failing_client_id", i15);
                    intent3.putExtra("notify_manager", false);
                    throw null;
                }
                return;
            default:
                qa.b.q((C0896q) this.f3860t).resumeWith(J7.a.d((Exception) this.f3861u));
                return;
        }
        do {
            try {
                ((Runnable) this.f3860t).run();
            } catch (Throwable th7) {
                AbstractC0342z.l(p123m8.j.f13164s, th7);
            }
            hVar = (h) this.f3861u;
            Runnable runnableT = hVar.t();
            if (runnableT == null) {
                return;
            }
            this.f3860t = runnableT;
            i10++;
        } while (i10 < 16);
        U9.k kVar3 = hVar.f4561t;
        kVar3.getClass();
        kVar3.g(hVar, this);
    }

    public /* synthetic */ g(Object obj, Object obj2, int i10, boolean z6) {
        this.f3859s = i10;
        this.f3861u = obj;
        this.f3860t = obj2;
    }

    public g(p133n7.a aVar, List list, int i10, Download download) {
        this.f3859s = 21;
        this.f3860t = aVar;
        this.f3861u = list;
    }
}
