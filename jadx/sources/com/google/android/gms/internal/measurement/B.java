package com.google.android.gms.internal.measurement;

import android.app.Activity;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.ObjectWrapper;

/* JADX INFO: loaded from: classes.dex */
public final class B extends r {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ int f8330w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Activity f8331x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ C0595t f8332y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B(C0595t c0595t, Activity activity, int i10) {
        super(c0595t.f8416s, true);
        this.f8330w = i10;
        switch (i10) {
            case 1:
                this.f8331x = activity;
                this.f8332y = c0595t;
                super(c0595t.f8416s, true);
                break;
            case 2:
                this.f8331x = activity;
                this.f8332y = c0595t;
                super(c0595t.f8416s, true);
                break;
            case 3:
                this.f8331x = activity;
                this.f8332y = c0595t;
                super(c0595t.f8416s, true);
                break;
            case 4:
                this.f8331x = activity;
                this.f8332y = c0595t;
                super(c0595t.f8416s, true);
                break;
            default:
                this.f8331x = activity;
                this.f8332y = c0595t;
                break;
        }
    }

    @Override // com.google.android.gms.internal.measurement.r
    public final void a() {
        switch (this.f8330w) {
            case 0:
                zzdb zzdbVar = this.f8332y.f8416s.f8572h;
                Preconditions.i(zzdbVar);
                zzdbVar.onActivityResumed(new ObjectWrapper(this.f8331x), this.f8408t);
                break;
            case 1:
                zzdb zzdbVar2 = this.f8332y.f8416s.f8572h;
                Preconditions.i(zzdbVar2);
                zzdbVar2.onActivityStarted(new ObjectWrapper(this.f8331x), this.f8408t);
                break;
            case 2:
                zzdb zzdbVar3 = this.f8332y.f8416s.f8572h;
                Preconditions.i(zzdbVar3);
                zzdbVar3.onActivityStopped(new ObjectWrapper(this.f8331x), this.f8408t);
                break;
            case 3:
                zzdb zzdbVar4 = this.f8332y.f8416s.f8572h;
                Preconditions.i(zzdbVar4);
                zzdbVar4.onActivityPaused(new ObjectWrapper(this.f8331x), this.f8408t);
                break;
            default:
                zzdb zzdbVar5 = this.f8332y.f8416s.f8572h;
                Preconditions.i(zzdbVar5);
                zzdbVar5.onActivityDestroyed(new ObjectWrapper(this.f8331x), this.f8408t);
                break;
        }
    }
}
