package com.google.firebase.analytics;

import D3.g;
import E3.a;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Keep;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.C0598w;
import com.google.android.gms.internal.measurement.zzdq;
import com.google.android.gms.measurement.internal.zzkk;
import com.google.android.gms.tasks.Tasks;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import p082i4.c;
import p082i4.d;

/* JADX INFO: loaded from: classes.dex */
public final class FirebaseAnalytics {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile FirebaseAnalytics f9980b;
    public final zzdq a;

    public FirebaseAnalytics(zzdq zzdqVar) {
        Preconditions.i(zzdqVar);
        this.a = zzdqVar;
    }

    @Keep
    public static FirebaseAnalytics getInstance(Context context) {
        if (f9980b == null) {
            synchronized (FirebaseAnalytics.class) {
                try {
                    if (f9980b == null) {
                        f9980b = new FirebaseAnalytics(zzdq.a(context, null));
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f9980b;
    }

    @Keep
    public static zzkk getScionFrontendApiImplementation(Context context, Bundle bundle) {
        zzdq zzdqVarA = zzdq.a(context, bundle);
        if (zzdqVarA == null) {
            return null;
        }
        return new a(zzdqVarA);
    }

    @Keep
    public final String getFirebaseInstanceId() {
        try {
            Object obj = c.f12268m;
            return (String) Tasks.b(((c) g.c().b(d.class)).d(), 30000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e10) {
            throw new IllegalStateException(e10);
        } catch (ExecutionException e11) {
            throw new IllegalStateException(e11.getCause());
        } catch (TimeoutException unused) {
            throw new IllegalThreadStateException("Firebase Installations getId Task has timed out.");
        }
    }

    @Keep
    @Deprecated
    public final void setCurrentScreen(Activity activity, String str, String str2) {
        zzdq zzdqVar = this.a;
        zzdqVar.getClass();
        zzdqVar.b(new C0598w(zzdqVar, activity, str, str2));
    }
}
