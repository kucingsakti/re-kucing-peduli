package Y2;

import U.U;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import com.google.android.material.button.MaterialButton;
import com.kcstream.cing.R;
import java.util.WeakHashMap;
import p170r3.f;
import p170r3.g;
import p170r3.j;
import p170r3.u;

/* JADX INFO: loaded from: classes.dex */
public final class b {
    public final MaterialButton a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public j f5673b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f5674c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f5675d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f5676e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f5677f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f5678g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f5679h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public PorterDuff.Mode f5680i;
    public ColorStateList j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public ColorStateList f5681k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public ColorStateList f5682l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public g f5683m;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f5687q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public RippleDrawable f5689s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f5690t;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f5684n = false;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f5685o = false;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f5686p = false;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f5688r = true;

    public b(MaterialButton materialButton, j jVar) {
        this.a = materialButton;
        this.f5673b = jVar;
    }

    public final u a() {
        RippleDrawable rippleDrawable = this.f5689s;
        if (rippleDrawable == null || rippleDrawable.getNumberOfLayers() <= 1) {
            return null;
        }
        return this.f5689s.getNumberOfLayers() > 2 ? (u) this.f5689s.getDrawable(2) : (u) this.f5689s.getDrawable(1);
    }

    public final g b(boolean z6) {
        RippleDrawable rippleDrawable = this.f5689s;
        if (rippleDrawable == null || rippleDrawable.getNumberOfLayers() <= 0) {
            return null;
        }
        return (g) ((LayerDrawable) ((InsetDrawable) this.f5689s.getDrawable(0)).getDrawable()).getDrawable(!z6 ? 1 : 0);
    }

    public final void c(j jVar) {
        this.f5673b = jVar;
        if (b(false) != null) {
            b(false).setShapeAppearanceModel(jVar);
        }
        if (b(true) != null) {
            b(true).setShapeAppearanceModel(jVar);
        }
        if (a() != null) {
            a().setShapeAppearanceModel(jVar);
        }
    }

    public final void d(int i10, int i11) {
        WeakHashMap weakHashMap = U.a;
        MaterialButton materialButton = this.a;
        int paddingStart = materialButton.getPaddingStart();
        int paddingTop = materialButton.getPaddingTop();
        int paddingEnd = materialButton.getPaddingEnd();
        int paddingBottom = materialButton.getPaddingBottom();
        int i12 = this.f5676e;
        int i13 = this.f5677f;
        this.f5677f = i11;
        this.f5676e = i10;
        if (!this.f5685o) {
            e();
        }
        materialButton.setPaddingRelative(paddingStart, (paddingTop + i10) - i12, paddingEnd, (paddingBottom + i11) - i13);
    }

    public final void e() {
        g gVar = new g(this.f5673b);
        MaterialButton materialButton = this.a;
        gVar.j(materialButton.getContext());
        M.a.h(gVar, this.j);
        PorterDuff.Mode mode = this.f5680i;
        if (mode != null) {
            M.a.i(gVar, mode);
        }
        float f10 = this.f5679h;
        ColorStateList colorStateList = this.f5681k;
        gVar.f14501s.j = f10;
        gVar.invalidateSelf();
        f fVar = gVar.f14501s;
        if (fVar.f14473d != colorStateList) {
            fVar.f14473d = colorStateList;
            gVar.onStateChange(gVar.getState());
        }
        g gVar2 = new g(this.f5673b);
        gVar2.setTint(0);
        float f11 = this.f5679h;
        int iG = this.f5684n ? J7.a.g(materialButton, R.attr.colorSurface) : 0;
        gVar2.f14501s.j = f11;
        gVar2.invalidateSelf();
        ColorStateList colorStateListValueOf = ColorStateList.valueOf(iG);
        f fVar2 = gVar2.f14501s;
        if (fVar2.f14473d != colorStateListValueOf) {
            fVar2.f14473d = colorStateListValueOf;
            gVar2.onStateChange(gVar2.getState());
        }
        g gVar3 = new g(this.f5673b);
        this.f5683m = gVar3;
        M.a.g(gVar3, -1);
        RippleDrawable rippleDrawable = new RippleDrawable(p149p3.a.c(this.f5682l), new InsetDrawable((Drawable) new LayerDrawable(new Drawable[]{gVar2, gVar}), this.f5674c, this.f5676e, this.f5675d, this.f5677f), this.f5683m);
        this.f5689s = rippleDrawable;
        materialButton.setInternalBackground(rippleDrawable);
        g gVarB = b(false);
        if (gVarB != null) {
            gVarB.k(this.f5690t);
            gVarB.setState(materialButton.getDrawableState());
        }
    }

    public final void f() {
        g gVarB = b(false);
        g gVarB2 = b(true);
        if (gVarB != null) {
            float f10 = this.f5679h;
            ColorStateList colorStateList = this.f5681k;
            gVarB.f14501s.j = f10;
            gVarB.invalidateSelf();
            f fVar = gVarB.f14501s;
            if (fVar.f14473d != colorStateList) {
                fVar.f14473d = colorStateList;
                gVarB.onStateChange(gVarB.getState());
            }
            if (gVarB2 != null) {
                float f11 = this.f5679h;
                int iG = this.f5684n ? J7.a.g(this.a, R.attr.colorSurface) : 0;
                gVarB2.f14501s.j = f11;
                gVarB2.invalidateSelf();
                ColorStateList colorStateListValueOf = ColorStateList.valueOf(iG);
                f fVar2 = gVarB2.f14501s;
                if (fVar2.f14473d != colorStateListValueOf) {
                    fVar2.f14473d = colorStateListValueOf;
                    gVarB2.onStateChange(gVarB2.getState());
                }
            }
        }
    }
}
