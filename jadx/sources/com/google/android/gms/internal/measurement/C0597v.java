package com.google.android.gms.internal.measurement;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.ObjectWrapper;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.v, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0597v extends r {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ int f8421w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ String f8422x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ zzdq f8423y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0597v(zzdq zzdqVar, String str, int i10) {
        super(zzdqVar, true);
        this.f8421w = i10;
        this.f8422x = str;
        this.f8423y = zzdqVar;
    }

    @Override // com.google.android.gms.internal.measurement.r
    public final void a() {
        switch (this.f8421w) {
            case 0:
                zzdb zzdbVar = this.f8423y.f8572h;
                Preconditions.i(zzdbVar);
                zzdbVar.setUserProperty("fcm", "_ln", new ObjectWrapper(this.f8422x), true, this.f8407s);
                break;
            case 1:
                zzdb zzdbVar2 = this.f8423y.f8572h;
                Preconditions.i(zzdbVar2);
                zzdbVar2.endAdUnitExposure(this.f8422x, this.f8408t);
                break;
            default:
                zzdb zzdbVar3 = this.f8423y.f8572h;
                Preconditions.i(zzdbVar3);
                zzdbVar3.beginAdUnitExposure(this.f8422x, this.f8408t);
                break;
        }
    }
}
