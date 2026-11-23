package p215w3;

import U.C0412b;
import V.j;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;
import p.X;

/* JADX INFO: loaded from: classes.dex */
public final class v extends C0412b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final TextInputLayout f15651d;

    public v(TextInputLayout textInputLayout) {
        this.f15651d = textInputLayout;
    }

    @Override // U.C0412b
    public final void d(View view, j jVar) {
        View.AccessibilityDelegate accessibilityDelegate = this.a;
        AccessibilityNodeInfo accessibilityNodeInfo = jVar.a;
        accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        TextInputLayout textInputLayout = this.f15651d;
        EditText editText = textInputLayout.getEditText();
        CharSequence text = editText != null ? editText.getText() : null;
        CharSequence hint = textInputLayout.getHint();
        CharSequence error = textInputLayout.getError();
        CharSequence placeholderText = textInputLayout.getPlaceholderText();
        int counterMaxLength = textInputLayout.getCounterMaxLength();
        CharSequence counterOverflowDescription = textInputLayout.getCounterOverflowDescription();
        boolean zIsEmpty = TextUtils.isEmpty(text);
        boolean zIsEmpty2 = TextUtils.isEmpty(hint);
        boolean z6 = textInputLayout.f9880M0;
        boolean zIsEmpty3 = TextUtils.isEmpty(error);
        boolean z10 = (zIsEmpty3 && TextUtils.isEmpty(counterOverflowDescription)) ? false : true;
        String string = !zIsEmpty2 ? hint.toString() : "";
        t tVar = textInputLayout.f9915t;
        X x8 = tVar.f15641t;
        if (x8.getVisibility() == 0) {
            accessibilityNodeInfo.setLabelFor(x8);
            accessibilityNodeInfo.setTraversalAfter(x8);
        } else {
            accessibilityNodeInfo.setTraversalAfter(tVar.f15643v);
        }
        if (!zIsEmpty) {
            jVar.m(text);
        } else if (!TextUtils.isEmpty(string)) {
            jVar.m(string);
            if (!z6 && placeholderText != null) {
                jVar.m(string + ", " + ((Object) placeholderText));
            }
        } else if (placeholderText != null) {
            jVar.m(placeholderText);
        }
        if (!TextUtils.isEmpty(string)) {
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 26) {
                jVar.k(string);
            } else {
                if (!zIsEmpty) {
                    string = ((Object) text) + ", " + string;
                }
                jVar.m(string);
            }
            if (i10 >= 26) {
                accessibilityNodeInfo.setShowingHintText(zIsEmpty);
            } else {
                jVar.h(4, zIsEmpty);
            }
        }
        if (text == null || text.length() != counterMaxLength) {
            counterMaxLength = -1;
        }
        accessibilityNodeInfo.setMaxTextLength(counterMaxLength);
        if (z10) {
            if (zIsEmpty3) {
                error = counterOverflowDescription;
            }
            accessibilityNodeInfo.setError(error);
        }
        X x10 = textInputLayout.f9857B.f15623y;
        if (x10 != null) {
            accessibilityNodeInfo.setLabelFor(x10);
        }
        textInputLayout.f9917u.b().n(jVar);
    }

    @Override // U.C0412b
    public final void e(View view, AccessibilityEvent accessibilityEvent) {
        super.e(view, accessibilityEvent);
        this.f15651d.f9917u.b().o(accessibilityEvent);
    }
}
