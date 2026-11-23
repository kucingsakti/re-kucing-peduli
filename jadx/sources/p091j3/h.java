package p091j3;

import android.view.View;
import com.google.android.material.internal.NavigationMenuItemView;
import p136o.n;

/* JADX INFO: loaded from: classes.dex */
public final class h implements View.OnClickListener {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ t f12437s;

    public h(t tVar) {
        this.f12437s = tVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        NavigationMenuItemView navigationMenuItemView = (NavigationMenuItemView) view;
        t tVar = this.f12437s;
        k kVar = tVar.f12472w;
        boolean z6 = true;
        if (kVar != null) {
            kVar.f12443f = true;
        }
        n itemData = navigationMenuItemView.getItemData();
        boolean zQ = tVar.f12470u.q(itemData, tVar, 0);
        if (itemData != null && itemData.isCheckable() && zQ) {
            tVar.f12472w.n(itemData);
        } else {
            z6 = false;
        }
        k kVar2 = tVar.f12472w;
        if (kVar2 != null) {
            kVar2.f12443f = false;
        }
        if (z6) {
            tVar.e(false);
        }
    }
}
