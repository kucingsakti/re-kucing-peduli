package com.google.android.material.internal;

import C0.w;
import K.i;
import K.o;
import U.U;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.CheckedTextView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.bumptech.glide.e;
import java.util.WeakHashMap;
import p.C0729t0;
import p091j3.AbstractC0669d;
import p136o.n;
import p136o.y;

/* JADX INFO: loaded from: classes.dex */
public class NavigationMenuItemView extends AbstractC0669d implements y {

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public static final int[] f9738b0 = {R.attr.state_checked};

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public int f9739N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public boolean f9740O;
    public boolean P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public boolean f9741Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public final CheckedTextView f9742R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public FrameLayout f9743S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public n f9744T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public ColorStateList f9745U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public boolean f9746V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public Drawable f9747W;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final w f9748a0;

    public NavigationMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f9741Q = true;
        w wVar = new w(this, 6);
        this.f9748a0 = wVar;
        setOrientation(0);
        LayoutInflater.from(context).inflate(com.kcstream.cing.R.layout.design_navigation_menu_item, (ViewGroup) this, true);
        setIconSize(context.getResources().getDimensionPixelSize(com.kcstream.cing.R.dimen.design_navigation_icon_size));
        CheckedTextView checkedTextView = (CheckedTextView) findViewById(com.kcstream.cing.R.id.design_menu_item_text);
        this.f9742R = checkedTextView;
        checkedTextView.setDuplicateParentStateEnabled(true);
        U.n(checkedTextView, wVar);
    }

    private void setActionView(View view) {
        if (view != null) {
            if (this.f9743S == null) {
                this.f9743S = (FrameLayout) ((ViewStub) findViewById(com.kcstream.cing.R.id.design_menu_item_action_area_stub)).inflate();
            }
            if (view.getParent() != null) {
                ((ViewGroup) view.getParent()).removeView(view);
            }
            this.f9743S.removeAllViews();
            this.f9743S.addView(view);
        }
    }

    @Override // p136o.y
    public final void a(n nVar) {
        StateListDrawable stateListDrawable;
        this.f9744T = nVar;
        int i10 = nVar.f13538s;
        if (i10 > 0) {
            setId(i10);
        }
        setVisibility(nVar.isVisible() ? 0 : 8);
        if (getBackground() == null) {
            TypedValue typedValue = new TypedValue();
            if (getContext().getTheme().resolveAttribute(com.kcstream.cing.R.attr.colorControlHighlight, typedValue, true)) {
                stateListDrawable = new StateListDrawable();
                stateListDrawable.addState(f9738b0, new ColorDrawable(typedValue.data));
                stateListDrawable.addState(ViewGroup.EMPTY_STATE_SET, new ColorDrawable(0));
            } else {
                stateListDrawable = null;
            }
            WeakHashMap weakHashMap = U.a;
            setBackground(stateListDrawable);
        }
        setCheckable(nVar.isCheckable());
        setChecked(nVar.isChecked());
        setEnabled(nVar.isEnabled());
        setTitle(nVar.f13542w);
        setIcon(nVar.getIcon());
        setActionView(nVar.getActionView());
        setContentDescription(nVar.f13526I);
        e.r(this, nVar.f13527J);
        n nVar2 = this.f9744T;
        CharSequence charSequence = nVar2.f13542w;
        CheckedTextView checkedTextView = this.f9742R;
        if (charSequence == null && nVar2.getIcon() == null && this.f9744T.getActionView() != null) {
            checkedTextView.setVisibility(8);
            FrameLayout frameLayout = this.f9743S;
            if (frameLayout != null) {
                C0729t0 c0729t0 = (C0729t0) frameLayout.getLayoutParams();
                ((LinearLayout.LayoutParams) c0729t0).width = -1;
                this.f9743S.setLayoutParams(c0729t0);
                return;
            }
            return;
        }
        checkedTextView.setVisibility(0);
        FrameLayout frameLayout2 = this.f9743S;
        if (frameLayout2 != null) {
            C0729t0 c0729t1 = (C0729t0) frameLayout2.getLayoutParams();
            ((LinearLayout.LayoutParams) c0729t1).width = -2;
            this.f9743S.setLayoutParams(c0729t1);
        }
    }

    @Override // p136o.y
    public n getItemData() {
        return this.f9744T;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final int[] onCreateDrawableState(int i10) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i10 + 1);
        n nVar = this.f9744T;
        if (nVar != null && nVar.isCheckable() && this.f9744T.isChecked()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f9738b0);
        }
        return iArrOnCreateDrawableState;
    }

    public void setCheckable(boolean z6) {
        refreshDrawableState();
        if (this.P != z6) {
            this.P = z6;
            this.f9748a0.h(this.f9742R, 2048);
        }
    }

    public void setChecked(boolean z6) {
        refreshDrawableState();
        CheckedTextView checkedTextView = this.f9742R;
        checkedTextView.setChecked(z6);
        checkedTextView.setTypeface(checkedTextView.getTypeface(), (z6 && this.f9741Q) ? 1 : 0);
    }

    public void setHorizontalPadding(int i10) {
        setPadding(i10, getPaddingTop(), i10, getPaddingBottom());
    }

    public void setIcon(Drawable drawable) {
        if (drawable != null) {
            if (this.f9746V) {
                Drawable.ConstantState constantState = drawable.getConstantState();
                if (constantState != null) {
                    drawable = constantState.newDrawable();
                }
                drawable = drawable.mutate();
                M.a.h(drawable, this.f9745U);
            }
            int i10 = this.f9739N;
            drawable.setBounds(0, 0, i10, i10);
        } else if (this.f9740O) {
            if (this.f9747W == null) {
                Resources resources = getResources();
                Resources.Theme theme = getContext().getTheme();
                ThreadLocal threadLocal = o.a;
                Drawable drawableA = i.a(resources, com.kcstream.cing.R.drawable.navigation_empty_icon, theme);
                this.f9747W = drawableA;
                if (drawableA != null) {
                    int i11 = this.f9739N;
                    drawableA.setBounds(0, 0, i11, i11);
                }
            }
            drawable = this.f9747W;
        }
        this.f9742R.setCompoundDrawablesRelative(drawable, null, null, null);
    }

    public void setIconPadding(int i10) {
        this.f9742R.setCompoundDrawablePadding(i10);
    }

    public void setIconSize(int i10) {
        this.f9739N = i10;
    }

    public void setIconTintList(ColorStateList colorStateList) {
        this.f9745U = colorStateList;
        this.f9746V = colorStateList != null;
        n nVar = this.f9744T;
        if (nVar != null) {
            setIcon(nVar.getIcon());
        }
    }

    public void setMaxLines(int i10) {
        this.f9742R.setMaxLines(i10);
    }

    public void setNeedsEmptyIcon(boolean z6) {
        this.f9740O = z6;
    }

    public void setTextAppearance(int i10) {
        this.f9742R.setTextAppearance(i10);
    }

    public void setTextColor(ColorStateList colorStateList) {
        this.f9742R.setTextColor(colorStateList);
    }

    public void setTitle(CharSequence charSequence) {
        this.f9742R.setText(charSequence);
    }
}
