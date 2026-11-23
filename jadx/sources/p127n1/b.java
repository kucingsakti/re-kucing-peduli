package p127n1;

import android.app.Notification;
import android.os.Build;
import androidx.work.impl.foreground.SystemForegroundService;

/* JADX INFO: loaded from: classes.dex */
public final class b implements Runnable {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f13310s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Notification f13311t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f13312u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ SystemForegroundService f13313v;

    public b(SystemForegroundService systemForegroundService, int i10, Notification notification, int i11) {
        this.f13313v = systemForegroundService;
        this.f13310s = i10;
        this.f13311t = notification;
        this.f13312u = i11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = Build.VERSION.SDK_INT;
        int i11 = this.f13312u;
        Notification notification = this.f13311t;
        int i12 = this.f13310s;
        SystemForegroundService systemForegroundService = this.f13313v;
        if (i10 >= 31) {
            d.a(systemForegroundService, i12, notification, i11);
        } else if (i10 >= 29) {
            c.a(systemForegroundService, i12, notification, i11);
        } else {
            systemForegroundService.startForeground(i12, notification);
        }
    }
}
