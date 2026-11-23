package p061g1;

import B4.I;
import E4.C0187a;
import K0.l;
import Y1.c;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.os.Build;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkDatabase_Impl;
import androidx.work.impl.background.systemjob.SystemJobService;
import com.kcstream.cing.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import o1.p;
import p050f1.b;
import p050f1.q;
import p050f1.w;
import p078i.ExecutorC0659p;
import p085i7.d;
import p140o4.r;
import p147p1.e;
import p147p1.j;
import p188t1.Y;
import p210v8.i;

/* JADX INFO: loaded from: classes.dex */
public final class o extends w {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static o f11495k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static o f11496l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final Object f11497m;
    public final Context a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f11498b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final WorkDatabase f11499c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final c f11500d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List f11501e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final e f11502f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final p081i3.b f11503g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f11504h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public BroadcastReceiver.PendingResult f11505i;
    public final r j;

    static {
        q.c("WorkManagerImpl");
        f11495k = null;
        f11496l = null;
        f11497m = new Object();
    }

    public o(Context context, b bVar, c cVar) {
        l lVarK;
        int i10 = 15;
        boolean z6 = context.getResources().getBoolean(R.bool.workmanager_test_configuration);
        Context applicationContext = context.getApplicationContext();
        ExecutorC0659p executorC0659p = (ExecutorC0659p) cVar.f5670t;
        i.f(applicationContext, "context");
        i.f(executorC0659p, "queryExecutor");
        if (z6) {
            lVarK = new l(applicationContext, WorkDatabase.class, null);
            lVarK.j = true;
        } else {
            lVarK = Y.k(applicationContext, WorkDatabase.class, "androidx.work.workdb");
            lVarK.f2548i = new C0187a(applicationContext, i10);
        }
        lVarK.f2546g = executorC0659p;
        lVarK.f2543d.add(b.a);
        lVarK.a(d.f11464g);
        lVarK.a(new f(applicationContext, 2, 3));
        lVarK.a(d.f11465h);
        lVarK.a(d.f11466i);
        lVarK.a(new f(applicationContext, 5, 6));
        lVarK.a(d.j);
        lVarK.a(d.f11467k);
        lVarK.a(d.f11468l);
        lVarK.a(new f(applicationContext));
        lVarK.a(new f(applicationContext, 10, 11));
        lVarK.a(d.f11461d);
        lVarK.a(d.f11462e);
        lVarK.a(d.f11463f);
        lVarK.f2550l = false;
        lVarK.f2551m = true;
        WorkDatabase workDatabase = (WorkDatabase) lVarK.b();
        Context applicationContext2 = context.getApplicationContext();
        q qVar = new q(bVar.f11392f);
        synchronized (q.f11416b) {
            q.f11417c = qVar;
        }
        r rVar = new r(applicationContext2, cVar);
        this.j = rVar;
        int i11 = h.a;
        p089j1.b bVar2 = new p089j1.b(applicationContext2, this);
        j.a(applicationContext2, SystemJobService.class, true);
        q.a().getClass();
        List listAsList = Arrays.asList(bVar2, new p071h1.b(applicationContext2, bVar, rVar, this));
        e eVar = new e(context, bVar, cVar, workDatabase, listAsList);
        Context applicationContext3 = context.getApplicationContext();
        this.a = applicationContext3;
        this.f11498b = bVar;
        this.f11500d = cVar;
        this.f11499c = workDatabase;
        this.f11501e = listAsList;
        this.f11502f = eVar;
        this.f11503g = new p081i3.b(workDatabase, i10);
        this.f11504h = false;
        if (Build.VERSION.SDK_INT >= 24 && n.a(applicationContext3)) {
            throw new IllegalStateException("Cannot initialize WorkManager in direct boot mode");
        }
        this.f11500d.t(new e(applicationContext3, this));
    }

    public static o a() {
        synchronized (f11497m) {
            try {
                o oVar = f11495k;
                if (oVar != null) {
                    return oVar;
                }
                return f11496l;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static o b(Context context) {
        o oVarA;
        synchronized (f11497m) {
            try {
                oVarA = a();
                if (oVarA == null) {
                    context.getApplicationContext();
                    throw new IllegalStateException("WorkManager is not initialized properly.  You have explicitly disabled WorkManagerInitializer in your manifest, have not manually called WorkManager#initialize at this point, and your Application does not implement Configuration.Provider.");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return oVarA;
    }

    public static void c(Context context, b bVar) {
        synchronized (f11497m) {
            try {
                o oVar = f11495k;
                if (oVar != null && f11496l != null) {
                    throw new IllegalStateException("WorkManager is already initialized.  Did you try to initialize it manually without disabling WorkManagerInitializer? See WorkManager#initialize(Context, Configuration) or the class level Javadoc for more information.");
                }
                if (oVar == null) {
                    Context applicationContext = context.getApplicationContext();
                    if (f11496l == null) {
                        f11496l = new o(applicationContext, bVar, new c(bVar.f11388b));
                    }
                    f11495k = f11496l;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void d() {
        synchronized (f11497m) {
            try {
                this.f11504h = true;
                BroadcastReceiver.PendingResult pendingResult = this.f11505i;
                if (pendingResult != null) {
                    pendingResult.finish();
                    this.f11505i = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void e() {
        ArrayList arrayListF;
        WorkDatabase workDatabase = this.f11499c;
        Context context = this.a;
        String str = p089j1.b.f12355w;
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        if (jobScheduler != null && (arrayListF = p089j1.b.f(context, jobScheduler)) != null && !arrayListF.isEmpty()) {
            Iterator it = arrayListF.iterator();
            while (it.hasNext()) {
                p089j1.b.c(jobScheduler, ((JobInfo) it.next()).getId());
            }
        }
        p pVarV = workDatabase.v();
        WorkDatabase_Impl workDatabase_Impl = pVarV.a;
        workDatabase_Impl.b();
        d dVar = pVarV.f13672k;
        P0.j jVarA = dVar.a();
        workDatabase_Impl.c();
        try {
            jVarA.a();
            workDatabase_Impl.o();
            workDatabase_Impl.j();
            dVar.e(jVarA);
            h.a(this.f11498b, workDatabase, this.f11501e);
        } catch (Throwable th) {
            workDatabase_Impl.j();
            dVar.e(jVarA);
            throw th;
        }
    }

    public final void f(i iVar, c cVar) {
        c cVar2 = this.f11500d;
        I i10 = new I(16);
        i10.f631t = this;
        i10.f632u = iVar;
        i10.f633v = cVar;
        cVar2.t(i10);
    }

    public final void g(i iVar) {
        this.f11500d.t(new p147p1.l(this, iVar, false));
    }
}
