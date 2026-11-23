package com.google.android.gms.measurement.internal;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class zzs implements Runnable {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public /* synthetic */ zzhj f9359s;

    @Override // java.lang.Runnable
    public final void run() {
        zzhj zzhjVar = this.f9359s;
        zznp zznpVar = zzhjVar.f9118D;
        zzhj.e(zznpVar);
        zznpVar.W0();
        if (zznpVar.d2() != 1) {
            zzfw zzfwVar = zzhjVar.f9115A;
            zzhj.g(zzfwVar);
            zzfwVar.f9047A.b("registerTrigger called but app not eligible");
        } else {
            zziv zzivVar = zzhjVar.f9122H;
            zzhj.f(zzivVar);
            zzp zzpVar = new zzp();
            zzpVar.f9358s = zzivVar;
            new Thread(zzpVar).start();
        }
    }
}
