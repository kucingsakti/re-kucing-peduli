package p089j1;

import C3.a;
import P0.j;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.os.Build;
import android.os.PersistableBundle;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkDatabase_Impl;
import androidx.work.impl.background.systemjob.SystemJobService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Callable;
import o1.h;
import o1.i;
import p050f1.q;
import p061g1.g;
import p061g1.o;
import p085i7.d;
import p102k7.e;

/* JADX INFO: loaded from: classes.dex */
public final class b implements g {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final String f12355w = q.c("SystemJobScheduler");

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Context f12356s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final JobScheduler f12357t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final o f12358u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final a f12359v;

    public b(Context context, o oVar) {
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        a aVar = new a(context);
        this.f12356s = context;
        this.f12358u = oVar;
        this.f12357t = jobScheduler;
        this.f12359v = aVar;
    }

    public static void c(JobScheduler jobScheduler, int i10) {
        try {
            jobScheduler.cancel(i10);
        } catch (Throwable unused) {
            q qVarA = q.a();
            String.format(Locale.getDefault(), "Exception while trying to cancel job (%d)", Integer.valueOf(i10));
            qVarA.getClass();
        }
    }

    public static ArrayList d(Context context, JobScheduler jobScheduler, String str) {
        ArrayList<JobInfo> arrayListF = f(context, jobScheduler);
        if (arrayListF == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(2);
        for (JobInfo jobInfo : arrayListF) {
            i iVarG = g(jobInfo);
            if (iVarG != null && str.equals(iVarG.a)) {
                arrayList.add(Integer.valueOf(jobInfo.getId()));
            }
        }
        return arrayList;
    }

    public static ArrayList f(Context context, JobScheduler jobScheduler) {
        List<JobInfo> allPendingJobs;
        try {
            allPendingJobs = jobScheduler.getAllPendingJobs();
        } catch (Throwable unused) {
            q.a().getClass();
            allPendingJobs = null;
        }
        if (allPendingJobs == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(allPendingJobs.size());
        ComponentName componentName = new ComponentName(context, (Class<?>) SystemJobService.class);
        for (JobInfo jobInfo : allPendingJobs) {
            if (componentName.equals(jobInfo.getService())) {
                arrayList.add(jobInfo);
            }
        }
        return arrayList;
    }

    public static i g(JobInfo jobInfo) {
        PersistableBundle extras = jobInfo.getExtras();
        if (extras == null) {
            return null;
        }
        try {
            if (!extras.containsKey("EXTRA_WORK_SPEC_ID")) {
                return null;
            }
            return new i(extras.getString("EXTRA_WORK_SPEC_ID"), extras.getInt("EXTRA_WORK_SPEC_GENERATION", 0));
        } catch (NullPointerException unused) {
            return null;
        }
    }

    @Override // p061g1.g
    public final void a(String str) {
        Context context = this.f12356s;
        JobScheduler jobScheduler = this.f12357t;
        ArrayList arrayListD = d(context, jobScheduler, str);
        if (arrayListD == null || arrayListD.isEmpty()) {
            return;
        }
        Iterator it = arrayListD.iterator();
        while (it.hasNext()) {
            c(jobScheduler, ((Integer) it.next()).intValue());
        }
        h hVarS = this.f12358u.f11499c.s();
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) hVarS.f13632s;
        workDatabase_Impl.b();
        d dVar = (d) hVarS.f13635v;
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
        } finally {
            workDatabase_Impl.j();
            dVar.e(jVarA);
        }
    }

