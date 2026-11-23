package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.app.Fragment;
import android.os.Build;
import android.os.Bundle;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0017\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0007"}, d2 = {"Landroidx/lifecycle/I;", "Landroid/app/Fragment;", "<init>", "()V", "V/h", "androidx/lifecycle/G", R5.a.PUSH_ADDITIONAL_DATA_KEY, "lifecycle-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public class I extends Fragment {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ int f6723t = 0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public V.h f6724s;

    public static final class a implements Application.ActivityLifecycleCallbacks {
        public static final H Companion = new H();

        public static final void registerIn(Activity activity) {
            Companion.getClass();
            p210v8.i.f(activity, "activity");
            activity.registerActivityLifecycleCallbacks(new a());
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            p210v8.i.f(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            p210v8.i.f(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            p210v8.i.f(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostCreated(Activity activity, Bundle bundle) {
            p210v8.i.f(activity, "activity");
            int i10 = I.f6723t;
            G.a(activity, EnumC0518m.ON_CREATE);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostResumed(Activity activity) {
            p210v8.i.f(activity, "activity");
            int i10 = I.f6723t;
            G.a(activity, EnumC0518m.ON_RESUME);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostStarted(Activity activity) {
            p210v8.i.f(activity, "activity");
            int i10 = I.f6723t;
            G.a(activity, EnumC0518m.ON_START);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreDestroyed(Activity activity) {
            p210v8.i.f(activity, "activity");
            int i10 = I.f6723t;
            G.a(activity, EnumC0518m.ON_DESTROY);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPrePaused(Activity activity) {
            p210v8.i.f(activity, "activity");
            int i10 = I.f6723t;
            G.a(activity, EnumC0518m.ON_PAUSE);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreStopped(Activity activity) {
            p210v8.i.f(activity, "activity");
            int i10 = I.f6723t;
            G.a(activity, EnumC0518m.ON_STOP);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
            p210v8.i.f(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            p210v8.i.f(activity, "activity");
            p210v8.i.f(bundle, "bundle");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            p210v8.i.f(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
            p210v8.i.f(activity, "activity");
        }
    }

    public final void a(EnumC0518m enumC0518m) {
        if (Build.VERSION.SDK_INT < 29) {
            Activity activity = getActivity();
            p210v8.i.e(activity, "activity");
            G.a(activity, enumC0518m);
        }
    }

    @Override // android.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        a(EnumC0518m.ON_CREATE);
    }

    @Override // android.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        a(EnumC0518m.ON_DESTROY);
        this.f6724s = null;
    }

    @Override // android.app.Fragment
    public final void onPause() {
        super.onPause();
        a(EnumC0518m.ON_PAUSE);
    }

    @Override // android.app.Fragment
    public final void onResume() {
        super.onResume();
        V.h hVar = this.f6724s;
        if (hVar != null) {
            ((F) hVar.f5078t).b();
        }
        a(EnumC0518m.ON_RESUME);
    }

    @Override // android.app.Fragment
    public final void onStart() {
        super.onStart();
        V.h hVar = this.f6724s;
        if (hVar != null) {
            F f10 = (F) hVar.f5078t;
            int i10 = f10.f6715s + 1;
            f10.f6715s = i10;
            if (i10 == 1 && f10.f6718v) {
                f10.f6720x.d(EnumC0518m.ON_START);
                f10.f6718v = false;
            }
        }
        a(EnumC0518m.ON_START);
    }

    @Override // android.app.Fragment
    public final void onStop() {
        super.onStop();
        a(EnumC0518m.ON_STOP);
    }
}
