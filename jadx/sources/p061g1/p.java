package p061g1;

import D4.a;
import M2.O;
import P0.j;
import android.content.Context;
import android.database.Cursor;
import androidx.datastore.preferences.protobuf.AbstractC0487g;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkDatabase_Impl;
import androidx.work.impl.background.systemalarm.RescheduleReceiver;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.ExecutorService;
import o1.c;
import o1.o;
import p050f1.b;
import p050f1.g;
import p050f1.l;
import p050f1.m;
import p050f1.n;
import p050f1.q;
import p050f1.x;
import p053f4.e;
import p078i.ExecutorC0659p;
import p085i7.d;
import p157q1.k;

/* JADX INFO: loaded from: classes.dex */
public final class p implements Runnable {

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public static final String f11506K = q.c("WorkerWrapper");

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final b f11507A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final e f11508B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final WorkDatabase f11509C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final o1.p f11510D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final c f11511E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public final ArrayList f11512F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public String f11513G;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public volatile boolean f11516J;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Context f11517s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final String f11518t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final List f11519u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final Y1.c f11520v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final o f11521w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public p050f1.p f11522x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final Y1.c f11523y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public p050f1.o f11524z = new l();

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public final k f11514H = new k();

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public final k f11515I = new k();

    public p(V3.b bVar) {
        this.f11517s = (Context) bVar.a;
        this.f11523y = (Y1.c) bVar.f5173c;
        this.f11508B = (e) bVar.f5172b;
        o oVar = (o) bVar.f5176f;
        this.f11521w = oVar;
        this.f11518t = oVar.a;
        this.f11519u = (List) bVar.f5177g;
        this.f11520v = (Y1.c) bVar.f5179i;
        this.f11522x = null;
        this.f11507A = (b) bVar.f5174d;
        WorkDatabase workDatabase = (WorkDatabase) bVar.f5175e;
        this.f11509C = workDatabase;
        this.f11510D = workDatabase.v();
        this.f11511E = workDatabase.q();
        this.f11512F = (ArrayList) bVar.f5178h;
    }

