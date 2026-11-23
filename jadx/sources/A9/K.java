package A9;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class K extends G9.d {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final o1.c f338t = new o1.c(1);

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final K f339u = new K(p086i8.s.f12328s);

    public K(List list) {
        this.f1752s = G9.k.f1769s;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C0136i c0136i = (C0136i) it.next();
            c0136i.getClass();
            int iR = f338t.r(p210v8.u.a.b(C0136i.class));
            int iE = this.f1752s.e();
            if (iE != 0) {
                if (iE == 1) {
                    G9.a aVar = this.f1752s;
                    p210v8.i.d(aVar, "null cannot be cast to non-null type org.jetbrains.kotlin.util.OneElementArrayMap<T of org.jetbrains.kotlin.util.AttributeArrayOwner>");
                    G9.r rVar = (G9.r) aVar;
                    int i10 = rVar.f1780t;
                    if (i10 == iR) {
                        this.f1752s = new G9.r(iR, c0136i);
                    } else {
                        G9.c cVar = new G9.c();
                        cVar.f1750s = new Object[20];
                        cVar.f1751t = 0;
                        this.f1752s = cVar;
                        cVar.f(i10, rVar.f1779s);
                    }
                }
                this.f1752s.f(iR, c0136i);
            } else {
                this.f1752s = new G9.r(iR, c0136i);
            }
        }
    }
}
