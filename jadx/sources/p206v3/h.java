package p206v3;

import T2.a;
import U.AbstractC0436w;
import U.U;
import V.d;
import V.i;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.text.Layout;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bumptech.glide.e;
import com.google.android.material.tabs.TabLayout;
import java.util.WeakHashMap;
import p040e1.j;
import p068ga.l;
import p091j3.C;

/* JADX INFO: loaded from: classes.dex */
public final class h extends LinearLayout {

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public static final /* synthetic */ int f15434D = 0;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public Drawable f15435A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public int f15436B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final /* synthetic */ TabLayout f15437C;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public f f15438s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public TextView f15439t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public ImageView f15440u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public View f15441v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public a f15442w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public View f15443x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public TextView f15444y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public ImageView f15445z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(TabLayout tabLayout, Context context) {
        super(context);
        int i10 = 29;
        this.f15437C = tabLayout;
        this.f15436B = 2;
        e(context);
        int i11 = tabLayout.f9849w;
        WeakHashMap weakHashMap = U.a;
        setPaddingRelative(i11, tabLayout.f9850x, tabLayout.f9851y, tabLayout.f9852z);
        setGravity(17);
        setOrientation(!tabLayout.f9834U ? 1 : 0);
        setClickable(true);
        U.p(this, Build.VERSION.SDK_INT >= 24 ? new j(AbstractC0436w.b(getContext(), 1002), i10) : new j((Object) null, i10));
    }

    private a getBadge() {
        return this.f15442w;
    }

    private a getOrCreateBadge() {
        if (this.f15442w == null) {
            this.f15442w = new a(getContext(), null);
        }
        b();
        a aVar = this.f15442w;
        if (aVar != null) {
            return aVar;
        }
        throw new IllegalStateException("Unable to create badge");
    }

    public final void a() {
        if (this.f15442w != null) {
            setClipChildren(true);
            setClipToPadding(true);
            ViewGroup viewGroup = (ViewGroup) getParent();
            if (viewGroup != null) {
                viewGroup.setClipChildren(true);
                viewGroup.setClipToPadding(true);
            }
            View view = this.f15441v;
            if (view != null) {
                a aVar = this.f15442w;
                if (aVar != null) {
                    if (aVar.d() != null) {
                        aVar.d().setForeground(null);
                    } else {
                        view.getOverlay().remove(aVar);
                    }
                }
                this.f15441v = null;
            }
        }
    }

    public final void b() {
        if (this.f15442w != null) {
            if (this.f15443x != null) {
                a();
                return;
            }
            TextView textView = this.f15439t;
            if (textView == null || this.f15438s == null) {
                a();
                return;
            }
            if (this.f15441v == textView) {
                c(textView);
                return;
            }
            a();
            TextView textView2 = this.f15439t;
            if (this.f15442w == null || textView2 == null) {
                return;
            }
            setClipChildren(false);
            setClipToPadding(false);
            ViewGroup viewGroup = (ViewGroup) getParent();
            if (viewGroup != null) {
                viewGroup.setClipChildren(false);
                viewGroup.setClipToPadding(false);
            }
            a aVar = this.f15442w;
            Rect rect = new Rect();
            textView2.getDrawingRect(rect);
            aVar.setBounds(rect);
            aVar.i(textView2, null);
            if (aVar.d() != null) {
                aVar.d().setForeground(aVar);
            } else {
                textView2.getOverlay().add(aVar);
            }
            this.f15441v = textView2;
        }
    }

