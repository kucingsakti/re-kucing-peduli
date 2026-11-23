package Z2;

import C8.E;
import U.C0415c0;
import U.U;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.material.card.MaterialCardView;
import com.kcstream.cing.R;
import java.util.WeakHashMap;
import o1.r;
import p170r3.d;
import p170r3.g;
import p170r3.i;
import p170r3.j;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final double f5830y = Math.cos(Math.toRadians(45.0d));

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final ColorDrawable f5831z;
    public final MaterialCardView a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g f5833c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final g f5834d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f5835e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f5836f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f5837g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f5838h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Drawable f5839i;
    public Drawable j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public ColorStateList f5840k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public ColorStateList f5841l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public j f5842m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public ColorStateList f5843n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public RippleDrawable f5844o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public LayerDrawable f5845p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public g f5846q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f5848s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public ValueAnimator f5849t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final TimeInterpolator f5850u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final int f5851v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final int f5852w;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Rect f5832b = new Rect();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f5847r = false;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public float f5853x = 0.0f;

    static {
        f5831z = Build.VERSION.SDK_INT <= 28 ? new ColorDrawable() : null;
    }

    public c(MaterialCardView materialCardView, AttributeSet attributeSet) {
        this.a = materialCardView;
        g gVar = new g(materialCardView.getContext(), attributeSet, R.attr.materialCardViewStyle, R.style.Widget_MaterialComponents_CardView);
        this.f5833c = gVar;
        gVar.j(materialCardView.getContext());
        gVar.n();
        I4.b bVarF = gVar.f14501s.a.f();
        TypedArray typedArrayObtainStyledAttributes = materialCardView.getContext().obtainStyledAttributes(attributeSet, Q2.a.f4013g, R.attr.materialCardViewStyle, R.style.CardView);
        if (typedArrayObtainStyledAttributes.hasValue(3)) {
            bVarF.c(typedArrayObtainStyledAttributes.getDimension(3, 0.0f));
        }
        this.f5834d = new g();
        h(bVarF.a());
        this.f5850u = J7.j.D(materialCardView.getContext(), R.attr.motionEasingLinearInterpolator, R2.a.a);
        this.f5851v = J7.j.C(materialCardView.getContext(), R.attr.motionDurationShort2, 300);
        this.f5852w = J7.j.C(materialCardView.getContext(), R.attr.motionDurationShort1, 300);
        typedArrayObtainStyledAttributes.recycle();
    }

    public static float b(E e10, float f10) {
        if (e10 instanceof i) {
            return (float) ((1.0d - f5830y) * ((double) f10));
        }
        if (e10 instanceof d) {
            return f10 / 2.0f;
        }
        return 0.0f;
    }

    public final float a() {
        E e10 = this.f5842m.a;
        g gVar = this.f5833c;
        return Math.max(Math.max(b(e10, gVar.h()), b(this.f5842m.f14510b, gVar.f14501s.a.f14514f.a(gVar.g()))), Math.max(b(this.f5842m.f14511c, gVar.f14501s.a.f14515g.a(gVar.g())), b(this.f5842m.f14512d, gVar.f14501s.a.f14516h.a(gVar.g()))));
    }

    public final LayerDrawable c() {
        if (this.f5844o == null) {
            int[] iArr = p149p3.a.a;
            this.f5846q = new g(this.f5842m);
            this.f5844o = new RippleDrawable(this.f5840k, null, this.f5846q);
        }
        if (this.f5845p == null) {
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{this.f5844o, this.f5834d, this.j});
            this.f5845p = layerDrawable;
            layerDrawable.setId(2, R.id.mtrl_card_checked_layer_id);
        }
        return this.f5845p;
    }

    public final b d(Drawable drawable) {
        int iCeil;
        int i10;
        MaterialCardView materialCardView = this.a;
        if (materialCardView.getUseCompatPadding()) {
            int iCeil2 = (int) Math.ceil((materialCardView.getMaxCardElevation() * 1.5f) + (i() ? a() : 0.0f));
            iCeil = (int) Math.ceil(materialCardView.getMaxCardElevation() + (i() ? a() : 0.0f));
            i10 = iCeil2;
        } else {
            iCeil = 0;
            i10 = 0;
        }
        return new b(drawable, iCeil, i10, iCeil, i10);
    }

    public final void e(int i10, int i11) {
        int iCeil;
        int iCeil2;
        int i12;
        int i13;
        if (this.f5845p != null) {
            MaterialCardView materialCardView = this.a;
            if (materialCardView.getUseCompatPadding()) {
                iCeil = (int) Math.ceil(((materialCardView.getMaxCardElevation() * 1.5f) + (i() ? a() : 0.0f)) * 2.0f);
                iCeil2 = (int) Math.ceil((materialCardView.getMaxCardElevation() + (i() ? a() : 0.0f)) * 2.0f);
            } else {
                iCeil = 0;
                iCeil2 = 0;
            }
            int i14 = this.f5837g;
            int i15 = (i14 & 8388613) == 8388613 ? ((i10 - this.f5835e) - this.f5836f) - iCeil2 : this.f5835e;
            int i16 = (i14 & 80) == 80 ? this.f5835e : ((i11 - this.f5835e) - this.f5836f) - iCeil;
            int i17 = (i14 & 8388613) == 8388613 ? this.f5835e : ((i10 - this.f5835e) - this.f5836f) - iCeil2;
            int i18 = (i14 & 80) == 80 ? ((i11 - this.f5835e) - this.f5836f) - iCeil : this.f5835e;
            WeakHashMap weakHashMap = U.a;
            if (materialCardView.getLayoutDirection() == 1) {
                i13 = i17;
                i12 = i15;
            } else {
                i12 = i17;
                i13 = i15;
            }
            this.f5845p.setLayerInset(2, i13, i18, i12, i16);
        }
    }

    public final void f(boolean z6, boolean z10) {
        Drawable drawable = this.j;
        if (drawable != null) {
            if (!z10) {
                drawable.setAlpha(z6 ? 255 : 0);
                this.f5853x = z6 ? 1.0f : 0.0f;
                return;
            }
            float f10 = z6 ? 1.0f : 0.0f;
            float f11 = z6 ? 1.0f - this.f5853x : this.f5853x;
            ValueAnimator valueAnimator = this.f5849t;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.f5849t = null;
            }
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.f5853x, f10);
            this.f5849t = valueAnimatorOfFloat;
            valueAnimatorOfFloat.addUpdateListener(new C0415c0(this, 1));
            this.f5849t.setInterpolator(this.f5850u);
            this.f5849t.setDuration((long) ((z6 ? this.f5851v : this.f5852w) * f11));
            this.f5849t.start();
        }
    }

    public final void g(Drawable drawable) {
        if (drawable != null) {
            Drawable drawableMutate = drawable.mutate();
            this.j = drawableMutate;
            M.a.h(drawableMutate, this.f5841l);
            f(this.a.f9579B, false);
        } else {
            this.j = f5831z;
        }
        LayerDrawable layerDrawable = this.f5845p;
        if (layerDrawable != null) {
            layerDrawable.setDrawableByLayerId(R.id.mtrl_card_checked_layer_id, this.j);
        }
    }

    public final void h(j jVar) {
        this.f5842m = jVar;
        g gVar = this.f5833c;
        gVar.setShapeAppearanceModel(jVar);
        gVar.f14500O = !gVar.f14501s.a.e(gVar.g());
        g gVar2 = this.f5834d;
        if (gVar2 != null) {
            gVar2.setShapeAppearanceModel(jVar);
        }
        g gVar3 = this.f5846q;
        if (gVar3 != null) {
            gVar3.setShapeAppearanceModel(jVar);
        }
    }

    public final boolean i() {
        MaterialCardView materialCardView = this.a;
        if (!materialCardView.getPreventCornerOverlap()) {
            return false;
        }
        g gVar = this.f5833c;
        return gVar.f14501s.a.e(gVar.g()) && materialCardView.getUseCompatPadding();
    }

    public final boolean j() {
        View view = this.a;
        if (view.isClickable()) {
            return true;
        }
        while (view.isDuplicateParentStateEnabled() && (view.getParent() instanceof View)) {
            view = (View) view.getParent();
        }
        return view.isClickable();
    }

    public final void k() {
        Drawable drawable = this.f5839i;
        Drawable drawableC = j() ? c() : this.f5834d;
        this.f5839i = drawableC;
        if (drawable != drawableC) {
            MaterialCardView materialCardView = this.a;
            if (materialCardView.getForeground() instanceof InsetDrawable) {
                ((InsetDrawable) materialCardView.getForeground()).setDrawable(drawableC);
            } else {
                materialCardView.setForeground(d(drawableC));
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    public final void l() {
        boolean z6;
        MaterialCardView materialCardView = this.a;
        if (materialCardView.getPreventCornerOverlap()) {
            g gVar = this.f5833c;
            if (gVar.f14501s.a.e(gVar.g())) {
                z6 = false;
            } else {
                z6 = true;
            }
        } else {
            z6 = false;
        }
        float cardViewRadius = 0.0f;
        float fA = (z6 || i()) ? a() : 0.0f;
        if (materialCardView.getPreventCornerOverlap() && materialCardView.getUseCompatPadding()) {
            cardViewRadius = (float) ((1.0d - f5830y) * ((double) materialCardView.getCardViewRadius()));
        }
        int i10 = (int) (fA - cardViewRadius);
        Rect rect = this.f5832b;
        materialCardView.f15366u.set(rect.left + i10, rect.top + i10, rect.right + i10, rect.bottom + i10);
        r rVar = materialCardView.f15368w;
        if (!((p202v.a) rVar.f13676u).getUseCompatPadding()) {
            rVar.x(0, 0, 0, 0);
            return;
        }
        p202v.b bVar = (p202v.b) ((Drawable) rVar.f13675t);
        float f10 = bVar.f15372e;
        float f11 = bVar.a;
        p202v.a aVar = (p202v.a) rVar.f13676u;
        int iCeil = (int) Math.ceil(p202v.c.a(f10, f11, aVar.getPreventCornerOverlap()));
        int iCeil2 = (int) Math.ceil(p202v.c.b(f10, f11, aVar.getPreventCornerOverlap()));
        rVar.x(iCeil, iCeil2, iCeil, iCeil2);
    }

    public final void m() {
        boolean z6 = this.f5847r;
        MaterialCardView materialCardView = this.a;
        if (!z6) {
            materialCardView.setBackgroundInternal(d(this.f5833c));
        }
        materialCardView.setForeground(d(this.f5839i));
    }
}
