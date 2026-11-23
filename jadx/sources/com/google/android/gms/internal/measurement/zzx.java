package com.google.android.gms.internal.measurement;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class zzx extends zzal {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final com.google.android.gms.measurement.internal.zzgv f8873u;

    public zzx(com.google.android.gms.measurement.internal.zzgv zzgvVar) {
        super("internal.appMetadata");
        this.f8873u = zzgvVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzal
    public final zzaq a(zzh zzhVar, List list) {
        try {
            return zzj.b(this.f8873u.call());
        } catch (Exception unused) {
            return zzaq.f8465i;
        }
    }
}
