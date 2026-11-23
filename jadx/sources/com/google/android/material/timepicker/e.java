package com.google.android.material.timepicker;

import U.U;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.kcstream.cing.R;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class e extends ConstraintLayout {

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public final B6.d f9964I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public int f9965J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public final p170r3.g f9966K;

    public e(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.materialClockStyle);
        LayoutInflater.from(context).inflate(R.layout.material_radial_view_group, this);
        p170r3.g gVar = new p170r3.g();
        this.f9966K = gVar;
        p170r3.h hVar = new p170r3.h(0.5f);
        I4.b bVarF = gVar.f14501s.a.f();
        bVarF.f2072e = hVar;
        bVarF.f2073f = hVar;
        bVarF.f2074g = hVar;
        bVarF.f2075h = hVar;
        gVar.setShapeAppearanceModel(bVarF.a());
        this.f9966K.l(ColorStateList.valueOf(-1));
        p170r3.g gVar2 = this.f9966K;
        WeakHashMap weakHashMap = U.a;
        setBackground(gVar2);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, Q2.a.f3998I, R.attr.materialClockStyle, 0);
        this.f9965J = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.f9964I = new B6.d(this, 6);
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i10, layoutParams);
        if (view.getId() == -1) {
            WeakHashMap weakHashMap = U.a;
            view.setId(View.generateViewId());
        }
        Handler handler = getHandler();
        if (handler != null) {
            B6.d dVar = this.f9964I;
            handler.removeCallbacks(dVar);
            handler.post(dVar);
        }
    }

    public abstract void m();

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        m();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        Handler handler = getHandler();
        if (handler != null) {
            B6.d dVar = this.f9964I;
            handler.removeCallbacks(dVar);
            handler.post(dVar);
        }
    }

    @Override // android.view.View
    public final void setBackgroundColor(int i10) {
        this.f9966K.l(ColorStateList.valueOf(i10));
    }
}
