package androidx.appcompat.widget;

import L8.e0;
import U.C0417d0;
import U.U;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.kcstream.cing.R;
import p.C0703g;
import p.ViewOnClickListenerC0693b;
import p.f1;
import p068ga.l;
import p136o.z;

/* JADX INFO: loaded from: classes.dex */
public class ActionBarContextView extends ViewGroup {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public CharSequence f6078A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public CharSequence f6079B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public View f6080C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public View f6081D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public View f6082E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public LinearLayout f6083F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public TextView f6084G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public TextView f6085H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public final int f6086I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public final int f6087J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public boolean f6088K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public final int f6089L;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final p019b9.c f6090s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Context f6091t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public ActionMenuView f6092u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public b f6093v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f6094w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public C0417d0 f6095x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f6096y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f6097z;

    public ActionBarContextView(Context context, AttributeSet attributeSet) {
        int resourceId;
        super(context, attributeSet, R.attr.actionModeStyle);
        this.f6090s = new p019b9.c(this);
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(R.attr.actionBarPopupTheme, typedValue, true) || typedValue.resourceId == 0) {
            this.f6091t = context;
        } else {
            this.f6091t = new ContextThemeWrapper(context, typedValue.resourceId);
        }
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, p069h.a.f11612d, R.attr.actionModeStyle, 0);
        setBackground((!typedArrayObtainStyledAttributes.hasValue(0) || (resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0)) == 0) ? typedArrayObtainStyledAttributes.getDrawable(0) : l.g(context, resourceId));
        this.f6086I = typedArrayObtainStyledAttributes.getResourceId(5, 0);
        this.f6087J = typedArrayObtainStyledAttributes.getResourceId(4, 0);
        this.f6094w = typedArrayObtainStyledAttributes.getLayoutDimension(3, 0);
        this.f6089L = typedArrayObtainStyledAttributes.getResourceId(2, R.layout.abc_action_mode_close_item_material);
        typedArrayObtainStyledAttributes.recycle();
    }

    public static int f(View view, int i10, int i11) {
        view.measure(View.MeasureSpec.makeMeasureSpec(i10, Integer.MIN_VALUE), i11);
        return Math.max(0, i10 - view.getMeasuredWidth());
    }

    public static int g(int i10, int i11, int i12, View view, boolean z6) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int i13 = ((i12 - measuredHeight) / 2) + i11;
        if (z6) {
            view.layout(i10 - measuredWidth, i13, i10, measuredHeight + i13);
        } else {
            view.layout(i10, i13, i10 + measuredWidth, measuredHeight + i13);
        }
        return z6 ? -measuredWidth : measuredWidth;
    }

    public final void c(e0 e0Var) {
        View view = this.f6080C;
        if (view == null) {
            View viewInflate = LayoutInflater.from(getContext()).inflate(this.f6089L, (ViewGroup) this, false);
            this.f6080C = viewInflate;
            addView(viewInflate);
        } else if (view.getParent() == null) {
            addView(this.f6080C);
        }
        View viewFindViewById = this.f6080C.findViewById(R.id.action_mode_close_button);
        this.f6081D = viewFindViewById;
        viewFindViewById.setOnClickListener(new ViewOnClickListenerC0693b(e0Var));
        p136o.l lVarE = e0Var.e();
        b bVar = this.f6093v;
        if (bVar != null) {
            bVar.b();
            C0703g c0703g = bVar.f6265M;
            if (c0703g != null && c0703g.b()) {
                c0703g.f13564i.dismiss();
            }
        }
        b bVar2 = new b(getContext());
        this.f6093v = bVar2;
        bVar2.f6257E = true;
        bVar2.f6258F = true;
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-2, -1);
        lVarE.b(this.f6093v, this.f6091t);
        b bVar3 = this.f6093v;
        z zVar = bVar3.f6276z;
        if (zVar == null) {
            z zVar2 = (z) bVar3.f6272v.inflate(bVar3.f6274x, (ViewGroup) this, false);
            bVar3.f6276z = zVar2;
            zVar2.b(bVar3.f6271u);
            bVar3.e(true);
        }
        z zVar3 = bVar3.f6276z;
        if (zVar != zVar3) {
            ((ActionMenuView) zVar3).setPresenter(bVar3);
        }
        ActionMenuView actionMenuView = (ActionMenuView) zVar3;
        this.f6092u = actionMenuView;
        actionMenuView.setBackground(null);
        addView(this.f6092u, layoutParams);
    }

    public final void d() {
        if (this.f6083F == null) {
            LayoutInflater.from(getContext()).inflate(R.layout.abc_action_bar_title_item, this);
            LinearLayout linearLayout = (LinearLayout) getChildAt(getChildCount() - 1);
            this.f6083F = linearLayout;
            this.f6084G = (TextView) linearLayout.findViewById(R.id.action_bar_title);
            this.f6085H = (TextView) this.f6083F.findViewById(R.id.action_bar_subtitle);
            int i10 = this.f6086I;
            if (i10 != 0) {
                this.f6084G.setTextAppearance(getContext(), i10);
            }
            int i11 = this.f6087J;
            if (i11 != 0) {
                this.f6085H.setTextAppearance(getContext(), i11);
            }
        }
        this.f6084G.setText(this.f6078A);
        this.f6085H.setText(this.f6079B);
        boolean zIsEmpty = TextUtils.isEmpty(this.f6078A);
        boolean zIsEmpty2 = TextUtils.isEmpty(this.f6079B);
        this.f6085H.setVisibility(!zIsEmpty2 ? 0 : 8);
        this.f6083F.setVisibility((zIsEmpty && zIsEmpty2) ? 8 : 0);
        if (this.f6083F.getParent() == null) {
            addView(this.f6083F);
        }
    }

    public final void e() {
        removeAllViews();
        this.f6082E = null;
        this.f6092u = null;
        this.f6093v = null;
        View view = this.f6081D;
        if (view != null) {
            view.setOnClickListener(null);
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-1, -2);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    public int getAnimatedVisibility() {
        return this.f6095x != null ? this.f6090s.f7323b : getVisibility();
    }

    public int getContentHeight() {
        return this.f6094w;
    }

    public CharSequence getSubtitle() {
        return this.f6079B;
    }

    public CharSequence getTitle() {
        return this.f6078A;
    }

    @Override // android.view.View
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public final void setVisibility(int i10) {
        if (i10 != getVisibility()) {
            C0417d0 c0417d0 = this.f6095x;
            if (c0417d0 != null) {
                c0417d0.b();
            }
            super.setVisibility(i10);
        }
    }

    public final C0417d0 i(int i10, long j) {
        C0417d0 c0417d0 = this.f6095x;
        if (c0417d0 != null) {
            c0417d0.b();
        }
        p019b9.c cVar = this.f6090s;
        if (i10 != 0) {
            C0417d0 c0417d0A = U.a(this);
            c0417d0A.a(0.0f);
            c0417d0A.c(j);
            ((ActionBarContextView) cVar.f7324c).f6095x = c0417d0A;
            cVar.f7323b = i10;
            c0417d0A.d(cVar);
            return c0417d0A;
        }
        if (getVisibility() != 0) {
            setAlpha(0.0f);
        }
        C0417d0 c0417d0A2 = U.a(this);
        c0417d0A2.a(1.0f);
        c0417d0A2.c(j);
        ((ActionBarContextView) cVar.f7324c).f6095x = c0417d0A2;
        cVar.f7323b = i10;
        c0417d0A2.d(cVar);
        return c0417d0A2;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        int i10;
        super.onConfigurationChanged(configuration);
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(null, p069h.a.a, R.attr.actionBarStyle, 0);
        setContentHeight(typedArrayObtainStyledAttributes.getLayoutDimension(13, 0));
        typedArrayObtainStyledAttributes.recycle();
        b bVar = this.f6093v;
        if (bVar != null) {
            Configuration configuration2 = bVar.f6270t.getResources().getConfiguration();
            int i11 = configuration2.screenWidthDp;
            int i12 = configuration2.screenHeightDp;
            if (configuration2.smallestScreenWidthDp > 600 || i11 > 600 || ((i11 > 960 && i12 > 720) || (i11 > 720 && i12 > 960))) {
                i10 = 5;
            } else if (i11 >= 500 || ((i11 > 640 && i12 > 480) || (i11 > 480 && i12 > 640))) {
                i10 = 4;
            } else {
                i10 = i11 >= 360 ? 3 : 2;
            }
            bVar.f6261I = i10;
            p136o.l lVar = bVar.f6271u;
            if (lVar != null) {
                lVar.p(true);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        b bVar = this.f6093v;
        if (bVar != null) {
            bVar.b();
            C0703g c0703g = this.f6093v.f6265M;
            if (c0703g == null || !c0703g.b()) {
                return;
            }
            c0703g.f13564i.dismiss();
        }
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f6097z = false;
        }
        if (!this.f6097z) {
            boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !zOnHoverEvent) {
                this.f6097z = true;
            }
        }
        if (actionMasked != 10 && actionMasked != 3) {
            return true;
        }
        this.f6097z = false;
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z6, int i10, int i11, int i12, int i13) {
        boolean z10 = f1.a;
        boolean z11 = getLayoutDirection() == 1;
        int paddingRight = z11 ? (i12 - i10) - getPaddingRight() : getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingTop2 = ((i13 - i11) - getPaddingTop()) - getPaddingBottom();
        View view = this.f6080C;
        if (view != null && view.getVisibility() != 8) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f6080C.getLayoutParams();
            int i14 = z11 ? marginLayoutParams.rightMargin : marginLayoutParams.leftMargin;
            int i15 = z11 ? marginLayoutParams.leftMargin : marginLayoutParams.rightMargin;
            int i16 = z11 ? paddingRight - i14 : paddingRight + i14;
            int iG = g(i16, paddingTop, paddingTop2, this.f6080C, z11) + i16;
            paddingRight = z11 ? iG - i15 : iG + i15;
        }
        LinearLayout linearLayout = this.f6083F;
        if (linearLayout != null && this.f6082E == null && linearLayout.getVisibility() != 8) {
            paddingRight += g(paddingRight, paddingTop, paddingTop2, this.f6083F, z11);
        }
        View view2 = this.f6082E;
        if (view2 != null) {
            g(paddingRight, paddingTop, paddingTop2, view2, z11);
        }
        int paddingLeft = z11 ? getPaddingLeft() : (i12 - i10) - getPaddingRight();
        ActionMenuView actionMenuView = this.f6092u;
        if (actionMenuView != null) {
            g(paddingLeft, paddingTop, paddingTop2, actionMenuView, !z11);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        if (View.MeasureSpec.getMode(i10) != 1073741824) {
            throw new IllegalStateException(getClass().getSimpleName().concat(" can only be used with android:layout_width=\"match_parent\" (or fill_parent)"));
        }
        if (View.MeasureSpec.getMode(i11) == 0) {
            throw new IllegalStateException(getClass().getSimpleName().concat(" can only be used with android:layout_height=\"wrap_content\""));
        }
        int size = View.MeasureSpec.getSize(i10);
        int size2 = this.f6094w;
        if (size2 <= 0) {
            size2 = View.MeasureSpec.getSize(i11);
        }
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        int iMin = size2 - paddingBottom;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iMin, Integer.MIN_VALUE);
        View view = this.f6080C;
        if (view != null) {
            int iF = f(view, paddingLeft, iMakeMeasureSpec);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f6080C.getLayoutParams();
            paddingLeft = iF - (marginLayoutParams.leftMargin + marginLayoutParams.rightMargin);
        }
        ActionMenuView actionMenuView = this.f6092u;
        if (actionMenuView != null && actionMenuView.getParent() == this) {
            paddingLeft = f(this.f6092u, paddingLeft, iMakeMeasureSpec);
        }
        LinearLayout linearLayout = this.f6083F;
        if (linearLayout != null && this.f6082E == null) {
            if (this.f6088K) {
                this.f6083F.measure(View.MeasureSpec.makeMeasureSpec(0, 0), iMakeMeasureSpec);
                int measuredWidth = this.f6083F.getMeasuredWidth();
                boolean z6 = measuredWidth <= paddingLeft;
                if (z6) {
                    paddingLeft -= measuredWidth;
                }
                this.f6083F.setVisibility(z6 ? 0 : 8);
            } else {
                paddingLeft = f(linearLayout, paddingLeft, iMakeMeasureSpec);
            }
        }
        View view2 = this.f6082E;
        if (view2 != null) {
            ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
            int i12 = layoutParams.width;
            int i13 = i12 != -2 ? 1073741824 : Integer.MIN_VALUE;
            if (i12 >= 0) {
                paddingLeft = Math.min(i12, paddingLeft);
            }
            int i14 = layoutParams.height;
            int i15 = i14 == -2 ? Integer.MIN_VALUE : 1073741824;
            if (i14 >= 0) {
                iMin = Math.min(i14, iMin);
            }
            this.f6082E.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, i13), View.MeasureSpec.makeMeasureSpec(iMin, i15));
        }
        if (this.f6094w > 0) {
            setMeasuredDimension(size, size2);
            return;
        }
        int childCount = getChildCount();
        int i16 = 0;
        for (int i17 = 0; i17 < childCount; i17++) {
            int measuredHeight = getChildAt(i17).getMeasuredHeight() + paddingBottom;
            if (measuredHeight > i16) {
                i16 = measuredHeight;
            }
        }
        setMeasuredDimension(size, i16);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f6096y = false;
        }
        if (!this.f6096y) {
            boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !zOnTouchEvent) {
                this.f6096y = true;
            }
        }
        if (actionMasked != 1 && actionMasked != 3) {
            return true;
        }
        this.f6096y = false;
        return true;
    }

    public void setContentHeight(int i10) {
        this.f6094w = i10;
    }

    public void setCustomView(View view) {
        LinearLayout linearLayout;
        View view2 = this.f6082E;
        if (view2 != null) {
            removeView(view2);
        }
        this.f6082E = view;
        if (view != null && (linearLayout = this.f6083F) != null) {
            removeView(linearLayout);
            this.f6083F = null;
        }
        if (view != null) {
            addView(view);
        }
        requestLayout();
    }

    public void setSubtitle(CharSequence charSequence) {
        this.f6079B = charSequence;
        d();
    }

    public void setTitle(CharSequence charSequence) {
        this.f6078A = charSequence;
        d();
        U.o(this, charSequence);
    }

    public void setTitleOptional(boolean z6) {
        if (z6 != this.f6088K) {
            requestLayout();
        }
        this.f6088K = z6;
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }
}
