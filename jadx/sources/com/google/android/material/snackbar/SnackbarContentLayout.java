package com.google.android.material.snackbar;

import J7.j;
import R2.a;
import U.U;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.text.Layout;
import android.util.AttributeSet;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.kcstream.cing.R;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public class SnackbarContentLayout extends LinearLayout {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public TextView f9809s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public Button f9810t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final TimeInterpolator f9811u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f9812v;

    public SnackbarContentLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f9811u = j.D(context, R.attr.motionEasingEmphasizedInterpolator, a.f4441b);
    }

    public final boolean a(int i10, int i11, int i12) {
        boolean z6;
        if (i10 != getOrientation()) {
            setOrientation(i10);
            z6 = true;
        } else {
            z6 = false;
        }
        if (this.f9809s.getPaddingTop() == i11 && this.f9809s.getPaddingBottom() == i12) {
            return z6;
        }
        TextView textView = this.f9809s;
        WeakHashMap weakHashMap = U.a;
        if (textView.isPaddingRelative()) {
            textView.setPaddingRelative(textView.getPaddingStart(), i11, textView.getPaddingEnd(), i12);
            return true;
        }
        textView.setPadding(textView.getPaddingLeft(), i11, textView.getPaddingRight(), i12);
        return true;
    }

    public Button getActionView() {
        return this.f9810t;
    }

    public TextView getMessageView() {
        return this.f9809s;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.f9809s = (TextView) findViewById(R.id.snackbar_text);
        this.f9810t = (Button) findViewById(R.id.snackbar_action);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (getOrientation() == 1) {
            return;
        }
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.design_snackbar_padding_vertical_2lines);
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(R.dimen.design_snackbar_padding_vertical);
        Layout layout = this.f9809s.getLayout();
        boolean z6 = layout != null && layout.getLineCount() > 1;
        if (!z6 || this.f9812v <= 0 || this.f9810t.getMeasuredWidth() <= this.f9812v) {
            if (!z6) {
                dimensionPixelSize = dimensionPixelSize2;
            }
            if (!a(0, dimensionPixelSize, dimensionPixelSize)) {
                return;
            }
        } else if (!a(1, dimensionPixelSize, dimensionPixelSize - dimensionPixelSize2)) {
            return;
        }
        super.onMeasure(i10, i11);
    }

    public void setMaxInlineActionWidth(int i10) {
        this.f9812v = i10;
    }
}
