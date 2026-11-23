package p147p1;

import android.content.Context;
import android.os.PowerManager;
import p050f1.q;
import p210v8.i;

/* JADX INFO: loaded from: classes.dex */
public abstract class m {
    public static final String a;

    static {
        String strC = q.c("WakeLocks");
        i.e(strC, "tagWithPrefix(\"WakeLocks\")");
        a = strC;
    }

    public static final PowerManager.WakeLock a(Context context, String str) {
        i.f(context, "context");
        i.f(str, "tag");
        Object systemService = context.getApplicationContext().getSystemService("power");
        i.d(systemService, "null cannot be cast to non-null type android.os.PowerManager");
        String strConcat = "WorkManager: ".concat(str);
        PowerManager.WakeLock wakeLockNewWakeLock = ((PowerManager) systemService).newWakeLock(1, strConcat);
        synchronized (n.a) {
        }
        i.e(wakeLockNewWakeLock, "wakeLock");
        return wakeLockNewWakeLock;
    }
}
