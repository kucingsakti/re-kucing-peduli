package p118m3;

import J7.j;
import T2.a;
import U.AbstractC0436w;
import U.U;
import V.i;
import android.R;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.bumptech.glide.e;
import java.util.WeakHashMap;
import p136o.n;
import p136o.y;
import p204v1.g;

/* JADX INFO: loaded from: classes.dex */
public abstract class d extends FrameLayout implements y {

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public static final int[] f13071b0 = {R.attr.state_checked};
    public static final g c0 = new g(24);

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public static final c f13072d0 = new c(24);

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public float f13073A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public int f13074B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public boolean f13075C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final FrameLayout f13076D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final View f13077E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public final ImageView f13078F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public final ViewGroup f13079G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public final TextView f13080H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public final TextView f13081I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public int f13082J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public int f13083K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public n f13084L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public ColorStateList f13085M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public Drawable f13086N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public Drawable f13087O;
    public ValueAnimator P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public g f13088Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public float f13089R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public boolean f13090S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public int f13091T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public int f13092U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public boolean f13093V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public int f13094W;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public a f13095a0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f13096s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public ColorStateList f13097t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public Drawable f13098u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f13099v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f13100w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f13101x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public float f13102y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public float f13103z;

    public d(Context context) {
        super(context);
        this.f13096s = false;
        this.f13082J = -1;
        this.f13083K = 0;
        this.f13088Q = c0;
        this.f13089R = 0.0f;
        this.f13090S = false;
        this.f13091T = 0;
        this.f13092U = 0;
        this.f13093V = false;
        this.f13094W = 0;
        int i10 = 1;
        LayoutInflater.from(context).inflate(getItemLayoutResId(), (ViewGroup) this, true);
        this.f13076D = (FrameLayout) findViewById(com.kcstream.cing.R.id.navigation_bar_item_icon_container);
        this.f13077E = findViewById(com.kcstream.cing.R.id.navigation_bar_item_active_indicator_view);
        ImageView imageView = (ImageView) findViewById(com.kcstream.cing.R.id.navigation_bar_item_icon_view);
        this.f13078F = imageView;
        ViewGroup viewGroup = (ViewGroup) findViewById(com.kcstream.cing.R.id.navigation_bar_item_labels_group);
        this.f13079G = viewGroup;
        TextView textView = (TextView) findViewById(com.kcstream.cing.R.id.navigation_bar_item_small_label_view);
        this.f13080H = textView;
        TextView textView2 = (TextView) findViewById(com.kcstream.cing.R.id.navigation_bar_item_large_label_view);
        this.f13081I = textView2;
        setBackgroundResource(getItemBackgroundResId());
        this.f13099v = getResources().getDimensionPixelSize(getItemDefaultMarginResId());
        this.f13100w = viewGroup.getPaddingBottom();
        this.f13101x = getResources().getDimensionPixelSize(com.kcstream.cing.R.dimen.m3_navigation_item_active_indicator_label_padding);
        WeakHashMap weakHashMap = U.a;
        textView.setImportantForAccessibility(2);
        textView2.setImportantForAccessibility(2);
        setFocusable(true);
        b(textView.getTextSize(), textView2.getTextSize());
        if (imageView != null) {
            imageView.addOnLayoutChangeListener(new V2.a((W2.a) this, i10));
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001f  */
    public static void f(TextView textView, int i10) {
        int iRound;
        textView.setTextAppearance(i10);
        Context context = textView.getContext();
        if (i10 == 0) {
            iRound = 0;
        } else {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i10, Q2.a.P);
            TypedValue typedValue = new TypedValue();
            boolean value = typedArrayObtainStyledAttributes.getValue(0, typedValue);
            typedArrayObtainStyledAttributes.recycle();
            if (value) {
                iRound = typedValue.getComplexUnit() == 2 ? Math.round(TypedValue.complexToFloat(typedValue.data) * context.getResources().getDisplayMetrics().density) : TypedValue.complexToDimensionPixelSize(typedValue.data, context.getResources().getDisplayMetrics());
            } else {
                iRound = 0;
            }
        }
        if (iRound != 0) {
            textView.setTextSize(0, iRound);
        }
    }

    public static void g(View view, float f10, float f11, int i10) {
        view.setScaleX(f10);
        view.setScaleY(f11);
        view.setVisibility(i10);
    }

    private View getIconOrContainer() {
        FrameLayout frameLayout = this.f13076D;
        return frameLayout != null ? frameLayout : this.f13078F;
    }

    private int getItemVisiblePosition() {
        ViewGroup viewGroup = (ViewGroup) getParent();
        int iIndexOfChild = viewGroup.indexOfChild(this);
        int i10 = 0;
        for (int i11 = 0; i11 < iIndexOfChild; i11++) {
            View childAt = viewGroup.getChildAt(i11);
            if ((childAt instanceof d) && childAt.getVisibility() == 0) {
                i10++;
            }
        }
        return i10;
    }

    private int getSuggestedIconHeight() {
        return getIconOrContainer().getMeasuredHeight() + ((FrameLayout.LayoutParams) getIconOrContainer().getLayoutParams()).topMargin;
    }

    private int getSuggestedIconWidth() {
        a aVar = this.f13095a0;
        int minimumWidth = aVar == null ? 0 : aVar.getMinimumWidth() - this.f13095a0.f4636w.f4640b.f9457O.intValue();
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) getIconOrContainer().getLayoutParams();
        return Math.max(minimumWidth, layoutParams.rightMargin) + this.f13078F.getMeasuredWidth() + Math.max(minimumWidth, layoutParams.leftMargin);
    }

