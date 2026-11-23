package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes.dex */
public final class zzoe implements zzob {
    public static final U a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final U f8817b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final U f8818c;

    static {
        zzhh zzhhVarD = new zzhh(zzgw.a("com.google.android.gms.measurement")).e().d();
        zzhhVarD.c("measurement.service.audience.fix_skip_audience_with_failed_filters", true);
        a = zzhhVarD.c("measurement.audience.refresh_event_count_filters_timestamp", false);
        f8817b = zzhhVarD.c("measurement.audience.use_bundle_end_timestamp_for_non_sequence_property_filters", false);
        f8818c = zzhhVarD.c("measurement.audience.use_bundle_timestamp_for_event_count_filters", false);
    }

    @Override // com.google.android.gms.internal.measurement.zzob
    public final boolean a() {
        return ((Boolean) a.a()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzob
    public final boolean c() {
        return ((Boolean) f8817b.a()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzob
    public final boolean d() {
        return ((Boolean) f8818c.a()).booleanValue();
    }
}
