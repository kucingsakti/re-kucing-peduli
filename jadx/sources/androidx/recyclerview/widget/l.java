package androidx.recyclerview.widget;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class l extends E {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static TimeInterpolator f7086s;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ArrayList f7087h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public ArrayList f7088i;
    public ArrayList j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public ArrayList f7089k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public ArrayList f7090l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public ArrayList f7091m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public ArrayList f7092n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public ArrayList f7093o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public ArrayList f7094p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public ArrayList f7095q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public ArrayList f7096r;

    public static void h(ArrayList arrayList) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ((RecyclerView.a) arrayList.get(size)).f7003s.animate().cancel();
        }
    }

    @Override // androidx.recyclerview.widget.u
    public final void d(RecyclerView.a aVar) {
        View view = aVar.f7003s;
        view.animate().cancel();
        ArrayList arrayList = this.j;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            if (((k) arrayList.get(size)).a == aVar) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                c(aVar);
                arrayList.remove(size);
            }
        }
        j(this.f7089k, aVar);
        if (this.f7087h.remove(aVar)) {
            view.setAlpha(1.0f);
            c(aVar);
        }
        if (this.f7088i.remove(aVar)) {
            view.setAlpha(1.0f);
            c(aVar);
        }
        ArrayList arrayList2 = this.f7092n;
        for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
            ArrayList arrayList3 = (ArrayList) arrayList2.get(size2);
            j(arrayList3, aVar);
            if (arrayList3.isEmpty()) {
                arrayList2.remove(size2);
            }
        }
        ArrayList arrayList4 = this.f7091m;
        for (int size3 = arrayList4.size() - 1; size3 >= 0; size3--) {
            ArrayList arrayList5 = (ArrayList) arrayList4.get(size3);
            for (int size4 = arrayList5.size() - 1; size4 >= 0; size4--) {
                if (((k) arrayList5.get(size4)).a == aVar) {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    c(aVar);
                    arrayList5.remove(size4);
                    if (!arrayList5.isEmpty()) {
                        break;
                    }
                    arrayList4.remove(size3);
                    break;
                }
            }
        }
        ArrayList arrayList6 = this.f7090l;
        for (int size5 = arrayList6.size() - 1; size5 >= 0; size5--) {
            ArrayList arrayList7 = (ArrayList) arrayList6.get(size5);
            if (arrayList7.remove(aVar)) {
                view.setAlpha(1.0f);
                c(aVar);
                if (arrayList7.isEmpty()) {
                    arrayList6.remove(size5);
                }
            }
        }
        this.f7095q.remove(aVar);
        this.f7093o.remove(aVar);
        this.f7096r.remove(aVar);
        this.f7094p.remove(aVar);
        i();
    }

    @Override // androidx.recyclerview.widget.u
    public final void e() {
        ArrayList arrayList = this.j;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            k kVar = (k) arrayList.get(size);
            View view = kVar.a.f7003s;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            c(kVar.a);
            arrayList.remove(size);
        }
        ArrayList arrayList2 = this.f7087h;
        for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
            c((RecyclerView.a) arrayList2.get(size2));
            arrayList2.remove(size2);
        }
        ArrayList arrayList3 = this.f7088i;
        int size3 = arrayList3.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            RecyclerView.a aVar = (RecyclerView.a) arrayList3.get(size3);
            aVar.f7003s.setAlpha(1.0f);
            c(aVar);
            arrayList3.remove(size3);
        }
        ArrayList arrayList4 = this.f7089k;
        for (int size4 = arrayList4.size() - 1; size4 >= 0; size4--) {
            j jVar = (j) arrayList4.get(size4);
            RecyclerView.a aVar2 = jVar.a;
            if (aVar2 != null) {
                k(jVar, aVar2);
            }
            RecyclerView.a aVar3 = jVar.f7077b;
            if (aVar3 != null) {
                k(jVar, aVar3);
            }
        }
        arrayList4.clear();
        if (f()) {
            ArrayList arrayList5 = this.f7091m;
            for (int size5 = arrayList5.size() - 1; size5 >= 0; size5--) {
                ArrayList arrayList6 = (ArrayList) arrayList5.get(size5);
                for (int size6 = arrayList6.size() - 1; size6 >= 0; size6--) {
                    k kVar2 = (k) arrayList6.get(size6);
                    View view2 = kVar2.a.f7003s;
                    view2.setTranslationY(0.0f);
                    view2.setTranslationX(0.0f);
                    c(kVar2.a);
                    arrayList6.remove(size6);
                    if (arrayList6.isEmpty()) {
                        arrayList5.remove(arrayList6);
                    }
                }
            }
            ArrayList arrayList7 = this.f7090l;
            for (int size7 = arrayList7.size() - 1; size7 >= 0; size7--) {
                ArrayList arrayList8 = (ArrayList) arrayList7.get(size7);
                for (int size8 = arrayList8.size() - 1; size8 >= 0; size8--) {
                    RecyclerView.a aVar4 = (RecyclerView.a) arrayList8.get(size8);
                    aVar4.f7003s.setAlpha(1.0f);
                    c(aVar4);
                    arrayList8.remove(size8);
                    if (arrayList8.isEmpty()) {
                        arrayList7.remove(arrayList8);
                    }
                }
            }
            ArrayList arrayList9 = this.f7092n;
            for (int size9 = arrayList9.size() - 1; size9 >= 0; size9--) {
                ArrayList arrayList10 = (ArrayList) arrayList9.get(size9);
                for (int size10 = arrayList10.size() - 1; size10 >= 0; size10--) {
                    j jVar2 = (j) arrayList10.get(size10);
                    RecyclerView.a aVar5 = jVar2.a;
                    if (aVar5 != null) {
                        k(jVar2, aVar5);
                    }
                    RecyclerView.a aVar6 = jVar2.f7077b;
                    if (aVar6 != null) {
                        k(jVar2, aVar6);
                    }
                    if (arrayList10.isEmpty()) {
                        arrayList9.remove(arrayList10);
                    }
                }
            }
            h(this.f7095q);
            h(this.f7094p);
            h(this.f7093o);
            h(this.f7096r);
            ArrayList arrayList11 = this.f7116b;
            if (arrayList11.size() > 0) {
                arrayList11.get(0).getClass();
                throw new ClassCastException();
            }
            arrayList11.clear();
        }
    }

    @Override // androidx.recyclerview.widget.u
    public final boolean f() {
        return (this.f7088i.isEmpty() && this.f7089k.isEmpty() && this.j.isEmpty() && this.f7087h.isEmpty() && this.f7094p.isEmpty() && this.f7095q.isEmpty() && this.f7093o.isEmpty() && this.f7096r.isEmpty() && this.f7091m.isEmpty() && this.f7090l.isEmpty() && this.f7092n.isEmpty()) ? false : true;
    }

    @Override // androidx.recyclerview.widget.E
    public final boolean g(RecyclerView.a aVar, int i10, int i11, int i12, int i13) {
        View view = aVar.f7003s;
        int translationX = i10 + ((int) view.getTranslationX());
        int translationY = i11 + ((int) aVar.f7003s.getTranslationY());
        l(aVar);
        int i14 = i12 - translationX;
        int i15 = i13 - translationY;
        if (i14 == 0 && i15 == 0) {
            c(aVar);
            return false;
        }
        if (i14 != 0) {
            view.setTranslationX(-i14);
        }
        if (i15 != 0) {
            view.setTranslationY(-i15);
        }
        ArrayList arrayList = this.j;
        k kVar = new k();
        kVar.a = aVar;
        kVar.f7082b = translationX;
        kVar.f7083c = translationY;
        kVar.f7084d = i12;
        kVar.f7085e = i13;
        arrayList.add(kVar);
        return true;
    }

    public final void i() {
        if (f()) {
            return;
        }
        ArrayList arrayList = this.f7116b;
        if (arrayList.size() <= 0) {
            arrayList.clear();
        } else {
            arrayList.get(0).getClass();
            throw new ClassCastException();
        }
    }

    public final void j(ArrayList arrayList, RecyclerView.a aVar) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            j jVar = (j) arrayList.get(size);
            if (k(jVar, aVar) && jVar.a == null && jVar.f7077b == null) {
                arrayList.remove(jVar);
            }
        }
    }

    public final boolean k(j jVar, RecyclerView.a aVar) {
        if (jVar.f7077b == aVar) {
            jVar.f7077b = null;
        } else {
            if (jVar.a != aVar) {
                return false;
            }
            jVar.a = null;
        }
        aVar.f7003s.setAlpha(1.0f);
        View view = aVar.f7003s;
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
        c(aVar);
        return true;
    }

    public final void l(RecyclerView.a aVar) {
        if (f7086s == null) {
            f7086s = new ValueAnimator().getInterpolator();
        }
        aVar.f7003s.animate().setInterpolator(f7086s);
        d(aVar);
    }
}
