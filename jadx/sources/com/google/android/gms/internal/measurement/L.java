package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes.dex */
public final class L implements zzjo {
    public static final L a = new L();

    @Override // com.google.android.gms.internal.measurement.zzjo
    public final boolean h(int i10) {
        zzfn.zzl.zza zzaVar;
        if (i10 != 1) {
            zzaVar = i10 != 2 ? null : zzfn.zzl.zza.PROVISIONING;
        } else {
            zzaVar = zzfn.zzl.zza.RADS;
        }
        return zzaVar != null;
    }
}
