package com.google.android.gms.common.api.internal;

import android.app.PendingIntent;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;
import p224x2.s;

/* JADX INFO: loaded from: classes.dex */
public abstract class zap extends LifecycleCallback implements DialogInterface.OnCancelListener {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public volatile boolean f8020s;

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public final void c(int i10, int i11, Intent intent) {
        throw null;
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public final void d(Bundle bundle) {
        if (bundle != null) {
            if (bundle.getBoolean("resolving_error", false)) {
                new s(new ConnectionResult(bundle.getInt("failed_status"), (PendingIntent) bundle.getParcelable("failed_resolution")), bundle.getInt("failed_client_id", -1));
            }
            throw null;
        }
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public final void g(Bundle bundle) {
        throw null;
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public void h() {
        this.f8020s = true;
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public void i() {
        this.f8020s = false;
    }

    public abstract void j(ConnectionResult connectionResult, int i10);

    public abstract void k();

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        new ConnectionResult(13, null);
        throw null;
    }
}
