package com.google.android.gms.measurement.internal;

import android.app.Service;
import android.content.Context;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: loaded from: classes.dex */
public final class zznm {
    public final Context a;

    public zznm(Service service) {
        Preconditions.i(service);
        Context applicationContext = service.getApplicationContext();
        Preconditions.i(applicationContext);
        this.a = applicationContext;
    }
}
