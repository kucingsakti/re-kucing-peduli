package androidx.recyclerview.widget;

import J0.C0252b;
import U.U;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: androidx.recyclerview.widget.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0529b {
    public final q a;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public View f7055e;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f7054d = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C0252b f7052b = new C0252b();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f7053c = new ArrayList();

    public C0529b(q qVar) {
        this.a = qVar;
    }

    public final void a(View view, int i10, boolean z6) {
        RecyclerView recyclerView = this.a.a;
        int childCount = i10 < 0 ? recyclerView.getChildCount() : f(i10);
        this.f7052b.e(childCount, z6);
        if (z6) {
            i(view);
        }
        recyclerView.addView(view, childCount);
        RecyclerView.a aVarM = RecyclerView.M(view);
        s sVar = recyclerView.f6926E;
        if (sVar != null && aVarM != null) {
            sVar.i(aVarM);
        }
        ArrayList arrayList = recyclerView.f6955U;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((p022c1.g) recyclerView.f6955U.get(size)).getClass();
                x xVar = (x) view.getLayoutParams();
                if (((ViewGroup.MarginLayoutParams) xVar).width != -1 || ((ViewGroup.MarginLayoutParams) xVar).height != -1) {
                    throw new IllegalStateException("Pages must fill the whole ViewPager2 (use match_parent)");
                }
            }
        }
    }

    public final void b(View view, int i10, ViewGroup.LayoutParams layoutParams, boolean z6) {
        RecyclerView recyclerView = this.a.a;
        int childCount = i10 < 0 ? recyclerView.getChildCount() : f(i10);
        this.f7052b.e(childCount, z6);
        if (z6) {
            i(view);
        }
        RecyclerView.a aVarM = RecyclerView.M(view);
        if (aVarM != null) {
            if (!aVarM.l() && !aVarM.q()) {
                StringBuilder sb = new StringBuilder("Called attach on a child which is not detached: ");
                sb.append(aVarM);
                throw new IllegalArgumentException(E0.a.f(recyclerView, sb));
            }
            if (RecyclerView.f6911T0) {
                aVarM.toString();
            }
            aVarM.f6993B &= -257;
        } else if (RecyclerView.f6910S0) {
            StringBuilder sb2 = new StringBuilder("No ViewHolder found for child: ");
            sb2.append(view);
            sb2.append(", index: ");
            sb2.append(childCount);
            throw new IllegalArgumentException(E0.a.f(recyclerView, sb2));
        }
        recyclerView.attachViewToParent(view, childCount, layoutParams);
    }

    public final void c(int i10) {
        int iF = f(i10);
        this.f7052b.f(iF);
        RecyclerView recyclerView = this.a.a;
        View childAt = recyclerView.getChildAt(iF);
        if (childAt != null) {
            RecyclerView.a aVarM = RecyclerView.M(childAt);
            if (aVarM != null) {
                if (aVarM.l() && !aVarM.q()) {
                    StringBuilder sb = new StringBuilder("called detach on an already detached child ");
                    sb.append(aVarM);
                    throw new IllegalArgumentException(E0.a.f(recyclerView, sb));
                }
                if (RecyclerView.f6911T0) {
                    aVarM.toString();
                }
                aVarM.b(256);
            }
        } else if (RecyclerView.f6910S0) {
            StringBuilder sb2 = new StringBuilder("No view at offset ");
            sb2.append(iF);
            throw new IllegalArgumentException(E0.a.f(recyclerView, sb2));
        }
        recyclerView.detachViewFromParent(iF);
    }

    public final View d(int i10) {
        return this.a.a.getChildAt(f(i10));
    }

    public final int e() {
        return this.a.a.getChildCount() - this.f7053c.size();
    }

    public final int f(int i10) {
        if (i10 < 0) {
            return -1;
        }
        int childCount = this.a.a.getChildCount();
        int i11 = i10;
        while (i11 < childCount) {
            C0252b c0252b = this.f7052b;
            int iB = i10 - (i11 - c0252b.b(i11));
            if (iB == 0) {
                while (c0252b.d(i11)) {
                    i11++;
                }
                return i11;
            }
            i11 += iB;
        }
        return -1;
    }

    public final View g(int i10) {
        return this.a.a.getChildAt(i10);
    }

    public final int h() {
        return this.a.a.getChildCount();
    }

    public final void i(View view) {
        this.f7053c.add(view);
        q qVar = this.a;
        RecyclerView.a aVarM = RecyclerView.M(view);
        if (aVarM != null) {
            int i10 = aVarM.f7000I;
            View view2 = aVarM.f7003s;
            if (i10 != -1) {
                aVarM.f6999H = i10;
            } else {
                WeakHashMap weakHashMap = U.a;
                aVarM.f6999H = view2.getImportantForAccessibility();
            }
            RecyclerView recyclerView = qVar.a;
            if (recyclerView.P()) {
                aVarM.f7000I = 4;
                recyclerView.f6943M0.add(aVarM);
            } else {
                WeakHashMap weakHashMap2 = U.a;
                view2.setImportantForAccessibility(4);
            }
        }
    }

    public final void j(int i10) {
        q qVar = this.a;
        int i11 = this.f7054d;
        if (i11 == 1) {
            throw new IllegalStateException("Cannot call removeView(At) within removeView(At)");
        }
        if (i11 == 2) {
            throw new IllegalStateException("Cannot call removeView(At) within removeViewIfHidden");
        }
        try {
            int iF = f(i10);
            View childAt = qVar.a.getChildAt(iF);
            if (childAt != null) {
                this.f7054d = 1;
                this.f7055e = childAt;
                if (this.f7052b.f(iF)) {
                    k(childAt);
                }
                qVar.a(iF);
            }
        } finally {
            this.f7054d = 0;
            this.f7055e = null;
        }
    }

    public final void k(View view) {
        if (this.f7053c.remove(view)) {
            q qVar = this.a;
            RecyclerView.a aVarM = RecyclerView.M(view);
            if (aVarM != null) {
                int i10 = aVarM.f6999H;
                RecyclerView recyclerView = qVar.a;
                if (recyclerView.P()) {
                    aVarM.f7000I = i10;
                    recyclerView.f6943M0.add(aVarM);
                } else {
                    View view2 = aVarM.f7003s;
                    WeakHashMap weakHashMap = U.a;
                    view2.setImportantForAccessibility(i10);
                }
                aVarM.f6999H = 0;
            }
        }
    }

    public final String toString() {
        return this.f7052b.toString() + ", hidden list:" + this.f7053c.size();
    }
}
