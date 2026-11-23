package androidx.lifecycle;

import android.app.Activity;
import android.app.Fragment;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;

/* JADX INFO: loaded from: classes.dex */
public final class E extends AbstractC0512g {
    final /* synthetic */ F this$0;

    public static final class a extends AbstractC0512g {
        final /* synthetic */ F this$0;

        public a(F f10) {
            this.this$0 = f10;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostResumed(Activity activity) {
            p210v8.i.f(activity, "activity");
            this.this$0.b();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostStarted(Activity activity) {
            p210v8.i.f(activity, "activity");
            F f10 = this.this$0;
            int i10 = f10.f6715s + 1;
            f10.f6715s = i10;
            if (i10 == 1 && f10.f6718v) {
                f10.f6720x.d(EnumC0518m.ON_START);
                f10.f6718v = false;
            }
        }
    }

    public E(F f10) {
        this.this$0 = f10;
    }

    @Override // androidx.lifecycle.AbstractC0512g, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        p210v8.i.f(activity, "activity");
        if (Build.VERSION.SDK_INT < 29) {
            int i10 = I.f6723t;
            Fragment fragmentFindFragmentByTag = activity.getFragmentManager().findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag");
            p210v8.i.d(fragmentFindFragmentByTag, "null cannot be cast to non-null type androidx.lifecycle.ReportFragment");
            ((I) fragmentFindFragmentByTag).f6724s = this.this$0.f6722z;
        }
    }

    @Override // androidx.lifecycle.AbstractC0512g, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        p210v8.i.f(activity, "activity");
        F f10 = this.this$0;
        int i10 = f10.f6716t - 1;
        f10.f6716t = i10;
        if (i10 == 0) {
            Handler handler = f10.f6719w;
            p210v8.i.c(handler);
            handler.postDelayed(f10.f6721y, 700L);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPreCreated(Activity activity, Bundle bundle) {
        p210v8.i.f(activity, "activity");
        D.a(activity, new a(this.this$0));
    }

    @Override // androidx.lifecycle.AbstractC0512g, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        p210v8.i.f(activity, "activity");
        F f10 = this.this$0;
        int i10 = f10.f6715s - 1;
        f10.f6715s = i10;
        if (i10 == 0 && f10.f6717u) {
            f10.f6720x.d(EnumC0518m.ON_STOP);
            f10.f6718v = true;
        }
    }
}
