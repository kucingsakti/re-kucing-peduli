package com.onesignal.core.internal.application.impl;

import O3.z;
import android.app.Activity;
import android.app.Application;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.ViewTreeObserver;
import com.onesignal.common.AndroidUtils;
import java.lang.ref.WeakReference;
import p156q0.DialogInterfaceOnCancelListenerC0756o;
import p156q0.H;

/* JADX INFO: loaded from: classes.dex */
public final class a implements X4.f, Application.ActivityLifecycleCallbacks, ViewTreeObserver.OnGlobalLayoutListener {
    private Context _appContext;
    private Activity _current;
    private int activityReferences;
    private boolean isActivityChangingConfigurations;
    private boolean nextResumeIsFirstActivity;
    private final com.onesignal.common.events.b activityLifecycleNotifier = new com.onesignal.common.events.b();
    private final com.onesignal.common.events.b applicationLifecycleNotifier = new com.onesignal.common.events.b();
    private final com.onesignal.common.events.b systemConditionNotifier = new com.onesignal.common.events.b();
    private X4.b entryState = X4.b.APP_CLOSE;

    /* JADX INFO: renamed from: com.onesignal.core.internal.application.impl.a$a, reason: collision with other inner class name */
    public static final class C0019a extends p210v8.k implements p200u8.b {
        final /* synthetic */ Activity $value;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0019a(Activity activity) {
            super(1);
            this.$value = activity;
        }

        @Override // p200u8.b
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((X4.d) obj);
            return p076h8.m.a;
        }

