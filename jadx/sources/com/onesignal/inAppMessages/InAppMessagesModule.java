package com.onesignal.inAppMessages;

import A5.d;
import T4.a;
import U4.c;
import com.onesignal.inAppMessages.internal.j;
import com.onesignal.inAppMessages.internal.triggers.impl.e;
import kotlin.Metadata;
import p161q5.b;
import p210v8.i;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/onesignal/inAppMessages/InAppMessagesModule;", "LT4/a;", "<init>", "()V", "LU4/c;", "builder", "Lh8/m;", "register", "(LU4/c;)V", "com.onesignal.inAppMessages"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class InAppMessagesModule implements a {
    @Override // T4.a
    public void register(c builder) {
        i.f(builder, "builder");
        builder.register(p244z5.a.class).provides(p244z5.a.class);
        builder.register(p192t5.a.class).provides(p192t5.a.class);
        builder.register(p216w5.a.class).provides(p207v5.a.class);
        E0.a.n(builder, com.onesignal.inAppMessages.internal.repositories.impl.a.class, p236y5.a.class, com.onesignal.inAppMessages.internal.backend.impl.a.class, b.class);
        E0.a.n(builder, com.onesignal.inAppMessages.internal.lifecycle.impl.a.class, p198u5.b.class, d.class, d.class);
        E0.a.n(builder, e.class, A5.a.class, com.onesignal.inAppMessages.internal.triggers.impl.a.class, com.onesignal.inAppMessages.internal.triggers.impl.a.class);
        E0.a.n(builder, com.onesignal.inAppMessages.internal.display.impl.c.class, p183s5.a.class, com.onesignal.inAppMessages.internal.preview.a.class, p100k5.b.class);
        builder.register(com.onesignal.inAppMessages.internal.prompt.impl.c.class).provides(p227x5.a.class);
        builder.register(j.class).provides(p151p5.j.class).provides(p100k5.b.class);
    }
}
