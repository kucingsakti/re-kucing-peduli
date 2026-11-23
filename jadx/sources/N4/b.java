package N4;

import A0.m;
import A0.p;
import A0.s;
import E4.B;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.SparseArray;
import androidx.datastore.preferences.protobuf.AbstractC0487g;
import androidx.lifecycle.A;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.kcstream.cing.R;
import java.lang.ref.WeakReference;
import java.util.List;
import p078i.AbstractActivityC0655l;
import p086i8.h;
import p086i8.l;
import p156q0.C0742a;
import p156q0.I;
import p156q0.M;
import p156q0.P;
import p210v8.i;
import p210v8.q;
import p210v8.r;
import p210v8.t;
import y0.C0867e;
import y0.C0872j;
import y0.D;
import y0.x;

/* JADX INFO: loaded from: classes.dex */
public final class b {
    public final List a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public A f3318b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final WeakReference f3319c;

    public b(AbstractActivityC0655l abstractActivityC0655l, List list) {
        this.a = list;
        this.f3319c = new WeakReference(abstractActivityC0655l);
    }

    public final void a() {
        AbstractActivityC0655l abstractActivityC0655l = (AbstractActivityC0655l) this.f3319c.get();
        if (abstractActivityC0655l == null) {
            return;
        }
        final BottomNavigationView bottomNavigationView = (BottomNavigationView) abstractActivityC0655l.findViewById(R.id.navigations);
        i.c(bottomNavigationView);
        final M m2 = abstractActivityC0655l.m();
        i.e(m2, "getSupportFragmentManager(...)");
        Intent intent = abstractActivityC0655l.getIntent();
        i.e(intent, "getIntent(...)");
        List list = this.a;
        SparseArray sparseArray = new SparseArray();
        final A a = new A();
        final r rVar = new r();
        List list2 = list;
        int i10 = 0;
        for (Object obj : list2) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                l.G();
                throw null;
            }
            int iIntValue = ((Number) obj).intValue();
            String strG = AbstractC0487g.g(i10, "bottomNavigation#");
            s sVarA = C4.a.A(m2, strG, iIntValue);
            int i12 = sVarA.g0().h().f16002z;
            if (i10 == 0) {
                rVar.f15464s = i12;
            }
            sparseArray.put(i12, strG);
            if (bottomNavigationView.getSelectedItemId() == i12) {
                a.e(sVarA.g0());
                boolean z6 = i10 == 0;
                C0742a c0742a = new C0742a(m2);
                c0742a.b(new P(7, sVarA));
                if (z6) {
                    c0742a.o(sVarA);
                }
                c0742a.h();
            } else {
                C0742a c0742a2 = new C0742a(m2);
                c0742a2.i(sVarA);
                c0742a2.h();
            }
            i10 = i11;
        }
        t tVar = new t();
        tVar.f15466s = sparseArray.get(bottomNavigationView.getSelectedItemId());
        final String str = (String) sparseArray.get(rVar.f15464s);
        final q qVar = new q();
        qVar.f15463s = i.a(tVar.f15466s, str);
        bottomNavigationView.setOnNavigationItemSelectedListener(new c(m2, sparseArray, tVar, str, qVar, a));
        bottomNavigationView.setOnNavigationItemReselectedListener(new B(sparseArray, 4, m2));
        int i13 = 0;
        for (Object obj2 : list2) {
            int i14 = i13 + 1;
            if (i13 < 0) {
                l.G();
                throw null;
            }
            s sVarA2 = C4.a.A(m2, "bottomNavigation#" + i13, ((Number) obj2).intValue());
            if (sVarA2.g0().k(intent) && bottomNavigationView.getSelectedItemId() != sVarA2.g0().h().f16002z) {
                bottomNavigationView.setSelectedItemId(sVarA2.g0().h().f16002z);
            }
            i13 = i14;
        }
        m2.f6687n.add(new I() { // from class: N4.d
            @Override // p156q0.I
            public final /* synthetic */ void a(androidx.fragment.app.b bVar, boolean z10) {
            }

            @Override // p156q0.I
            public final void b() {
                int i15;
                D d3;
                Bundle bundle;
                int i16;
                C0742a c0742a3;
                q qVar2 = qVar;
                M m10 = m2;
                BottomNavigationView bottomNavigationView2 = bottomNavigationView;
                r rVar2 = rVar;
                A a10 = a;
                if (!qVar2.f15463s) {
                    String str2 = str;
                    i.c(str2);
                    int i17 = 0;
                    int size = m10.f6678d.size() + (m10.f6682h != null ? 1 : 0);
                    while (true) {
                        if (i17 >= size) {
                            bottomNavigationView2.setSelectedItemId(rVar2.f15464s);
                            break;
                        }
                        if (i17 == m10.f6678d.size()) {
                            c0742a3 = m10.f6682h;
                            if (c0742a3 == null) {
                                throw new IndexOutOfBoundsException();
                            }
                        } else {
                            c0742a3 = (C0742a) m10.f6678d.get(i17);
                        }
                        if (i.a(c0742a3.f14301i, str2)) {
                            break;
                        } else {
                            i17++;
                        }
                    }
                }
                Object obj3 = a10.f6709e;
                if (obj3 == A.f6705k) {
                    obj3 = null;
                }
                y0.B b3 = (y0.B) obj3;
                if (b3 == null || b3.f() != null) {
                    return;
                }
                int i18 = b3.h().f16002z;
                h hVar = b3.f15839g;
                x xVar = hVar.isEmpty() ? b3.f15835c : ((C0872j) hVar.r()).f15928t;
                if (xVar == null) {
                    throw new IllegalStateException("No current destination found. Ensure a navigation graph has been set for NavController " + b3 + '.');
                }
                C0867e c0867eG = xVar.g(i18);
                if (c0867eG != null) {
                    d3 = c0867eG.f15914b;
                    Bundle bundle2 = c0867eG.f15915c;
                    i15 = c0867eG.a;
                    if (bundle2 != null) {
                        bundle = new Bundle();
                        bundle.putAll(bundle2);
                    } else {
                        bundle = null;
                    }
                } else {
                    i15 = i18;
                    d3 = null;
                    bundle = null;
                }
                if (i15 == 0 && d3 != null && (i16 = d3.f15861c) != -1) {
                    boolean z10 = d3.f15862d;
                    if (i16 != -1) {
                        b3.n(i16, z10);
                        return;
                    }
                    return;
                }
                if (i15 == 0) {
                    throw new IllegalArgumentException("Destination id == 0 can only be used in conjunction with a valid navOptions.popUpTo");
                }
                x xVarC = b3.c(i15, null);
                if (xVarC != null) {
                    b3.m(xVarC, bundle, d3);
                    return;
                }
                int i19 = x.f15993B;
                Context context = b3.a;
                String strM = p068ga.d.m(context, i15);
                if (c0867eG == null) {
                    throw new IllegalArgumentException("Navigation action/destination " + strM + " cannot be found from the current destination " + xVar);
                }
                StringBuilder sbM = AbstractC0487g.m("Navigation destination ", strM, " referenced from action ");
                sbM.append(p068ga.d.m(context, i18));
                sbM.append(" cannot be found from the current destination ");
                sbM.append(xVar);
                throw new IllegalArgumentException(sbM.toString().toString());
            }

            @Override // p156q0.I
            public final /* synthetic */ void c(androidx.fragment.app.b bVar, boolean z10) {
            }
        });
        a.d(abstractActivityC0655l, new p(new m(abstractActivityC0655l, 13), 1));
        this.f3318b = a;
    }
}
