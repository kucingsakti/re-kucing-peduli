package com.onesignal.notifications.internal.display.impl;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import com.onesignal.notifications.activities.NotificationOpenedActivity;
import com.onesignal.notifications.activities.NotificationOpenedActivityAndroid22AndOlder;
import p210v8.i;

/* JADX INFO: loaded from: classes.dex */
public final class a {
    private final Context context;
    private final Class<?> notificationOpenedClassAndroid22AndOlder;
    private final Class<?> notificationOpenedClassAndroid23Plus;

    public a(Context context) {
        i.f(context, "context");
        this.context = context;
        this.notificationOpenedClassAndroid23Plus = NotificationOpenedActivity.class;
        this.notificationOpenedClassAndroid22AndOlder = NotificationOpenedActivityAndroid22AndOlder.class;
    }

    private final Intent getNewBaseIntentAndroidAPI22AndOlder() {
        Intent intent = new Intent(this.context, this.notificationOpenedClassAndroid22AndOlder);
        intent.addFlags(403177472);
        return intent;
    }

    private final Intent getNewBaseIntentAndroidAPI23Plus() {
        return new Intent(this.context, this.notificationOpenedClassAndroid23Plus);
    }

    public final Context getContext() {
        return this.context;
    }

    public final PendingIntent getNewActionPendingIntent(int i10, Intent intent) {
        i.f(intent, "oneSignalIntent");
        return PendingIntent.getActivity(this.context, i10, intent, 201326592);
    }

    public final Intent getNewBaseIntent(int i10) {
        Intent intentAddFlags = getNewBaseIntentAndroidAPI23Plus().putExtra("androidNotificationId", i10).addFlags(603979776);
        i.e(intentAddFlags, "intent\n            .putE…_CLEAR_TOP,\n            )");
        return intentAddFlags;
    }
}
