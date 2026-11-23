package com.onesignal.notifications;

import J5.n;
import V5.d;
import X4.f;
import com.onesignal.notifications.internal.generation.impl.NotificationGenerationWorkManager;
import com.onesignal.notifications.internal.h;
import com.onesignal.notifications.internal.listeners.DeviceRegistrationListener;
import com.onesignal.notifications.internal.receivereceipt.impl.ReceiveReceiptWorkManager;
import com.onesignal.notifications.internal.registration.impl.e;
import com.onesignal.notifications.internal.registration.impl.g;
import com.onesignal.notifications.internal.restoration.impl.NotificationRestoreWorkManager;
import kotlin.Metadata;
import p025c5.c;
import p210v8.i;
import p210v8.k;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/onesignal/notifications/NotificationsModule;", "LT4/a;", "<init>", "()V", "LU4/c;", "builder", "Lh8/m;", "register", "(LU4/c;)V", "com.onesignal.notifications"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class NotificationsModule implements T4.a {

    public static final class a extends k implements p200u8.b {
        public static final a INSTANCE = new a();

        public a() {
            super(1);
        }

        @Override // p200u8.b
        public final K5.a invoke(U4.b bVar) {
            i.f(bVar, "it");
            return L5.a.Companion.canTrack() ? new L5.a((f) bVar.getService(f.class), (com.onesignal.core.internal.config.b) bVar.getService(com.onesignal.core.internal.config.b.class), (p110l5.a) bVar.getService(p110l5.a.class)) : new L5.b();
        }
    }

    public static final class b extends k implements p200u8.b {
        public static final b INSTANCE = new b();

        public b() {
            super(1);
        }

        @Override // p200u8.b
        public final Object invoke(U4.b bVar) {
            i.f(bVar, "it");
            c cVar = (c) bVar.getService(c.class);
            if (cVar.isFireOSDeviceType()) {
                return new com.onesignal.notifications.internal.registration.impl.c((f) bVar.getService(f.class));
            }
            if (cVar.isAndroidDeviceType()) {
                return cVar.getHasFCMLibrary() ? new e((com.onesignal.core.internal.config.b) bVar.getService(com.onesignal.core.internal.config.b.class), (f) bVar.getService(f.class), (com.onesignal.notifications.internal.registration.impl.a) bVar.getService(com.onesignal.notifications.internal.registration.impl.a.class), cVar) : new g();
            }
            return new com.onesignal.notifications.internal.registration.impl.f(cVar, (f) bVar.getService(f.class));
        }
    }

    @Override // T4.a
    public void register(U4.c builder) {
        i.f(builder, "builder");
        builder.register(com.onesignal.notifications.internal.backend.impl.a.class).provides(M5.a.class);
        builder.register(NotificationRestoreWorkManager.class).provides(p044e6.c.class);
        builder.register(com.onesignal.notifications.internal.data.impl.a.class).provides(V5.a.class);
        E0.a.n(builder, com.onesignal.notifications.internal.badges.impl.a.class, N5.a.class, com.onesignal.notifications.internal.data.impl.b.class, d.class);
        E0.a.n(builder, NotificationGenerationWorkManager.class, X5.b.class, R5.a.class, Q5.b.class);
        E0.a.n(builder, T5.b.class, S5.a.class, com.onesignal.notifications.internal.limiting.impl.a.class, Z5.b.class);
        E0.a.n(builder, com.onesignal.notifications.internal.display.impl.c.class, W5.b.class, com.onesignal.notifications.internal.display.impl.d.class, W5.c.class);
        E0.a.n(builder, com.onesignal.notifications.internal.display.impl.b.class, W5.a.class, com.onesignal.notifications.internal.generation.impl.a.class, X5.a.class);
        E0.a.n(builder, com.onesignal.notifications.internal.restoration.impl.a.class, p044e6.b.class, com.onesignal.notifications.internal.summary.impl.a.class, p055f6.a.class);
        E0.a.n(builder, com.onesignal.notifications.internal.open.impl.b.class, p006a6.a.class, com.onesignal.notifications.internal.open.impl.c.class, p006a6.b.class);
        E0.a.n(builder, com.onesignal.notifications.internal.permissions.impl.b.class, p017b6.b.class, com.onesignal.notifications.internal.lifecycle.impl.a.class, Y5.c.class);
        builder.register((p200u8.b) a.INSTANCE).provides(K5.a.class);
        builder.register((p200u8.b) b.INSTANCE).provides(p036d6.b.class).provides(com.onesignal.notifications.internal.registration.impl.b.class);
        builder.register(com.onesignal.notifications.internal.registration.impl.a.class).provides(com.onesignal.notifications.internal.registration.impl.a.class);
        builder.register(com.onesignal.notifications.internal.pushtoken.c.class).provides(com.onesignal.notifications.internal.pushtoken.a.class);
        E0.a.n(builder, ReceiveReceiptWorkManager.class, p026c6.b.class, com.onesignal.notifications.internal.receivereceipt.impl.a.class, p026c6.a.class);
        E0.a.n(builder, DeviceRegistrationListener.class, p100k5.b.class, com.onesignal.notifications.internal.listeners.a.class, p100k5.b.class);
        builder.register(h.class).provides(n.class).provides(com.onesignal.notifications.internal.a.class);
    }
}
