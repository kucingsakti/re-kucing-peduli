package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes.dex */
public final class zzox implements zzoy {
    public static final U a;

    static {
        zzhh zzhhVarD = new zzhh(zzgw.a("com.google.android.gms.measurement")).e().d();
        zzhhVarD.c("measurement.sdk.collection.enable_extend_user_property_size", true);
        zzhhVarD.c("measurement.sdk.collection.last_deep_link_referrer2", true);
        a = zzhhVarD.c("measurement.sdk.collection.last_deep_link_referrer_campaign2", false);
        zzhhVarD.a("measurement.id.sdk.collection.last_deep_link_referrer2", 0L);
    }

    @Override // com.google.android.gms.internal.measurement.zzoy
    public final boolean b() {
        return ((Boolean) a.a()).booleanValue();
    }
}
