package M2;

import android.content.Context;
import android.os.RemoteException;
import android.text.TextUtils;
import androidx.datastore.preferences.protobuf.AbstractC0487g;
import com.google.android.gms.internal.measurement.zzdg;
import com.google.android.gms.measurement.internal.zzfl;
import com.google.android.gms.measurement.internal.zzkx;
import com.google.android.gms.measurement.internal.zznp;
import com.google.android.gms.measurement.internal.zzo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class e0 implements Runnable {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f2986s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f2987t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Object f2988u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Object f2989v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f2990w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Object f2991x;

    public /* synthetic */ e0(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i10) {
        this.f2986s = i10;
        this.f2991x = obj2;
        this.f2987t = obj3;
        this.f2988u = obj4;
        this.f2989v = obj5;
        this.f2990w = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2986s) {
            case 0:
                synchronized (((AtomicReference) this.f2991x)) {
                    try {
                        try {
                            zzkx zzkxVar = (zzkx) this.f2990w;
                            zzfl zzflVar = zzkxVar.f9243v;
                            if (zzflVar == null) {
                                zzkxVar.i().f9056x.d("(legacy) Failed to get conditional properties; not connected to service", null, (String) this.f2987t, (String) this.f2988u);
                                ((AtomicReference) this.f2991x).set(Collections.EMPTY_LIST);
                                ((AtomicReference) this.f2991x).notify();
                                return;
                            } else {
                                if (TextUtils.isEmpty(null)) {
                                    ((AtomicReference) this.f2991x).set(zzflVar.v((String) this.f2987t, (String) this.f2988u, (zzo) this.f2989v));
                                } else {
                                    ((AtomicReference) this.f2991x).set(zzflVar.c0(null, (String) this.f2987t, (String) this.f2988u));
                                }
                                ((zzkx) this.f2990w).o1();
                                ((AtomicReference) this.f2991x).notify();
                                return;
                            }
                        } catch (RemoteException e10) {
                            ((zzkx) this.f2990w).i().f9056x.d("(legacy) Failed to get conditional properties; remote exception", null, (String) this.f2987t, e10);
                            ((AtomicReference) this.f2991x).set(Collections.EMPTY_LIST);
                            ((AtomicReference) this.f2991x).notify();
                        }
                    } catch (Throwable th) {
                        ((AtomicReference) this.f2991x).notify();
                        throw th;
                    }
                }
                break;
            case 1:
                zzo zzoVar = (zzo) this.f2989v;
                String str = (String) this.f2988u;
                String str2 = (String) this.f2987t;
                zzdg zzdgVar = (zzdg) this.f2991x;
                zzkx zzkxVar2 = (zzkx) this.f2990w;
                ArrayList arrayList = new ArrayList();
                try {
                    try {
                        zzfl zzflVar2 = zzkxVar2.f9243v;
                        if (zzflVar2 == null) {
                            zzkxVar2.i().f9056x.c("Failed to get conditional properties; not connected to service", str2, str);
                            zzkxVar2.V0().u1(zzdgVar, arrayList);
                        } else {
                            arrayList = zznp.R1(zzflVar2.v(str2, str, zzoVar));
                            zzkxVar2.o1();
                            zzkxVar2.V0().u1(zzdgVar, arrayList);
                        }
                        return;
                    } catch (RemoteException e11) {
                        zzkxVar2.i().f9056x.d("Failed to get conditional properties; remote exception", str2, str, e11);
                        zzkxVar2.V0().u1(zzdgVar, arrayList);
                        return;
                    }
                } catch (Throwable th2) {
                    zzkxVar2.V0().u1(zzdgVar, arrayList);
                    throw th2;
                }
            default:
                try {
                    if (!(((p157q1.k) this.f2991x).f14401s instanceof p157q1.a)) {
                        String string = ((UUID) this.f2987t).toString();
                        o1.o oVarG = ((p147p1.p) this.f2990w).f14193c.g(string);
                        if (oVarG == null || AbstractC0487g.b(oVarG.f13646b)) {
                            throw new IllegalStateException("Calls to setForegroundAsync() must complete before a ListenableWorker signals completion of work by returning an instance of Result.");
                        }
                        ((p147p1.p) this.f2990w).f14192b.i(string, (p050f1.i) this.f2988u);
                        ((Context) this.f2989v).startService(p127n1.a.a((Context) this.f2989v, C3.a.g(oVarG), (p050f1.i) this.f2988u));
                    }
                    ((p157q1.k) this.f2991x).j(null);
                    return;
                } catch (Throwable th3) {
                    ((p157q1.k) this.f2991x).k(th3);
                    return;
                }
        }
    }

    public e0(zzkx zzkxVar, String str, String str2, zzo zzoVar, zzdg zzdgVar) {
        this.f2986s = 1;
        this.f2987t = str;
        this.f2988u = str2;
        this.f2989v = zzoVar;
        this.f2991x = zzdgVar;
        this.f2990w = zzkxVar;
    }
}
