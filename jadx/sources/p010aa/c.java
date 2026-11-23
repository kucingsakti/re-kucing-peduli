package p010aa;

import A1.RunnableC0094c;
import P0.d;
import Y9.b;
import com.unity3d.ads.metadata.MediationMetaData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.logging.Logger;
import p210v8.i;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final c f6023h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final Logger f6024i;
    public final d a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f6026c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f6027d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f6025b = 10000;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ArrayList f6028e = new ArrayList();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ArrayList f6029f = new ArrayList();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final RunnableC0094c f6030g = new RunnableC0094c(this, 17);

    static {
        String strK = i.k(" TaskRunner", Y9.c.f5826g);
        i.f(strK, MediationMetaData.KEY_NAME);
        f6023h = new c(new d(new b(strK, true)));
        Logger logger = Logger.getLogger(c.class.getName());
        i.e(logger, "getLogger(TaskRunner::class.java.name)");
        f6024i = logger;
    }

    public c(d dVar) {
        this.a = dVar;
    }

    public static final void a(c cVar, a aVar) {
        cVar.getClass();
        byte[] bArr = Y9.c.a;
        Thread threadCurrentThread = Thread.currentThread();
        String name = threadCurrentThread.getName();
        threadCurrentThread.setName(aVar.a);
        try {
            long jA = aVar.a();
            synchronized (cVar) {
                cVar.b(aVar, jA);
            }
        } finally {
            synchronized (cVar) {
                cVar.b(aVar, -1L);
                threadCurrentThread.setName(name);
            }
        }
    }

    public final void b(a aVar, long j) {
        byte[] bArr = Y9.c.a;
        b bVar = aVar.f6016c;
        i.c(bVar);
        if (bVar.f6020d != aVar) {
            throw new IllegalStateException("Check failed.");
        }
        boolean z6 = bVar.f6022f;
        bVar.f6022f = false;
        bVar.f6020d = null;
        this.f6028e.remove(bVar);
        if (j != -1 && !z6 && !bVar.f6019c) {
            bVar.e(aVar, j, true);
        }
        if (bVar.f6021e.isEmpty()) {
            return;
        }
        this.f6029f.add(bVar);
    }

    public final a c() {
        long j;
        a aVar;
        boolean z6;
        byte[] bArr = Y9.c.a;
        while (true) {
            ArrayList arrayList = this.f6029f;
            if (arrayList.isEmpty()) {
                return null;
            }
            d dVar = this.a;
            long jNanoTime = System.nanoTime();
            Iterator it = arrayList.iterator();
            long jMin = Long.MAX_VALUE;
            a aVar2 = null;
            while (true) {
                if (!it.hasNext()) {
                    j = jNanoTime;
                    aVar = null;
                    z6 = false;
                    break;
                }
                a aVar3 = (a) ((b) it.next()).f6021e.get(0);
                j = jNanoTime;
                aVar = null;
                long jMax = Math.max(0L, aVar3.f6017d - j);
                if (jMax > 0) {
                    jMin = Math.min(jMax, jMin);
                } else {
                    if (aVar2 != null) {
                        z6 = true;
                        break;
                    }
                    aVar2 = aVar3;
                }
                jNanoTime = j;
            }
            ArrayList arrayList2 = this.f6028e;
            if (aVar2 != null) {
                byte[] bArr2 = Y9.c.a;
                aVar2.f6017d = -1L;
                b bVar = aVar2.f6016c;
                i.c(bVar);
                bVar.f6021e.remove(aVar2);
                arrayList.remove(bVar);
                bVar.f6020d = aVar2;
                arrayList2.add(bVar);
                if (z6 || (!this.f6026c && !arrayList.isEmpty())) {
                    RunnableC0094c runnableC0094c = this.f6030g;
                    i.f(runnableC0094c, "runnable");
                    ((ThreadPoolExecutor) dVar.f3811t).execute(runnableC0094c);
                }
                return aVar2;
            }
            if (this.f6026c) {
                if (jMin >= this.f6027d - j) {
                    return aVar;
                }
                notify();
                return aVar;
            }
            this.f6026c = true;
            this.f6027d = j + jMin;
            try {
                try {
                    long j10 = jMin / 1000000;
                    Long.signum(j10);
                    long j11 = jMin - (1000000 * j10);
                    if (j10 > 0 || jMin > 0) {
                        wait(j10, (int) j11);
                    }
                } catch (InterruptedException unused) {
                    int size = arrayList2.size() - 1;
                    if (size >= 0) {
                        while (true) {
                            int i10 = size - 1;
                            ((b) arrayList2.get(size)).b();
                            if (i10 < 0) {
                                break;
                            }
                            size = i10;
                        }
                    }
                    int size2 = arrayList.size() - 1;
                    if (size2 >= 0) {
                        while (true) {
                            int i11 = size2 - 1;
                            b bVar2 = (b) arrayList.get(size2);
                            bVar2.b();
                            if (bVar2.f6021e.isEmpty()) {
                                arrayList.remove(size2);
                            }
                            if (i11 < 0) {
                                break;
                            }
                            size2 = i11;
                        }
                    }
                }
                this.f6026c = false;
            } catch (Throwable th) {
                this.f6026c = false;
                throw th;
            }
        }
    }

    public final void d(b bVar) {
        i.f(bVar, "taskQueue");
        byte[] bArr = Y9.c.a;
        if (bVar.f6020d == null) {
            boolean zIsEmpty = bVar.f6021e.isEmpty();
            ArrayList arrayList = this.f6029f;
            if (zIsEmpty) {
                arrayList.remove(bVar);
            } else {
                i.f(arrayList, "<this>");
                if (!arrayList.contains(bVar)) {
                    arrayList.add(bVar);
                }
            }
        }
        boolean z6 = this.f6026c;
        d dVar = this.a;
        if (z6) {
            notify();
            return;
        }
        RunnableC0094c runnableC0094c = this.f6030g;
        i.f(runnableC0094c, "runnable");
        ((ThreadPoolExecutor) dVar.f3811t).execute(runnableC0094c);
    }

    public final b e() {
        int i10;
        synchronized (this) {
            i10 = this.f6025b;
            this.f6025b = i10 + 1;
        }
        return new b(this, i.k(Integer.valueOf(i10), "Q"));
    }
}
