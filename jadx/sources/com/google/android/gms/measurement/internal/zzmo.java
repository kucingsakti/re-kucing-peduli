package com.google.android.gms.measurement.internal;

import M2.j0;
import M2.k0;
import o1.c;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class zzmo implements Runnable {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public /* synthetic */ j0 f9271s;

    @Override // java.lang.Runnable
    public final void run() {
        j0 j0Var = this.f9271s;
        c cVar = j0Var.f3033u;
        ((zzmh) cVar.f13624u).W0();
        zzmh zzmhVar = (zzmh) cVar.f13624u;
        zzmhVar.i().f9051E.b("Application going to the background");
        zzmhVar.U0().f3141L.a(true);
        zzmhVar.W0();
        zzmhVar.f9267v = true;
        zzhj zzhjVar = (zzhj) zzmhVar.f577s;
        if (!zzhjVar.f9146y.k1()) {
            boolean zH1 = zzhjVar.f9146y.h1(null, zzbf.f8942H0);
            long j = j0Var.f3032t;
            k0 k0Var = zzmhVar.f9269x;
            if (zH1) {
                k0Var.a(false, false, j);
                k0Var.f3044c.a();
            } else {
                k0Var.f3044c.a();
                k0Var.a(false, false, j);
            }
        }
        zzfw zzfwVarI = zzmhVar.i();
        zzfwVarI.f9050D.a(Long.valueOf(j0Var.f3031s), "Application backgrounded at: timestamp_millis");
    }
}
