package com.google.android.gms.internal.measurement;

import android.app.Application;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.android.gms.measurement.internal.zzhd;
import com.kcstream.cing.R;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public class zzdq {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static volatile zzdq f8565i;
    public final String a = "FA";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final DefaultClock f8566b = DefaultClock.a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ExecutorService f8567c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AppMeasurementSdk f8568d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ArrayList f8569e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f8570f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f8571g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public volatile zzdb f8572h;

    public zzdq(Context context, Bundle bundle) {
        String packageName;
        int i10 = 0;
        ThreadFactoryC0600y threadFactoryC0600y = new ThreadFactoryC0600y();
        threadFactoryC0600y.f8444s = Executors.defaultThreadFactory();
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), threadFactoryC0600y);
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        this.f8567c = Executors.unconfigurableExecutorService(threadPoolExecutor);
        this.f8568d = new AppMeasurementSdk(this);
        this.f8569e = new ArrayList();
        try {
            try {
                packageName = context.getResources().getResourcePackageName(R.string.common_google_play_services_unknown_issue);
            } catch (Resources.NotFoundException unused) {
                packageName = context.getPackageName();
            }
            if (new zzhd(context, packageName).a("google_app_id") != null) {
                try {
                    Class.forName("com.google.firebase.analytics.FirebaseAnalytics", false, getClass().getClassLoader());
                } catch (ClassNotFoundException unused2) {
                    this.f8571g = true;
                    Log.w(this.a, "Disabling data collection. Found google_app_id in strings.xml but Google Analytics for Firebase is missing. Remove this value or add Google Analytics for Firebase to resume data collection.");
                    return;
                }
            }
        } catch (IllegalStateException unused3) {
        }
        b(new C0590q(this, context, bundle, i10));
        Application application = (Application) context.getApplicationContext();
        if (application == null) {
            Log.w(this.a, "Unable to register lifecycle notifications. Application null.");
        } else {
            application.registerActivityLifecycleCallbacks(new C0595t(this));
        }
    }

    public static zzdq a(Context context, Bundle bundle) {
        Preconditions.i(context);
        if (f8565i == null) {
            synchronized (zzdq.class) {
                try {
                    if (f8565i == null) {
                        f8565i = new zzdq(context, bundle);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f8565i;
    }

    public final void b(r rVar) {
        this.f8567c.execute(rVar);
    }

    public final void c(Exception exc, boolean z6, boolean z10) {
        this.f8571g |= z6;
        String str = this.a;
        if (z6) {
            Log.w(str, "Data collection startup failed. No data will be collected.", exc);
            return;
        }
        if (z10) {
            b(new C0596u(this, exc));
        }
        Log.w(str, "Error with data collection. Data lost.", exc);
    }
}
