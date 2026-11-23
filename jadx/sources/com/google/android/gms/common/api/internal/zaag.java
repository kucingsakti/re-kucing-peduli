package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.GoogleApiClient;

/* JADX INFO: loaded from: classes.dex */
public class zaag extends GoogleApiClient {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final String f7936t = "Method is not supported by connectionless client. APIs supporting connectionless client must not call this method.";

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final boolean a() {
        throw new UnsupportedOperationException(this.f7936t);
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final void connect() {
        throw new UnsupportedOperationException(this.f7936t);
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final void disconnect() {
        throw new UnsupportedOperationException(this.f7936t);
    }
}
