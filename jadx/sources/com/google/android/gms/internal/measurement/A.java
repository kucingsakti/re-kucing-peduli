package com.google.android.gms.internal.measurement;

import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: loaded from: classes.dex */
public final class A extends r {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final /* synthetic */ zzdq f8322A;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ String f8323w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ String f8324x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ boolean f8325y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final /* synthetic */ zzdc f8326z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public A(zzdq zzdqVar, String str, String str2, boolean z6, zzdc zzdcVar) {
        super(zzdqVar, true);
        this.f8323w = str;
        this.f8324x = str2;
        this.f8325y = z6;
        this.f8326z = zzdcVar;
        this.f8322A = zzdqVar;
    }

    @Override // com.google.android.gms.internal.measurement.r
    public final void a() {
        zzdb zzdbVar = this.f8322A.f8572h;
        Preconditions.i(zzdbVar);
        zzdbVar.getUserProperties(this.f8323w, this.f8324x, this.f8325y, this.f8326z);
    }

    @Override // com.google.android.gms.internal.measurement.r
    public final void b() {
        this.f8326z.l(null);
    }
}
