package com.onesignal.notifications.internal.permissions.impl;

import J5.r;
import N9.A0;
import N9.AbstractC0337u;
import N9.AbstractC0342z;
import N9.InterfaceC0341y;
import N9.T;
import N9.V;
import N9.s0;
import N9.t0;
import android.app.Activity;
import android.os.Build;
import com.onesignal.common.AndroidUtils;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;
import p076h8.m;
import p210v8.k;

/* JADX INFO: loaded from: classes.dex */
public final class b implements p083i5.e, p017b6.b {
    private static final String ANDROID_PERMISSION_STRING = "android.permission.POST_NOTIFICATIONS";
    public static final C0071b Companion = new C0071b(null);
    private static final String PERMISSION_TYPE = "NOTIFICATION";
    private final X4.f _application;
    private final X4.f _applicationService;
    private final com.onesignal.core.internal.config.b _configModelStore;
    private final p093j5.b _preferenceService;
    private final p083i5.f _requestPermission;
    private final InterfaceC0341y coroutineScope;
    private boolean enabled;
    private final com.onesignal.common.events.b events;
    private long pollingWaitInterval;
    private final com.onesignal.common.threading.b pollingWaiter;
    private final boolean supportsNativePrompt;
    private final com.onesignal.common.threading.c waiter;

    public static final class a extends p144o8.g implements p200u8.c {
        int label;

        public a(p123m8.d<? super a> dVar) {
            super(2, dVar);
        }

        @Override // p144o8.a
        public final p123m8.d<m> create(Object obj, p123m8.d<?> dVar) {
            return b.this.new a(dVar);
        }

        @Override // p200u8.c
        public final Object invoke(InterfaceC0341y interfaceC0341y, p123m8.d<? super m> dVar) {
            return ((a) create(interfaceC0341y, dVar)).invokeSuspend(m.a);
        }

        @Override // p144o8.a
        public final Object invokeSuspend(Object obj) {
            p134n8.a aVar = p134n8.a.f13404s;
            int i10 = this.label;
            if (i10 == 0) {
                J7.a.v(obj);
                b bVar = b.this;
                this.label = 1;
                if (bVar.pollForPermission(this) == aVar) {
                    return aVar;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                J7.a.v(obj);
            }
            return m.a;
        }
    }

    /* JADX INFO: renamed from: com.onesignal.notifications.internal.permissions.impl.b$b, reason: collision with other inner class name */
    public static final class C0071b {
        public /* synthetic */ C0071b(p210v8.e eVar) {
            this();
        }

        private C0071b() {
        }
    }

    public static final class c extends k implements p200u8.b {
        final /* synthetic */ boolean $enabled;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(boolean z6) {
            super(1);
            this.$enabled = z6;
        }

        @Override // p200u8.b
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((p017b6.a) obj);
            return m.a;
        }

        public final void invoke(p017b6.a aVar) {
            p210v8.i.f(aVar, "it");
            aVar.onNotificationPermissionChanged(this.$enabled);
        }
    }

    public static final class d extends p144o8.c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public d(p123m8.d<? super d> dVar) {
            super(dVar);
        }