    public final void a(p050f1.o oVar) {
        boolean z6 = oVar instanceof n;
        o oVar2 = this.f11521w;
        String str = f11506K;
        if (!z6) {
            if (oVar instanceof m) {
                q.a().b(str, "Worker result RETRY for " + this.f11513G);
                c();
                return;
            }
            q.a().b(str, "Worker result FAILURE for " + this.f11513G);
            if (oVar2.c()) {
                d();
                return;
            } else {
                g();
                return;
            }
        }
        q.a().b(str, "Worker result SUCCESS for " + this.f11513G);
        if (oVar2.c()) {
            d();
            return;
        }
        c cVar = this.f11511E;
        String str2 = this.f11518t;
        o1.p pVar = this.f11510D;
        WorkDatabase workDatabase = this.f11509C;
        workDatabase.c();
        try {
            pVar.k(3, str2);
            pVar.j(str2, ((n) this.f11524z).a);
            long jCurrentTimeMillis = System.currentTimeMillis();
            for (String str3 : cVar.q(str2)) {
                if (pVar.e(str3) == 5) {
                    K0.o oVarC = K0.o.c(1, "SELECT COUNT(*)=0 FROM dependency WHERE work_spec_id=? AND prerequisite_id IN (SELECT id FROM workspec WHERE state!=2)");
                    if (str3 == null) {
                        oVarC.v(1);
                    } else {
                        oVarC.m(1, str3);
                    }
                    WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) cVar.f13623t;
                    workDatabase_Impl.b();
                    Cursor cursorM = workDatabase_Impl.m(oVarC);
                    try {
                        boolean z10 = cursorM.moveToFirst() && cursorM.getInt(0) != 0;
                        cursorM.close();
                        oVarC.g();
                        if (z10) {
                            q.a().b(str, "Setting status to enqueued for " + str3);
                            pVar.k(1, str3);
                            pVar.i(str3, jCurrentTimeMillis);
                        }
                    } catch (Throwable th) {
                        cursorM.close();
                        oVarC.g();
                        throw th;
                    }
                }
            }
            workDatabase.o();
            workDatabase.j();
            e(false);
        } catch (Throwable th2) {
            workDatabase.j();
            e(false);
            throw th2;
        }
    }

    public final void b() {
        boolean zK = k();
        WorkDatabase workDatabase = this.f11509C;
        String str = this.f11518t;
        if (!zK) {
            workDatabase.c();
            try {
                int iE = this.f11510D.e(str);
                o1.m mVarU = workDatabase.u();
                WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) mVarU.f13641s;
                workDatabase_Impl.b();
                d dVar = (d) mVarU.f13643u;
                j jVarA = dVar.a();
                if (str == null) {
                    jVarA.v(1);
                } else {
                    jVarA.m(1, str);
                }
                workDatabase_Impl.c();
                try {
                    jVarA.a();
                    workDatabase_Impl.o();
                    workDatabase_Impl.j();
                    dVar.e(jVarA);
                    if (iE == 0) {
                        e(false);
                    } else if (iE == 2) {
                        a(this.f11524z);
                    } else if (!AbstractC0487g.b(iE)) {
                        c();
                    }
                    workDatabase.o();
                    workDatabase.j();
                } catch (Throwable th) {
                    workDatabase_Impl.j();
                    dVar.e(jVarA);
                    throw th;
                }
            } catch (Throwable th2) {
                workDatabase.j();
                throw th2;
            }
        }
        List list = this.f11519u;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((g) it.next()).a(str);
            }
            h.a(this.f11507A, workDatabase, list);
        }
    }

    public final void c() {
        String str = this.f11518t;
        o1.p pVar = this.f11510D;
        WorkDatabase workDatabase = this.f11509C;
        workDatabase.c();
        try {
            pVar.k(1, str);
            pVar.i(str, System.currentTimeMillis());
            pVar.h(str, -1L);
            workDatabase.o();
        } finally {
            workDatabase.j();
            e(true);
        }
    }

    public final void d() {
        String str = this.f11518t;
        o1.p pVar = this.f11510D;
        WorkDatabase workDatabase = this.f11509C;
        workDatabase.c();
        try {
            pVar.i(str, System.currentTimeMillis());
            pVar.k(1, str);
            WorkDatabase_Impl workDatabase_Impl = pVar.a;
            workDatabase_Impl.b();
            d dVar = pVar.f13671i;
            j jVarA = dVar.a();
            if (str == null) {
                jVarA.v(1);
            } else {
                jVarA.m(1, str);
            }
            workDatabase_Impl.c();
            try {
                jVarA.a();
                workDatabase_Impl.o();
                workDatabase_Impl.j();
                dVar.e(jVarA);
                workDatabase_Impl.b();
                d dVar2 = pVar.f13667e;
                j jVarA2 = dVar2.a();
                if (str == null) {
                    jVarA2.v(1);
                } else {
                    jVarA2.m(1, str);
                }
                workDatabase_Impl.c();
                try {
                    jVarA2.a();
                    workDatabase_Impl.o();
                    workDatabase_Impl.j();
                    dVar2.e(jVarA2);
                    pVar.h(str, -1L);
                    workDatabase.o();
                    workDatabase.j();
                    e(false);
                } catch (Throwable th) {
                    workDatabase_Impl.j();
                    dVar2.e(jVarA2);
                    throw th;
                }
            } catch (Throwable th2) {
                workDatabase_Impl.j();
                dVar.e(jVarA);
                throw th2;
            }
        } catch (Throwable th3) {
            workDatabase.j();
            e(false);
            throw th3;
        }
    }

    public final void e(boolean z6) {
        boolean zContainsKey;
        this.f11509C.c();
        try {
            o1.p pVarV = this.f11509C.v();
            pVarV.getClass();
            K0.o oVarC = K0.o.c(0, "SELECT COUNT(*) > 0 FROM workspec WHERE state NOT IN (2, 3, 5) LIMIT 1");
            WorkDatabase_Impl workDatabase_Impl = pVarV.a;
            workDatabase_Impl.b();
            Cursor cursorM = workDatabase_Impl.m(oVarC);
            try {
                boolean z10 = cursorM.moveToFirst() && cursorM.getInt(0) != 0;
                cursorM.close();
                oVarC.g();
                if (!z10) {
                    p147p1.j.a(this.f11517s, RescheduleReceiver.class, false);
                }
                if (z6) {
                    this.f11510D.k(1, this.f11518t);
                    this.f11510D.h(this.f11518t, -1L);
                }
                if (this.f11521w != null && this.f11522x != null) {
                    e eVar = this.f11508B;
                    String str = this.f11518t;
                    synchronized (eVar.f11474D) {
                        zContainsKey = eVar.f11480x.containsKey(str);
                    }
                    if (zContainsKey) {
                        this.f11508B.k(this.f11518t);
                    }
                }
                this.f11509C.o();
                this.f11509C.j();
                this.f11514H.j(Boolean.valueOf(z6));
            } catch (Throwable th) {
                cursorM.close();
                oVarC.g();
                throw th;
            }
        } catch (Throwable th2) {
            this.f11509C.j();
            throw th2;
        }
    }

    public final void f() {
        if (this.f11510D.e(this.f11518t) == 2) {
            q.a().getClass();
            e(true);
        } else {
            q.a().getClass();
            e(false);
        }
    }

    public final void g() {
        String str = this.f11518t;
        WorkDatabase workDatabase = this.f11509C;
        workDatabase.c();
        try {
            LinkedList linkedList = new LinkedList();
            linkedList.add(str);
            while (true) {
                boolean zIsEmpty = linkedList.isEmpty();
                o1.p pVar = this.f11510D;
                if (zIsEmpty) {
                    pVar.j(str, ((l) this.f11524z).a);
                    workDatabase.o();
                    return;
                } else {
                    String str2 = (String) linkedList.remove();
                    if (pVar.e(str2) != 6) {
                        pVar.k(4, str2);
                    }
                    linkedList.addAll(this.f11511E.q(str2));
                }
            }
        } finally {
            workDatabase.j();
            e(false);
        }
    }

    public final boolean k() {
        if (!this.f11516J) {
            return false;
        }
        q.a().getClass();
        int iE = this.f11510D.e(this.f11518t);
        if (iE == 0) {
            e(false);
            return true;
        }
        e(!AbstractC0487g.b(iE));
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x007a A[Catch: all -> 0x0064, TryCatch #1 {all -> 0x0064, blocks: (B:14:0x004f, B:16:0x0053, B:21:0x0067, B:23:0x006d, B:25:0x0071, B:35:0x0097, B:30:0x007a, B:32:0x0086), top: B:104:0x004f }] */
    /* JADX WARN: Code duplicated, block: B:32:0x0086 A[Catch: all -> 0x0064, TRY_LEAVE, TryCatch #1 {all -> 0x0064, blocks: (B:14:0x004f, B:16:0x0053, B:21:0x0067, B:23:0x006d, B:25:0x0071, B:35:0x0097, B:30:0x007a, B:32:0x0086), top: B:104:0x004f }] */
    @Override // java.lang.Runnable
    public final void run() {
        p050f1.j jVar;
        g gVarA;
        StringBuilder sb = new StringBuilder("Work [ id=");
        String str = this.f11518t;
        sb.append(str);
        sb.append(", tags={ ");
        ArrayList<String> arrayList = this.f11512F;
        boolean z6 = true;
        boolean z10 = true;
        for (String str2 : arrayList) {
            if (z10) {
                z10 = false;
            } else {
                sb.append(", ");
            }
            sb.append(str2);
        }
        sb.append(" } ]");
        this.f11513G = sb.toString();
        o oVar = this.f11521w;
        if (k()) {
            return;
        }
        WorkDatabase workDatabase = this.f11509C;
        workDatabase.c();
        try {
            if (oVar.f13646b != 1) {
                f();
                workDatabase.o();
                q.a().getClass();
                workDatabase.j();
                return;
            }
            if (!oVar.c()) {
                if (oVar.f13646b == 1 && oVar.f13654k > 0) {
                    if (System.currentTimeMillis() < oVar.a()) {
                        q.a().getClass();
                        e(true);
                        workDatabase.o();
                        workDatabase.j();
                        return;
                    }
                }
            } else if (System.currentTimeMillis() < oVar.a()) {
                q.a().getClass();
                e(true);
                workDatabase.o();
                workDatabase.j();
                return;
            }
            workDatabase.o();
            workDatabase.j();
            boolean zC = oVar.c();
            o1.p pVar = this.f11510D;
            b bVar = this.f11507A;
            if (zC) {
                gVarA = oVar.f13649e;
            } else {
                e eVar = bVar.f11390d;
                String str3 = oVar.f13648d;
                eVar.getClass();
                int i10 = p050f1.j.a;
                try {
                    jVar = (p050f1.j) Class.forName(str3).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                } catch (Exception unused) {
                    q.a().getClass();
                    jVar = null;
                }
                if (jVar == null) {
                    q.a().getClass();
                    g();
                    return;
                }
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(oVar.f13649e);
                pVar.getClass();
                K0.o oVarC = K0.o.c(1, "SELECT output FROM workspec WHERE id IN\n             (SELECT prerequisite_id FROM dependency WHERE work_spec_id=?)");
                if (str == null) {
                    oVarC.v(1);
                } else {
                    oVarC.m(1, str);
                }
                WorkDatabase_Impl workDatabase_Impl = pVar.a;
                workDatabase_Impl.b();
                Cursor cursorM = workDatabase_Impl.m(oVarC);
                try {
                    ArrayList arrayList3 = new ArrayList(cursorM.getCount());
                    while (cursorM.moveToNext()) {
                        arrayList3.add(g.a(cursorM.isNull(0) ? null : cursorM.getBlob(0)));
                    }
                    cursorM.close();
                    oVarC.g();
                    arrayList2.addAll(arrayList3);
                    gVarA = jVar.a(arrayList2);
                } catch (Throwable th) {
                    cursorM.close();
                    oVarC.g();
                    throw th;
                }
            }
            UUID uuidFromString = UUID.fromString(str);
            ExecutorService executorService = bVar.a;
            Y1.c cVar = this.f11523y;
            p147p1.q qVar = new p147p1.q(workDatabase, cVar);
            p147p1.p pVar2 = new p147p1.p(workDatabase, this.f11508B, cVar);
            WorkerParameters workerParameters = new WorkerParameters();
            workerParameters.a = uuidFromString;
            workerParameters.f7208b = gVarA;
            workerParameters.f7209c = new HashSet(arrayList);
            workerParameters.f7210d = this.f11520v;
            workerParameters.f7211e = oVar.f13654k;
            workerParameters.f7212f = executorService;
            workerParameters.f7213g = cVar;
            x xVar = bVar.f11389c;
            workerParameters.f7214h = xVar;
            workerParameters.f7215i = qVar;
            workerParameters.j = pVar2;
            if (this.f11522x == null) {
                this.f11522x = xVar.a(this.f11517s, oVar.f13647c, workerParameters);
            }
            p050f1.p pVar3 = this.f11522x;
            if (pVar3 == null) {
                q.a().getClass();
                g();
                return;
            }
            if (pVar3.isUsed()) {
                q.a().getClass();
                g();
                return;
            }
            this.f11522x.setUsed();
            workDatabase.c();
            try {
                if (pVar.e(str) == 1) {
                    pVar.k(2, str);
                    WorkDatabase_Impl workDatabase_Impl2 = pVar.a;
                    workDatabase_Impl2.b();
                    d dVar = pVar.f13670h;
                    j jVarA = dVar.a();
                    if (str == null) {
                        jVarA.v(1);
                    } else {
                        jVarA.m(1, str);
                    }
                    workDatabase_Impl2.c();
                    try {
                        jVarA.a();
                        workDatabase_Impl2.o();
                        workDatabase_Impl2.j();
                        dVar.e(jVarA);
                    } catch (Throwable th2) {
                        workDatabase_Impl2.j();
                        dVar.e(jVarA);
                        throw th2;
                    }
                } else {
                    z6 = false;
                }
                workDatabase.o();
                workDatabase.j();
                if (!z6) {
                    f();
                    return;
                }
                if (k()) {
                    return;
                }
                p147p1.o oVar2 = new p147p1.o(this.f11517s, this.f11521w, this.f11522x, pVar2, this.f11523y);
                ((O) cVar.f5672v).execute(oVar2);
                k kVar = oVar2.f14186s;
                a aVar = new a(this, 15, kVar);
                F3.c cVar2 = new F3.c(5);
                k kVar2 = this.f11515I;
                kVar2.f(aVar, cVar2);
                boolean z11 = false;
                kVar.f(new P2.g(this, kVar, 7, z11), (O) cVar.f5672v);
                kVar2.f(new P2.g(this, this.f11513G, 8, z11), (ExecutorC0659p) cVar.f5670t);
            } catch (Throwable th3) {
                workDatabase.j();
                throw th3;
            }
        } catch (Throwable th4) {
            workDatabase.j();
            throw th4;
        }
    }
}
