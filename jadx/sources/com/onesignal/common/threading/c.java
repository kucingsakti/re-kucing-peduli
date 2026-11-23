package com.onesignal.common.threading;

import P9.e;
import P9.f;
import P9.g;
import P9.h;
import p123m8.d;

/* JADX INFO: loaded from: classes.dex */
public class c {
    private final e channel = h.a(-1);

    public final Object waitForWake(d<Object> dVar) {
        return ((P9.a) this.channel).q(dVar);
    }

    public final void wake(Object obj) {
        Object objA = this.channel.a(obj);
        if (objA instanceof g) {
            f fVar = objA instanceof f ? (f) objA : null;
            throw new Exception("WaiterWithValue.wait failed", fVar != null ? fVar.a : null);
        }
    }
}
