package com.onesignal.session.internal.outcomes.impl;

import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class j implements c {
    private final p093j5.b preferences;

    public j(p093j5.b bVar) {
        p210v8.i.f(bVar, "preferences");
        this.preferences = bVar;
    }

    @Override // com.onesignal.session.internal.outcomes.impl.c
    public Set<String> getUnattributedUniqueOutcomeEventsSentByChannel() {
        return this.preferences.getStringSet("OneSignal", "PREFS_OS_UNATTRIBUTED_UNIQUE_OUTCOME_EVENTS_SENT", null);
    }

    @Override // com.onesignal.session.internal.outcomes.impl.c
    public void setUnattributedUniqueOutcomeEventsSentByChannel(Set<String> set) {
        this.preferences.saveStringSet("OneSignal", "PREFS_OS_UNATTRIBUTED_UNIQUE_OUTCOME_EVENTS_SENT", set);
    }
}
