package com.google.android.gms.common.internal;

import com.google.android.gms.common.ConnectionResult;

/* JADX INFO: loaded from: classes.dex */
public final class zzg extends p233y2.b {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ BaseGmsClient f8177g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzg(BaseGmsClient baseGmsClient, int i10) {
        super(baseGmsClient, i10, null);
        this.f8177g = baseGmsClient;
    }

    @Override // p233y2.b
    public final void d(ConnectionResult connectionResult) {
        BaseGmsClient baseGmsClient = this.f8177g;
        baseGmsClient.getClass();
        baseGmsClient.f8052G.a(connectionResult);
        baseGmsClient.f8068v = connectionResult.f7822t;
        baseGmsClient.f8069w = System.currentTimeMillis();
    }

    @Override // p233y2.b
    public final boolean e() {
        this.f8177g.f8052G.a(ConnectionResult.f7820w);
        return true;
    }
}
