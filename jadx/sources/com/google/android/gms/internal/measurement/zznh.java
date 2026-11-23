package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes.dex */
public final class zznh implements zzni {
    public static final U a;

    static {
        zzhh zzhhVarD = new zzhh(zzgw.a("com.google.android.gms.measurement")).e().d();
        zzhhVarD.c("measurement.client.consent_state_v1", true);
        zzhhVarD.c("measurement.client.3p_consent_state_v1", true);
        zzhhVarD.c("measurement.service.consent_state_v1_W36", true);
        a = zzhhVarD.a("measurement.service.storage_consent_support_version", 203600L);
    }

    @Override // com.google.android.gms.internal.measurement.zzni
    public final long b() {
        return ((Long) a.a()).longValue();
    }
}
