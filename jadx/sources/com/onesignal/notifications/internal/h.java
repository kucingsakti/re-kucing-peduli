package com.onesignal.notifications.internal;

import J5.j;
import J5.n;
import J5.o;
import N9.AbstractC0342z;
import N9.I;
import N9.InterfaceC0341y;
import android.app.Activity;
import android.content.Intent;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p076h8.m;
import p210v8.i;
import p210v8.k;

/* JADX INFO: loaded from: classes.dex */
public final class h implements n, com.onesignal.notifications.internal.a, p017b6.a, X4.e {
    private final X4.f _applicationService;
    private final V5.d _notificationDataController;
    private final Y5.c _notificationLifecycleService;
    private final p017b6.b _notificationPermissionController;
    private final p044e6.c _notificationRestoreWorkManager;
    private final p055f6.a _summaryManager;
    private boolean permission;
    private final com.onesignal.common.events.b permissionChangedNotifier;

    public static final class a extends p144o8.g implements p200u8.b {
        int label;

        public a(p123m8.d<? super a> dVar) {
            super(1, dVar);
        }

        @Override // p144o8.a
        public final p123m8.d<m> create(p123m8.d<?> dVar) {
            return h.this.new a(dVar);
        }

        @Override // p144o8.a
        public final Object invokeSuspend(Object obj) {
            p134n8.a aVar = p134n8.a.f13404s;
            int i10 = this.label;
            if (i10 == 0) {
                J7.a.v(obj);
                V5.d dVar = h.this._notificationDataController;
                this.label = 1;
                if (dVar.deleteExpiredNotifications(this) == aVar) {
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

        @Override // p200u8.b
        public final Object invoke(p123m8.d<? super m> dVar) {
            return ((a) create(dVar)).invokeSuspend(m.a);
        }
    }

    public static final class b extends p144o8.g implements p200u8.b {
        int label;

        public b(p123m8.d<? super b> dVar) {
            super(1, dVar);
        }

        @Override // p144o8.a
        public final p123m8.d<m> create(p123m8.d<?> dVar) {
            return h.this.new b(dVar);
        }

        @Override // p144o8.a
        public final Object invokeSuspend(Object obj) {
            p134n8.a aVar = p134n8.a.f13404s;
            int i10 = this.label;
            if (i10 == 0) {
                J7.a.v(obj);
                V5.d dVar = h.this._notificationDataController;
                this.label = 1;
                if (dVar.markAsDismissedForOutstanding(this) == aVar) {
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

        @Override // p200u8.b
        public final Object invoke(p123m8.d<? super m> dVar) {
            return ((b) create(dVar)).invokeSuspend(m.a);
        }
    }

    public static final class c extends p144o8.g implements p200u8.b {
        final /* synthetic */ String $group;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str, p123m8.d<? super c> dVar) {
            super(1, dVar);
            this.$group = str;
        }

        @Override // p144o8.a
        public final p123m8.d<m> create(p123m8.d<?> dVar) {
            return h.this.new c(this.$group, dVar);
        }

        @Override // p144o8.a
        public final Object invokeSuspend(Object obj) {
            p134n8.a aVar = p134n8.a.f13404s;
            int i10 = this.label;
            if (i10 == 0) {
                J7.a.v(obj);
                V5.d dVar = h.this._notificationDataController;
                String str = this.$group;
                this.label = 1;
                if (dVar.markAsDismissedForGroup(str, this) == aVar) {
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

        @Override // p200u8.b
        public final Object invoke(p123m8.d<? super m> dVar) {
            return ((c) create(dVar)).invokeSuspend(m.a);
        }
    }

    public static final class d extends p144o8.g implements p200u8.b {
        final /* synthetic */ int $id;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(int i10, p123m8.d<? super d> dVar) {
            super(1, dVar);
            this.$id = i10;
        }

        @Override // p144o8.a
        public final p123m8.d<m> create(p123m8.d<?> dVar) {
            return h.this.new d(this.$id, dVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x0046, code lost:
        
            if (r5.updatePossibleDependentSummaryOnDismiss(r1, r4) == r0) goto L17;
         */
        @Override // p144o8.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r5) {
            /*
                r4 = this;
                n8.a r0 = p134n8.a.f13404s
                int r1 = r4.label
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1c
                if (r1 == r3) goto L18
                if (r1 != r2) goto L10
                J7.a.v(r5)
                goto L49
            L10:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r0)
                throw r5
            L18:
                J7.a.v(r5)
                goto L30
            L1c:
                J7.a.v(r5)
                com.onesignal.notifications.internal.h r5 = com.onesignal.notifications.internal.h.this
                V5.d r5 = com.onesignal.notifications.internal.h.access$get_notificationDataController$p(r5)
                int r1 = r4.$id
                r4.label = r3
                java.lang.Object r5 = r5.markAsDismissed(r1, r4)
                if (r5 != r0) goto L30
                goto L48
            L30:
                java.lang.Boolean r5 = (java.lang.Boolean) r5
                boolean r5 = r5.booleanValue()
                if (r5 == 0) goto L49
                com.onesignal.notifications.internal.h r5 = com.onesignal.notifications.internal.h.this
                f6.a r5 = com.onesignal.notifications.internal.h.access$get_summaryManager$p(r5)
                int r1 = r4.$id
                r4.label = r2
                java.lang.Object r5 = r5.updatePossibleDependentSummaryOnDismiss(r1, r4)
                if (r5 != r0) goto L49
            L48:
                return r0
            L49:
                h8.m r5 = p076h8.m.a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.onesignal.notifications.internal.h.d.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // p200u8.b
        public final Object invoke(p123m8.d<? super m> dVar) {
            return ((d) create(dVar)).invokeSuspend(m.a);
        }
    }

    public static final class e extends p144o8.g implements p200u8.c {
        final /* synthetic */ boolean $fallbackToSettings;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(boolean z6, p123m8.d<? super e> dVar) {
            super(2, dVar);
            this.$fallbackToSettings = z6;
        }

        @Override // p144o8.a
        public final p123m8.d<m> create(Object obj, p123m8.d<?> dVar) {
            return h.this.new e(this.$fallbackToSettings, dVar);
        }

        @Override // p200u8.c
        public final Object invoke(InterfaceC0341y interfaceC0341y, p123m8.d<? super Boolean> dVar) {
            return ((e) create(interfaceC0341y, dVar)).invokeSuspend(m.a);
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
            p017b6.b bVar = h.this._notificationPermissionController;
            boolean z6 = this.$fallbackToSettings;
            this.label = 1;
            Object objPrompt = bVar.prompt(z6, this);
            return objPrompt == aVar ? aVar : objPrompt;
        }
    }

    public static final class f extends k implements p200u8.b {
        final /* synthetic */ boolean $isEnabled;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(boolean z6) {
            super(1);
            this.$isEnabled = z6;
        }

        @Override // p200u8.b
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((o) obj);
            return m.a;
        }

        public final void invoke(o oVar) {
            i.f(oVar, "it");
            oVar.onNotificationPermissionChange(this.$isEnabled);
        }
    }

    public h(X4.f fVar, p017b6.b bVar, p044e6.c cVar, Y5.c cVar2, V5.d dVar, p055f6.a aVar) {
        i.f(fVar, "_applicationService");
        i.f(bVar, "_notificationPermissionController");
        i.f(cVar, "_notificationRestoreWorkManager");
        i.f(cVar2, "_notificationLifecycleService");
        i.f(dVar, "_notificationDataController");
        i.f(aVar, "_summaryManager");
        this._applicationService = fVar;
        this._notificationPermissionController = bVar;
        this._notificationRestoreWorkManager = cVar;
        this._notificationLifecycleService = cVar2;
        this._notificationDataController = dVar;
        this._summaryManager = aVar;
        this.permission = U5.e.areNotificationsEnabled$default(U5.e.INSTANCE, fVar.getAppContext(), null, 2, null);
        this.permissionChangedNotifier = new com.onesignal.common.events.b();
        fVar.addApplicationLifecycleHandler(this);
        bVar.subscribe(this);
        com.onesignal.common.threading.a.suspendifyOnThread$default(0, new a(null), 1, null);
    }

    private final void refreshNotificationState() {
        this._notificationRestoreWorkManager.beginEnqueueingWork(this._applicationService.getAppContext(), false);
        setPermissionStatusAndFire(U5.e.areNotificationsEnabled$default(U5.e.INSTANCE, this._applicationService.getAppContext(), null, 2, null));
    }

    private final void setPermissionStatusAndFire(boolean z6) {
        boolean zMo34getPermission = mo34getPermission();
        setPermission(z6);
        if (zMo34getPermission != z6) {
            this.permissionChangedNotifier.fireOnMain(new f(z6));
        }
    }

    @Override // J5.n
    /* JADX INFO: renamed from: addClickListener */
    public void mo29addClickListener(J5.h hVar) {
        i.f(hVar, "listener");
        com.onesignal.debug.internal.logging.b.debug$default("NotificationsManager.addClickListener(handler: " + hVar + ')', null, 2, null);
        this._notificationLifecycleService.addExternalClickListener(hVar);
    }

    @Override // J5.n
    /* JADX INFO: renamed from: addForegroundLifecycleListener */
    public void mo30addForegroundLifecycleListener(j jVar) {
        i.f(jVar, "listener");
        com.onesignal.debug.internal.logging.b.debug$default("NotificationsManager.addForegroundLifecycleListener(listener: " + jVar + ')', null, 2, null);
        this._notificationLifecycleService.addExternalForegroundLifecycleListener(jVar);
    }

    @Override // J5.n
    /* JADX INFO: renamed from: addPermissionObserver */
    public void mo31addPermissionObserver(o oVar) {
        i.f(oVar, "observer");
        com.onesignal.debug.internal.logging.b.debug$default("NotificationsManager.addPermissionObserver(observer: " + oVar + ')', null, 2, null);
        this.permissionChangedNotifier.subscribe(oVar);
    }

    @Override // J5.n
    /* JADX INFO: renamed from: clearAllNotifications */
    public void mo32clearAllNotifications() {
        com.onesignal.debug.internal.logging.b.debug$default("NotificationsManager.clearAllNotifications()", null, 2, null);
        com.onesignal.common.threading.a.suspendifyOnThread$default(0, new b(null), 1, null);
    }

    @Override // J5.n
    /* JADX INFO: renamed from: getCanRequestPermission */
    public boolean mo33getCanRequestPermission() {
        return this._notificationPermissionController.getCanRequestPermission();
    }

    @Override // J5.n
    /* JADX INFO: renamed from: getPermission */
    public boolean mo34getPermission() {
        return this.permission;
    }

    @Override // X4.e
    public void onFocus(boolean z6) {
        refreshNotificationState();
    }

    @Override // p017b6.a
    public void onNotificationPermissionChanged(boolean z6) {
        setPermissionStatusAndFire(z6);
    }

    @Override // X4.e
    public void onUnfocused() {
    }

    @Override // com.onesignal.notifications.internal.a
    public Object openDestinationActivity(Activity activity, JSONArray jSONArray, p123m8.d<? super m> dVar) {
        try {
            JSONObject jSONObject = jSONArray.getJSONObject(0);
            U5.b bVar = U5.b.INSTANCE;
            i.e(jSONObject, "firstPayloadItem");
            Intent intentVisible = bVar.create(activity, jSONObject).getIntentVisible();
            if (intentVisible != null) {
                com.onesignal.debug.internal.logging.b.info$default("SDK running startActivity with Intent: " + intentVisible, null, 2, null);
                activity.startActivity(intentVisible);
            } else {
                com.onesignal.debug.internal.logging.b.info$default("SDK not showing an Activity automatically due to it's settings.", null, 2, null);
            }
        } catch (JSONException e10) {
            e10.printStackTrace();
        }
        return m.a;
    }

    @Override // J5.n
    /* JADX INFO: renamed from: removeClickListener */
    public void mo35removeClickListener(J5.h hVar) {
        i.f(hVar, "listener");
        com.onesignal.debug.internal.logging.b.debug$default("NotificationsManager.removeClickListener(listener: " + hVar + ')', null, 2, null);
        this._notificationLifecycleService.removeExternalClickListener(hVar);
    }

    @Override // J5.n
    /* JADX INFO: renamed from: removeForegroundLifecycleListener */
    public void mo36removeForegroundLifecycleListener(j jVar) {
        i.f(jVar, "listener");
        com.onesignal.debug.internal.logging.b.debug$default("NotificationsManager.removeForegroundLifecycleListener(listener: " + jVar + ')', null, 2, null);
        this._notificationLifecycleService.removeExternalForegroundLifecycleListener(jVar);
    }

    @Override // J5.n
    /* JADX INFO: renamed from: removeGroupedNotifications */
    public void mo37removeGroupedNotifications(String str) {
        i.f(str, "group");
        com.onesignal.debug.internal.logging.b.debug$default("NotificationsManager.removeGroupedNotifications(group: " + str + ')', null, 2, null);
        com.onesignal.common.threading.a.suspendifyOnThread$default(0, new c(str, null), 1, null);
    }

    @Override // J5.n
    /* JADX INFO: renamed from: removeNotification */
    public void mo38removeNotification(int i10) {
        com.onesignal.debug.internal.logging.b.debug$default("NotificationsManager.removeNotification(id: " + i10 + ')', null, 2, null);
        com.onesignal.common.threading.a.suspendifyOnThread$default(0, new d(i10, null), 1, null);
    }

    @Override // J5.n
    /* JADX INFO: renamed from: removePermissionObserver */
    public void mo39removePermissionObserver(o oVar) {
        i.f(oVar, "observer");
        com.onesignal.debug.internal.logging.b.debug$default("NotificationsManager.removePermissionObserver(observer: " + oVar + ')', null, 2, null);
        this.permissionChangedNotifier.unsubscribe(oVar);
    }

    @Override // J5.n
    public Object requestPermission(boolean z6, p123m8.d<? super Boolean> dVar) {
        com.onesignal.debug.internal.logging.b.debug$default("NotificationsManager.requestPermission()", null, 2, null);
        U9.d dVar2 = I.a;
        return AbstractC0342z.w(S9.n.a, new e(z6, null), dVar);
    }

    public void setPermission(boolean z6) {
        this.permission = z6;
    }
}
