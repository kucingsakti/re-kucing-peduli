package L2;

import M2.RunnableC0315y;
import M2.V;
import android.os.Bundle;
import android.os.SystemClock;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.measurement.internal.zzab;
import com.google.android.gms.measurement.internal.zzb;
import com.google.android.gms.measurement.internal.zzfw;
import com.google.android.gms.measurement.internal.zzhc;
import com.google.android.gms.measurement.internal.zzhj;
import com.google.android.gms.measurement.internal.zziv;
import com.google.android.gms.measurement.internal.zzkp;
import com.google.android.gms.measurement.internal.zzks;
import com.google.android.gms.measurement.internal.zzno;
import com.google.android.gms.measurement.internal.zznp;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import p212w.e;

/* JADX INFO: loaded from: classes.dex */
public final class c extends a {
    public final zzhj a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final zziv f2775b;

    public c(zzhj zzhjVar) {
        Preconditions.i(zzhjVar);
        this.a = zzhjVar;
        zziv zzivVar = zzhjVar.f9122H;
        zzhj.f(zzivVar);
        this.f2775b = zzivVar;
    }

    @Override // com.google.android.gms.measurement.internal.zzkk
    public final void a(String str, String str2, Bundle bundle) {
        zziv zzivVar = this.a.f9122H;
        zzhj.f(zzivVar);
        zzivVar.p1(str, str2, bundle);
    }

    @Override // com.google.android.gms.measurement.internal.zzkk
    public final List b(String str, String str2) {
        zziv zzivVar = this.f2775b;
        if (zzivVar.l().h1()) {
            zzivVar.i().f9056x.b("Cannot get conditional user properties from analytics worker thread");
            return new ArrayList(0);
        }
        if (zzab.a()) {
            zzivVar.i().f9056x.b("Cannot get conditional user properties from main thread");
            return new ArrayList(0);
        }
        AtomicReference atomicReference = new AtomicReference();
        zzhc zzhcVar = ((zzhj) zzivVar.f577s).f9116B;
        zzhj.g(zzhcVar);
        zzhcVar.b1(atomicReference, 5000L, "get conditional user properties", new RunnableC0315y((Object) zzivVar, (Object) atomicReference, str, str2, 1));
        List list = (List) atomicReference.get();
        if (list != null) {
            return zznp.R1(list);
        }
        zzivVar.i().f9056x.a(null, "Timed out waiting for get conditional user properties");
        return new ArrayList();
    }

    @Override // com.google.android.gms.measurement.internal.zzkk
    public final void c(String str) {
        zzhj zzhjVar = this.a;
        zzb zzbVarM = zzhjVar.m();
        zzhjVar.f9120F.getClass();
        zzbVarM.c1(str, SystemClock.elapsedRealtime());
    }

    @Override // com.google.android.gms.measurement.internal.zzkk
    public final Map d(String str, String str2, boolean z6) {
        zziv zzivVar = this.f2775b;
        if (zzivVar.l().h1()) {
            zzivVar.i().f9056x.b("Cannot get user properties from analytics worker thread");
            return Collections.EMPTY_MAP;
        }
        if (zzab.a()) {
            zzivVar.i().f9056x.b("Cannot get user properties from main thread");
            return Collections.EMPTY_MAP;
        }
        AtomicReference atomicReference = new AtomicReference();
        zzhc zzhcVar = ((zzhj) zzivVar.f577s).f9116B;
        zzhj.g(zzhcVar);
        zzhcVar.b1(atomicReference, 5000L, "get user properties", new V(zzivVar, atomicReference, str, str2, z6, 0));
        List<zzno> list = (List) atomicReference.get();
        if (list == null) {
            zzfw zzfwVarI = zzivVar.i();
            zzfwVarI.f9056x.a(Boolean.valueOf(z6), "Timed out waiting for handle get user properties, includeInternal");
            return Collections.EMPTY_MAP;
        }
        e eVar = new e(list.size());
        for (zzno zznoVar : list) {
            Object objB = zznoVar.b();
            if (objB != null) {
                eVar.put(zznoVar.f9313t, objB);
            }
        }
        return eVar;
    }

    @Override // com.google.android.gms.measurement.internal.zzkk
    public final void e(String str, String str2, Bundle bundle) {
        zziv zzivVar = this.f2775b;
        ((zzhj) zzivVar.f577s).f9120F.getClass();
        zzivVar.q1(str, str2, bundle, true, true, System.currentTimeMillis());
    }

    @Override // com.google.android.gms.measurement.internal.zzkk
    public final long f() {
        zznp zznpVar = this.a.f9118D;
        zzhj.e(zznpVar);
        return zznpVar.h2();
    }

    @Override // com.google.android.gms.measurement.internal.zzkk
    public final String g() {
        zzks zzksVar = ((zzhj) this.f2775b.f577s).f9121G;
        zzhj.f(zzksVar);
        zzkp zzkpVar = zzksVar.f9235u;
        if (zzkpVar != null) {
            return zzkpVar.f9226b;
        }
        return null;
    }

    @Override // com.google.android.gms.measurement.internal.zzkk
    public final String h() {
        zzks zzksVar = ((zzhj) this.f2775b.f577s).f9121G;
        zzhj.f(zzksVar);
        zzkp zzkpVar = zzksVar.f9235u;
        if (zzkpVar != null) {
            return zzkpVar.a;
        }
        return null;
    }

    @Override // com.google.android.gms.measurement.internal.zzkk
    public final String i() {
        return (String) this.f2775b.f9208y.get();
    }

    @Override // com.google.android.gms.measurement.internal.zzkk
    public final String j() {
        return (String) this.f2775b.f9208y.get();
    }

    @Override // com.google.android.gms.measurement.internal.zzkk
    public final int k(String str) {
        Preconditions.e(str);
        return 25;
    }

    @Override // com.google.android.gms.measurement.internal.zzkk
    public final void l(Bundle bundle) {
        zziv zzivVar = this.f2775b;
        ((zzhj) zzivVar.f577s).f9120F.getClass();
        zzivVar.z1(bundle, System.currentTimeMillis());
    }

    @Override // com.google.android.gms.measurement.internal.zzkk
    public final void m(String str) {
        zzhj zzhjVar = this.a;
        zzb zzbVarM = zzhjVar.m();
        zzhjVar.f9120F.getClass();
        zzbVarM.f1(str, SystemClock.elapsedRealtime());
    }
}
