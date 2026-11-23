package p129n3;

import C8.E;
import U.U;
import android.content.ContentResolver;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.provider.Settings;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ProgressBar;
import com.kcstream.cing.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.WeakHashMap;
import p091j3.C;
import p225x3.a;

/* JADX INFO: loaded from: classes.dex */
public abstract class d extends ProgressBar {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final b f13331A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final c f13332B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final c f13333C;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final p f13334s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f13335t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final boolean f13336u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final int f13337v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public a f13338w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f13339x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f13340y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final b f13341z;

    public d(Context context, AttributeSet attributeSet) {
        super(a.a(context, attributeSet, R.attr.linearProgressIndicatorStyle, R.style.Widget_MaterialComponents_ProgressIndicator), attributeSet, R.attr.linearProgressIndicatorStyle);
        this.f13339x = false;
        this.f13340y = 4;
        this.f13341z = new b(this, 0);
        this.f13331A = new b(this, 1);
        this.f13332B = new c(this, 0);
        this.f13333C = new c(this, 1);
        Context context2 = getContext();
        p pVar = new p();
        pVar.f13390c = new int[0];
        int dimensionPixelSize = context2.getResources().getDimensionPixelSize(R.dimen.mtrl_progress_track_thickness);
        int[] iArr = Q2.a.f4010d;
        C.a(context2, attributeSet, R.attr.linearProgressIndicatorStyle, R.style.Widget_MaterialComponents_LinearProgressIndicator);
        C.b(context2, attributeSet, iArr, R.attr.linearProgressIndicatorStyle, R.style.Widget_MaterialComponents_LinearProgressIndicator, new int[0]);
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr, R.attr.linearProgressIndicatorStyle, R.style.Widget_MaterialComponents_LinearProgressIndicator);
        pVar.a = E.p(context2, typedArrayObtainStyledAttributes, 9, dimensionPixelSize);
        pVar.f13389b = Math.min(E.p(context2, typedArrayObtainStyledAttributes, 8, 0), pVar.a / 2);
        pVar.f13392e = typedArrayObtainStyledAttributes.getInt(5, 0);
        pVar.f13393f = typedArrayObtainStyledAttributes.getInt(1, 0);
        pVar.f13394g = typedArrayObtainStyledAttributes.getDimensionPixelSize(3, 0);
        if (!typedArrayObtainStyledAttributes.hasValue(2)) {
            pVar.f13390c = new int[]{J7.a.f(context2, R.attr.colorPrimary, -1)};
        } else if (typedArrayObtainStyledAttributes.peekValue(2).type != 1) {
            pVar.f13390c = new int[]{typedArrayObtainStyledAttributes.getColor(2, -1)};
        } else {
            int[] intArray = context2.getResources().getIntArray(typedArrayObtainStyledAttributes.getResourceId(2, -1));
            pVar.f13390c = intArray;
            if (intArray.length == 0) {
                throw new IllegalArgumentException("indicatorColors cannot be empty when indicatorColor is not used.");
            }
        }
        if (typedArrayObtainStyledAttributes.hasValue(7)) {
            pVar.f13391d = typedArrayObtainStyledAttributes.getColor(7, -1);
        } else {
            pVar.f13391d = pVar.f13390c[0];
            TypedArray typedArrayObtainStyledAttributes2 = context2.getTheme().obtainStyledAttributes(new int[]{android.R.attr.disabledAlpha});
            float f10 = typedArrayObtainStyledAttributes2.getFloat(0, 0.2f);
            typedArrayObtainStyledAttributes2.recycle();
            pVar.f13391d = J7.a.c(pVar.f13391d, (int) (f10 * 255.0f));
        }
        typedArrayObtainStyledAttributes.recycle();
        int[] iArr2 = Q2.a.f4023r;
        C.a(context2, attributeSet, R.attr.linearProgressIndicatorStyle, R.style.Widget_MaterialComponents_LinearProgressIndicator);
        C.b(context2, attributeSet, iArr2, R.attr.linearProgressIndicatorStyle, R.style.Widget_MaterialComponents_LinearProgressIndicator, new int[0]);
        TypedArray typedArrayObtainStyledAttributes3 = context2.obtainStyledAttributes(attributeSet, iArr2, R.attr.linearProgressIndicatorStyle, R.style.Widget_MaterialComponents_LinearProgressIndicator);
        pVar.f13395h = typedArrayObtainStyledAttributes3.getInt(0, 1);
        pVar.f13396i = typedArrayObtainStyledAttributes3.getInt(1, 0);
        pVar.f13397k = Math.min(typedArrayObtainStyledAttributes3.getDimensionPixelSize(2, 0), pVar.a);
        typedArrayObtainStyledAttributes3.recycle();
        pVar.a();
        pVar.j = pVar.f13396i == 1;
        this.f13334s = pVar;
        C.a(context2, attributeSet, R.attr.linearProgressIndicatorStyle, R.style.Widget_MaterialComponents_LinearProgressIndicator);
        C.b(context2, attributeSet, iArr, R.attr.linearProgressIndicatorStyle, R.style.Widget_MaterialComponents_LinearProgressIndicator, new int[0]);
        TypedArray typedArrayObtainStyledAttributes4 = context2.obtainStyledAttributes(attributeSet, iArr, R.attr.linearProgressIndicatorStyle, R.style.Widget_MaterialComponents_LinearProgressIndicator);
        typedArrayObtainStyledAttributes4.getInt(6, -1);
        this.f13337v = Math.min(typedArrayObtainStyledAttributes4.getInt(4, -1), 1000);
        typedArrayObtainStyledAttributes4.recycle();
        this.f13338w = new a();
        this.f13336u = true;
    }

    private j getCurrentDrawingDelegate() {
        if (isIndeterminate()) {
            if (getIndeterminateDrawable() == null) {
                return null;
            }
            return getIndeterminateDrawable().f13363D;
        }
        if (getProgressDrawable() == null) {
            return null;
        }
        return getProgressDrawable().f13343D;
    }

    public void a(int i10) {
        if (!isIndeterminate()) {
            super.setProgress(i10);
            if (getProgressDrawable() != null) {
                getProgressDrawable().jumpToCurrentState();
                return;
            }
            return;
        }
        if (getProgressDrawable() != null) {
            this.f13335t = i10;
            this.f13339x = true;
            if (getIndeterminateDrawable().isVisible()) {
                a aVar = this.f13338w;
                ContentResolver contentResolver = getContext().getContentResolver();
                aVar.getClass();
                if (Settings.Global.getFloat(contentResolver, "animator_duration_scale", 1.0f) != 0.0f) {
                    getIndeterminateDrawable().f13364E.r();
                    return;
                }
            }
            this.f13332B.a(getIndeterminateDrawable());
        }
    }

    public final boolean b() {
        WeakHashMap weakHashMap = U.a;
        if (!isAttachedToWindow() || getWindowVisibility() != 0) {
            return false;
        }
        View view = this;
        while (view.getVisibility() == 0) {
            Object parent = view.getParent();
            if (parent == null) {
                return getWindowVisibility() == 0;
            }
            if (!(parent instanceof View)) {
                return true;
            }
            view = (View) parent;
        }
        return false;
    }

    @Override // android.widget.ProgressBar
    public Drawable getCurrentDrawable() {
        return isIndeterminate() ? getIndeterminateDrawable() : getProgressDrawable();
    }

    public int getHideAnimationBehavior() {
        return this.f13334s.f13393f;
    }

    public int[] getIndicatorColor() {
        return this.f13334s.f13390c;
    }

    public int getIndicatorTrackGapSize() {
        return this.f13334s.f13394g;
    }

    public int getShowAnimationBehavior() {
        return this.f13334s.f13392e;
    }

    public int getTrackColor() {
        return this.f13334s.f13391d;
    }

    public int getTrackCornerRadius() {
        return this.f13334s.f13389b;
    }

    public int getTrackThickness() {
        return this.f13334s.a;
    }

    @Override // android.view.View
    public final void invalidate() {
        super.invalidate();
        if (getCurrentDrawable() != null) {
            getCurrentDrawable().invalidateSelf();
        }
    }

    @Override // android.widget.ProgressBar, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (getProgressDrawable() != null && getIndeterminateDrawable() != null) {
            getIndeterminateDrawable().f13364E.o(this.f13332B);
        }
        f progressDrawable = getProgressDrawable();
        c cVar = this.f13333C;
        if (progressDrawable != null) {
            f progressDrawable2 = getProgressDrawable();
            if (progressDrawable2.f13357x == null) {
                progressDrawable2.f13357x = new ArrayList();
            }
            if (!progressDrawable2.f13357x.contains(cVar)) {
                progressDrawable2.f13357x.add(cVar);
            }
        }
        if (getIndeterminateDrawable() != null) {
            k indeterminateDrawable = getIndeterminateDrawable();
            if (indeterminateDrawable.f13357x == null) {
                indeterminateDrawable.f13357x = new ArrayList();
            }
            if (!indeterminateDrawable.f13357x.contains(cVar)) {
                indeterminateDrawable.f13357x.add(cVar);
            }
        }
        if (b()) {
            if (this.f13337v > 0) {
                SystemClock.uptimeMillis();
            }
            setVisibility(0);
        }
    }

    @Override // android.widget.ProgressBar, android.view.View
    public final void onDetachedFromWindow() {
        removeCallbacks(this.f13331A);
        removeCallbacks(this.f13341z);
        ((h) getCurrentDrawable()).c(false, false, false);
        k indeterminateDrawable = getIndeterminateDrawable();
        c cVar = this.f13333C;
        if (indeterminateDrawable != null) {
            getIndeterminateDrawable().e(cVar);
            getIndeterminateDrawable().f13364E.u();
        }
        if (getProgressDrawable() != null) {
            getProgressDrawable().e(cVar);
        }
        super.onDetachedFromWindow();
    }

    @Override // android.widget.ProgressBar, android.view.View
    public final synchronized void onDraw(Canvas canvas) {
        try {
            int iSave = canvas.save();
            if (getPaddingLeft() != 0 || getPaddingTop() != 0) {
                canvas.translate(getPaddingLeft(), getPaddingTop());
            }
            if (getPaddingRight() != 0 || getPaddingBottom() != 0) {
                canvas.clipRect(0, 0, getWidth() - (getPaddingLeft() + getPaddingRight()), getHeight() - (getPaddingTop() + getPaddingBottom()));
            }
            getCurrentDrawable().draw(canvas);
            canvas.restoreToCount(iSave);
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.widget.ProgressBar, android.view.View
    public final synchronized void onMeasure(int i10, int i11) {
        try {
            j currentDrawingDelegate = getCurrentDrawingDelegate();
            if (currentDrawingDelegate == null) {
                return;
            }
            setMeasuredDimension(View.getDefaultSize(getSuggestedMinimumWidth(), i10), ((l) currentDrawingDelegate).a.a < 0 ? View.getDefaultSize(getSuggestedMinimumHeight(), i11) : ((l) currentDrawingDelegate).a.a + getPaddingTop() + getPaddingBottom());
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View view, int i10) {
        super.onVisibilityChanged(view, i10);
        boolean z6 = i10 == 0;
        if (this.f13336u) {
            ((h) getCurrentDrawable()).c(b(), false, z6);
        }
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i10) {
        super.onWindowVisibilityChanged(i10);
        if (this.f13336u) {
            ((h) getCurrentDrawable()).c(b(), false, false);
        }
    }

    public void setAnimatorDurationScaleProvider(a aVar) {
        this.f13338w = aVar;
        if (getProgressDrawable() != null) {
            getProgressDrawable().f13354u = aVar;
        }
        if (getIndeterminateDrawable() != null) {
            getIndeterminateDrawable().f13354u = aVar;
        }
    }

    public void setHideAnimationBehavior(int i10) {
        this.f13334s.f13393f = i10;
        invalidate();
    }

    @Override // android.widget.ProgressBar
    public synchronized void setIndeterminate(boolean z6) {
        try {
            if (z6 == isIndeterminate()) {
                return;
            }
            h hVar = (h) getCurrentDrawable();
            if (hVar != null) {
                hVar.c(false, false, false);
            }
            super.setIndeterminate(z6);
            h hVar2 = (h) getCurrentDrawable();
            if (hVar2 != null) {
                hVar2.c(b(), false, false);
            }
            if ((hVar2 instanceof k) && b()) {
                ((k) hVar2).f13364E.t();
            }
            this.f13339x = false;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.widget.ProgressBar
    public void setIndeterminateDrawable(Drawable drawable) {
        if (drawable == null) {
            super.setIndeterminateDrawable(null);
        } else {
            if (!(drawable instanceof k)) {
                throw new IllegalArgumentException("Cannot set framework drawable as indeterminate drawable.");
            }
            ((h) drawable).c(false, false, false);
            super.setIndeterminateDrawable(drawable);
        }
    }

    public void setIndicatorColor(int... iArr) {
        if (iArr.length == 0) {
            iArr = new int[]{J7.a.f(getContext(), R.attr.colorPrimary, -1)};
        }
        if (Arrays.equals(getIndicatorColor(), iArr)) {
            return;
        }
        this.f13334s.f13390c = iArr;
        getIndeterminateDrawable().f13364E.m();
        invalidate();
    }

    public void setIndicatorTrackGapSize(int i10) {
        p pVar = this.f13334s;
        if (pVar.f13394g != i10) {
            pVar.f13394g = i10;
            pVar.a();
            invalidate();
        }
    }

    @Override // android.widget.ProgressBar
    public synchronized void setProgress(int i10) {
        if (isIndeterminate()) {
            return;
        }
        a(i10);
    }

    @Override // android.widget.ProgressBar
    public void setProgressDrawable(Drawable drawable) {
        if (drawable == null) {
            super.setProgressDrawable(null);
        } else {
            if (!(drawable instanceof f)) {
                throw new IllegalArgumentException("Cannot set framework drawable as progress drawable.");
            }
            f fVar = (f) drawable;
            fVar.c(false, false, false);
            super.setProgressDrawable(fVar);
            fVar.setLevel((int) ((getProgress() / getMax()) * 10000.0f));
        }
    }

    public void setShowAnimationBehavior(int i10) {
        this.f13334s.f13392e = i10;
        invalidate();
    }

    public void setTrackColor(int i10) {
        p pVar = this.f13334s;
        if (pVar.f13391d != i10) {
            pVar.f13391d = i10;
            invalidate();
        }
    }

    public void setTrackCornerRadius(int i10) {
        p pVar = this.f13334s;
        if (pVar.f13389b != i10) {
            pVar.f13389b = Math.min(i10, pVar.a / 2);
            invalidate();
        }
    }

    public void setTrackThickness(int i10) {
        p pVar = this.f13334s;
        if (pVar.a != i10) {
            pVar.a = i10;
            requestLayout();
        }
    }

    public void setVisibilityAfterHide(int i10) {
        if (i10 != 0 && i10 != 4 && i10 != 8) {
            throw new IllegalArgumentException("The component's visibility must be one of VISIBLE, INVISIBLE, and GONE defined in View.");
        }
        this.f13340y = i10;
    }

    @Override // android.widget.ProgressBar
    public k getIndeterminateDrawable() {
        return (k) super.getIndeterminateDrawable();
    }

    @Override // android.widget.ProgressBar
    public f getProgressDrawable() {
        return (f) super.getProgressDrawable();
    }
}
