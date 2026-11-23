package com.google.android.gms.ads.identifier;

import P2.f;
import android.content.Context;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.internal.MethodInvocation;
import com.google.android.gms.common.internal.TelemetryData;
import com.google.android.gms.common.internal.TelemetryLoggingClient;
import com.google.android.gms.common.internal.TelemetryLoggingOptions;
import com.google.android.gms.common.internal.service.zao;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.TaskExecutors;
import java.time.Duration;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes.dex */
public final class zzd {
    private static volatile zzd zza;
    private static final Object zzb = new Object();
    private static final Duration zzc = Duration.ofMinutes(30);
    private final TelemetryLoggingClient zzd;
    private final AtomicLong zze = new AtomicLong(-1);

    private zzd(Context context, String str) {
        TelemetryLoggingOptions telemetryLoggingOptions = TelemetryLoggingOptions.f8133t;
        TelemetryLoggingOptions.Builder builder = new TelemetryLoggingOptions.Builder();
        builder.a = "ads_identifier:api";
        this.zzd = new zao(context, zao.f8138i, new TelemetryLoggingOptions(builder.a), GoogleApi.Settings.f7858b);
    }

    public static zzd zza(Context context) {
        if (zza == null) {
            synchronized (zzb) {
                try {
                    if (zza == null) {
                        zza = new zzd(context, "ads_identifier:api");
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return zza;
    }

    public static void zzb(zzd zzdVar, long j, Exception exc) {
        ConnectionResult connectionResult;
        Log.i("AdvertisingIdClient", "getting error as ".concat(String.valueOf(exc.getMessage())));
        if ((exc instanceof ApiException) && (connectionResult = ((ApiException) exc).f7849s.f7883v) != null && connectionResult.f7822t == 24) {
            zzdVar.zze.set(j);
        }
    }

    public final synchronized void zzc(int i10, int i11, long j, long j10, int i12) {
        AtomicLong atomicLong = this.zze;
        final long jElapsedRealtime = SystemClock.elapsedRealtime();
        Log.i("AdvertisingIdClient", "shouldSendLog " + atomicLong.get());
        if (this.zze.get() == -1 || jElapsedRealtime - this.zze.get() > zzc.toMillis()) {
            TelemetryLoggingClient telemetryLoggingClient = this.zzd;
            if (telemetryLoggingClient != null) {
                f fVarA = telemetryLoggingClient.a(new TelemetryData(Arrays.asList(new MethodInvocation(35401, i11, 0, j, j10, null, null, 0, i12)), 0));
                OnFailureListener onFailureListener = new OnFailureListener() { // from class: com.google.android.gms.ads.identifier.zzc
                    @Override // com.google.android.gms.tasks.OnFailureListener
                    public final void onFailure(Exception exc) {
                        zzd.zzb(this.zza, jElapsedRealtime, exc);
                    }
                };
                fVarA.getClass();
                fVarA.b(TaskExecutors.a, onFailureListener);
            }
        }
    }
}
