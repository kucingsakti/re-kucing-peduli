package G;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.lang.reflect.Constructor;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class e extends ViewGroup.MarginLayoutParams {
    public b a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f1665b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f1666c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f1667d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f1668e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f1669f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f1670g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f1671h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f1672i;
    public int j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public View f1673k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public View f1674l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f1675m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f1676n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f1677o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Rect f1678p;

    public e() {
        super(-2, -2);
        this.f1665b = false;
        this.f1666c = 0;
        this.f1667d = 0;
        this.f1668e = -1;
        this.f1669f = -1;
        this.f1670g = 0;
        this.f1671h = 0;
        this.f1678p = new Rect();
    }

    public final boolean a(int i10) {
        if (i10 == 0) {
            return this.f1675m;
        }
        if (i10 != 1) {
            return false;
        }
        return this.f1676n;
    }

    public final void b(b bVar) {
        b bVar2 = this.a;
        if (bVar2 != bVar) {
            if (bVar2 != null) {
                bVar2.j();
            }
            this.a = bVar;
            this.f1665b = true;
            if (bVar != null) {
                bVar.g(this);
            }
        }
    }

    public e(Context context, AttributeSet attributeSet) {
        b bVar;
        super(context, attributeSet);
        this.f1665b = false;
        this.f1666c = 0;
        this.f1667d = 0;
        this.f1668e = -1;
        this.f1669f = -1;
        this.f1670g = 0;
        this.f1671h = 0;
        this.f1678p = new Rect();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, F.a.f1459b);
        this.f1666c = typedArrayObtainStyledAttributes.getInteger(0, 0);
        this.f1669f = typedArrayObtainStyledAttributes.getResourceId(1, -1);
        this.f1667d = typedArrayObtainStyledAttributes.getInteger(2, 0);
        this.f1668e = typedArrayObtainStyledAttributes.getInteger(6, -1);
        this.f1670g = typedArrayObtainStyledAttributes.getInt(5, 0);
        this.f1671h = typedArrayObtainStyledAttributes.getInt(4, 0);
        boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(3);
        this.f1665b = zHasValue;
        if (zHasValue) {
            String string = typedArrayObtainStyledAttributes.getString(3);
            String str = CoordinatorLayout.f6306L;
            if (TextUtils.isEmpty(string)) {
                bVar = null;
            } else {
                if (string.startsWith(".")) {
                    string = context.getPackageName() + string;
                } else if (string.indexOf(46) < 0) {
                    String str2 = CoordinatorLayout.f6306L;
                    if (!TextUtils.isEmpty(str2)) {
                        string = str2 + '.' + string;
                    }
                }
                try {
                    ThreadLocal threadLocal = CoordinatorLayout.f6308N;
                    Map map = (Map) threadLocal.get();
                    if (map == null) {
                        map = new HashMap();
                        threadLocal.set(map);
                    }
                    Constructor<?> constructor = (Constructor) map.get(string);
                    if (constructor == null) {
                        constructor = Class.forName(string, false, context.getClassLoader()).getConstructor(CoordinatorLayout.f6307M);
                        constructor.setAccessible(true);
                        map.put(string, constructor);
                    }
                    bVar = (b) constructor.newInstance(context, attributeSet);
                } catch (Exception e10) {
                    throw new RuntimeException(E0.a.h("Could not inflate Behavior subclass ", string), e10);
                }
            }
            this.a = bVar;
        }
        typedArrayObtainStyledAttributes.recycle();
        b bVar2 = this.a;
        if (bVar2 != null) {
            bVar2.g(this);
        }
    }

    public e(e eVar) {
        super((ViewGroup.MarginLayoutParams) eVar);
        this.f1665b = false;
        this.f1666c = 0;
        this.f1667d = 0;
        this.f1668e = -1;
        this.f1669f = -1;
        this.f1670g = 0;
        this.f1671h = 0;
        this.f1678p = new Rect();
    }

    public e(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
        this.f1665b = false;
        this.f1666c = 0;
        this.f1667d = 0;
        this.f1668e = -1;
        this.f1669f = -1;
        this.f1670g = 0;
        this.f1671h = 0;
        this.f1678p = new Rect();
    }

    public e(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.f1665b = false;
        this.f1666c = 0;
        this.f1667d = 0;
        this.f1668e = -1;
        this.f1669f = -1;
        this.f1670g = 0;
        this.f1671h = 0;
        this.f1678p = new Rect();
    }
}
