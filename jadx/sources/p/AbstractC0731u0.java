package p;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;

/* JADX INFO: renamed from: p.u0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0731u0 extends ViewGroup {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public int[] f14133A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public int[] f14134B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public Drawable f14135C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public int f14136D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public int f14137E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public int f14138F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public int f14139G;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f14140s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f14141t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f14142u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f14143v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f14144w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f14145x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public float f14146y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f14147z;

    public AbstractC0731u0(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f14140s = true;
        this.f14141t = -1;
        this.f14142u = 0;
        this.f14144w = 8388659;
        int[] iArr = p069h.a.f11622o;
        Y1.c cVarE = Y1.c.E(context, attributeSet, iArr, 0);
        U.U.m(this, context, iArr, attributeSet, (TypedArray) cVarE.f5671u, 0);
        TypedArray typedArray = (TypedArray) cVarE.f5671u;
        int i10 = typedArray.getInt(1, -1);
        if (i10 >= 0) {
            setOrientation(i10);
        }
        int i11 = typedArray.getInt(0, -1);
        if (i11 >= 0) {
            setGravity(i11);
        }
        boolean z6 = typedArray.getBoolean(2, true);
        if (!z6) {
            setBaselineAligned(z6);
        }
        this.f14146y = typedArray.getFloat(4, -1.0f);
        this.f14141t = typedArray.getInt(3, -1);
        this.f14147z = typedArray.getBoolean(7, false);
        setDividerDrawable(cVarE.v(5));
        this.f14138F = typedArray.getInt(8, 0);
        this.f14139G = typedArray.getDimensionPixelSize(6, 0);
        cVarE.J();
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C0729t0;
    }

    public final void d(Canvas canvas, int i10) {
        this.f14135C.setBounds(getPaddingLeft() + this.f14139G, i10, (getWidth() - getPaddingRight()) - this.f14139G, this.f14137E + i10);
        this.f14135C.draw(canvas);
    }

    public final void e(Canvas canvas, int i10) {
        this.f14135C.setBounds(i10, getPaddingTop() + this.f14139G, this.f14136D + i10, (getHeight() - getPaddingBottom()) - this.f14139G);
        this.f14135C.draw(canvas);
    }

    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public C0729t0 generateDefaultLayoutParams() {
        int i10 = this.f14143v;
        if (i10 == 0) {
            return new C0729t0(-2, -2);
        }
        if (i10 == 1) {
            return new C0729t0(-1, -2);
        }
        return null;
    }

    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public C0729t0 generateLayoutParams(AttributeSet attributeSet) {
        return new C0729t0(getContext(), attributeSet);
    }

    @Override // android.view.View
    public int getBaseline() {
        int i10;
        if (this.f14141t < 0) {
            return super.getBaseline();
        }
        int childCount = getChildCount();
        int i11 = this.f14141t;
        if (childCount <= i11) {
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
        }
        View childAt = getChildAt(i11);
        int baseline = childAt.getBaseline();
        if (baseline == -1) {
            if (this.f14141t == 0) {
                return -1;
            }
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
        }
        int bottom = this.f14142u;
        if (this.f14143v == 1 && (i10 = this.f14144w & 112) != 48) {
            if (i10 == 16) {
                bottom += ((((getBottom() - getTop()) - getPaddingTop()) - getPaddingBottom()) - this.f14145x) / 2;
            } else if (i10 == 80) {
                bottom = ((getBottom() - getTop()) - getPaddingBottom()) - this.f14145x;
            }
        }
        return bottom + ((LinearLayout.LayoutParams) ((C0729t0) childAt.getLayoutParams())).topMargin + baseline;
    }

    public int getBaselineAlignedChildIndex() {
        return this.f14141t;
    }

    public Drawable getDividerDrawable() {
        return this.f14135C;
    }

    public int getDividerPadding() {
        return this.f14139G;
    }

    public int getDividerWidth() {
        return this.f14136D;
    }

    public int getGravity() {
        return this.f14144w;
    }

    public int getOrientation() {
        return this.f14143v;
    }

    public int getShowDividers() {
        return this.f14138F;
    }

    public int getVirtualChildCount() {
        return getChildCount();
    }

    public float getWeightSum() {
        return this.f14146y;
    }

    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public C0729t0 generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof C0729t0) {
            return new C0729t0((C0729t0) layoutParams);
        }
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new C0729t0((ViewGroup.MarginLayoutParams) layoutParams) : new C0729t0(layoutParams);
    }

    public final boolean i(int i10) {
        if (i10 == 0) {
            return (this.f14138F & 1) != 0;
        }
        if (i10 == getChildCount()) {
            return (this.f14138F & 4) != 0;
        }
        if ((this.f14138F & 2) != 0) {
            for (int i11 = i10 - 1; i11 >= 0; i11--) {
                if (getChildAt(i11).getVisibility() != 8) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int right;
        int left;
        int i10;
        int bottom;
        if (this.f14135C == null) {
            return;
        }
        int i11 = 0;
        if (this.f14143v == 1) {
            int virtualChildCount = getVirtualChildCount();
            while (i11 < virtualChildCount) {
                View childAt = getChildAt(i11);
                if (childAt != null && childAt.getVisibility() != 8 && i(i11)) {
                    d(canvas, (childAt.getTop() - ((LinearLayout.LayoutParams) ((C0729t0) childAt.getLayoutParams())).topMargin) - this.f14137E);
                }
                i11++;
            }
            if (i(virtualChildCount)) {
                View childAt2 = getChildAt(virtualChildCount - 1);
                if (childAt2 == null) {
                    bottom = (getHeight() - getPaddingBottom()) - this.f14137E;
                } else {
                    bottom = childAt2.getBottom() + ((LinearLayout.LayoutParams) ((C0729t0) childAt2.getLayoutParams())).bottomMargin;
                }
                d(canvas, bottom);
                return;
            }
            return;
        }
        int virtualChildCount2 = getVirtualChildCount();
        boolean z6 = f1.a;
        boolean z10 = getLayoutDirection() == 1;
        while (i11 < virtualChildCount2) {
            View childAt3 = getChildAt(i11);
            if (childAt3 != null && childAt3.getVisibility() != 8 && i(i11)) {
                C0729t0 c0729t0 = (C0729t0) childAt3.getLayoutParams();
                e(canvas, z10 ? childAt3.getRight() + ((LinearLayout.LayoutParams) c0729t0).rightMargin : (childAt3.getLeft() - ((LinearLayout.LayoutParams) c0729t0).leftMargin) - this.f14136D);
            }
            i11++;
        }
        if (i(virtualChildCount2)) {
            View childAt4 = getChildAt(virtualChildCount2 - 1);
            if (childAt4 != null) {
                C0729t0 c0729t1 = (C0729t0) childAt4.getLayoutParams();
                if (z10) {
                    left = childAt4.getLeft() - ((LinearLayout.LayoutParams) c0729t1).leftMargin;
                    i10 = this.f14136D;
                    right = left - i10;
                } else {
                    right = childAt4.getRight() + ((LinearLayout.LayoutParams) c0729t1).rightMargin;
                }
            } else if (z10) {
                right = getPaddingLeft();
            } else {
                left = getWidth() - getPaddingRight();
                i10 = this.f14136D;
                right = left - i10;
            }
            e(canvas, right);
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    /* JADX WARN: Code duplicated, block: B:29:0x009d  */
    /* JADX WARN: Code duplicated, block: B:62:0x0159  */
    /* JADX WARN: Code duplicated, block: B:65:0x0162  */
    /* JADX WARN: Code duplicated, block: B:67:0x0166  */
    /* JADX WARN: Code duplicated, block: B:69:0x016a  */
    /* JADX WARN: Code duplicated, block: B:70:0x016e  */
    /* JADX WARN: Code duplicated, block: B:72:0x0176  */
    /* JADX WARN: Code duplicated, block: B:74:0x0182  */
    /* JADX WARN: Code duplicated, block: B:76:0x0189  */
    /* JADX WARN: Code duplicated, block: B:77:0x0190  */
    /* JADX WARN: Code duplicated, block: B:80:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:81:0x01a8  */
    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z6, int i10, int i11, int i12, int i13) {
        int paddingLeft;
        int i14;
        int i15;
        int i16;
        int i17;
        int baseline;
        int i18;
        int i19;
        int i20;
        int measuredHeight;
        int i21;
        int paddingTop;
        int i22;
        int i23;
        int i24;
        int i25 = 8;
        char c10 = 2;
        if (this.f14143v == 1) {
            int paddingLeft2 = getPaddingLeft();
            int i26 = i12 - i10;
            int paddingRight = i26 - getPaddingRight();
            int paddingRight2 = (i26 - paddingLeft2) - getPaddingRight();
            int virtualChildCount = getVirtualChildCount();
            int i27 = this.f14144w;
            int i28 = i27 & 112;
            int i29 = 8388615 & i27;
            if (i28 != 16) {
                paddingTop = i28 != 80 ? getPaddingTop() : ((getPaddingTop() + i13) - i11) - this.f14145x;
            } else {
                paddingTop = getPaddingTop() + (((i13 - i11) - this.f14145x) / 2);
            }
            int i30 = 0;
            while (i30 < virtualChildCount) {
                View childAt = getChildAt(i30);
                if (childAt != null && childAt.getVisibility() != i25) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    int measuredHeight2 = childAt.getMeasuredHeight();
                    C0729t0 c0729t0 = (C0729t0) childAt.getLayoutParams();
                    int i31 = ((LinearLayout.LayoutParams) c0729t0).gravity;
                    if (i31 < 0) {
                        i31 = i29;
                    }
                    int absoluteGravity = Gravity.getAbsoluteGravity(i31, getLayoutDirection()) & 7;
                    if (absoluteGravity != 1) {
                        if (absoluteGravity != 5) {
                            i24 = ((LinearLayout.LayoutParams) c0729t0).leftMargin + paddingLeft2;
                        } else {
                            i22 = paddingRight - measuredWidth;
                            i23 = ((LinearLayout.LayoutParams) c0729t0).rightMargin;
                        }
                        if (i(i30)) {
                            paddingTop += this.f14137E;
                        }
                        int i32 = paddingTop + ((LinearLayout.LayoutParams) c0729t0).topMargin;
                        childAt.layout(i24, i32, measuredWidth + i24, i32 + measuredHeight2);
                        paddingTop = measuredHeight2 + ((LinearLayout.LayoutParams) c0729t0).bottomMargin + i32;
                    } else {
                        i22 = ((paddingRight2 - measuredWidth) / 2) + paddingLeft2 + ((LinearLayout.LayoutParams) c0729t0).leftMargin;
                        i23 = ((LinearLayout.LayoutParams) c0729t0).rightMargin;
                    }
                    i24 = i22 - i23;
                    if (i(i30)) {
                        paddingTop += this.f14137E;
                    }
                    int i33 = paddingTop + ((LinearLayout.LayoutParams) c0729t0).topMargin;
                    childAt.layout(i24, i33, measuredWidth + i24, i33 + measuredHeight2);
                    paddingTop = measuredHeight2 + ((LinearLayout.LayoutParams) c0729t0).bottomMargin + i33;
                }
                i30++;
                c10 = c10;
                i25 = 8;
            }
            return;
        }
        boolean z10 = f1.a;
        boolean z11 = getLayoutDirection() == 1;
        int paddingTop2 = getPaddingTop();
        int i34 = i13 - i11;
        int paddingBottom = i34 - getPaddingBottom();
        int paddingBottom2 = (i34 - paddingTop2) - getPaddingBottom();
        int virtualChildCount2 = getVirtualChildCount();
        int i35 = this.f14144w;
        int i36 = 8388615 & i35;
        int i37 = i35 & 112;
        boolean z12 = this.f14140s;
        int[] iArr = this.f14133A;
        int[] iArr2 = this.f14134B;
        int absoluteGravity2 = Gravity.getAbsoluteGravity(i36, getLayoutDirection());
        if (absoluteGravity2 != 1) {
            paddingLeft = absoluteGravity2 != 5 ? getPaddingLeft() : ((getPaddingLeft() + i12) - i10) - this.f14145x;
        } else {
            paddingLeft = getPaddingLeft() + (((i12 - i10) - this.f14145x) / 2);
        }
        if (z11) {
            i15 = virtualChildCount2 - 1;
            i14 = -1;
        } else {
            i14 = 1;
            i15 = 0;
        }
        int i38 = 0;
        while (i38 < virtualChildCount2) {
            int i39 = (i14 * i38) + i15;
            View childAt2 = getChildAt(i39);
            if (childAt2 == null) {
                i16 = i15;
            } else {
                i16 = i15;
                if (childAt2.getVisibility() != 8) {
                    int measuredWidth2 = childAt2.getMeasuredWidth();
                    int measuredHeight3 = childAt2.getMeasuredHeight();
                    C0729t0 c0729t1 = (C0729t0) childAt2.getLayoutParams();
                    int i40 = paddingLeft;
                    if (z12) {
                        i17 = paddingTop2;
                        baseline = ((LinearLayout.LayoutParams) c0729t1).height != -1 ? childAt2.getBaseline() : -1;
                        i18 = ((LinearLayout.LayoutParams) c0729t1).gravity;
                        if (i18 < 0) {
                            i18 = i37;
                        }
                        i19 = i18 & 112;
                        if (i19 != 16) {
                            if (i19 != 48) {
                                i20 = i17 + ((LinearLayout.LayoutParams) c0729t1).topMargin;
                                if (baseline != -1) {
                                    i20 = (iArr[1] - baseline) + i20;
                                }
                            } else if (i19 != 80) {
                                i20 = i17;
                            } else {
                                i20 = (paddingBottom - measuredHeight3) - ((LinearLayout.LayoutParams) c0729t1).bottomMargin;
                                if (baseline != -1) {
                                    measuredHeight = iArr2[2] - (childAt2.getMeasuredHeight() - baseline);
                                }
                            }
                            if (i(i39)) {
                                i21 = i40 + this.f14136D;
                            } else {
                                i21 = i40;
                            }
                            int i41 = i21 + ((LinearLayout.LayoutParams) c0729t1).leftMargin;
                            childAt2.layout(i41, i20, i41 + measuredWidth2, i20 + measuredHeight3);
                            paddingLeft = measuredWidth2 + ((LinearLayout.LayoutParams) c0729t1).rightMargin + i41;
                        } else {
                            i20 = ((paddingBottom2 - measuredHeight3) / 2) + i17 + ((LinearLayout.LayoutParams) c0729t1).topMargin;
                            measuredHeight = ((LinearLayout.LayoutParams) c0729t1).bottomMargin;
                        }
                        i20 -= measuredHeight;
                        if (i(i39)) {
                            i21 = i40 + this.f14136D;
                        } else {
                            i21 = i40;
                        }
                        int i42 = i21 + ((LinearLayout.LayoutParams) c0729t1).leftMargin;
                        childAt2.layout(i42, i20, i42 + measuredWidth2, i20 + measuredHeight3);
                        paddingLeft = measuredWidth2 + ((LinearLayout.LayoutParams) c0729t1).rightMargin + i42;
                    } else {
                        i17 = paddingTop2;
                    }
                    i18 = ((LinearLayout.LayoutParams) c0729t1).gravity;
                    if (i18 < 0) {
                        i18 = i37;
                    }
                    i19 = i18 & 112;
                    if (i19 != 16) {
                        if (i19 != 48) {
                            i20 = i17 + ((LinearLayout.LayoutParams) c0729t1).topMargin;
                            if (baseline != -1) {
                                i20 = (iArr[1] - baseline) + i20;
                            }
                        } else if (i19 != 80) {
                            i20 = i17;
                        } else {
                            i20 = (paddingBottom - measuredHeight3) - ((LinearLayout.LayoutParams) c0729t1).bottomMargin;
                            if (baseline != -1) {
                                measuredHeight = iArr2[2] - (childAt2.getMeasuredHeight() - baseline);
                            }
                        }
                        if (i(i39)) {
                            i21 = i40 + this.f14136D;
                        } else {
                            i21 = i40;
                        }
                        int i43 = i21 + ((LinearLayout.LayoutParams) c0729t1).leftMargin;
                        childAt2.layout(i43, i20, i43 + measuredWidth2, i20 + measuredHeight3);
                        paddingLeft = measuredWidth2 + ((LinearLayout.LayoutParams) c0729t1).rightMargin + i43;
                    } else {
                        i20 = ((paddingBottom2 - measuredHeight3) / 2) + i17 + ((LinearLayout.LayoutParams) c0729t1).topMargin;
                        measuredHeight = ((LinearLayout.LayoutParams) c0729t1).bottomMargin;
                    }
                    i20 -= measuredHeight;
                    if (i(i39)) {
                        i21 = i40 + this.f14136D;
                    } else {
                        i21 = i40;
                    }
                    int i44 = i21 + ((LinearLayout.LayoutParams) c0729t1).leftMargin;
                    childAt2.layout(i44, i20, i44 + measuredWidth2, i20 + measuredHeight3);
                    paddingLeft = measuredWidth2 + ((LinearLayout.LayoutParams) c0729t1).rightMargin + i44;
                }
                i38++;
                i15 = i16;
                paddingTop2 = i17;
            }
            i17 = paddingTop2;
            i38++;
            i15 = i16;
            paddingTop2 = i17;
        }
    }

    /* JADX WARN: Code duplicated, block: B:228:0x04e4  */
    /* JADX WARN: Code duplicated, block: B:231:0x04f9  */
    /* JADX WARN: Code duplicated, block: B:233:0x0502  */
    /* JADX WARN: Code duplicated, block: B:235:0x0506  */
    /* JADX WARN: Code duplicated, block: B:237:0x0527  */
    /* JADX WARN: Code duplicated, block: B:243:0x0537  */
    /* JADX WARN: Code duplicated, block: B:246:0x053e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:248:0x0541  */
    /* JADX WARN: Code duplicated, block: B:250:0x0548 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:252:0x054b  */
    /* JADX WARN: Code duplicated, block: B:366:0x079d  */
    /* JADX WARN: Code duplicated, block: B:64:0x013f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:66:0x0142  */
    /* JADX WARN: Code duplicated, block: B:68:0x0148 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:70:0x014b  */
    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        int i12;
        int i13;
        int i14;
        int iMax;
        int i15;
        int baseline;
        int i16;
        int i17;
        int[] iArr;
        int i18;
        int i19;
        boolean z6;
        boolean z10;
        C0729t0 c0729t0;
        View view;
        int i20;
        int[] iArr2;
        int i21;
        int i22;
        boolean z11;
        int i23;
        int measuredHeight;
        boolean z12;
        boolean z13;
        int iMax2;
        int i24;
        int baseline2;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        boolean z14;
        int i30;
        int i31;
        int i32;
        View view2;
        boolean z15;
        AbstractC0731u0 abstractC0731u0 = this;
        int i33 = -2;
        int i34 = 1073741824;
        int i35 = 8;
        int iMax3 = 0;
        if (abstractC0731u0.f14143v == 1) {
            abstractC0731u0.f14145x = 0;
            int virtualChildCount = abstractC0731u0.getVirtualChildCount();
            int mode = View.MeasureSpec.getMode(i10);
            int mode2 = View.MeasureSpec.getMode(i11);
            int i36 = abstractC0731u0.f14141t;
            boolean z16 = abstractC0731u0.f14147z;
            int i37 = 0;
            int iMax4 = 0;
            int iMax5 = 0;
            boolean z17 = false;
            int i38 = 0;
            boolean z18 = false;
            boolean z19 = true;
            float f10 = 0.0f;
            int iMax6 = 0;
            while (i37 < virtualChildCount) {
                int i39 = mode;
                View childAt = abstractC0731u0.getChildAt(i37);
                if (childAt == null) {
                    abstractC0731u0.f14145x = abstractC0731u0.f14145x;
                } else {
                    if (childAt.getVisibility() != i35) {
                        if (abstractC0731u0.i(i37)) {
                            abstractC0731u0.f14145x += abstractC0731u0.f14137E;
                        }
                        C0729t0 c0729t1 = (C0729t0) childAt.getLayoutParams();
                        float f11 = ((LinearLayout.LayoutParams) c0729t1).weight;
                        f10 += f11;
                        if (mode2 == i34 && ((LinearLayout.LayoutParams) c0729t1).height == 0 && f11 > 0.0f) {
                            int i40 = abstractC0731u0.f14145x;
                            abstractC0731u0.f14145x = Math.max(i40, ((LinearLayout.LayoutParams) c0729t1).topMargin + i40 + ((LinearLayout.LayoutParams) c0729t1).bottomMargin);
                            view2 = childAt;
                            i29 = mode2;
                            i30 = i36;
                            z14 = z16;
                            i31 = i37;
                            z17 = true;
                            i32 = i39;
                        } else {
                            if (((LinearLayout.LayoutParams) c0729t1).height != 0 || f11 <= 0.0f) {
                                i28 = Integer.MIN_VALUE;
                            } else {
                                ((LinearLayout.LayoutParams) c0729t1).height = i33;
                                i28 = 0;
                            }
                            i29 = mode2;
                            z14 = z16;
                            i30 = i36;
                            i31 = i37;
                            i32 = i39;
                            abstractC0731u0.measureChildWithMargins(childAt, i10, 0, i11, f10 == 0.0f ? abstractC0731u0.f14145x : 0);
                            if (i28 != Integer.MIN_VALUE) {
                                ((LinearLayout.LayoutParams) c0729t1).height = i28;
                            }
                            int measuredHeight2 = childAt.getMeasuredHeight();
                            int i41 = abstractC0731u0.f14145x;
                            view2 = childAt;
                            abstractC0731u0.f14145x = Math.max(i41, i41 + measuredHeight2 + ((LinearLayout.LayoutParams) c0729t1).topMargin + ((LinearLayout.LayoutParams) c0729t1).bottomMargin);
                            if (z14) {
                                iMax6 = Math.max(measuredHeight2, iMax6);
                            }
                        }
                        if (i30 >= 0 && i30 == i31 + 1) {
                            abstractC0731u0.f14142u = abstractC0731u0.f14145x;
                        }
                        if (i31 < i30 && ((LinearLayout.LayoutParams) c0729t1).weight > 0.0f) {
                            throw new RuntimeException("A child of LinearLayout with index less than mBaselineAlignedChildIndex has weight > 0, which won't work.  Either remove the weight, or don't set mBaselineAlignedChildIndex.");
                        }
                        if (i32 == 1073741824 || ((LinearLayout.LayoutParams) c0729t1).width != -1) {
                            z15 = false;
                        } else {
                            z15 = true;
                            z18 = true;
                        }
                        int i42 = ((LinearLayout.LayoutParams) c0729t1).leftMargin + ((LinearLayout.LayoutParams) c0729t1).rightMargin;
                        int measuredWidth = view2.getMeasuredWidth() + i42;
                        int iMax7 = Math.max(iMax3, measuredWidth);
                        int measuredState = view2.getMeasuredState();
                        boolean z20 = z15;
                        int iCombineMeasuredStates = View.combineMeasuredStates(i38, measuredState);
                        if (z19) {
                            i38 = iCombineMeasuredStates;
                            boolean z21 = ((LinearLayout.LayoutParams) c0729t1).width == -1;
                            if (((LinearLayout.LayoutParams) c0729t1).weight > 0.0f) {
                                if (!z20) {
                                    i42 = measuredWidth;
                                }
                                iMax5 = Math.max(iMax5, i42);
                            } else {
                                if (!z20) {
                                    i42 = measuredWidth;
                                }
                                iMax4 = Math.max(iMax4, i42);
                            }
                            z19 = z21;
                            iMax3 = iMax7;
                        } else {
                            i38 = iCombineMeasuredStates;
                        }
                        if (((LinearLayout.LayoutParams) c0729t1).weight > 0.0f) {
                            if (!z20) {
                                i42 = measuredWidth;
                            }
                            iMax5 = Math.max(iMax5, i42);
                        } else {
                            if (!z20) {
                                i42 = measuredWidth;
                            }
                            iMax4 = Math.max(iMax4, i42);
                        }
                        z19 = z21;
                        iMax3 = iMax7;
                    }
                    i37 = i31 + 1;
                    i36 = i30;
                    mode = i32;
                    z16 = z14;
                    mode2 = i29;
                    i33 = -2;
                    i34 = 1073741824;
                    i35 = 8;
                }
                i29 = mode2;
                i30 = i36;
                z14 = z16;
                i31 = i37;
                i32 = i39;
                i37 = i31 + 1;
                i36 = i30;
                mode = i32;
                z16 = z14;
                mode2 = i29;
                i33 = -2;
                i34 = 1073741824;
                i35 = 8;
            }
            int i43 = mode;
            int i44 = mode2;
            boolean z22 = z16;
            int i45 = i38;
            int i46 = i11;
            if (abstractC0731u0.f14145x > 0 && abstractC0731u0.i(virtualChildCount)) {
                abstractC0731u0.f14145x += abstractC0731u0.f14137E;
            }
            if (z22 && (i44 == Integer.MIN_VALUE || i44 == 0)) {
                abstractC0731u0.f14145x = 0;
                for (int i47 = 0; i47 < virtualChildCount; i47++) {
                    View childAt2 = abstractC0731u0.getChildAt(i47);
                    if (childAt2 == null) {
                        abstractC0731u0.f14145x = abstractC0731u0.f14145x;
                    } else if (childAt2.getVisibility() != 8) {
                        C0729t0 c0729t2 = (C0729t0) childAt2.getLayoutParams();
                        int i48 = abstractC0731u0.f14145x;
                        abstractC0731u0.f14145x = Math.max(i48, i48 + iMax6 + ((LinearLayout.LayoutParams) c0729t2).topMargin + ((LinearLayout.LayoutParams) c0729t2).bottomMargin);
                    }
                }
            }
            int paddingBottom = abstractC0731u0.getPaddingBottom() + abstractC0731u0.getPaddingTop() + abstractC0731u0.f14145x;
            abstractC0731u0.f14145x = paddingBottom;
            int iResolveSizeAndState = View.resolveSizeAndState(Math.max(paddingBottom, abstractC0731u0.getSuggestedMinimumHeight()), i46, 0);
            int i49 = (iResolveSizeAndState & 16777215) - abstractC0731u0.f14145x;
            if (z17 || (i49 != 0 && f10 > 0.0f)) {
                float f12 = abstractC0731u0.f14146y;
                if (f12 > 0.0f) {
                    f10 = f12;
                }
                abstractC0731u0.f14145x = 0;
                int iCombineMeasuredStates2 = i45;
                int i50 = 0;
                while (i50 < virtualChildCount) {
                    View childAt3 = abstractC0731u0.getChildAt(i50);
                    if (childAt3.getVisibility() == 8) {
                        i50 = i50;
                    } else {
                        C0729t0 c0729t3 = (C0729t0) childAt3.getLayoutParams();
                        float f13 = ((LinearLayout.LayoutParams) c0729t3).weight;
                        if (f13 > 0.0f) {
                            int i51 = (int) ((i49 * f13) / f10);
                            f10 -= f13;
                            i49 -= i51;
                            int childMeasureSpec = ViewGroup.getChildMeasureSpec(i10, abstractC0731u0.getPaddingRight() + abstractC0731u0.getPaddingLeft() + ((LinearLayout.LayoutParams) c0729t3).leftMargin + ((LinearLayout.LayoutParams) c0729t3).rightMargin, ((LinearLayout.LayoutParams) c0729t3).width);
                            if (((LinearLayout.LayoutParams) c0729t3).height == 0) {
                                i27 = 1073741824;
                                if (i44 == 1073741824) {
                                    if (i51 <= 0) {
                                        i51 = 0;
                                    }
                                    childAt3.measure(childMeasureSpec, View.MeasureSpec.makeMeasureSpec(i51, 1073741824));
                                }
                                iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates2, childAt3.getMeasuredState() & (-256));
                            } else {
                                i27 = 1073741824;
                            }
                            int measuredHeight3 = childAt3.getMeasuredHeight() + i51;
                            if (measuredHeight3 < 0) {
                                measuredHeight3 = 0;
                            }
                            childAt3.measure(childMeasureSpec, View.MeasureSpec.makeMeasureSpec(measuredHeight3, i27));
                            iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates2, childAt3.getMeasuredState() & (-256));
                        }
                        int i52 = ((LinearLayout.LayoutParams) c0729t3).leftMargin + ((LinearLayout.LayoutParams) c0729t3).rightMargin;
                        int measuredWidth2 = childAt3.getMeasuredWidth() + i52;
                        iMax3 = Math.max(iMax3, measuredWidth2);
                        if (i43 != 1073741824) {
                            i26 = -1;
                            if (((LinearLayout.LayoutParams) c0729t3).width == -1) {
                                measuredWidth2 = i52;
                            }
                        } else {
                            i26 = -1;
                        }
                        iMax4 = Math.max(iMax4, measuredWidth2);
                        boolean z23 = z19 && ((LinearLayout.LayoutParams) c0729t3).width == i26;
                        int i53 = abstractC0731u0.f14145x;
                        abstractC0731u0.f14145x = Math.max(i53, childAt3.getMeasuredHeight() + i53 + ((LinearLayout.LayoutParams) c0729t3).topMargin + ((LinearLayout.LayoutParams) c0729t3).bottomMargin);
                        z19 = z23;
                    }
                    i50++;
                }
                abstractC0731u0.f14145x = abstractC0731u0.getPaddingBottom() + abstractC0731u0.getPaddingTop() + abstractC0731u0.f14145x;
                i45 = iCombineMeasuredStates2;
            } else {
                iMax4 = Math.max(iMax4, iMax5);
                if (z22 && i44 != 1073741824) {
                    for (int i54 = 0; i54 < virtualChildCount; i54++) {
                        View childAt4 = abstractC0731u0.getChildAt(i54);
                        if (childAt4 != null && childAt4.getVisibility() != 8 && ((LinearLayout.LayoutParams) ((C0729t0) childAt4.getLayoutParams())).weight > 0.0f) {
                            childAt4.measure(View.MeasureSpec.makeMeasureSpec(childAt4.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(iMax6, 1073741824));
                        }
                    }
                }
            }
            if (z19 || i43 == 1073741824) {
                iMax4 = iMax3;
            }
            abstractC0731u0.setMeasuredDimension(View.resolveSizeAndState(Math.max(abstractC0731u0.getPaddingRight() + abstractC0731u0.getPaddingLeft() + iMax4, abstractC0731u0.getSuggestedMinimumWidth()), i10, i45), iResolveSizeAndState);
            if (z18) {
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(abstractC0731u0.getMeasuredWidth(), 1073741824);
                int i55 = 0;
                while (i55 < virtualChildCount) {
                    View childAt5 = abstractC0731u0.getChildAt(i55);
                    if (childAt5.getVisibility() != 8) {
                        C0729t0 c0729t4 = (C0729t0) childAt5.getLayoutParams();
                        if (((LinearLayout.LayoutParams) c0729t4).width == -1) {
                            int i56 = ((LinearLayout.LayoutParams) c0729t4).height;
                            ((LinearLayout.LayoutParams) c0729t4).height = childAt5.getMeasuredHeight();
                            abstractC0731u0.measureChildWithMargins(childAt5, iMakeMeasureSpec, 0, i46, 0);
                            ((LinearLayout.LayoutParams) c0729t4).height = i56;
                        }
                    }
                    i55++;
                    i46 = i11;
                }
                return;
            }
            return;
        }
        int i57 = i10;
        abstractC0731u0.f14145x = 0;
        int virtualChildCount2 = abstractC0731u0.getVirtualChildCount();
        int mode3 = View.MeasureSpec.getMode(i57);
        int mode4 = View.MeasureSpec.getMode(i11);
        if (abstractC0731u0.f14133A == null || abstractC0731u0.f14134B == null) {
            abstractC0731u0.f14133A = new int[4];
            abstractC0731u0.f14134B = new int[4];
        }
        int[] iArr3 = abstractC0731u0.f14133A;
        int[] iArr4 = abstractC0731u0.f14134B;
        iArr3[3] = -1;
        char c10 = 2;
        iArr3[2] = -1;
        iArr3[1] = -1;
        iArr3[0] = -1;
        iArr4[3] = -1;
        iArr4[2] = -1;
        iArr4[1] = -1;
        iArr4[0] = -1;
        boolean z24 = abstractC0731u0.f14140s;
        boolean z25 = abstractC0731u0.f14147z;
        boolean z26 = mode3 == 1073741824;
        float f14 = 0.0f;
        boolean z27 = true;
        int i58 = 0;
        int i59 = 0;
        int i60 = 0;
        int iMax8 = 0;
        int iMax9 = 0;
        int iCombineMeasuredStates3 = 0;
        boolean z28 = false;
        boolean z29 = false;
        while (i58 < virtualChildCount2) {
            char c11 = c10;
            View childAt6 = abstractC0731u0.getChildAt(i58);
            if (childAt6 == null) {
                abstractC0731u0.f14145x = abstractC0731u0.f14145x;
                i19 = i58;
                i24 = i60;
                iArr2 = iArr3;
                iArr = iArr4;
                z6 = z24;
                z10 = z25;
            } else {
                int i61 = i59;
                if (childAt6.getVisibility() == 8) {
                    i57 = i10;
                    i19 = i58;
                    i24 = i60;
                    iArr = iArr4;
                    z6 = z24;
                    z10 = z25;
                    i59 = i61;
                    iArr2 = iArr3;
                } else {
                    if (abstractC0731u0.i(i58)) {
                        abstractC0731u0.f14145x += abstractC0731u0.f14136D;
                    }
                    C0729t0 c0729t5 = (C0729t0) childAt6.getLayoutParams();
                    float f15 = ((LinearLayout.LayoutParams) c0729t5).weight;
                    f14 += f15;
                    int i62 = i58;
                    if (mode3 == 1073741824 && ((LinearLayout.LayoutParams) c0729t5).width == 0 && f15 > 0.0f) {
                        if (z26) {
                            abstractC0731u0.f14145x = ((LinearLayout.LayoutParams) c0729t5).leftMargin + ((LinearLayout.LayoutParams) c0729t5).rightMargin + abstractC0731u0.f14145x;
                        } else {
                            int i63 = abstractC0731u0.f14145x;
                            abstractC0731u0.f14145x = Math.max(i63, ((LinearLayout.LayoutParams) c0729t5).leftMargin + i63 + ((LinearLayout.LayoutParams) c0729t5).rightMargin);
                        }
                        if (z24) {
                            int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
                            childAt6.measure(iMakeMeasureSpec2, iMakeMeasureSpec2);
                            view = childAt6;
                            z6 = z24;
                            z10 = z25;
                            i20 = i61;
                            i19 = i62;
                            c0729t0 = c0729t5;
                            iArr2 = iArr3;
                            iArr = iArr4;
                            i57 = i10;
                            i21 = i60;
                            i18 = iMax8;
                        } else {
                            view = childAt6;
                            z6 = z24;
                            z10 = z25;
                            z29 = true;
                            i20 = i61;
                            i19 = i62;
                            i22 = 1073741824;
                            c0729t0 = c0729t5;
                            iArr2 = iArr3;
                            iArr = iArr4;
                            i57 = i10;
                            i21 = i60;
                            i18 = iMax8;
                        }
                        if (mode4 == i22 && ((LinearLayout.LayoutParams) c0729t0).height == -1) {
                            z11 = true;
                            z28 = true;
                        } else {
                            z11 = false;
                        }
                        i23 = ((LinearLayout.LayoutParams) c0729t0).topMargin + ((LinearLayout.LayoutParams) c0729t0).bottomMargin;
                        measuredHeight = view.getMeasuredHeight() + i23;
                        iCombineMeasuredStates3 = View.combineMeasuredStates(iCombineMeasuredStates3, view.getMeasuredState());
                        if (z6) {
                            baseline2 = view.getBaseline();
                            z12 = z11;
                            if (baseline2 != -1) {
                                i25 = ((LinearLayout.LayoutParams) c0729t0).gravity;
                                if (i25 < 0) {
                                    i25 = abstractC0731u0.f14144w;
                                }
                                int i64 = (((i25 & 112) >> 4) & (-2)) >> 1;
                                iArr2[i64] = Math.max(iArr2[i64], baseline2);
                                iArr[i64] = Math.max(iArr[i64], measuredHeight - baseline2);
                            }
                        } else {
                            z12 = z11;
                        }
                        int iMax10 = Math.max(i20, measuredHeight);
                        if (z27 || ((LinearLayout.LayoutParams) c0729t0).height != -1) {
                            z13 = false;
                        } else {
                            z13 = true;
                        }
                        if (((LinearLayout.LayoutParams) c0729t0).weight > 0.0f) {
                            if (!z12) {
                                i23 = measuredHeight;
                            }
                            iMax8 = Math.max(i18, i23);
                            iMax2 = i21;
                        } else {
                            if (!z12) {
                                i23 = measuredHeight;
                            }
                            iMax2 = Math.max(i21, i23);
                            iMax8 = i18;
                        }
                        int i65 = iMax2;
                        i59 = iMax10;
                        i24 = i65;
                        z27 = z13;
                    } else {
                        if (((LinearLayout.LayoutParams) c0729t5).width != 0 || f15 <= 0.0f) {
                            i17 = Integer.MIN_VALUE;
                        } else {
                            ((LinearLayout.LayoutParams) c0729t5).width = -2;
                            i17 = 0;
                        }
                        iArr = iArr4;
                        i18 = iMax8;
                        i19 = i62;
                        z6 = z24;
                        z10 = z25;
                        int i66 = i17;
                        c0729t0 = c0729t5;
                        view = childAt6;
                        i20 = i61;
                        i57 = i10;
                        iArr2 = iArr3;
                        i21 = i60;
                        abstractC0731u0.measureChildWithMargins(view, i57, f14 == 0.0f ? abstractC0731u0.f14145x : 0, i11, 0);
                        if (i66 != Integer.MIN_VALUE) {
                            ((LinearLayout.LayoutParams) c0729t0).width = i66;
                        }
                        int measuredWidth3 = view.getMeasuredWidth();
                        if (z26) {
                            abstractC0731u0.f14145x = ((LinearLayout.LayoutParams) c0729t0).leftMargin + measuredWidth3 + ((LinearLayout.LayoutParams) c0729t0).rightMargin + abstractC0731u0.f14145x;
                        } else {
                            int i67 = abstractC0731u0.f14145x;
                            abstractC0731u0.f14145x = Math.max(i67, i67 + measuredWidth3 + ((LinearLayout.LayoutParams) c0729t0).leftMargin + ((LinearLayout.LayoutParams) c0729t0).rightMargin);
                        }
                        if (z10) {
                            iMax9 = Math.max(measuredWidth3, iMax9);
                        }
                    }
                    i22 = 1073741824;
                    if (mode4 == i22) {
                        z11 = false;
                    } else {
                        z11 = false;
                    }
                    i23 = ((LinearLayout.LayoutParams) c0729t0).topMargin + ((LinearLayout.LayoutParams) c0729t0).bottomMargin;
                    measuredHeight = view.getMeasuredHeight() + i23;
                    iCombineMeasuredStates3 = View.combineMeasuredStates(iCombineMeasuredStates3, view.getMeasuredState());
                    if (z6) {
                        baseline2 = view.getBaseline();
                        z12 = z11;
                        if (baseline2 != -1) {
                            i25 = ((LinearLayout.LayoutParams) c0729t0).gravity;
                            if (i25 < 0) {
                                i25 = abstractC0731u0.f14144w;
                            }
                            int i68 = (((i25 & 112) >> 4) & (-2)) >> 1;
                            iArr2[i68] = Math.max(iArr2[i68], baseline2);
                            iArr[i68] = Math.max(iArr[i68], measuredHeight - baseline2);
                        }
                    } else {
                        z12 = z11;
                    }
                    int iMax11 = Math.max(i20, measuredHeight);
                    if (z27) {
                        z13 = false;
                    } else {
                        z13 = false;
                    }
                    if (((LinearLayout.LayoutParams) c0729t0).weight > 0.0f) {
                        if (!z12) {
                            i23 = measuredHeight;
                        }
                        iMax8 = Math.max(i18, i23);
                        iMax2 = i21;
                    } else {
                        if (!z12) {
                            i23 = measuredHeight;
                        }
                        iMax2 = Math.max(i21, i23);
                        iMax8 = i18;
                    }
                    int i69 = iMax2;
                    i59 = iMax11;
                    i24 = i69;
                    z27 = z13;
                }
            }
            i60 = i24;
            i58 = i19 + 1;
            c10 = c11;
            iArr3 = iArr2;
            iArr4 = iArr;
            z24 = z6;
            z25 = z10;
        }
        int[] iArr5 = iArr3;
        int[] iArr6 = iArr4;
        char c12 = c10;
        boolean z30 = z24;
        boolean z31 = z25;
        int i70 = i59;
        int i71 = i60;
        int i72 = iMax8;
        if (abstractC0731u0.f14145x > 0 && abstractC0731u0.i(virtualChildCount2)) {
            abstractC0731u0.f14145x += abstractC0731u0.f14136D;
        }
        int i73 = iArr5[1];
        int iMax12 = (i73 == -1 && iArr5[0] == -1 && iArr5[c12] == -1 && iArr5[3] == -1) ? i70 : Math.max(i70, Math.max(iArr6[3], Math.max(iArr6[0], Math.max(iArr6[1], iArr6[c12]))) + Math.max(iArr5[3], Math.max(iArr5[0], Math.max(i73, iArr5[c12]))));
        if (z31 && (mode3 == Integer.MIN_VALUE || mode3 == 0)) {
            abstractC0731u0.f14145x = 0;
            for (int i74 = 0; i74 < virtualChildCount2; i74++) {
                View childAt7 = abstractC0731u0.getChildAt(i74);
                if (childAt7 == null) {
                    abstractC0731u0.f14145x = abstractC0731u0.f14145x;
                } else if (childAt7.getVisibility() != 8) {
                    C0729t0 c0729t6 = (C0729t0) childAt7.getLayoutParams();
                    if (z26) {
                        abstractC0731u0.f14145x = ((LinearLayout.LayoutParams) c0729t6).leftMargin + iMax9 + ((LinearLayout.LayoutParams) c0729t6).rightMargin + abstractC0731u0.f14145x;
                    } else {
                        int i75 = abstractC0731u0.f14145x;
                        abstractC0731u0.f14145x = Math.max(i75, i75 + iMax9 + ((LinearLayout.LayoutParams) c0729t6).leftMargin + ((LinearLayout.LayoutParams) c0729t6).rightMargin);
                    }
                }
            }
        }
        int paddingRight = abstractC0731u0.getPaddingRight() + abstractC0731u0.getPaddingLeft() + abstractC0731u0.f14145x;
        abstractC0731u0.f14145x = paddingRight;
        int iResolveSizeAndState2 = View.resolveSizeAndState(Math.max(paddingRight, abstractC0731u0.getSuggestedMinimumWidth()), i57, 0);
        int i76 = (iResolveSizeAndState2 & 16777215) - abstractC0731u0.f14145x;
        if (z29 || (i76 != 0 && f14 > 0.0f)) {
            float f16 = abstractC0731u0.f14146y;
            if (f16 > 0.0f) {
                f14 = f16;
            }
            iArr5[3] = -1;
            iArr5[c12] = -1;
            iArr5[1] = -1;
            iArr5[0] = -1;
            iArr6[3] = -1;
            iArr6[c12] = -1;
            iArr6[1] = -1;
            iArr6[0] = -1;
            abstractC0731u0.f14145x = 0;
            iMax12 = -1;
            int i77 = 0;
            while (i77 < virtualChildCount2) {
                View childAt8 = abstractC0731u0.getChildAt(i77);
                if (childAt8 == null || childAt8.getVisibility() == 8) {
                    iResolveSizeAndState2 = iResolveSizeAndState2;
                } else {
                    C0729t0 c0729t7 = (C0729t0) childAt8.getLayoutParams();
                    float f17 = ((LinearLayout.LayoutParams) c0729t7).weight;
                    if (f17 > 0.0f) {
                        int i78 = (int) ((i76 * f17) / f14);
                        f14 -= f17;
                        i76 -= i78;
                        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i11, abstractC0731u0.getPaddingBottom() + abstractC0731u0.getPaddingTop() + ((LinearLayout.LayoutParams) c0729t7).topMargin + ((LinearLayout.LayoutParams) c0729t7).bottomMargin, ((LinearLayout.LayoutParams) c0729t7).height);
                        if (((LinearLayout.LayoutParams) c0729t7).width == 0) {
                            i16 = 1073741824;
                            if (mode3 == 1073741824) {
                                if (i78 <= 0) {
                                    i78 = 0;
                                }
                                childAt8.measure(View.MeasureSpec.makeMeasureSpec(i78, 1073741824), childMeasureSpec2);
                            }
                            iCombineMeasuredStates3 = View.combineMeasuredStates(iCombineMeasuredStates3, childAt8.getMeasuredState() & (-16777216));
                        } else {
                            i16 = 1073741824;
                        }
                        int measuredWidth4 = childAt8.getMeasuredWidth() + i78;
                        if (measuredWidth4 < 0) {
                            measuredWidth4 = 0;
                        }
                        childAt8.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth4, i16), childMeasureSpec2);
                        iCombineMeasuredStates3 = View.combineMeasuredStates(iCombineMeasuredStates3, childAt8.getMeasuredState() & (-16777216));
                    }
                    if (z26) {
                        abstractC0731u0.f14145x = childAt8.getMeasuredWidth() + ((LinearLayout.LayoutParams) c0729t7).leftMargin + ((LinearLayout.LayoutParams) c0729t7).rightMargin + abstractC0731u0.f14145x;
                    } else {
                        int i79 = abstractC0731u0.f14145x;
                        abstractC0731u0.f14145x = Math.max(i79, childAt8.getMeasuredWidth() + i79 + ((LinearLayout.LayoutParams) c0729t7).leftMargin + ((LinearLayout.LayoutParams) c0729t7).rightMargin);
                    }
                    boolean z32 = mode4 != 1073741824 && ((LinearLayout.LayoutParams) c0729t7).height == -1;
                    int i80 = ((LinearLayout.LayoutParams) c0729t7).topMargin + ((LinearLayout.LayoutParams) c0729t7).bottomMargin;
                    int measuredHeight4 = childAt8.getMeasuredHeight() + i80;
                    iMax12 = Math.max(iMax12, measuredHeight4);
                    if (!z32) {
                        i80 = measuredHeight4;
                    }
                    int iMax13 = Math.max(i71, i80);
                    if (z27) {
                        i15 = -1;
                        boolean z33 = ((LinearLayout.LayoutParams) c0729t7).height == -1;
                        if (!z30 && (baseline = childAt8.getBaseline()) != i15) {
                            int i81 = ((LinearLayout.LayoutParams) c0729t7).gravity;
                            if (i81 < 0) {
                                i81 = abstractC0731u0.f14144w;
                            }
                            int i82 = (((i81 & 112) >> 4) & (-2)) >> 1;
                            iArr5[i82] = Math.max(iArr5[i82], baseline);
                            iArr6[i82] = Math.max(iArr6[i82], measuredHeight4 - baseline);
                        }
                        z27 = z33;
                        i71 = iMax13;
                    } else {
                        i15 = -1;
                    }
                    if (!z30) {
                    }
                    z27 = z33;
                    i71 = iMax13;
                }
                i77++;
                iResolveSizeAndState2 = iResolveSizeAndState2;
            }
            i12 = iResolveSizeAndState2;
            i13 = -16777216;
            abstractC0731u0.f14145x = abstractC0731u0.getPaddingRight() + abstractC0731u0.getPaddingLeft() + abstractC0731u0.f14145x;
            int i83 = iArr5[1];
            if (i83 == -1 && iArr5[0] == -1 && iArr5[c12] == -1 && iArr5[3] == -1) {
                i14 = 0;
            } else {
                i14 = 0;
                iMax12 = Math.max(iMax12, Math.max(iArr6[3], Math.max(iArr6[0], Math.max(iArr6[1], iArr6[c12]))) + Math.max(iArr5[3], Math.max(iArr5[0], Math.max(i83, iArr5[c12]))));
            }
            iMax = i71;
        } else {
            iMax = Math.max(i71, i72);
            if (z31 && mode3 != 1073741824) {
                for (int i84 = 0; i84 < virtualChildCount2; i84++) {
                    View childAt9 = abstractC0731u0.getChildAt(i84);
                    if (childAt9 != null && childAt9.getVisibility() != 8 && ((LinearLayout.LayoutParams) ((C0729t0) childAt9.getLayoutParams())).weight > 0.0f) {
                        childAt9.measure(View.MeasureSpec.makeMeasureSpec(iMax9, 1073741824), View.MeasureSpec.makeMeasureSpec(childAt9.getMeasuredHeight(), 1073741824));
                    }
                }
            }
            i12 = iResolveSizeAndState2;
            i13 = -16777216;
            i14 = 0;
        }
        if (!z27 && mode4 != 1073741824) {
            iMax12 = iMax;
        }
        abstractC0731u0.setMeasuredDimension(i12 | (iCombineMeasuredStates3 & i13), View.resolveSizeAndState(Math.max(abstractC0731u0.getPaddingBottom() + abstractC0731u0.getPaddingTop() + iMax12, abstractC0731u0.getSuggestedMinimumHeight()), i11, iCombineMeasuredStates3 << 16));
        if (z28) {
            int iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(abstractC0731u0.getMeasuredHeight(), 1073741824);
            int i85 = i14;
            while (i85 < virtualChildCount2) {
                View childAt10 = abstractC0731u0.getChildAt(i85);
                if (childAt10.getVisibility() != 8) {
                    C0729t0 c0729t8 = (C0729t0) childAt10.getLayoutParams();
                    if (((LinearLayout.LayoutParams) c0729t8).height == -1) {
                        int i86 = ((LinearLayout.LayoutParams) c0729t8).width;
                        ((LinearLayout.LayoutParams) c0729t8).width = childAt10.getMeasuredWidth();
                        abstractC0731u0.measureChildWithMargins(childAt10, i57, 0, iMakeMeasureSpec3, 0);
                        ((LinearLayout.LayoutParams) c0729t8).width = i86;
                    }
                }
                i85++;
                abstractC0731u0 = this;
                i57 = i10;
            }
        }
    }

    public void setBaselineAligned(boolean z6) {
        this.f14140s = z6;
    }

    public void setBaselineAlignedChildIndex(int i10) {
        if (i10 >= 0 && i10 < getChildCount()) {
            this.f14141t = i10;
            return;
        }
        throw new IllegalArgumentException("base aligned child index out of range (0, " + getChildCount() + ")");
    }

    public void setDividerDrawable(Drawable drawable) {
        if (drawable == this.f14135C) {
            return;
        }
        this.f14135C = drawable;
        if (drawable != null) {
            this.f14136D = drawable.getIntrinsicWidth();
            this.f14137E = drawable.getIntrinsicHeight();
        } else {
            this.f14136D = 0;
            this.f14137E = 0;
        }
        setWillNotDraw(drawable == null);
        requestLayout();
    }

    public void setDividerPadding(int i10) {
        this.f14139G = i10;
    }

    public void setGravity(int i10) {
        if (this.f14144w != i10) {
            if ((8388615 & i10) == 0) {
                i10 |= 8388611;
            }
            if ((i10 & 112) == 0) {
                i10 |= 48;
            }
            this.f14144w = i10;
            requestLayout();
        }
    }

    public void setHorizontalGravity(int i10) {
        int i11 = i10 & 8388615;
        int i12 = this.f14144w;
        if ((8388615 & i12) != i11) {
            this.f14144w = i11 | ((-8388616) & i12);
            requestLayout();
        }
    }

    public void setMeasureWithLargestChildEnabled(boolean z6) {
        this.f14147z = z6;
    }

    public void setOrientation(int i10) {
        if (this.f14143v != i10) {
            this.f14143v = i10;
            requestLayout();
        }
    }

    public void setShowDividers(int i10) {
        if (i10 != this.f14138F) {
            requestLayout();
        }
        this.f14138F = i10;
    }

    public void setVerticalGravity(int i10) {
        int i11 = i10 & 112;
        int i12 = this.f14144w;
        if ((i12 & 112) != i11) {
            this.f14144w = i11 | (i12 & (-113));
            requestLayout();
        }
    }

    public void setWeightSum(float f10) {
        this.f14146y = Math.max(0.0f, f10);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }
}
