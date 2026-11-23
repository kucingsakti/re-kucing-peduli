package p;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import com.kcstream.cing.R;

/* JADX INFO: loaded from: classes.dex */
public final class D extends C0738y {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C f13928e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Drawable f13929f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ColorStateList f13930g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public PorterDuff.Mode f13931h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f13932i;
    public boolean j;

    public D(C c10) {
        super(c10);
        this.f13930g = null;
        this.f13931h = null;
        this.f13932i = false;
        this.j = false;
        this.f13928e = c10;
    }

    @Override // p.C0738y
    public final void b(AttributeSet attributeSet, int i10) {
        super.b(attributeSet, R.attr.seekBarStyle);
        C c10 = this.f13928e;
        Context context = c10.getContext();
        int[] iArr = p069h.a.f11615g;
        Y1.c cVarE = Y1.c.E(context, attributeSet, iArr, R.attr.seekBarStyle);
        U.U.m(c10, c10.getContext(), iArr, attributeSet, (TypedArray) cVarE.f5671u, R.attr.seekBarStyle);
        Drawable drawableW = cVarE.w(0);
        if (drawableW != null) {
            c10.setThumb(drawableW);
        }
        Drawable drawableV = cVarE.v(1);
        Drawable drawable = this.f13929f;
        if (drawable != null) {
            drawable.setCallback(null);
        }
        this.f13929f = drawableV;
        if (drawableV != null) {
            drawableV.setCallback(c10);
            M.b.b(drawableV, c10.getLayoutDirection());
            if (drawableV.isStateful()) {
                drawableV.setState(c10.getDrawableState());
            }
            f();
        }
        c10.invalidate();
        TypedArray typedArray = (TypedArray) cVarE.f5671u;
        if (typedArray.hasValue(3)) {
            this.f13931h = AbstractC0710j0.c(typedArray.getInt(3, -1), this.f13931h);
            this.j = true;
        }
        if (typedArray.hasValue(2)) {
            this.f13930g = cVarE.u(2);
            this.f13932i = true;
        }
        cVarE.J();
        f();
    }

    public final void f() {
        Drawable drawable = this.f13929f;
        if (drawable != null) {
            if (this.f13932i || this.j) {
                Drawable drawableMutate = drawable.mutate();
                this.f13929f = drawableMutate;
                if (this.f13932i) {
                    M.a.h(drawableMutate, this.f13930g);
                }
                if (this.j) {
                    M.a.i(this.f13929f, this.f13931h);
                }
                if (this.f13929f.isStateful()) {
                    this.f13929f.setState(this.f13928e.getDrawableState());
                }
            }
        }
    }

    public final void g(Canvas canvas) {
        if (this.f13929f != null) {
            C c10 = this.f13928e;
            int max = c10.getMax();
            if (max > 1) {
                int intrinsicWidth = this.f13929f.getIntrinsicWidth();
                int intrinsicHeight = this.f13929f.getIntrinsicHeight();
                int i10 = intrinsicWidth >= 0 ? intrinsicWidth / 2 : 1;
                int i11 = intrinsicHeight >= 0 ? intrinsicHeight / 2 : 1;
                this.f13929f.setBounds(-i10, -i11, i10, i11);
                float width = ((c10.getWidth() - c10.getPaddingLeft()) - c10.getPaddingRight()) / max;
                int iSave = canvas.save();
                canvas.translate(c10.getPaddingLeft(), c10.getHeight() / 2);
                for (int i12 = 0; i12 <= max; i12++) {
                    this.f13929f.draw(canvas);
                    canvas.translate(width, 0.0f);
                }
                canvas.restoreToCount(iSave);
            }
        }
    }
}
