package com.google.android.gms.measurement.internal;

import M2.Q;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class zzje implements Runnable {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public /* synthetic */ zziv f9219s;

    @Override // java.lang.Runnable
    public final void run() {
        zziv zzivVar = this.f9219s;
        zzivVar.W0();
        if (zzivVar.U0().f3142M.b()) {
            zzivVar.i().f9051E.b("Deferred Deep Link already retrieved. Not fetching again.");
            return;
        }
        long jA = zzivVar.U0().f3143N.a();
        zzivVar.U0().f3143N.b(1 + jA);
        if (jA >= 5) {
            zzivVar.i().f9047A.b("Permanently failed to retrieve Deferred Deep Link. Reached maximum retries.");
            zzivVar.U0().f3142M.a(true);
        } else {
            if (zzivVar.f9200J == null) {
                zzivVar.f9200J = new Q(zzivVar, (zzhj) zzivVar.f577s, 2);
            }
            zzivVar.f9200J.b(0L);
        }
    }
}
