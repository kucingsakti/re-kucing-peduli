package com.google.android.gms.measurement.internal;

import M2.AbstractC0306o;
import M2.RunnableC0293b;
import android.os.Bundle;
import java.util.Iterator;
import p212w.b;
import p212w.e;

/* JADX INFO: loaded from: classes.dex */
public final class zzb extends AbstractC0306o {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final e f8914t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final e f8915u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public long f8916v;

    public zzb(zzhj zzhjVar) {
        super(zzhjVar);
        this.f8915u = new e(0);
        this.f8914t = new e(0);
    }

    public final void a1(long j) {
        zzkp zzkpVarD1 = Y0().d1(false);
        e eVar = this.f8914t;
        for (String str : (b) eVar.keySet()) {
            d1(str, j - ((Long) eVar.get(str)).longValue(), zzkpVarD1);
        }
        if (!eVar.isEmpty()) {
            b1(j - this.f8916v, zzkpVarD1);
        }
        e1(j);
    }

    public final void b1(long j, zzkp zzkpVar) {
        if (zzkpVar == null) {
            i().f9052F.b("Not logging ad exposure. No active activity");
            return;
        }
        if (j < 1000) {
            zzfw zzfwVarI = i();
            zzfwVarI.f9052F.a(Long.valueOf(j), "Not logging ad exposure. Less than 1000 ms. exposure");
        } else {
            Bundle bundle = new Bundle();
            bundle.putLong("_xt", j);
            zznp.y1(zzkpVar, bundle, true);
            X0().B1("am", "_xa", bundle);
        }
    }

    public final void c1(String str, long j) {
        if (str == null || str.length() == 0) {
            i().f9056x.b("Ad unit id must be a non-empty string");
        } else {
            l().f1(new RunnableC0293b(this, str, j, 0));
        }
    }

    public final void d1(String str, long j, zzkp zzkpVar) {
        if (zzkpVar == null) {
            i().f9052F.b("Not logging ad unit exposure. No active activity");
            return;
        }
        if (j < 1000) {
            zzfw zzfwVarI = i();
            zzfwVarI.f9052F.a(Long.valueOf(j), "Not logging ad unit exposure. Less than 1000 ms. exposure");
        } else {
            Bundle bundle = new Bundle();
            bundle.putString("_ai", str);
            bundle.putLong("_xt", j);
            zznp.y1(zzkpVar, bundle, true);
            X0().B1("am", "_xu", bundle);
        }
    }

    public final void e1(long j) {
        e eVar = this.f8914t;
        Iterator it = ((b) eVar.keySet()).iterator();
        while (it.hasNext()) {
            eVar.put((String) it.next(), Long.valueOf(j));
        }
        if (eVar.isEmpty()) {
            return;
        }
        this.f8916v = j;
    }

    public final void f1(String str, long j) {
        if (str == null || str.length() == 0) {
            i().f9056x.b("Ad unit id must be a non-empty string");
        } else {
            l().f1(new RunnableC0293b(this, str, j, 1));
        }
    }
}
