package com.onesignal.core;

import J5.n;
import T4.a;
import U4.c;
import X4.f;
import com.onesignal.inAppMessages.internal.k;
import kotlin.Metadata;
import p005a5.d;
import p093j5.b;
import p151p5.j;
import p210v8.i;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/onesignal/core/CoreModule;", "LT4/a;", "<init>", "()V", "LU4/c;", "builder", "Lh8/m;", "register", "(LU4/c;)V", "com.onesignal.core"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class CoreModule implements a {
    @Override // T4.a
    public void register(c builder) {
        i.f(builder, "builder");
        builder.register(com.onesignal.core.internal.preferences.impl.a.class).provides(b.class).provides(p100k5.b.class);
        E0.a.n(builder, com.onesignal.core.internal.http.impl.b.class, com.onesignal.core.internal.http.impl.c.class, com.onesignal.core.internal.http.impl.a.class, p035d5.c.class);
        E0.a.n(builder, com.onesignal.core.internal.application.impl.a.class, f.class, com.onesignal.core.internal.device.impl.a.class, p025c5.c.class);
        E0.a.n(builder, p120m5.a.class, p110l5.a.class, p016b5.b.class, d.class);
        E0.a.n(builder, com.onesignal.core.internal.device.impl.b.class, p025c5.d.class, com.onesignal.core.internal.config.b.class, com.onesignal.core.internal.config.b.class);
        E0.a.n(builder, com.onesignal.core.internal.backend.impl.a.class, Y4.b.class, com.onesignal.core.internal.config.impl.a.class, p100k5.b.class);
        E0.a.n(builder, u6.a.class, p100k5.a.class, com.onesignal.core.internal.operations.impl.a.class, com.onesignal.core.internal.operations.impl.a.class);
        builder.register(com.onesignal.core.internal.operations.impl.b.class).provides(p064g5.f.class).provides(p100k5.b.class);
        builder.register(com.onesignal.core.internal.permissions.impl.a.class).provides(com.onesignal.core.internal.permissions.impl.a.class).provides(p083i5.f.class);
        builder.register(p054f5.a.class).provides(p043e5.a.class);
        builder.register(com.onesignal.core.internal.background.impl.a.class).provides(Z4.a.class).provides(p100k5.b.class);
        builder.register(com.onesignal.core.internal.purchases.impl.a.class).provides(p100k5.b.class);
        E0.a.n(builder, com.onesignal.core.internal.purchases.impl.c.class, p100k5.b.class, com.onesignal.notifications.internal.b.class, n.class);
        E0.a.n(builder, k.class, j.class, com.onesignal.location.internal.b.class, B5.a.class);
    }
}
