package I;

import android.app.Notification;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class q extends u {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f1982e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Object f1983f;

    public q(int i10) {
        this.f1982e = i10;
        switch (i10) {
            case 1:
                this.f1983f = new ArrayList();
                break;
        }
    }

    @Override // I.u
    public final void a(D d3) {
        switch (this.f1982e) {
            case 0:
                Notification.BigTextStyle bigTextStyleBigText = new Notification.BigTextStyle((Notification.Builder) d3.f1938c).setBigContentTitle(this.f2009b).bigText((CharSequence) this.f1983f);
                if (this.f2011d) {
                    bigTextStyleBigText.setSummaryText(this.f2010c);
                }
                break;
            default:
                Notification.InboxStyle bigContentTitle = new Notification.InboxStyle((Notification.Builder) d3.f1938c).setBigContentTitle(this.f2009b);
                if (this.f2011d) {
                    bigContentTitle.setSummaryText(this.f2010c);
                }
                Iterator it = ((ArrayList) this.f1983f).iterator();
                while (it.hasNext()) {
                    bigContentTitle.addLine((CharSequence) it.next());
                }
                break;
        }
    }

    @Override // I.u
    public final String b() {
        switch (this.f1982e) {
            case 0:
                return "androidx.core.app.NotificationCompat$BigTextStyle";
            default:
                return "androidx.core.app.NotificationCompat$InboxStyle";
        }
    }
}
