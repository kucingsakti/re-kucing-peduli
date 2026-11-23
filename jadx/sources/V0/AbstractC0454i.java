package V0;

import android.animation.ObjectAnimator;
import android.animation.TypeConverter;
import android.graphics.Path;
import android.util.Property;

/* JADX INFO: renamed from: V0.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0454i {
    public static <T, V> ObjectAnimator a(T t7, Property<T, V> property, Path path) {
        return ObjectAnimator.ofObject(t7, property, (TypeConverter) null, path);
    }
}
