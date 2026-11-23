package p127n1;

import android.app.ForegroundServiceStartNotAllowedException;
import android.app.Notification;
import android.app.Service;
import android.util.Log;
import androidx.work.impl.foreground.SystemForegroundService;
import p050f1.q;

/* JADX INFO: loaded from: classes.dex */
public abstract class d {
    public static void a(Service service, int i10, Notification notification, int i11) {
        try {
            service.startForeground(i10, notification, i11);
        } catch (ForegroundServiceStartNotAllowedException e10) {
            q qVarA = q.a();
            String str = SystemForegroundService.f7230x;
            if (qVarA.a <= 5) {
                Log.w(str, "Unable to start foreground service", e10);
            }
        }
    }
}
