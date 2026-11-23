package com.google.android.gms.common.api.internal;

import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.android.gms.common.internal.IAccountAccessor;
import com.google.android.gms.common.internal.Preconditions;
import java.io.PrintWriter;
import java.util.Collections;
import java.util.Set;
import p224x2.l;

/* JADX INFO: loaded from: classes.dex */
@KeepForSdk
public final class NonGmsServiceBrokerClient implements Api.Client, ServiceConnection {
    @Override // com.google.android.gms.common.api.Api.Client
    public final boolean a() {
        Thread.currentThread();
        throw null;
    }

    @Override // com.google.android.gms.common.api.Api.Client
    public final Set c() {
        return Collections.EMPTY_SET;
    }

    @Override // com.google.android.gms.common.api.Api.Client
    public final void d(IAccountAccessor iAccountAccessor, Set set) {
    }

    @Override // com.google.android.gms.common.api.Api.Client
    public final void f(String str) {
        Thread.currentThread();
        throw null;
    }

    @Override // com.google.android.gms.common.api.Api.Client
    public final boolean g() {
        return false;
    }

    @Override // com.google.android.gms.common.api.Api.Client
    public final int i() {
        return 0;
    }

    @Override // com.google.android.gms.common.api.Api.Client
    public final boolean j() {
        Thread.currentThread();
        throw null;
    }

    @Override // com.google.android.gms.common.api.Api.Client
    public final Feature[] l() {
        return new Feature[0];
    }

    @Override // com.google.android.gms.common.api.Api.Client
    public final String m() {
        Preconditions.i(null);
        throw null;
    }

    @Override // com.google.android.gms.common.api.Api.Client
    public final String o() {
        return null;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        throw null;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        throw null;
    }

    @Override // com.google.android.gms.common.api.Api.Client
    public final void p(BaseGmsClient.ConnectionProgressReportCallbacks connectionProgressReportCallbacks) {
        Thread.currentThread();
        throw null;
    }

    @Override // com.google.android.gms.common.api.Api.Client
    public final void q() {
        Thread.currentThread();
        throw null;
    }

    @Override // com.google.android.gms.common.api.Api.Client
    public final Intent r() {
        return new Intent();
    }

    @Override // com.google.android.gms.common.api.Api.Client
    public final boolean s() {
        return false;
    }

    @Override // com.google.android.gms.common.api.Api.Client
    public final void e(l lVar) {
    }

    @Override // com.google.android.gms.common.api.Api.Client
    public final void k(String str, PrintWriter printWriter) {
    }
}