    @Override // p061g1.g
    public final void b(o1.o... oVarArr) {
        int iIntValue;
        ArrayList arrayListD;
        int iIntValue2;
        o oVar = this.f12358u;
        WorkDatabase workDatabase = oVar.f11499c;
        final e eVar = new e(workDatabase);
        for (o1.o oVar2 : oVarArr) {
            workDatabase.c();
            try {
                o1.o oVarG = workDatabase.v().g(oVar2.a);
                String str = f12355w;
                String str2 = oVar2.a;
                if (oVarG == null) {
                    q.a().d(str, "Skipping scheduling " + str2 + " because it's no longer in the DB");
                    workDatabase.o();
                } else if (oVarG.f13646b != 1) {
                    q.a().d(str, "Skipping scheduling " + str2 + " because it is no longer enqueued");
                    workDatabase.o();
                } else {
                    i iVarG = a.g(oVar2);
                    o1.g gVarH = workDatabase.s().h(iVarG);
                    WorkDatabase workDatabase2 = (WorkDatabase) eVar.f12743s;
                    if (gVarH != null) {
                        iIntValue = gVarH.f13630c;
                    } else {
                        oVar.f11498b.getClass();
                        final int i10 = oVar.f11498b.f11393g;
                        Object objN = workDatabase2.n(new Callable() { // from class: p1.f
                            @Override // java.util.concurrent.Callable
                            public final Object call() {
                                e eVar2 = eVar;
                                p210v8.i.f(eVar2, "this$0");
                                WorkDatabase workDatabase3 = (WorkDatabase) eVar2.f12743s;
                                Long lU0 = workDatabase3.r().U0("next_job_scheduler_id");
                                int i11 = 0;
                                int iLongValue = lU0 != null ? (int) lU0.longValue() : 0;
                                workDatabase3.r().W0(new o1.d("next_job_scheduler_id", Long.valueOf(iLongValue == Integer.MAX_VALUE ? 0 : iLongValue + 1)));
                                if (iLongValue < 0 || iLongValue > i10) {
                                    workDatabase3.r().W0(new o1.d("next_job_scheduler_id", Long.valueOf(1)));
                                } else {
                                    i11 = iLongValue;
                                }
                                return Integer.valueOf(i11);
                            }
                        });
                        p210v8.i.e(objN, "workDatabase.runInTransa…            id\n        })");
                        iIntValue = ((Number) objN).intValue();
                    }
                    if (gVarH == null) {
                        oVar.f11499c.s().j(new o1.g(iVarG.a, iVarG.f13636b, iIntValue));
                    }
                    h(oVar2, iIntValue);
                    if (Build.VERSION.SDK_INT == 23 && (arrayListD = d(this.f12356s, this.f12357t, str2)) != null) {
                        int iIndexOf = arrayListD.indexOf(Integer.valueOf(iIntValue));
                        if (iIndexOf >= 0) {
                            arrayListD.remove(iIndexOf);
                        }
                        if (arrayListD.isEmpty()) {
                            oVar.f11498b.getClass();
                            final int i11 = oVar.f11498b.f11393g;
                            Object objN2 = workDatabase2.n(new Callable() { // from class: p1.f
                                @Override // java.util.concurrent.Callable
                                public final Object call() {
                                    e eVar2 = eVar;
                                    p210v8.i.f(eVar2, "this$0");
                                    WorkDatabase workDatabase3 = (WorkDatabase) eVar2.f12743s;
                                    Long lU0 = workDatabase3.r().U0("next_job_scheduler_id");
                                    int i12 = 0;
                                    int iLongValue = lU0 != null ? (int) lU0.longValue() : 0;
                                    workDatabase3.r().W0(new o1.d("next_job_scheduler_id", Long.valueOf(iLongValue == Integer.MAX_VALUE ? 0 : iLongValue + 1)));
                                    if (iLongValue < 0 || iLongValue > i11) {
                                        workDatabase3.r().W0(new o1.d("next_job_scheduler_id", Long.valueOf(1)));
                                    } else {
                                        i12 = iLongValue;
                                    }
                                    return Integer.valueOf(i12);
                                }
                            });
                            p210v8.i.e(objN2, "workDatabase.runInTransa…            id\n        })");
                            iIntValue2 = ((Number) objN2).intValue();
                        } else {
                            iIntValue2 = ((Integer) arrayListD.get(0)).intValue();
                        }
                        h(oVar2, iIntValue2);
                    }
                    workDatabase.o();
                }
                workDatabase.j();
            } catch (Throwable th) {
                workDatabase.j();
                throw th;
            }
        }
    }

    @Override // p061g1.g
    public final boolean e() {
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0085  */
    /* JADX WARN: Code duplicated, block: B:23:0x0087  */
    /* JADX WARN: Code duplicated, block: B:54:0x0104  */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0077, code lost:
    
        if (r9 < 26) goto L19;
     */
    /* JADX WARN: Switch 'out' block B:24:0x008a for B:20:0x0082 already processed. Defaulting to fallback option. */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void h(o1.o r21, int r22) {
        /*
            Method dump skipped, instruction units count: 498
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p089j1.b.h(o1.o, int):void");
    }
}
