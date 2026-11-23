package androidx.recyclerview.widget;

import J0.C0251a;
import android.view.View;
import androidx.preference.Preference;
import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: loaded from: classes.dex */
public final class r {
    public final /* synthetic */ RecyclerView a;

    public r(RecyclerView recyclerView) {
        this.a = recyclerView;
    }

    public final void a(C0251a c0251a) {
        int i10 = c0251a.a;
        RecyclerView recyclerView = this.a;
        if (i10 == 1) {
            recyclerView.f6928F.d0(c0251a.f2268b, c0251a.f2270d);
            return;
        }
        if (i10 == 2) {
            recyclerView.f6928F.g0(c0251a.f2268b, c0251a.f2270d);
        } else if (i10 == 4) {
            recyclerView.f6928F.i0(recyclerView, c0251a.f2268b, c0251a.f2270d);
        } else {
            if (i10 != 8) {
                return;
            }
            recyclerView.f6928F.f0(c0251a.f2268b, c0251a.f2270d);
        }
    }

    public final RecyclerView.a b(int i10) {
        RecyclerView recyclerView = this.a;
        int iH = recyclerView.f6984x.h();
        RecyclerView.a aVar = null;
        for (int i11 = 0; i11 < iH; i11++) {
            RecyclerView.a aVarM = RecyclerView.M(recyclerView.f6984x.g(i11));
            if (aVarM != null && !aVarM.j() && aVarM.f7005u == i10) {
                if (!recyclerView.f6984x.f7053c.contains(aVarM.f7003s)) {
                    aVar = aVarM;
                    break;
                }
                aVar = aVarM;
            }
        }
        if (aVar == null) {
            return null;
        }
        if (!recyclerView.f6984x.f7053c.contains(aVar.f7003s)) {
            return aVar;
        }
        boolean z6 = RecyclerView.f6910S0;
        return null;
    }

    public final void c(int i10, int i11, Preference preference) {
        int i12;
        int i13;
        RecyclerView recyclerView = this.a;
        int iH = recyclerView.f6984x.h();
        int i14 = i11 + i10;
        for (int i15 = 0; i15 < iH; i15++) {
            View viewG = recyclerView.f6984x.g(i15);
            RecyclerView.a aVarM = RecyclerView.M(viewG);
            if (aVarM != null && !aVarM.q() && (i13 = aVarM.f7005u) >= i10 && i13 < i14) {
                aVarM.b(2);
                if (preference == null) {
                    aVarM.b(1024);
                } else if ((1024 & aVarM.f6993B) == 0) {
                    if (aVarM.f6994C == null) {
                        ArrayList arrayList = new ArrayList();
                        aVarM.f6994C = arrayList;
                        aVarM.f6995D = Collections.unmodifiableList(arrayList);
                    }
                    aVarM.f6994C.add(preference);
                }
                ((x) viewG.getLayoutParams()).f7137u = true;
            }
        }
        A a = recyclerView.f6978u;
        ArrayList arrayList2 = a.f6875c;
        for (int size = arrayList2.size() - 1; size >= 0; size--) {
            RecyclerView.a aVar = (RecyclerView.a) arrayList2.get(size);
            if (aVar != null && (i12 = aVar.f7005u) >= i10 && i12 < i14) {
                aVar.b(2);
                a.g(size);
            }
        }
        recyclerView.f6925D0 = true;
    }

    public final void d(int i10, int i11) {
        RecyclerView recyclerView = this.a;
        int iH = recyclerView.f6984x.h();
        for (int i12 = 0; i12 < iH; i12++) {
            RecyclerView.a aVarM = RecyclerView.M(recyclerView.f6984x.g(i12));
            if (aVarM != null && !aVarM.q() && aVarM.f7005u >= i10) {
                if (RecyclerView.f6911T0) {
                    aVarM.toString();
                }
                aVarM.n(i11, false);
                recyclerView.f6989z0.f2228f = true;
            }
        }
        ArrayList arrayList = recyclerView.f6978u.f6875c;
        int size = arrayList.size();
        for (int i13 = 0; i13 < size; i13++) {
            RecyclerView.a aVar = (RecyclerView.a) arrayList.get(i13);
            if (aVar != null && aVar.f7005u >= i10) {
                if (RecyclerView.f6911T0) {
                    aVar.toString();
                }
                aVar.n(i11, false);
            }
        }
        recyclerView.requestLayout();
        recyclerView.f6923C0 = true;
    }

    public final void e(int i10, int i11) {
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        RecyclerView recyclerView = this.a;
        int iH = recyclerView.f6984x.h();
        int i19 = -1;
        if (i10 < i11) {
            i13 = i10;
            i12 = i11;
            i14 = -1;
        } else {
            i12 = i10;
            i13 = i11;
            i14 = 1;
        }
        for (int i20 = 0; i20 < iH; i20++) {
            RecyclerView.a aVarM = RecyclerView.M(recyclerView.f6984x.g(i20));
            if (aVarM != null && (i18 = aVarM.f7005u) >= i13 && i18 <= i12) {
                if (RecyclerView.f6911T0) {
                    aVarM.toString();
                }
                if (aVarM.f7005u == i10) {
                    aVarM.n(i11 - i10, false);
                } else {
                    aVarM.n(i14, false);
                }
                recyclerView.f6989z0.f2228f = true;
            }
        }
        A a = recyclerView.f6978u;
        a.getClass();
        if (i10 < i11) {
            i16 = i10;
            i15 = i11;
        } else {
            i15 = i10;
            i16 = i11;
            i19 = 1;
        }
        ArrayList arrayList = a.f6875c;
        int size = arrayList.size();
        for (int i21 = 0; i21 < size; i21++) {
            RecyclerView.a aVar = (RecyclerView.a) arrayList.get(i21);
            if (aVar != null && (i17 = aVar.f7005u) >= i16 && i17 <= i15) {
                if (i17 == i10) {
                    aVar.n(i11 - i10, false);
                } else {
                    aVar.n(i19, false);
                }
                if (RecyclerView.f6911T0) {
                    aVar.toString();
                }
            }
        }
        recyclerView.requestLayout();
        recyclerView.f6923C0 = true;
    }
}
