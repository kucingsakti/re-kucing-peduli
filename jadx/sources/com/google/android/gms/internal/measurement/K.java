package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes.dex */
public final class K implements zzjo {
    public static final K a = new K();

    @Override // com.google.android.gms.internal.measurement.zzjo
    public final boolean h(int i10) {
        zzfn.zzj.zza zzaVar;
        if (i10 != 0) {
            zzaVar = i10 != 1 ? null : zzfn.zzj.zza.SGTM;
        } else {
            zzaVar = zzfn.zzj.zza.SDK;
        }
        return zzaVar != null;
    }
}
