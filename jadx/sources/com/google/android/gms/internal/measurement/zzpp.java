package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes.dex */
public final class zzpp implements zzpq {
    public static final U a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final U f8858b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final U f8859c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final U f8860d;

    static {
        zzhh zzhhVarD = new zzhh(zzgw.a("com.google.android.gms.measurement")).e().d();
        a = zzhhVarD.c("measurement.sgtm.google_signal.enable", false);
        f8858b = zzhhVarD.c("measurement.sgtm.preview_mode_enabled", true);
        f8859c = zzhhVarD.c("measurement.sgtm.service", true);
        f8860d = zzhhVarD.c("measurement.sgtm.upload_queue", false);
        zzhhVarD.a("measurement.id.sgtm", 0L);
    }

    @Override // com.google.android.gms.internal.measurement.zzpq
    public final boolean a() {
        return ((Boolean) a.a()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzpq
    public final boolean c() {
        return ((Boolean) f8858b.a()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzpq
    public final boolean d() {
        return ((Boolean) f8859c.a()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzpq
    public final boolean e() {
        return ((Boolean) f8860d.a()).booleanValue();
    }
}
