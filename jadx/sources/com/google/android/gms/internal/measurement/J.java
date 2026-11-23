package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes.dex */
public final class J implements zzjo {
    public static final J a = new J();

    @Override // com.google.android.gms.internal.measurement.zzjo
    public final boolean h(int i10) {
        zzfo zzfoVar;
        if (i10 == 0) {
            zzfoVar = zzfo.AT_TRACKING_MANAGER_AUTHORIZATION_STATUS_UNKNOWN;
        } else if (i10 == 1) {
            zzfoVar = zzfo.AT_TRACKING_MANAGER_AUTHORIZATION_STATUS_RESTRICTED;
        } else if (i10 == 2) {
            zzfoVar = zzfo.AT_TRACKING_MANAGER_AUTHORIZATION_STATUS_DENIED;
        } else if (i10 == 3) {
            zzfoVar = zzfo.AT_TRACKING_MANAGER_AUTHORIZATION_STATUS_AUTHORIZED;
        } else if (i10 != 4) {
            zzfoVar = i10 != 5 ? null : zzfo.AT_TRACKING_MANAGER_AUTHORIZATION_STATUS_NOT_CONFIGURED;
        } else {
            zzfoVar = zzfo.AT_TRACKING_MANAGER_AUTHORIZATION_STATUS_NOT_DETERMINED;
        }
        return zzfoVar != null;
    }
}
