package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;

/* JADX INFO: loaded from: classes.dex */
public class ActivityChooserView$InnerLayout extends LinearLayout {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final int[] f6140s = {R.attr.background};

    public ActivityChooserView$InnerLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Y1.c cVarD = Y1.c.D(context, attributeSet, f6140s);
        setBackgroundDrawable(cVarD.v(0));
        cVarD.J();
    }
}
