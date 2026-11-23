package com.google.android.material.timepicker;

import C8.E;
import E.j;
import E.k;
import E.o;
import U.U;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.TextView;
import com.kcstream.cing.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
class ClockFaceView extends e implements d {

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public final ClockHandView f9933L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public final Rect f9934M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public final RectF f9935N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public final Rect f9936O;
    public final SparseArray P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public final c f9937Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public final int[] f9938R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public final float[] f9939S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public final int f9940T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public final int f9941U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public final int f9942V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public final int f9943W;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final String[] f9944a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public float f9945b0;
    public final ColorStateList c0;

    public ClockFaceView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f9934M = new Rect();
        this.f9935N = new RectF();
        this.f9936O = new Rect();
        SparseArray sparseArray = new SparseArray();
        this.P = sparseArray;
        this.f9939S = new float[]{0.0f, 0.9f, 1.0f};
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, Q2.a.f4016k, R.attr.materialClockStyle, R.style.Widget_MaterialComponents_TimePicker_Clock);
        Resources resources = getResources();
        ColorStateList colorStateListN = E.n(context, typedArrayObtainStyledAttributes, 1);
        this.c0 = colorStateListN;
        LayoutInflater.from(context).inflate(R.layout.material_clockface_view, (ViewGroup) this, true);
        ClockHandView clockHandView = (ClockHandView) findViewById(R.id.material_clock_hand);
        this.f9933L = clockHandView;
        this.f9940T = resources.getDimensionPixelSize(R.dimen.material_clock_hand_padding);
        int colorForState = colorStateListN.getColorForState(new int[]{android.R.attr.state_selected}, colorStateListN.getDefaultColor());
        this.f9938R = new int[]{colorForState, colorForState, colorStateListN.getDefaultColor()};
        clockHandView.f9953u.add(this);
        int defaultColor = J.f.c(context, R.color.material_timepicker_clockface).getDefaultColor();
        ColorStateList colorStateListN2 = E.n(context, typedArrayObtainStyledAttributes, 0);
        setBackgroundColor(colorStateListN2 != null ? colorStateListN2.getDefaultColor() : defaultColor);
        getViewTreeObserver().addOnPreDrawListener(new b(this));
        setFocusable(true);
        typedArrayObtainStyledAttributes.recycle();
        this.f9937Q = new c(this);
        String[] strArr = new String[12];
        Arrays.fill(strArr, "");
        this.f9944a0 = strArr;
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(getContext());
        int size = sparseArray.size();
        boolean z6 = false;
        for (int i10 = 0; i10 < Math.max(this.f9944a0.length, size); i10++) {
            TextView textView = (TextView) sparseArray.get(i10);
            if (i10 >= this.f9944a0.length) {
                removeView(textView);
                sparseArray.remove(i10);
            } else {
                if (textView == null) {
                    textView = (TextView) layoutInflaterFrom.inflate(R.layout.material_clockface_textview, (ViewGroup) this, false);
                    sparseArray.put(i10, textView);
                    addView(textView);
                }
                textView.setText(this.f9944a0[i10]);
                textView.setTag(R.id.material_value_index, Integer.valueOf(i10));
                int i11 = (i10 / 12) + 1;
                textView.setTag(R.id.material_clock_level, Integer.valueOf(i11));
                z6 = i11 > 1 ? true : z6;
                U.n(textView, this.f9937Q);
                textView.setTextColor(this.c0);
            }
        }
        ClockHandView clockHandView2 = this.f9933L;
        if (clockHandView2.f9952t && !z6) {
            clockHandView2.f9950E = 1;
        }
        clockHandView2.f9952t = z6;
        clockHandView2.invalidate();
        this.f9941U = resources.getDimensionPixelSize(R.dimen.material_time_picker_minimum_screen_height);
        this.f9942V = resources.getDimensionPixelSize(R.dimen.material_time_picker_minimum_screen_width);
        this.f9943W = resources.getDimensionPixelSize(R.dimen.material_clock_size);
    }

    @Override // com.google.android.material.timepicker.e
    public final void m() {
        o oVar = new o();
        oVar.b(this);
        HashMap map = new HashMap();
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getId() != R.id.circle_center && !"skip".equals(childAt.getTag())) {
                int i11 = (Integer) childAt.getTag(R.id.material_clock_level);
                if (i11 == null) {
                    i11 = 1;
                }
                if (!map.containsKey(i11)) {
                    map.put(i11, new ArrayList());
                }
                ((List) map.get(i11)).add(childAt);
            }
        }
        for (Map.Entry entry : map.entrySet()) {
            List list = (List) entry.getValue();
            int iRound = ((Integer) entry.getKey()).intValue() == 2 ? Math.round(this.f9965J * 0.66f) : this.f9965J;
            Iterator it = list.iterator();
            float size = 0.0f;
            while (it.hasNext()) {
                int id = ((View) it.next()).getId();
                HashMap map2 = oVar.f1276c;
                if (!map2.containsKey(Integer.valueOf(id))) {
                    map2.put(Integer.valueOf(id), new j());
                }
                k kVar = ((j) map2.get(Integer.valueOf(id))).f1183d;
                kVar.f1248z = R.id.circle_center;
                kVar.f1187A = iRound;
                kVar.f1188B = size;
                size += 360.0f / list.size();
            }
        }
        oVar.a(this);
        setConstraintSet(null);
        requestLayout();
        int i12 = 0;
        while (true) {
            SparseArray sparseArray = this.P;
            if (i12 >= sparseArray.size()) {
                return;
            }
            ((TextView) sparseArray.get(i12)).setVisibility(0);
            i12++;
        }
    }

    public final void n() {
        SparseArray sparseArray;
        RectF rectF;
        Rect rect;
        RectF rectF2 = this.f9933L.f9957y;
        float f10 = Float.MAX_VALUE;
        TextView textView = null;
        int i10 = 0;
        while (true) {
            sparseArray = this.P;
            int size = sparseArray.size();
            rectF = this.f9935N;
            rect = this.f9934M;
            if (i10 >= size) {
                break;
            }
            TextView textView2 = (TextView) sparseArray.get(i10);
            if (textView2 != null) {
                textView2.getHitRect(rect);
                rectF.set(rect);
                rectF.union(rectF2);
                float fHeight = rectF.height() * rectF.width();
                if (fHeight < f10) {
                    textView = textView2;
                    f10 = fHeight;
                }
            }
            i10++;
        }
        for (int i11 = 0; i11 < sparseArray.size(); i11++) {
            TextView textView3 = (TextView) sparseArray.get(i11);
            if (textView3 != null) {
                textView3.setSelected(textView3 == textView);
                textView3.getHitRect(rect);
                rectF.set(rect);
                Rect rect2 = this.f9936O;
                textView3.getLineBounds(0, rect2);
                rectF.inset(rect2.left, rect2.top);
                textView3.getPaint().setShader(RectF.intersects(rectF2, rectF) ? new RadialGradient(rectF2.centerX() - rectF.left, rectF2.centerY() - rectF.top, 0.5f * rectF2.width(), this.f9938R, this.f9939S, Shader.TileMode.CLAMP) : null);
                textView3.invalidate();
            }
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo) V.h.a(1, this.f9944a0.length, 1).f5078t);
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z6, int i10, int i11, int i12, int i13) {
        super.onLayout(z6, i10, i11, i12, i13);
        n();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        int iMax = (int) (this.f9943W / Math.max(Math.max(this.f9941U / displayMetrics.heightPixels, this.f9942V / displayMetrics.widthPixels), 1.0f));
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iMax, 1073741824);
        setMeasuredDimension(iMax, iMax);
        super.onMeasure(iMakeMeasureSpec, iMakeMeasureSpec);
    }
}
