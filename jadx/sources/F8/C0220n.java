package F8;

import L8.AbstractC0281o;
import L8.InterfaceC0276j;

/* JADX INFO: renamed from: F8.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0220n extends t0 {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final L8.K f1607t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final p047e9.G f1608u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final h9.e f1609v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final p067g9.f f1610w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final p067g9.g f1611x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final String f1612y;

    /* JADX WARN: Code duplicated, block: B:25:0x00e0  */
    public C0220n(L8.K k3, p047e9.G g8, h9.e eVar, p067g9.f fVar, p067g9.g gVar) {
        String string;
        String string2;
        p210v8.i.f(g8, "proto");
        p210v8.i.f(fVar, "nameResolver");
        p210v8.i.f(gVar, "typeTable");
        this.f1607t = k3;
        this.f1608u = g8;
        this.f1609v = eVar;
        this.f1610w = fVar;
        this.f1611x = gVar;
        if ((eVar.f11834t & 4) == 4) {
            string2 = fVar.getString(eVar.f11837w.f11820u).concat(fVar.getString(eVar.f11837w.f11821v));
        } else {
            i9.d dVarB = i9.h.b(g8, fVar, gVar, true);
            if (dVarB == null) {
                throw new p0("No field signature for property: " + k3, 0);
            }
            StringBuilder sb = new StringBuilder();
            sb.append(U8.w.a(dVarB.f12333b));
            InterfaceC0276j interfaceC0276jV = k3.v();
            p210v8.i.e(interfaceC0276jV, "descriptor.containingDeclaration");
            if (p210v8.i.a(k3.f(), AbstractC0281o.f2821d) && (interfaceC0276jV instanceof p238y9.g)) {
                p104k9.m mVar = h9.k.f11885i;
                p210v8.i.e(mVar, "classModuleName");
                Integer num = (Integer) xa.d.m(((p238y9.g) interfaceC0276jV).f16079w, mVar);
                String strReplaceAll = p096j9.g.a.f2855s.matcher(num != null ? fVar.getString(num.intValue()) : "main").replaceAll("_");
                p210v8.i.e(strReplaceAll, "replaceAll(...)");
                string = "$".concat(strReplaceAll);
            } else if (p210v8.i.a(k3.f(), AbstractC0281o.a) && (interfaceC0276jV instanceof L8.D)) {
                p029c9.f fVar2 = ((p238y9.o) k3).f16108W;
                if (!(fVar2 instanceof p029c9.f) || fVar2.f7550t == null) {
                    string = "";
                } else {
                    StringBuilder sb2 = new StringBuilder("$");
                    String strE = fVar2.f7549s.e();
                    p210v8.i.e(strE, "className.internalName");
                    sb2.append(p096j9.f.j(L9.f.f0(strE, '/', strE)).g());
                    string = sb2.toString();
                }
            } else {
                string = "";
            }
            sb.append(string);
            sb.append("()");
            sb.append(dVarB.f12334c);
            string2 = sb.toString();
        }
        this.f1612y = string2;
    }

    @Override // F8.t0
    public final String d() {
        return this.f1612y;
    }
}
