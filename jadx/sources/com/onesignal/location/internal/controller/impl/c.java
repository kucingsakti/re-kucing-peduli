package com.onesignal.location.internal.controller.impl;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiClient;
import p210v8.i;

/* JADX INFO: loaded from: classes.dex */
public final class c {
    private final Class<?> googleApiClientListenerClass;
    private final GoogleApiClient realInstance;

    public c(GoogleApiClient googleApiClient) {
        i.f(googleApiClient, "realInstance");
        this.realInstance = googleApiClient;
        this.googleApiClientListenerClass = googleApiClient.getClass();
    }

    public final ConnectionResult blockingConnect() {
        try {
            Object objInvoke = this.googleApiClientListenerClass.getMethod("blockingConnect", new Class[0]).invoke(this.realInstance, new Object[0]);
            i.d(objInvoke, "null cannot be cast to non-null type com.google.android.gms.common.ConnectionResult");
            return (ConnectionResult) objInvoke;
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    public final void connect() {
        try {
            this.googleApiClientListenerClass.getMethod("connect", new Class[0]).invoke(this.realInstance, new Object[0]);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public final void disconnect() {
        try {
            this.googleApiClientListenerClass.getMethod("disconnect", new Class[0]).invoke(this.realInstance, new Object[0]);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public final GoogleApiClient getRealInstance() {
        return this.realInstance;
    }
}