    public final void c(View view) {
        a aVar = this.f15442w;
        if (aVar == null || view != this.f15441v) {
            return;
        }
        Rect rect = new Rect();
        view.getDrawingRect(rect);
        aVar.setBounds(rect);
        aVar.i(view, null);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0020  */
    public final void d() {
        boolean z6;
        f();
        f fVar = this.f15438s;
        if (fVar == null) {
            z6 = false;
        } else {
            TabLayout tabLayout = fVar.f15431d;
            if (tabLayout == null) {
                throw new IllegalArgumentException("Tab not attached to a TabLayout");
            }
            int selectedTabPosition = tabLayout.getSelectedTabPosition();
            if (selectedTabPosition == -1 || selectedTabPosition != fVar.f15429b) {
                z6 = false;
            } else {
                z6 = true;
            }
        }
        setSelected(z6);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f15435A;
        if ((drawable == null || !drawable.isStateful()) ? false : this.f15435A.setState(drawableState)) {
            invalidate();
            this.f15437C.invalidate();
        }
    }

    public final void e(Context context) {
        GradientDrawable gradientDrawable;
        TabLayout tabLayout = this.f15437C;
        int i10 = tabLayout.f9825K;
        if (i10 != 0) {
            Drawable drawableG = l.g(context, i10);
            this.f15435A = drawableG;
            if (drawableG != null && drawableG.isStateful()) {
                this.f15435A.setState(getDrawableState());
            }
        } else {
            this.f15435A = null;
        }
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setColor(0);
        Drawable rippleDrawable = gradientDrawable2;
        if (tabLayout.f9820F != null) {
            GradientDrawable gradientDrawable3 = new GradientDrawable();
            gradientDrawable3.setCornerRadius(1.0E-5f);
            gradientDrawable3.setColor(-1);
            ColorStateList colorStateListA = p149p3.a.a(tabLayout.f9820F);
            boolean z6 = tabLayout.f9838b0;
            if (z6) {
                gradientDrawable = gradientDrawable2;
                gradientDrawable = null;
            }
            rippleDrawable = new RippleDrawable(colorStateListA, gradientDrawable, z6 ? null : gradientDrawable3);
        }
        WeakHashMap weakHashMap = U.a;
        setBackground(rippleDrawable);
        tabLayout.invalidate();
    }

    public final void f() {
        int i10;
        ViewParent parent;
        f fVar = this.f15438s;
        View view = fVar != null ? fVar.f15430c : null;
        if (view != null) {
            ViewParent parent2 = view.getParent();
            if (parent2 != this) {
                if (parent2 != null) {
                    ((ViewGroup) parent2).removeView(view);
                }
                View view2 = this.f15443x;
                if (view2 != null && (parent = view2.getParent()) != null) {
                    ((ViewGroup) parent).removeView(this.f15443x);
                }
                addView(view);
            }
            this.f15443x = view;
            TextView textView = this.f15439t;
            if (textView != null) {
                textView.setVisibility(8);
            }
            ImageView imageView = this.f15440u;
            if (imageView != null) {
                imageView.setVisibility(8);
                this.f15440u.setImageDrawable(null);
            }
            TextView textView2 = (TextView) view.findViewById(R.id.text1);
            this.f15444y = textView2;
            if (textView2 != null) {
                this.f15436B = textView2.getMaxLines();
            }
            this.f15445z = (ImageView) view.findViewById(R.id.icon);
        } else {
            View view3 = this.f15443x;
            if (view3 != null) {
                removeView(view3);
                this.f15443x = null;
            }
            this.f15444y = null;
            this.f15445z = null;
        }
        if (this.f15443x == null) {
            if (this.f15440u == null) {
                ImageView imageView2 = (ImageView) LayoutInflater.from(getContext()).inflate(com.kcstream.cing.R.layout.design_layout_tab_icon, (ViewGroup) this, false);
                this.f15440u = imageView2;
                addView(imageView2, 0);
            }
            if (this.f15439t == null) {
                TextView textView3 = (TextView) LayoutInflater.from(getContext()).inflate(com.kcstream.cing.R.layout.design_layout_tab_text, (ViewGroup) this, false);
                this.f15439t = textView3;
                addView(textView3);
                this.f15436B = this.f15439t.getMaxLines();
            }
            TextView textView4 = this.f15439t;
            TabLayout tabLayout = this.f15437C;
            textView4.setTextAppearance(tabLayout.f9815A);
            if (!isSelected() || (i10 = tabLayout.f9817C) == -1) {
                this.f15439t.setTextAppearance(tabLayout.f9816B);
            } else {
                this.f15439t.setTextAppearance(i10);
            }
            ColorStateList colorStateList = tabLayout.f9818D;
            if (colorStateList != null) {
                this.f15439t.setTextColor(colorStateList);
            }
            g(this.f15439t, this.f15440u, true);
            b();
            ImageView imageView3 = this.f15440u;
            if (imageView3 != null) {
                imageView3.addOnLayoutChangeListener(new g(this, imageView3));
            }
            TextView textView5 = this.f15439t;
            if (textView5 != null) {
                textView5.addOnLayoutChangeListener(new g(this, textView5));
            }
        } else {
            TextView textView6 = this.f15444y;
            if (textView6 != null || this.f15445z != null) {
                g(textView6, this.f15445z, false);
            }
        }
        if (fVar == null || TextUtils.isEmpty(null)) {
            return;
        }
        setContentDescription(null);
    }

    public final void g(TextView textView, ImageView imageView, boolean z6) {
        boolean z10;
        f fVar = this.f15438s;
        CharSequence charSequence = fVar != null ? fVar.a : null;
        if (imageView != null) {
            imageView.setVisibility(8);
            imageView.setImageDrawable(null);
        }
        boolean zIsEmpty = TextUtils.isEmpty(charSequence);
        if (textView != null) {
            if (zIsEmpty) {
                z10 = false;
            } else {
                this.f15438s.getClass();
                z10 = true;
            }
            textView.setText(!zIsEmpty ? charSequence : null);
            textView.setVisibility(z10 ? 0 : 8);
            if (!zIsEmpty) {
                setVisibility(0);
            }
        } else {
            z10 = false;
        }
        if (z6 && imageView != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) imageView.getLayoutParams();
            int iE = (z10 && imageView.getVisibility() == 0) ? (int) C.e(getContext(), 8) : 0;
            if (this.f15437C.f9834U) {
                if (iE != marginLayoutParams.getMarginEnd()) {
                    marginLayoutParams.setMarginEnd(iE);
                    marginLayoutParams.bottomMargin = 0;
                    imageView.setLayoutParams(marginLayoutParams);
                    imageView.requestLayout();
                }
            } else if (iE != marginLayoutParams.bottomMargin) {
                marginLayoutParams.bottomMargin = iE;
                marginLayoutParams.setMarginEnd(0);
                imageView.setLayoutParams(marginLayoutParams);
                imageView.requestLayout();
            }
        }
        if (Build.VERSION.SDK_INT > 23) {
            e.r(this, zIsEmpty ? null : charSequence);
        }
    }

