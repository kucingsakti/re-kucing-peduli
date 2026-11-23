package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.util.SparseBooleanArray;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.menu.ActionMenuItemView;
import com.kcstream.cing.R;
import java.util.ArrayList;
import p.C0703g;
import p.C0705h;
import p.C0709j;
import p.C0713l;
import p.RunnableC0707i;
import p102k7.e;
import p136o.D;
import p136o.l;
import p136o.n;
import p136o.o;
import p136o.t;
import p136o.w;
import p136o.x;
import p136o.y;
import p136o.z;

/* JADX INFO: loaded from: classes.dex */
public final class b implements x {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public int f6253A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public C0709j f6254B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public Drawable f6255C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public boolean f6256D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public boolean f6257E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public boolean f6258F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public int f6259G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public int f6260H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public int f6261I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public boolean f6262J;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public C0703g f6264L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public C0703g f6265M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public RunnableC0707i f6266N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public C0705h f6267O;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public int f6268Q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Context f6269s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public Context f6270t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public l f6271u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final LayoutInflater f6272v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public w f6273w;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public z f6276z;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final int f6274x = R.layout.abc_action_menu_layout;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final int f6275y = R.layout.abc_action_menu_item_layout;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public final SparseBooleanArray f6263K = new SparseBooleanArray();
    public final e P = new e(this);

