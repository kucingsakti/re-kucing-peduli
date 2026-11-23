package com.google.android.gms.common.internal;

import com.google.android.gms.common.annotation.KeepForSdk;

/* JADX INFO: loaded from: classes.dex */
@KeepForSdk
public final class RootTelemetryConfigManager {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static RootTelemetryConfigManager f8123b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final RootTelemetryConfiguration f8124c = new RootTelemetryConfiguration(0, 0, 0, false, false);
    public RootTelemetryConfiguration a;

    private RootTelemetryConfigManager() {
    }

    public static synchronized RootTelemetryConfigManager a() {
        try {
            if (f8123b == null) {
                f8123b = new RootTelemetryConfigManager();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f8123b;
    }
}
