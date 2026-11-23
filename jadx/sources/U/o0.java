package U;

import android.util.Log;
import android.view.View;
import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes.dex */
public abstract class o0 {
    public static final Field a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Field f4835b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Field f4836c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final boolean f4837d;

    static {
        try {
            Field declaredField = View.class.getDeclaredField("mAttachInfo");
            a = declaredField;
            declaredField.setAccessible(true);
            Class<?> cls = Class.forName("android.view.View$AttachInfo");
            Field declaredField2 = cls.getDeclaredField("mStableInsets");
            f4835b = declaredField2;
            declaredField2.setAccessible(true);
            Field declaredField3 = cls.getDeclaredField("mContentInsets");
            f4836c = declaredField3;
            declaredField3.setAccessible(true);
            f4837d = true;
        } catch (ReflectiveOperationException e10) {
            Log.w("WindowInsetsCompat", "Failed to get visible insets from AttachInfo " + e10.getMessage(), e10);
        }
    }
}
