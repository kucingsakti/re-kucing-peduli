package com.google.android.gms.measurement.internal;

import M2.RunnableC0315y;
import android.os.Bundle;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class zzja implements Runnable {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public /* synthetic */ zziv f9212s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public /* synthetic */ AtomicReference f9213t;

    @Override // java.lang.Runnable
    public final void run() {
        zziv zzivVar = this.f9212s;
        Bundle bundleA = zzivVar.U0().f3136G.a();
        zzkx zzkxVarR = ((zzhj) zzivVar.f577s).r();
        if (bundleA == null) {
            bundleA = new Bundle();
        }
        zzkxVarR.W0();
        zzkxVarR.a1();
        zzo zzoVarP1 = zzkxVarR.p1(false);
        zzkxVarR.f1(new RunnableC0315y(zzkxVarR, this.f9213t, zzoVarP1, bundleA, 2));
    }
}
