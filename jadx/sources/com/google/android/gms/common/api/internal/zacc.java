package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes.dex */
public final class zacc extends zap {
    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public final void e() {
        new CancellationException("Host activity was destroyed before Google Play services could be made available.");
        throw null;
    }

    @Override // com.google.android.gms.common.api.internal.zap
    public final void j(ConnectionResult connectionResult, int i10) {
        String str = connectionResult.f7824v;
        if (str == null) {
            str = "Error connecting to Google Play services";
        }
        new ApiException(new Status(connectionResult.f7822t, str, connectionResult.f7823u, connectionResult));
        throw null;
    }

    @Override // com.google.android.gms.common.api.internal.zap
    public final void k() {
        throw null;
    }
}
