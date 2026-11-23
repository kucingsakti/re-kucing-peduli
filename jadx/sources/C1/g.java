package C1;

import A1.r;
import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;

/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f932e;
    public final Context a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ActivityManager f933b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final r f934c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f935d;

    static {
        f932e = Build.VERSION.SDK_INT < 26 ? 4 : 1;
    }

    public g(Context context) {
        this.f935d = f932e;
        this.a = context;
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        this.f933b = activityManager;
        this.f934c = new r(context.getResources().getDisplayMetrics(), 4);
        if (Build.VERSION.SDK_INT < 26 || !activityManager.isLowRamDevice()) {
            return;
        }
        this.f935d = 0.0f;
    }
}
