package p208v6;

import com.onesignal.common.events.d;

/* JADX INFO: loaded from: classes.dex */
public interface b extends d {
    void addEmailSubscription(String str);

    void addOrUpdatePushSubscriptionToken(String str, f fVar);

    void addSmsSubscription(String str);

    @Override // com.onesignal.common.events.d
    /* synthetic */ boolean getHasSubscribers();

    d getPushSubscriptionModel();

    c getSubscriptions();

    void removeEmailSubscription(String str);

    void removeSmsSubscription(String str);

    void setSubscriptions(c cVar);

    @Override // com.onesignal.common.events.d
    /* synthetic */ void subscribe(Object obj);

    @Override // com.onesignal.common.events.d
    /* synthetic */ void unsubscribe(Object obj);
}
