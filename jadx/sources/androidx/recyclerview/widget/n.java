package androidx.recyclerview.widget;

import android.view.View;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class n {
    public boolean a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f7103b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f7104c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f7105d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f7106e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f7107f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f7108g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f7109h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f7110i;
    public int j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public List f7111k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f7112l;

    public final void a(View view) {
        int iD;
        int size = this.f7111k.size();
        View view2 = null;
        int i10 = Integer.MAX_VALUE;
        for (int i11 = 0; i11 < size; i11++) {
            View view3 = ((RecyclerView.a) this.f7111k.get(i11)).f7003s;
            x xVar = (x) view3.getLayoutParams();
            if (view3 != view && !xVar.f7135s.j() && (iD = (xVar.f7135s.d() - this.f7105d) * this.f7106e) >= 0 && iD < i10) {
                view2 = view3;
                if (iD == 0) {
                    break;
                } else {
                    i10 = iD;
                }
            }
        }
        if (view2 == null) {
            this.f7105d = -1;
        } else {
            this.f7105d = ((x) view2.getLayoutParams()).f7135s.d();
        }
    }

    public final View b(A a) {
        List list = this.f7111k;
        if (list == null) {
            View view = a.k(this.f7105d, Long.MAX_VALUE).f7003s;
            this.f7105d += this.f7106e;
            return view;
        }
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            View view2 = ((RecyclerView.a) this.f7111k.get(i10)).f7003s;
            x xVar = (x) view2.getLayoutParams();
            if (!xVar.f7135s.j() && this.f7105d == xVar.f7135s.d()) {
                a(view2);
                return view2;
            }
        }
        return null;
    }
}
