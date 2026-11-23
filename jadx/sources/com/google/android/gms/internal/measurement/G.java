package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes.dex */
public final class G implements zzjo {
    public static final G a = new G();

    @Override // com.google.android.gms.internal.measurement.zzjo
    public final boolean h(int i10) {
        zzfi.zza.zzd zzdVar;
        if (i10 == 0) {
            zzdVar = zzfi.zza.zzd.CONSENT_STATUS_UNSPECIFIED;
        } else if (i10 != 1) {
            zzdVar = i10 != 2 ? null : zzfi.zza.zzd.DENIED;
        } else {
            zzdVar = zzfi.zza.zzd.GRANTED;
        }
        return zzdVar != null;
    }
}
