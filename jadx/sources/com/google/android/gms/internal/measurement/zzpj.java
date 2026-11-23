package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes.dex */
public final class zzpj implements zzpk {
    public static final U a;

    static {
        zzhh zzhhVarD = new zzhh(zzgw.a("com.google.android.gms.measurement")).e().d();
        zzhhVarD.c("measurement.collection.enable_session_stitching_token.client.dev", true);
        zzhhVarD.c("measurement.collection.enable_session_stitching_token.first_open_fix", true);
        a = zzhhVarD.c("measurement.session_stitching_token_enabled", false);
        zzhhVarD.c("measurement.link_sst_to_sid", true);
    }

    @Override // com.google.android.gms.internal.measurement.zzpk
    public final boolean a() {
        return ((Boolean) a.a()).booleanValue();
    }
}
