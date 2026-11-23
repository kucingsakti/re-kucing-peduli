package com.onesignal.location.internal.permissions;

import X4.f;
import android.app.Activity;
import com.onesignal.common.AndroidUtils;
import p076h8.m;
import p083i5.e;
import p210v8.i;
import p210v8.k;

/* JADX INFO: loaded from: classes.dex */
public final class b implements e, p100k5.b, com.onesignal.common.events.d {
    public static final a Companion = new a(null);
    private static final String PERMISSION_TYPE = "LOCATION";
    private final f _applicationService;
    private final p083i5.f _requestPermission;
    private String currPermission;
    private final com.onesignal.common.events.b events;
    private final com.onesignal.common.threading.c waiter;

    public static final class a {
        public /* synthetic */ a(p210v8.e eVar) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: renamed from: com.onesignal.location.internal.permissions.b$b, reason: collision with other inner class name */
    public static final class C0056b extends k implements p200u8.b {
        public static final C0056b INSTANCE = new C0056b();

        public C0056b() {
            super(1);
        }

        @Override // p200u8.b
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((com.onesignal.location.internal.permissions.a) obj);
            return m.a;
        }

        public final void invoke(com.onesignal.location.internal.permissions.a aVar) {
            i.f(aVar, "it");
            aVar.onLocationPermissionChanged(true);
        }
    }

    public static final class c extends k implements p200u8.b {
        public static final c INSTANCE = new c();

        public c() {
            super(1);
        }

        @Override // p200u8.b
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((com.onesignal.location.internal.permissions.a) obj);
            return m.a;
        }

        public final void invoke(com.onesignal.location.internal.permissions.a aVar) {
            i.f(aVar, "it");
            aVar.onLocationPermissionChanged(false);
        }
    }

    public static final class d implements p083i5.c {
        final /* synthetic */ Activity $activity;

        public static final class a extends X4.c {
            final /* synthetic */ b this$0;

            /* JADX INFO: renamed from: com.onesignal.location.internal.permissions.b$d$a$a, reason: collision with other inner class name */
            public static final class C0057a extends k implements p200u8.b {
                final /* synthetic */ boolean $hasPermission;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0057a(boolean z6) {
                    super(1);
                    this.$hasPermission = z6;
                }

                @Override // p200u8.b
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((com.onesignal.location.internal.permissions.a) obj);
                    return m.a;
                }

                public final void invoke(com.onesignal.location.internal.permissions.a aVar) {
                    i.f(aVar, "it");
                    aVar.onLocationPermissionChanged(this.$hasPermission);
                }
            }

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
                boolean zHasPermission = AndroidUtils.INSTANCE.hasPermission(this.this$0.currPermission, true, this.this$0._applicationService);
                this.this$0.waiter.wake(Boolean.valueOf(zHasPermission));
                this.this$0.events.fire(new C0057a(zHasPermission));
            }
        }

        /* JADX INFO: renamed from: com.onesignal.location.internal.permissions.b$d$b, reason: collision with other inner class name */
        public static final class C0058b extends k implements p200u8.b {
            public static final C0058b INSTANCE = new C0058b();

            public C0058b() {
                super(1);
            }

            @Override // p200u8.b
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((com.onesignal.location.internal.permissions.a) obj);
                return m.a;
            }

            public final void invoke(com.onesignal.location.internal.permissions.a aVar) {
                i.f(aVar, "it");
                aVar.onLocationPermissionChanged(false);
            }
        }

        public d(Activity activity) {
            this.$activity = activity;
        }

        @Override // p083i5.c
        public void onAccept() {
            b.this._applicationService.addApplicationLifecycleHandler(new a(b.this));
            com.onesignal.location.internal.permissions.c.INSTANCE.show(this.$activity);
        }

        @Override // p083i5.c
        public void onDecline() {
            b.this.waiter.wake(Boolean.FALSE);
            b.this.events.fire(C0058b.INSTANCE);
        }
    }

    public b(p083i5.f fVar, f fVar2) {
        i.f(fVar, "_requestPermission");
        i.f(fVar2, "_applicationService");
        this._requestPermission = fVar;
        this._applicationService = fVar2;
        this.waiter = new com.onesignal.common.threading.c();
        this.events = new com.onesignal.common.events.b();
        this.currPermission = "";
    }

    private final boolean showFallbackAlertDialog() {
        Activity current = this._applicationService.getCurrent();
        if (current == null) {
            return false;
        }
        p083i5.d dVar = p083i5.d.INSTANCE;
        String string = current.getString(B5.b.location_permission_name_for_title);
        i.e(string, "activity.getString(R.str…ermission_name_for_title)");
        String string2 = current.getString(B5.b.location_permission_settings_message);
        i.e(string2, "activity.getString(R.str…mission_settings_message)");
        dVar.show(current, string, string2, new d(current));
        return true;
    }

    @Override // com.onesignal.common.events.d
    public boolean getHasSubscribers() {
        return this.events.getHasSubscribers();
    }

    @Override // p083i5.e
    public void onAccept() {
        this.waiter.wake(Boolean.TRUE);
        this.events.fire(C0056b.INSTANCE);
    }

    @Override // p083i5.e
    public void onReject(boolean z6) {
        if (z6 ? showFallbackAlertDialog() : false) {
            return;
        }
        this.waiter.wake(Boolean.FALSE);
        this.events.fire(c.INSTANCE);
    }

    public final Object prompt(boolean z6, String str, p123m8.d<? super Boolean> dVar) {
        this.currPermission = str;
        this._requestPermission.startPrompt(z6, PERMISSION_TYPE, str, b.class);
        return this.waiter.waitForWake(dVar);
    }

    @Override // p100k5.b
    public void start() {
        this._requestPermission.registerAsCallback(PERMISSION_TYPE, this);
    }

    @Override // com.onesignal.common.events.d
    public void subscribe(com.onesignal.location.internal.permissions.a aVar) {
        i.f(aVar, "handler");
        this.events.subscribe(aVar);
    }

    @Override // com.onesignal.common.events.d
    public void unsubscribe(com.onesignal.location.internal.permissions.a aVar) {
        i.f(aVar, "handler");
        this.events.subscribe(aVar);
    }
}
