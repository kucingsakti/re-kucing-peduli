package W5;

import I.s;
import U5.d;
import android.app.Notification;
import android.app.PendingIntent;
import android.content.Intent;
import android.graphics.Bitmap;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public interface a {
    void addNotificationActionButtons(JSONObject jSONObject, com.onesignal.notifications.internal.display.impl.a aVar, s sVar, int i10, String str);

    void addXiaomiSettings(com.onesignal.notifications.internal.display.impl.b.a aVar, Notification notification);

    com.onesignal.notifications.internal.display.impl.b.a getBaseOneSignalNotificationBuilder(d dVar);

    Bitmap getDefaultLargeIcon();

    int getDefaultSmallIconId();

    int getGroupAlertBehavior();

    Intent getNewBaseDismissIntent(int i10);

    PendingIntent getNewDismissActionPendingIntent(int i10, Intent intent);

    CharSequence getTitle(JSONObject jSONObject);

    void removeNotifyOptions(s sVar);
}
