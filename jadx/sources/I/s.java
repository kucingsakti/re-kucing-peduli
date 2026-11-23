package I;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;
import com.kcstream.cing.R;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class s {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final ArrayList f1984A;
    public final Context a;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public CharSequence f1988e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public CharSequence f1989f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public PendingIntent f1990g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public IconCompat f1991h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f1992i;
    public int j;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public u f1994l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f1995m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f1996n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f1997o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public String f1998p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f1999q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public Bundle f2001s;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public String f2004v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public long f2005w;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final boolean f2007y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public Notification f2008z;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f1985b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f1986c = new ArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f1987d = new ArrayList();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f1993k = true;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f2000r = false;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f2002t = 0;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f2003u = 0;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f2006x = 0;

    public s(Context context, String str) {
        Notification notification = new Notification();
        this.f2008z = notification;
        this.a = context;
        this.f2004v = str;
        notification.when = System.currentTimeMillis();
        this.f2008z.audioStreamType = -1;
        this.j = 0;
        this.f1984A = new ArrayList();
        this.f2007y = true;
    }

    public static CharSequence c(CharSequence charSequence) {
        return (charSequence != null && charSequence.length() > 5120) ? charSequence.subSequence(0, 5120) : charSequence;
    }

    public final void a(C0249m c0249m) {
        this.f1985b.add(c0249m);
    }

    public final Notification b() {
        Notification notificationBuild;
        Bundle bundle;
        D d3 = new D(this);
        s sVar = (s) d3.f1939d;
        u uVar = sVar.f1994l;
        if (uVar != null) {
            uVar.a(d3);
        }
        int i10 = Build.VERSION.SDK_INT;
        Notification.Builder builder = (Notification.Builder) d3.f1938c;
        if (i10 >= 26) {
            notificationBuild = builder.build();
        } else {
            int i11 = d3.a;
            if (i10 >= 24) {
                notificationBuild = builder.build();
                if (i11 != 0) {
                    if (v.f(notificationBuild) != null && (notificationBuild.flags & 512) != 0 && i11 == 2) {
                        D.g(notificationBuild);
                    }
                    if (v.f(notificationBuild) != null && (notificationBuild.flags & 512) == 0 && i11 == 1) {
                        D.g(notificationBuild);
                    }
                }
            } else {
                builder.setExtras((Bundle) d3.f1940e);
                notificationBuild = builder.build();
                if (i11 != 0) {
                    if (v.f(notificationBuild) != null && (notificationBuild.flags & 512) != 0 && i11 == 2) {
                        D.g(notificationBuild);
                    }
                    if (v.f(notificationBuild) != null && (notificationBuild.flags & 512) == 0 && i11 == 1) {
                        D.g(notificationBuild);
                    }
                }
            }
        }
        if (uVar != null) {
            sVar.f1994l.getClass();
        }
        if (uVar != null && (bundle = notificationBuild.extras) != null) {
            if (uVar.f2011d) {
                bundle.putCharSequence("android.summaryText", uVar.f2010c);
            }
            CharSequence charSequence = uVar.f2009b;
            if (charSequence != null) {
                bundle.putCharSequence("android.title.big", charSequence);
            }
            bundle.putString("androidx.core.app.extra.COMPAT_TEMPLATE", uVar.b());
        }
        return notificationBuild;
    }

    public final void d(int i10) {
        Notification notification = this.f2008z;
        notification.defaults = i10;
        if ((i10 & 4) != 0) {
            notification.flags |= 1;
        }
    }

    public final void e(int i10, boolean z6) {
        if (z6) {
            Notification notification = this.f2008z;
            notification.flags = i10 | notification.flags;
        } else {
            Notification notification2 = this.f2008z;
            notification2.flags = (~i10) & notification2.flags;
        }
    }

    public final void f(Bitmap bitmap) {
        IconCompat iconCompat;
        if (bitmap == null) {
            iconCompat = null;
        } else {
            if (Build.VERSION.SDK_INT < 27) {
                Resources resources = this.a.getResources();
                int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.compat_notification_large_icon_max_width);
                int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.compat_notification_large_icon_max_height);
                if (bitmap.getWidth() > dimensionPixelSize || bitmap.getHeight() > dimensionPixelSize2) {
                    double dMin = Math.min(((double) dimensionPixelSize) / ((double) Math.max(1, bitmap.getWidth())), ((double) dimensionPixelSize2) / ((double) Math.max(1, bitmap.getHeight())));
                    bitmap = Bitmap.createScaledBitmap(bitmap, (int) Math.ceil(((double) bitmap.getWidth()) * dMin), (int) Math.ceil(((double) bitmap.getHeight()) * dMin), true);
                }
            }
            PorterDuff.Mode mode = IconCompat.f6341k;
            bitmap.getClass();
            IconCompat iconCompat2 = new IconCompat(1);
            iconCompat2.f6342b = bitmap;
            iconCompat = iconCompat2;
        }
        this.f1991h = iconCompat;
    }

    public final void g(int i10, int i11, boolean z6) {
        this.f1995m = i10;
        this.f1996n = i11;
        this.f1997o = z6;
    }

    public final void h(Uri uri) {
        Notification notification = this.f2008z;
        notification.sound = uri;
        notification.audioStreamType = -1;
        AudioAttributes.Builder builderE = r.e(r.c(r.b(), 4), 5);
        this.f2008z.audioAttributes = r.a(builderE);
    }

    public final void i(u uVar) {
        if (this.f1994l != uVar) {
            this.f1994l = uVar;
            if (uVar == null || uVar.a == this) {
                return;
            }
            uVar.a = this;
            i(uVar);
        }
    }
}
