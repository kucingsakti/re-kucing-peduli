package com.google.android.gms.common.api;

import android.accounts.Account;
import android.content.Context;
import android.os.Build;
import android.os.Looper;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Api.ApiOptions;
import com.google.android.gms.common.api.internal.ApiExceptionMapper;
import com.google.android.gms.common.api.internal.ApiKey;
import com.google.android.gms.common.api.internal.GoogleApiManager;
import com.google.android.gms.common.api.internal.zabv;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.TelemetryLoggingOptions;
import com.google.android.gms.internal.base.zau;
import java.util.Collection;
import java.util.Collections;
import p212w.f;

/* JADX INFO: loaded from: classes.dex */
public abstract class GoogleApi<O extends Api.ApiOptions> implements HasApiKey<O> {
    public final Context a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f7851b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Api f7852c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final TelemetryLoggingOptions f7853d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ApiKey f7854e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f7855f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ApiExceptionMapper f7856g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final GoogleApiManager f7857h;

    @KeepForSdk
    public static class Settings {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final Settings f7858b;
        public final ApiExceptionMapper a;

        @KeepForSdk
        public static class Builder {
            public ApiExceptionMapper a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public Looper f7859b;

            @KeepForSdk
            public Builder() {
            }
        }

        static {
            Builder builder = new Builder();
            if (builder.a == null) {
                builder.a = new ApiExceptionMapper();
            }
            if (builder.f7859b == null) {
                builder.f7859b = Looper.getMainLooper();
            }
            f7858b = new Settings(builder.a, builder.f7859b);
        }

        public Settings(ApiExceptionMapper apiExceptionMapper, Looper looper) {
            this.a = apiExceptionMapper;
        }
    }

    public GoogleApi(Context context, Api api, TelemetryLoggingOptions telemetryLoggingOptions, Settings settings) {
        Preconditions.j(context, "Null context is not permitted.");
        Preconditions.j(api, "Api must not be null.");
        Preconditions.j(settings, "Settings must not be null; use Settings.DEFAULT_SETTINGS instead.");
        Context applicationContext = context.getApplicationContext();
        Preconditions.j(applicationContext, "The provided context did not have an application context.");
        this.a = applicationContext;
        String attributionTag = Build.VERSION.SDK_INT >= 30 ? context.getAttributionTag() : null;
        this.f7851b = attributionTag;
        this.f7852c = api;
        this.f7853d = telemetryLoggingOptions;
        this.f7854e = new ApiKey(api, telemetryLoggingOptions, attributionTag);
        new zabv();
        GoogleApiManager googleApiManagerE = GoogleApiManager.e(applicationContext);
        this.f7857h = googleApiManagerE;
        this.f7855f = googleApiManagerE.f7919z.getAndIncrement();
        this.f7856g = settings.a;
        zau zauVar = googleApiManagerE.f7910F;
        zauVar.sendMessage(zauVar.obtainMessage(7, this));
    }

    public final ClientSettings.Builder b() {
        GoogleSignInAccount googleSignInAccountO;
        GoogleSignInAccount googleSignInAccountO2;
        ClientSettings.Builder builder = new ClientSettings.Builder();
        Api.ApiOptions.NotRequiredOptions notRequiredOptions = this.f7853d;
        boolean z6 = notRequiredOptions instanceof Api.ApiOptions.HasGoogleSignInAccountOptions;
        Account accountG = null;
        if (z6 && (googleSignInAccountO2 = ((Api.ApiOptions.HasGoogleSignInAccountOptions) notRequiredOptions).o()) != null) {
            String str = googleSignInAccountO2.f7748v;
            if (str != null) {
                accountG = new Account(str, "com.google");
            }
        } else if (notRequiredOptions instanceof Api.ApiOptions.HasAccountOptions) {
            accountG = ((Api.ApiOptions.HasAccountOptions) notRequiredOptions).g();
        }
        builder.a = accountG;
        Collection collectionK = (!z6 || (googleSignInAccountO = ((Api.ApiOptions.HasGoogleSignInAccountOptions) notRequiredOptions).o()) == null) ? Collections.EMPTY_SET : googleSignInAccountO.K();
        if (builder.f8083b == null) {
            builder.f8083b = new f(0);
        }
        builder.f8083b.addAll(collectionK);
        Context context = this.a;
        builder.f8085d = context.getClass().getName();
        builder.f8084c = context.getPackageName();
        return builder;
    }
}
