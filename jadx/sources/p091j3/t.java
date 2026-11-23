package p091j3;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import com.google.android.material.internal.NavigationMenuView;
import com.google.android.material.internal.ParcelableSparseArray;
import com.kcstream.cing.R;
import java.util.ArrayList;
import p136o.D;
import p136o.l;
import p136o.n;
import p136o.x;

/* JADX INFO: loaded from: classes.dex */
public final class t implements x {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public ColorStateList f12450C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public ColorStateList f12451D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public Drawable f12452E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public RippleDrawable f12453F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public int f12454G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public int f12455H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public int f12456I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public int f12457J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public int f12458K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public int f12459L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public int f12460M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public int f12461N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public boolean f12462O;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public int f12463Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public int f12464R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public int f12465S;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public NavigationMenuView f12468s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public LinearLayout f12469t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public l f12470u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f12471v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public k f12472w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public LayoutInflater f12473x;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public ColorStateList f12475z;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f12474y = 0;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public int f12448A = 0;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public boolean f12449B = true;
    public boolean P = true;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public int f12466T = -1;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public final h f12467U = new h(this);

    @Override // p136o.x
    public final void d(Parcelable parcelable) {
        n nVar;
        View actionView;
        ParcelableSparseArray parcelableSparseArray;
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            SparseArray<Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray("android:menu:list");
            if (sparseParcelableArray != null) {
                this.f12468s.restoreHierarchyState(sparseParcelableArray);
            }
            Bundle bundle2 = bundle.getBundle("android:menu:adapter");
            if (bundle2 != null) {
                k kVar = this.f12472w;
                kVar.getClass();
                int i10 = bundle2.getInt("android:menu:checked", 0);
                ArrayList arrayList = kVar.f12441d;
                if (i10 != 0) {
                    kVar.f12443f = true;
                    int size = arrayList.size();
                    for (int i11 = 0; i11 < size; i11++) {
                        m mVar = (m) arrayList.get(i11);
                        if (mVar instanceof o) {
                            n nVar2 = ((o) mVar).a;
                            if (nVar2.f13538s == i10) {
                                kVar.n(nVar2);
                                break;
                            }
                        }
                    }
                    kVar.f12443f = false;
                    kVar.m();
                }
                SparseArray sparseParcelableArray2 = bundle2.getSparseParcelableArray("android:menu:action_views");
                if (sparseParcelableArray2 != null) {
                    int size2 = arrayList.size();
                    for (int i12 = 0; i12 < size2; i12++) {
                        m mVar2 = (m) arrayList.get(i12);
                        if ((mVar2 instanceof o) && (actionView = (nVar = ((o) mVar2).a).getActionView()) != null && (parcelableSparseArray = (ParcelableSparseArray) sparseParcelableArray2.get(nVar.f13538s)) != null) {
                            actionView.restoreHierarchyState(parcelableSparseArray);
                        }
                    }
                }
            }
            SparseArray<Parcelable> sparseParcelableArray3 = bundle.getSparseParcelableArray("android:menu:header");
            if (sparseParcelableArray3 != null) {
                this.f12469t.restoreHierarchyState(sparseParcelableArray3);
            }
        }
    }

    @Override // p136o.x
    public final void e(boolean z6) {
        k kVar = this.f12472w;
        if (kVar != null) {
            kVar.m();
            kVar.a.b();
        }
    }

    @Override // p136o.x
    public final boolean g(n nVar) {
        return false;
    }

    @Override // p136o.x
    public final int getId() {
        return this.f12471v;
    }

    @Override // p136o.x
    public final void i(Context context, l lVar) {
        this.f12473x = LayoutInflater.from(context);
        this.f12470u = lVar;
        this.f12465S = context.getResources().getDimensionPixelOffset(R.dimen.design_navigation_separator_vertical_padding);
    }

    @Override // p136o.x
    public final boolean j() {
        return false;
    }

    @Override // p136o.x
    public final Parcelable k() {
        Bundle bundle = new Bundle();
        if (this.f12468s != null) {
            SparseArray<Parcelable> sparseArray = new SparseArray<>();
            this.f12468s.saveHierarchyState(sparseArray);
            bundle.putSparseParcelableArray("android:menu:list", sparseArray);
        }
        k kVar = this.f12472w;
        if (kVar != null) {
            kVar.getClass();
            Bundle bundle2 = new Bundle();
            n nVar = kVar.f12442e;
            if (nVar != null) {
                bundle2.putInt("android:menu:checked", nVar.f13538s);
            }
            SparseArray<? extends Parcelable> sparseArray2 = new SparseArray<>();
            ArrayList arrayList = kVar.f12441d;
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                m mVar = (m) arrayList.get(i10);
                if (mVar instanceof o) {
                    n nVar2 = ((o) mVar).a;
                    View actionView = nVar2 != null ? nVar2.getActionView() : null;
                    if (actionView != null) {
                        ParcelableSparseArray parcelableSparseArray = new ParcelableSparseArray();
                        actionView.saveHierarchyState(parcelableSparseArray);
                        sparseArray2.put(nVar2.f13538s, parcelableSparseArray);
                    }
                }
            }
            bundle2.putSparseParcelableArray("android:menu:action_views", sparseArray2);
            bundle.putBundle("android:menu:adapter", bundle2);
        }
        if (this.f12469t != null) {
            SparseArray<Parcelable> sparseArray3 = new SparseArray<>();
            this.f12469t.saveHierarchyState(sparseArray3);
            bundle.putSparseParcelableArray("android:menu:header", sparseArray3);
        }
        return bundle;
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
