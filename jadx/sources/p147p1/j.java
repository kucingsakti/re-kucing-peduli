package p147p1;

import android.content.ComponentName;
import android.content.Context;
import p050f1.q;

/* JADX INFO: loaded from: classes.dex */
public abstract class j {
    static {
        q.c("PackageManagerHelper");
    }

    public static void a(Context context, Class cls, boolean z6) {
        try {
            context.getPackageManager().setComponentEnabledSetting(new ComponentName(context, cls.getName()), z6 ? 1 : 2, 1);
            q.a().getClass();
        } catch (Exception unused) {
            q.a().getClass();
        }
    }
}
