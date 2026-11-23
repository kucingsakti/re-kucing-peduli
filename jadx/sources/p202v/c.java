package p202v;

import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes.dex */
public abstract class c extends Drawable {
    public static final double a = Math.cos(Math.toRadians(45.0d));

    public static float a(float f10, float f11, boolean z6) {
        if (!z6) {
            return f10;
        }
        return (float) (((1.0d - a) * ((double) f11)) + ((double) f10));
    }

    public static float b(float f10, float f11, boolean z6) {
        if (!z6) {
            return f10 * 1.5f;
        }
        return (float) (((1.0d - a) * ((double) f11)) + ((double) (f10 * 1.5f)));
    }
}
