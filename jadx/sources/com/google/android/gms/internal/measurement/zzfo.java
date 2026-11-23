package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes.dex */
public enum zzfo implements zzjp {
    AT_TRACKING_MANAGER_AUTHORIZATION_STATUS_UNKNOWN(0),
    AT_TRACKING_MANAGER_AUTHORIZATION_STATUS_RESTRICTED(1),
    AT_TRACKING_MANAGER_AUTHORIZATION_STATUS_DENIED(2),
    AT_TRACKING_MANAGER_AUTHORIZATION_STATUS_AUTHORIZED(3),
    AT_TRACKING_MANAGER_AUTHORIZATION_STATUS_NOT_DETERMINED(4),
    AT_TRACKING_MANAGER_AUTHORIZATION_STATUS_NOT_CONFIGURED(5);


    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final int f8620s;

    zzfo(int i10) {
        this.f8620s = i10;
    }

    @Override // com.google.android.gms.internal.measurement.zzjp
    public final int b() {
        return this.f8620s;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "<" + zzfo.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.f8620s + " name=" + name() + '>';
    }
}
