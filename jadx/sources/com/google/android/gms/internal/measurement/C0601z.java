package com.google.android.gms.internal.measurement;

import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.z, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0601z extends r {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ int f8446w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ zzdc f8447x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ zzdq f8448y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0601z(zzdq zzdqVar, zzdc zzdcVar, int i10) {
        super(zzdqVar, true);
        this.f8446w = i10;
        this.f8447x = zzdcVar;
        this.f8448y = zzdqVar;
    }

    @Override // com.google.android.gms.internal.measurement.r
    public final void a() {
        switch (this.f8446w) {
            case 0:
                zzdb zzdbVar = this.f8448y.f8572h;
                Preconditions.i(zzdbVar);
                zzdbVar.getCachedAppInstanceId(this.f8447x);
                break;
            case 1:
                zzdb zzdbVar2 = this.f8448y.f8572h;
                Preconditions.i(zzdbVar2);
                zzdbVar2.getGmpAppId(this.f8447x);
                break;
            case 2:
                zzdb zzdbVar3 = this.f8448y.f8572h;
                Preconditions.i(zzdbVar3);
                zzdbVar3.getCurrentScreenName(this.f8447x);
                break;
            case 3:
                zzdb zzdbVar4 = this.f8448y.f8572h;
                Preconditions.i(zzdbVar4);
                zzdbVar4.generateEventId(this.f8447x);
                break;
            default:
                zzdb zzdbVar5 = this.f8448y.f8572h;
                Preconditions.i(zzdbVar5);
                zzdbVar5.getCurrentScreenClass(this.f8447x);
                break;
        }
    }

    @Override // com.google.android.gms.internal.measurement.r
    public final void b() {
        switch (this.f8446w) {
            case 0:
                this.f8447x.l(null);
                break;
            case 1:
                this.f8447x.l(null);
                break;
            case 2:
                this.f8447x.l(null);
                break;
            case 3:
                this.f8447x.l(null);
                break;
            default:
                this.f8447x.l(null);
                break;
        }
    }
}