        @Override // p144o8.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return b.this.pollForPermission(this);
        }
    }

    public static final class e extends k implements p200u8.b {
        final /* synthetic */ boolean $enabled;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(boolean z6) {
            super(1);
            this.$enabled = z6;
        }

        @Override // p200u8.b
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((p017b6.a) obj);
            return m.a;
        }

        public final void invoke(p017b6.a aVar) {
            p210v8.i.f(aVar, "it");
            aVar.onNotificationPermissionChanged(this.$enabled);
        }
    }

    public static final class f extends p144o8.g implements p200u8.c {
        int label;

        public f(p123m8.d<? super f> dVar) {
            super(2, dVar);
        }

        @Override // p144o8.a
        public final p123m8.d<m> create(Object obj, p123m8.d<?> dVar) {
            return b.this.new f(dVar);
        }

        @Override // p200u8.c
        public final Object invoke(InterfaceC0341y interfaceC0341y, p123m8.d<Object> dVar) {
            return ((f) create(interfaceC0341y, dVar)).invokeSuspend(m.a);
        }

        @Override // p144o8.a
        public final Object invokeSuspend(Object obj) {
            p134n8.a aVar = p134n8.a.f13404s;
            int i10 = this.label;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                J7.a.v(obj);
                return obj;
            }
            J7.a.v(obj);
            com.onesignal.common.threading.b bVar = b.this.pollingWaiter;
            this.label = 1;
            Object objWaitForWake = bVar.waitForWake(this);
            return objWaitForWake == aVar ? aVar : objWaitForWake;
        }
    }

    public static final class g extends p144o8.c {
        Object L$0;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;

        public g(p123m8.d<? super g> dVar) {
            super(dVar);
        }

        @Override // p144o8.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return b.this.prompt(false, this);
        }
    }

    public static final class h extends X4.c {
        public h() {
        }

        @Override // X4.c, X4.e
        public void onFocus(boolean z6) {
            super.onFocus(z6);
            b bVar = b.this;
            bVar.pollingWaitInterval = ((com.onesignal.core.internal.config.a) bVar._configModelStore.getModel()).getForegroundFetchNotificationPermissionInterval();
            b.this.pollingWaiter.wake();
        }

        @Override // X4.c, X4.e
        public void onUnfocused() {
            super.onUnfocused();
            b bVar = b.this;
            bVar.pollingWaitInterval = ((com.onesignal.core.internal.config.a) bVar._configModelStore.getModel()).getBackgroundFetchNotificationPermissionInterval();
        }
    }

    public static final class i implements p083i5.c {
        final /* synthetic */ Activity $activity;

        public static final class a extends X4.c {
            final /* synthetic */ b this$0;

            public a(b bVar) {
                this.this$0 = bVar;
            }

            @Override // X4.c, X4.e
            public void onFocus(boolean z6) {
                if (z6) {
                    return;
                }
                super.onFocus(false);
                this.this$0._applicationService.removeApplicationLifecycleHandler(this);
                this.this$0.permissionPromptCompleted(AndroidUtils.INSTANCE.hasPermission(b.ANDROID_PERMISSION_STRING, true, this.this$0._applicationService));
            }
        }

        public i(Activity activity) {
            this.$activity = activity;
        }

        @Override // p083i5.c
        public void onAccept() {
            b.this._applicationService.addApplicationLifecycleHandler(new a(b.this));
            com.onesignal.notifications.internal.permissions.impl.a.INSTANCE.show(this.$activity);
        }

        @Override // p083i5.c
        public void onDecline() {
            b.this.permissionPromptCompleted(false);
        }
    }

    public b(X4.f fVar, p083i5.f fVar2, X4.f fVar3, p093j5.b bVar, com.onesignal.core.internal.config.b bVar2) {
        p210v8.i.f(fVar, "_application");
        p210v8.i.f(fVar2, "_requestPermission");
        p210v8.i.f(fVar3, "_applicationService");
        p210v8.i.f(bVar, "_preferenceService");
        p210v8.i.f(bVar2, "_configModelStore");
        this._application = fVar;
        this._requestPermission = fVar2;
        this._applicationService = fVar3;
        this._preferenceService = bVar;
        this._configModelStore = bVar2;
        this.waiter = new com.onesignal.common.threading.c();
        this.pollingWaiter = new com.onesignal.common.threading.b();
        this.events = new com.onesignal.common.events.b();
        S9.e eVarB = AbstractC0342z.b(new V(Executors.newScheduledThreadPool(1, new t0("NotificationPermissionController", new AtomicInteger()))));
        this.coroutineScope = eVarB;
        this.enabled = notificationsEnabled();
        fVar2.registerAsCallback(PERMISSION_TYPE, this);
        this.pollingWaitInterval = ((com.onesignal.core.internal.config.a) bVar2.getModel()).getBackgroundFetchNotificationPermissionInterval();
        registerPollingLifecycleListener();
        AbstractC0342z.n(eVarB, null, new a(null), 3);
        this.supportsNativePrompt = Build.VERSION.SDK_INT > 32 && AndroidUtils.INSTANCE.getTargetSdkVersion(fVar.getAppContext()) > 32;
    }

    private final boolean notificationsEnabled() {
        return U5.e.areNotificationsEnabled$default(U5.e.INSTANCE, this._application.getAppContext(), null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void permissionPromptCompleted(boolean z6) {
        this.enabled = z6;
        this.waiter.wake(Boolean.valueOf(z6));
        this.events.fire(new c(z6));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object pollForPermission(p123m8.d<? super m> dVar) {
        d dVar2;
        b bVar;
        long j;
        f fVar;
        if (dVar instanceof d) {
            dVar2 = (d) dVar;
            int i10 = dVar2.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                dVar2.label = i10 - Integer.MIN_VALUE;
            } else {
                dVar2 = new d(dVar);
            }
        } else {
            dVar2 = new d(dVar);
        }
        Object obj = dVar2.result;
        p134n8.a aVar = p134n8.a.f13404s;
        int i11 = dVar2.label;
        if (i11 == 0) {
            J7.a.v(obj);
            bVar = this;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bVar = (b) dVar2.L$0;
            J7.a.v(obj);
        }
        do {
            boolean zNotificationsEnabled = bVar.notificationsEnabled();
            if (bVar.enabled != zNotificationsEnabled) {
                bVar.enabled = zNotificationsEnabled;
                bVar.events.fire(new e(zNotificationsEnabled));
            }
            j = bVar.pollingWaitInterval;
            fVar = bVar.new f(null);
            dVar2.L$0 = bVar;
            dVar2.label = 1;
        } while (AbstractC0342z.y(j, fVar, dVar2) != aVar);
        return aVar;
    }

    private final void registerPollingLifecycleListener() {
        this._applicationService.addApplicationLifecycleHandler(new h());
    }

    private final boolean showFallbackAlertDialog() {
        Activity current = this._application.getCurrent();
        if (current == null) {
            return false;
        }
        p083i5.d dVar = p083i5.d.INSTANCE;
        String string = current.getString(r.notification_permission_name_for_title);
        p210v8.i.e(string, "activity.getString(R.str…ermission_name_for_title)");
        String string2 = current.getString(r.notification_permission_settings_message);
        p210v8.i.e(string2, "activity.getString(R.str…mission_settings_message)");
        dVar.show(current, string, string2, new i(current));
        return true;
    }

    @Override // p017b6.b
    public boolean getCanRequestPermission() {
        Boolean bool = this._preferenceService.getBool("OneSignal", "USER_RESOLVED_PERMISSION_android.permission.POST_NOTIFICATIONS", Boolean.FALSE);
        p210v8.i.c(bool);
        return !bool.booleanValue();
    }

    @Override // p017b6.b, com.onesignal.common.events.d
    public boolean getHasSubscribers() {
        return this.events.getHasSubscribers();
    }

    public final boolean getSupportsNativePrompt() {
        return this.supportsNativePrompt;
    }

    @Override // p083i5.e
    public void onAccept() {
        permissionPromptCompleted(true);
    }

    @Override // p083i5.e
    public void onReject(boolean z6) {
        if (z6 ? showFallbackAlertDialog() : false) {
            return;
        }
        permissionPromptCompleted(false);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // p017b6.b
    public Object prompt(boolean z6, p123m8.d<? super Boolean> dVar) {
        g gVar;
        Object obj;
        b bVar;
        if (dVar instanceof g) {
            gVar = (g) dVar;
            int i10 = gVar.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                gVar.label = i10 - Integer.MIN_VALUE;
            } else {
                gVar = new g(dVar);
            }
        } else {
            gVar = new g(dVar);
        }
        Object obj2 = gVar.result;
        Object obj3 = p134n8.a.f13404s;
        int i11 = gVar.label;
        if (i11 == 0) {
            J7.a.v(obj2);
            gVar.L$0 = this;
            gVar.Z$0 = z6;
            gVar.label = 1;
            p123m8.i context = gVar.getContext();
            AbstractC0342z.f(context);
            p123m8.d dVarQ = qa.b.q(gVar);
            S9.g gVar2 = dVarQ instanceof S9.g ? (S9.g) dVarQ : null;
            Object obj4 = m.a;
            if (gVar2 == null) {
                obj = obj4;
            } else {
                AbstractC0337u abstractC0337u = gVar2.f4556v;
                if (abstractC0337u.o()) {
                    gVar2.f4558x = obj4;
                    gVar2.f3412u = 1;
                    abstractC0337u.n(context, gVar2);
                } else {
                    A0 a10 = new A0(A0.f3409t);
                    p123m8.i iVarPlus = context.plus(a10);
                    gVar2.f4558x = obj4;
                    gVar2.f3412u = 1;
                    abstractC0337u.n(iVarPlus, gVar2);
                    if (a10.f3410s) {
                        T tA = s0.a();
                        p086i8.h hVar = tA.f3432v;
                        if (!(hVar != null ? hVar.isEmpty() : true)) {
                            if (tA.f3430t >= 4294967296L) {
                                gVar2.f4558x = obj4;
                                gVar2.f3412u = 1;
                                tA.A(gVar2);
                            } else {
                                tA.E(true);
                                try {
                                    gVar2.run();
                                    do {
                                    } while (tA.H());
                                } catch (Throwable th) {
                                    try {
                                        gVar2.k(th, null);
                                    } catch (Throwable th2) {
                                        tA.t(true);
                                        throw th2;
                                    }
                                }
                                tA.t(true);
                            }
                        }
                        obj = obj4;
                    }
                }
                obj = obj3;
            }
            if (obj == obj3) {
                obj4 = obj;
            }
            if (obj4 != obj3) {
                bVar = this;
            }
        }
        if (i11 != 1) {
            if (i11 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            J7.a.v(obj2);
            return obj2;
        }
        z6 = gVar.Z$0;
        bVar = (b) gVar.L$0;
        J7.a.v(obj2);
        if (bVar.notificationsEnabled()) {
            return Boolean.TRUE;
        }
        if (bVar.supportsNativePrompt) {
            bVar._requestPermission.startPrompt(z6, PERMISSION_TYPE, ANDROID_PERMISSION_STRING, b.class);
        } else {
            if (!z6) {
                return Boolean.FALSE;
            }
            bVar.showFallbackAlertDialog();
        }
        com.onesignal.common.threading.c cVar = bVar.waiter;
        gVar.L$0 = null;
        gVar.label = 2;
        Object objWaitForWake = cVar.waitForWake(gVar);
        return objWaitForWake == obj3 ? obj3 : objWaitForWake;
    }

    @Override // p017b6.b, com.onesignal.common.events.d
    public void subscribe(p017b6.a aVar) {
        p210v8.i.f(aVar, "handler");
        this.events.subscribe(aVar);
    }

    @Override // p017b6.b, com.onesignal.common.events.d
    public void unsubscribe(p017b6.a aVar) {
        p210v8.i.f(aVar, "handler");
        this.events.subscribe(aVar);
    }
}
