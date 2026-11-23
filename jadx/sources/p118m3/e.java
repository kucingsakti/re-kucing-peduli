package p118m3;

import E0.a;
import android.content.Context;
import android.view.SubMenu;
import p136o.l;
import p136o.n;

/* JADX INFO: loaded from: classes.dex */
public final class e extends l {

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public final Class f13104R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public final int f13105S;

    public e(Context context, Class cls, int i10) {
        super(context);
        this.f13104R = cls;
        this.f13105S = i10;
    }

    @Override // p136o.l
    public final n a(int i10, int i11, int i12, CharSequence charSequence) {
        int size = this.f13512x.size() + 1;
        int i13 = this.f13105S;
        if (size <= i13) {
            y();
            n nVarA = super.a(i10, i11, i12, charSequence);
            nVarA.f(true);
            x();
            return nVarA;
        }
        String simpleName = this.f13104R.getSimpleName();
        StringBuilder sb = new StringBuilder("Maximum number of items supported by ");
        sb.append(simpleName);
        sb.append(" is ");
        sb.append(i13);
        sb.append(". Limit can be checked with ");
        throw new IllegalArgumentException(a.l(sb, simpleName, "#getMaxItemCount()"));
    }

    @Override // p136o.l, android.view.Menu
    public final SubMenu addSubMenu(int i10, int i11, int i12, CharSequence charSequence) {
        throw new UnsupportedOperationException(this.f13104R.getSimpleName().concat(" does not support submenus"));
    }
}
