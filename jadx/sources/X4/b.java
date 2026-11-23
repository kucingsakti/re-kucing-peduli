package X4;

/* JADX INFO: loaded from: classes.dex */
public enum b {
    NOTIFICATION_CLICK,
    APP_OPEN,
    APP_CLOSE;

    public final boolean isAppClose() {
        return this == APP_CLOSE;
    }

    public final boolean isAppOpen() {
        return this == APP_OPEN;
    }

    public final boolean isNotificationClick() {
        return this == NOTIFICATION_CLICK;
    }
}
