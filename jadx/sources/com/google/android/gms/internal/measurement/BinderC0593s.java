package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import com.google.android.gms.measurement.api.AppMeasurementSdk;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class BinderC0593s extends zzdk {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AppMeasurementSdk.OnEventListener f8412b;

    public BinderC0593s(AppMeasurementSdk.OnEventListener onEventListener) {
        this.f8412b = onEventListener;
    }

    @Override // com.google.android.gms.internal.measurement.zzdh
    public final void N(long j, Bundle bundle, String str, String str2) {
        this.f8412b.a(j, bundle, str, str2);
    }

    @Override // com.google.android.gms.internal.measurement.zzdh
    public final int b() {
        return System.identityHashCode(this.f8412b);
    }
}
