package com.onesignal.session;

import T4.a;
import U4.c;
import com.onesignal.session.internal.outcomes.impl.b;
import com.onesignal.session.internal.outcomes.impl.d;
import com.onesignal.session.internal.outcomes.impl.g;
import com.onesignal.session.internal.outcomes.impl.j;
import com.onesignal.session.internal.outcomes.impl.l;
import kotlin.Metadata;
import p210v8.i;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/onesignal/session/SessionModule;", "LT4/a;", "<init>", "()V", "LU4/c;", "builder", "Lh8/m;", "register", "(LU4/c;)V", "com.onesignal.core"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class SessionModule implements a {
    @Override // T4.a
    public void register(c builder) {
        i.f(builder, "builder");
        builder.register(j.class).provides(com.onesignal.session.internal.outcomes.impl.c.class);
        builder.register(l.class).provides(d.class);
        builder.register(g.class).provides(b.class);
        builder.register(com.onesignal.session.internal.outcomes.impl.i.class).provides(j6.b.class).provides(p100k5.b.class);
        builder.register(p084i6.g.class).provides(p075h6.a.class);
        builder.register(p111l6.d.class).provides(p111l6.d.class);
        builder.register(com.onesignal.session.internal.session.impl.b.class).provides(p111l6.b.class).provides(p100k5.b.class).provides(Z4.b.class).provides(p100k5.a.class);
        builder.register(com.onesignal.session.internal.session.impl.a.class).provides(p100k5.b.class);
        builder.register(com.onesignal.session.internal.a.class).provides(p065g6.a.class);
    }
}
