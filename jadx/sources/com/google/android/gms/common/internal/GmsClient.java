package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.content.Context;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Scope;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
@KeepForSdk
public abstract class GmsClient<T extends IInterface> extends BaseGmsClient<T> implements Api.Client, zaj {

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public final Set f8108V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public final Account f8109W;

    /* JADX WARN: Illegal instructions before constructor call */
    public GmsClient(Context context, Looper looper, int i10, ClientSettings clientSettings, GoogleApiClient.ConnectionCallbacks connectionCallbacks, GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        p233y2.d dVarA = GmsClientSupervisor.a(context);
        GoogleApiAvailability googleApiAvailability = GoogleApiAvailability.f7832d;
        Preconditions.i(connectionCallbacks);
        Preconditions.i(onConnectionFailedListener);
        super(context, looper, dVarA, googleApiAvailability, i10, new a(connectionCallbacks), new b(onConnectionFailedListener), clientSettings.f8080f);
        this.f8109W = clientSettings.a;
        Set set = clientSettings.f8077c;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            if (!set.contains((Scope) it.next())) {
                throw new IllegalStateException("Expanding scopes is not permitted, use implied scopes instead");
            }
        }
        this.f8108V = set;
    }

    @Override // com.google.android.gms.common.api.Api.Client
    public final Set c() {
        return s() ? this.f8108V : Collections.EMPTY_SET;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final Account w() {
        return this.f8109W;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final Set z() {
        return this.f8108V;
    }
}
