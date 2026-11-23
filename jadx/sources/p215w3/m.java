package p215w3;

import E4.C0187a;
import V.j;
import android.content.Context;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.widget.EditText;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;

/* JADX INFO: loaded from: classes.dex */
public abstract class m {
    public final TextInputLayout a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l f15592b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f15593c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final CheckableImageButton f15594d;

    public m(l lVar) {
        this.a = lVar.f15584s;
        this.f15592b = lVar;
        this.f15593c = lVar.getContext();
        this.f15594d = lVar.f15590y;
    }

    public int c() {
        return 0;
    }

    public int d() {
        return 0;
    }

    public View.OnFocusChangeListener e() {
        return null;
    }

    public View.OnClickListener f() {
        return null;
    }

    public View.OnFocusChangeListener g() {
        return null;
    }

    public C0187a h() {
        return null;
    }

    public boolean i(int i10) {
        return true;
    }

    public boolean j() {
        return false;
    }

    public boolean k() {
        return this instanceof i;
    }

    public boolean l() {
        return false;
    }

    public final void q() {
        this.f15592b.f(false);
    }

    public void a() {
    }

    public void b() {
    }

    public void r() {
    }

    public void s() {
    }

    public void m(EditText editText) {
    }

    public void n(j jVar) {
    }

    public void o(AccessibilityEvent accessibilityEvent) {
    }

    public void p(boolean z6) {
    }
}
