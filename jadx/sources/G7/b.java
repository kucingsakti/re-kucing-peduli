package G7;

import A0.m;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import p210v8.n;
import p210v8.u;
import p210v8.v;

/* JADX INFO: loaded from: classes.dex */
public final class b extends RecyclerView.a implements View.OnClickListener {

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public final /* synthetic */ c f1705M;

    static {
        v vVar = u.a;
        vVar.f(new n(vVar.b(b.class), "circle", "getCircle()Landroid/graphics/drawable/Drawable;"));
        vVar.f(new n(vVar.b(b.class), "check", "getCheck()Landroid/graphics/drawable/Drawable;"));
        vVar.f(new n(vVar.b(b.class), "noColor", "getNoColor()Landroid/graphics/drawable/Drawable;"));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, View view) {
        super(view);
        this.f1705M = cVar;
        D3.b.s(new a(view, 1));
        D3.b.s(new a(view, 0));
        D3.b.s(new a(view, 2));
        view.setOnClickListener(this);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        c cVar = this.f1705M;
        cVar.getClass();
        m mVar = cVar.f1708f;
        if (mVar != null) {
            mVar.invoke(Integer.valueOf(cVar.f1707e[c()]));
        }
        g gVar = cVar.f1706d;
        if (gVar != null) {
            gVar.g0();
        }
    }
}
