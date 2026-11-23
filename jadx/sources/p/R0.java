package p;

import android.view.View;
import androidx.appcompat.widget.Toolbar;

/* JADX INFO: loaded from: classes.dex */
public final class R0 implements View.OnClickListener {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Toolbar f13981s;

    public R0(Toolbar toolbar) {
        this.f13981s = toolbar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        T0 t7 = this.f13981s.f6231h0;
        p136o.n nVar = t7 == null ? null : t7.f13994t;
        if (nVar != null) {
            nVar.collapseActionView();
        }
    }
}
