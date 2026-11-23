package p081i3;

import J.b;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.Property;
import android.view.View;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.kcstream.cing.R;
import java.util.ArrayList;
import p149p3.a;
import p170r3.g;
import p170r3.j;

/* JADX INFO: loaded from: classes.dex */
public final class k extends i {

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public StateListAnimator f12263K;

    @Override // p081i3.i
    public final float e() {
        return this.f12256s.getElevation();
    }

    @Override // p081i3.i
    public final void f(Rect rect) {
        if (((FloatingActionButton) this.f12257t.f12212t).f9717C) {
            super.f(rect);
            return;
        }
        if (this.f12244f) {
            FloatingActionButton floatingActionButton = this.f12256s;
            int sizeDimension = floatingActionButton.getSizeDimension();
            int i10 = this.f12248k;
            if (sizeDimension < i10) {
                int sizeDimension2 = (i10 - floatingActionButton.getSizeDimension()) / 2;
                rect.set(sizeDimension2, sizeDimension2, sizeDimension2, sizeDimension2);
                return;
            }
        }
        rect.set(0, 0, 0, 0);
    }

    @Override // p081i3.i
    public final void g(ColorStateList colorStateList, PorterDuff.Mode mode, ColorStateList colorStateList2, int i10) {
        Drawable layerDrawable;
        j jVar = this.a;
        jVar.getClass();
        j jVar2 = new j(jVar);
        this.f12240b = jVar2;
        jVar2.setTintList(colorStateList);
        if (mode != null) {
            this.f12240b.setTintMode(mode);
        }
        g gVar = this.f12240b;
        FloatingActionButton floatingActionButton = this.f12256s;
        gVar.j(floatingActionButton.getContext());
        if (i10 > 0) {
            Context context = floatingActionButton.getContext();
            j jVar3 = this.a;
            jVar3.getClass();
            a aVar = new a(jVar3);
            int iA = b.a(context, R.color.design_fab_stroke_top_outer_color);
            int iA2 = b.a(context, R.color.design_fab_stroke_top_inner_color);
            int iA3 = b.a(context, R.color.design_fab_stroke_end_inner_color);
            int iA4 = b.a(context, R.color.design_fab_stroke_end_outer_color);
            aVar.f12204i = iA;
            aVar.j = iA2;
            aVar.f12205k = iA3;
            aVar.f12206l = iA4;
            float f10 = i10;
            if (aVar.f12203h != f10) {
                aVar.f12203h = f10;
                aVar.f12197b.setStrokeWidth(f10 * 1.3333f);
                aVar.f12208n = true;
                aVar.invalidateSelf();
            }
            if (colorStateList != null) {
                aVar.f12207m = colorStateList.getColorForState(aVar.getState(), aVar.f12207m);
            }
            aVar.f12210p = colorStateList;
            aVar.f12208n = true;
            aVar.invalidateSelf();
            this.f12242d = aVar;
            a aVar2 = this.f12242d;
            aVar2.getClass();
            g gVar2 = this.f12240b;
            gVar2.getClass();
            layerDrawable = new LayerDrawable(new Drawable[]{aVar2, gVar2});
        } else {
            this.f12242d = null;
            layerDrawable = this.f12240b;
        }
        RippleDrawable rippleDrawable = new RippleDrawable(a.c(colorStateList2), layerDrawable, null);
        this.f12241c = rippleDrawable;
        this.f12243e = rippleDrawable;
    }

    @Override // p081i3.i
    public final void i() {
        q();
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // p081i3.i
    public final void k(float f10, float f11, float f12) {
        int i10 = Build.VERSION.SDK_INT;
        FloatingActionButton floatingActionButton = this.f12256s;
        if (floatingActionButton.getStateListAnimator() == this.f12263K) {
            StateListAnimator stateListAnimator = new StateListAnimator();
            stateListAnimator.addState(i.f12233E, r(f10, f12));
            stateListAnimator.addState(i.f12234F, r(f10, f11));
            stateListAnimator.addState(i.f12235G, r(f10, f11));
            stateListAnimator.addState(i.f12236H, r(f10, f11));
            AnimatorSet animatorSet = new AnimatorSet();
            ArrayList arrayList = new ArrayList();
            arrayList.add(ObjectAnimator.ofFloat(floatingActionButton, "elevation", f10).setDuration(0L));
            if (i10 <= 24) {
                arrayList.add(ObjectAnimator.ofFloat(floatingActionButton, (Property<FloatingActionButton, Float>) View.TRANSLATION_Z, floatingActionButton.getTranslationZ()).setDuration(100L));
            }
            arrayList.add(ObjectAnimator.ofFloat(floatingActionButton, (Property<FloatingActionButton, Float>) View.TRANSLATION_Z, 0.0f).setDuration(100L));
            animatorSet.playSequentially((Animator[]) arrayList.toArray(new Animator[0]));
            animatorSet.setInterpolator(i.f12239z);
            stateListAnimator.addState(i.f12237I, animatorSet);
            stateListAnimator.addState(i.f12238J, r(0.0f, 0.0f));
            this.f12263K = stateListAnimator;
            floatingActionButton.setStateListAnimator(stateListAnimator);
        }
        if (o()) {
            q();
        }
    }

    @Override // p081i3.i
    public final void m(ColorStateList colorStateList) {
        Drawable drawable = this.f12241c;
        if (drawable instanceof RippleDrawable) {
            ((RippleDrawable) drawable).setColor(a.c(colorStateList));
        } else {
            super.m(colorStateList);
        }
    }

    @Override // p081i3.i
    public final boolean o() {
        if (((FloatingActionButton) this.f12257t.f12212t).f9717C) {
            return true;
        }
        return this.f12244f && this.f12256s.getSizeDimension() < this.f12248k;
    }

    public final AnimatorSet r(float f10, float f11) {
        AnimatorSet animatorSet = new AnimatorSet();
        float[] fArr = {f10};
        FloatingActionButton floatingActionButton = this.f12256s;
        animatorSet.play(ObjectAnimator.ofFloat(floatingActionButton, "elevation", fArr).setDuration(0L)).with(ObjectAnimator.ofFloat(floatingActionButton, (Property<FloatingActionButton, Float>) View.TRANSLATION_Z, f11).setDuration(100L));
        animatorSet.setInterpolator(i.f12239z);
        return animatorSet;
    }

    @Override // p081i3.i
    public final void h() {
    }

    @Override // p081i3.i
    public final void p() {
    }

    @Override // p081i3.i
    public final void j(int[] iArr) {
    }
}
