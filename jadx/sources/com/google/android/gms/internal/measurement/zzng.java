package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes.dex */
public final class zzng implements zznd {
    public static final U a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final U f8793b;

    static {
        zzhh zzhhVarD = new zzhh(zzgw.a("com.google.android.gms.measurement")).e().d();
        a = zzhhVarD.c("measurement.consent_regional_defaults.client2", false);
        f8793b = zzhhVarD.c("measurement.consent_regional_defaults.service", false);
        zzhhVarD.a("measurement.id.consent_regional_defaults.service", 0L);
    }

    @Override // com.google.android.gms.internal.measurement.zznd
    public final boolean a() {
        return ((Boolean) a.a()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.zznd
    public final boolean c() {
        return ((Boolean) f8793b.a()).booleanValue();
    }
}
