package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes.dex */
public final class zznm implements zznj {
    public static final U a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final U f8798b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final U f8799c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final U f8800d;

    static {
        zzhh zzhhVarD = new zzhh(zzgw.a("com.google.android.gms.measurement")).e().d();
        a = zzhhVarD.c("measurement.consent.stop_reset_on_storage_denied.client", true);
        f8798b = zzhhVarD.c("measurement.consent.stop_reset_on_storage_denied.service", true);
        zzhhVarD.a("measurement.id.consent.stop_reset_on_storage_denied.service", 0L);
        f8799c = zzhhVarD.c("measurement.consent.scrub_audience_data_analytics_consent", true);
        f8800d = zzhhVarD.c("measurement.consent.fix_first_open_count_from_snapshot", true);
    }

    @Override // com.google.android.gms.internal.measurement.zznj
    public final boolean a() {
        return ((Boolean) a.a()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.zznj
    public final boolean c() {
        return ((Boolean) f8798b.a()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.zznj
    public final boolean d() {
        return ((Boolean) f8799c.a()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.zznj
    public final boolean e() {
        return ((Boolean) f8800d.a()).booleanValue();
    }
}