    public b(Context context) {
        this.f6269s = context;
        this.f6272v = LayoutInflater.from(context);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final View a(n nVar, View view, ViewGroup viewGroup) {
        y yVar;
        View actionView = nVar.getActionView();
        if (actionView == null || nVar.e()) {
            if (view instanceof y) {
                yVar = (y) view;
            } else {
                yVar = (y) this.f6272v.inflate(this.f6275y, viewGroup, false);
            }
            yVar.a(nVar);
            ActionMenuItemView actionMenuItemView = (ActionMenuItemView) yVar;
            actionMenuItemView.setItemInvoker((ActionMenuView) this.f6276z);
            if (this.f6267O == null) {
                this.f6267O = new C0705h(this);
            }
            actionMenuItemView.setPopupCallback(this.f6267O);
            actionView = (View) yVar;
        }
        actionView.setVisibility(nVar.f13537U ? 8 : 0);
        ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        ((ActionMenuView) viewGroup).getClass();
        if (!(layoutParams instanceof C0713l)) {
            actionView.setLayoutParams(ActionMenuView.k(layoutParams));
        }
        return actionView;
    }

    public final boolean b() {
        Object obj;
        RunnableC0707i runnableC0707i = this.f6266N;
        if (runnableC0707i != null && (obj = this.f6276z) != null) {
            ((View) obj).removeCallbacks(runnableC0707i);
            this.f6266N = null;
            return true;
        }
        C0703g c0703g = this.f6264L;
        if (c0703g == null) {
            return false;
        }
        if (c0703g.b()) {
            c0703g.f13564i.dismiss();
        }
        return true;
    }

    @Override // p136o.x
    public final void c(l lVar, boolean z6) {
        b();
        C0703g c0703g = this.f6265M;
        if (c0703g != null && c0703g.b()) {
            c0703g.f13564i.dismiss();
        }
        w wVar = this.f6273w;
        if (wVar != null) {
            wVar.c(lVar, z6);
        }
    }

    @Override // p136o.x
    public final void d(Parcelable parcelable) {
        int i10;
        MenuItem menuItemFindItem;
        if ((parcelable instanceof ActionMenuPresenter$SavedState) && (i10 = ((ActionMenuPresenter$SavedState) parcelable).f6128s) > 0 && (menuItemFindItem = this.f6271u.findItem(i10)) != null) {
            l((D) menuItemFindItem.getSubMenu());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p136o.x
    public final void e(boolean z6) {
        int i10;
        ViewGroup viewGroup = (ViewGroup) this.f6276z;
        ArrayList arrayList = null;
        boolean z10 = false;
        if (viewGroup != null) {
            l lVar = this.f6271u;
            if (lVar != null) {
                lVar.i();
                ArrayList arrayListL = this.f6271u.l();
                int size = arrayListL.size();
                i10 = 0;
                for (int i11 = 0; i11 < size; i11++) {
                    n nVar = (n) arrayListL.get(i11);
                    if ((nVar.P & 32) == 32) {
                        View childAt = viewGroup.getChildAt(i10);
                        n itemData = childAt instanceof y ? ((y) childAt).getItemData() : null;
                        View viewA = a(nVar, childAt, viewGroup);
                        if (nVar != itemData) {
                            viewA.setPressed(false);
                            viewA.jumpDrawablesToCurrentState();
                        }
                        if (viewA != childAt) {
                            ViewGroup viewGroup2 = (ViewGroup) viewA.getParent();
                            if (viewGroup2 != null) {
                                viewGroup2.removeView(viewA);
                            }
                            ((ViewGroup) this.f6276z).addView(viewA, i10);
                        }
                        i10++;
                    }
                }
            } else {
                i10 = 0;
            }
            while (i10 < viewGroup.getChildCount()) {
                if (viewGroup.getChildAt(i10) == this.f6254B) {
                    i10++;
                } else {
                    viewGroup.removeViewAt(i10);
                }
            }
        }
        ((View) this.f6276z).requestLayout();
        l lVar2 = this.f6271u;
        if (lVar2 != null) {
            lVar2.i();
            ArrayList arrayList2 = lVar2.f13492A;
            int size2 = arrayList2.size();
            for (int i12 = 0; i12 < size2; i12++) {
                o oVar = ((n) arrayList2.get(i12)).f13535S;
            }
        }
        l lVar3 = this.f6271u;
        if (lVar3 != null) {
            lVar3.i();
            arrayList = lVar3.f13493B;
        }
        if (this.f6257E && arrayList != null) {
            int size3 = arrayList.size();
            if (size3 == 1) {
                z10 = !((n) arrayList.get(0)).f13537U;
            } else if (size3 > 0) {
                z10 = true;
            }
        }
        if (z10) {
            if (this.f6254B == null) {
                this.f6254B = new C0709j(this, this.f6269s);
            }
            ViewGroup viewGroup3 = (ViewGroup) this.f6254B.getParent();
            if (viewGroup3 != this.f6276z) {
                if (viewGroup3 != null) {
                    viewGroup3.removeView(this.f6254B);
                }
                ActionMenuView actionMenuView = (ActionMenuView) this.f6276z;
                C0709j c0709j = this.f6254B;
                actionMenuView.getClass();
                C0713l c0713lJ = ActionMenuView.j();
                c0713lJ.a = true;
                actionMenuView.addView(c0709j, c0713lJ);
            }
        } else {
            C0709j c0709j2 = this.f6254B;
            if (c0709j2 != null) {
                Object parent = c0709j2.getParent();
                Object obj = this.f6276z;
                if (parent == obj) {
                    ((ViewGroup) obj).removeView(this.f6254B);
                }
            }
        }
        ((ActionMenuView) this.f6276z).setOverflowReserved(this.f6257E);
    }

    public final boolean f() {
        C0703g c0703g = this.f6264L;
        return c0703g != null && c0703g.b();
    }

    @Override // p136o.x
    public final boolean g(n nVar) {
        return false;
    }

    @Override // p136o.x
    public final int getId() {
        return this.f6253A;
    }

    @Override // p136o.x
    public final void h(w wVar) {
        throw null;
    }

    @Override // p136o.x
    public final void i(Context context, l lVar) {
        this.f6270t = context;
        LayoutInflater.from(context);
        this.f6271u = lVar;
        Resources resources = context.getResources();
        if (!this.f6258F) {
            this.f6257E = true;
        }
        int i10 = 2;
        this.f6259G = context.getResources().getDisplayMetrics().widthPixels / 2;
        Configuration configuration = context.getResources().getConfiguration();
        int i11 = configuration.screenWidthDp;
        int i12 = configuration.screenHeightDp;
        if (configuration.smallestScreenWidthDp > 600 || i11 > 600 || ((i11 > 960 && i12 > 720) || (i11 > 720 && i12 > 960))) {
            i10 = 5;
        } else if (i11 >= 500 || ((i11 > 640 && i12 > 480) || (i11 > 480 && i12 > 640))) {
            i10 = 4;
        } else if (i11 >= 360) {
            i10 = 3;
        }
        this.f6261I = i10;
        int measuredWidth = this.f6259G;
        if (this.f6257E) {
            if (this.f6254B == null) {
                C0709j c0709j = new C0709j(this, this.f6269s);
                this.f6254B = c0709j;
                if (this.f6256D) {
                    c0709j.setImageDrawable(this.f6255C);
                    this.f6255C = null;
                    this.f6256D = false;
                }
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.f6254B.measure(iMakeMeasureSpec, iMakeMeasureSpec);
            }
            measuredWidth -= this.f6254B.getMeasuredWidth();
        } else {
            this.f6254B = null;
        }
        this.f6260H = measuredWidth;
        float f10 = resources.getDisplayMetrics().density;
    }

    @Override // p136o.x
    public final boolean j() {
        int size;
        ArrayList arrayListL;
        int i10;
        boolean z6;
        b bVar = this;
        l lVar = bVar.f6271u;
        if (lVar != null) {
            arrayListL = lVar.l();
            size = arrayListL.size();
        } else {
            size = 0;
            arrayListL = null;
        }
        int i11 = bVar.f6261I;
        int i12 = bVar.f6260H;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ViewGroup viewGroup = (ViewGroup) bVar.f6276z;
        int i13 = 0;
        boolean z10 = false;
        int i14 = 0;
        int i15 = 0;
        while (true) {
            i10 = 2;
            z6 = true;
            if (i13 >= size) {
                break;
            }
            n nVar = (n) arrayListL.get(i13);
            int i16 = nVar.f13533Q;
            if ((i16 & 2) == 2) {
                i14++;
            } else if ((i16 & 1) == 1) {
                i15++;
            } else {
                z10 = true;
            }
            if (bVar.f6262J && nVar.f13537U) {
                i11 = 0;
            }
            i13++;
        }
        if (bVar.f6257E && (z10 || i15 + i14 > i11)) {
            i11--;
        }
        int i17 = i11 - i14;
        SparseBooleanArray sparseBooleanArray = bVar.f6263K;
        sparseBooleanArray.clear();
        int i18 = 0;
        int i19 = 0;
        while (i18 < size) {
            n nVar2 = (n) arrayListL.get(i18);
            int i20 = nVar2.f13533Q;
            boolean z11 = (i20 & 2) == i10 ? z6 : false;
            int i21 = nVar2.f13539t;
            if (z11) {
                View viewA = bVar.a(nVar2, null, viewGroup);
                viewA.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                int measuredWidth = viewA.getMeasuredWidth();
                i12 -= measuredWidth;
                if (i19 == 0) {
                    i19 = measuredWidth;
                }
                if (i21 != 0) {
                    sparseBooleanArray.put(i21, z6);
                }
                nVar2.g(z6);
            } else {
                if ((i20 & 1) == z6) {
                    boolean z12 = sparseBooleanArray.get(i21);
                    boolean z13 = ((i17 > 0 || z12) && i12 > 0) ? z6 : false;
                    if (z13) {
                        View viewA2 = bVar.a(nVar2, null, viewGroup);
                        viewA2.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                        int measuredWidth2 = viewA2.getMeasuredWidth();
                        i12 -= measuredWidth2;
                        if (i19 == 0) {
                            i19 = measuredWidth2;
                        }
                        z13 &= i12 + i19 > 0;
                    }
                    if (z13 && i21 != 0) {
                        sparseBooleanArray.put(i21, true);
                    } else if (z12) {
                        sparseBooleanArray.put(i21, false);
                        for (int i22 = 0; i22 < i18; i22++) {
                            n nVar3 = (n) arrayListL.get(i22);
                            if (nVar3.f13539t == i21) {
                                if ((nVar3.P & 32) == 32) {
                                    i17++;
                                }
                                nVar3.g(false);
                            }
                        }
                    }
                    if (z13) {
                        i17--;
                    }
                    nVar2.g(z13);
                } else {
                    nVar2.g(false);
                }
                i18++;
                i10 = 2;
                bVar = this;
                z6 = true;
            }
            i18++;
            i10 = 2;
            bVar = this;
            z6 = true;
        }
        return z6;
    }

    @Override // p136o.x
    public final Parcelable k() {
        ActionMenuPresenter$SavedState actionMenuPresenter$SavedState = new ActionMenuPresenter$SavedState();
        actionMenuPresenter$SavedState.f6128s = this.f6268Q;
        return actionMenuPresenter$SavedState;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p136o.x
    public final boolean l(D d3) {
        boolean z6;
        if (d3.hasVisibleItems()) {
            D d8 = d3;
            while (true) {
                l lVar = d8.f13431R;
                if (lVar == this.f6271u) {
                    break;
                }
                d8 = (D) lVar;
            }
            ViewGroup viewGroup = (ViewGroup) this.f6276z;
            View view = null;
            view = null;
            if (viewGroup != null) {
                int childCount = viewGroup.getChildCount();
                for (int i10 = 0; i10 < childCount; i10++) {
                    View childAt = viewGroup.getChildAt(i10);
                    if ((childAt instanceof y) && ((y) childAt).getItemData() == d8.f13432S) {
                        view = childAt;
                        break;
                    }
                }
            }
            if (view != null) {
                this.f6268Q = d3.f13432S.f13538s;
                int size = d3.f13512x.size();
                int i11 = 0;
                while (true) {
                    if (i11 >= size) {
                        z6 = false;
                        break;
                    }
                    MenuItem item = d3.getItem(i11);
                    if (item.isVisible() && item.getIcon() != null) {
                        z6 = true;
                        break;
                    }
                    i11++;
                }
                C0703g c0703g = new C0703g(this, this.f6270t, d3, view);
                this.f6265M = c0703g;
                c0703g.f13562g = z6;
                t tVar = c0703g.f13564i;
                if (tVar != null) {
                    tVar.q(z6);
                }
                C0703g c0703g2 = this.f6265M;
                if (!c0703g2.b()) {
                    if (c0703g2.f13560e == null) {
                        throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
                    }
                    c0703g2.d(0, 0, false, false);
                }
                w wVar = this.f6273w;
                if (wVar != null) {
                    wVar.l(d3);
                }
                return true;
            }
        }
        return false;
    }

    @Override // p136o.x
    public final boolean m(n nVar) {
        return false;
    }

    public final boolean n() {
        l lVar;
        if (!this.f6257E || f() || (lVar = this.f6271u) == null || this.f6276z == null || this.f6266N != null) {
            return false;
        }
        lVar.i();
        if (lVar.f13493B.isEmpty()) {
            return false;
        }
        RunnableC0707i runnableC0707i = new RunnableC0707i(this, new C0703g(this, this.f6270t, this.f6271u, this.f6254B));
        this.f6266N = runnableC0707i;
        ((View) this.f6276z).post(runnableC0707i);
        return true;
    }
}
