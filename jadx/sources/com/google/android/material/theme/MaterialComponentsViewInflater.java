package com.google.android.material.theme;

import android.content.Context;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatButton;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.checkbox.b;
import com.google.android.material.radiobutton.MaterialRadioButton;
import com.google.android.material.textview.MaterialTextView;
import p.C0717n;
import p.C0721p;
import p.C0740z;
import p.X;
import p078i.I;
import p215w3.r;

/* JADX INFO: loaded from: classes.dex */
public class MaterialComponentsViewInflater extends I {
    @Override // p078i.I
    public final C0717n a(Context context, AttributeSet attributeSet) {
        return new r(context, attributeSet);
    }

    @Override // p078i.I
    public final AppCompatButton b(Context context, AttributeSet attributeSet) {
        return new MaterialButton(context, attributeSet);
    }

    @Override // p078i.I
    public final C0721p c(Context context, AttributeSet attributeSet) {
        return new b(context, attributeSet);
    }

    @Override // p078i.I
    public final C0740z d(Context context, AttributeSet attributeSet) {
        return new MaterialRadioButton(context, attributeSet);
    }

    @Override // p078i.I
    public final X e(Context context, AttributeSet attributeSet) {
        return new MaterialTextView(context, attributeSet);
    }
}
