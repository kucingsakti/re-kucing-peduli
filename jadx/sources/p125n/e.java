package p125n;

import android.view.MenuItem;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public final class e implements MenuItem.OnMenuItemClickListener {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final Class[] f13240u = {MenuItem.class};

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public Object f13241s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public Method f13242t;

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(MenuItem menuItem) {
        Method method = this.f13242t;
        try {
            Class<?> returnType = method.getReturnType();
            Class<?> cls = Boolean.TYPE;
            Object obj = this.f13241s;
            if (returnType == cls) {
                return ((Boolean) method.invoke(obj, menuItem)).booleanValue();
            }
            method.invoke(obj, menuItem);
            return true;
        } catch (Exception e10) {
            throw new RuntimeException(e10);
        }
    }
}
