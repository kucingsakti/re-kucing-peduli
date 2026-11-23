package com.onesignal.session.internal.outcomes.impl;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public interface d {
    Object cleanCachedUniqueOutcomeEventNotifications(p123m8.d<? super p076h8.m> dVar);

    Object deleteOldOutcomeEvent(f fVar, p123m8.d<? super p076h8.m> dVar);

    Object getAllEventsToSend(p123m8.d<? super List<f>> dVar);

    Object getNotCachedUniqueInfluencesForOutcome(String str, List<p075h6.b> list, p123m8.d<? super List<p075h6.b>> dVar);

    Object saveOutcomeEvent(f fVar, p123m8.d<? super p076h8.m> dVar);

    Object saveUniqueOutcomeEventParams(f fVar, p123m8.d<? super p076h8.m> dVar);
}
