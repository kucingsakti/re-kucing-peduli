package p127n1;

import android.app.Notification;
import android.app.Service;

/* JADX INFO: loaded from: classes.dex */
public abstract class c {
    public static void a(Service service, int i10, Notification notification, int i11) {
        service.startForeground(i10, notification, i11);
    }
}
