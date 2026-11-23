package W5;

import I.s;
import U5.d;
import android.app.Notification;
import org.json.JSONObject;
import p076h8.m;

/* JADX INFO: loaded from: classes.dex */
public interface c {
    void createGenericPendingIntentsForGroup(s sVar, com.onesignal.notifications.internal.display.impl.a aVar, JSONObject jSONObject, String str, int i10);

    Object createGrouplessSummaryNotification(d dVar, com.onesignal.notifications.internal.display.impl.a aVar, int i10, int i11, p123m8.d<? super m> dVar2);

    Notification createSingleNotificationBeforeSummaryBuilder(d dVar, s sVar);

    Object createSummaryNotification(d dVar, com.onesignal.notifications.internal.display.impl.b.a aVar, int i10, p123m8.d<? super m> dVar2);

    Object updateSummaryNotification(d dVar, p123m8.d<? super m> dVar2);
}
