package I7;

import G7.h;
import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import p.X;
import p210v8.i;

/* JADX INFO: loaded from: classes.dex */
public abstract class a extends X {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final float f2098A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public float f2099B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final boolean f2100C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public int f2101D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public int f2102E;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final float f2103z;

    public a(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.textViewStyle);
        this.f2098A = 1.0f;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, h.a, R.attr.textViewStyle, 0);
        this.f2098A = typedArrayObtainStyledAttributes.getFloat(2, 1.0f);
        this.f2099B = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, 0);
        this.f2100C = typedArrayObtainStyledAttributes.getBoolean(3, false);
        typedArrayObtainStyledAttributes.recycle();
        Resources resources = getResources();
        i.b(resources, "resources");
        this.f2103z = TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics());
        h();
    }

    @Override // android.widget.TextView
    public int getCompoundPaddingBottom() {
        return super.getCompoundPaddingBottom() + this.f2102E;
    }

    @Override // android.widget.TextView
    public int getCompoundPaddingTop() {
        return super.getCompoundPaddingTop() + this.f2101D;
    }

    public final void h() {
        TextPaint paint = getPaint();
        i.b(paint, "paint");
        Paint.FontMetricsInt fontMetricsInt = paint.getFontMetricsInt();
        int iAbs = Math.abs(fontMetricsInt.ascent - fontMetricsInt.descent) + fontMetricsInt.leading;
        float f10 = this.f2099B;
        if (f10 <= 0) {
            f10 = this.f2098A * iAbs;
        }
        float f11 = this.f2103z;
        setLineSpacing(((int) (f11 * ((float) Math.ceil(f10 / f11)))) - iAbs, 1.0f);
    }

    @Override // p.X, android.widget.TextView, android.view.View
    public final void onMeasure(int i10, int i11) {
        this.f2101D = 0;
        this.f2102E = 0;
        super.onMeasure(i10, i11);
        int measuredHeight = getMeasuredHeight();
        float baseline = getBaseline();
        float f10 = this.f2103z;
        float f11 = baseline % f10;
        if (f11 != 0.0f) {
            this.f2101D = (int) (((double) f10) - Math.ceil(f11));
        }
        int i12 = measuredHeight + this.f2101D;
        float f12 = i12 % f10;
        if (f12 != 0.0f) {
            this.f2102E = (int) (((double) f10) - Math.ceil(f12));
        }
        int i13 = i12 + this.f2102E;
        setMeasuredDimension(getMeasuredWidth(), i13);
        int mode = View.MeasureSpec.getMode(i11);
        if (this.f2100C && mode == 1073741824) {
            setMaxLines((int) Math.floor(((i13 - getCompoundPaddingTop()) - getCompoundPaddingBottom()) / getLineHeight()));
        }
    }

    public final void setLineHeightHint(float f10) {
        this.f2099B = f10;
        h();
    }
}
