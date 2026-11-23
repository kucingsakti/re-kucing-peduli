package p145o9;

import A9.AbstractC0151y;
import I8.n;
import L8.InterfaceC0273g;
import L8.InterfaceC0290y;
import java.util.List;
import p210v8.i;
import p210v8.k;

/* JADX INFO: loaded from: classes.dex */
public class b extends g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k f13828b;

    /* JADX WARN: Multi-variable type inference failed */
    public b(List list, p200u8.b bVar) {
        super(list);
        this.f13828b = (k) bVar;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [u8.b, v8.k] */
    @Override // p145o9.g
    public final AbstractC0151y a(InterfaceC0290y interfaceC0290y) {
        InterfaceC0273g interfaceC0273gW;
        i.f(interfaceC0290y, "module");
        AbstractC0151y abstractC0151y = (AbstractC0151y) this.f13828b.invoke(interfaceC0290y);
        if (!I8.i.y(abstractC0151y) && (((interfaceC0273gW = abstractC0151y.D().w()) == null || I8.i.r(interfaceC0273gW) == null) && !I8.i.B(abstractC0151y, n.f2158V.i()) && !I8.i.B(abstractC0151y, n.f2159W.i()) && !I8.i.B(abstractC0151y, n.f2160X.i()))) {
            I8.i.B(abstractC0151y, n.f2161Y.i());
        }
        return abstractC0151y;
    }
}
