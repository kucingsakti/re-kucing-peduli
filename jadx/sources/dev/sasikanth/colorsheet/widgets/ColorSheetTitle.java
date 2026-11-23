package dev.sasikanth.colorsheet.widgets;

import G7.h;
import I7.a;
import K.o;
import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import kotlin.Metadata;
import p210v8.i;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Ldev/sasikanth/colorsheet/widgets/ColorSheetTitle;", "LI7/a;", "colorsheet_release"}, k = 1, mv = {1, 4, 0})
public final class ColorSheetTitle extends a {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ColorSheetTitle(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        i.g(context, "context");
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, h.f1716b, R.attr.textViewStyle, 0);
        setLineHeightHint(typedArrayObtainStyledAttributes.getDimensionPixelSize(2, 0));
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        if (resourceId != 0) {
            ThreadLocal threadLocal = o.a;
            setTypeface(context.isRestricted() ? null : o.b(context, resourceId, new TypedValue(), 0, null, false, false));
        }
        setLetterSpacing(typedArrayObtainStyledAttributes.getFloat(1, 0.0f));
        typedArrayObtainStyledAttributes.recycle();
    }
}
