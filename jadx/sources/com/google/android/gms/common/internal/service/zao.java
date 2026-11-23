package com.google.android.gms.common.internal.service;

import P2.f;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.internal.GoogleApiManager;
import com.google.android.gms.common.api.internal.TaskApiCall;
import com.google.android.gms.common.api.internal.d;
import com.google.android.gms.common.api.internal.zach;
import com.google.android.gms.common.api.internal.zag;
import com.google.android.gms.common.internal.TelemetryData;
import com.google.android.gms.common.internal.TelemetryLoggingClient;
import com.google.android.gms.internal.base.zaf;
import com.google.android.gms.internal.base.zau;
import com.google.android.gms.tasks.TaskCompletionSource;
import p242z2.b;

/* JADX INFO: loaded from: classes.dex */
public final class zao extends GoogleApi implements TelemetryLoggingClient {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final Api f8138i = new Api("ClientTelemetry.API", new b(), new Api.ClientKey());

    @Override // com.google.android.gms.common.internal.TelemetryLoggingClient
    public final f a(TelemetryData telemetryData) {
        TaskApiCall.Builder builder = new TaskApiCall.Builder();
        Feature[] featureArr = {zaf.a};
        builder.a = new zam(telemetryData);
        d dVar = new d(builder, featureArr, false);
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        GoogleApiManager googleApiManager = this.f7857h;
        googleApiManager.getClass();
        zach zachVar = new zach(new zag(dVar, taskCompletionSource, this.f7856g), googleApiManager.f7905A.get(), this);
        zau zauVar = googleApiManager.f7910F;
        zauVar.sendMessage(zauVar.obtainMessage(4, zachVar));
        return taskCompletionSource.a;
    }
}