        public final void invoke(X4.d dVar) {
            p210v8.i.f(dVar, "it");
            dVar.onActivityAvailable(this.$value);
        }
    }

    public static final class b extends X4.a {
        final /* synthetic */ Runnable $runnable;
        final /* synthetic */ a this$0;

        public b(Runnable runnable, a aVar) {
            this.$runnable = runnable;
            this.this$0 = aVar;
        }

        @Override // X4.a, X4.d
        public void onActivityAvailable(Activity activity) {
            p210v8.i.f(activity, "currentActivity");
            a.this.removeActivityLifecycleHandler(this);
            if (AndroidUtils.INSTANCE.isActivityFullyReady(activity)) {
                this.$runnable.run();
            } else {
                this.this$0.decorViewReady(activity, this.$runnable);
            }
        }
    }

    public static final class c extends p210v8.k implements p200u8.b {
        public static final c INSTANCE = new c();

        public c() {
            super(1);
        }

        @Override // p200u8.b
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((X4.e) obj);
            return p076h8.m.a;
        }

        public final void invoke(X4.e eVar) {
            p210v8.i.f(eVar, "it");
            eVar.onFocus(false);
        }
    }

    public static final class d extends p210v8.k implements p200u8.b {
        public static final d INSTANCE = new d();

        public d() {
            super(1);
        }

        @Override // p200u8.b
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((X4.e) obj);
            return p076h8.m.a;
        }

        public final void invoke(X4.e eVar) {
            p210v8.i.f(eVar, "it");
            eVar.onUnfocused();
        }
    }

    public static final class e extends p210v8.k implements p200u8.b {
        final /* synthetic */ Activity $activity;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Activity activity) {
            super(1);
            this.$activity = activity;
        }

        @Override // p200u8.b
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((X4.d) obj);
            return p076h8.m.a;
        }

        public final void invoke(X4.d dVar) {
            p210v8.i.f(dVar, "it");
            dVar.onActivityStopped(this.$activity);
        }
    }

    public static final class f extends p210v8.k implements p200u8.b {
        public static final f INSTANCE = new f();

        public f() {
            super(1);
        }

        @Override // p200u8.b
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((com.onesignal.core.internal.application.impl.b) obj);
            return p076h8.m.a;
        }

        public final void invoke(com.onesignal.core.internal.application.impl.b bVar) {
            p210v8.i.f(bVar, "it");
            bVar.systemConditionChanged();
        }
    }

    public static final class g extends p210v8.k implements p200u8.b {
        final /* synthetic */ Activity $activity;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(Activity activity) {
            super(1);
            this.$activity = activity;
        }

        @Override // p200u8.b
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((X4.d) obj);
            return p076h8.m.a;
        }

        public final void invoke(X4.d dVar) {
            p210v8.i.f(dVar, "it");
            dVar.onActivityStopped(this.$activity);
        }
    }

    public static final class h extends p210v8.k implements p200u8.b {
        final /* synthetic */ Activity $activity;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(Activity activity) {
            super(1);
            this.$activity = activity;
        }

        @Override // p200u8.b
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((X4.d) obj);
            return p076h8.m.a;
        }

        public final void invoke(X4.d dVar) {
            p210v8.i.f(dVar, "it");
            dVar.onActivityAvailable(this.$activity);
        }
    }

    public static final class i implements ComponentCallbacks {
        public i() {
        }

        @Override // android.content.ComponentCallbacks
        public void onConfigurationChanged(Configuration configuration) {
            p210v8.i.f(configuration, "newConfig");
            if (a.this.getCurrent() != null) {
                AndroidUtils androidUtils = AndroidUtils.INSTANCE;
                Activity current = a.this.getCurrent();
                p210v8.i.c(current);
                if (androidUtils.hasConfigChangeFlag(current, 128)) {
                    a aVar = a.this;
                    int i10 = configuration.orientation;
                    Activity current2 = aVar.getCurrent();
                    p210v8.i.c(current2);
                    aVar.onOrientationChanged(i10, current2);
                }
            }
        }

        @Override // android.content.ComponentCallbacks
        public void onLowMemory() {
        }
    }

    public static final class j extends p144o8.c {
        int label;
        /* synthetic */ Object result;

        public j(p123m8.d<? super j> dVar) {
            super(dVar);
        }

        @Override // p144o8.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return a.this.waitUntilActivityReady(this);
        }
    }

    public static final class k extends p144o8.c {
        int I$0;
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public k(p123m8.d<? super k> dVar) {
            super(dVar);
        }

        @Override // p144o8.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return a.this.waitUntilSystemConditionsAvailable(this);
        }
    }

    public static final class l extends H {
        final /* synthetic */ androidx.fragment.app.e $manager;
        final /* synthetic */ com.onesignal.common.threading.b $waiter;

        public l(androidx.fragment.app.e eVar, com.onesignal.common.threading.b bVar) {
            this.$manager = eVar;
            this.$waiter = bVar;
        }

        @Override // p156q0.H
        public void onFragmentDetached(androidx.fragment.app.e eVar, androidx.fragment.app.b bVar) {
            p210v8.i.f(eVar, "fm");
            p210v8.i.f(bVar, "fragmentDetached");
            if (bVar instanceof DialogInterfaceOnCancelListenerC0756o) {
                this.$manager.g0(this);
                this.$waiter.wake();
            }
        }
    }

    public static final class m implements com.onesignal.core.internal.application.impl.b {
        final /* synthetic */ com.onesignal.common.threading.b $waiter;

        public m(com.onesignal.common.threading.b bVar) {
            this.$waiter = bVar;
        }

        @Override // com.onesignal.core.internal.application.impl.b
        public void systemConditionChanged() {
            if (com.onesignal.common.c.INSTANCE.isKeyboardUp(new WeakReference<>(a.this.getCurrent()))) {
                return;
            }
            this.$waiter.wake();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: decorViewReady$lambda-1, reason: not valid java name */
    public static final void m10decorViewReady$lambda1(a aVar, Runnable runnable, a aVar2) {
        p210v8.i.f(aVar, "$self");
        p210v8.i.f(runnable, "$runnable");
        p210v8.i.f(aVar2, "this$0");
        aVar.addActivityLifecycleHandler(aVar.new b(runnable, aVar2));
    }

    private final boolean getWasInBackground() {
        return !isInForeground() || this.nextResumeIsFirstActivity;
    }

    private final void handleFocus() {
        if (!getWasInBackground()) {
            com.onesignal.debug.internal.logging.b.debug$default("ApplicationService.handleFocus: application never lost focus", null, 2, null);
            return;
        }
        com.onesignal.debug.internal.logging.b.debug$default("ApplicationService.handleFocus: application is now in focus, nextResumeIsFirstActivity=" + this.nextResumeIsFirstActivity, null, 2, null);
        this.nextResumeIsFirstActivity = false;
        if (getEntryState() != X4.b.NOTIFICATION_CLICK) {
            setEntryState(X4.b.APP_OPEN);
        }
        this.applicationLifecycleNotifier.fire(c.INSTANCE);
    }

    private final void handleLostFocus() {
        if (!isInForeground()) {
            com.onesignal.debug.internal.logging.b.debug$default("ApplicationService.handleLostFocus: application already out of focus", null, 2, null);
            return;
        }
        com.onesignal.debug.internal.logging.b.debug$default("ApplicationService.handleLostFocus: application is now out of focus", null, 2, null);
        setEntryState(X4.b.APP_CLOSE);
        this.applicationLifecycleNotifier.fire(d.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onOrientationChanged(int i10, Activity activity) {
        if (i10 == 1) {
            com.onesignal.debug.internal.logging.b.debug$default("ApplicationService.onOrientationChanged: Configuration Orientation Change: PORTRAIT (" + i10 + ") on activity: " + activity, null, 2, null);
        } else if (i10 == 2) {
            com.onesignal.debug.internal.logging.b.debug$default("ApplicationService.onOrientationChanged: Configuration Orientation Change: LANDSCAPE (" + i10 + ") on activity: " + activity, null, 2, null);
        }
        handleLostFocus();
        this.activityLifecycleNotifier.fire(new g(activity));
        this.activityLifecycleNotifier.fire(new h(activity));
        activity.getWindow().getDecorView().getViewTreeObserver().addOnGlobalLayoutListener(this);
        handleFocus();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: waitUntilActivityReady$lambda-0, reason: not valid java name */
    public static final void m11waitUntilActivityReady$lambda0(com.onesignal.common.threading.b bVar) {
        p210v8.i.f(bVar, "$waiter");
        bVar.wake();
    }

    @Override // X4.f
    public void addActivityLifecycleHandler(X4.d dVar) {
        p210v8.i.f(dVar, "handler");
        this.activityLifecycleNotifier.subscribe(dVar);
        if (getCurrent() != null) {
            Activity current = getCurrent();
            p210v8.i.c(current);
            dVar.onActivityAvailable(current);
        }
    }

    @Override // X4.f
    public void addApplicationLifecycleHandler(X4.e eVar) {
        p210v8.i.f(eVar, "handler");
        this.applicationLifecycleNotifier.subscribe(eVar);
        if (getCurrent() != null) {
            eVar.onFocus(true);
        }
    }

    public final void decorViewReady(Activity activity, Runnable runnable) {
        p210v8.i.f(activity, "activity");
        p210v8.i.f(runnable, "runnable");
        runnable.toString();
        activity.getWindow().getDecorView().post(new z(this, runnable, this, 2));
    }

    @Override // X4.f
    public Context getAppContext() {
        Context context = this._appContext;
        p210v8.i.c(context);
        return context;
    }

    @Override // X4.f
    public Activity getCurrent() {
        return this._current;
    }

    @Override // X4.f
    public X4.b getEntryState() {
        return this.entryState;
    }

    @Override // X4.f
    public boolean isInForeground() {
        return getEntryState().isAppOpen() || getEntryState().isNotificationClick();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        p210v8.i.f(activity, "activity");
        com.onesignal.debug.internal.logging.b.debug$default("ApplicationService.onActivityCreated(" + this.activityReferences + ',' + getEntryState() + "): " + activity, null, 2, null);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        p210v8.i.f(activity, "activity");
        com.onesignal.debug.internal.logging.b.debug$default("ApplicationService.onActivityDestroyed(" + this.activityReferences + ',' + getEntryState() + "): " + activity, null, 2, null);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        p210v8.i.f(activity, "activity");
        com.onesignal.debug.internal.logging.b.debug$default("ApplicationService.onActivityPaused(" + this.activityReferences + ',' + getEntryState() + "): " + activity, null, 2, null);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        p210v8.i.f(activity, "activity");
        com.onesignal.debug.internal.logging.b.debug$default("ApplicationService.onActivityResumed(" + this.activityReferences + ',' + getEntryState() + "): " + activity, null, 2, null);
        if (!p210v8.i.a(getCurrent(), activity)) {
            setCurrent(activity);
        }
        if (!getWasInBackground() || this.isActivityChangingConfigurations) {
            return;
        }
        this.activityReferences = 1;
        handleFocus();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        p210v8.i.f(activity, "p0");
        p210v8.i.f(bundle, "p1");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        p210v8.i.f(activity, "activity");
        com.onesignal.debug.internal.logging.b.debug$default("ApplicationService.onActivityStarted(" + this.activityReferences + ',' + getEntryState() + "): " + activity, null, 2, null);
        if (p210v8.i.a(getCurrent(), activity)) {
            return;
        }
        setCurrent(activity);
        if (!getWasInBackground() || this.isActivityChangingConfigurations) {
            this.activityReferences++;
        } else {
            this.activityReferences = 1;
            handleFocus();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        p210v8.i.f(activity, "activity");
        com.onesignal.debug.internal.logging.b.debug$default("ApplicationService.onActivityStopped(" + this.activityReferences + ',' + getEntryState() + "): " + activity, null, 2, null);
        boolean zIsChangingConfigurations = activity.isChangingConfigurations();
        this.isActivityChangingConfigurations = zIsChangingConfigurations;
        if (!zIsChangingConfigurations) {
            int i10 = this.activityReferences - 1;
            this.activityReferences = i10;
            if (i10 <= 0) {
                setCurrent(null);
                this.activityReferences = 0;
                handleLostFocus();
            }
        }
        this.activityLifecycleNotifier.fire(new e(activity));
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        this.systemConditionNotifier.fire(f.INSTANCE);
    }

    @Override // X4.f
    public void removeActivityLifecycleHandler(X4.d dVar) {
        p210v8.i.f(dVar, "handler");
        this.activityLifecycleNotifier.unsubscribe(dVar);
    }

    @Override // X4.f
    public void removeApplicationLifecycleHandler(X4.e eVar) {
        p210v8.i.f(eVar, "handler");
        this.applicationLifecycleNotifier.unsubscribe(eVar);
    }

    public void setCurrent(Activity activity) {
        this._current = activity;
        com.onesignal.debug.internal.logging.b.debug$default("ApplicationService: current activity=" + getCurrent(), null, 2, null);
        if (activity != null) {
            this.activityLifecycleNotifier.fire(new C0019a(activity));
            try {
                activity.getWindow().getDecorView().getViewTreeObserver().addOnGlobalLayoutListener(this);
            } catch (RuntimeException e10) {
                e10.printStackTrace();
            }
        }
    }

    @Override // X4.f
    public void setEntryState(X4.b bVar) {
        p210v8.i.f(bVar, "<set-?>");
        this.entryState = bVar;
    }

    public final void start(Context context) {
        p210v8.i.f(context, "context");
        this._appContext = context;
        Context applicationContext = context.getApplicationContext();
        p210v8.i.d(applicationContext, "null cannot be cast to non-null type android.app.Application");
        Application application = (Application) applicationContext;
        application.registerActivityLifecycleCallbacks(this);
        application.registerComponentCallbacks(new i());
        boolean z6 = context instanceof Activity;
        boolean z10 = getCurrent() == null;
        if (!z10 || z6) {
            setEntryState(X4.b.APP_OPEN);
            if (z10 && z6) {
                setCurrent((Activity) context);
                this.activityReferences = 1;
                this.nextResumeIsFirstActivity = false;
            }
        } else {
            this.nextResumeIsFirstActivity = true;
            setEntryState(X4.b.APP_CLOSE);
        }
        com.onesignal.debug.internal.logging.b.debug$default("ApplicationService.init: entryState=" + getEntryState(), null, 2, null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // X4.f
    public Object waitUntilActivityReady(p123m8.d<? super Boolean> dVar) {
        j jVar;
        if (dVar instanceof j) {
            jVar = (j) dVar;
            int i10 = jVar.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                jVar.label = i10 - Integer.MIN_VALUE;
            } else {
                jVar = new j(dVar);
            }
        } else {
            jVar = new j(dVar);
        }
        Object obj = jVar.result;
        p134n8.a aVar = p134n8.a.f13404s;
        int i11 = jVar.label;
        if (i11 == 0) {
            J7.a.v(obj);
            Activity current = getCurrent();
            if (current == null) {
                return Boolean.FALSE;
            }
            com.onesignal.common.threading.b bVar = new com.onesignal.common.threading.b();
            decorViewReady(current, new B6.d(bVar, 7));
            jVar.label = 1;
            if (bVar.waitForWake(jVar) == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            J7.a.v(obj);
        }
        return Boolean.TRUE;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0074  */
    /* JADX WARN: Code duplicated, block: B:31:0x0078  */
    /* JADX WARN: Code duplicated, block: B:33:0x0080  */
    /* JADX WARN: Code duplicated, block: B:39:0x0099 A[Catch: NoClassDefFoundError -> 0x00ee, TryCatch #0 {NoClassDefFoundError -> 0x00ee, blocks: (B:37:0x0095, B:39:0x0099, B:41:0x00b8, B:43:0x00be, B:45:0x00c2), top: B:63:0x0095 }] */
    /* JADX WARN: Code duplicated, block: B:56:0x0122  */
    /* JADX WARN: Code duplicated, block: B:59:0x0134  */
    /* JADX WARN: Code duplicated, block: B:63:0x0095 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x008c, code lost:
    
        if (N9.AbstractC0342z.e(100, r0) == r1) goto L58;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x008c -> B:22:0x005a). Please report as a decompilation issue!!! */
    @Override // X4.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object waitUntilSystemConditionsAvailable(p123m8.d<? super java.lang.Boolean> r12) {
        /*
            Method dump skipped, instruction units count: 318
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onesignal.core.internal.application.impl.a.waitUntilSystemConditionsAvailable(m8.d):java.lang.Object");
    }
}
