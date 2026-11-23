package I;

import android.app.Notification;

/* JADX INFO: loaded from: classes.dex */
public abstract class C {
    public static Notification.Action.Builder a(Notification.Action.Builder builder, boolean z6) {
        return builder.setAuthenticationRequired(z6);
    }

    public static Notification.Builder b(Notification.Builder builder, int i10) {
        return builder.setForegroundServiceBehavior(i10);
    }
}
