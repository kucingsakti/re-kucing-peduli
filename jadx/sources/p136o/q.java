package p136o;

import android.view.MenuItem;

/* JADX INFO: loaded from: classes.dex */
public final class q implements MenuItem.OnActionExpandListener {
    public final MenuItem.OnActionExpandListener a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s f13549b;

    public q(s sVar, MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f13549b = sVar;
        this.a = onActionExpandListener;
    }

    @Override // android.view.MenuItem.OnActionExpandListener
    public final boolean onMenuItemActionCollapse(MenuItem menuItem) {
        return this.a.onMenuItemActionCollapse(this.f13549b.h(menuItem));
    }

    @Override // android.view.MenuItem.OnActionExpandListener
    public final boolean onMenuItemActionExpand(MenuItem menuItem) {
        return this.a.onMenuItemActionExpand(this.f13549b.h(menuItem));
    }
}
