package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.x, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0599x extends r {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final /* synthetic */ zzdq f8429A;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ int f8430w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ String f8431x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ String f8432y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final /* synthetic */ Bundle f8433z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0599x(zzdq zzdqVar, String str, String str2, Bundle bundle, int i10) {
        super(zzdqVar, true);
        this.f8430w = i10;
        this.f8431x = str;
        this.f8432y = str2;
        this.f8433z = bundle;
        this.f8429A = zzdqVar;
    }

    @Override // com.google.android.gms.internal.measurement.r
    public final void a() {
        switch (this.f8430w) {
            case 0:
                zzdb zzdbVar = this.f8429A.f8572h;
                Preconditions.i(zzdbVar);
                zzdbVar.clearConditionalUserProperty(this.f8431x, this.f8432y, this.f8433z);
                break;
            default:
                long j = this.f8407s;
                zzdb zzdbVar2 = this.f8429A.f8572h;
                Preconditions.i(zzdbVar2);
                zzdbVar2.logEvent(this.f8431x, this.f8432y, this.f8433z, true, true, j);
                break;
        }
    }
}
