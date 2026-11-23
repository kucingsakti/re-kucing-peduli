package com.google.android.gms.measurement.internal;

import M2.A;
import com.google.android.gms.internal.measurement.R0;
import com.google.android.gms.internal.measurement.zzm;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class zzgu implements Callable {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public /* synthetic */ zzgt f9096s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public /* synthetic */ String f9097t;

    @Override // java.util.concurrent.Callable
    public final Object call() {
        A a = new A(this.f9096s, this.f9097t);
        zzm zzmVar = new zzm("internal.remoteConfig");
        zzmVar.f8463t.put("getValue", new R0(a));
        return zzmVar;
    }
}
