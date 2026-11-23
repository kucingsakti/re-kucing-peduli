package com.onesignal.common.threading;

import P9.e;
import P9.f;
import P9.g;
import P9.h;
import p123m8.d;

/* JADX INFO: loaded from: classes.dex */
public final class b {
    private final e channel = h.a(-1);

    public final Object waitForWake(d<Object> dVar) {
        return ((P9.a) this.channel).q(dVar);
    }

    public final void wake() {
        Object objA = this.channel.a(null);
        if (objA instanceof g) {
            f fVar = objA instanceof f ? (f) objA : null;
            throw new Exception("Waiter.wait failed", fVar != null ? fVar.a : null);
        }
    }
}
