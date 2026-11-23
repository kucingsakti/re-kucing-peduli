package androidx.viewpager2.widget;

import A1.RunnableC0094c;
import U.U;
import V.h;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.datastore.preferences.protobuf.AbstractC0487g;
import androidx.fragment.app.Fragment$SavedState;
import androidx.lifecycle.C0511f;
import androidx.recyclerview.widget.s;
import androidx.recyclerview.widget.u;
import androidx.recyclerview.widget.w;
import java.util.ArrayList;
import java.util.WeakHashMap;
import p013b1.b;
import p022c1.c;
import p022c1.d;
import p022c1.e;
import p022c1.f;
import p022c1.g;
import p022c1.j;
import p022c1.k;
import p022c1.l;
import p156q0.M;

/* JADX INFO: loaded from: classes.dex */
public final class ViewPager2 extends ViewGroup {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public Parcelable f7184A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final l f7185B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final k f7186C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final d f7187D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final b f7188E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public final h f7189F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public final p022c1.b f7190G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public u f7191H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public boolean f7192I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public boolean f7193J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public int f7194K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public final o1.h f7195L;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Rect f7196s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Rect f7197t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final b f7198u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f7199v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f7200w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final e f7201x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final p022c1.h f7202y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f7203z;

    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public int f7204s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f7205t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public Parcelable f7206u;

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f7204s = parcel.readInt();
            this.f7205t = parcel.readInt();
            this.f7206u = parcel.readParcelable(classLoader);
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeInt(this.f7204s);
            parcel.writeInt(this.f7205t);
            parcel.writeParcelable(this.f7206u, i10);
        }
    }

    public ViewPager2(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f7196s = new Rect();
        this.f7197t = new Rect();
        b bVar = new b();
        this.f7198u = bVar;
        int i10 = 0;
        this.f7200w = false;
        this.f7201x = new e(this, i10);
        this.f7203z = -1;
        this.f7191H = null;
        this.f7192I = false;
        int i11 = 1;
        this.f7193J = true;
        this.f7194K = -1;
        this.f7195L = new o1.h(this);
        l lVar = new l(this, context);
        this.f7185B = lVar;
        WeakHashMap weakHashMap = U.a;
        lVar.setId(View.generateViewId());
        this.f7185B.setDescendantFocusability(131072);
        p022c1.h hVar = new p022c1.h(this);
        this.f7202y = hVar;
        this.f7185B.setLayoutManager(hVar);
        this.f7185B.setScrollingTouchSlop(1);
        int[] iArr = p001a1.a.a;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr);
        U.m(this, context, iArr, attributeSet, typedArrayObtainStyledAttributes, 0);
        try {
            setOrientation(typedArrayObtainStyledAttributes.getInt(0, 0));
            typedArrayObtainStyledAttributes.recycle();
            this.f7185B.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
            l lVar2 = this.f7185B;
            g gVar = new g();
            if (lVar2.f6955U == null) {
                lVar2.f6955U = new ArrayList();
            }
            lVar2.f6955U.add(gVar);
            d dVar = new d(this);
            this.f7187D = dVar;
            this.f7189F = new h(dVar, 7);
            k kVar = new k(this);
            this.f7186C = kVar;
            kVar.a(this.f7185B);
            this.f7185B.j(this.f7187D);
            b bVar2 = new b();
            this.f7188E = bVar2;
            this.f7187D.a = bVar2;
            f fVar = new f(this, i10);
            f fVar2 = new f(this, i11);
            ((ArrayList) bVar2.f7244b).add(fVar);
            ((ArrayList) this.f7188E.f7244b).add(fVar2);
            o1.h hVar2 = this.f7195L;
            l lVar3 = this.f7185B;
            hVar2.getClass();
            lVar3.setImportantForAccessibility(2);
            hVar2.f13634u = new e(hVar2, i11);
            ViewPager2 viewPager2 = (ViewPager2) hVar2.f13635v;
            if (viewPager2.getImportantForAccessibility() == 0) {
                viewPager2.setImportantForAccessibility(1);
            }
            ((ArrayList) this.f7188E.f7244b).add(bVar);
            p022c1.b bVar3 = new p022c1.b();
            this.f7190G = bVar3;
            ((ArrayList) this.f7188E.f7244b).add(bVar3);
            l lVar4 = this.f7185B;
            attachViewToParent(lVar4, 0, lVar4.getLayoutParams());
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a() {
        s adapter;
        androidx.fragment.app.b bVarG;
        if (this.f7203z == -1 || (adapter = getAdapter()) == 0) {
            return;
        }
        Parcelable parcelable = this.f7184A;
        if (parcelable != null) {
            if (adapter instanceof p013b1.g) {
                p013b1.e eVar = (p013b1.e) ((p013b1.g) adapter);
                p212w.g gVar = eVar.f7254g;
                if (gVar.l() == 0) {
                    p212w.g gVar2 = eVar.f7253f;
                    if (gVar2.l() == 0) {
                        Bundle bundle = (Bundle) parcelable;
                        if (bundle.getClassLoader() == null) {
                            bundle.setClassLoader(eVar.getClass().getClassLoader());
                        }
                        for (String str : bundle.keySet()) {
                            if (str.startsWith("f#") && str.length() > 2) {
                                long j = Long.parseLong(str.substring(2));
                                M m2 = eVar.f7252e;
                                m2.getClass();
                                String string = bundle.getString(str);
                                if (string == null) {
                                    bVarG = null;
                                } else {
                                    bVarG = m2.f6677c.g(string);
                                    if (bVarG == null) {
                                        m2.f0(new IllegalStateException("Fragment no longer exists for key " + str + ": unique id " + string));
                                        throw null;
                                    }
                                }
                                gVar2.j(j, bVarG);
                            } else {
                                if (!str.startsWith("s#") || str.length() <= 2) {
                                    throw new IllegalArgumentException("Unexpected key in savedState: ".concat(str));
                                }
                                long j10 = Long.parseLong(str.substring(2));
                                Fragment$SavedState fragment$SavedState = (Fragment$SavedState) bundle.getParcelable(str);
                                if (eVar.n(j10)) {
                                    gVar.j(j10, fragment$SavedState);
                                }
                            }
                        }
                        if (gVar2.l() != 0) {
                            eVar.f7258l = true;
                            eVar.f7257k = true;
                            eVar.o();
                            Handler handler = new Handler(Looper.getMainLooper());
                            RunnableC0094c runnableC0094c = new RunnableC0094c(eVar, 19);
                            eVar.f7251d.a(new C0511f(handler, 4, runnableC0094c));
                            handler.postDelayed(runnableC0094c, 10000L);
                        }
                    }
                }
                throw new IllegalStateException("Expected the adapter to be 'fresh' while restoring state.");
            }
            this.f7184A = null;
        }
        int iMax = Math.max(0, Math.min(this.f7203z, adapter.a() - 1));
        this.f7199v = iMax;
        this.f7203z = -1;
        this.f7185B.g0(iMax);
        this.f7195L.v();
    }

    public final void b(int i10) {
        w wVar;
        s adapter = getAdapter();
        if (adapter == null) {
            if (this.f7203z != -1) {
                this.f7203z = Math.max(i10, 0);
                return;
            }
            return;
        }
        if (adapter.a() <= 0) {
            return;
        }
        int iMin = Math.min(Math.max(i10, 0), adapter.a() - 1);
        int i11 = this.f7199v;
        if ((iMin == i11 && this.f7187D.f7421f == 0) || iMin == i11) {
            return;
        }
        double d3 = i11;
        this.f7199v = iMin;
        this.f7195L.v();
        d dVar = this.f7187D;
        if (dVar.f7421f != 0) {
            dVar.f();
            c cVar = dVar.f7422g;
            d3 = ((double) cVar.a) + ((double) cVar.f7415b);
        }
        d dVar2 = this.f7187D;
        dVar2.getClass();
        dVar2.f7420e = 2;
        boolean z6 = dVar2.f7424i != iMin;
        dVar2.f7424i = iMin;
        dVar2.d(2);
        if (z6) {
            dVar2.c(iMin);
        }
        double d8 = iMin;
        if (Math.abs(d8 - d3) > 3.0d) {
            this.f7185B.g0(d8 > d3 ? iMin - 3 : iMin + 3);
            l lVar = this.f7185B;
            lVar.post(new R.a(iMin, lVar));
        } else {
            l lVar2 = this.f7185B;
            if (lVar2.P || (wVar = lVar2.f6928F) == null) {
                return;
            }
            wVar.G0(lVar2, iMin);
        }
    }

    public final void c() {
        k kVar = this.f7186C;
        if (kVar == null) {
            throw new IllegalStateException("Design assumption violated.");
        }
        View viewG = kVar.g(this.f7202y);
        if (viewG == null) {
            return;
        }
        this.f7202y.getClass();
        int iM = w.M(viewG);
        if (iM != this.f7199v && getScrollState() == 0) {
            this.f7188E.c(iM);
        }
        this.f7200w = false;
    }

    @Override // android.view.View
    public final boolean canScrollHorizontally(int i10) {
        return this.f7185B.canScrollHorizontally(i10);
    }

    @Override // android.view.View
    public final boolean canScrollVertically(int i10) {
        return this.f7185B.canScrollVertically(i10);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchRestoreInstanceState(SparseArray sparseArray) {
        Parcelable parcelable = (Parcelable) sparseArray.get(getId());
        if (parcelable instanceof SavedState) {
            int i10 = ((SavedState) parcelable).f7204s;
            sparseArray.put(this.f7185B.getId(), (Parcelable) sparseArray.get(i10));
            sparseArray.remove(i10);
        }
        super.dispatchRestoreInstanceState(sparseArray);
        a();
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        this.f7195L.getClass();
        this.f7195L.getClass();
        return "androidx.viewpager.widget.ViewPager";
    }

    public s getAdapter() {
        return this.f7185B.getAdapter();
    }

    public int getCurrentItem() {
        return this.f7199v;
    }

    public int getItemDecorationCount() {
        return this.f7185B.getItemDecorationCount();
    }

    public int getOffscreenPageLimit() {
        return this.f7194K;
    }

    public int getOrientation() {
        return this.f7202y.f6897q == 1 ? 1 : 0;
    }

    public int getPageSize() {
        int height;
        int paddingBottom;
        l lVar = this.f7185B;
        if (getOrientation() == 0) {
            height = lVar.getWidth() - lVar.getPaddingLeft();
            paddingBottom = lVar.getPaddingRight();
        } else {
            height = lVar.getHeight() - lVar.getPaddingTop();
            paddingBottom = lVar.getPaddingBottom();
        }
        return height - paddingBottom;
    }

    public int getScrollState() {
        return this.f7187D.f7421f;
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        int iA;
        int iA2;
        int iA3;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        ViewPager2 viewPager2 = (ViewPager2) this.f7195L.f13635v;
        if (viewPager2.getAdapter() == null) {
            iA = 0;
            iA2 = 0;
        } else if (viewPager2.getOrientation() == 1) {
            iA = viewPager2.getAdapter().a();
            iA2 = 1;
        } else {
            iA2 = viewPager2.getAdapter().a();
            iA = 1;
        }
        accessibilityNodeInfo.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo) h.a(iA, iA2, 0).f5078t);
        s adapter = viewPager2.getAdapter();
        if (adapter == null || (iA3 = adapter.a()) == 0 || !viewPager2.f7193J) {
            return;
        }
        if (viewPager2.f7199v > 0) {
            accessibilityNodeInfo.addAction(8192);
        }
        if (viewPager2.f7199v < iA3 - 1) {
            accessibilityNodeInfo.addAction(4096);
        }
        accessibilityNodeInfo.setScrollable(true);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z6, int i10, int i11, int i12, int i13) {
        int measuredWidth = this.f7185B.getMeasuredWidth();
        int measuredHeight = this.f7185B.getMeasuredHeight();
        int paddingLeft = getPaddingLeft();
        Rect rect = this.f7196s;
        rect.left = paddingLeft;
        rect.right = (i12 - i10) - getPaddingRight();
        rect.top = getPaddingTop();
        rect.bottom = (i13 - i11) - getPaddingBottom();
        Rect rect2 = this.f7197t;
        Gravity.apply(8388659, measuredWidth, measuredHeight, rect, rect2);
        this.f7185B.layout(rect2.left, rect2.top, rect2.right, rect2.bottom);
        if (this.f7200w) {
            c();
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        measureChild(this.f7185B, i10, i11);
        int measuredWidth = this.f7185B.getMeasuredWidth();
        int measuredHeight = this.f7185B.getMeasuredHeight();
        int measuredState = this.f7185B.getMeasuredState();
        int paddingRight = getPaddingRight() + getPaddingLeft() + measuredWidth;
        int paddingBottom = getPaddingBottom() + getPaddingTop() + measuredHeight;
        setMeasuredDimension(View.resolveSizeAndState(Math.max(paddingRight, getSuggestedMinimumWidth()), i10, measuredState), View.resolveSizeAndState(Math.max(paddingBottom, getSuggestedMinimumHeight()), i11, measuredState << 16));
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.f7203z = savedState.f7205t;
        this.f7184A = savedState.f7206u;
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f7204s = this.f7185B.getId();
        int i10 = this.f7203z;
        if (i10 == -1) {
            i10 = this.f7199v;
        }
        savedState.f7205t = i10;
        Parcelable parcelable = this.f7184A;
        if (parcelable != null) {
            savedState.f7206u = parcelable;
            return savedState;
        }
        Object adapter = this.f7185B.getAdapter();
        if (adapter instanceof p013b1.g) {
            p013b1.e eVar = (p013b1.e) ((p013b1.g) adapter);
            eVar.getClass();
            p212w.g gVar = eVar.f7253f;
            int iL = gVar.l();
            p212w.g gVar2 = eVar.f7254g;
            Bundle bundle = new Bundle(gVar2.l() + iL);
            for (int i11 = 0; i11 < gVar.l(); i11++) {
                long jI = gVar.i(i11);
                androidx.fragment.app.b bVar = (androidx.fragment.app.b) gVar.e(jI);
                if (bVar != null && bVar.v()) {
                    String str = "f#" + jI;
                    M m2 = eVar.f7252e;
                    m2.getClass();
                    if (bVar.f6622N != m2) {
                        m2.f0(new IllegalStateException(AbstractC0487g.i("Fragment ", bVar, " is not currently in the FragmentManager")));
                        throw null;
                    }
                    bundle.putString(str, bVar.f6655x);
                }
            }
            for (int i12 = 0; i12 < gVar2.l(); i12++) {
                long jI2 = gVar2.i(i12);
                if (eVar.n(jI2)) {
                    bundle.putParcelable("s#" + jI2, (Parcelable) gVar2.e(jI2));
                }
            }
            savedState.f7206u = bundle;
        }
        return savedState;
    }

    @Override // android.view.ViewGroup
    public final void onViewAdded(View view) {
        throw new IllegalStateException("ViewPager2 does not support direct child views");
    }

    @Override // android.view.View
    public final boolean performAccessibilityAction(int i10, Bundle bundle) {
        this.f7195L.getClass();
        if (i10 != 8192 && i10 != 4096) {
            return super.performAccessibilityAction(i10, bundle);
        }
        o1.h hVar = this.f7195L;
        hVar.getClass();
        if (i10 != 8192 && i10 != 4096) {
            throw new IllegalStateException();
        }
        ViewPager2 viewPager2 = (ViewPager2) hVar.f13635v;
        int currentItem = i10 == 8192 ? viewPager2.getCurrentItem() - 1 : viewPager2.getCurrentItem() + 1;
        if (viewPager2.f7193J) {
            viewPager2.b(currentItem);
        }
        return true;
    }

    public void setAdapter(s sVar) {
        s adapter = this.f7185B.getAdapter();
        o1.h hVar = this.f7195L;
        if (adapter != null) {
            adapter.a.unregisterObserver((e) hVar.f13634u);
        } else {
            hVar.getClass();
        }
        e eVar = this.f7201x;
        if (adapter != null) {
            adapter.a.unregisterObserver(eVar);
        }
        this.f7185B.setAdapter(sVar);
        this.f7199v = 0;
        a();
        o1.h hVar2 = this.f7195L;
        hVar2.v();
        if (sVar != null) {
            sVar.a.registerObserver((e) hVar2.f13634u);
        }
        if (sVar != null) {
            sVar.a.registerObserver(eVar);
        }
    }

    public void setCurrentItem(int i10) {
        Object obj = this.f7189F.f5078t;
        b(i10);
    }

    @Override // android.view.View
    public void setLayoutDirection(int i10) {
        super.setLayoutDirection(i10);
        this.f7195L.v();
    }

    public void setOffscreenPageLimit(int i10) {
        if (i10 < 1 && i10 != -1) {
            throw new IllegalArgumentException("Offscreen page limit must be OFFSCREEN_PAGE_LIMIT_DEFAULT or a number > 0");
        }
        this.f7194K = i10;
        this.f7185B.requestLayout();
    }

    public void setOrientation(int i10) {
        this.f7202y.j1(i10);
        this.f7195L.v();
    }

    public void setPageTransformer(j jVar) {
        if (jVar != null) {
            if (!this.f7192I) {
                this.f7191H = this.f7185B.getItemAnimator();
                this.f7192I = true;
            }
            this.f7185B.setItemAnimator(null);
        } else if (this.f7192I) {
            this.f7185B.setItemAnimator(this.f7191H);
            this.f7191H = null;
            this.f7192I = false;
        }
        this.f7190G.getClass();
        if (jVar == null) {
            return;
        }
        this.f7190G.getClass();
        this.f7190G.getClass();
    }

    public void setUserInputEnabled(boolean z6) {
        this.f7193J = z6;
        this.f7195L.v();
    }
}
