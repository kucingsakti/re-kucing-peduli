package com.onesignal.notifications.internal.data.impl;

import p210v8.i;

/* JADX INFO: loaded from: classes.dex */
public final class a implements V5.a {
    private final com.onesignal.core.internal.config.b _configModelStore;
    private final p110l5.a _time;

    public a(com.onesignal.core.internal.config.b bVar, p110l5.a aVar) {
        i.f(bVar, "_configModelStore");
        i.f(aVar, "_time");
        this._configModelStore = bVar;
        this._time = aVar;
    }

    @Override // V5.a
    public StringBuilder recentUninteractedWithNotificationsWhere() {
        long currentTimeMillis = this._time.getCurrentTimeMillis() / 1000;
        StringBuilder sb = new StringBuilder("created_time > " + (currentTimeMillis - 604800) + " AND dismissed = 0 AND opened = 0 AND is_summary = 0");
        if (((com.onesignal.core.internal.config.a) this._configModelStore.getModel()).getRestoreTTLFilter()) {
            sb.append(" AND expire_time > " + currentTimeMillis);
        }
        return sb;
    }
}
