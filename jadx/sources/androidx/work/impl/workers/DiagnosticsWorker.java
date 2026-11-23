package androidx.work.impl.workers;

import C3.b;
import K0.o;
import Q3.u0;
import android.content.Context;
import android.database.Cursor;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkDatabase_Impl;
import com.unity3d.services.core.request.metrics.AdOperationMetric;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import o1.h;
import o1.k;
import o1.p;
import o1.r;
import p050f1.d;
import p050f1.g;
import p050f1.n;
import p050f1.q;
import p210v8.i;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroidx/work/impl/workers/DiagnosticsWorker;", "Landroidx/work/Worker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "parameters", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "work-runtime_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class DiagnosticsWorker extends Worker {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DiagnosticsWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        i.f(context, "context");
        i.f(workerParameters, "parameters");
    }

    @Override // androidx.work.Worker
    public final n a() throws Throwable {
        o oVar;
        h hVar;
        k kVar;
        r rVar;
        WorkDatabase workDatabase = p061g1.o.b(getApplicationContext()).f11499c;
        i.e(workDatabase, "workManager.workDatabase");
        p pVarV = workDatabase.v();
        k kVarT = workDatabase.t();
        r rVarW = workDatabase.w();
        h hVarS = workDatabase.s();
        long jCurrentTimeMillis = System.currentTimeMillis() - TimeUnit.DAYS.toMillis(1L);
        pVarV.getClass();
        o oVarC = o.c(1, "SELECT * FROM workspec WHERE last_enqueue_time >= ? AND state IN (2, 3, 5) ORDER BY last_enqueue_time DESC");
        oVarC.I(1, jCurrentTimeMillis);
        WorkDatabase_Impl workDatabase_Impl = pVarV.a;
        workDatabase_Impl.b();
        Cursor cursorM = workDatabase_Impl.m(oVarC);
        try {
            int iE = u0.e(cursorM, "id");
            int iE2 = u0.e(cursorM, AdOperationMetric.INIT_STATE);
            int iE3 = u0.e(cursorM, "worker_class_name");
            int iE4 = u0.e(cursorM, "input_merger_class_name");
            int iE5 = u0.e(cursorM, "input");
            int iE6 = u0.e(cursorM, "output");
            int iE7 = u0.e(cursorM, "initial_delay");
            int iE8 = u0.e(cursorM, "interval_duration");
            int iE9 = u0.e(cursorM, "flex_duration");
            int iE10 = u0.e(cursorM, "run_attempt_count");
            int iE11 = u0.e(cursorM, "backoff_policy");
            oVar = oVarC;
            try {
                int iE12 = u0.e(cursorM, "backoff_delay_duration");
                int iE13 = u0.e(cursorM, "last_enqueue_time");
                int iE14 = u0.e(cursorM, "minimum_retention_duration");
                int iE15 = u0.e(cursorM, "schedule_requested_at");
                int iE16 = u0.e(cursorM, "run_in_foreground");
                int iE17 = u0.e(cursorM, "out_of_quota_policy");
                int iE18 = u0.e(cursorM, "period_count");
                int iE19 = u0.e(cursorM, "generation");
                int iE20 = u0.e(cursorM, "required_network_type");
                int iE21 = u0.e(cursorM, "requires_charging");
                int iE22 = u0.e(cursorM, "requires_device_idle");
                int iE23 = u0.e(cursorM, "requires_battery_not_low");
                int iE24 = u0.e(cursorM, "requires_storage_not_low");
                int iE25 = u0.e(cursorM, "trigger_content_update_delay");
                int iE26 = u0.e(cursorM, "trigger_max_content_delay");
                int iE27 = u0.e(cursorM, "content_uri_triggers");
                int i10 = iE14;
                ArrayList arrayList = new ArrayList(cursorM.getCount());
                while (cursorM.moveToNext()) {
                    byte[] blob = null;
                    String string = cursorM.isNull(iE) ? null : cursorM.getString(iE);
                    int iH = b.H(cursorM.getInt(iE2));
                    String string2 = cursorM.isNull(iE3) ? null : cursorM.getString(iE3);
                    String string3 = cursorM.isNull(iE4) ? null : cursorM.getString(iE4);
                    g gVarA = g.a(cursorM.isNull(iE5) ? null : cursorM.getBlob(iE5));
                    g gVarA2 = g.a(cursorM.isNull(iE6) ? null : cursorM.getBlob(iE6));
                    long j = cursorM.getLong(iE7);
                    long j10 = cursorM.getLong(iE8);
                    long j11 = cursorM.getLong(iE9);
                    int i11 = cursorM.getInt(iE10);
                    int iE28 = b.E(cursorM.getInt(iE11));
                    long j12 = cursorM.getLong(iE12);
                    long j13 = cursorM.getLong(iE13);
                    int i12 = i10;
                    long j14 = cursorM.getLong(i12);
                    int i13 = iE13;
                    int i14 = iE15;
                    long j15 = cursorM.getLong(i14);
                    iE15 = i14;
                    int i15 = iE16;
                    boolean z6 = cursorM.getInt(i15) != 0;
                    iE16 = i15;
                    int i16 = iE17;
                    int iG = b.G(cursorM.getInt(i16));
                    iE17 = i16;
                    int i17 = iE18;
                    int i18 = cursorM.getInt(i17);
                    iE18 = i17;
                    int i19 = iE19;
                    int i20 = cursorM.getInt(i19);
                    iE19 = i19;
                    int i21 = iE20;
                    int iF = b.F(cursorM.getInt(i21));
                    iE20 = i21;
                    int i22 = iE21;
                    boolean z10 = cursorM.getInt(i22) != 0;
                    iE21 = i22;
                    int i23 = iE22;
                    boolean z11 = cursorM.getInt(i23) != 0;
                    iE22 = i23;
                    int i24 = iE23;
                    boolean z12 = cursorM.getInt(i24) != 0;
                    iE23 = i24;
                    int i25 = iE24;
                    boolean z13 = cursorM.getInt(i25) != 0;
                    iE24 = i25;
                    int i26 = iE25;
                    long j16 = cursorM.getLong(i26);
                    iE25 = i26;
                    int i27 = iE26;
                    long j17 = cursorM.getLong(i27);
                    iE26 = i27;
                    int i28 = iE27;
                    if (!cursorM.isNull(i28)) {
                        blob = cursorM.getBlob(i28);
                    }
                    iE27 = i28;
                    arrayList.add(new o1.o(string, iH, string2, string3, gVarA, gVarA2, j, j10, j11, new d(iF, z10, z11, z12, z13, j16, j17, b.b(blob)), i11, iE28, j12, j13, j14, j15, z6, iG, i18, i20));
                    iE13 = i13;
                    i10 = i12;
                }
                cursorM.close();
                oVar.g();
                ArrayList arrayListC = pVarV.c();
                ArrayList arrayListA = pVarV.a();
                if (arrayList.isEmpty()) {
                    hVar = hVarS;
                    kVar = kVarT;
                    rVar = rVarW;
                } else {
                    q qVarA = q.a();
                    String str = p179s1.b.a;
                    qVarA.b(str, "Recently completed work:\n\n");
                    hVar = hVarS;
                    kVar = kVarT;
                    rVar = rVarW;
                    q.a().b(str, p179s1.b.a(kVar, rVar, hVar, arrayList));
                }
                if (!arrayListC.isEmpty()) {
                    q qVarA2 = q.a();
                    String str2 = p179s1.b.a;
                    qVarA2.b(str2, "Running work:\n\n");
                    q.a().b(str2, p179s1.b.a(kVar, rVar, hVar, arrayListC));
                }
                if (!arrayListA.isEmpty()) {
                    q qVarA3 = q.a();
                    String str3 = p179s1.b.a;
                    qVarA3.b(str3, "Enqueued work:\n\n");
                    q.a().b(str3, p179s1.b.a(kVar, rVar, hVar, arrayListA));
                }
                return p050f1.o.a();
            } catch (Throwable th) {
                th = th;
                cursorM.close();
                oVar.g();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            oVar = oVarC;
        }
    }
}