    public int getContentHeight() {
        View[] viewArr = {this.f15439t, this.f15440u, this.f15443x};
        int iMax = 0;
        int iMin = 0;
        boolean z6 = false;
        for (int i10 = 0; i10 < 3; i10++) {
            View view = viewArr[i10];
            if (view != null && view.getVisibility() == 0) {
                iMin = z6 ? Math.min(iMin, view.getTop()) : view.getTop();
                iMax = z6 ? Math.max(iMax, view.getBottom()) : view.getBottom();
                z6 = true;
            }
        }
        return iMax - iMin;
    }

    public int getContentWidth() {
        View[] viewArr = {this.f15439t, this.f15440u, this.f15443x};
        int iMax = 0;
        int iMin = 0;
        boolean z6 = false;
        for (int i10 = 0; i10 < 3; i10++) {
            View view = viewArr[i10];
            if (view != null && view.getVisibility() == 0) {
                iMin = z6 ? Math.min(iMin, view.getLeft()) : view.getLeft();
                iMax = z6 ? Math.max(iMax, view.getRight()) : view.getRight();
                z6 = true;
            }
        }
        return iMax - iMin;
    }

    public f getTab() {
        return this.f15438s;
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        a aVar = this.f15442w;
        if (aVar != null && aVar.isVisible()) {
            accessibilityNodeInfo.setContentDescription(this.f15442w.c());
        }
        accessibilityNodeInfo.setCollectionItemInfo(i.a(0, 1, this.f15438s.f15429b, 1, false, isSelected()).a);
        if (isSelected()) {
            accessibilityNodeInfo.setClickable(false);
            accessibilityNodeInfo.removeAction((AccessibilityNodeInfo.AccessibilityAction) d.f5067g.a);
        }
        accessibilityNodeInfo.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", getResources().getString(com.kcstream.cing.R.string.item_view_role_description));
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        int mode = View.MeasureSpec.getMode(i10);
        TabLayout tabLayout = this.f15437C;
        int tabMaxWidth = tabLayout.getTabMaxWidth();
        if (tabMaxWidth > 0 && (mode == 0 || size > tabMaxWidth)) {
            i10 = View.MeasureSpec.makeMeasureSpec(tabLayout.f9826L, Integer.MIN_VALUE);
        }
        super.onMeasure(i10, i11);
        if (this.f15439t != null) {
            float f10 = tabLayout.f9823I;
            int i12 = this.f15436B;
            ImageView imageView = this.f15440u;
            if (imageView == null || imageView.getVisibility() != 0) {
                TextView textView = this.f15439t;
                if (textView != null && textView.getLineCount() > 1) {
                    f10 = tabLayout.f9824J;
                }
            } else {
                i12 = 1;
            }
            float textSize = this.f15439t.getTextSize();
            int lineCount = this.f15439t.getLineCount();
            int maxLines = this.f15439t.getMaxLines();
            if (f10 != textSize || (maxLines >= 0 && i12 != maxLines)) {
                if (tabLayout.f9833T == 1 && f10 > textSize && lineCount == 1) {
                    Layout layout = this.f15439t.getLayout();
                    if (layout == null) {
                        return;
                    }
                    if ((f10 / layout.getPaint().getTextSize()) * layout.getLineWidth(0) > (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight()) {
                        return;
                    }
                }
                this.f15439t.setTextSize(0, f10);
                this.f15439t.setMaxLines(i12);
                super.onMeasure(i10, i11);
            }
        }
    }

    @Override // android.view.View
    public final boolean performClick() {
        boolean zPerformClick = super.performClick();
        if (this.f15438s == null) {
            return zPerformClick;
        }
        if (!zPerformClick) {
            playSoundEffect(0);
        }
        f fVar = this.f15438s;
        TabLayout tabLayout = fVar.f15431d;
        if (tabLayout == null) {
            throw new IllegalArgumentException("Tab not attached to a TabLayout");
        }
        tabLayout.j(fVar, true);
        return true;
    }

    @Override // android.view.View
    public void setSelected(boolean z6) {
        isSelected();
        super.setSelected(z6);
        TextView textView = this.f15439t;
        if (textView != null) {
            textView.setSelected(z6);
        }
        ImageView imageView = this.f15440u;
        if (imageView != null) {
            imageView.setSelected(z6);
        }
        View view = this.f15443x;
        if (view != null) {
            view.setSelected(z6);
        }
    }

    public void setTab(f fVar) {
        if (fVar != this.f15438s) {
            this.f15438s = fVar;
            d();
        }
    }
}
