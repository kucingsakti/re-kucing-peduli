package com.onesignal.inAppMessages.internal.triggers.impl;

import java.util.Timer;
import java.util.TimerTask;
import p210v8.i;

/* JADX INFO: loaded from: classes.dex */
public final class c {
    public static final c INSTANCE = new c();

    private c() {
    }

    public final void scheduleTrigger(TimerTask timerTask, String str, long j) {
        i.f(str, "triggerId");
        com.onesignal.debug.internal.logging.b.debug$default("scheduleTrigger: " + str + " delay: " + j, null, 2, null);
        new Timer("trigger_timer:".concat(str)).schedule(timerTask, j);
    }
}
