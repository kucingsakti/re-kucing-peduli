package p080i1;

import C3.a;
import M2.O;
import P0.j;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.datastore.preferences.protobuf.AbstractC0487g;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkDatabase_Impl;
import androidx.work.impl.background.systemalarm.ConstraintProxyUpdateReceiver;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import com.google.android.gms.internal.measurement.S;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import o1.g;
import o1.h;
import o1.i;
import o1.o;
import p050f1.d;
import p050f1.q;

/* JADX INFO: loaded from: classes.dex */
public final class c implements p061g1.c {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final String f12127w = q.c("CommandHandler");

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Context f12128s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final HashMap f12129t = new HashMap();

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final Object f12130u = new Object();

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final S f12131v;

    public c(Context context, S s9) {
        this.f12128s = context;
        this.f12131v = s9;
    }

    public static i c(Intent intent) {
        return new i(intent.getStringExtra("KEY_WORKSPEC_ID"), intent.getIntExtra("KEY_WORKSPEC_GENERATION", 0));
    }

    public static void d(Intent intent, i iVar) {
        intent.putExtra("KEY_WORKSPEC_ID", iVar.a);
        intent.putExtra("KEY_WORKSPEC_GENERATION", iVar.f13636b);
    }

    public final boolean a() {
        boolean z6;
        synchronized (this.f12130u) {
            z6 = !this.f12129t.isEmpty();
        }
        return z6;
    }

