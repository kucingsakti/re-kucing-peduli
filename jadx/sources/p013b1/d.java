package p013b1;

import E0.a;
import E4.C0189c;
import N0.b;
import android.view.ViewParent;
import androidx.lifecycle.EnumC0519n;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import p156q0.C0742a;
import p156q0.M;
import p212w.g;

/* JADX INFO: loaded from: classes.dex */
public final class d {
    public b a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public c f7246b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public b f7247c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ViewPager2 f7248d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f7249e = -1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ e f7250f;

    public d(e eVar) {
        this.f7250f = eVar;
    }

    public static ViewPager2 a(RecyclerView recyclerView) {
        ViewParent parent = recyclerView.getParent();
        if (parent instanceof ViewPager2) {
            return (ViewPager2) parent;
        }
        throw new IllegalStateException("Expected ViewPager2 instance. Got: " + parent);
    }

    public final void b(boolean z6) {
        int currentItem;
        androidx.fragment.app.b bVar;
        e eVar = this.f7250f;
        if (!eVar.f7252e.P() && this.f7248d.getScrollState() == 0) {
            g gVar = eVar.f7253f;
            if (gVar.l() == 0) {
                return;
            }
            ArrayList arrayList = ((C0189c) eVar).f1401m;
            if (arrayList.size() != 0 && (currentItem = this.f7248d.getCurrentItem()) < arrayList.size()) {
                long j = currentItem;
                if ((j != this.f7249e || z6) && (bVar = (androidx.fragment.app.b) gVar.e(j)) != null && bVar.v()) {
                    this.f7249e = j;
                    M m2 = eVar.f7252e;
                    m2.getClass();
                    C0742a c0742a = new C0742a(m2);
                    ArrayList<List> arrayList2 = new ArrayList();
                    androidx.fragment.app.b bVar2 = null;
                    for (int i10 = 0; i10 < gVar.l(); i10++) {
                        long jI = gVar.i(i10);
                        androidx.fragment.app.b bVar3 = (androidx.fragment.app.b) gVar.m(i10);
                        if (bVar3.v()) {
                            if (jI != this.f7249e) {
                                c0742a.n(bVar3, EnumC0519n.f6758v);
                                P0.d dVar = eVar.j;
                                dVar.getClass();
                                ArrayList arrayList3 = new ArrayList();
                                Iterator it = ((CopyOnWriteArrayList) dVar.f3811t).iterator();
                                if (it.hasNext()) {
                                    throw a.e(it);
                                }
                                arrayList2.add(arrayList3);
                            } else {
                                bVar2 = bVar3;
                            }
                            bVar3.d0(jI == this.f7249e);
                        }
                    }
                    if (bVar2 != null) {
                        c0742a.n(bVar2, EnumC0519n.f6759w);
                        P0.d dVar2 = eVar.j;
                        dVar2.getClass();
                        ArrayList arrayList4 = new ArrayList();
                        Iterator it2 = ((CopyOnWriteArrayList) dVar2.f3811t).iterator();
                        if (it2.hasNext()) {
                            throw a.e(it2);
                        }
                        arrayList2.add(arrayList4);
                    }
                    if (c0742a.a.isEmpty()) {
                        return;
                    }
                    c0742a.h();
                    Collections.reverse(arrayList2);
                    for (List list : arrayList2) {
                        eVar.j.getClass();
                        P0.d.q(list);
                    }
                }
            }
        }
    }
}
