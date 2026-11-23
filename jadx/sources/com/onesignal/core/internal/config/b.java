package com.onesignal.core.internal.config;

import com.onesignal.common.modeling.l;
import com.onesignal.common.modeling.m;
import p210v8.i;
import p210v8.k;

/* JADX INFO: loaded from: classes.dex */
public class b extends m {

    public static final class a extends k implements p200u8.a {
        public static final a INSTANCE = new a();

        public a() {
            super(0);
        }

        @Override // p200u8.a
        public final com.onesignal.core.internal.config.a invoke() {
            return new com.onesignal.core.internal.config.a();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(p093j5.b bVar) {
        super(new l(a.INSTANCE, "config", bVar));
        i.f(bVar, "prefs");
    }
}
