package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes.dex */
public final class zzol implements zzom {
    public static final U a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final U f8823b;

    static {
        zzhh zzhhVarD = new zzhh(zzgw.a("com.google.android.gms.measurement")).e().d();
        a = zzhhVarD.c("measurement.gbraid_campaign.gbraid.client.dev", false);
        f8823b = zzhhVarD.c("measurement.gbraid_campaign.gbraid.service", false);
        zzhhVarD.a("measurement.id.gbraid_campaign.service", 0L);
    }

    @Override // com.google.android.gms.internal.measurement.zzom
    public final boolean a() {
        return ((Boolean) a.a()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzom
    public final boolean c() {
        return ((Boolean) f8823b.a()).booleanValue();
    }
}
