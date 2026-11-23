package p182s4;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import o1.h;
import p076h8.m;
import p210v8.i;

/* JADX INFO: loaded from: classes.dex */
public final class W implements Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final W f14653s = new W();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static boolean f14654t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static h f14655u;

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        i.f(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        i.f(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        i.f(activity, "activity");
        h hVar = f14655u;
        if (hVar != null) {
            hVar.r(2);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        m mVar;
        i.f(activity, "activity");
        h hVar = f14655u;
        if (hVar != null) {
            hVar.r(1);
            mVar = m.a;
        } else {
            mVar = null;
        }
        if (mVar == null) {
            f14654t = true;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        i.f(activity, "activity");
        i.f(bundle, "outState");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        i.f(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        i.f(activity, "activity");
    }
}
