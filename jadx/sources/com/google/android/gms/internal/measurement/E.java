package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes.dex */
public final class E implements zzjo {
    public static final E a = new E();

    @Override // com.google.android.gms.internal.measurement.zzjo
    public final boolean h(int i10) {
        zzff.zzf.zza zzaVar;
        switch (i10) {
            case 0:
                zzaVar = zzff.zzf.zza.UNKNOWN_MATCH_TYPE;
                break;
            case 1:
                zzaVar = zzff.zzf.zza.REGEXP;
                break;
            case 2:
                zzaVar = zzff.zzf.zza.BEGINS_WITH;
                break;
            case 3:
                zzaVar = zzff.zzf.zza.ENDS_WITH;
                break;
            case 4:
                zzaVar = zzff.zzf.zza.PARTIAL;
                break;
            case 5:
                zzaVar = zzff.zzf.zza.EXACT;
                break;
            case 6:
                zzaVar = zzff.zzf.zza.IN_LIST;
                break;
            default:
                zzaVar = null;
                break;
        }
        return zzaVar != null;
    }
}
