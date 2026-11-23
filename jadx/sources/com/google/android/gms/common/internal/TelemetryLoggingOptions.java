package com.google.android.gms.common.internal;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Api;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
@KeepForSdk
public class TelemetryLoggingOptions implements Api.ApiOptions.Optional {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final TelemetryLoggingOptions f8133t = new TelemetryLoggingOptions(new Builder().a);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final String f8134s;

    @KeepForSdk
    public static class Builder {
        public String a;

        private Builder() {
        }
    }

    public /* synthetic */ TelemetryLoggingOptions(String str) {
        this.f8134s = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof TelemetryLoggingOptions) {
            return Objects.a(this.f8134s, ((TelemetryLoggingOptions) obj).f8134s);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f8134s});
    }
}
