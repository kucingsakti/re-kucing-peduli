package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.ObjectWrapper;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.u, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0596u extends r {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ int f8418w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ zzdq f8419x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ Object f8420y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0596u(zzdq zzdqVar, Object obj, int i10) {
        super(zzdqVar, true);
        this.f8418w = i10;
        this.f8420y = obj;
        this.f8419x = zzdqVar;
    }

    @Override // com.google.android.gms.internal.measurement.r
    public final void a() {
        switch (this.f8418w) {
            case 0:
                zzdb zzdbVar = this.f8419x.f8572h;
                Preconditions.i(zzdbVar);
                zzdbVar.setConditionalUserProperty((Bundle) this.f8420y, this.f8407s);
                break;
            case 1:
                zzdb zzdbVar2 = this.f8419x.f8572h;
                Preconditions.i(zzdbVar2);
                zzdbVar2.logHealthData(5, "Error with data collection. Data lost.", new ObjectWrapper((Exception) this.f8420y), new ObjectWrapper(null), new ObjectWrapper(null));
                break;
            default:
                zzdb zzdbVar3 = this.f8419x.f8572h;
                Preconditions.i(zzdbVar3);
                zzdbVar3.registerOnMeasurementEventListener((BinderC0593s) this.f8420y);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0596u(zzdq zzdqVar, Exception exc) {
        super(zzdqVar, false);
        this.f8418w = 1;
        this.f8420y = exc;
        this.f8419x = zzdqVar;
    }
}
