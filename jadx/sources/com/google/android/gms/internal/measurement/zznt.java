package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes.dex */
public final class zznt implements zznu {
    public static final U a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final U f8805b;

    static {
        zzhh zzhhVarD = new zzhh(zzgw.a("com.google.android.gms.measurement")).e().d();
        zzhhVarD.c("measurement.dma_consent.client", true);
        zzhhVarD.c("measurement.dma_consent.client_bow_check2", true);
        zzhhVarD.c("measurement.dma_consent.separate_service_calls_fix", true);
        zzhhVarD.c("measurement.dma_consent.service", true);
        a = zzhhVarD.c("measurement.dma_consent.service_database_update_fix", true);
        zzhhVarD.c("measurement.dma_consent.service_dcu_event", true);
        f8805b = zzhhVarD.c("measurement.dma_consent.service_dcu_event2", true);
        zzhhVarD.c("measurement.dma_consent.service_npa_remote_default", true);
        zzhhVarD.c("measurement.dma_consent.service_split_batch_on_consent", true);
        zzhhVarD.c("measurement.dma_consent.set_consent_inline_on_worker", true);
    }

    @Override // com.google.android.gms.internal.measurement.zznu
    public final boolean a() {
        return ((Boolean) f8805b.a()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.zznu
    public final boolean b() {
        return ((Boolean) a.a()).booleanValue();
    }
}
