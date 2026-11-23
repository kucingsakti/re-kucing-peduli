package p125n;

import O.a;
import U.AbstractC0427m;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Build;
import android.util.Log;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import androidx.datastore.preferences.protobuf.AbstractC0487g;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import p136o.n;
import p136o.o;
import p136o.s;

/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public CharSequence f13243A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public CharSequence f13244B;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final /* synthetic */ g f13247E;
    public final Menu a;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f13254h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f13255i;
    public int j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public CharSequence f13256k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public CharSequence f13257l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f13258m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public char f13259n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f13260o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public char f13261p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f13262q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f13263r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f13264s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f13265t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f13266u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f13267v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f13268w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public String f13269x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public String f13270y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public o f13271z;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public ColorStateList f13245C = null;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public PorterDuff.Mode f13246D = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f13248b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f13249c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f13250d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f13251e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f13252f = true;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f13253g = true;

    public f(g gVar, Menu menu) {
        this.f13247E = gVar;
        this.a = menu;
    }

    public final Object a(String str, Class[] clsArr, Object[] objArr) {
        try {
            Constructor<?> constructor = Class.forName(str, false, this.f13247E.f13275c.getClassLoader()).getConstructor(clsArr);
            constructor.setAccessible(true);
            return constructor.newInstance(objArr);
        } catch (Exception e10) {
            Log.w("SupportMenuInflater", "Cannot instantiate class: " + str, e10);
            return null;
        }
    }

    public final void b(MenuItem menuItem) {
        boolean z6 = false;
        menuItem.setChecked(this.f13264s).setVisible(this.f13265t).setEnabled(this.f13266u).setCheckable(this.f13263r >= 1).setTitleCondensed(this.f13257l).setIcon(this.f13258m);
        int i10 = this.f13267v;
        if (i10 >= 0) {
            menuItem.setShowAsAction(i10);
        }
        String str = this.f13270y;
        g gVar = this.f13247E;
        if (str != null) {
            if (gVar.f13275c.isRestricted()) {
                throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
            }
            if (gVar.f13276d == null) {
                gVar.f13276d = g.a(gVar.f13275c);
            }
            Object obj = gVar.f13276d;
            String str2 = this.f13270y;
            e eVar = new e();
            eVar.f13241s = obj;
            Class<?> cls = obj.getClass();
            try {
                eVar.f13242t = cls.getMethod(str2, e.f13240u);
                menuItem.setOnMenuItemClickListener(eVar);
            } catch (Exception e10) {
                StringBuilder sbM = AbstractC0487g.m("Couldn't resolve menu item onClick handler ", str2, " in class ");
                sbM.append(cls.getName());
                InflateException inflateException = new InflateException(sbM.toString());
                inflateException.initCause(e10);
                throw inflateException;
            }
        }
        if (this.f13263r >= 2) {
            if (menuItem instanceof n) {
                ((n) menuItem).f(true);
            } else if (menuItem instanceof s) {
                s sVar = (s) menuItem;
                try {
                    Method method = sVar.f13553v;
                    a aVar = sVar.f13552u;
                    if (method == null) {
                        sVar.f13553v = aVar.getClass().getDeclaredMethod("setExclusiveCheckable", Boolean.TYPE);
                    }
                    sVar.f13553v.invoke(aVar, Boolean.TRUE);
                } catch (Exception e11) {
                    Log.w("MenuItemWrapper", "Error while calling setExclusiveCheckable", e11);
                }
            }
        }
        String str3 = this.f13269x;
        if (str3 != null) {
            menuItem.setActionView((View) a(str3, g.f13272e, gVar.a));
            z6 = true;
        }
        int i11 = this.f13268w;
        if (i11 > 0) {
            if (z6) {
                Log.w("SupportMenuInflater", "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
            } else {
                menuItem.setActionView(i11);
            }
        }
        o oVar = this.f13271z;
        if (oVar != null) {
            if (menuItem instanceof a) {
                ((a) menuItem).b(oVar);
            } else {
                Log.w("MenuItemCompat", "setActionProvider: item does not implement SupportMenuItem; ignoring");
            }
        }
        CharSequence charSequence = this.f13243A;
        boolean z10 = menuItem instanceof a;
        if (z10) {
            ((a) menuItem).setContentDescription(charSequence);
        } else if (Build.VERSION.SDK_INT >= 26) {
            AbstractC0427m.h(menuItem, charSequence);
        }
        CharSequence charSequence2 = this.f13244B;
        if (z10) {
            ((a) menuItem).setTooltipText(charSequence2);
        } else if (Build.VERSION.SDK_INT >= 26) {
            AbstractC0427m.m(menuItem, charSequence2);
        }
        char c10 = this.f13259n;
        int i12 = this.f13260o;
        if (z10) {
            ((a) menuItem).setAlphabeticShortcut(c10, i12);
        } else if (Build.VERSION.SDK_INT >= 26) {
            AbstractC0427m.g(menuItem, c10, i12);
        }
        char c11 = this.f13261p;
        int i13 = this.f13262q;
        if (z10) {
            ((a) menuItem).setNumericShortcut(c11, i13);
        } else if (Build.VERSION.SDK_INT >= 26) {
            AbstractC0427m.k(menuItem, c11, i13);
        }
        PorterDuff.Mode mode = this.f13246D;
        if (mode != null) {
            if (z10) {
                ((a) menuItem).setIconTintMode(mode);
            } else if (Build.VERSION.SDK_INT >= 26) {
                AbstractC0427m.j(menuItem, mode);
            }
        }
        ColorStateList colorStateList = this.f13245C;
        if (colorStateList != null) {
            if (z10) {
                ((a) menuItem).setIconTintList(colorStateList);
            } else if (Build.VERSION.SDK_INT >= 26) {
                AbstractC0427m.i(menuItem, colorStateList);
            }
        }
    }
}
