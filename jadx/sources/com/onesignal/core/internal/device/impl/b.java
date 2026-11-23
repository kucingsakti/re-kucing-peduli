package com.onesignal.core.internal.device.impl;

import java.util.UUID;
import p025c5.d;
import p210v8.i;
import p210v8.k;

/* JADX INFO: loaded from: classes.dex */
public final class b implements d {
    private final p093j5.b _prefs;
    private final p076h8.d currentId$delegate;

    public static final class a extends k implements p200u8.a {
        public a() {
            super(0);
        }

        @Override // p200u8.a
        public final UUID invoke() {
            String string$default = p093j5.a.getString$default(b.this._prefs, "OneSignal", "PREFS_OS_INSTALL_ID", null, 4, null);
            if (string$default != null) {
                return UUID.fromString(string$default);
            }
            UUID uuidRandomUUID = UUID.randomUUID();
            b.this._prefs.saveString("OneSignal", "PREFS_OS_INSTALL_ID", uuidRandomUUID.toString());
            return uuidRandomUUID;
        }
    }

    public b(p093j5.b bVar) {
        i.f(bVar, "_prefs");
        this._prefs = bVar;
        this.currentId$delegate = D3.b.s(new a());
    }

    private final UUID getCurrentId() {
        Object value = this.currentId$delegate.getValue();
        i.e(value, "<get-currentId>(...)");
        return (UUID) value;
    }

    @Override // p025c5.d
    public Object getId(p123m8.d<? super UUID> dVar) {
        return getCurrentId();
    }
}
