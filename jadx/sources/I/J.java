package I;

import android.app.AppOpsManager;
import android.app.Notification;
import android.app.NotificationManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import android.os.Bundle;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashSet;

/* JADX INFO: loaded from: classes.dex */
public final class J {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static String f1953d;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static I f1956g;
    public final Context a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final NotificationManager f1957b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f1952c = new Object();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static HashSet f1954e = new HashSet();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Object f1955f = new Object();

    public J(Context context) {
        this.a = context;
        this.f1957b = (NotificationManager) context.getSystemService("notification");
    }

    public final boolean a() {
        if (Build.VERSION.SDK_INT >= 24) {
            return E.a(this.f1957b);
        }
        Context context = this.a;
        AppOpsManager appOpsManager = (AppOpsManager) context.getSystemService("appops");
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        String packageName = context.getApplicationContext().getPackageName();
        int i10 = applicationInfo.uid;
        try {
            Class<?> cls = Class.forName(AppOpsManager.class.getName());
            Class<?> cls2 = Integer.TYPE;
            Method method = cls.getMethod("checkOpNoThrow", cls2, cls2, String.class);
            Integer num = (Integer) cls.getDeclaredField("OP_POST_NOTIFICATION").get(Integer.class);
            num.intValue();
            return ((Integer) method.invoke(appOpsManager, num, Integer.valueOf(i10), packageName)).intValue() == 0;
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException | NoSuchMethodException | RuntimeException | InvocationTargetException unused) {
            return true;
        }
    }

    public final void b(int i10, Notification notification) {
        Bundle bundle = notification.extras;
        NotificationManager notificationManager = this.f1957b;
        if (bundle == null || !bundle.getBoolean("android.support.useSideChannel")) {
            notificationManager.notify(null, i10, notification);
            return;
        }
        F f10 = new F(this.a.getPackageName(), i10, notification);
        synchronized (f1955f) {
            try {
                if (f1956g == null) {
                    f1956g = new I(this.a.getApplicationContext());
                }
                f1956g.f1949t.obtainMessage(0, f10).sendToTarget();
            } catch (Throwable th) {
                throw th;
            }
        }
        notificationManager.cancel(null, i10);
    }
}
