package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes.dex */
public final class zznz implements zzoa {
    public static final U a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final U f8811b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final U f8812c;

    static {
        zzhh zzhhVarD = new zzhh(zzgw.a("com.google.android.gms.measurement")).e().d();
        zzhhVarD.c("measurement.client.ad_id_consent_fix", true);
        zzhhVarD.c("measurement.service.consent.aiid_reset_fix", false);
        zzhhVarD.c("measurement.service.consent.aiid_reset_fix2", true);
        a = zzhhVarD.c("measurement.service.consent.app_start_fix", true);
        f8811b = zzhhVarD.c("measurement.service.consent.params_on_fx", true);
        f8812c = zzhhVarD.c("measurement.service.consent.pfo_on_fx", true);
    }

    @Override // com.google.android.gms.internal.measurement.zzoa
    public final boolean a() {
        return ((Boolean) f8811b.a()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzoa
    public final boolean b() {
        return ((Boolean) a.a()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzoa
    public final boolean c() {
        return ((Boolean) f8812c.a()).booleanValue();
    }
}
