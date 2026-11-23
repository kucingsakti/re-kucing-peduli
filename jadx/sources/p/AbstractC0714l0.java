package p;

import android.view.View;
import android.widget.AbsListView;
import android.widget.AdapterView;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: p.l0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0714l0 {
    public static final Method a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Method f14079b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Method f14080c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final boolean f14081d;

    static {
        try {
            Class cls = Integer.TYPE;
            Class cls2 = Float.TYPE;
            Method declaredMethod = AbsListView.class.getDeclaredMethod("positionSelector", cls, View.class, Boolean.TYPE, cls2, cls2);
            a = declaredMethod;
            declaredMethod.setAccessible(true);
            Method declaredMethod2 = AdapterView.class.getDeclaredMethod("setSelectedPositionInt", cls);
            f14079b = declaredMethod2;
            declaredMethod2.setAccessible(true);
            Method declaredMethod3 = AdapterView.class.getDeclaredMethod("setNextSelectedPositionInt", cls);
            f14080c = declaredMethod3;
            declaredMethod3.setAccessible(true);
            f14081d = true;
        } catch (NoSuchMethodException e10) {
            e10.printStackTrace();
        }
    }
}