    public static void h(View view, int i10, int i11) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        layoutParams.topMargin = i10;
        layoutParams.bottomMargin = i10;
        layoutParams.gravity = i11;
        view.setLayoutParams(layoutParams);
    }

    public static void j(View view, int i10) {
        view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), i10);
    }

    @Override // p136o.y
    public final void a(n nVar) {
        this.f13084L = nVar;
        setCheckable(nVar.isCheckable());
        setChecked(nVar.isChecked());
        setEnabled(nVar.isEnabled());
        setIcon(nVar.getIcon());
        setTitle(nVar.f13542w);
        setId(nVar.f13538s);
        if (!TextUtils.isEmpty(nVar.f13526I)) {
            setContentDescription(nVar.f13526I);
        }
        CharSequence charSequence = !TextUtils.isEmpty(nVar.f13527J) ? nVar.f13527J : nVar.f13542w;
        if (Build.VERSION.SDK_INT > 23) {
            e.r(this, charSequence);
        }
        setVisibility(nVar.isVisible() ? 0 : 8);
        this.f13096s = true;
    }

    public final void b(float f10, float f11) {
        this.f13102y = f10 - f11;
        this.f13103z = (f11 * 1.0f) / f10;
        this.f13073A = (f10 * 1.0f) / f11;
    }

    public final void c() {
        n nVar = this.f13084L;
        if (nVar != null) {
            setChecked(nVar.isChecked());
        }
    }

    public final void d() {
        Drawable rippleDrawable = this.f13098u;
        ColorStateList colorStateList = this.f13097t;
        FrameLayout frameLayout = this.f13076D;
        RippleDrawable rippleDrawable2 = null;
        boolean z6 = true;
        if (colorStateList != null) {
            Drawable activeIndicatorDrawable = getActiveIndicatorDrawable();
            if (this.f13090S && getActiveIndicatorDrawable() != null && frameLayout != null && activeIndicatorDrawable != null) {
                rippleDrawable2 = new RippleDrawable(p149p3.a.c(this.f13097t), null, activeIndicatorDrawable);
                z6 = false;
            } else if (rippleDrawable == null) {
                rippleDrawable = new RippleDrawable(p149p3.a.a(this.f13097t), null, null);
            }
        }
        if (frameLayout != null) {
            frameLayout.setPadding(0, 0, 0, 0);
            frameLayout.setForeground(rippleDrawable2);
        }
        WeakHashMap weakHashMap = U.a;
        setBackground(rippleDrawable);
        if (Build.VERSION.SDK_INT >= 26) {
            setDefaultFocusHighlightEnabled(z6);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        FrameLayout frameLayout = this.f13076D;
        if (frameLayout != null && this.f13090S) {
            frameLayout.dispatchTouchEvent(motionEvent);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public final void e(float f10, float f11) {
        View view = this.f13077E;
        if (view != null) {
            g gVar = this.f13088Q;
            gVar.getClass();
            view.setScaleX(R2.a.a(0.4f, 1.0f, f10));
            view.setScaleY(gVar.h(f10, f11));
            view.setAlpha(R2.a.b(0.0f, 1.0f, f11 == 0.0f ? 0.8f : 0.0f, f11 == 0.0f ? 1.0f : 0.2f, f10));
        }
        this.f13089R = f10;
    }

    public Drawable getActiveIndicatorDrawable() {
        View view = this.f13077E;
        if (view == null) {
            return null;
        }
        return view.getBackground();
    }

    public a getBadge() {
        return this.f13095a0;
    }

    public int getItemBackgroundResId() {
        return com.kcstream.cing.R.drawable.mtrl_navigation_bar_item_background;
    }

    @Override // p136o.y
    public n getItemData() {
        return this.f13084L;
    }

    public int getItemDefaultMarginResId() {
        return com.kcstream.cing.R.dimen.mtrl_navigation_bar_item_default_margin;
    }

    public abstract int getItemLayoutResId();

    public int getItemPosition() {
        return this.f13082J;
    }

    @Override // android.view.View
    public int getSuggestedMinimumHeight() {
        ViewGroup viewGroup = this.f13079G;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) viewGroup.getLayoutParams();
        return viewGroup.getMeasuredHeight() + getSuggestedIconHeight() + (viewGroup.getVisibility() == 0 ? this.f13101x : 0) + layoutParams.topMargin + layoutParams.bottomMargin;
    }

    @Override // android.view.View
    public int getSuggestedMinimumWidth() {
        ViewGroup viewGroup = this.f13079G;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) viewGroup.getLayoutParams();
        return Math.max(getSuggestedIconWidth(), viewGroup.getMeasuredWidth() + layoutParams.leftMargin + layoutParams.rightMargin);
    }

    public final void i(int i10) {
        View view = this.f13077E;
        if (view == null || i10 <= 0) {
            return;
        }
        int iMin = Math.min(this.f13091T, i10 - (this.f13094W * 2));
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        layoutParams.height = (this.f13093V && this.f13074B == 2) ? iMin : this.f13092U;
        layoutParams.width = iMin;
        view.setLayoutParams(layoutParams);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final int[] onCreateDrawableState(int i10) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i10 + 1);
        n nVar = this.f13084L;
        if (nVar != null && nVar.isCheckable() && this.f13084L.isChecked()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f13071b0);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        a aVar = this.f13095a0;
        if (aVar != null && aVar.isVisible()) {
            n nVar = this.f13084L;
            CharSequence charSequence = nVar.f13542w;
            if (!TextUtils.isEmpty(nVar.f13526I)) {
                charSequence = this.f13084L.f13526I;
            }
            accessibilityNodeInfo.setContentDescription(((Object) charSequence) + ", " + ((Object) this.f13095a0.c()));
        }
        accessibilityNodeInfo.setCollectionItemInfo(i.a(0, 1, getItemVisiblePosition(), 1, false, isSelected()).a);
        if (isSelected()) {
            accessibilityNodeInfo.setClickable(false);
            accessibilityNodeInfo.removeAction((AccessibilityNodeInfo.AccessibilityAction) V.d.f5067g.a);
        }
        accessibilityNodeInfo.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", getResources().getString(com.kcstream.cing.R.string.item_view_role_description));
    }

    @Override // android.view.View
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        post(new R.a(i10, 4, this));
    }

    public void setActiveIndicatorDrawable(Drawable drawable) {
        View view = this.f13077E;
        if (view == null) {
            return;
        }
        view.setBackgroundDrawable(drawable);
        d();
    }

    public void setActiveIndicatorEnabled(boolean z6) {
        this.f13090S = z6;
        d();
        View view = this.f13077E;
        if (view != null) {
            view.setVisibility(z6 ? 0 : 8);
            requestLayout();
        }
    }

    public void setActiveIndicatorHeight(int i10) {
        this.f13092U = i10;
        i(getWidth());
    }

    public void setActiveIndicatorLabelPadding(int i10) {
        if (this.f13101x != i10) {
            this.f13101x = i10;
            c();
        }
    }

    public void setActiveIndicatorMarginHorizontal(int i10) {
        this.f13094W = i10;
        i(getWidth());
    }

    public void setActiveIndicatorResizeable(boolean z6) {
        this.f13093V = z6;
    }

    public void setActiveIndicatorWidth(int i10) {
        this.f13091T = i10;
        i(getWidth());
    }

    public void setBadge(a aVar) {
        a aVar2 = this.f13095a0;
        if (aVar2 == aVar) {
            return;
        }
        boolean z6 = aVar2 != null;
        ImageView imageView = this.f13078F;
        if (z6 && imageView != null) {
            Log.w("NavigationBar", "Multiple badges shouldn't be attached to one item.");
            if (this.f13095a0 != null) {
                setClipChildren(true);
                setClipToPadding(true);
                a aVar3 = this.f13095a0;
                if (aVar3 != null) {
                    if (aVar3.d() != null) {
                        aVar3.d().setForeground(null);
                    } else {
                        imageView.getOverlay().remove(aVar3);
                    }
                }
                this.f13095a0 = null;
            }
        }
        this.f13095a0 = aVar;
        if (imageView == null || aVar == null) {
            return;
        }
        setClipChildren(false);
        setClipToPadding(false);
        a aVar4 = this.f13095a0;
        Rect rect = new Rect();
        imageView.getDrawingRect(rect);
        aVar4.setBounds(rect);
        aVar4.i(imageView, null);
        if (aVar4.d() != null) {
            aVar4.d().setForeground(aVar4);
        } else {
            imageView.getOverlay().add(aVar4);
        }
    }

    public void setCheckable(boolean z6) {
        refreshDrawableState();
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0095  */
    public void setChecked(boolean z6) {
        TextView textView = this.f13081I;
        textView.setPivotX(textView.getWidth() / 2);
        textView.setPivotY(textView.getBaseline());
        TextView textView2 = this.f13080H;
        textView2.setPivotX(textView2.getWidth() / 2);
        textView2.setPivotY(textView2.getBaseline());
        float f10 = z6 ? 1.0f : 0.0f;
        if (this.f13090S && this.f13096s) {
            WeakHashMap weakHashMap = U.a;
            if (isAttachedToWindow()) {
                ValueAnimator valueAnimator = this.P;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    this.P = null;
                }
                ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.f13089R, f10);
                this.P = valueAnimatorOfFloat;
                valueAnimatorOfFloat.addUpdateListener(new b(this, f10));
                this.P.setInterpolator(j.D(getContext(), com.kcstream.cing.R.attr.motionEasingEmphasizedInterpolator, R2.a.f4441b));
                this.P.setDuration(j.C(getContext(), com.kcstream.cing.R.attr.motionDurationLong2, getResources().getInteger(com.kcstream.cing.R.integer.material_motion_duration_long_1)));
                this.P.start();
            } else {
                e(f10, f10);
            }
        } else {
            e(f10, f10);
        }
        int i10 = this.f13074B;
        ViewGroup viewGroup = this.f13079G;
        if (i10 != -1) {
            if (i10 == 0) {
                if (z6) {
                    h(getIconOrContainer(), this.f13099v, 49);
                    j(viewGroup, this.f13100w);
                    textView.setVisibility(0);
                } else {
                    h(getIconOrContainer(), this.f13099v, 17);
                    j(viewGroup, 0);
                    textView.setVisibility(4);
                }
                textView2.setVisibility(4);
            } else if (i10 == 1) {
                j(viewGroup, this.f13100w);
                if (z6) {
                    h(getIconOrContainer(), (int) (this.f13099v + this.f13102y), 49);
                    g(textView, 1.0f, 1.0f, 0);
                    float f11 = this.f13103z;
                    g(textView2, f11, f11, 4);
                } else {
                    h(getIconOrContainer(), this.f13099v, 49);
                    float f12 = this.f13073A;
                    g(textView, f12, f12, 4);
                    g(textView2, 1.0f, 1.0f, 0);
                }
            } else if (i10 == 2) {
                h(getIconOrContainer(), this.f13099v, 17);
                textView.setVisibility(8);
                textView2.setVisibility(8);
            }
        } else if (this.f13075C) {
            if (z6) {
                h(getIconOrContainer(), this.f13099v, 49);
                j(viewGroup, this.f13100w);
                textView.setVisibility(0);
            } else {
                h(getIconOrContainer(), this.f13099v, 17);
                j(viewGroup, 0);
                textView.setVisibility(4);
            }
            textView2.setVisibility(4);
        } else {
            j(viewGroup, this.f13100w);
            if (z6) {
                h(getIconOrContainer(), (int) (this.f13099v + this.f13102y), 49);
                g(textView, 1.0f, 1.0f, 0);
                float f13 = this.f13103z;
                g(textView2, f13, f13, 4);
            } else {
                h(getIconOrContainer(), this.f13099v, 49);
                float f14 = this.f13073A;
                g(textView, f14, f14, 4);
                g(textView2, 1.0f, 1.0f, 0);
            }
        }
        refreshDrawableState();
        setSelected(z6);
    }

    @Override // android.view.View
    public void setEnabled(boolean z6) {
        super.setEnabled(z6);
        this.f13080H.setEnabled(z6);
        this.f13081I.setEnabled(z6);
        this.f13078F.setEnabled(z6);
        Object obj = null;
        if (z6) {
            U.p(this, Build.VERSION.SDK_INT >= 24 ? new p040e1.j(AbstractC0436w.b(getContext(), 1002), 29) : new p040e1.j(obj, 29));
        } else {
            U.p(this, null);
        }
    }

    public void setIcon(Drawable drawable) {
        if (drawable == this.f13086N) {
            return;
        }
        this.f13086N = drawable;
        if (drawable != null) {
            Drawable.ConstantState constantState = drawable.getConstantState();
            if (constantState != null) {
                drawable = constantState.newDrawable();
            }
            drawable = drawable.mutate();
            this.f13087O = drawable;
            ColorStateList colorStateList = this.f13085M;
            if (colorStateList != null) {
                M.a.h(drawable, colorStateList);
            }
        }
        this.f13078F.setImageDrawable(drawable);
    }

    public void setIconSize(int i10) {
        ImageView imageView = this.f13078F;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) imageView.getLayoutParams();
        layoutParams.width = i10;
        layoutParams.height = i10;
        imageView.setLayoutParams(layoutParams);
    }

    public void setIconTintList(ColorStateList colorStateList) {
        Drawable drawable;
        this.f13085M = colorStateList;
        if (this.f13084L == null || (drawable = this.f13087O) == null) {
            return;
        }
        M.a.h(drawable, colorStateList);
        this.f13087O.invalidateSelf();
    }

    public void setItemBackground(int i10) {
        setItemBackground(i10 == 0 ? null : J.a.b(getContext(), i10));
    }

    public void setItemPaddingBottom(int i10) {
        if (this.f13100w != i10) {
            this.f13100w = i10;
            c();
        }
    }

    public void setItemPaddingTop(int i10) {
        if (this.f13099v != i10) {
            this.f13099v = i10;
            c();
        }
    }

    public void setItemPosition(int i10) {
        this.f13082J = i10;
    }

    public void setItemRippleColor(ColorStateList colorStateList) {
        this.f13097t = colorStateList;
        d();
    }

    public void setLabelVisibilityMode(int i10) {
        if (this.f13074B != i10) {
            this.f13074B = i10;
            if (this.f13093V && i10 == 2) {
                this.f13088Q = f13072d0;
            } else {
                this.f13088Q = c0;
            }
            i(getWidth());
            c();
        }
    }

    public void setShifting(boolean z6) {
        if (this.f13075C != z6) {
            this.f13075C = z6;
            c();
        }
    }

    public void setTextAppearanceActive(int i10) {
        this.f13083K = i10;
        TextView textView = this.f13081I;
        f(textView, i10);
        b(this.f13080H.getTextSize(), textView.getTextSize());
    }

    public void setTextAppearanceActiveBoldEnabled(boolean z6) {
        setTextAppearanceActive(this.f13083K);
        TextView textView = this.f13081I;
        textView.setTypeface(textView.getTypeface(), z6 ? 1 : 0);
    }

    public void setTextAppearanceInactive(int i10) {
        TextView textView = this.f13080H;
        f(textView, i10);
        b(textView.getTextSize(), this.f13081I.getTextSize());
    }

    public void setTextColor(ColorStateList colorStateList) {
        if (colorStateList != null) {
            this.f13080H.setTextColor(colorStateList);
            this.f13081I.setTextColor(colorStateList);
        }
    }

    public void setTitle(CharSequence charSequence) {
        this.f13080H.setText(charSequence);
        this.f13081I.setText(charSequence);
        n nVar = this.f13084L;
        if (nVar == null || TextUtils.isEmpty(nVar.f13526I)) {
            setContentDescription(charSequence);
        }
        n nVar2 = this.f13084L;
        if (nVar2 != null && !TextUtils.isEmpty(nVar2.f13527J)) {
            charSequence = this.f13084L.f13527J;
        }
        if (Build.VERSION.SDK_INT > 23) {
            e.r(this, charSequence);
        }
    }

    public void setItemBackground(Drawable drawable) {
        if (drawable != null && drawable.getConstantState() != null) {
            drawable = drawable.getConstantState().newDrawable().mutate();
        }
        this.f13098u = drawable;
        d();
    }
}
