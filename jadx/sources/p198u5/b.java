package p198u5;

import com.onesignal.common.events.d;
import com.onesignal.inAppMessages.internal.a;
import com.onesignal.inAppMessages.internal.c;
import com.onesignal.inAppMessages.internal.g;

/* JADX INFO: loaded from: classes.dex */
public interface b extends d {
    @Override // com.onesignal.common.events.d
    /* synthetic */ boolean getHasSubscribers();

    void messageActionOccurredOnMessage(a aVar, c cVar);

    void messageActionOccurredOnPreview(a aVar, c cVar);

    void messagePageChanged(a aVar, g gVar);

    void messageWasDismissed(a aVar);

    void messageWasDisplayed(a aVar);

    void messageWillDismiss(a aVar);

    void messageWillDisplay(a aVar);

    @Override // com.onesignal.common.events.d
    /* synthetic */ void subscribe(Object obj);

    @Override // com.onesignal.common.events.d
    /* synthetic */ void unsubscribe(Object obj);
}
