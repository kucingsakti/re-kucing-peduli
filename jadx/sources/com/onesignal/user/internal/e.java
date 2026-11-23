package com.onesignal.user.internal;

import p208v6.g;

/* JADX INFO: loaded from: classes.dex */
public final class e extends b {
    public static final a Companion = new a(null);

    public static final class a {
        public /* synthetic */ a(p210v8.e eVar) {
            this();
        }

        public final p208v6.d createFakePushSub() {
            p208v6.d dVar = new p208v6.d();
            dVar.setId("");
            dVar.setType(g.PUSH);
            dVar.setOptedIn(false);
            dVar.setAddress("");
            return dVar;
        }

        private a() {
        }
    }

    public e() {
        super(Companion.createFakePushSub());
    }
}
