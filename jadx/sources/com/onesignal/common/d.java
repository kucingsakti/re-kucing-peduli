package com.onesignal.common;

import L9.n;
import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public final class d {
    public static final d INSTANCE = new d();
    public static final String LOCAL_PREFIX = "local-";

    private d() {
    }

    public final String createLocalId() {
        return LOCAL_PREFIX + UUID.randomUUID();
    }

    public final boolean isLocalId(String str) {
        p210v8.i.f(str, "id");
        return n.I(str, LOCAL_PREFIX, false);
    }
}
