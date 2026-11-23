package com.google.android.material.progressindicator;

import B6.b;
import U.U;
import android.content.Context;
import android.util.AttributeSet;
import java.util.WeakHashMap;
import p129n3.d;
import p129n3.f;
import p129n3.k;
import p129n3.l;
import p129n3.m;
import p129n3.o;
import p129n3.p;

/* JADX INFO: loaded from: classes.dex */
public class LinearProgressIndicator extends d {
    public LinearProgressIndicator(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        l lVar = new l();
        p pVar = this.f13334s;
        lVar.a = pVar;
        lVar.f13365b = 300.0f;
        Context context2 = getContext();
        b mVar = pVar.f13395h == 0 ? new m(pVar) : new o(context2, pVar);
        k kVar = new k(context2, pVar);
        kVar.f13363D = lVar;
        kVar.f13364E = mVar;
        mVar.f725s = kVar;
        setIndeterminateDrawable(kVar);
        setProgressDrawable(new f(getContext(), pVar, lVar));
    }

    @Override // p129n3.d
    public final void a(int i10) {
        p pVar = this.f13334s;
        if (pVar != null && pVar.f13395h == 0 && isIndeterminate()) {
            return;
        }
        super.a(i10);
    }

    public int getIndeterminateAnimationType() {
        return this.f13334s.f13395h;
    }

    public int getIndicatorDirection() {
        return this.f13334s.f13396i;
    }

    public int getTrackStopIndicatorSize() {
        return this.f13334s.f13397k;
    }

    @Override // android.view.View
    public final void onLayout(boolean z6, int i10, int i11, int i12, int i13) {
        super.onLayout(z6, i10, i11, i12, i13);
        p pVar = this.f13334s;
        boolean z10 = true;
        if (pVar.f13396i != 1) {
            WeakHashMap weakHashMap = U.a;
            if ((getLayoutDirection() != 1 || pVar.f13396i != 2) && (getLayoutDirection() != 0 || pVar.f13396i != 3)) {
                z10 = false;
            }
        }
        pVar.j = z10;
    }

    @Override // android.widget.ProgressBar, android.view.View
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        int paddingRight = i10 - (getPaddingRight() + getPaddingLeft());
        int paddingBottom = i11 - (getPaddingBottom() + getPaddingTop());
        k indeterminateDrawable = getIndeterminateDrawable();
        if (indeterminateDrawable != null) {
            indeterminateDrawable.setBounds(0, 0, paddingRight, paddingBottom);
        }
        f progressDrawable = getProgressDrawable();
        if (progressDrawable != null) {
            progressDrawable.setBounds(0, 0, paddingRight, paddingBottom);
        }
    }

    public void setIndeterminateAnimationType(int i10) {
        p pVar = this.f13334s;
        if (pVar.f13395h == i10) {
            return;
        }
        if (b() && isIndeterminate()) {
            throw new IllegalStateException("Cannot change indeterminate animation type while the progress indicator is show in indeterminate mode.");
        }
        pVar.f13395h = i10;
        pVar.a();
        if (i10 == 0) {
            k indeterminateDrawable = getIndeterminateDrawable();
            m mVar = new m(pVar);
            indeterminateDrawable.f13364E = mVar;
            mVar.f725s = indeterminateDrawable;
        } else {
            k indeterminateDrawable2 = getIndeterminateDrawable();
            o oVar = new o(getContext(), pVar);
            indeterminateDrawable2.f13364E = oVar;
            oVar.f725s = indeterminateDrawable2;
        }
        invalidate();
    }

    @Override // p129n3.d
    public void setIndicatorColor(int... iArr) {
        super.setIndicatorColor(iArr);
        this.f13334s.a();
    }

    public void setIndicatorDirection(int i10) {
        p pVar = this.f13334s;
        pVar.f13396i = i10;
        boolean z6 = true;
        if (i10 != 1) {
            WeakHashMap weakHashMap = U.a;
            if ((getLayoutDirection() != 1 || pVar.f13396i != 2) && (getLayoutDirection() != 0 || i10 != 3)) {
                z6 = false;
            }
        }
        pVar.j = z6;
        invalidate();
    }

    @Override // p129n3.d
    public void setTrackCornerRadius(int i10) {
        super.setTrackCornerRadius(i10);
        this.f13334s.a();
        invalidate();
    }

    public void setTrackStopIndicatorSize(int i10) {
        p pVar = this.f13334s;
        if (pVar.f13397k != i10) {
            pVar.f13397k = Math.min(i10, pVar.a);
            pVar.a();
            invalidate();
        }
    }
}
