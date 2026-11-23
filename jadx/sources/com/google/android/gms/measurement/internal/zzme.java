package com.google.android.gms.measurement.internal;

import android.app.Service;
import android.content.Context;
import com.google.android.gms.measurement.internal.zzmi;

/* JADX INFO: loaded from: classes.dex */
public final class zzme<T extends Context & zzmi> {
    public final Service a;

    public zzme(Service service) {
        this.a = service;
    }

    public final zzfw a() {
        zzfw zzfwVar = zzhj.c(this.a, null, null).f9115A;
        zzhj.g(zzfwVar);
        return zzfwVar;
    }
}
