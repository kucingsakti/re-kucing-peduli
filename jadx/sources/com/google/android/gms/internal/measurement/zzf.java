package com.google.android.gms.internal.measurement;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes.dex */
public final class zzf {
    public final zzbb a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final zzh f8573b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final zzh f8574c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final zzl f8575d;

    public zzf() {
        zzbb zzbbVar = new zzbb();
        this.a = zzbbVar;
        zzh zzhVar = new zzh(null, zzbbVar);
        this.f8574c = zzhVar;
        this.f8573b = zzhVar.d();
        zzl zzlVar = new zzl();
        this.f8575d = zzlVar;
        zzhVar.g("require", new zzz(zzlVar));
        zzlVar.a.put("internal.platform", new Callable() { // from class: com.google.android.gms.internal.measurement.zze
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return new zzy();
            }
        });
        zzhVar.g("runtime.counter", new zzai(Double.valueOf(0.0d)));
    }

    public final zzaq a(zzh zzhVar, zzft.zzd... zzdVarArr) {
        zzaq zzaqVarA = zzaq.f8465i;
        for (zzft.zzd zzdVar : zzdVarArr) {
            zzaqVarA = zzj.a(zzdVar);
            zzg.f(this.f8574c);
            if ((zzaqVarA instanceof zzat) || (zzaqVarA instanceof zzar)) {
                zzaqVarA = this.a.a(zzhVar, zzaqVarA);
            }
        }
        return zzaqVarA;
    }
}
