package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes.dex */
public final class zzpo implements zzpl {
    public static final U a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final U f8857b;

    static {
        zzhh zzhhVarD = new zzhh(zzgw.a("com.google.android.gms.measurement")).e().d();
        zzhhVarD.c("measurement.client.sessions.background_sessions_enabled", true);
        a = zzhhVarD.c("measurement.client.sessions.enable_fix_background_engagement", false);
        zzhhVarD.c("measurement.client.sessions.immediate_start_enabled_foreground", true);
        f8857b = zzhhVarD.c("measurement.client.sessions.enable_pause_engagement_in_background", true);
        zzhhVarD.c("measurement.client.sessions.remove_expired_session_properties_enabled", true);
        zzhhVarD.c("measurement.client.sessions.session_id_enabled", true);
        zzhhVarD.a("measurement.id.client.sessions.enable_fix_background_engagement", 0L);
    }

    @Override // com.google.android.gms.internal.measurement.zzpl
    public final boolean a() {
        return ((Boolean) f8857b.a()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzpl
    public final boolean b() {
        return ((Boolean) a.a()).booleanValue();
    }
}
