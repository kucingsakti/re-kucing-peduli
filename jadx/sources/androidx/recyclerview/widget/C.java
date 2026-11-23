package androidx.recyclerview.widget;

import U.U;
import androidx.preference.Preference;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class C extends J0.u {
    public final /* synthetic */ RecyclerView a;

    public C(RecyclerView recyclerView) {
        this.a = recyclerView;
    }

    @Override // J0.u
    public final void a() {
        RecyclerView recyclerView = this.a;
        recyclerView.k(null);
        recyclerView.f6989z0.f2228f = true;
        recyclerView.Y(true);
        if (recyclerView.f6982w.g()) {
            return;
        }
        recyclerView.requestLayout();
    }

    @Override // J0.u
    public final void b(int i10, int i11, Preference preference) {
        RecyclerView recyclerView = this.a;
        recyclerView.k(null);
        C0528a c0528a = recyclerView.f6982w;
        if (i11 < 1) {
            c0528a.getClass();
            return;
        }
        ArrayList arrayList = c0528a.f7047b;
        arrayList.add(c0528a.h(4, i10, i11, preference));
        c0528a.f7051f |= 4;
        if (arrayList.size() == 1) {
            e();
        }
    }

    @Override // J0.u
    public final void c(int i10, int i11) {
        RecyclerView recyclerView = this.a;
        recyclerView.k(null);
        C0528a c0528a = recyclerView.f6982w;
        if (i11 < 1) {
            c0528a.getClass();
            return;
        }
        ArrayList arrayList = c0528a.f7047b;
        arrayList.add(c0528a.h(1, i10, i11, null));
        c0528a.f7051f |= 1;
        if (arrayList.size() == 1) {
            e();
        }
    }

    @Override // J0.u
    public final void d(int i10, int i11) {
        RecyclerView recyclerView = this.a;
        recyclerView.k(null);
        C0528a c0528a = recyclerView.f6982w;
        if (i11 < 1) {
            c0528a.getClass();
            return;
        }
        ArrayList arrayList = c0528a.f7047b;
        arrayList.add(c0528a.h(2, i10, i11, null));
        c0528a.f7051f |= 2;
        if (arrayList.size() == 1) {
            e();
        }
    }

    public final void e() {
        boolean z6 = RecyclerView.f6914X0;
        RecyclerView recyclerView = this.a;
        if (z6 && recyclerView.f6940L && recyclerView.f6938K) {
            WeakHashMap weakHashMap = U.a;
            recyclerView.postOnAnimation(recyclerView.f6918A);
        } else {
            recyclerView.f6953S = true;
            recyclerView.requestLayout();
        }
    }
}
