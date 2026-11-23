package p078i;

import android.view.View;
import android.widget.AdapterView;
import androidx.appcompat.app.AlertController$RecycleListView;

/* JADX INFO: renamed from: i.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0649f implements AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ AlertController$RecycleListView f12037s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ C0652i f12038t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ C0650g f12039u;

    public C0649f(C0650g c0650g, AlertController$RecycleListView alertController$RecycleListView, C0652i c0652i) {
        this.f12039u = c0650g;
        this.f12037s = alertController$RecycleListView;
        this.f12038t = c0652i;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i10, long j) {
        C0650g c0650g = this.f12039u;
        boolean[] zArr = c0650g.f12057t;
        AlertController$RecycleListView alertController$RecycleListView = this.f12037s;
        if (zArr != null) {
            zArr[i10] = alertController$RecycleListView.isItemChecked(i10);
        }
        c0650g.f12061x.onClick(this.f12038t.f12070b, i10, alertController$RecycleListView.isItemChecked(i10));
    }
}
