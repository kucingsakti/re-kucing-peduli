package I;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

/* JADX INFO: renamed from: I.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0242f implements Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public Object f1960s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public Activity f1961t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final int f1962u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f1963v = false;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f1964w = false;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f1965x = false;

    public C0242f(Activity activity) {
        this.f1961t = activity;
        this.f1962u = activity.hashCode();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        if (this.f1961t == activity) {
            this.f1961t = null;
            this.f1964w = true;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        if (!this.f1964w || this.f1965x || this.f1963v) {
            return;
        }
        Object obj = this.f1960s;
        try {
            Object obj2 = AbstractC0243g.f1967c.get(activity);
            if (obj2 == obj && activity.hashCode() == this.f1962u) {
                AbstractC0243g.f1971g.postAtFrontOfQueue(new C3.c(AbstractC0243g.f1966b.get(activity), 7, obj2));
                this.f1965x = true;
                this.f1960s = null;
            }
        } catch (Throwable unused) {
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        if (this.f1961t == activity) {
            this.f1963v = true;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }
}
