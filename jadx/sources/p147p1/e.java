package p147p1;

import P0.j;
import U.z0;
import android.app.ActivityManager;
import android.app.AlarmManager;
import android.app.ApplicationExitInfo;
import android.app.PendingIntent;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteAccessPermException;
import android.database.sqlite.SQLiteCantOpenDatabaseException;
import android.database.sqlite.SQLiteConstraintException;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteDiskIOException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteTableLockedException;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkDatabase_Impl;
import androidx.work.impl.utils.ForceStopRunnable$BroadcastReceiver;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import o1.h;
import o1.i;
import o1.m;
import o1.p;
import p050f1.q;
import p061g1.o;
import p081i3.b;
import p085i7.d;

/* JADX INFO: loaded from: classes.dex */
public final class e implements Runnable {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final String f14173w = q.c("ForceStopRunnable");

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final long f14174x = TimeUnit.DAYS.toMillis(3650);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Context f14175s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final o f14176t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final b f14177u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f14178v = 0;

    public e(Context context, o oVar) {
        this.f14175s = context.getApplicationContext();
        this.f14176t = oVar;
        this.f14177u = oVar.f11503g;
    }

    public static void b(Context context) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        int i10 = Build.VERSION.SDK_INT >= 31 ? 167772160 : 134217728;
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(context, (Class<?>) ForceStopRunnable$BroadcastReceiver.class));
        intent.setAction("ACTION_FORCE_STOP_RESCHEDULE");
        PendingIntent broadcast = PendingIntent.getBroadcast(context, -1, intent, i10);
        long jCurrentTimeMillis = System.currentTimeMillis() + f14174x;
        if (alarmManager != null) {
            alarmManager.setExact(0, jCurrentTimeMillis, broadcast);
        }
    }

    /* JADX WARN: Code duplicated, block: B:105:0x0209  */
    /* JADX WARN: Code duplicated, block: B:109:0x0223  */
    /* JADX WARN: Code duplicated, block: B:145:? A[RETURN, SYNTHETIC] */
    public final void a() {
        boolean z6;
        b bVar = this.f14177u;
        String str = p089j1.b.f12355w;
        Context context = this.f14175s;
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        ArrayList<JobInfo> arrayListF = p089j1.b.f(context, jobScheduler);
        o oVar = this.f14176t;
        h hVarS = oVar.f11499c.s();
        hVarS.getClass();
        K0.o oVarC = K0.o.c(0, "SELECT DISTINCT work_spec_id FROM SystemIdInfo");
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) hVarS.f13632s;
        workDatabase_Impl.b();
        Cursor cursorM = workDatabase_Impl.m(oVarC);
        try {
            ArrayList arrayList = new ArrayList(cursorM.getCount());
            while (cursorM.moveToNext()) {
                arrayList.add(cursorM.isNull(0) ? null : cursorM.getString(0));
            }
            cursorM.close();
            oVarC.g();
            HashSet hashSet = new HashSet(arrayListF != null ? arrayListF.size() : 0);
            if (arrayListF != null && !arrayListF.isEmpty()) {
                for (JobInfo jobInfo : arrayListF) {
                    i iVarG = p089j1.b.g(jobInfo);
                    if (iVarG != null) {
                        hashSet.add(iVarG.a);
                    } else {
                        p089j1.b.c(jobScheduler, jobInfo.getId());
                    }
                }
            }
            Iterator it = arrayList.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (!hashSet.contains((String) it.next())) {
                        q.a().getClass();
                        z6 = true;
                        break;
                    }
                } else {
                    z6 = false;
                    break;
                }
            }
            if (z6) {
                WorkDatabase workDatabase = oVar.f11499c;
                workDatabase.c();
                try {
                    p pVarV = workDatabase.v();
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        pVarV.h((String) it2.next(), -1L);
                    }
                    workDatabase.o();
                    workDatabase.j();
                } catch (Throwable th) {
                    workDatabase.j();
                    throw th;
                }
            }
            WorkDatabase workDatabase2 = oVar.f11499c;
            p pVarV2 = workDatabase2.v();
            m mVarU = workDatabase2.u();
            workDatabase2.c();
            try {
                ArrayList<o1.o> arrayListC = pVarV2.c();
                boolean zIsEmpty = arrayListC.isEmpty();
                if (!zIsEmpty) {
                    for (o1.o oVar2 : arrayListC) {
                        pVarV2.k(1, oVar2.a);
                        pVarV2.h(oVar2.a, -1L);
                    }
                }
                WorkDatabase_Impl workDatabase_Impl2 = (WorkDatabase_Impl) mVarU.f13641s;
                workDatabase_Impl2.b();
                d dVar = (d) mVarU.f13644v;
                j jVarA = dVar.a();
                workDatabase_Impl2.c();
                try {
                    jVarA.a();
                    workDatabase_Impl2.o();
                    workDatabase_Impl2.j();
                    dVar.e(jVarA);
                    workDatabase2.o();
                    workDatabase2.j();
                    boolean z10 = !zIsEmpty || z6;
                    Long lU0 = ((WorkDatabase) oVar.f11503g.f12212t).r().U0("reschedule_needed");
                    if (lU0 != null && lU0.longValue() == 1) {
                        q.a().getClass();
                        oVar.e();
                        b bVar2 = oVar.f11503g;
                        bVar2.getClass();
                        ((WorkDatabase) bVar2.f12212t).r().W0(new o1.d("reschedule_needed", 0L));
                        return;
                    }
                    try {
                        int i10 = Build.VERSION.SDK_INT;
                        int i11 = i10 >= 31 ? 570425344 : 536870912;
                        Intent intent = new Intent();
                        intent.setComponent(new ComponentName(context, (Class<?>) ForceStopRunnable$BroadcastReceiver.class));
                        intent.setAction("ACTION_FORCE_STOP_RESCHEDULE");
                        PendingIntent broadcast = PendingIntent.getBroadcast(context, -1, intent, i11);
                        if (i10 < 30) {
                            if (broadcast == null) {
                                b(context);
                                q.a().getClass();
                                oVar.e();
                                long jCurrentTimeMillis = System.currentTimeMillis();
                                bVar.getClass();
                                ((WorkDatabase) bVar.f12212t).r().W0(new o1.d("last_force_stop_ms", Long.valueOf(jCurrentTimeMillis)));
                                return;
                            }
                            if (z10) {
                                q.a().getClass();
                                p061g1.h.a(oVar.f11498b, oVar.f11499c, oVar.f11501e);
                            }
                        }
                        if (broadcast != null) {
                            broadcast.cancel();
                        }
                        List historicalProcessExitReasons = ((ActivityManager) context.getSystemService("activity")).getHistoricalProcessExitReasons(null, 0, 0);
                        if (historicalProcessExitReasons != null && !historicalProcessExitReasons.isEmpty()) {
                            Long lU1 = ((WorkDatabase) bVar.f12212t).r().U0("last_force_stop_ms");
                            long jLongValue = lU1 != null ? lU1.longValue() : 0L;
                            for (int i12 = 0; i12 < historicalProcessExitReasons.size(); i12++) {
                                ApplicationExitInfo applicationExitInfoE = z0.e(historicalProcessExitReasons.get(i12));
                                if (applicationExitInfoE.getReason() == 10 && applicationExitInfoE.getTimestamp() >= jLongValue) {
                                    q.a().getClass();
                                    oVar.e();
                                    long jCurrentTimeMillis2 = System.currentTimeMillis();
                                    bVar.getClass();
                                    ((WorkDatabase) bVar.f12212t).r().W0(new o1.d("last_force_stop_ms", Long.valueOf(jCurrentTimeMillis2)));
                                    return;
                                }
                            }
                        }
                        if (z10) {
                            q.a().getClass();
                            p061g1.h.a(oVar.f11498b, oVar.f11499c, oVar.f11501e);
                        }
                    } catch (IllegalArgumentException e10) {
                        e = e10;
                        if (q.a().a <= 5) {
                            Log.w(f14173w, "Ignoring exception", e);
                        }
                    } catch (SecurityException e11) {
                        e = e11;
                        if (q.a().a <= 5) {
                            Log.w(f14173w, "Ignoring exception", e);
                        }
                    }
                } catch (Throwable th2) {
                    workDatabase_Impl2.j();
                    dVar.e(jVarA);
                    throw th2;
                }
            } catch (Throwable th3) {
                workDatabase2.j();
                throw th3;
            }
        } catch (Throwable th4) {
            cursorM.close();
            oVarC.g();
            throw th4;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zA;
        o oVar = this.f14176t;
        try {
            p050f1.b bVar = oVar.f11498b;
            bVar.getClass();
            boolean zIsEmpty = TextUtils.isEmpty(null);
            Context context = this.f14175s;
            if (zIsEmpty) {
                q.a().getClass();
                zA = true;
            } else {
                zA = k.a(context, bVar);
                q.a().getClass();
            }
            if (!zA) {
                oVar.d();
                return;
            }
            while (true) {
                try {
                    oa.b.k(context);
                    q.a().getClass();
                    try {
                        a();
                        oVar.d();
                        return;
                    } catch (SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException e10) {
                        int i10 = this.f14178v + 1;
                        this.f14178v = i10;
                        if (i10 >= 3) {
                            q.a().getClass();
                            IllegalStateException illegalStateException = new IllegalStateException("The file system on the device is in a bad state. WorkManager cannot access the app's internal data store.", e10);
                            oVar.f11498b.getClass();
                            throw illegalStateException;
                        }
                        q.a().getClass();
                        try {
                            Thread.sleep(((long) this.f14178v) * 300);
                        } catch (InterruptedException unused) {
                        }
                    }
                } catch (SQLiteException e11) {
                    q.a().getClass();
                    IllegalStateException illegalStateException2 = new IllegalStateException("Unexpected SQLite exception during migrations", e11);
                    oVar.f11498b.getClass();
                    throw illegalStateException2;
                }
            }
        } catch (Throwable th) {
            oVar.d();
            throw th;
        }
    }
}
