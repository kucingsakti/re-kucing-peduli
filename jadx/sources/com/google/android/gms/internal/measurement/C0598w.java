package com.google.android.gms.internal.measurement;

import android.app.Activity;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.ObjectWrapper;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.w, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0598w extends r {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final /* synthetic */ Object f8424A;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ int f8425w = 1;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ String f8426x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ String f8427y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final /* synthetic */ zzdq f8428z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0598w(zzdq zzdqVar, Activity activity, String str, String str2) {
        super(zzdqVar, true);
        this.f8424A = activity;
        this.f8426x = str;
        this.f8427y = str2;
        this.f8428z = zzdqVar;
    }

    @Override // com.google.android.gms.internal.measurement.r
    public final void a() {
        switch (this.f8425w) {
            case 0:
                zzdb zzdbVar = this.f8428z.f8572h;
                Preconditions.i(zzdbVar);
                zzdbVar.getConditionalUserProperties(this.f8426x, this.f8427y, (zzdc) this.f8424A);
                break;
            default:
                zzdb zzdbVar2 = this.f8428z.f8572h;
                Preconditions.i(zzdbVar2);
                zzdbVar2.setCurrentScreen(new ObjectWrapper((Activity) this.f8424A), this.f8426x, this.f8427y, this.f8407s);
                break;
        }
    }

    @Override // com.google.android.gms.internal.measurement.r
    public void b() {
        switch (this.f8425w) {
            case 0:
                ((zzdc) this.f8424A).l(null);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0598w(zzdq zzdqVar, String str, String str2, zzdc zzdcVar) {
        super(zzdqVar, true);
        this.f8426x = str;
        this.f8427y = str2;
        this.f8424A = zzdcVar;
        this.f8428z = zzdqVar;
    }
}
