package p140o4;

import E4.C0187a;
import P2.d;
import P2.f;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.stats.WakeLock;
import com.google.android.gms.tasks.TaskExecutors;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public abstract class A {
    public static final long a = TimeUnit.MINUTES.toMillis(1);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Object f13726b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static WakeLock f13727c;

    public static void a(Context context) {
        if (f13727c == null) {
            WakeLock wakeLock = new WakeLock(context);
            f13727c = wakeLock;
            synchronized (wakeLock.a) {
                wakeLock.f9389g = true;
            }
        }
    }

    public static void b(Intent intent) {
        synchronized (f13726b) {
            try {
                if (f13727c != null && intent.getBooleanExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false)) {
                    intent.putExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false);
                    f13727c.c();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void c(Context context, D d3, Intent intent) {
        synchronized (f13726b) {
            try {
                a(context);
                boolean booleanExtra = intent.getBooleanExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false);
                intent.putExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", true);
                if (!booleanExtra) {
                    f13727c.a(a);
                }
                f fVarB = d3.b(intent);
                C0187a c0187a = new C0187a(intent, 22);
                fVarB.getClass();
                fVarB.f3854b.h(new d(TaskExecutors.a, c0187a));
                fVarB.s();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static ComponentName d(Context context, Intent intent) {
        synchronized (f13726b) {
            try {
                a(context);
                boolean booleanExtra = intent.getBooleanExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false);
                intent.putExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", true);
                ComponentName componentNameStartService = context.startService(intent);
                if (componentNameStartService == null) {
                    return null;
                }
                if (!booleanExtra) {
                    f13727c.a(a);
                }
                return componentNameStartService;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
