package p;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.appcompat.widget.Toolbar;
import com.kcstream.cing.R;

/* JADX INFO: loaded from: classes.dex */
public final class X0 implements InterfaceC0704g0 {
    public final Toolbar a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f14008b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final View f14009c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Drawable f14010d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Drawable f14011e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Drawable f14012f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f14013g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public CharSequence f14014h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final CharSequence f14015i;
    public CharSequence j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Window.Callback f14016k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f14017l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public androidx.appcompat.widget.b f14018m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f14019n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Drawable f14020o;

    public X0(Toolbar toolbar, boolean z6) {
        Drawable drawable;
        this.f14019n = 0;
        this.a = toolbar;
        this.f14014h = toolbar.getTitle();
        this.f14015i = toolbar.getSubtitle();
        this.f14013g = this.f14014h != null;
        this.f14012f = toolbar.getNavigationIcon();
        Y1.c cVarE = Y1.c.E(toolbar.getContext(), null, p069h.a.a, R.attr.actionBarStyle);
        int i10 = 15;
        this.f14020o = cVarE.v(15);
        if (z6) {
            TypedArray typedArray = (TypedArray) cVarE.f5671u;
            CharSequence text = typedArray.getText(27);
            if (!TextUtils.isEmpty(text)) {
                this.f14013g = true;
                this.f14014h = text;
                if ((this.f14008b & 8) != 0) {
                    Toolbar toolbar2 = this.a;
                    toolbar2.setTitle(text);
                    if (this.f14013g) {
                        U.U.o(toolbar2.getRootView(), text);
                    }
                }
            }
            CharSequence text2 = typedArray.getText(25);
            if (!TextUtils.isEmpty(text2)) {
                this.f14015i = text2;
                if ((this.f14008b & 8) != 0) {
                    toolbar.setSubtitle(text2);
                }
            }
            Drawable drawableV = cVarE.v(20);
            if (drawableV != null) {
                this.f14011e = drawableV;
                d();
            }
            Drawable drawableV2 = cVarE.v(17);
            if (drawableV2 != null) {
                this.f14010d = drawableV2;
                d();
            }
            if (this.f14012f == null && (drawable = this.f14020o) != null) {
                this.f14012f = drawable;
                int i11 = this.f14008b & 4;
                Toolbar toolbar3 = this.a;
                if (i11 != 0) {
                    toolbar3.setNavigationIcon(drawable);
                } else {
                    toolbar3.setNavigationIcon((Drawable) null);
                }
            }
            a(typedArray.getInt(10, 0));
            int resourceId = typedArray.getResourceId(9, 0);
            if (resourceId != 0) {
                View viewInflate = LayoutInflater.from(toolbar.getContext()).inflate(resourceId, (ViewGroup) toolbar, false);
                View view = this.f14009c;
                if (view != null && (this.f14008b & 16) != 0) {
                    toolbar.removeView(view);
                }
                this.f14009c = viewInflate;
                if (viewInflate != null && (this.f14008b & 16) != 0) {
                    toolbar.addView(viewInflate);
                }
                a(this.f14008b | 16);
            }
            int layoutDimension = typedArray.getLayoutDimension(13, 0);
            if (layoutDimension > 0) {
                ViewGroup.LayoutParams layoutParams = toolbar.getLayoutParams();
                layoutParams.height = layoutDimension;
                toolbar.setLayoutParams(layoutParams);
            }
            int dimensionPixelOffset = typedArray.getDimensionPixelOffset(7, -1);
            int dimensionPixelOffset2 = typedArray.getDimensionPixelOffset(3, -1);
            if (dimensionPixelOffset >= 0 || dimensionPixelOffset2 >= 0) {
                int iMax = Math.max(dimensionPixelOffset, 0);
                int iMax2 = Math.max(dimensionPixelOffset2, 0);
                toolbar.d();
                toolbar.f6215L.a(iMax, iMax2);
            }
            int resourceId2 = typedArray.getResourceId(28, 0);
            if (resourceId2 != 0) {
                Context context = toolbar.getContext();
                toolbar.f6207D = resourceId2;
                X x8 = toolbar.f6240t;
                if (x8 != null) {
                    x8.setTextAppearance(context, resourceId2);
                }
            }
            int resourceId3 = typedArray.getResourceId(26, 0);
            if (resourceId3 != 0) {
                Context context2 = toolbar.getContext();
                toolbar.f6208E = resourceId3;
                X x10 = toolbar.f6241u;
                if (x10 != null) {
                    x10.setTextAppearance(context2, resourceId3);
                }
            }
            int resourceId4 = typedArray.getResourceId(22, 0);
            if (resourceId4 != 0) {
                toolbar.setPopupTheme(resourceId4);
            }
        } else {
            if (toolbar.getNavigationIcon() != null) {
                this.f14020o = toolbar.getNavigationIcon();
            } else {
                i10 = 11;
            }
            this.f14008b = i10;
        }
        cVarE.J();
        if (R.string.abc_action_bar_up_description != this.f14019n) {
            this.f14019n = R.string.abc_action_bar_up_description;
            if (TextUtils.isEmpty(toolbar.getNavigationContentDescription())) {
                b(this.f14019n);
            }
        }
        this.j = toolbar.getNavigationContentDescription();
        toolbar.setNavigationOnClickListener(new W0(this));
    }

    public final void a(int i10) {
        View view;
        int i11 = this.f14008b ^ i10;
        this.f14008b = i10;
        if (i11 != 0) {
            if ((i11 & 4) != 0) {
                if ((i10 & 4) != 0) {
                    c();
                }
                int i12 = this.f14008b & 4;
                Toolbar toolbar = this.a;
                if (i12 != 0) {
                    Drawable drawable = this.f14012f;
                    if (drawable == null) {
                        drawable = this.f14020o;
                    }
                    toolbar.setNavigationIcon(drawable);
                } else {
                    toolbar.setNavigationIcon((Drawable) null);
                }
            }
            if ((i11 & 3) != 0) {
                d();
            }
            int i13 = i11 & 8;
            Toolbar toolbar2 = this.a;
            if (i13 != 0) {
                if ((i10 & 8) != 0) {
                    toolbar2.setTitle(this.f14014h);
                    toolbar2.setSubtitle(this.f14015i);
                } else {
                    toolbar2.setTitle((CharSequence) null);
                    toolbar2.setSubtitle((CharSequence) null);
                }
            }
            if ((i11 & 16) == 0 || (view = this.f14009c) == null) {
                return;
            }
            if ((i10 & 16) != 0) {
                toolbar2.addView(view);
            } else {
                toolbar2.removeView(view);
            }
        }
    }

    public final void b(int i10) {
        this.j = i10 == 0 ? null : this.a.getContext().getString(i10);
        c();
    }

    public final void c() {
        if ((this.f14008b & 4) != 0) {
            boolean zIsEmpty = TextUtils.isEmpty(this.j);
            Toolbar toolbar = this.a;
            if (zIsEmpty) {
                toolbar.setNavigationContentDescription(this.f14019n);
            } else {
                toolbar.setNavigationContentDescription(this.j);
            }
        }
    }

    public final void d() {
        Drawable drawable;
        int i10 = this.f14008b;
        if ((i10 & 2) == 0) {
            drawable = null;
        } else if ((i10 & 1) == 0 || (drawable = this.f14011e) == null) {
            drawable = this.f14010d;
        }
        this.a.setLogo(drawable);
    }
}
