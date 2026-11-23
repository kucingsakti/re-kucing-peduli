package com.google.android.gms.common.api.internal;

import P2.g;
import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.signin.zad;
import java.util.Set;
import p224x2.o;

/* JADX INFO: loaded from: classes.dex */
public final class zact extends com.google.android.gms.signin.internal.zac implements GoogleApiClient.ConnectionCallbacks, GoogleApiClient.OnConnectionFailedListener {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final N2.a f8006i = zad.a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f8007b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final com.google.android.gms.internal.base.zau f8008c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final N2.a f8009d = f8006i;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Set f8010e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ClientSettings f8011f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public com.google.android.gms.signin.zae f8012g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public o f8013h;

    public zact(Context context, com.google.android.gms.internal.base.zau zauVar, ClientSettings clientSettings) {
        this.f8007b = context;
        this.f8008c = zauVar;
        this.f8011f = clientSettings;
        this.f8010e = clientSettings.f8076b;
    }

    @Override // com.google.android.gms.signin.internal.zac, com.google.android.gms.signin.internal.zae
    public final void K(com.google.android.gms.signin.internal.zak zakVar) {
        this.f8008c.post(new g((Object) this, (Object) zakVar, 25, false));
    }

    @Override // com.google.android.gms.common.api.internal.ConnectionCallbacks
    public final void onConnected(Bundle bundle) {
        this.f8012g.b(this);
    }

    @Override // com.google.android.gms.common.api.internal.OnConnectionFailedListener
    public final void onConnectionFailed(ConnectionResult connectionResult) {
        this.f8013h.b(connectionResult);
    }

    @Override // com.google.android.gms.common.api.internal.ConnectionCallbacks
    public final void onConnectionSuspended(int i10) {
        o oVar = this.f8013h;
        zabq zabqVar = (zabq) oVar.f15771f.f7906B.get(oVar.f15767b);
        if (zabqVar != null) {
            if (zabqVar.j) {
                zabqVar.m(new ConnectionResult(17));
            } else {
                zabqVar.onConnectionSuspended(i10);
            }
        }
    }
}
