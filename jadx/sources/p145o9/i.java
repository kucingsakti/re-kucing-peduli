package p145o9;

import A9.AbstractC0151y;
import A9.D;
import C9.h;
import L8.AbstractC0287v;
import L8.InterfaceC0271e;
import L8.InterfaceC0290y;
import p096j9.b;
import p096j9.f;
import p124m9.e;

/* JADX INFO: loaded from: classes.dex */
public final class i extends g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f13831b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f f13832c;

    public i(b bVar, f fVar) {
        super(new p076h8.f(bVar, fVar));
        this.f13831b = bVar;
        this.f13832c = fVar;
    }

    @Override // p145o9.g
    public final AbstractC0151y a(InterfaceC0290y interfaceC0290y) {
        p210v8.i.f(interfaceC0290y, "module");
        b bVar = this.f13831b;
        InterfaceC0271e interfaceC0271eD = AbstractC0287v.d(interfaceC0290y, bVar);
        D dP = null;
        if (interfaceC0271eD != null) {
            if (!e.n(interfaceC0271eD, 3)) {
                interfaceC0271eD = null;
            }
            if (interfaceC0271eD != null) {
                dP = interfaceC0271eD.p();
            }
        }
        if (dP != null) {
            return dP;
        }
        h hVar = h.ERROR_ENUM_TYPE;
        String string = bVar.toString();
        p210v8.i.e(string, "enumClassId.toString()");
        String str = this.f13832c.f12551s;
        p210v8.i.e(str, "enumEntryName.toString()");
        return C9.i.c(hVar, string, str);
    }

    @Override // p145o9.g
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f13831b.i());
        sb.append('.');
        sb.append(this.f13832c);
        return sb.toString();
    }
}
