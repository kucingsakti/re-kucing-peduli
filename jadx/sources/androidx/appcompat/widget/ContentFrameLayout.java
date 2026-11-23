package androidx.appcompat.widget;

import U.C0417d0;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.widget.FrameLayout;
import p.C0703g;
import p.InterfaceC0700e0;
import p.InterfaceC0702f0;
import p.X0;
import p078i.D;
import p078i.t;
import p136o.l;

/* JADX INFO: loaded from: classes.dex */
public class ContentFrameLayout extends FrameLayout {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public TypedValue f6151s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public TypedValue f6152t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public TypedValue f6153u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public TypedValue f6154v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public TypedValue f6155w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public TypedValue f6156x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final Rect f6157y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public InterfaceC0700e0 f6158z;

    public ContentFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f6157y = new Rect();
    }

    public TypedValue getFixedHeightMajor() {
        if (this.f6155w == null) {
            this.f6155w = new TypedValue();
        }
        return this.f6155w;
    }

    public TypedValue getFixedHeightMinor() {
        if (this.f6156x == null) {
            this.f6156x = new TypedValue();
        }
        return this.f6156x;
    }

    public TypedValue getFixedWidthMajor() {
        if (this.f6153u == null) {
            this.f6153u = new TypedValue();
        }
        return this.f6153u;
    }

    public TypedValue getFixedWidthMinor() {
        if (this.f6154v == null) {
            this.f6154v = new TypedValue();
        }
        return this.f6154v;
    }

    public TypedValue getMinWidthMajor() {
        if (this.f6151s == null) {
            this.f6151s = new TypedValue();
        }
        return this.f6151s;
    }

    public TypedValue getMinWidthMinor() {
        if (this.f6152t == null) {
            this.f6152t = new TypedValue();
        }
        return this.f6152t;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        InterfaceC0700e0 interfaceC0700e0 = this.f6158z;
        if (interfaceC0700e0 != null) {
            interfaceC0700e0.getClass();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        b bVar;
        super.onDetachedFromWindow();
        InterfaceC0700e0 interfaceC0700e0 = this.f6158z;
        if (interfaceC0700e0 != null) {
            D d3 = ((t) interfaceC0700e0).f12118s;
            InterfaceC0702f0 interfaceC0702f0 = d3.f11929J;
            if (interfaceC0702f0 != null) {
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) interfaceC0702f0;
                actionBarOverlayLayout.k();
                ActionMenuView actionMenuView = ((X0) actionBarOverlayLayout.f6124w).a.f6239s;
                if (actionMenuView != null && (bVar = actionMenuView.f6133L) != null) {
                    bVar.b();
                    C0703g c0703g = bVar.f6265M;
                    if (c0703g != null && c0703g.b()) {
                        c0703g.f13564i.dismiss();
                    }
                }
            }
            if (d3.f11934O != null) {
                d3.f11923D.getDecorView().removeCallbacks(d3.P);
                if (d3.f11934O.isShowing()) {
                    try {
                        d3.f11934O.dismiss();
                    } catch (IllegalArgumentException unused) {
                    }
                }
                d3.f11934O = null;
            }
            C0417d0 c0417d0 = d3.f11935Q;
            if (c0417d0 != null) {
                c0417d0.b();
            }
            l lVar = d3.B(0).f11910h;
            if (lVar != null) {
                lVar.c(true);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x004e  */
    /* JADX WARN: Code duplicated, block: B:22:0x0062  */
    /* JADX WARN: Code duplicated, block: B:37:0x008a  */
    /* JADX WARN: Code duplicated, block: B:38:0x009d  */
    /* JADX WARN: Code duplicated, block: B:55:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:57:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:58:0x00de  */
    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        int iMakeMeasureSpec;
        boolean z6;
        int iMakeMeasureSpec2;
        int i12;
        int i13;
        float fraction;
        int i14;
        int i15;
        float fraction2;
        int i16;
        int i17;
        float fraction3;
        DisplayMetrics displayMetrics = getContext().getResources().getDisplayMetrics();
        boolean z10 = true;
        boolean z11 = displayMetrics.widthPixels < displayMetrics.heightPixels;
        int mode = View.MeasureSpec.getMode(i10);
        int mode2 = View.MeasureSpec.getMode(i11);
        Rect rect = this.f6157y;
        if (mode != Integer.MIN_VALUE) {
            iMakeMeasureSpec = i10;
            z6 = false;
        } else {
            TypedValue typedValue = z11 ? this.f6154v : this.f6153u;
            if (typedValue == null || (i16 = typedValue.type) == 0) {
                iMakeMeasureSpec = i10;
                z6 = false;
            } else {
                if (i16 == 5) {
                    fraction3 = typedValue.getDimension(displayMetrics);
                } else {
                    if (i16 == 6) {
                        int i18 = displayMetrics.widthPixels;
                        fraction3 = typedValue.getFraction(i18, i18);
                    } else {
                        i17 = 0;
                    }
                    if (i17 > 0) {
                        iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(Math.min(i17 - (rect.left + rect.right), View.MeasureSpec.getSize(i10)), 1073741824);
                        z6 = true;
                    } else {
                        iMakeMeasureSpec = i10;
                        z6 = false;
                    }
                }
                i17 = (int) fraction3;
                if (i17 > 0) {
                    iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(Math.min(i17 - (rect.left + rect.right), View.MeasureSpec.getSize(i10)), 1073741824);
                    z6 = true;
                } else {
                    iMakeMeasureSpec = i10;
                    z6 = false;
                }
            }
        }
        if (mode2 != Integer.MIN_VALUE) {
            iMakeMeasureSpec2 = i11;
        } else {
            TypedValue typedValue2 = z11 ? this.f6155w : this.f6156x;
            if (typedValue2 == null || (i14 = typedValue2.type) == 0) {
                iMakeMeasureSpec2 = i11;
            } else {
                if (i14 == 5) {
                    fraction2 = typedValue2.getDimension(displayMetrics);
                } else {
                    if (i14 == 6) {
                        int i19 = displayMetrics.heightPixels;
                        fraction2 = typedValue2.getFraction(i19, i19);
                    } else {
                        i15 = 0;
                    }
                    if (i15 > 0) {
                        iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(Math.min(i15 - (rect.top + rect.bottom), View.MeasureSpec.getSize(i11)), 1073741824);
                    } else {
                        iMakeMeasureSpec2 = i11;
                    }
                }
                i15 = (int) fraction2;
                if (i15 > 0) {
                    iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(Math.min(i15 - (rect.top + rect.bottom), View.MeasureSpec.getSize(i11)), 1073741824);
                } else {
                    iMakeMeasureSpec2 = i11;
                }
            }
        }
        super.onMeasure(iMakeMeasureSpec, iMakeMeasureSpec2);
        int measuredWidth = getMeasuredWidth();
        int iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824);
        if (z6 || mode != Integer.MIN_VALUE) {
            z10 = false;
        } else {
            TypedValue typedValue3 = z11 ? this.f6152t : this.f6151s;
            if (typedValue3 == null || (i12 = typedValue3.type) == 0) {
                z10 = false;
            } else {
                if (i12 == 5) {
                    fraction = typedValue3.getDimension(displayMetrics);
                } else {
                    if (i12 == 6) {
                        int i20 = displayMetrics.widthPixels;
                        fraction = typedValue3.getFraction(i20, i20);
                    } else {
                        i13 = 0;
                    }
                    if (i13 > 0) {
                        i13 -= rect.left + rect.right;
                    }
                    if (measuredWidth < i13) {
                        iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(i13, 1073741824);
                    } else {
                        z10 = false;
                    }
                }
                i13 = (int) fraction;
                if (i13 > 0) {
                    i13 -= rect.left + rect.right;
                }
                if (measuredWidth < i13) {
                    iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(i13, 1073741824);
                } else {
                    z10 = false;
                }
            }
        }
        if (z10) {
            super.onMeasure(iMakeMeasureSpec3, iMakeMeasureSpec2);
        }
    }

    public void setAttachListener(InterfaceC0700e0 interfaceC0700e0) {
        this.f6158z = interfaceC0700e0;
    }
}