    public final void b(Intent intent, int i10, i iVar) {
        List<p061g1.i> listW;
        ArrayList arrayList;
        int i11 = 3;
        String action = intent.getAction();
        if ("ACTION_CONSTRAINTS_CHANGED".equals(action)) {
            q qVarA = q.a();
            Objects.toString(intent);
            qVarA.getClass();
            e eVar = new e(this.f12128s, i10, iVar);
            ArrayList<o> arrayListD = iVar.f12156w.f11499c.v().d();
            int i12 = d.a;
            Iterator it = arrayListD.iterator();
            boolean z6 = false;
            boolean z10 = false;
            boolean z11 = false;
            boolean z12 = false;
            while (it.hasNext()) {
                d dVar = ((o) it.next()).j;
                z6 |= dVar.f11399d;
                z10 |= dVar.f11397b;
                z11 |= dVar.f11400e;
                z12 |= dVar.a != 1;
                if (z6 && z10 && z11 && z12) {
                    break;
                }
            }
            int i13 = ConstraintProxyUpdateReceiver.a;
            Intent intent2 = new Intent("androidx.work.impl.background.systemalarm.UpdateProxies");
            Context context = eVar.a;
            intent2.setComponent(new ComponentName(context, (Class<?>) ConstraintProxyUpdateReceiver.class));
            intent2.putExtra("KEY_BATTERY_NOT_LOW_PROXY_ENABLED", z6).putExtra("KEY_BATTERY_CHARGING_PROXY_ENABLED", z10).putExtra("KEY_STORAGE_NOT_LOW_PROXY_ENABLED", z11).putExtra("KEY_NETWORK_STATE_PROXY_ENABLED", z12);
            context.sendBroadcast(intent2);
            Y1.c cVar = eVar.f12133c;
            cVar.K(arrayListD);
            ArrayList<o> arrayList2 = new ArrayList(arrayListD.size());
            long jCurrentTimeMillis = System.currentTimeMillis();
            for (o oVar : arrayListD) {
                String str = oVar.a;
                if (jCurrentTimeMillis >= oVar.a() && (!oVar.b() || cVar.j(str))) {
                    arrayList2.add(oVar);
                }
            }
            for (o oVar2 : arrayList2) {
                String str2 = oVar2.a;
                i iVarG = a.g(oVar2);
                Intent intent3 = new Intent(context, (Class<?>) SystemAlarmService.class);
                intent3.setAction("ACTION_DELAY_MET");
                d(intent3, iVarG);
                q.a().getClass();
                ((O) iVar.f12153t.f5672v).execute(new X2.a(iVar, intent3, eVar.f12132b, i11));
            }
            cVar.L();
            return;
        }
        if ("ACTION_RESCHEDULE".equals(action)) {
            q qVarA2 = q.a();
            Objects.toString(intent);
            qVarA2.getClass();
            iVar.f12156w.e();
            return;
        }
        Bundle extras = intent.getExtras();
        String[] strArr = {"KEY_WORKSPEC_ID"};
        if (extras == null || extras.isEmpty() || extras.get(strArr[0]) == null) {
            q.a().getClass();
            return;
        }
        if ("ACTION_SCHEDULE_WORK".equals(action)) {
            i iVarC = c(intent);
            q qVarA3 = q.a();
            iVarC.toString();
            qVarA3.getClass();
            WorkDatabase workDatabase = iVar.f12156w.f11499c;
            workDatabase.c();
            try {
                o oVarG = workDatabase.v().g(iVarC.a);
                String str3 = f12127w;
                if (oVarG == null) {
                    q.a().d(str3, "Skipping scheduling " + iVarC + " because it's no longer in the DB");
                    return;
                }
                if (AbstractC0487g.b(oVarG.f13646b)) {
                    q.a().d(str3, "Skipping scheduling " + iVarC + "because it is finished.");
                    return;
                }
                long jA = oVarG.a();
                boolean zB = oVarG.b();
                Context context2 = this.f12128s;
                if (zB) {
                    q qVarA4 = q.a();
                    iVarC.toString();
                    qVarA4.getClass();
                    b.b(context2, workDatabase, iVarC, jA);
                    Intent intent4 = new Intent(context2, (Class<?>) SystemAlarmService.class);
                    intent4.setAction("ACTION_CONSTRAINTS_CHANGED");
                    ((O) iVar.f12153t.f5672v).execute(new X2.a(iVar, intent4, i10, i11));
                } else {
                    q qVarA5 = q.a();
                    iVarC.toString();
                    qVarA5.getClass();
                    b.b(context2, workDatabase, iVarC, jA);
                }
                workDatabase.o();
                return;
            } finally {
                workDatabase.j();
            }
        }
        if ("ACTION_DELAY_MET".equals(action)) {
            synchronized (this.f12130u) {
                try {
                    i iVarC2 = c(intent);
                    q qVarA6 = q.a();
                    iVarC2.toString();
                    qVarA6.getClass();
                    if (this.f12129t.containsKey(iVarC2)) {
                        q qVarA7 = q.a();
                        iVarC2.toString();
                        qVarA7.getClass();
                    } else {
                        g gVar = new g(this.f12128s, i10, iVar, this.f12131v.x(iVarC2));
                        this.f12129t.put(iVarC2, gVar);
                        gVar.e();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return;
        }
        if (!"ACTION_STOP_WORK".equals(action)) {
            if (!"ACTION_EXECUTION_COMPLETED".equals(action)) {
                q.a().d(f12127w, "Ignoring intent " + intent);
                return;
            }
            i iVarC3 = c(intent);
            boolean z13 = intent.getExtras().getBoolean("KEY_NEEDS_RESCHEDULE");
            q qVarA8 = q.a();
            intent.toString();
            qVarA8.getClass();
            f(iVarC3, z13);
            return;
        }
        Bundle extras2 = intent.getExtras();
        String string = extras2.getString("KEY_WORKSPEC_ID");
        boolean zContainsKey = extras2.containsKey("KEY_WORKSPEC_GENERATION");
        S s9 = this.f12131v;
        if (zContainsKey) {
            int i14 = extras2.getInt("KEY_WORKSPEC_GENERATION");
            arrayList = new ArrayList(1);
            p061g1.i iVarV = s9.v(new i(string, i14));
            if (iVarV != null) {
                listW = arrayList;
                arrayList.add(iVarV);
                listW = arrayList;
            }
        } else {
            listW = s9.w(string);
        }
        listW = arrayList;
        for (p061g1.i iVar2 : listW) {
            q.a().getClass();
            iVar.f12156w.g(iVar2);
            WorkDatabase workDatabase2 = iVar.f12156w.f11499c;
            i iVar3 = iVar2.a;
            int i15 = b.a;
            h hVarS = workDatabase2.s();
            g gVarH = hVarS.h(iVar3);
            if (gVarH != null) {
                b.a(this.f12128s, iVar3, gVarH.f13630c);
                q qVarA9 = q.a();
                iVar3.toString();
                qVarA9.getClass();
                WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) hVarS.f13632s;
                workDatabase_Impl.b();
                p085i7.d dVar2 = (p085i7.d) hVarS.f13634u;
                j jVarA = dVar2.a();
                String str4 = iVar3.a;
                if (str4 == null) {
                    jVarA.v(1);
                } else {
                    jVarA.m(1, str4);
                }
                jVarA.I(2, iVar3.f13636b);
                workDatabase_Impl.c();
                try {
                    jVarA.a();
                    workDatabase_Impl.o();
                    workDatabase_Impl.j();
                    dVar2.e(jVarA);
                } catch (Throwable th2) {
                    workDatabase_Impl.j();
                    dVar2.e(jVarA);
                    throw th2;
                }
            }
            iVar.f(iVar2.a, false);
        }
    }

    @Override // p061g1.c
    public final void f(i iVar, boolean z6) {
        synchronized (this.f12130u) {
            try {
                g gVar = (g) this.f12129t.remove(iVar);
                this.f12131v.v(iVar);
                if (gVar != null) {
                    gVar.f(z6);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
