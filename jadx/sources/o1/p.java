package o1;

import Q3.u0;
import android.database.Cursor;
import androidx.work.impl.WorkDatabase_Impl;
import com.unity3d.services.core.request.metrics.AdOperationMetric;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class p {
    public final WorkDatabase_Impl a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f13664b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p085i7.d f13665c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p085i7.d f13666d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final p085i7.d f13667e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final p085i7.d f13668f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final p085i7.d f13669g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final p085i7.d f13670h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final p085i7.d f13671i;
    public final p085i7.d j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final p085i7.d f13672k;

    public p(WorkDatabase_Impl workDatabase_Impl) {
        this.a = workDatabase_Impl;
        this.f13664b = new b(workDatabase_Impl, 5);
        new p085i7.b(workDatabase_Impl, 1);
        this.f13665c = new p085i7.d(workDatabase_Impl, 9);
        this.f13666d = new p085i7.d(workDatabase_Impl, 10);
        this.f13667e = new p085i7.d(workDatabase_Impl, 11);
        this.f13668f = new p085i7.d(workDatabase_Impl, 12);
        this.f13669g = new p085i7.d(workDatabase_Impl, 13);
        this.f13670h = new p085i7.d(workDatabase_Impl, 14);
        this.f13671i = new p085i7.d(workDatabase_Impl, 15);
        this.j = new p085i7.d(workDatabase_Impl, 5);
        this.f13672k = new p085i7.d(workDatabase_Impl, 6);
        new p085i7.d(workDatabase_Impl, 7);
        new p085i7.d(workDatabase_Impl, 8);
    }

    public final ArrayList a() throws Throwable {
        K0.o oVar;
        K0.o oVarC = K0.o.c(1, "SELECT * FROM workspec WHERE state=0 ORDER BY last_enqueue_time LIMIT ?");
        oVarC.I(1, 200);
        WorkDatabase_Impl workDatabase_Impl = this.a;
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
            int iE12 = u0.e(cursorM, "backoff_delay_duration");
            int iE13 = u0.e(cursorM, "last_enqueue_time");
            oVar = oVarC;
            try {
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
                    int iH = C3.b.H(cursorM.getInt(iE2));
                    String string2 = cursorM.isNull(iE3) ? null : cursorM.getString(iE3);
                    String string3 = cursorM.isNull(iE4) ? null : cursorM.getString(iE4);
                    p050f1.g gVarA = p050f1.g.a(cursorM.isNull(iE5) ? null : cursorM.getBlob(iE5));
                    p050f1.g gVarA2 = p050f1.g.a(cursorM.isNull(iE6) ? null : cursorM.getBlob(iE6));
                    long j = cursorM.getLong(iE7);
                    long j10 = cursorM.getLong(iE8);
                    long j11 = cursorM.getLong(iE9);
                    int i11 = cursorM.getInt(iE10);
                    int iE28 = C3.b.E(cursorM.getInt(iE11));
                    long j12 = cursorM.getLong(iE12);
                    long j13 = cursorM.getLong(iE13);
                    int i12 = i10;
                    long j14 = cursorM.getLong(i12);
                    int i13 = iE;
                    int i14 = iE15;
                    long j15 = cursorM.getLong(i14);
                    iE15 = i14;
                    int i15 = iE16;
                    boolean z6 = cursorM.getInt(i15) != 0;
                    iE16 = i15;
                    int i16 = iE17;
                    int iG = C3.b.G(cursorM.getInt(i16));
                    iE17 = i16;
                    int i17 = iE18;
                    int i18 = cursorM.getInt(i17);
                    iE18 = i17;
                    int i19 = iE19;
                    int i20 = cursorM.getInt(i19);
                    iE19 = i19;
                    int i21 = iE20;
                    int iF = C3.b.F(cursorM.getInt(i21));
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
                    arrayList.add(new o(string, iH, string2, string3, gVarA, gVarA2, j, j10, j11, new p050f1.d(iF, z10, z11, z12, z13, j16, j17, C3.b.b(blob)), i11, iE28, j12, j13, j14, j15, z6, iG, i18, i20));
                    iE = i13;
                    i10 = i12;
                }
                cursorM.close();
                oVar.g();
                return arrayList;
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

    public final ArrayList b(int i10) throws Throwable {
        K0.o oVar;
        K0.o oVarC = K0.o.c(1, "SELECT * FROM workspec WHERE state=0 AND schedule_requested_at=-1 ORDER BY last_enqueue_time LIMIT (SELECT MAX(?-COUNT(*), 0) FROM workspec WHERE schedule_requested_at<>-1 AND state NOT IN (2, 3, 5))");
        oVarC.I(1, i10);
        WorkDatabase_Impl workDatabase_Impl = this.a;
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
            int iE12 = u0.e(cursorM, "backoff_delay_duration");
            int iE13 = u0.e(cursorM, "last_enqueue_time");
            oVar = oVarC;
            try {
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
                int i11 = iE14;
                ArrayList arrayList = new ArrayList(cursorM.getCount());
                while (cursorM.moveToNext()) {
                    byte[] blob = null;
                    String string = cursorM.isNull(iE) ? null : cursorM.getString(iE);
                    int iH = C3.b.H(cursorM.getInt(iE2));
                    String string2 = cursorM.isNull(iE3) ? null : cursorM.getString(iE3);
                    String string3 = cursorM.isNull(iE4) ? null : cursorM.getString(iE4);
                    p050f1.g gVarA = p050f1.g.a(cursorM.isNull(iE5) ? null : cursorM.getBlob(iE5));
                    p050f1.g gVarA2 = p050f1.g.a(cursorM.isNull(iE6) ? null : cursorM.getBlob(iE6));
                    long j = cursorM.getLong(iE7);
                    long j10 = cursorM.getLong(iE8);
                    long j11 = cursorM.getLong(iE9);
                    int i12 = cursorM.getInt(iE10);
                    int iE28 = C3.b.E(cursorM.getInt(iE11));
                    long j12 = cursorM.getLong(iE12);
                    long j13 = cursorM.getLong(iE13);
                    int i13 = i11;
                    long j14 = cursorM.getLong(i13);
                    int i14 = iE;
                    int i15 = iE15;
                    long j15 = cursorM.getLong(i15);
                    iE15 = i15;
                    int i16 = iE16;
                    boolean z6 = cursorM.getInt(i16) != 0;
                    iE16 = i16;
                    int i17 = iE17;
                    int iG = C3.b.G(cursorM.getInt(i17));
                    iE17 = i17;
                    int i18 = iE18;
                    int i19 = cursorM.getInt(i18);
                    iE18 = i18;
                    int i20 = iE19;
                    int i21 = cursorM.getInt(i20);
                    iE19 = i20;
                    int i22 = iE20;
                    int iF = C3.b.F(cursorM.getInt(i22));
                    iE20 = i22;
                    int i23 = iE21;
                    boolean z10 = cursorM.getInt(i23) != 0;
                    iE21 = i23;
                    int i24 = iE22;
                    boolean z11 = cursorM.getInt(i24) != 0;
                    iE22 = i24;
                    int i25 = iE23;
                    boolean z12 = cursorM.getInt(i25) != 0;
                    iE23 = i25;
                    int i26 = iE24;
                    boolean z13 = cursorM.getInt(i26) != 0;
                    iE24 = i26;
                    int i27 = iE25;
                    long j16 = cursorM.getLong(i27);
                    iE25 = i27;
                    int i28 = iE26;
                    long j17 = cursorM.getLong(i28);
                    iE26 = i28;
                    int i29 = iE27;
                    if (!cursorM.isNull(i29)) {
                        blob = cursorM.getBlob(i29);
                    }
                    iE27 = i29;
                    arrayList.add(new o(string, iH, string2, string3, gVarA, gVarA2, j, j10, j11, new p050f1.d(iF, z10, z11, z12, z13, j16, j17, C3.b.b(blob)), i12, iE28, j12, j13, j14, j15, z6, iG, i19, i21));
                    iE = i14;
                    i11 = i13;
                }
                cursorM.close();
                oVar.g();
                return arrayList;
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

    public final ArrayList c() throws Throwable {
        K0.o oVar;
        K0.o oVarC = K0.o.c(0, "SELECT * FROM workspec WHERE state=1");
        WorkDatabase_Impl workDatabase_Impl = this.a;
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
            int iE12 = u0.e(cursorM, "backoff_delay_duration");
            int iE13 = u0.e(cursorM, "last_enqueue_time");
            oVar = oVarC;
            try {
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
                    int iH = C3.b.H(cursorM.getInt(iE2));
                    String string2 = cursorM.isNull(iE3) ? null : cursorM.getString(iE3);
                    String string3 = cursorM.isNull(iE4) ? null : cursorM.getString(iE4);
                    p050f1.g gVarA = p050f1.g.a(cursorM.isNull(iE5) ? null : cursorM.getBlob(iE5));
                    p050f1.g gVarA2 = p050f1.g.a(cursorM.isNull(iE6) ? null : cursorM.getBlob(iE6));
                    long j = cursorM.getLong(iE7);
                    long j10 = cursorM.getLong(iE8);
                    long j11 = cursorM.getLong(iE9);
                    int i11 = cursorM.getInt(iE10);
                    int iE28 = C3.b.E(cursorM.getInt(iE11));
                    long j12 = cursorM.getLong(iE12);
                    long j13 = cursorM.getLong(iE13);
                    int i12 = i10;
                    long j14 = cursorM.getLong(i12);
                    int i13 = iE;
                    int i14 = iE15;
                    long j15 = cursorM.getLong(i14);
                    iE15 = i14;
                    int i15 = iE16;
                    boolean z6 = cursorM.getInt(i15) != 0;
                    iE16 = i15;
                    int i16 = iE17;
                    int iG = C3.b.G(cursorM.getInt(i16));
                    iE17 = i16;
                    int i17 = iE18;
                    int i18 = cursorM.getInt(i17);
                    iE18 = i17;
                    int i19 = iE19;
                    int i20 = cursorM.getInt(i19);
                    iE19 = i19;
                    int i21 = iE20;
                    int iF = C3.b.F(cursorM.getInt(i21));
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
                    arrayList.add(new o(string, iH, string2, string3, gVarA, gVarA2, j, j10, j11, new p050f1.d(iF, z10, z11, z12, z13, j16, j17, C3.b.b(blob)), i11, iE28, j12, j13, j14, j15, z6, iG, i18, i20));
                    iE = i13;
                    i10 = i12;
                }
                cursorM.close();
                oVar.g();
                return arrayList;
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

    public final ArrayList d() {
        K0.o oVar;
        K0.o oVarC = K0.o.c(0, "SELECT * FROM workspec WHERE state=0 AND schedule_requested_at<>-1");
        WorkDatabase_Impl workDatabase_Impl = this.a;
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
            int iE12 = u0.e(cursorM, "backoff_delay_duration");
            int iE13 = u0.e(cursorM, "last_enqueue_time");
            oVar = oVarC;
            try {
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
                    int iH = C3.b.H(cursorM.getInt(iE2));
                    String string2 = cursorM.isNull(iE3) ? null : cursorM.getString(iE3);
                    String string3 = cursorM.isNull(iE4) ? null : cursorM.getString(iE4);
                    p050f1.g gVarA = p050f1.g.a(cursorM.isNull(iE5) ? null : cursorM.getBlob(iE5));
                    p050f1.g gVarA2 = p050f1.g.a(cursorM.isNull(iE6) ? null : cursorM.getBlob(iE6));
                    long j = cursorM.getLong(iE7);
                    long j10 = cursorM.getLong(iE8);
                    long j11 = cursorM.getLong(iE9);
                    int i11 = cursorM.getInt(iE10);
                    int iE28 = C3.b.E(cursorM.getInt(iE11));
                    long j12 = cursorM.getLong(iE12);
                    long j13 = cursorM.getLong(iE13);
                    int i12 = i10;
                    long j14 = cursorM.getLong(i12);
                    int i13 = iE;
                    int i14 = iE15;
                    long j15 = cursorM.getLong(i14);
                    iE15 = i14;
                    int i15 = iE16;
                    boolean z6 = cursorM.getInt(i15) != 0;
                    iE16 = i15;
                    int i16 = iE17;
                    int iG = C3.b.G(cursorM.getInt(i16));
                    iE17 = i16;
                    int i17 = iE18;
                    int i18 = cursorM.getInt(i17);
                    iE18 = i17;
                    int i19 = iE19;
                    int i20 = cursorM.getInt(i19);
                    iE19 = i19;
                    int i21 = iE20;
                    int iF = C3.b.F(cursorM.getInt(i21));
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
                    arrayList.add(new o(string, iH, string2, string3, gVarA, gVarA2, j, j10, j11, new p050f1.d(iF, z10, z11, z12, z13, j16, j17, C3.b.b(blob)), i11, iE28, j12, j13, j14, j15, z6, iG, i18, i20));
                    iE = i13;
                    i10 = i12;
                }
                cursorM.close();
                oVar.g();
                return arrayList;
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

    public final int e(String str) {
        K0.o oVarC = K0.o.c(1, "SELECT state FROM workspec WHERE id=?");
        if (str == null) {
            oVarC.v(1);
        } else {
            oVarC.m(1, str);
        }
        WorkDatabase_Impl workDatabase_Impl = this.a;
        workDatabase_Impl.b();
        Cursor cursorM = workDatabase_Impl.m(oVarC);
        try {
            int iH = 0;
            if (cursorM.moveToFirst()) {
                Integer numValueOf = cursorM.isNull(0) ? null : Integer.valueOf(cursorM.getInt(0));
                if (numValueOf != null) {
                    iH = C3.b.H(numValueOf.intValue());
                }
            }
            return iH;
        } finally {
            cursorM.close();
            oVarC.g();
        }
    }

    public final ArrayList f(String str) {
        K0.o oVarC = K0.o.c(1, "SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM workname WHERE name=?)");
        if (str == null) {
            oVarC.v(1);
        } else {
            oVarC.m(1, str);
        }
        WorkDatabase_Impl workDatabase_Impl = this.a;
        workDatabase_Impl.b();
        Cursor cursorM = workDatabase_Impl.m(oVarC);
        try {
            ArrayList arrayList = new ArrayList(cursorM.getCount());
            while (cursorM.moveToNext()) {
                arrayList.add(cursorM.isNull(0) ? null : cursorM.getString(0));
            }
            return arrayList;
        } finally {
            cursorM.close();
            oVarC.g();
        }
    }

    public final o g(String str) {
        K0.o oVar;
        K0.o oVarC = K0.o.c(1, "SELECT * FROM workspec WHERE id=?");
        if (str == null) {
            oVarC.v(1);
        } else {
            oVarC.m(1, str);
        }
        WorkDatabase_Impl workDatabase_Impl = this.a;
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
            int iE12 = u0.e(cursorM, "backoff_delay_duration");
            int iE13 = u0.e(cursorM, "last_enqueue_time");
            oVar = oVarC;
            try {
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
                o oVar2 = null;
                byte[] blob = null;
                if (cursorM.moveToFirst()) {
                    String string = cursorM.isNull(iE) ? null : cursorM.getString(iE);
                    int iH = C3.b.H(cursorM.getInt(iE2));
                    String string2 = cursorM.isNull(iE3) ? null : cursorM.getString(iE3);
                    String string3 = cursorM.isNull(iE4) ? null : cursorM.getString(iE4);
                    p050f1.g gVarA = p050f1.g.a(cursorM.isNull(iE5) ? null : cursorM.getBlob(iE5));
                    p050f1.g gVarA2 = p050f1.g.a(cursorM.isNull(iE6) ? null : cursorM.getBlob(iE6));
                    long j = cursorM.getLong(iE7);
                    long j10 = cursorM.getLong(iE8);
                    long j11 = cursorM.getLong(iE9);
                    int i10 = cursorM.getInt(iE10);
                    int iE28 = C3.b.E(cursorM.getInt(iE11));
                    long j12 = cursorM.getLong(iE12);
                    long j13 = cursorM.getLong(iE13);
                    long j14 = cursorM.getLong(iE14);
                    long j15 = cursorM.getLong(iE15);
                    boolean z6 = cursorM.getInt(iE16) != 0;
                    int iG = C3.b.G(cursorM.getInt(iE17));
                    int i11 = cursorM.getInt(iE18);
                    int i12 = cursorM.getInt(iE19);
                    int iF = C3.b.F(cursorM.getInt(iE20));
                    boolean z10 = cursorM.getInt(iE21) != 0;
                    boolean z11 = cursorM.getInt(iE22) != 0;
                    boolean z12 = cursorM.getInt(iE23) != 0;
                    boolean z13 = cursorM.getInt(iE24) != 0;
                    long j16 = cursorM.getLong(iE25);
                    long j17 = cursorM.getLong(iE26);
                    if (!cursorM.isNull(iE27)) {
                        blob = cursorM.getBlob(iE27);
                    }
                    oVar2 = new o(string, iH, string2, string3, gVarA, gVarA2, j, j10, j11, new p050f1.d(iF, z10, z11, z12, z13, j16, j17, C3.b.b(blob)), i10, iE28, j12, j13, j14, j15, z6, iG, i11, i12);
                }
                cursorM.close();
                oVar.g();
                return oVar2;
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

    public final void h(String str, long j) {
        WorkDatabase_Impl workDatabase_Impl = this.a;
        workDatabase_Impl.b();
        p085i7.d dVar = this.j;
        P0.j jVarA = dVar.a();
        jVarA.I(1, j);
        if (str == null) {
            jVarA.v(2);
        } else {
            jVarA.m(2, str);
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

    public final void i(String str, long j) {
        WorkDatabase_Impl workDatabase_Impl = this.a;
        workDatabase_Impl.b();
        p085i7.d dVar = this.f13669g;
        P0.j jVarA = dVar.a();
        jVarA.I(1, j);
        if (str == null) {
            jVarA.v(2);
        } else {
            jVarA.m(2, str);
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

    public final void j(String str, p050f1.g gVar) throws Throwable {
        WorkDatabase_Impl workDatabase_Impl = this.a;
        workDatabase_Impl.b();
        p085i7.d dVar = this.f13668f;
        P0.j jVarA = dVar.a();
        byte[] bArrC = p050f1.g.c(gVar);
        if (bArrC == null) {
            jVarA.v(1);
        } else {
            jVarA.M(1, bArrC);
        }
        if (str == null) {
            jVarA.v(2);
        } else {
            jVarA.m(2, str);
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

    public final void k(int i10, String str) {
        WorkDatabase_Impl workDatabase_Impl = this.a;
        workDatabase_Impl.b();
        p085i7.d dVar = this.f13666d;
        P0.j jVarA = dVar.a();
        jVarA.I(1, C3.b.O(i10));
        if (str == null) {
            jVarA.v(2);
        } else {
            jVarA.m(2, str);
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
}
