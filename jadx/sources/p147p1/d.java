package p147p1;

import C3.b;
import android.database.Cursor;
import android.os.Build;
import android.text.TextUtils;
import androidx.datastore.preferences.protobuf.AbstractC0487g;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkDatabase_Impl;
import androidx.work.impl.background.systemalarm.RescheduleReceiver;
import androidx.work.impl.workers.ConstraintTrackingWorker;
import com.unity3d.services.core.request.metrics.AdOperationMetric;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.UUID;
import o1.a;
import o1.c;
import o1.k;
import o1.n;
import o1.o;
import o1.p;
import o1.r;
import p050f1.g;
import p050f1.q;
import p050f1.s;
import p050f1.v;
import p061g1.h;
import p061g1.j;
import p210v8.i;

/* JADX INFO: loaded from: classes.dex */
public final class d implements Runnable {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final j f14171s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final r f14172t;

    static {
        q.c("EnqueueRunnable");
    }

    public d(j jVar) {
        r rVar = new r(13);
        this.f14171s = jVar;
        this.f14172t = rVar;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x024d  */
    /* JADX WARN: Code duplicated, block: B:107:0x026e  */
    /* JADX WARN: Code duplicated, block: B:109:0x0272  */
    /* JADX WARN: Code duplicated, block: B:118:0x02c2  */
    /* JADX WARN: Code duplicated, block: B:125:0x02ec  */
    /* JADX WARN: Code duplicated, block: B:162:0x0319 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:79:0x0161  */
    /* JADX WARN: Code duplicated, block: B:88:0x0180  */
    /* JADX WARN: Code duplicated, block: B:91:0x0189  */
    /* JADX WARN: Code duplicated, block: B:94:0x019b  */
    /* JADX WARN: Instruction removed from duplicated block: B:107:0x026e, please report this as an issue */
    public static boolean a(j jVar) throws Throwable {
        boolean z6;
        boolean z10;
        boolean z11;
        WorkDatabase workDatabase;
        boolean z12;
        boolean z13;
        boolean z14;
        Iterator it;
        boolean z15;
        boolean z16;
        o oVar;
        long j;
        WorkDatabase_Impl workDatabase_Impl;
        UUID uuid;
        r rVarW;
        String string;
        Iterator it2;
        WorkDatabase_Impl workDatabase_Impl2;
        WorkDatabase_Impl workDatabase_Impl3;
        int i10;
        WorkDatabase_Impl workDatabase_Impl4;
        String name;
        String str;
        jVar.getClass();
        String[] strArr = (String[]) j.t(jVar).toArray(new String[0]);
        long jCurrentTimeMillis = System.currentTimeMillis();
        p061g1.o oVar2 = jVar.a;
        WorkDatabase workDatabase2 = oVar2.f11499c;
        boolean z17 = strArr != null && strArr.length > 0;
        if (z17) {
            int length = strArr.length;
            int i11 = 0;
            z10 = false;
            z11 = false;
            z6 = true;
            while (true) {
                if (i11 < length) {
                    o oVarG = workDatabase2.v().g(strArr[i11]);
                    if (oVarG == null) {
                        q.a().getClass();
                    } else {
                        int i12 = oVarG.f13646b;
                        z6 &= i12 == 3;
                        if (i12 == 4) {
                            z11 = true;
                        } else if (i12 == 6) {
                            z10 = true;
                        }
                        i11++;
                    }
                }
                z16 = false;
                jVar.f11490f = true;
                return z16;
            }
        }
        z6 = true;
        z10 = false;
        z11 = false;
        String str2 = jVar.f11486b;
        boolean zIsEmpty = TextUtils.isEmpty(str2);
        if (!zIsEmpty && !z17) {
            p pVarV = workDatabase2.v();
            pVarV.getClass();
            K0.o oVarC = K0.o.c(1, "SELECT id, state FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=?)");
            if (str2 == null) {
                oVarC.v(1);
            } else {
                oVarC.m(1, str2);
            }
            WorkDatabase_Impl workDatabase_Impl5 = pVarV.a;
            workDatabase_Impl5.b();
            Cursor cursorM = workDatabase_Impl5.m(oVarC);
            try {
                ArrayList arrayList = new ArrayList(cursorM.getCount());
                while (cursorM.moveToNext()) {
                    String string2 = cursorM.isNull(0) ? null : cursorM.getString(0);
                    WorkDatabase workDatabase3 = workDatabase2;
                    int iH = b.H(cursorM.getInt(1));
                    boolean z18 = zIsEmpty;
                    boolean z19 = z17;
                    i.f(string2, "id");
                    n nVar = new n();
                    nVar.a = string2;
                    nVar.f13645b = iH;
                    arrayList.add(nVar);
                    workDatabase2 = workDatabase3;
                    zIsEmpty = z18;
                    z17 = z19;
                }
                workDatabase = workDatabase2;
                z12 = zIsEmpty;
                z13 = z17;
                cursorM.close();
                oVarC.g();
                if (!arrayList.isEmpty()) {
                    Iterator it3 = arrayList.iterator();
                    while (true) {
                        if (it3.hasNext()) {
                            int i13 = ((n) it3.next()).f13645b;
                            if (i13 == 1 || i13 == 2) {
                                z16 = false;
                                jVar.f11490f = true;
                                return z16;
                            }
                        } else {
                            new b(oVar2, str2, 1).run();
                            p pVarV2 = workDatabase.v();
                            Iterator it4 = arrayList.iterator();
                            while (it4.hasNext()) {
                                String str3 = ((n) it4.next()).a;
                                WorkDatabase_Impl workDatabase_Impl6 = pVarV2.a;
                                workDatabase_Impl6.b();
                                p085i7.d dVar = pVarV2.f13665c;
                                P0.j jVarA = dVar.a();
                                if (str3 == null) {
                                    jVarA.v(1);
                                } else {
                                    jVarA.m(1, str3);
                                }
                                workDatabase_Impl6.c();
                                try {
                                    jVarA.a();
                                    workDatabase_Impl6.o();
                                    workDatabase_Impl6.j();
                                    dVar.e(jVarA);
                                } catch (Throwable th) {
                                    workDatabase_Impl6.j();
                                    dVar.e(jVarA);
                                    throw th;
                                }
                            }
                            z14 = true;
                        }
                    }
                }
                it = jVar.f11487c.iterator();
                z15 = z14;
                while (it.hasNext()) {
                    p050f1.r rVar = (p050f1.r) it.next();
                    oVar = rVar.f11418b;
                    if (z13 || z6) {
                        oVar.f13657n = jCurrentTimeMillis;
                    } else if (z11) {
                        oVar.f13646b = 4;
                    } else if (z10) {
                        oVar.f13646b = 6;
                    } else {
                        oVar.f13646b = 5;
                    }
                    if (oVar.f13646b == 1) {
                        z15 = true;
                    }
                    p pVarV3 = workDatabase.v();
                    i.f(oVar2.f11501e, "schedulers");
                    try {
                        if (Build.VERSION.SDK_INT < 26) {
                            p050f1.d dVar2 = oVar.j;
                            j = jCurrentTimeMillis;
                            name = ConstraintTrackingWorker.class.getName();
                            str = oVar.f13647c;
                            if (i.a(str, name) && (dVar2.f11399d || dVar2.f11400e)) {
                                Fa.d dVar3 = new Fa.d(1);
                                dVar3.a(oVar.f13649e.a);
                                dVar3.a.put("androidx.work.impl.workers.ConstraintTrackingWorker.ARGUMENT_CLASS_NAME", str);
                                g gVar = new g(dVar3.a);
                                g.c(gVar);
                                String name2 = ConstraintTrackingWorker.class.getName();
                                int i14 = oVar.f13646b;
                                String str4 = oVar.f13648d;
                                long j10 = oVar.f13651g;
                                p050f1.d dVar4 = oVar.j;
                                long j11 = oVar.f13657n;
                                boolean z20 = oVar.f13660q;
                                String str5 = oVar.a;
                                i.f(str5, "id");
                                AbstractC0487g.p(i14, AdOperationMetric.INIT_STATE);
                                g gVar2 = oVar.f13650f;
                                i.f(gVar2, "output");
                                i.f(dVar4, "constraints");
                                int i15 = oVar.f13655l;
                                AbstractC0487g.p(i15, "backoffPolicy");
                                int i16 = oVar.f13661r;
                                AbstractC0487g.p(i16, "outOfQuotaPolicy");
                                oVar = new o(str5, i14, name2, str4, gVar, gVar2, j10, oVar.f13652h, oVar.f13653i, dVar4, oVar.f13654k, i15, oVar.f13656m, j11, oVar.f13658o, oVar.f13659p, z20, i16, oVar.f13662s, oVar.f13663t);
                            }
                            workDatabase_Impl = pVarV3.a;
                            workDatabase_Impl.b();
                            workDatabase_Impl.c();
                            pVarV3.f13664b.h(oVar);
                            workDatabase_Impl.o();
                            workDatabase_Impl.j();
                            uuid = rVar.a;
                            if (z13) {
                                for (String str6 : strArr) {
                                    String string3 = uuid.toString();
                                    i.e(string3, "id.toString()");
                                    a aVar = new a(string3, str6);
                                    c cVarQ = workDatabase.q();
                                    workDatabase_Impl4 = (WorkDatabase_Impl) cVarQ.f13623t;
                                    workDatabase_Impl4.b();
                                    workDatabase_Impl4.c();
                                    try {
                                        ((o1.b) cVarQ.f13624u).h(aVar);
                                        workDatabase_Impl4.o();
                                        workDatabase_Impl4.j();
                                    } catch (Throwable th2) {
                                        workDatabase_Impl4.j();
                                        throw th2;
                                    }
                                }
                            }
                            rVarW = workDatabase.w();
                            string = uuid.toString();
                            i.e(string, "id.toString()");
                            rVarW.getClass();
                            Set set = rVar.f11419c;
                            i.f(set, "tags");
                            it2 = set.iterator();
                            while (it2.hasNext()) {
                                o1.q qVar = new o1.q((String) it2.next(), string);
                                workDatabase_Impl3 = (WorkDatabase_Impl) rVarW.f13675t;
                                workDatabase_Impl3.b();
                                workDatabase_Impl3.c();
                                try {
                                    ((o1.b) rVarW.f13676u).h(qVar);
                                    workDatabase_Impl3.o();
                                    workDatabase_Impl3.j();
                                } catch (Throwable th3) {
                                    workDatabase_Impl3.j();
                                    throw th3;
                                }
                            }
                            if (!z12) {
                                k kVarT = workDatabase.t();
                                String string4 = uuid.toString();
                                i.e(string4, "id.toString()");
                                o1.j jVar2 = new o1.j(str2, string4);
                                workDatabase_Impl2 = (WorkDatabase_Impl) kVarT.f13638s;
                                workDatabase_Impl2.b();
                                workDatabase_Impl2.c();
                                try {
                                    ((o1.b) kVarT.f13639t).h(jVar2);
                                    workDatabase_Impl2.o();
                                    workDatabase_Impl2.j();
                                } catch (Throwable th4) {
                                    workDatabase_Impl2.j();
                                    throw th4;
                                }
                            }
                            oVar2 = oVar2;
                            jCurrentTimeMillis = j;
                            it = it;
                            z15 = z15;
                        } else {
                            j = jCurrentTimeMillis;
                        }
                        pVarV3.f13664b.h(oVar);
                        workDatabase_Impl.o();
                        workDatabase_Impl.j();
                        uuid = rVar.a;
                        if (z13) {
                            while (i10 < r5) {
                                String string5 = uuid.toString();
                                i.e(string5, "id.toString()");
                                a aVar2 = new a(string5, str6);
                                c cVarQ2 = workDatabase.q();
                                workDatabase_Impl4 = (WorkDatabase_Impl) cVarQ2.f13623t;
                                workDatabase_Impl4.b();
                                workDatabase_Impl4.c();
                                ((o1.b) cVarQ2.f13624u).h(aVar2);
                                workDatabase_Impl4.o();
                                workDatabase_Impl4.j();
                            }
                        }
                        rVarW = workDatabase.w();
                        string = uuid.toString();
                        i.e(string, "id.toString()");
                        rVarW.getClass();
                        Set set2 = rVar.f11419c;
                        i.f(set2, "tags");
                        it2 = set2.iterator();
                        while (it2.hasNext()) {
                            o1.q qVar2 = new o1.q((String) it2.next(), string);
                            workDatabase_Impl3 = (WorkDatabase_Impl) rVarW.f13675t;
                            workDatabase_Impl3.b();
                            workDatabase_Impl3.c();
                            ((o1.b) rVarW.f13676u).h(qVar2);
                            workDatabase_Impl3.o();
                            workDatabase_Impl3.j();
                        }
                        if (!z12) {
                            k kVarT2 = workDatabase.t();
                            String string6 = uuid.toString();
                            i.e(string6, "id.toString()");
                            o1.j jVar3 = new o1.j(str2, string6);
                            workDatabase_Impl2 = (WorkDatabase_Impl) kVarT2.f13638s;
                            workDatabase_Impl2.b();
                            workDatabase_Impl2.c();
                            ((o1.b) kVarT2.f13639t).h(jVar3);
                            workDatabase_Impl2.o();
                            workDatabase_Impl2.j();
                        }
                        oVar2 = oVar2;
                        jCurrentTimeMillis = j;
                        it = it;
                        z15 = z15;
                    } catch (Throwable th5) {
                        workDatabase_Impl.j();
                        throw th5;
                    }
                    workDatabase_Impl = pVarV3.a;
                    workDatabase_Impl.b();
                    workDatabase_Impl.c();
                }
                z16 = z15;
                jVar.f11490f = true;
                return z16;
            } catch (Throwable th6) {
                cursorM.close();
                oVarC.g();
                throw th6;
            }
        }
        workDatabase = workDatabase2;
        z12 = zIsEmpty;
        z13 = z17;
        z14 = false;
        it = jVar.f11487c.iterator();
        z15 = z14;
        while (it.hasNext()) {
            p050f1.r rVar2 = (p050f1.r) it.next();
            oVar = rVar2.f11418b;
            if (z13) {
                oVar.f13657n = jCurrentTimeMillis;
            } else {
                oVar.f13657n = jCurrentTimeMillis;
            }
            if (oVar.f13646b == 1) {
                z15 = true;
            }
            p pVarV4 = workDatabase.v();
            i.f(oVar2.f11501e, "schedulers");
            if (Build.VERSION.SDK_INT < 26) {
                p050f1.d dVar5 = oVar.j;
                j = jCurrentTimeMillis;
                name = ConstraintTrackingWorker.class.getName();
                str = oVar.f13647c;
                if (i.a(str, name)) {
                }
                workDatabase_Impl = pVarV4.a;
                workDatabase_Impl.b();
                workDatabase_Impl.c();
                pVarV4.f13664b.h(oVar);
                workDatabase_Impl.o();
                workDatabase_Impl.j();
                uuid = rVar2.a;
                if (z13) {
                    while (i10 < r5) {
                        String string7 = uuid.toString();
                        i.e(string7, "id.toString()");
                        a aVar3 = new a(string7, str6);
                        c cVarQ3 = workDatabase.q();
                        workDatabase_Impl4 = (WorkDatabase_Impl) cVarQ3.f13623t;
                        workDatabase_Impl4.b();
                        workDatabase_Impl4.c();
                        ((o1.b) cVarQ3.f13624u).h(aVar3);
                        workDatabase_Impl4.o();
                        workDatabase_Impl4.j();
                    }
                }
                rVarW = workDatabase.w();
                string = uuid.toString();
                i.e(string, "id.toString()");
                rVarW.getClass();
                Set set3 = rVar2.f11419c;
                i.f(set3, "tags");
                it2 = set3.iterator();
                while (it2.hasNext()) {
                    o1.q qVar3 = new o1.q((String) it2.next(), string);
                    workDatabase_Impl3 = (WorkDatabase_Impl) rVarW.f13675t;
                    workDatabase_Impl3.b();
                    workDatabase_Impl3.c();
                    ((o1.b) rVarW.f13676u).h(qVar3);
                    workDatabase_Impl3.o();
                    workDatabase_Impl3.j();
                }
                if (!z12) {
                    k kVarT3 = workDatabase.t();
                    String string8 = uuid.toString();
                    i.e(string8, "id.toString()");
                    o1.j jVar4 = new o1.j(str2, string8);
                    workDatabase_Impl2 = (WorkDatabase_Impl) kVarT3.f13638s;
                    workDatabase_Impl2.b();
                    workDatabase_Impl2.c();
                    ((o1.b) kVarT3.f13639t).h(jVar4);
                    workDatabase_Impl2.o();
                    workDatabase_Impl2.j();
                }
                oVar2 = oVar2;
                jCurrentTimeMillis = j;
                it = it;
                z15 = z15;
            } else {
                j = jCurrentTimeMillis;
            }
            workDatabase_Impl = pVarV4.a;
            workDatabase_Impl.b();
            workDatabase_Impl.c();
            pVarV4.f13664b.h(oVar);
            workDatabase_Impl.o();
            workDatabase_Impl.j();
            uuid = rVar2.a;
            if (z13) {
                while (i10 < r5) {
                    String string9 = uuid.toString();
                    i.e(string9, "id.toString()");
                    a aVar4 = new a(string9, str6);
                    c cVarQ4 = workDatabase.q();
                    workDatabase_Impl4 = (WorkDatabase_Impl) cVarQ4.f13623t;
                    workDatabase_Impl4.b();
                    workDatabase_Impl4.c();
                    ((o1.b) cVarQ4.f13624u).h(aVar4);
                    workDatabase_Impl4.o();
                    workDatabase_Impl4.j();
                }
            }
            rVarW = workDatabase.w();
            string = uuid.toString();
            i.e(string, "id.toString()");
            rVarW.getClass();
            Set set4 = rVar2.f11419c;
            i.f(set4, "tags");
            it2 = set4.iterator();
            while (it2.hasNext()) {
                o1.q qVar4 = new o1.q((String) it2.next(), string);
                workDatabase_Impl3 = (WorkDatabase_Impl) rVarW.f13675t;
                workDatabase_Impl3.b();
                workDatabase_Impl3.c();
                ((o1.b) rVarW.f13676u).h(qVar4);
                workDatabase_Impl3.o();
                workDatabase_Impl3.j();
            }
            if (!z12) {
                k kVarT4 = workDatabase.t();
                String string10 = uuid.toString();
                i.e(string10, "id.toString()");
                o1.j jVar5 = new o1.j(str2, string10);
                workDatabase_Impl2 = (WorkDatabase_Impl) kVarT4.f13638s;
                workDatabase_Impl2.b();
                workDatabase_Impl2.c();
                ((o1.b) kVarT4.f13639t).h(jVar5);
                workDatabase_Impl2.o();
                workDatabase_Impl2.j();
            }
            oVar2 = oVar2;
            jCurrentTimeMillis = j;
            it = it;
            z15 = z15;
        }
        z16 = z15;
        jVar.f11490f = true;
        return z16;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z6;
        r rVar = this.f14172t;
        j jVar = this.f14171s;
        try {
            jVar.getClass();
            HashSet hashSet = new HashSet();
            hashSet.addAll(jVar.f11488d);
            HashSet hashSetT = j.t(jVar);
            Iterator it = hashSet.iterator();
            while (true) {
                if (!it.hasNext()) {
                    hashSet.removeAll(jVar.f11488d);
                    z6 = false;
                    break;
                } else if (hashSetT.contains((String) it.next())) {
                    z6 = true;
                    break;
                }
            }
            if (z6) {
                throw new IllegalStateException("WorkContinuation has cycles (" + jVar + ")");
            }
            p061g1.o oVar = jVar.a;
            WorkDatabase workDatabase = oVar.f11499c;
            workDatabase.c();
            try {
                boolean zA = a(jVar);
                workDatabase.o();
                workDatabase.j();
                if (zA) {
                    j.a(oVar.a, RescheduleReceiver.class, true);
                    h.a(oVar.f11498b, oVar.f11499c, oVar.f11501e);
                }
                rVar.q(v.f11420q);
            } catch (Throwable th) {
                workDatabase.j();
                throw th;
            }
        } catch (Throwable th2) {
            rVar.q(new s(th2));
        }
    }
}
