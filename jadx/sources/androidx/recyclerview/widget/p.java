package androidx.recyclerview.widget;

import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class p {
    public final /* synthetic */ RecyclerView a;

    public p(RecyclerView recyclerView) {
        this.a = recyclerView;
    }

    public final void a(RecyclerView.a aVar, t tVar, t tVar2) {
        boolean zG;
        int i10;
        int i11;
        RecyclerView recyclerView = this.a;
        recyclerView.getClass();
        aVar.p(false);
        E e10 = (E) recyclerView.f6963h0;
        e10.getClass();
        if (tVar == null || ((i10 = tVar.a) == (i11 = tVar2.a) && tVar.f7115b == tVar2.f7115b)) {
            l lVar = (l) e10;
            lVar.l(aVar);
            aVar.f7003s.setAlpha(0.0f);
            lVar.f7088i.add(aVar);
            zG = true;
        } else {
            zG = e10.g(aVar, i10, tVar.f7115b, i11, tVar2.f7115b);
        }
        if (zG) {
            recyclerView.W();
        }
    }

    public final void b(RecyclerView.a aVar, t tVar, t tVar2) {
        boolean zG;
        RecyclerView recyclerView = this.a;
        recyclerView.f6978u.l(aVar);
        recyclerView.h(aVar);
        aVar.p(false);
        E e10 = (E) recyclerView.f6963h0;
        e10.getClass();
        int i10 = tVar.a;
        int i11 = tVar.f7115b;
        View view = aVar.f7003s;
        int left = tVar2 == null ? view.getLeft() : tVar2.a;
        int top = tVar2 == null ? view.getTop() : tVar2.f7115b;
        if (aVar.j() || (i10 == left && i11 == top)) {
            l lVar = (l) e10;
            lVar.l(aVar);
            lVar.f7087h.add(aVar);
            zG = true;
        } else {
            view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
            zG = e10.g(aVar, i10, i11, left, top);
        }
        if (zG) {
            recyclerView.W();
        }
    }
}
