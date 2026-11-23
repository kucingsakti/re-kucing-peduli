package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Api.ApiOptions;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.TelemetryLoggingOptions;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
@KeepForSdk
public final class ApiKey<O extends Api.ApiOptions> {
    public final int a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Api f7885b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TelemetryLoggingOptions f7886c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f7887d;

    public ApiKey(Api api, TelemetryLoggingOptions telemetryLoggingOptions, String str) {
        this.f7885b = api;
        this.f7886c = telemetryLoggingOptions;
        this.f7887d = str;
        this.a = Arrays.hashCode(new Object[]{api, telemetryLoggingOptions, str});
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ApiKey)) {
            return false;
        }
        ApiKey apiKey = (ApiKey) obj;
        return Objects.a(this.f7885b, apiKey.f7885b) && Objects.a(this.f7886c, apiKey.f7886c) && Objects.a(this.f7887d, apiKey.f7887d);
    }

    public final int hashCode() {
        return this.a;
    }
}
