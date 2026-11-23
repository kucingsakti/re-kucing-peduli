package J0;

import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.Scroller;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* JADX INFO: renamed from: J0.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0264n extends z {
    public RecyclerView a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Scroller f2341b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final J f2342c = new J(this);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f2343d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public C0265o f2344e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public C0265o f2345f;

    public C0264n(int i10) {
        this.f2343d = i10;
    }

    public static int c(View view, AbstractC0266p abstractC0266p) {
        return ((abstractC0266p.c(view) / 2) + abstractC0266p.e(view)) - ((abstractC0266p.l() / 2) + abstractC0266p.k());
    }

    public static View e(androidx.recyclerview.widget.w wVar, AbstractC0266p abstractC0266p) {
        int iW = wVar.w();
        View view = null;
        if (iW == 0) {
            return null;
        }
        int iL = (abstractC0266p.l() / 2) + abstractC0266p.k();
        int i10 = Integer.MAX_VALUE;
        for (int i11 = 0; i11 < iW; i11++) {
            View viewV = wVar.v(i11);
            int iAbs = Math.abs(((abstractC0266p.c(viewV) / 2) + abstractC0266p.e(viewV)) - iL);
            if (iAbs < i10) {
                view = viewV;
                i10 = iAbs;
            }
        }
        return view;
    }

    public static View f(androidx.recyclerview.widget.w wVar, AbstractC0266p abstractC0266p) {
        int iW = wVar.w();
        View view = null;
        if (iW == 0) {
            return null;
        }
        int iL = (abstractC0266p.l() / 2) + abstractC0266p.k();
        int i10 = Integer.MAX_VALUE;
        for (int i11 = 0; i11 < iW; i11++) {
            View viewV = wVar.v(i11);
            int iAbs = Math.abs(((abstractC0266p.c(viewV) / 2) + abstractC0266p.e(viewV)) - iL);
            if (iAbs < i10) {
                view = viewV;
                i10 = iAbs;
            }
        }
        return view;
    }

    public final void a(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.a;
        if (recyclerView2 == recyclerView) {
            return;
        }
        J j = this.f2342c;
        if (recyclerView2 != null) {
            ArrayList arrayList = recyclerView2.f6921B0;
            if (arrayList != null) {
                arrayList.remove(j);
            }
            this.a.setOnFlingListener(null);
        }
        this.a = recyclerView;
        if (recyclerView != null) {
            if (recyclerView.getOnFlingListener() != null) {
                throw new IllegalStateException("An instance of OnFlingListener already set.");
            }
            this.a.j(j);
            this.a.setOnFlingListener(this);
            this.f2341b = new Scroller(this.a.getContext(), new DecelerateInterpolator());
            l();
        }
    }

    public final int[] b(androidx.recyclerview.widget.w wVar, View view) {
        switch (this.f2343d) {
            case 0:
                int[] iArr = new int[2];
                if (wVar.e()) {
                    AbstractC0266p abstractC0266pH = h(wVar);
                    iArr[0] = ((abstractC0266pH.c(view) / 2) + abstractC0266pH.e(view)) - ((abstractC0266pH.l() / 2) + abstractC0266pH.k());
                } else {
                    iArr[0] = 0;
                }
                if (wVar.f()) {
                    AbstractC0266p abstractC0266pJ = j(wVar);
                    iArr[1] = ((abstractC0266pJ.c(view) / 2) + abstractC0266pJ.e(view)) - ((abstractC0266pJ.l() / 2) + abstractC0266pJ.k());
                } else {
                    iArr[1] = 0;
                }
                return iArr;
            default:
                int[] iArr2 = new int[2];
                if (wVar.e()) {
                    iArr2[0] = c(view, i(wVar));
                } else {
                    iArr2[0] = 0;
                }
                if (wVar.f()) {
                    iArr2[1] = c(view, k(wVar));
                } else {
                    iArr2[1] = 0;
                }
                return iArr2;
        }
    }

    public int d(androidx.recyclerview.widget.w wVar, AbstractC0266p abstractC0266p, int i10, int i11) {
        this.f2341b.fling(0, 0, i10, i11, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
        int[] iArr = {this.f2341b.getFinalX(), this.f2341b.getFinalY()};
        int iW = wVar.w();
        float f10 = 1.0f;
        if (iW != 0) {
            View view = null;
            int i12 = Integer.MIN_VALUE;
            int i13 = Integer.MAX_VALUE;
            View view2 = null;
            for (int i14 = 0; i14 < iW; i14++) {
                View viewV = wVar.v(i14);
                int iM = androidx.recyclerview.widget.w.M(viewV);
                if (iM != -1) {
                    if (iM < i13) {
                        view = viewV;
                        i13 = iM;
                    }
                    if (iM > i12) {
                        view2 = viewV;
                        i12 = iM;
                    }
                }
            }
            if (view != null && view2 != null) {
                int iMax = Math.max(abstractC0266p.b(view), abstractC0266p.b(view2)) - Math.min(abstractC0266p.e(view), abstractC0266p.e(view2));
                if (iMax != 0) {
                    f10 = (iMax * 1.0f) / ((i12 - i13) + 1);
                }
            }
        }
        if (f10 <= 0.0f) {
            return 0;
        }
        return Math.round((Math.abs(iArr[0]) > Math.abs(iArr[1]) ? iArr[0] : iArr[1]) / f10);
    }

    public View g(androidx.recyclerview.widget.w wVar) {
        switch (this.f2343d) {
            case 0:
                if (wVar.f()) {
                    return e(wVar, j(wVar));
                }
                if (wVar.e()) {
                    return e(wVar, h(wVar));
                }
                return null;
            default:
                if (wVar.f()) {
                    return f(wVar, k(wVar));
                }
                if (wVar.e()) {
                    return f(wVar, i(wVar));
                }
                return null;
        }
    }

    public AbstractC0266p h(androidx.recyclerview.widget.w wVar) {
        C0265o c0265o = this.f2345f;
        if (c0265o == null || ((androidx.recyclerview.widget.w) c0265o.f2347b) != wVar) {
            this.f2345f = new C0265o(wVar, 0);
        }
        return this.f2345f;
    }

    public AbstractC0266p i(androidx.recyclerview.widget.w wVar) {
        C0265o c0265o = this.f2345f;
        if (c0265o == null || ((androidx.recyclerview.widget.w) c0265o.f2347b) != wVar) {
            this.f2345f = new C0265o(wVar, 0);
        }
        return this.f2345f;
    }

    public AbstractC0266p j(androidx.recyclerview.widget.w wVar) {
        C0265o c0265o = this.f2344e;
        if (c0265o == null || ((androidx.recyclerview.widget.w) c0265o.f2347b) != wVar) {
            this.f2344e = new C0265o(wVar, 1);
        }
        return this.f2344e;
    }

    public AbstractC0266p k(androidx.recyclerview.widget.w wVar) {
        C0265o c0265o = this.f2344e;
        if (c0265o == null || ((androidx.recyclerview.widget.w) c0265o.f2347b) != wVar) {
            this.f2344e = new C0265o(wVar, 1);
        }
        return this.f2344e;
    }

    public final void l() {
        androidx.recyclerview.widget.w layoutManager;
        View viewG;
        RecyclerView recyclerView = this.a;
        if (recyclerView == null || (layoutManager = recyclerView.getLayoutManager()) == null || (viewG = g(layoutManager)) == null) {
            return;
        }
        int[] iArrB = b(layoutManager, viewG);
        int i10 = iArrB[0];
        if (i10 == 0 && iArrB[1] == 0) {
            return;
        }
        this.a.i0(i10, iArrB[1], false);
    }
}
