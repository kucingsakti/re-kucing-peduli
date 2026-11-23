package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: loaded from: classes.dex */
public final class zzit {
    public final Context a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f9183b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f9184c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f9185d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Boolean f9186e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f9187f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final com.google.android.gms.internal.measurement.zzdo f9188g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f9189h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Long f9190i;
    public final String j;

    public zzit(Context context, com.google.android.gms.internal.measurement.zzdo zzdoVar, Long l4) {
        this.f9189h = true;
        Preconditions.i(context);
        Context applicationContext = context.getApplicationContext();
        Preconditions.i(applicationContext);
        this.a = applicationContext;
        this.f9190i = l4;
        if (zzdoVar != null) {
            this.f9188g = zzdoVar;
            this.f9183b = zzdoVar.f8562x;
            this.f9184c = zzdoVar.f8561w;
            this.f9185d = zzdoVar.f8560v;
            this.f9189h = zzdoVar.f8559u;
            this.f9187f = zzdoVar.f8558t;
            this.j = zzdoVar.f8564z;
            Bundle bundle = zzdoVar.f8563y;
            if (bundle != null) {
                this.f9186e = Boolean.valueOf(bundle.getBoolean("dataCollectionDefaultEnabled", true));
            }
        }
    }
}
