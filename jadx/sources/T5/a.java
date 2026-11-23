package T5;

import android.app.NotificationChannel;
import android.app.NotificationChannelGroup;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class a {
    public static /* synthetic */ NotificationChannel c() {
        return new NotificationChannel("restored_OS_notifications", "Restored", 2);
    }

    public static /* bridge */ /* synthetic */ NotificationChannel d(Object obj) {
        return (NotificationChannel) obj;
    }

    public static /* synthetic */ NotificationChannel e(String str, int i10, String str2) {
        return new NotificationChannel(str, str2, i10);
    }

    public static /* synthetic */ NotificationChannelGroup f(String str, String str2) {
        return new NotificationChannelGroup(str, str2);
    }

    public static /* synthetic */ NotificationChannel y() {
        return new NotificationChannel("fcm_fallback_notification_channel", "Miscellaneous", 3);
    }
}
