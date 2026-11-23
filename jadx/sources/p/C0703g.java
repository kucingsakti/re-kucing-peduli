package p;

import android.content.Context;
import android.view.View;
import com.kcstream.cing.R;

/* JADX INFO: renamed from: p.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0703g extends p136o.v {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f14062l = 0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ androidx.appcompat.widget.b f14063m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0703g(androidx.appcompat.widget.b bVar, Context context, p136o.l lVar, View view) {
        super(R.attr.actionOverflowMenuStyle, context, view, lVar, true);
        this.f14063m = bVar;
        this.f13561f = 8388613;
        p102k7.e eVar = bVar.P;
        this.f13563h = eVar;
        p136o.t tVar = this.f13564i;
        if (tVar != null) {
            tVar.h(eVar);
        }
    }

    @Override // p136o.v
    public final void c() {
        switch (this.f14062l) {
            case 0:
                androidx.appcompat.widget.b bVar = this.f14063m;
                bVar.f6265M = null;
                bVar.f6268Q = 0;
                super.c();
                break;
            default:
                androidx.appcompat.widget.b bVar2 = this.f14063m;
                p136o.l lVar = bVar2.f6271u;
                if (lVar != null) {
                    lVar.c(true);
                }
                bVar2.f6264L = null;
                super.c();
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0703g(androidx.appcompat.widget.b bVar, Context context, p136o.D d3, View view) {
        super(R.attr.actionOverflowMenuStyle, context, view, d3, false);
        this.f14063m = bVar;
        if ((d3.f13432S.P & 32) != 32) {
            View view2 = bVar.f6254B;
            this.f13560e = view2 == null ? (View) bVar.f6276z : view2;
        }
        p102k7.e eVar = bVar.P;
        this.f13563h = eVar;
        p136o.t tVar = this.f13564i;
        if (tVar != null) {
            tVar.h(eVar);
        }
    }
}
