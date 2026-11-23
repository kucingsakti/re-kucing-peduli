package com.google.android.gms.measurement.internal;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class zzjg implements Runnable {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public /* synthetic */ zziv f9220s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public /* synthetic */ String f9221t;

    @Override // java.lang.Runnable
    public final void run() {
        zzhj zzhjVar = (zzhj) this.f9220s.f577s;
        zzfq zzfqVarO = zzhjVar.o();
        String str = zzfqVarO.f9037H;
        String str2 = this.f9221t;
        boolean z6 = (str == null || str.equals(str2)) ? false : true;
        zzfqVarO.f9037H = str2;
        if (z6) {
            zzhjVar.o().f1();
        }
    }
}
