package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class zzjb implements Runnable {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public /* synthetic */ zziv f9214s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public /* synthetic */ Bundle f9215t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public /* synthetic */ long f9216u;

    @Override // java.lang.Runnable
    public final void run() {
        zziv zzivVar = this.f9214s;
        if (TextUtils.isEmpty(((zzhj) zzivVar.f577s).o().e1())) {
            zzivVar.g1(this.f9215t, 0, this.f9216u);
        } else {
            zzivVar.i().f9049C.b("Using developer consent only; google app id found");
        }
    }
}
