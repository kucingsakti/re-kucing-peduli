package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: loaded from: classes.dex */
public final class zat implements GoogleApiClient.ConnectionCallbacks, GoogleApiClient.OnConnectionFailedListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Api f8021b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f8022c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public zabi f8023d;

    public zat(Api api, boolean z6) {
        this.f8021b = api;
        this.f8022c = z6;
    }

    @Override // com.google.android.gms.common.api.internal.ConnectionCallbacks
    public final void onConnected(Bundle bundle) {
        Preconditions.j(this.f8023d, "Callbacks must be attached to a ClientConnectionHelper instance before connecting the client.");
        this.f8023d.onConnected(bundle);
    }

    @Override // com.google.android.gms.common.api.internal.OnConnectionFailedListener
    public final void onConnectionFailed(ConnectionResult connectionResult) {
        boolean z6 = this.f8022c;
        Preconditions.j(this.f8023d, "Callbacks must be attached to a ClientConnectionHelper instance before connecting the client.");
        zabi zabiVar = this.f8023d;
        Api api = this.f8021b;
        zabiVar.f7978b.lock();
        try {
            zabiVar.f7987l.b(connectionResult, api, z6);
        } finally {
            zabiVar.f7978b.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.internal.ConnectionCallbacks
    public final void onConnectionSuspended(int i10) {
        Preconditions.j(this.f8023d, "Callbacks must be attached to a ClientConnectionHelper instance before connecting the client.");
        this.f8023d.onConnectionSuspended(i10);
    }
}
