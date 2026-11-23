package p091j3;

import android.view.SubMenu;
import p136o.l;
import p136o.n;

/* JADX INFO: loaded from: classes.dex */
public final class g extends l {
    @Override // p136o.l, android.view.Menu
    public final SubMenu addSubMenu(int i10, int i11, int i12, CharSequence charSequence) {
        n nVarA = a(i10, i11, i12, charSequence);
        u uVar = new u(this.f13507s, this, nVarA);
        nVarA.f13524G = uVar;
        uVar.setHeaderTitle(nVarA.f13542w);
        return uVar;
    }
}
