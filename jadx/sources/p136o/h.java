package p136o;

import A1.l;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;
import android.widget.AdapterView;
import androidx.appcompat.view.menu.ExpandedMenuView;
import p078i.C0650g;
import p078i.DialogInterfaceC0653j;

/* JADX INFO: loaded from: classes.dex */
public final class h implements x, AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public Context f13480s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public LayoutInflater f13481t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public l f13482u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public ExpandedMenuView f13483v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public w f13484w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public g f13485x;

    public h(ContextWrapper contextWrapper) {
        this.f13480s = contextWrapper;
        this.f13481t = LayoutInflater.from(contextWrapper);
    }

    @Override // p136o.x
    public final void c(l lVar, boolean z6) {
        w wVar = this.f13484w;
        if (wVar != null) {
            wVar.c(lVar, z6);
        }
    }

    @Override // p136o.x
    public final void d(Parcelable parcelable) {
        SparseArray<Parcelable> sparseParcelableArray = ((Bundle) parcelable).getSparseParcelableArray("android:menu:list");
        if (sparseParcelableArray != null) {
            this.f13483v.restoreHierarchyState(sparseParcelableArray);
        }
    }

    @Override // p136o.x
    public final void e(boolean z6) {
        g gVar = this.f13485x;
        if (gVar != null) {
            gVar.notifyDataSetChanged();
        }
    }

    @Override // p136o.x
    public final boolean g(n nVar) {
        return false;
    }

    @Override // p136o.x
    public final int getId() {
        return 0;
    }

    @Override // p136o.x
    public final void h(w wVar) {
        throw null;
    }

    @Override // p136o.x
    public final void i(Context context, l lVar) {
        if (this.f13480s != null) {
            this.f13480s = context;
            if (this.f13481t == null) {
                this.f13481t = LayoutInflater.from(context);
            }
        }
        this.f13482u = lVar;
        g gVar = this.f13485x;
        if (gVar != null) {
            gVar.notifyDataSetChanged();
        }
    }

    @Override // p136o.x
    public final boolean j() {
        return false;
    }

    @Override // p136o.x
    public final Parcelable k() {
        if (this.f13483v == null) {
            return null;
        }
        Bundle bundle = new Bundle();
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        ExpandedMenuView expandedMenuView = this.f13483v;
        if (expandedMenuView != null) {
            expandedMenuView.saveHierarchyState(sparseArray);
        }
        bundle.putSparseParcelableArray("android:menu:list", sparseArray);
        return bundle;
    }

    @Override // p136o.x
    public final boolean l(D d3) {
        if (!d3.hasVisibleItems()) {
            return false;
        }
        m mVar = new m();
        mVar.f13515s = d3;
        Context context = d3.f13507s;
        l lVar = new l(context);
        C0650g c0650g = (C0650g) lVar.f123t;
        h hVar = new h(c0650g.a);
        mVar.f13517u = hVar;
        hVar.f13484w = mVar;
        d3.b(hVar, context);
        h hVar2 = mVar.f13517u;
        if (hVar2.f13485x == null) {
            hVar2.f13485x = new g(hVar2);
        }
        c0650g.f12053p = hVar2.f13485x;
        c0650g.f12054q = mVar;
        View view = d3.f13498G;
        if (view != null) {
            c0650g.f12043e = view;
        } else {
            c0650g.f12041c = d3.f13497F;
            c0650g.f12042d = d3.f13496E;
        }
        c0650g.f12051n = mVar;
        DialogInterfaceC0653j dialogInterfaceC0653jC = lVar.c();
        mVar.f13516t = dialogInterfaceC0653jC;
        dialogInterfaceC0653jC.setOnDismissListener(mVar);
        WindowManager.LayoutParams attributes = mVar.f13516t.getWindow().getAttributes();
        attributes.type = 1003;
        attributes.flags |= 131072;
        mVar.f13516t.show();
        w wVar = this.f13484w;
        if (wVar == null) {
            return true;
        }
        wVar.l(d3);
        return true;
    }

    @Override // p136o.x
    public final boolean m(n nVar) {
        return false;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i10, long j) {
        this.f13482u.q(this.f13485x.getItem(i10), this, 0);
    }
}
