package I;

import android.app.Notification;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build;
import androidx.core.graphics.drawable.IconCompat;

/* JADX INFO: loaded from: classes.dex */
public final class p extends u {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public IconCompat f1979e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public IconCompat f1980f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f1981g;

    @Override // I.u
    public final void a(D d3) {
        Bitmap bitmapA;
        Notification.BigPictureStyle bigContentTitle = new Notification.BigPictureStyle((Notification.Builder) d3.f1938c).setBigContentTitle(this.f2009b);
        IconCompat iconCompat = this.f1979e;
        Context context = (Context) d3.f1937b;
        if (iconCompat != null) {
            if (Build.VERSION.SDK_INT >= 31) {
                o.a(bigContentTitle, M.c.c(iconCompat, context));
            } else if (iconCompat.d() == 1) {
                IconCompat iconCompat2 = this.f1979e;
                int i10 = iconCompat2.a;
                if (i10 == -1) {
                    Object obj = iconCompat2.f6342b;
                    bitmapA = obj instanceof Bitmap ? (Bitmap) obj : null;
                } else if (i10 == 1) {
                    bitmapA = (Bitmap) iconCompat2.f6342b;
                } else {
                    if (i10 != 5) {
                        throw new IllegalStateException("called getBitmap() on " + iconCompat2);
                    }
                    bitmapA = IconCompat.a((Bitmap) iconCompat2.f6342b, true);
                }
                bigContentTitle = bigContentTitle.bigPicture(bitmapA);
            }
        }
        if (this.f1981g) {
            IconCompat iconCompat3 = this.f1980f;
            if (iconCompat3 == null) {
                bigContentTitle.bigLargeIcon((Bitmap) null);
            } else {
                AbstractC0250n.a(bigContentTitle, M.c.c(iconCompat3, context));
            }
        }
        if (this.f2011d) {
            bigContentTitle.setSummaryText(this.f2010c);
        }
        if (Build.VERSION.SDK_INT >= 31) {
            o.c(bigContentTitle, false);
            o.b(bigContentTitle, null);
        }
    }

    @Override // I.u
    public final String b() {
        return "androidx.core.app.NotificationCompat$BigPictureStyle";
    }
}
