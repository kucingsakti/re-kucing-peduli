package com.onesignal.user;

import T4.a;
import U4.c;
import com.onesignal.user.internal.f;
import com.onesignal.user.internal.operations.impl.executors.h;
import com.onesignal.user.internal.operations.impl.executors.j;
import com.onesignal.user.internal.operations.impl.executors.l;
import com.onesignal.user.internal.properties.b;
import kotlin.Metadata;
import p064g5.d;
import p208v6.e;
import p210v8.i;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/onesignal/user/UserModule;", "LT4/a;", "<init>", "()V", "LU4/c;", "builder", "Lh8/m;", "register", "(LU4/c;)V", "com.onesignal.core"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class UserModule implements a {
    @Override // T4.a
    public void register(c builder) {
        i.f(builder, "builder");
        builder.register(com.onesignal.common.consistency.impl.a.class).provides(S4.c.class);
        builder.register(b.class).provides(b.class);
        builder.register(p184s6.b.class).provides(p100k5.a.class);
        E0.a.n(builder, p162q6.b.class, p162q6.b.class, p184s6.a.class, p100k5.a.class);
        builder.register(com.onesignal.user.internal.backend.impl.a.class).provides(p132n6.b.class);
        builder.register(com.onesignal.user.internal.operations.impl.executors.a.class).provides(com.onesignal.user.internal.operations.impl.executors.a.class).provides(d.class);
        builder.register(e.class).provides(e.class);
        E0.a.n(builder, p184s6.c.class, p100k5.a.class, com.onesignal.user.internal.backend.impl.c.class, p132n6.c.class);
        builder.register(j.class).provides(j.class).provides(d.class);
        builder.register(com.onesignal.user.internal.subscriptions.impl.b.class).provides(p208v6.b.class);
        builder.register(p6.a.class).provides(p142o6.a.class);
        builder.register(com.onesignal.user.internal.backend.impl.d.class).provides(p132n6.d.class);
        builder.register(l.class).provides(l.class).provides(d.class);
        builder.register(com.onesignal.user.internal.operations.impl.executors.e.class).provides(d.class);
        E0.a.n(builder, com.onesignal.user.internal.operations.impl.executors.c.class, d.class, h.class, d.class);
        E0.a.n(builder, f.class, p121m6.a.class, u6.b.class, p100k5.b.class);
        E0.a.n(builder, com.onesignal.user.internal.migrations.a.class, p100k5.b.class, p193t6.a.class, p193t6.a.class);
    }
}
