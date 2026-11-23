package com.google.android.gms.internal.measurement;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class zza implements Callable {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public /* synthetic */ zzb f8449s;

    @Override // java.util.concurrent.Callable
    public final Object call() {
        zzb zzbVar = this.f8449s;
        zzbVar.getClass();
        zzw zzwVar = new zzw("internal.registerCallback");
        zzwVar.f8872u = zzbVar.f8480d;
        return zzwVar;
    }
}
