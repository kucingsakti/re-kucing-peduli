package p202v;

import K3.d;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import o1.r;

/* JADX INFO: loaded from: classes.dex */
public class a extends FrameLayout {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final int[] f15362x = {R.attr.colorBackground};

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final d f15363y = new d(27);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f15364s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f15365t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final Rect f15366u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final Rect f15367v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final r f15368w;

    public a(Context context, AttributeSet attributeSet, int i10) {
        ColorStateList colorStateListValueOf;
        super(context, attributeSet, i10);
        Rect rect = new Rect();
        this.f15366u = rect;
        this.f15367v = new Rect();
        r rVar = new r(this);
        this.f15368w = rVar;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, p194u.a.a, i10, com.kcstream.cing.R.style.CardView);
        if (typedArrayObtainStyledAttributes.hasValue(2)) {
            colorStateListValueOf = typedArrayObtainStyledAttributes.getColorStateList(2);
        } else {
            TypedArray typedArrayObtainStyledAttributes2 = getContext().obtainStyledAttributes(f15362x);
            int color = typedArrayObtainStyledAttributes2.getColor(0, 0);
            typedArrayObtainStyledAttributes2.recycle();
            float[] fArr = new float[3];
            Color.colorToHSV(color, fArr);
            colorStateListValueOf = ColorStateList.valueOf(fArr[2] > 0.5f ? getResources().getColor(com.kcstream.cing.R.color.cardview_light_background) : getResources().getColor(com.kcstream.cing.R.color.cardview_dark_background));
        }
        float dimension = typedArrayObtainStyledAttributes.getDimension(3, 0.0f);
        float dimension2 = typedArrayObtainStyledAttributes.getDimension(4, 0.0f);
        float dimension3 = typedArrayObtainStyledAttributes.getDimension(5, 0.0f);
        this.f15364s = typedArrayObtainStyledAttributes.getBoolean(7, false);
        this.f15365t = typedArrayObtainStyledAttributes.getBoolean(6, true);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(8, 0);
        rect.left = typedArrayObtainStyledAttributes.getDimensionPixelSize(10, dimensionPixelSize);
        rect.top = typedArrayObtainStyledAttributes.getDimensionPixelSize(12, dimensionPixelSize);
        rect.right = typedArrayObtainStyledAttributes.getDimensionPixelSize(11, dimensionPixelSize);
        rect.bottom = typedArrayObtainStyledAttributes.getDimensionPixelSize(9, dimensionPixelSize);
        dimension3 = dimension2 > dimension3 ? dimension2 : dimension3;
        typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        typedArrayObtainStyledAttributes.getDimensionPixelSize(1, 0);
        typedArrayObtainStyledAttributes.recycle();
        d dVar = f15363y;
        b bVar = new b(colorStateListValueOf, dimension);
        rVar.f13675t = bVar;
        setBackgroundDrawable(bVar);
        setClipToOutline(true);
        setElevation(dimension2);
        dVar.v(rVar, dimension3);
    }

    public ColorStateList getCardBackgroundColor() {
        return ((b) ((Drawable) this.f15368w.f13675t)).f15375h;
    }

    public float getCardElevation() {
        return ((a) this.f15368w.f13676u).getElevation();
    }

    public int getContentPaddingBottom() {
        return this.f15366u.bottom;
    }

    public int getContentPaddingLeft() {
        return this.f15366u.left;
    }

    public int getContentPaddingRight() {
        return this.f15366u.right;
    }

    public int getContentPaddingTop() {
        return this.f15366u.top;
    }

    public float getMaxCardElevation() {
        return ((b) ((Drawable) this.f15368w.f13675t)).f15372e;
    }

    public boolean getPreventCornerOverlap() {
        return this.f15365t;
    }

    public float getRadius() {
        return ((b) ((Drawable) this.f15368w.f13675t)).a;
    }

    public boolean getUseCompatPadding() {
        return this.f15364s;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
    }

    public void setCardBackgroundColor(int i10) {
        ColorStateList colorStateListValueOf = ColorStateList.valueOf(i10);
        b bVar = (b) ((Drawable) this.f15368w.f13675t);
        if (colorStateListValueOf == null) {
            bVar.getClass();
            colorStateListValueOf = ColorStateList.valueOf(0);
        }
        bVar.f15375h = colorStateListValueOf;
        bVar.f15369b.setColor(colorStateListValueOf.getColorForState(bVar.getState(), bVar.f15375h.getDefaultColor()));
        bVar.invalidateSelf();
    }

    public void setCardElevation(float f10) {
        ((a) this.f15368w.f13676u).setElevation(f10);
    }

    public void setMaxCardElevation(float f10) {
        f15363y.v(this.f15368w, f10);
    }

    @Override // android.view.View
    public void setMinimumHeight(int i10) {
        super.setMinimumHeight(i10);
    }

    @Override // android.view.View
    public void setMinimumWidth(int i10) {
        super.setMinimumWidth(i10);
    }

    public void setPreventCornerOverlap(boolean z6) {
        if (z6 != this.f15365t) {
            this.f15365t = z6;
            d dVar = f15363y;
            r rVar = this.f15368w;
            dVar.v(rVar, ((b) ((Drawable) rVar.f13675t)).f15372e);
        }
    }

    public void setRadius(float f10) {
        b bVar = (b) ((Drawable) this.f15368w.f13675t);
        if (f10 == bVar.a) {
            return;
        }
        bVar.a = f10;
        bVar.b(null);
        bVar.invalidateSelf();
    }

    public void setUseCompatPadding(boolean z6) {
        if (this.f15364s != z6) {
            this.f15364s = z6;
            d dVar = f15363y;
            r rVar = this.f15368w;
            dVar.v(rVar, ((b) ((Drawable) rVar.f13675t)).f15372e);
        }
    }

    public void setCardBackgroundColor(ColorStateList colorStateList) {
        b bVar = (b) ((Drawable) this.f15368w.f13675t);
        if (colorStateList == null) {
            bVar.getClass();
            colorStateList = ColorStateList.valueOf(0);
        }
        bVar.f15375h = colorStateList;
        bVar.f15369b.setColor(colorStateList.getColorForState(bVar.getState(), bVar.f15375h.getDefaultColor()));
        bVar.invalidateSelf();
    }

    @Override // android.view.View
    public final void setPadding(int i10, int i11, int i12, int i13) {
    }

    @Override // android.view.View
    public final void setPaddingRelative(int i10, int i11, int i12, int i13) {
    }
}
