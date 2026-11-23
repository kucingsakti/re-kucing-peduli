package com.google.android.gms.measurement.internal;

import android.os.Build;
import android.util.SparseArray;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class zziz implements Runnable {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public /* synthetic */ zziv f9210s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public /* synthetic */ List f9211t;

    @Override // java.lang.Runnable
    public final void run() {
        zziv zzivVar = this.f9210s;
        zzivVar.W0();
        if (Build.VERSION.SDK_INT >= 30) {
            SparseArray sparseArrayG1 = zzivVar.U0().g1();
            for (zzmu zzmuVar : this.f9211t) {
                if (!sparseArrayG1.contains(zzmuVar.f9275u) || ((Long) sparseArrayG1.get(zzmuVar.f9275u)).longValue() < zzmuVar.f9274t) {
                    zzivVar.s1().add(zzmuVar);
                }
            }
            zzivVar.x1();
        }
    }
}
