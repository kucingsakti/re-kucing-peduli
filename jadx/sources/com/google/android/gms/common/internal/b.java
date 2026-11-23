package com.google.android.gms.common.internal;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiClient;

/* JADX INFO: loaded from: classes.dex */
public final class b implements BaseGmsClient.BaseOnConnectionFailedListener {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ GoogleApiClient.OnConnectionFailedListener f8136s;

    public b(GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        this.f8136s = onConnectionFailedListener;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener
    public final void onConnectionFailed(ConnectionResult connectionResult) {
        this.f8136s.onConnectionFailed(connectionResult);
    }
}
