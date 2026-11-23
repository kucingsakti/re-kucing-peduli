package p081i3;

import G.f;
import R2.d;
import Y1.c;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.FloatEvaluator;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.res.ColorStateList;
import android.graphics.Matrix;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.util.Property;
import android.view.View;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.kcstream.cing.R;
import java.util.ArrayList;
import p068ga.l;
import p170r3.g;
import p170r3.j;
import p170r3.u;
import p178s0.a;

/* JADX INFO: loaded from: classes.dex */
public abstract class i {
    public j a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public g f12240b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Drawable f12241c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public a f12242d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public LayerDrawable f12243e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f12244f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f12246h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float f12247i;
    public float j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f12248k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Animator f12249l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public d f12250m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public d f12251n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public float f12252o;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f12254q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final FloatingActionButton f12256s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final b f12257t;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public f f12262y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final a f12239z = R2.a.f4442c;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static final int f12229A = R.attr.motionDurationLong2;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public static final int f12230B = R.attr.motionEasingEmphasizedInterpolator;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public static final int f12231C = R.attr.motionDurationMedium1;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public static final int f12232D = R.attr.motionEasingEmphasizedAccelerateInterpolator;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public static final int[] f12233E = {android.R.attr.state_pressed, android.R.attr.state_enabled};

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public static final int[] f12234F = {android.R.attr.state_hovered, android.R.attr.state_focused, android.R.attr.state_enabled};

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public static final int[] f12235G = {android.R.attr.state_focused, android.R.attr.state_enabled};

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public static final int[] f12236H = {android.R.attr.state_hovered, android.R.attr.state_enabled};

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public static final int[] f12237I = {android.R.attr.state_enabled};

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public static final int[] f12238J = new int[0];

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f12245g = true;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public float f12253p = 1.0f;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f12255r = 0;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final Rect f12258u = new Rect();

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final RectF f12259v = new RectF();

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final RectF f12260w = new RectF();

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final Matrix f12261x = new Matrix();

    public i(FloatingActionButton floatingActionButton, b bVar) {
        this.f12256s = floatingActionButton;
        this.f12257t = bVar;
        c cVar = new c(13);
        k kVar = (k) this;
        cVar.h(f12233E, d(new g(kVar, 1)));
        cVar.h(f12234F, d(new g(kVar, 0)));
        cVar.h(f12235G, d(new g(kVar, 0)));
        cVar.h(f12236H, d(new g(kVar, 0)));
        cVar.h(f12237I, d(new g(kVar, 2)));
        cVar.h(f12238J, d(new f(kVar)));
        this.f12252o = floatingActionButton.getRotation();
    }

    public static ValueAnimator d(h hVar) {
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setInterpolator(f12239z);
        valueAnimator.setDuration(100L);
        valueAnimator.addListener(hVar);
        valueAnimator.addUpdateListener(hVar);
        valueAnimator.setFloatValues(0.0f, 1.0f);
        return valueAnimator;
    }

    public final void a(float f10, Matrix matrix) {
        matrix.reset();
        Drawable drawable = this.f12256s.getDrawable();
        if (drawable == null || this.f12254q == 0) {
            return;
        }
        RectF rectF = this.f12259v;
        RectF rectF2 = this.f12260w;
        rectF.set(0.0f, 0.0f, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        float f11 = this.f12254q;
        rectF2.set(0.0f, 0.0f, f11, f11);
        matrix.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.CENTER);
        float f12 = this.f12254q / 2.0f;
        matrix.postScale(f10, f10, f12, f12);
    }

