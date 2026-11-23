package M2;

import android.os.Bundle;
import android.os.RemoteException;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkDatabase_Impl;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.internal.measurement.zzdg;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;
import com.google.android.gms.measurement.internal.zzbd;
import com.google.android.gms.measurement.internal.zzfl;
import com.google.android.gms.measurement.internal.zzhj;
import com.google.android.gms.measurement.internal.zziv;
import com.google.android.gms.measurement.internal.zzkx;
import com.google.android.gms.measurement.internal.zznc;
import com.google.android.gms.measurement.internal.zznp;
import com.google.android.gms.measurement.internal.zzo;
import com.tonyodev.fetch2.Download;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: M2.y, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0315y implements Runnable {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f3164s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f3165t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Object f3166u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Object f3167v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f3168w;

    public RunnableC0315y(J4.c cVar, Download download, h7.b bVar, Exception exc) {
        this.f3164s = 6;
        this.f3166u = cVar;
        this.f3167v = download;
        this.f3165t = bVar;
        this.f3168w = exc;
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:55:0x0199 -> B:91:0x01a0). Please report as a decompilation issue!!! */
    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        byte[] bArrC = null;
        switch (this.f3164s) {
            case 0:
                zzkx zzkxVarR = ((AppMeasurementDynamiteService) this.f3168w).f8881b.r();
                zzkxVarR.W0();
                zzkxVarR.a1();
                int iB = GoogleApiAvailabilityLight.f7833b.b(((zzhj) zzkxVarR.V0().f577s).f9140s, 12451000);
                zzdg zzdgVar = (zzdg) this.f3166u;
                if (iB == 0) {
                    zzkxVarR.f1(new RunnableC0315y(zzkxVarR, (zzbd) this.f3167v, (String) this.f3165t, zzdgVar));
                    return;
                } else {
                    zzkxVarR.i().f9047A.b("Not bundling data. Service unavailable or out of date");
                    zzkxVarR.V0().w1(zzdgVar, new byte[0]);
                    return;
                }
            case 1:
                zzkx zzkxVarR2 = ((zzhj) ((zziv) this.f3168w).f577s).r();
                zzkxVarR2.W0();
                zzkxVarR2.a1();
                zzkxVarR2.f1(new e0(zzkxVarR2, (AtomicReference) this.f3166u, (String) this.f3165t, (String) this.f3167v, zzkxVarR2.p1(false), 0));
                return;
            case 2:
                synchronized (((AtomicReference) this.f3166u)) {
                    try {
                        try {
                            zzkx zzkxVar = (zzkx) this.f3168w;
                            zzfl zzflVar = zzkxVar.f9243v;
                            if (zzflVar == null) {
                                zzkxVar.i().f9056x.b("Failed to get trigger URIs; not connected to service");
                                ((AtomicReference) this.f3166u).notify();
                                return;
                            } else {
                                ((AtomicReference) this.f3166u).set(zzflVar.o((Bundle) this.f3165t, (zzo) this.f3167v));
                                ((zzkx) this.f3168w).o1();
                                ((AtomicReference) this.f3166u).notify();
                                return;
                            }
                        } catch (RemoteException e10) {
                            ((zzkx) this.f3168w).i().f9056x.a(e10, "Failed to get trigger URIs; remote exception");
                            ((AtomicReference) this.f3166u).notify();
                        }
                    } catch (Throwable th) {
                        ((AtomicReference) this.f3166u).notify();
                        throw th;
                    }
                }
                break;
            case 3:
                zzdg zzdgVar2 = (zzdg) this.f3166u;
                zzkx zzkxVar2 = (zzkx) this.f3168w;
                try {
                    try {
                        zzfl zzflVar2 = zzkxVar2.f9243v;
                        if (zzflVar2 == null) {
                            zzkxVar2.i().f9056x.b("Discarding data. Failed to send event to service to bundle");
                            zzkxVar2.V0().w1(zzdgVar2, null);
                        } else {
                            bArrC = zzflVar2.C((zzbd) this.f3167v, (String) this.f3165t);
                            zzkxVar2.o1();
                            zzkxVar2.V0().w1(zzdgVar2, bArrC);
                        }
                    } catch (Throwable th2) {
                        zzkxVar2.V0().w1(zzdgVar2, bArrC);
                        throw th2;
                    }
                } catch (RemoteException e11) {
                    zzkxVar2.i().f9056x.a(e11, "Failed to send event to the service to bundle");
                    zzkxVar2.V0().w1(zzdgVar2, bArrC);
                }
                return;
            case 4:
                zzkx zzkxVarR3 = ((AppMeasurementDynamiteService) this.f3168w).f8881b.r();
                zzkxVarR3.W0();
                zzkxVarR3.a1();
                zzkxVarR3.f1(new e0(zzkxVarR3, (String) this.f3165t, (String) this.f3167v, zzkxVarR3.p1(false), (zzdg) this.f3166u));
                return;
            case 5:
                q0 q0Var = (q0) this.f3168w;
                zznp zznpVarA0 = q0Var.f3068s.a0();
                zznc zzncVar = q0Var.f3068s;
                ((DefaultClock) zzncVar.a()).getClass();
                zzbd zzbdVarJ1 = zznpVarA0.j1((String) this.f3166u, (Bundle) this.f3167v, "auto", System.currentTimeMillis(), false);
                Preconditions.i(zzbdVarJ1);
                zzncVar.v(zzbdVarJ1, (String) this.f3165t);
                return;
            case 6:
                ((J4.c) this.f3166u).e((Download) this.f3167v, (h7.b) this.f3165t, (Exception) this.f3168w);
                return;
            case 7:
                p136o.e eVar = (p136o.e) this.f3166u;
                if (eVar != null) {
                    p081i3.b bVar = (p081i3.b) this.f3168w;
                    ((p136o.f) bVar.f12212t).f13471R = true;
                    eVar.f13453b.c(false);
                    ((p136o.f) bVar.f12212t).f13471R = false;
                }
                p136o.n nVar = (p136o.n) this.f3167v;
                if (nVar.isEnabled() && nVar.hasSubMenu()) {
                    ((p136o.l) this.f3165t).q(nVar, null, 4);
                    return;
                }
                return;
            default:
                p157q1.k kVar = (p157q1.k) this.f3165t;
                UUID uuid = (UUID) this.f3166u;
                String string = uuid.toString();
                p050f1.q qVarA = p050f1.q.a();
                String str = p147p1.q.f14194c;
                Objects.toString(uuid);
                p050f1.g gVar = (p050f1.g) this.f3167v;
                Objects.toString(gVar);
                qVarA.getClass();
                p147p1.q qVar = (p147p1.q) this.f3168w;
                WorkDatabase workDatabase = qVar.a;
                WorkDatabase workDatabase2 = qVar.a;
                workDatabase.c();
                try {
                    o1.o oVarG = workDatabase2.v().g(string);
                    if (oVarG == null) {
                        throw new IllegalStateException("Calls to setProgressAsync() must complete before a ListenableWorker signals completion of work by returning an instance of Result.");
                    }
                    if (oVarG.f13646b == 2) {
                        o1.l lVar = new o1.l(string, gVar);
                        o1.m mVarU = workDatabase2.u();
                        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) mVarU.f13641s;
                        workDatabase_Impl.b();
                        workDatabase_Impl.c();
                        try {
                            ((o1.b) mVarU.f13642t).h(lVar);
                            workDatabase_Impl.o();
                            workDatabase_Impl.j();
                        } catch (Throwable th3) {
                            workDatabase_Impl.j();
                            throw th3;
                        }
                    } else {
                        p050f1.q.a().d(str, "Ignoring setProgressAsync(...). WorkSpec (" + string + ") is not in a RUNNING state.");
                    }
                    kVar.j(null);
                    workDatabase2.o();
                } catch (Throwable th4) {
                    try {
                        p050f1.q qVarA2 = p050f1.q.a();
                        String str2 = p147p1.q.f14194c;
                        qVarA2.getClass();
                        kVar.k(th4);
                    } finally {
                        workDatabase2.j();
                    }
                    break;
                }
                return;
        }
    }

    public /* synthetic */ RunnableC0315y(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.f3164s = i10;
        this.f3166u = obj2;
        this.f3167v = obj3;
        this.f3165t = obj4;
        this.f3168w = obj;
    }

    public /* synthetic */ RunnableC0315y(Object obj, Object obj2, String str, String str2, int i10) {
        this.f3164s = i10;
        this.f3166u = obj2;
        this.f3165t = str;
        this.f3167v = str2;
        this.f3168w = obj;
    }

    public RunnableC0315y(q0 q0Var, String str, String str2, Bundle bundle) {
        this.f3164s = 5;
        this.f3165t = str;
        this.f3166u = str2;
        this.f3167v = bundle;
        this.f3168w = q0Var;
    }

    public RunnableC0315y(zzkx zzkxVar, zzbd zzbdVar, String str, zzdg zzdgVar) {
        this.f3164s = 3;
        this.f3167v = zzbdVar;
        this.f3165t = str;
        this.f3166u = zzdgVar;
        this.f3168w = zzkxVar;
    }
}
