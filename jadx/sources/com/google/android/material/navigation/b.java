package com.google.android.material.navigation;

import V0.C0446a;
import V0.t;
import android.content.Context;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.MenuItem;
import com.google.android.material.badge.BadgeState$State;
import com.google.android.material.internal.ParcelableSparseArray;
import p136o.D;
import p136o.l;
import p136o.n;
import p136o.x;

/* JADX INFO: loaded from: classes.dex */
public final class b implements x {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public W2.b f9771s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f9772t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f9773u;

    @Override // p136o.x
    public final void d(Parcelable parcelable) {
        SparseArray sparseArray;
        if (parcelable instanceof NavigationBarPresenter$SavedState) {
            W2.b bVar = this.f9771s;
            NavigationBarPresenter$SavedState navigationBarPresenter$SavedState = (NavigationBarPresenter$SavedState) parcelable;
            int i10 = navigationBarPresenter$SavedState.f9750s;
            int size = bVar.f13130W.f13512x.size();
            for (int i11 = 0; i11 < size; i11++) {
                MenuItem item = bVar.f13130W.getItem(i11);
                if (i10 == item.getItemId()) {
                    bVar.f13137y = i10;
                    bVar.f13138z = i11;
                    item.setChecked(true);
                    break;
                }
            }
            Context context = this.f9771s.getContext();
            ParcelableSparseArray parcelableSparseArray = navigationBarPresenter$SavedState.f9751t;
            SparseArray sparseArray2 = new SparseArray(parcelableSparseArray.size());
            for (int i12 = 0; i12 < parcelableSparseArray.size(); i12++) {
                int iKeyAt = parcelableSparseArray.keyAt(i12);
                BadgeState$State badgeState$State = (BadgeState$State) parcelableSparseArray.valueAt(i12);
                sparseArray2.put(iKeyAt, badgeState$State != null ? new T2.a(context, badgeState$State) : null);
            }
            W2.b bVar2 = this.f9771s;
            bVar2.getClass();
            int i13 = 0;
            while (true) {
                int size2 = sparseArray2.size();
                sparseArray = bVar2.f13119K;
                if (i13 >= size2) {
                    break;
                }
                int iKeyAt2 = sparseArray2.keyAt(i13);
                if (sparseArray.indexOfKey(iKeyAt2) < 0) {
                    sparseArray.append(iKeyAt2, (T2.a) sparseArray2.get(iKeyAt2));
                }
                i13++;
            }
            p118m3.d[] dVarArr = bVar2.f13136x;
            if (dVarArr != null) {
                for (p118m3.d dVar : dVarArr) {
                    T2.a aVar = (T2.a) sparseArray.get(dVar.getId());
                    if (aVar != null) {
                        dVar.setBadge(aVar);
                    }
                }
            }
        }
    }

    @Override // p136o.x
    public final void e(boolean z6) {
        C0446a c0446a;
        if (this.f9772t) {
            return;
        }
        if (z6) {
            this.f9771s.a();
            return;
        }
        W2.b bVar = this.f9771s;
        l lVar = bVar.f13130W;
        if (lVar == null || bVar.f13136x == null) {
            return;
        }
        int size = lVar.f13512x.size();
        if (size != bVar.f13136x.length) {
            bVar.a();
            return;
        }
        int i10 = bVar.f13137y;
        for (int i11 = 0; i11 < size; i11++) {
            MenuItem item = bVar.f13130W.getItem(i11);
            if (item.isChecked()) {
                bVar.f13137y = item.getItemId();
                bVar.f13138z = i11;
            }
        }
        if (i10 != bVar.f13137y && (c0446a = bVar.f13131s) != null) {
            t.a(bVar, c0446a);
        }
        int i12 = bVar.f13135w;
        boolean z10 = i12 != -1 ? i12 == 0 : bVar.f13130W.l().size() > 3;
        for (int i13 = 0; i13 < size; i13++) {
            bVar.f13129V.f9772t = true;
            bVar.f13136x[i13].setLabelVisibilityMode(bVar.f13135w);
            bVar.f13136x[i13].setShifting(z10);
            bVar.f13136x[i13].a((n) bVar.f13130W.getItem(i13));
            bVar.f13129V.f9772t = false;
        }
    }

    @Override // p136o.x
    public final boolean g(n nVar) {
        return false;
    }

    @Override // p136o.x
    public final int getId() {
        return this.f9773u;
    }

    @Override // p136o.x
    public final void i(Context context, l lVar) {
        this.f9771s.f13130W = lVar;
    }

    @Override // p136o.x
    public final boolean j() {
        return false;
    }

    @Override // p136o.x
    public final Parcelable k() {
        NavigationBarPresenter$SavedState navigationBarPresenter$SavedState = new NavigationBarPresenter$SavedState();
        navigationBarPresenter$SavedState.f9750s = this.f9771s.getSelectedItemId();
        SparseArray<T2.a> badgeDrawables = this.f9771s.getBadgeDrawables();
        ParcelableSparseArray parcelableSparseArray = new ParcelableSparseArray();
        for (int i10 = 0; i10 < badgeDrawables.size(); i10++) {
            int iKeyAt = badgeDrawables.keyAt(i10);
            T2.a aVarValueAt = badgeDrawables.valueAt(i10);
            parcelableSparseArray.put(iKeyAt, aVarValueAt != null ? aVarValueAt.f4636w.a : null);
        }
        navigationBarPresenter$SavedState.f9751t = parcelableSparseArray;
        return navigationBarPresenter$SavedState;
    }

    @Override // p136o.x
    public final boolean l(D d3) {
        return false;
    }

    @Override // p136o.x
    public final boolean m(n nVar) {
        return false;
    }

    @Override // p136o.x
    public final void c(l lVar, boolean z6) {
    }
}
