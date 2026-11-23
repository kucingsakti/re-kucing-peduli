package p136o;

import B6.b;
import O.a;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import p212w.i;

/* JADX INFO: loaded from: classes.dex */
public class A extends b implements Menu {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final l f13411u;

    public A(Context context, l lVar) {
        super(context);
        if (lVar == null) {
            throw new IllegalArgumentException("Wrapped Object can not be null.");
        }
        this.f13411u = lVar;
    }

    @Override // android.view.Menu
    public final MenuItem add(CharSequence charSequence) {
        return h(this.f13411u.a(0, 0, 0, charSequence));
    }

    @Override // android.view.Menu
    public final int addIntentOptions(int i10, int i11, int i12, ComponentName componentName, Intent[] intentArr, Intent intent, int i13, MenuItem[] menuItemArr) {
        MenuItem[] menuItemArr2 = menuItemArr != null ? new MenuItem[menuItemArr.length] : null;
        int iAddIntentOptions = this.f13411u.addIntentOptions(i10, i11, i12, componentName, intentArr, intent, i13, menuItemArr2);
        if (menuItemArr2 != null) {
            int length = menuItemArr2.length;
            for (int i14 = 0; i14 < length; i14++) {
                menuItemArr[i14] = h(menuItemArr2[i14]);
            }
        }
        return iAddIntentOptions;
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(CharSequence charSequence) {
        return this.f13411u.addSubMenu(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public final void clear() {
        i iVar = (i) this.f726t;
        if (iVar != null) {
            iVar.clear();
        }
        this.f13411u.clear();
    }

    @Override // android.view.Menu
    public final void close() {
        this.f13411u.close();
    }

    @Override // android.view.Menu
    public final MenuItem findItem(int i10) {
        return h(this.f13411u.findItem(i10));
    }

    @Override // android.view.Menu
    public final MenuItem getItem(int i10) {
        return h(this.f13411u.getItem(i10));
    }

    @Override // android.view.Menu
    public final boolean hasVisibleItems() {
        return this.f13411u.hasVisibleItems();
    }

    @Override // android.view.Menu
    public final boolean isShortcutKey(int i10, KeyEvent keyEvent) {
        return this.f13411u.isShortcutKey(i10, keyEvent);
    }

    @Override // android.view.Menu
    public final boolean performIdentifierAction(int i10, int i11) {
        return this.f13411u.performIdentifierAction(i10, i11);
    }

    @Override // android.view.Menu
    public final boolean performShortcut(int i10, KeyEvent keyEvent, int i11) {
        return this.f13411u.performShortcut(i10, keyEvent, i11);
    }

    @Override // android.view.Menu
    public final void removeGroup(int i10) {
        if (((i) this.f726t) != null) {
            int i11 = 0;
            while (true) {
                i iVar = (i) this.f726t;
                if (i11 >= iVar.f15506u) {
                    break;
                }
                if (((a) iVar.g(i11)).getGroupId() == i10) {
                    ((i) this.f726t).i(i11);
                    i11--;
                }
                i11++;
            }
        }
        this.f13411u.removeGroup(i10);
    }

    @Override // android.view.Menu
    public final void removeItem(int i10) {
        if (((i) this.f726t) != null) {
            int i11 = 0;
            while (true) {
                i iVar = (i) this.f726t;
                if (i11 >= iVar.f15506u) {
                    break;
                }
                if (((a) iVar.g(i11)).getItemId() == i10) {
                    ((i) this.f726t).i(i11);
                    break;
                }
                i11++;
            }
        }
        this.f13411u.removeItem(i10);
    }

    @Override // android.view.Menu
    public final void setGroupCheckable(int i10, boolean z6, boolean z10) {
        this.f13411u.setGroupCheckable(i10, z6, z10);
    }

    @Override // android.view.Menu
    public final void setGroupEnabled(int i10, boolean z6) {
        this.f13411u.setGroupEnabled(i10, z6);
    }

    @Override // android.view.Menu
    public final void setGroupVisible(int i10, boolean z6) {
        this.f13411u.setGroupVisible(i10, z6);
    }

    @Override // android.view.Menu
    public final void setQwertyMode(boolean z6) {
        this.f13411u.setQwertyMode(z6);
    }

    @Override // android.view.Menu
    public final int size() {
        return this.f13411u.size();
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i10) {
        return this.f13411u.addSubMenu(i10);
    }

    @Override // android.view.Menu
    public final MenuItem add(int i10) {
        return h(this.f13411u.add(i10));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i10, int i11, int i12, CharSequence charSequence) {
        return this.f13411u.addSubMenu(i10, i11, i12, charSequence);
    }

    @Override // android.view.Menu
    public final MenuItem add(int i10, int i11, int i12, CharSequence charSequence) {
        return h(this.f13411u.a(i10, i11, i12, charSequence));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i10, int i11, int i12, int i13) {
        return this.f13411u.addSubMenu(i10, i11, i12, i13);
    }

    @Override // android.view.Menu
    public final MenuItem add(int i10, int i11, int i12, int i13) {
        return h(this.f13411u.add(i10, i11, i12, i13));
    }
}
