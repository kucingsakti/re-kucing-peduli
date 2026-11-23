package com.google.android.material.transformation;

import R2.a;
import R2.b;
import R2.d;
import R2.e;
import U.H;
import U.U;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Pair;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.kcstream.cing.R;
import java.util.ArrayList;
import java.util.WeakHashMap;
import o1.c;
import p068ga.l;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public abstract class FabTransformationBehavior extends ExpandableTransformationBehavior {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final Rect f9971u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final RectF f9972v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final RectF f9973w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final int[] f9974x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public float f9975y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public float f9976z;

    public FabTransformationBehavior() {
        this.f9971u = new Rect();
        this.f9972v = new RectF();
        this.f9973w = new RectF();
        this.f9974x = new int[2];
    }

    public static float B(c cVar, e eVar, float f10) {
        long j = eVar.a;
        e eVarD = ((d) cVar.f13623t).d("expansion");
        return a.a(f10, 0.0f, eVar.b().getInterpolation((((eVarD.a + eVarD.f4446b) + 17) - j) / eVar.f4446b));
    }

    public static Pair y(float f10, float f11, boolean z6, c cVar) {
        e eVarD;
        e eVarD2;
        if (f10 == 0.0f || f11 == 0.0f) {
            eVarD = ((d) cVar.f13623t).d("translationXLinear");
            eVarD2 = ((d) cVar.f13623t).d("translationYLinear");
        } else if ((!z6 || f11 >= 0.0f) && (z6 || f11 <= 0.0f)) {
            eVarD = ((d) cVar.f13623t).d("translationXCurveDownwards");
            eVarD2 = ((d) cVar.f13623t).d("translationYCurveDownwards");
        } else {
            eVarD = ((d) cVar.f13623t).d("translationXCurveUpwards");
            eVarD2 = ((d) cVar.f13623t).d("translationYCurveUpwards");
        }
        return new Pair(eVarD, eVarD2);
    }

    public final float A(View view, View view2, za.c cVar) {
        RectF rectF = this.f9972v;
        RectF rectF2 = this.f9973w;
        C(view, rectF);
        rectF.offset(this.f9975y, this.f9976z);
        C(view2, rectF2);
        cVar.getClass();
        return (rectF2.centerY() - rectF.centerY()) + 0.0f;
    }

    public final void C(View view, RectF rectF) {
        rectF.set(0.0f, 0.0f, view.getWidth(), view.getHeight());
        int[] iArr = this.f9974x;
        view.getLocationInWindow(iArr);
        rectF.offsetTo(iArr[0], iArr[1]);
        rectF.offset((int) (-view.getTranslationX()), (int) (-view.getTranslationY()));
    }

    public abstract c D(Context context, boolean z6);

    @Override // com.google.android.material.transformation.ExpandableBehavior, G.b
    public final boolean f(View view, View view2) {
        if (view.getVisibility() == 8) {
            throw new IllegalStateException("This behavior cannot be attached to a GONE view. Set the view to INVISIBLE instead.");
        }
        if (!(view2 instanceof FloatingActionButton)) {
            return false;
        }
        int expandedComponentIdHint = ((FloatingActionButton) view2).getExpandedComponentIdHint();
        return expandedComponentIdHint == 0 || expandedComponentIdHint == view.getId();
    }

    @Override // G.b
    public final void g(G.e eVar) {
        if (eVar.f1671h == 0) {
            eVar.f1671h = 80;
        }
    }

    @Override // com.google.android.material.transformation.ExpandableTransformationBehavior
    public final AnimatorSet x(View view, View view2, boolean z6, boolean z10) {
        ObjectAnimator objectAnimatorOfFloat;
        int i10;
        float f10;
        ObjectAnimator objectAnimatorOfFloat2;
        ObjectAnimator objectAnimatorOfFloat3;
        ObjectAnimator objectAnimatorOfFloat4;
        c cVarD = D(view2.getContext(), z6);
        if (z6) {
            this.f9975y = view.getTranslationX();
            this.f9976z = view.getTranslationY();
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        WeakHashMap weakHashMap = U.a;
        float fI = H.i(view2) - H.i(view);
        if (z6) {
            if (!z10) {
                view2.setTranslationZ(-fI);
            }
            objectAnimatorOfFloat = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_Z, 0.0f);
        } else {
            objectAnimatorOfFloat = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_Z, -fI);
        }
        ((d) cVarD.f13623t).d("elevation").a(objectAnimatorOfFloat);
        arrayList.add(objectAnimatorOfFloat);
        RectF rectF = this.f9972v;
        float fZ = z(view, view2, (za.c) cVarD.f13624u);
        float fA = A(view, view2, (za.c) cVarD.f13624u);
        Pair pairY = y(fZ, fA, z6, cVarD);
        e eVar = (e) pairY.first;
        e eVar2 = (e) pairY.second;
        if (z6) {
            if (!z10) {
                view2.setTranslationX(-fZ);
                view2.setTranslationY(-fA);
            }
            i10 = 0;
            objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_X, 0.0f);
            f10 = 0.0f;
            objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_Y, 0.0f);
            float fB = B(cVarD, eVar, -fZ);
            float fB2 = B(cVarD, eVar2, -fA);
            Rect rect = this.f9971u;
            view2.getWindowVisibleDisplayFrame(rect);
            rectF.set(rect);
            RectF rectF2 = this.f9973w;
            C(view2, rectF2);
            rectF2.offset(fB, fB2);
            rectF2.intersect(rectF);
            rectF.set(rectF2);
        } else {
            i10 = 0;
            f10 = 0.0f;
            objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_X, -fZ);
            objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_Y, -fA);
        }
        eVar.a(objectAnimatorOfFloat2);
        eVar2.a(objectAnimatorOfFloat3);
        arrayList.add(objectAnimatorOfFloat2);
        arrayList.add(objectAnimatorOfFloat3);
        rectF.width();
        rectF.height();
        float fZ2 = z(view, view2, (za.c) cVarD.f13624u);
        float fA2 = A(view, view2, (za.c) cVarD.f13624u);
        Pair pairY2 = y(fZ2, fA2, z6, cVarD);
        e eVar3 = (e) pairY2.first;
        e eVar4 = (e) pairY2.second;
        Property property = View.TRANSLATION_X;
        if (!z6) {
            fZ2 = this.f9975y;
        }
        float[] fArr = new float[1];
        fArr[i10] = fZ2;
        ObjectAnimator objectAnimatorOfFloat5 = ObjectAnimator.ofFloat(view, (Property<View, Float>) property, fArr);
        Property property2 = View.TRANSLATION_Y;
        if (!z6) {
            fA2 = this.f9976z;
        }
        float[] fArr2 = new float[1];
        fArr2[i10] = fA2;
        ObjectAnimator objectAnimatorOfFloat6 = ObjectAnimator.ofFloat(view, (Property<View, Float>) property2, fArr2);
        eVar3.a(objectAnimatorOfFloat5);
        eVar4.a(objectAnimatorOfFloat6);
        arrayList.add(objectAnimatorOfFloat5);
        arrayList.add(objectAnimatorOfFloat6);
        if (view2 instanceof ViewGroup) {
            View viewFindViewById = view2.findViewById(R.id.mtrl_child_content_container);
            ViewGroup viewGroup = viewFindViewById != null ? viewFindViewById instanceof ViewGroup ? (ViewGroup) viewFindViewById : null : (ViewGroup) view2;
            if (viewGroup != null) {
                if (z6) {
                    if (!z10) {
                        b.a.set(viewGroup, Float.valueOf(f10));
                    }
                    b bVar = b.a;
                    float[] fArr3 = new float[1];
                    fArr3[i10] = 1.0f;
                    objectAnimatorOfFloat4 = ObjectAnimator.ofFloat(viewGroup, bVar, fArr3);
                } else {
                    b bVar2 = b.a;
                    float[] fArr4 = new float[1];
                    fArr4[i10] = f10;
                    objectAnimatorOfFloat4 = ObjectAnimator.ofFloat(viewGroup, bVar2, fArr4);
                }
                ((d) cVarD.f13623t).d("contentFade").a(objectAnimatorOfFloat4);
                arrayList.add(objectAnimatorOfFloat4);
            }
        }
        AnimatorSet animatorSet = new AnimatorSet();
        l.m(animatorSet, arrayList);
        animatorSet.addListener(new p234y3.b(z6, view2, view));
        int size = arrayList2.size();
        for (int i11 = i10; i11 < size; i11++) {
            animatorSet.addListener((Animator.AnimatorListener) arrayList2.get(i11));
        }
        return animatorSet;
    }

    public final float z(View view, View view2, za.c cVar) {
        RectF rectF = this.f9972v;
        RectF rectF2 = this.f9973w;
        C(view, rectF);
        rectF.offset(this.f9975y, this.f9976z);
        C(view2, rectF2);
        cVar.getClass();
        return (rectF2.centerX() - rectF.centerX()) + 0.0f;
    }

    public FabTransformationBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f9971u = new Rect();
        this.f9972v = new RectF();
        this.f9973w = new RectF();
        this.f9974x = new int[2];
    }
}
