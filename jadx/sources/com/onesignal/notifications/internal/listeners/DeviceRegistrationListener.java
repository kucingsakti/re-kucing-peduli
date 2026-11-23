package com.onesignal.notifications.internal.listeners;

import J5.n;
import J5.o;
import com.onesignal.common.modeling.g;
import com.onesignal.common.modeling.j;
import kotlin.Metadata;
import p076h8.m;
import p123m8.d;
import p208v6.f;
import p210v8.i;
import p228x6.e;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\b\u0000\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u00022\u00020\u00042\u00020\u0005B/\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0015\u0010\u0014J\u001f\u0010\u0019\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u001d\u001a\u00020\u00122\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010!\u001a\u00020\u00122\u0006\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b!\u0010\"J\u0017\u0010%\u001a\u00020\u00122\u0006\u0010$\u001a\u00020#H\u0016¢\u0006\u0004\b%\u0010&J\u0017\u0010'\u001a\u00020\u00122\u0006\u0010$\u001a\u00020#H\u0016¢\u0006\u0004\b'\u0010&J\u001f\u0010(\u001a\u00020\u00122\u0006\u0010$\u001a\u00020#2\u0006\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b(\u0010)R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010*R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010+R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010,R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010-R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010.¨\u0006/"}, d2 = {"Lcom/onesignal/notifications/internal/listeners/DeviceRegistrationListener;", "Lk5/b;", "Lcom/onesignal/common/modeling/g;", "Lcom/onesignal/core/internal/config/a;", "LJ5/o;", "Lv6/a;", "Lcom/onesignal/core/internal/config/b;", "_configModelStore", "LS5/a;", "_channelManager", "Lcom/onesignal/notifications/internal/pushtoken/a;", "_pushTokenManager", "LJ5/n;", "_notificationsManager", "Lv6/b;", "_subscriptionManager", "<init>", "(Lcom/onesignal/core/internal/config/b;LS5/a;Lcom/onesignal/notifications/internal/pushtoken/a;LJ5/n;Lv6/b;)V", "Lh8/m;", "retrievePushTokenAndUpdateSubscription", "()V", "start", "model", "", "tag", "onModelReplaced", "(Lcom/onesignal/core/internal/config/a;Ljava/lang/String;)V", "Lcom/onesignal/common/modeling/j;", "args", "onModelUpdated", "(Lcom/onesignal/common/modeling/j;Ljava/lang/String;)V", "", "permission", "onNotificationPermissionChange", "(Z)V", "Lx6/e;", "subscription", "onSubscriptionRemoved", "(Lx6/e;)V", "onSubscriptionAdded", "onSubscriptionChanged", "(Lx6/e;Lcom/onesignal/common/modeling/j;)V", "Lcom/onesignal/core/internal/config/b;", "LS5/a;", "Lcom/onesignal/notifications/internal/pushtoken/a;", "LJ5/n;", "Lv6/b;", "com.onesignal.notifications"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class DeviceRegistrationListener implements p100k5.b, g, o, p208v6.a {
    private final S5.a _channelManager;
    private final com.onesignal.core.internal.config.b _configModelStore;
    private final n _notificationsManager;
    private final com.onesignal.notifications.internal.pushtoken.a _pushTokenManager;
    private final p208v6.b _subscriptionManager;

    public static final class a extends p144o8.g implements p200u8.b {
        int label;

        public a(d<? super a> dVar) {
            super(1, dVar);
        }

        @Override // p144o8.a
        public final d<m> create(d<?> dVar) {
            return DeviceRegistrationListener.this.new a(dVar);
        }

        @Override // p144o8.a
        public final Object invokeSuspend(Object obj) {
            p134n8.a aVar = p134n8.a.f13404s;
            int i10 = this.label;
            if (i10 == 0) {
                J7.a.v(obj);
                n nVar = DeviceRegistrationListener.this._notificationsManager;
                this.label = 1;
                if (nVar.requestPermission(true, this) == aVar) {
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
        public final Object invoke(d<? super m> dVar) {
            return ((a) create(dVar)).invokeSuspend(m.a);
        }
    }

    public static final class b extends p144o8.g implements p200u8.b {
        int label;

        public b(d<? super b> dVar) {
            super(1, dVar);
        }

        @Override // p144o8.a
        public final d<m> create(d<?> dVar) {
            return DeviceRegistrationListener.this.new b(dVar);
        }

        @Override // p144o8.a
        public final Object invokeSuspend(Object obj) {
            p134n8.a aVar = p134n8.a.f13404s;
            int i10 = this.label;
            if (i10 == 0) {
                J7.a.v(obj);
                com.onesignal.notifications.internal.pushtoken.a aVar2 = DeviceRegistrationListener.this._pushTokenManager;
                this.label = 1;
                obj = aVar2.retrievePushToken(this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                J7.a.v(obj);
            }
            com.onesignal.notifications.internal.pushtoken.d dVar = (com.onesignal.notifications.internal.pushtoken.d) obj;
            DeviceRegistrationListener.this._subscriptionManager.addOrUpdatePushSubscriptionToken(dVar.getToken(), DeviceRegistrationListener.this._notificationsManager.mo34getPermission() ? dVar.getStatus() : f.NO_PERMISSION);
            return m.a;
        }

        @Override // p200u8.b
        public final Object invoke(d<? super m> dVar) {
            return ((b) create(dVar)).invokeSuspend(m.a);
        }
    }

    public DeviceRegistrationListener(com.onesignal.core.internal.config.b bVar, S5.a aVar, com.onesignal.notifications.internal.pushtoken.a aVar2, n nVar, p208v6.b bVar2) {
        i.f(bVar, "_configModelStore");
        i.f(aVar, "_channelManager");
        i.f(aVar2, "_pushTokenManager");
        i.f(nVar, "_notificationsManager");
        i.f(bVar2, "_subscriptionManager");
        this._configModelStore = bVar;
        this._channelManager = aVar;
        this._pushTokenManager = aVar2;
        this._notificationsManager = nVar;
        this._subscriptionManager = bVar2;
    }

    private final void retrievePushTokenAndUpdateSubscription() {
        this._subscriptionManager.getSubscriptions().getPush();
        com.onesignal.common.threading.a.suspendifyOnThread$default(0, new b(null), 1, null);
    }

    @Override // com.onesignal.common.modeling.g
    public void onModelUpdated(j args, String tag) {
        i.f(args, "args");
        i.f(tag, "tag");
    }

    @Override // J5.o
    public void onNotificationPermissionChange(boolean permission) {
        retrievePushTokenAndUpdateSubscription();
    }

    @Override // p208v6.a
    public void onSubscriptionAdded(e subscription) {
        i.f(subscription, "subscription");
    }

    @Override // p208v6.a
    public void onSubscriptionChanged(e subscription, j args) {
        i.f(subscription, "subscription");
        i.f(args, "args");
        if (i.a(args.getPath(), "optedIn") && i.a(args.getNewValue(), Boolean.TRUE) && !this._notificationsManager.mo34getPermission()) {
            com.onesignal.common.threading.a.suspendifyOnThread$default(0, new a(null), 1, null);
        }
    }

    @Override // p208v6.a
    public void onSubscriptionRemoved(e subscription) {
        i.f(subscription, "subscription");
    }

    @Override // p100k5.b
    public void start() {
        this._configModelStore.subscribe((g) this);
        this._notificationsManager.mo31addPermissionObserver(this);
        this._subscriptionManager.subscribe(this);
    }

    @Override // com.onesignal.common.modeling.g
    public void onModelReplaced(com.onesignal.core.internal.config.a model, String tag) {
        i.f(model, "model");
        i.f(tag, "tag");
        if (tag.equals("HYDRATE")) {
            this._channelManager.processChannelList(model.getNotificationChannels());
            retrievePushTokenAndUpdateSubscription();
        }
    }
}
