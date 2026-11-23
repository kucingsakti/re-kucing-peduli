package p136o;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.datastore.preferences.protobuf.AbstractC0487g;

/* JADX INFO: loaded from: classes.dex */
public class D extends l implements SubMenu {

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public final l f13431R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public final n f13432S;

    public D(Context context, l lVar, n nVar) {
        super(context);
        this.f13431R = lVar;
        this.f13432S = nVar;
    }

    @Override // p136o.l
    public final boolean d(n nVar) {
        return this.f13431R.d(nVar);
    }

    @Override // p136o.l
    public final boolean e(l lVar, MenuItem menuItem) {
        return super.e(lVar, menuItem) || this.f13431R.e(lVar, menuItem);
    }

    @Override // p136o.l
    public final boolean f(n nVar) {
        return this.f13431R.f(nVar);
    }

    @Override // android.view.SubMenu
    public final MenuItem getItem() {
        return this.f13432S;
    }

    @Override // p136o.l
    public final String j() {
        n nVar = this.f13432S;
        int i10 = nVar != null ? nVar.f13538s : 0;
        if (i10 == 0) {
            return null;
        }
        return AbstractC0487g.g(i10, "android:menu:actionviewstates:");
    }

    @Override // p136o.l
    public final l k() {
        return this.f13431R.k();
    }

    @Override // p136o.l
    public final boolean m() {
        return this.f13431R.m();
    }

    @Override // p136o.l
    public final boolean n() {
        return this.f13431R.n();
    }

    @Override // p136o.l
    public final boolean o() {
        return this.f13431R.o();
    }

    @Override // p136o.l, android.view.Menu
    public final void setGroupDividerEnabled(boolean z6) {
        this.f13431R.setGroupDividerEnabled(z6);
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(Drawable drawable) {
        w(0, null, 0, drawable, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(CharSequence charSequence) {
        w(0, charSequence, 0, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderView(View view) {
        w(0, null, 0, null, view);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(Drawable drawable) {
        this.f13432S.setIcon(drawable);
        return this;
    }

    @Override // p136o.l, android.view.Menu
    public final void setQwertyMode(boolean z6) {
        this.f13431R.setQwertyMode(z6);
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(int i10) {
        w(0, null, i10, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(int i10) {
        w(i10, null, 0, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(int i10) {
        this.f13432S.setIcon(i10);
        return this;
    }
}
