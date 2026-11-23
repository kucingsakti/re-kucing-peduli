package com.google.android.gms.common.api.internal;

/* JADX INFO: loaded from: classes.dex */
public final class c implements BackgroundDetector.BackgroundStateChangeListener {
    public final /* synthetic */ GoogleApiManager a;

    public c(GoogleApiManager googleApiManager) {
        this.a = googleApiManager;
    }

    @Override // com.google.android.gms.common.api.internal.BackgroundDetector.BackgroundStateChangeListener
    public final void a(boolean z6) {
        com.google.android.gms.internal.base.zau zauVar = this.a.f7910F;
        zauVar.sendMessage(zauVar.obtainMessage(1, Boolean.valueOf(z6)));
    }
}
