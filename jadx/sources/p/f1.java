package p;

import android.os.Build;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public abstract class f1 {
    public static boolean a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static Method f14060b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final boolean f14061c;

    static {
        f14061c = Build.VERSION.SDK_INT >= 27;
    }
}
