package p136o;

import android.view.MenuItem;

/* JADX INFO: loaded from: classes.dex */
public final class r implements MenuItem.OnMenuItemClickListener {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final MenuItem.OnMenuItemClickListener f13550s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ s f13551t;

    public r(s sVar, MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f13551t = sVar;
        this.f13550s = onMenuItemClickListener;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(MenuItem menuItem) {
        return this.f13550s.onMenuItemClick(this.f13551t.h(menuItem));
    }
}
