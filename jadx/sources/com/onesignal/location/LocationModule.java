package com.onesignal.location;

import X4.f;
import com.onesignal.location.internal.controller.impl.d;
import com.onesignal.location.internal.controller.impl.g;
import com.onesignal.location.internal.controller.impl.h;
import kotlin.Metadata;
import p025c5.c;
import p200u8.b;
import p210v8.i;
import p210v8.k;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/onesignal/location/LocationModule;", "LT4/a;", "<init>", "()V", "LU4/c;", "builder", "Lh8/m;", "register", "(LU4/c;)V", "com.onesignal.location"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class LocationModule implements T4.a {

    public static final class a extends k implements b {
        public static final a INSTANCE = new a();

        public a() {
            super(1);
        }

        @Override // p200u8.b
        public final G5.a invoke(U4.b bVar) {
            i.f(bVar, "it");
            c cVar = (c) bVar.getService(c.class);
            if (cVar.isAndroidDeviceType() && F5.b.INSTANCE.hasGMSLocationLibrary()) {
                return new com.onesignal.location.internal.controller.impl.b((f) bVar.getService(f.class), (g) bVar.getService(g.class));
            }
            return (cVar.isHuaweiDeviceType() && F5.b.INSTANCE.hasHMSLocationLibrary()) ? new d((f) bVar.getService(f.class)) : new h();
        }
    }

    @Override // T4.a
    public void register(U4.c builder) {
        i.f(builder, "builder");
        builder.register(com.onesignal.location.internal.permissions.b.class).provides(com.onesignal.location.internal.permissions.b.class).provides(p100k5.b.class);
        builder.register(com.onesignal.location.internal.controller.impl.a.class).provides(g.class);
        builder.register((b) a.INSTANCE).provides(G5.a.class);
        builder.register(I5.a.class).provides(H5.a.class);
        E0.a.n(builder, E5.a.class, D5.a.class, C5.a.class, Z4.b.class);
        builder.register(com.onesignal.location.internal.a.class).provides(B5.a.class).provides(p100k5.b.class);
    }
}
