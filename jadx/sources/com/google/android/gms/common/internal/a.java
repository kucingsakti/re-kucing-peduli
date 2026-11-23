package com.google.android.gms.common.internal;

import com.google.android.gms.common.api.GoogleApiClient;

/* JADX INFO: loaded from: classes.dex */
public final class a implements BaseGmsClient.BaseConnectionCallbacks {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ GoogleApiClient.ConnectionCallbacks f8135s;

    public a(GoogleApiClient.ConnectionCallbacks connectionCallbacks) {
        this.f8135s = connectionCallbacks;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnected() {
        this.f8135s.onConnected(null);
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnectionSuspended(int i10) {
        this.f8135s.onConnectionSuspended(i10);
    }
}