    public final AnimatorSet b(d dVar, float f10, float f11, float f12) {
        ArrayList arrayList = new ArrayList();
        Property property = View.ALPHA;
        int i10 = 1;
        float[] fArr = {f10};
        FloatingActionButton floatingActionButton = this.f12256s;
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(floatingActionButton, (Property<FloatingActionButton, Float>) property, fArr);
        dVar.d("opacity").a(objectAnimatorOfFloat);
        arrayList.add(objectAnimatorOfFloat);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(floatingActionButton, (Property<FloatingActionButton, Float>) View.SCALE_X, f11);
        dVar.d("scale").a(objectAnimatorOfFloat2);
        int i11 = Build.VERSION.SDK_INT;
        if (i11 == 26) {
            W0.f fVar = new W0.f(i10);
            fVar.f5260b = new FloatEvaluator();
            objectAnimatorOfFloat2.setEvaluator(fVar);
        }
        arrayList.add(objectAnimatorOfFloat2);
        ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(floatingActionButton, (Property<FloatingActionButton, Float>) View.SCALE_Y, f11);
        dVar.d("scale").a(objectAnimatorOfFloat3);
        if (i11 == 26) {
            W0.f fVar2 = new W0.f(i10);
            fVar2.f5260b = new FloatEvaluator();
            objectAnimatorOfFloat3.setEvaluator(fVar2);
        }
        arrayList.add(objectAnimatorOfFloat3);
        Matrix matrix = this.f12261x;
        a(f12, matrix);
        ObjectAnimator objectAnimatorOfObject = ObjectAnimator.ofObject(floatingActionButton, new R2.c(), new d(this), new Matrix(matrix));
        dVar.d("iconScale").a(objectAnimatorOfObject);
        arrayList.add(objectAnimatorOfObject);
        AnimatorSet animatorSet = new AnimatorSet();
        l.m(animatorSet, arrayList);
        return animatorSet;
    }

    public final AnimatorSet c(float f10, float f11, float f12, int i10, int i11) {
        AnimatorSet animatorSet = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        FloatingActionButton floatingActionButton = this.f12256s;
        valueAnimatorOfFloat.addUpdateListener(new e(this, floatingActionButton.getAlpha(), f10, floatingActionButton.getScaleX(), f11, floatingActionButton.getScaleY(), this.f12253p, f12, new Matrix(this.f12261x)));
        arrayList.add(valueAnimatorOfFloat);
        l.m(animatorSet, arrayList);
        animatorSet.setDuration(J7.j.C(floatingActionButton.getContext(), i10, floatingActionButton.getContext().getResources().getInteger(R.integer.material_motion_duration_long_1)));
        animatorSet.setInterpolator(J7.j.D(floatingActionButton.getContext(), i11, R2.a.f4441b));
        return animatorSet;
    }

    public abstract float e();

    public void f(Rect rect) {
        int iMax = this.f12244f ? Math.max((this.f12248k - this.f12256s.getSizeDimension()) / 2, 0) : 0;
        float fE = this.f12245g ? e() + this.j : 0.0f;
        int iMax2 = Math.max(iMax, (int) Math.ceil(fE));
        int iMax3 = Math.max(iMax, (int) Math.ceil(fE * 1.5f));
        rect.set(iMax2, iMax3, iMax2, iMax3);
    }

    public abstract void g(ColorStateList colorStateList, PorterDuff.Mode mode, ColorStateList colorStateList2, int i10);

    public abstract void h();

    public abstract void i();

    public abstract void j(int[] iArr);

    public abstract void k(float f10, float f11, float f12);

    public void m(ColorStateList colorStateList) {
        Drawable drawable = this.f12241c;
        if (drawable != null) {
            M.a.h(drawable, p149p3.a.c(colorStateList));
        }
    }

    public final void n(j jVar) {
        this.a = jVar;
        g gVar = this.f12240b;
        if (gVar != null) {
            gVar.setShapeAppearanceModel(jVar);
        }
        Object obj = this.f12241c;
        if (obj instanceof u) {
            ((u) obj).setShapeAppearanceModel(jVar);
        }
        a aVar = this.f12242d;
        if (aVar != null) {
            aVar.f12209o = jVar;
            aVar.invalidateSelf();
        }
    }

    public abstract boolean o();

    public abstract void p();

    public final void q() {
        Rect rect = this.f12258u;
        f(rect);
        xa.d.d(this.f12243e, "Didn't initialize content background");
        boolean zO = o();
        b bVar = this.f12257t;
        if (zO) {
            super/*android.widget.ImageButton*/.setBackgroundDrawable(new InsetDrawable((Drawable) this.f12243e, rect.left, rect.top, rect.right, rect.bottom));
        } else {
            LayerDrawable layerDrawable = this.f12243e;
            if (layerDrawable != null) {
                super/*android.widget.ImageButton*/.setBackgroundDrawable(layerDrawable);
            } else {
                bVar.getClass();
            }
        }
        int i10 = rect.left;
        int i11 = rect.top;
        int i12 = rect.right;
        int i13 = rect.bottom;
        FloatingActionButton floatingActionButton = (FloatingActionButton) bVar.f12212t;
        floatingActionButton.f9718D.set(i10, i11, i12, i13);
        int i14 = floatingActionButton.f9715A;
        floatingActionButton.setPadding(i10 + i14, i11 + i14, i12 + i14, i13 + i14);
    }

    public final void l() {
    }
}
