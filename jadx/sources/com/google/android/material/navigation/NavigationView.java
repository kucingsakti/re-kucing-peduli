package com.google.android.material.navigation;

import C8.E;
import J.f;
import U.C0415c0;
import U.H;
import U.U;
import U.h0;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Pair;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.customview.view.AbsSavedState;
import androidx.drawerlayout.widget.DrawerLayout;
import com.google.android.material.internal.NavigationMenuView;
import java.util.ArrayList;
import java.util.WeakHashMap;
import p091j3.C;
import p091j3.p;
import p091j3.t;
import p091j3.v;
import p109l3.h;
import p118m3.j;
import p118m3.k;
import p118m3.l;
import p125n.g;
import p136o.n;
import p170r3.w;
import p170r3.x;

/* JADX INFO: loaded from: classes.dex */
public class NavigationView extends v implements p109l3.b {
    public static final int[] P = {R.attr.state_checked};

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public static final int[] f9753Q = {-16842910};

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final t f9754A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public l f9755B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final int f9756C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final int[] f9757D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public g f9758E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public final k f9759F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public boolean f9760G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public boolean f9761H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public int f9762I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public final boolean f9763J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public final int f9764K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public final p170r3.v f9765L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public final h f9766M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public final Y1.c f9767N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public final j f9768O;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final p091j3.g f9769z;

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new e();

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public Bundle f9770u;

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f9770u = parcel.readBundle(classLoader);
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeBundle(this.f9770u);
        }
    }

    /* JADX WARN: Code duplicated, block: B:62:0x01c4 A[PHI: r14
      0x01c4: PHI (r14v3 android.graphics.drawable.Drawable) = 
      (r14v2 android.graphics.drawable.Drawable)
      (r14v6 android.graphics.drawable.Drawable)
      (r14v2 android.graphics.drawable.Drawable)
     binds: [B:54:0x0186, B:60:0x01ac, B:58:0x0196] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v30 */
    /* JADX WARN: Type inference failed for: r6v31, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r6v42 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public NavigationView(Context context, AttributeSet attributeSet) {
        int i10;
        boolean z6;
        boolean z10;
        boolean z11;
        Context contextA = p225x3.a.a(context, attributeSet, com.kcstream.cing.R.attr.navigationViewStyle, com.kcstream.cing.R.style.Widget_Design_NavigationView);
        super(contextA, attributeSet, com.kcstream.cing.R.attr.navigationViewStyle);
        this.f12478u = new Rect();
        this.f12479v = true;
        this.f12480w = true;
        this.f12481x = true;
        this.f12482y = true;
        int[] iArr = Q2.a.f3999J;
        C.a(contextA, attributeSet, com.kcstream.cing.R.attr.navigationViewStyle, com.kcstream.cing.R.style.Widget_Design_ScrimInsetsFrameLayout);
        C.b(contextA, attributeSet, iArr, com.kcstream.cing.R.attr.navigationViewStyle, com.kcstream.cing.R.style.Widget_Design_ScrimInsetsFrameLayout, new int[0]);
        TypedArray typedArrayObtainStyledAttributes = contextA.obtainStyledAttributes(attributeSet, iArr, com.kcstream.cing.R.attr.navigationViewStyle, com.kcstream.cing.R.style.Widget_Design_ScrimInsetsFrameLayout);
        this.f12476s = typedArrayObtainStyledAttributes.getDrawable(0);
        typedArrayObtainStyledAttributes.recycle();
        setWillNotDraw(true);
        V.h hVar = new V.h(this, 28);
        WeakHashMap weakHashMap = U.a;
        H.u(this, hVar);
        t tVar = new t();
        this.f9754A = tVar;
        this.f9757D = new int[2];
        this.f9760G = true;
        this.f9761H = true;
        this.f9762I = 0;
        this.f9765L = Build.VERSION.SDK_INT >= 33 ? new x(this) : new w(this);
        this.f9766M = new h(this);
        this.f9767N = new Y1.c(this, this);
        this.f9768O = new j(this);
        Context context2 = getContext();
        p091j3.g gVar = new p091j3.g(context2);
        this.f9769z = gVar;
        Y1.c cVarJ = C.j(context2, attributeSet, Q2.a.f3997H, com.kcstream.cing.R.attr.navigationViewStyle, com.kcstream.cing.R.style.Widget_Design_NavigationView, new int[0]);
        TypedArray typedArray = (TypedArray) cVarJ.f5671u;
        if (typedArray.hasValue(1)) {
            setBackground(cVarJ.v(1));
        }
        int dimensionPixelSize = typedArray.getDimensionPixelSize(7, 0);
        this.f9762I = dimensionPixelSize;
        this.f9763J = dimensionPixelSize == 0;
        this.f9764K = getResources().getDimensionPixelSize(com.kcstream.cing.R.dimen.m3_navigation_drawer_layout_corner_size);
        Drawable background = getBackground();
        ColorStateList colorStateListI = p086i8.C.i(background);
        if (background == null || colorStateListI != null) {
            p170r3.g gVar2 = new p170r3.g(p170r3.j.c(context2, attributeSet, com.kcstream.cing.R.attr.navigationViewStyle, com.kcstream.cing.R.style.Widget_Design_NavigationView).a());
            if (colorStateListI != null) {
                gVar2.l(colorStateListI);
            }
            gVar2.j(context2);
            setBackground(gVar2);
        }
        if (typedArray.hasValue(8)) {
            setElevation(typedArray.getDimensionPixelSize(8, 0));
        }
        setFitsSystemWindows(typedArray.getBoolean(2, false));
        this.f9756C = typedArray.getDimensionPixelSize(3, 0);
        ColorStateList colorStateListU = typedArray.hasValue(31) ? cVarJ.u(31) : null;
        int resourceId = typedArray.hasValue(34) ? typedArray.getResourceId(34, 0) : 0;
        if (resourceId == 0 && colorStateListU == null) {
            colorStateListU = e(R.attr.textColorSecondary);
        }
        ColorStateList colorStateListU2 = typedArray.hasValue(14) ? cVarJ.u(14) : e(R.attr.textColorSecondary);
        int resourceId2 = typedArray.hasValue(24) ? typedArray.getResourceId(24, 0) : 0;
        boolean z12 = typedArray.getBoolean(25, true);
        if (typedArray.hasValue(13)) {
            setItemIconSize(typedArray.getDimensionPixelSize(13, 0));
        }
        ColorStateList colorStateListU3 = typedArray.hasValue(26) ? cVarJ.u(26) : null;
        if (resourceId2 == 0 && colorStateListU3 == null) {
            colorStateListU3 = e(R.attr.textColorPrimary);
        }
        Drawable drawableV = cVarJ.v(10);
        if (drawableV == null && (typedArray.hasValue(17) || typedArray.hasValue(18))) {
            drawableV = f(cVarJ, E.m(getContext(), cVarJ, 19));
            ColorStateList colorStateListM = E.m(context2, cVarJ, 16);
            if (colorStateListM != null) {
                tVar.f12453F = new RippleDrawable(p149p3.a.c(colorStateListM), null, f(cVarJ, null));
                i10 = 0;
                tVar.e(false);
            } else {
                i10 = 0;
            }
        } else {
            i10 = 0;
        }
        if (typedArray.hasValue(11)) {
            setItemHorizontalPadding(typedArray.getDimensionPixelSize(11, i10));
        }
        if (typedArray.hasValue(27)) {
            setItemVerticalPadding(typedArray.getDimensionPixelSize(27, i10));
        }
        setDividerInsetStart(typedArray.getDimensionPixelSize(6, i10));
        setDividerInsetEnd(typedArray.getDimensionPixelSize(5, i10));
        setSubheaderInsetStart(typedArray.getDimensionPixelSize(33, i10));
        setSubheaderInsetEnd(typedArray.getDimensionPixelSize(32, i10));
        setTopInsetScrimEnabled(typedArray.getBoolean(35, this.f9760G));
        setBottomInsetScrimEnabled(typedArray.getBoolean(4, this.f9761H));
        int dimensionPixelSize2 = typedArray.getDimensionPixelSize(12, 0);
        setItemMaxLines(typedArray.getInt(15, 1));
        gVar.f13511w = new p081i3.b(this, 6);
        tVar.f12471v = 1;
        tVar.i(context2, gVar);
        if (resourceId != 0) {
            tVar.f12474y = resourceId;
            z6 = false;
            tVar.e(false);
        } else {
            z6 = false;
        }
        tVar.f12475z = colorStateListU;
        tVar.e(z6);
        tVar.f12451D = colorStateListU2;
        tVar.e(z6);
        int overScrollMode = getOverScrollMode();
        tVar.f12466T = overScrollMode;
        NavigationMenuView navigationMenuView = tVar.f12468s;
        if (navigationMenuView != null) {
            navigationMenuView.setOverScrollMode(overScrollMode);
        }
        if (resourceId2 != 0) {
            tVar.f12448A = resourceId2;
            z10 = false;
            tVar.e(false);
        } else {
            z10 = false;
        }
        tVar.f12449B = z12;
        tVar.e(z10);
        tVar.f12450C = colorStateListU3;
        tVar.e(z10);
        tVar.f12452E = drawableV;
        tVar.e(z10);
        tVar.f12456I = dimensionPixelSize2;
        tVar.e(z10);
        gVar.b(tVar, gVar.f13507s);
        if (tVar.f12468s == null) {
            NavigationMenuView navigationMenuView2 = (NavigationMenuView) tVar.f12473x.inflate(com.kcstream.cing.R.layout.design_navigation_menu, this, z10);
            tVar.f12468s = navigationMenuView2;
            navigationMenuView2.setAccessibilityDelegateCompat(new p(tVar, tVar.f12468s));
            if (tVar.f12472w == null) {
                p091j3.k kVar = new p091j3.k(tVar);
                tVar.f12472w = kVar;
                kVar.l(true);
            }
            int i11 = tVar.f12466T;
            if (i11 != -1) {
                tVar.f12468s.setOverScrollMode(i11);
            }
            LinearLayout linearLayout = (LinearLayout) tVar.f12473x.inflate(com.kcstream.cing.R.layout.design_navigation_item_header, (ViewGroup) tVar.f12468s, false);
            tVar.f12469t = linearLayout;
            linearLayout.setImportantForAccessibility(2);
            tVar.f12468s.setAdapter(tVar.f12472w);
        }
        addView(tVar.f12468s);
        ?? r10 = 0;
        if (typedArray.hasValue(28)) {
            int resourceId3 = typedArray.getResourceId(28, 0);
            p091j3.k kVar2 = tVar.f12472w;
            if (kVar2 != null) {
                kVar2.f12443f = true;
            }
            getMenuInflater().inflate(resourceId3, gVar);
            p091j3.k kVar3 = tVar.f12472w;
            if (kVar3 != null) {
                z11 = false;
                kVar3.f12443f = false;
            } else {
                z11 = false;
            }
            tVar.e(z11);
            r10 = z11;
        }
        if (typedArray.hasValue(9)) {
            tVar.f12469t.addView(tVar.f12473x.inflate(typedArray.getResourceId(9, r10), tVar.f12469t, (boolean) r10));
            NavigationMenuView navigationMenuView3 = tVar.f12468s;
            navigationMenuView3.setPadding(r10, r10, r10, navigationMenuView3.getPaddingBottom());
        }
        cVarJ.J();
        this.f9759F = new k(this, r10);
        getViewTreeObserver().addOnGlobalLayoutListener(this.f9759F);
    }

    private MenuInflater getMenuInflater() {
        if (this.f9758E == null) {
            this.f9758E = new g(getContext());
        }
        return this.f9758E;
    }

    @Override // p109l3.b
    public final void a(p031d.b bVar) {
        int i10 = ((p088j0.d) h().second).a;
        h hVar = this.f9766M;
        if (hVar.f12918f == null) {
            Log.w("MaterialBackHelper", "Must call startBackProgress() before updateBackProgress()");
        }
        p031d.b bVar2 = hVar.f12918f;
        hVar.f12918f = bVar;
        float f10 = bVar.f10433c;
        if (bVar2 != null) {
            hVar.c(f10, bVar.f10434d == 0, i10);
        }
        if (this.f9763J) {
            this.f9762I = R2.a.c(0, hVar.a.getInterpolation(f10), this.f9764K);
            g(getWidth(), getHeight());
        }
    }

    @Override // p109l3.b
    public final void b() {
        Pair pairH = h();
        DrawerLayout drawerLayout = (DrawerLayout) pairH.first;
        h hVar = this.f9766M;
        p031d.b bVar = hVar.f12918f;
        hVar.f12918f = null;
        if (bVar == null || Build.VERSION.SDK_INT < 34) {
            drawerLayout.c(this, true);
            return;
        }
        int i10 = ((p088j0.d) pairH.second).a;
        int i11 = p118m3.a.a;
        hVar.b(bVar, i10, new h0(drawerLayout, this, 3), new C0415c0(drawerLayout, 2));
    }

    @Override // p109l3.b
    public final void c(p031d.b bVar) {
        h();
        this.f9766M.f12918f = bVar;
    }

    @Override // p109l3.b
    public final void d() {
        h();
        this.f9766M.a();
        if (!this.f9763J || this.f9762I == 0) {
            return;
        }
        this.f9762I = 0;
        g(getWidth(), getHeight());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        p170r3.v vVar = this.f9765L;
        if (vVar.b()) {
            Path path = vVar.f14555e;
            if (!path.isEmpty()) {
                canvas.save();
                canvas.clipPath(path);
                super.dispatchDraw(canvas);
                canvas.restore();
                return;
            }
        }
        super.dispatchDraw(canvas);
    }

    public final ColorStateList e(int i10) {
        TypedValue typedValue = new TypedValue();
        if (!getContext().getTheme().resolveAttribute(i10, typedValue, true)) {
            return null;
        }
        ColorStateList colorStateListC = f.c(getContext(), typedValue.resourceId);
        if (!getContext().getTheme().resolveAttribute(com.kcstream.cing.R.attr.colorPrimary, typedValue, true)) {
            return null;
        }
        int i11 = typedValue.data;
        int defaultColor = colorStateListC.getDefaultColor();
        int[] iArr = f9753Q;
        return new ColorStateList(new int[][]{iArr, P, FrameLayout.EMPTY_STATE_SET}, new int[]{colorStateListC.getColorForState(iArr, defaultColor), i11, defaultColor});
    }

    public final InsetDrawable f(Y1.c cVar, ColorStateList colorStateList) {
        TypedArray typedArray = (TypedArray) cVar.f5671u;
        p170r3.g gVar = new p170r3.g(p170r3.j.a(getContext(), typedArray.getResourceId(17, 0), typedArray.getResourceId(18, 0)).a());
        gVar.l(colorStateList);
        return new InsetDrawable((Drawable) gVar, typedArray.getDimensionPixelSize(22, 0), typedArray.getDimensionPixelSize(23, 0), typedArray.getDimensionPixelSize(21, 0), typedArray.getDimensionPixelSize(20, 0));
    }

    public final void g(int i10, int i11) {
        if ((getParent() instanceof DrawerLayout) && (getLayoutParams() instanceof p088j0.d)) {
            if ((this.f9762I > 0 || this.f9763J) && (getBackground() instanceof p170r3.g)) {
                int i12 = ((p088j0.d) getLayoutParams()).a;
                WeakHashMap weakHashMap = U.a;
                boolean z6 = Gravity.getAbsoluteGravity(i12, getLayoutDirection()) == 3;
                p170r3.g gVar = (p170r3.g) getBackground();
                I4.b bVarF = gVar.f14501s.a.f();
                bVarF.c(this.f9762I);
                if (z6) {
                    bVarF.f2072e = new p170r3.a(0.0f);
                    bVarF.f2075h = new p170r3.a(0.0f);
                } else {
                    bVarF.f2073f = new p170r3.a(0.0f);
                    bVarF.f2074g = new p170r3.a(0.0f);
                }
                p170r3.j jVarA = bVarF.a();
                gVar.setShapeAppearanceModel(jVarA);
                p170r3.v vVar = this.f9765L;
                vVar.f14553c = jVarA;
                vVar.c();
                vVar.a(this);
                vVar.f14554d = new RectF(0.0f, 0.0f, i10, i11);
                vVar.c();
                vVar.a(this);
                vVar.f14552b = true;
                vVar.a(this);
            }
        }
    }

    public h getBackHelper() {
        return this.f9766M;
    }

    public MenuItem getCheckedItem() {
        return this.f9754A.f12472w.f12442e;
    }

    public int getDividerInsetEnd() {
        return this.f9754A.f12459L;
    }

    public int getDividerInsetStart() {
        return this.f9754A.f12458K;
    }

    public int getHeaderCount() {
        return this.f9754A.f12469t.getChildCount();
    }

    public Drawable getItemBackground() {
        return this.f9754A.f12452E;
    }

    public int getItemHorizontalPadding() {
        return this.f9754A.f12454G;
    }

    public int getItemIconPadding() {
        return this.f9754A.f12456I;
    }

    public ColorStateList getItemIconTintList() {
        return this.f9754A.f12451D;
    }

    public int getItemMaxLines() {
        return this.f9754A.f12463Q;
    }

    public ColorStateList getItemTextColor() {
        return this.f9754A.f12450C;
    }

    public int getItemVerticalPadding() {
        return this.f9754A.f12455H;
    }

    public Menu getMenu() {
        return this.f9769z;
    }

    public int getSubheaderInsetEnd() {
        return this.f9754A.f12461N;
    }

    public int getSubheaderInsetStart() {
        return this.f9754A.f12460M;
    }

    public final Pair h() {
        ViewParent parent = getParent();
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if ((parent instanceof DrawerLayout) && (layoutParams instanceof p088j0.d)) {
            return new Pair((DrawerLayout) parent, (p088j0.d) layoutParams);
        }
        throw new IllegalStateException("NavigationView back progress requires the direct parent view to be a DrawerLayout.");
    }

    @Override // p091j3.v, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        p109l3.c cVar;
        super.onAttachedToWindow();
        D3.b.F(this);
        ViewParent parent = getParent();
        if (parent instanceof DrawerLayout) {
            Y1.c cVar2 = this.f9767N;
            if (((p109l3.c) cVar2.f5670t) != null) {
                DrawerLayout drawerLayout = (DrawerLayout) parent;
                j jVar = this.f9768O;
                if (jVar == null) {
                    drawerLayout.getClass();
                } else {
                    ArrayList arrayList = drawerLayout.f6540L;
                    if (arrayList != null) {
                        arrayList.remove(jVar);
                    }
                }
                drawerLayout.a(jVar);
                if (!DrawerLayout.o(this) || (cVar = (p109l3.c) cVar2.f5670t) == null) {
                    return;
                }
                cVar.b((p109l3.b) cVar2.f5671u, (View) cVar2.f5672v, true);
            }
        }
    }

    @Override // p091j3.v, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getViewTreeObserver().removeOnGlobalLayoutListener(this.f9759F);
        ViewParent parent = getParent();
        if (parent instanceof DrawerLayout) {
            DrawerLayout drawerLayout = (DrawerLayout) parent;
            j jVar = this.f9768O;
            if (jVar == null) {
                drawerLayout.getClass();
                return;
            }
            ArrayList arrayList = drawerLayout.f6540L;
            if (arrayList == null) {
                return;
            }
            arrayList.remove(jVar);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        int mode = View.MeasureSpec.getMode(i10);
        int i12 = this.f9756C;
        if (mode == Integer.MIN_VALUE) {
            i10 = View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i10), i12), 1073741824);
        } else if (mode == 0) {
            i10 = View.MeasureSpec.makeMeasureSpec(i12, 1073741824);
        }
        super.onMeasure(i10, i11);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.f6382s);
        this.f9769z.t(savedState.f9770u);
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        Bundle bundle = new Bundle();
        savedState.f9770u = bundle;
        this.f9769z.v(bundle);
        return savedState;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        g(i10, i11);
    }

    public void setBottomInsetScrimEnabled(boolean z6) {
        this.f9761H = z6;
    }

    public void setCheckedItem(int i10) {
        MenuItem menuItemFindItem = this.f9769z.findItem(i10);
        if (menuItemFindItem != null) {
            this.f9754A.f12472w.n((n) menuItemFindItem);
        }
    }

    public void setDividerInsetEnd(int i10) {
        t tVar = this.f9754A;
        tVar.f12459L = i10;
        tVar.e(false);
    }

    public void setDividerInsetStart(int i10) {
        t tVar = this.f9754A;
        tVar.f12458K = i10;
        tVar.e(false);
    }

    @Override // android.view.View
    public void setElevation(float f10) {
        super.setElevation(f10);
        D3.b.C(this, f10);
    }

    public void setForceCompatClippingEnabled(boolean z6) {
        p170r3.v vVar = this.f9765L;
        if (z6 != vVar.a) {
            vVar.a = z6;
            vVar.a(this);
        }
    }

    public void setItemBackground(Drawable drawable) {
        t tVar = this.f9754A;
        tVar.f12452E = drawable;
        tVar.e(false);
    }

    public void setItemBackgroundResource(int i10) {
        setItemBackground(J.a.b(getContext(), i10));
    }

    public void setItemHorizontalPadding(int i10) {
        t tVar = this.f9754A;
        tVar.f12454G = i10;
        tVar.e(false);
    }

    public void setItemHorizontalPaddingResource(int i10) {
        int dimensionPixelSize = getResources().getDimensionPixelSize(i10);
        t tVar = this.f9754A;
        tVar.f12454G = dimensionPixelSize;
        tVar.e(false);
    }

    public void setItemIconPadding(int i10) {
        t tVar = this.f9754A;
        tVar.f12456I = i10;
        tVar.e(false);
    }

    public void setItemIconPaddingResource(int i10) {
        int dimensionPixelSize = getResources().getDimensionPixelSize(i10);
        t tVar = this.f9754A;
        tVar.f12456I = dimensionPixelSize;
        tVar.e(false);
    }

    public void setItemIconSize(int i10) {
        t tVar = this.f9754A;
        if (tVar.f12457J != i10) {
            tVar.f12457J = i10;
            tVar.f12462O = true;
            tVar.e(false);
        }
    }

    public void setItemIconTintList(ColorStateList colorStateList) {
        t tVar = this.f9754A;
        tVar.f12451D = colorStateList;
        tVar.e(false);
    }

    public void setItemMaxLines(int i10) {
        t tVar = this.f9754A;
        tVar.f12463Q = i10;
        tVar.e(false);
    }

    public void setItemTextAppearance(int i10) {
        t tVar = this.f9754A;
        tVar.f12448A = i10;
        tVar.e(false);
    }

    public void setItemTextAppearanceActiveBoldEnabled(boolean z6) {
        t tVar = this.f9754A;
        tVar.f12449B = z6;
        tVar.e(false);
    }

    public void setItemTextColor(ColorStateList colorStateList) {
        t tVar = this.f9754A;
        tVar.f12450C = colorStateList;
        tVar.e(false);
    }

    public void setItemVerticalPadding(int i10) {
        t tVar = this.f9754A;
        tVar.f12455H = i10;
        tVar.e(false);
    }

    public void setItemVerticalPaddingResource(int i10) {
        int dimensionPixelSize = getResources().getDimensionPixelSize(i10);
        t tVar = this.f9754A;
        tVar.f12455H = dimensionPixelSize;
        tVar.e(false);
    }

    public void setNavigationItemSelectedListener(l lVar) {
        this.f9755B = lVar;
    }

    @Override // android.view.View
    public void setOverScrollMode(int i10) {
        super.setOverScrollMode(i10);
        t tVar = this.f9754A;
        if (tVar != null) {
            tVar.f12466T = i10;
            NavigationMenuView navigationMenuView = tVar.f12468s;
            if (navigationMenuView != null) {
                navigationMenuView.setOverScrollMode(i10);
            }
        }
    }

    public void setSubheaderInsetEnd(int i10) {
        t tVar = this.f9754A;
        tVar.f12461N = i10;
        tVar.e(false);
    }

    public void setSubheaderInsetStart(int i10) {
        t tVar = this.f9754A;
        tVar.f12460M = i10;
        tVar.e(false);
    }

    public void setTopInsetScrimEnabled(boolean z6) {
        this.f9760G = z6;
    }

    public void setCheckedItem(MenuItem menuItem) {
        MenuItem menuItemFindItem = this.f9769z.findItem(menuItem.getItemId());
        if (menuItemFindItem != null) {
            this.f9754A.f12472w.n((n) menuItemFindItem);
            return;
        }
        throw new IllegalArgumentException("Called setCheckedItem(MenuItem) with an item that is not in the current menu.");
    }
}
