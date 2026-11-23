package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes.dex */
public final class zzpi implements zzpf {
    public static final U a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final U f8846b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final U f8847c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final U f8848d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final U f8849e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final U f8850f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final U f8851g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final U f8852h;

    static {
        zzhh zzhhVarD = new zzhh(zzgw.a("com.google.android.gms.measurement")).e().d();
        a = zzhhVarD.c("measurement.rb.attribution.ad_campaign_info", false);
        f8846b = zzhhVarD.c("measurement.rb.attribution.client2", true);
        zzhhVarD.c("measurement.rb.attribution.dma_fix", true);
        f8847c = zzhhVarD.c("measurement.rb.attribution.followup1.service", false);
        zzhhVarD.c("measurement.rb.attribution.index_out_of_bounds_fix", true);
        f8848d = zzhhVarD.c("measurement.rb.attribution.registration_regardless_consent", false);
        f8849e = zzhhVarD.c("measurement.rb.attribution.service", true);
        f8850f = zzhhVarD.c("measurement.rb.attribution.enable_trigger_redaction", true);
        f8851g = zzhhVarD.c("measurement.rb.attribution.uuid_generation", true);
        zzhhVarD.a("measurement.id.rb.attribution.improved_retry", 0L);
        f8852h = zzhhVarD.c("measurement.rb.attribution.improved_retry", true);
    }

    @Override // com.google.android.gms.internal.measurement.zzpf
    public final boolean a() {
        return ((Boolean) a.a()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzpf
    public final boolean c() {
        return ((Boolean) f8846b.a()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzpf
    public final boolean d() {
        return ((Boolean) f8847c.a()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzpf
    public final boolean e() {
        return ((Boolean) f8848d.a()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzpf
    public final boolean f() {
        return ((Boolean) f8849e.a()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzpf
    public final boolean g() {
        return ((Boolean) f8851g.a()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzpf
    public final boolean h() {
        return ((Boolean) f8852h.a()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzpf
    public final boolean j() {
        return ((Boolean) f8850f.a()).booleanValue();
    }
}
