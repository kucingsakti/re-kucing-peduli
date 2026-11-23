package p078i;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.AppCompatButton;
import java.lang.reflect.Constructor;
import p.C0717n;
import p.C0721p;
import p.C0740z;
import p.X;
import p212w.i;

/* JADX INFO: loaded from: classes.dex */
public class I {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Class[] f11975b = {Context.class, AttributeSet.class};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int[] f11976c = {R.attr.onClick};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int[] f11977d = {R.attr.accessibilityHeading};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int[] f11978e = {R.attr.accessibilityPaneTitle};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int[] f11979f = {R.attr.screenReaderFocusable};

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String[] f11980g = {"android.widget.", "android.view.", "android.webkit."};

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final i f11981h = new i(0);
    public final Object[] a = new Object[2];

    public C0717n a(Context context, AttributeSet attributeSet) {
        return new C0717n(context, attributeSet);
    }

    public AppCompatButton b(Context context, AttributeSet attributeSet) {
        return new AppCompatButton(context, attributeSet);
    }

    public C0721p c(Context context, AttributeSet attributeSet) {
        return new C0721p(context, attributeSet, com.kcstream.cing.R.attr.checkboxStyle);
    }

    public C0740z d(Context context, AttributeSet attributeSet) {
        return new C0740z(context, attributeSet);
    }

    public X e(Context context, AttributeSet attributeSet) {
        return new X(context, attributeSet);
    }

    public final View f(Context context, String str, String str2) {
        String strConcat;
        i iVar = f11981h;
        Constructor constructor = (Constructor) iVar.get(str);
        if (constructor == null) {
            if (str2 != null) {
                try {
                    strConcat = str2.concat(str);
                } catch (Exception unused) {
                    return null;
                }
            } else {
                strConcat = str;
            }
            constructor = Class.forName(strConcat, false, context.getClassLoader()).asSubclass(View.class).getConstructor(f11975b);
            iVar.put(str, constructor);
        }
        constructor.setAccessible(true);
        return (View) constructor.newInstance(this.a);
    }
}
