package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.app.Application;
import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import android.os.Bundle;
import com.google.android.gms.common.annotation.KeepForSdk;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
@KeepForSdk
public final class BackgroundDetector implements Application.ActivityLifecycleCallbacks, ComponentCallbacks2 {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final BackgroundDetector f7888w = new BackgroundDetector();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final AtomicBoolean f7889s = new AtomicBoolean();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final AtomicBoolean f7890t = new AtomicBoolean();

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final ArrayList f7891u = new ArrayList();

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f7892v = false;

    @KeepForSdk
    public interface BackgroundStateChangeListener {
        void a(boolean z6);
    }

    @KeepForSdk
    private BackgroundDetector() {
    }

    public static void b(Application application) {
        BackgroundDetector backgroundDetector = f7888w;
        synchronized (backgroundDetector) {
            try {
                if (!backgroundDetector.f7892v) {
                    application.registerActivityLifecycleCallbacks(backgroundDetector);
                    application.registerComponentCallbacks(backgroundDetector);
                    backgroundDetector.f7892v = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void a(BackgroundStateChangeListener backgroundStateChangeListener) {
        synchronized (f7888w) {
            this.f7891u.add(backgroundStateChangeListener);
        }
    }

    public final void c(boolean z6) {
        synchronized (f7888w) {
            try {
                Iterator it = this.f7891u.iterator();
                while (it.hasNext()) {
                    ((BackgroundStateChangeListener) it.next()).a(z6);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        AtomicBoolean atomicBoolean = this.f7890t;
        boolean zCompareAndSet = this.f7889s.compareAndSet(true, false);
        atomicBoolean.set(true);
        if (zCompareAndSet) {
            c(false);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        AtomicBoolean atomicBoolean = this.f7890t;
        boolean zCompareAndSet = this.f7889s.compareAndSet(true, false);
        atomicBoolean.set(true);
        if (zCompareAndSet) {
            c(false);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i10) {
        if (i10 == 20 && this.f7889s.compareAndSet(false, true)) {
            this.f7890t.set(true);
            c(true);
        }
    }
}
