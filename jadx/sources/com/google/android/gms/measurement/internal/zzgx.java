package com.google.android.gms.measurement.internal;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class zzgx implements Callable {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public /* synthetic */ zzgt f9101s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public /* synthetic */ String f9102t;

    @Override // java.util.concurrent.Callable
    public final Object call() {
        zzgv zzgvVar = new zzgv();
        zzgvVar.f9098s = this.f9101s;
        zzgvVar.f9099t = this.f9102t;
        return new com.google.android.gms.internal.measurement.zzx(zzgvVar);
    }
}
