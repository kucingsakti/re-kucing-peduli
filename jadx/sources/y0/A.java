package y0;

import android.os.Bundle;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Ly0/A;", "Ly0/O;", "Ly0/z;", "navigation-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@N("navigation")
public class A extends O {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final P f15830c;

    public A(P p10) {
        this.f15830c = p10;
    }

    @Override // y0.O
    public final x a() {
        return new z(this);
    }

    @Override // y0.O
    public final void d(List list, D d3) {
        String strValueOf;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C0872j c0872j = (C0872j) it.next();
            x xVar = c0872j.f15928t;
            p210v8.i.d(xVar, "null cannot be cast to non-null type androidx.navigation.NavGraph");
            z zVar = (z) xVar;
            Bundle bundleB = c0872j.b();
            int i10 = zVar.f16008D;
            if (i10 == 0) {
                StringBuilder sb = new StringBuilder("no start destination defined via app:startDestination for ");
                int i11 = zVar.f16002z;
                if (i11 != 0) {
                    strValueOf = zVar.f15997u;
                    if (strValueOf == null) {
                        strValueOf = String.valueOf(i11);
                    }
                } else {
                    strValueOf = "the root navigation";
                }
                sb.append(strValueOf);
                throw new IllegalStateException(sb.toString().toString());
            }
            x xVar2 = (x) zVar.f16007C.d(i10);
            if (xVar2 == null) {
                if (zVar.f16009E == null) {
                    zVar.f16009E = String.valueOf(zVar.f16008D);
                }
                String str = zVar.f16009E;
                p210v8.i.c(str);
                throw new IllegalArgumentException(E0.a.i("navigation destination ", str, " is not a direct child of this NavGraph"));
            }
            O oB = this.f15830c.b(xVar2.f15995s);
            C0874l c0874lB = b();
            Bundle bundleE = xVar2.e(bundleB);
            B b3 = c0874lB.f15944h;
            oB.d(com.bumptech.glide.d.u(p204v1.g.l(b3.a, xVar2, bundleE, b3.i(), b3.f15846o)), d3);
        }
    }
}
