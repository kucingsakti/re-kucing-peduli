package N9;

/* JADX INFO: renamed from: N9.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0330m extends k0 implements InterfaceC0329l {
    public final Object Q(p123m8.d dVar) throws Throwable {
        Object objY;
        do {
            objY = y();
            if (!(objY instanceof Y)) {
                if (objY instanceof C0333p) {
                    throw ((C0333p) objY).a;
                }
                return AbstractC0342z.u(objY);
            }
        } while (N(objY) < 0);
        g0 g0Var = new g0(qa.b.q(dVar), this);
        g0Var.w();
        g0Var.y(new C0322e(C(false, true, new L(g0Var, 2)), 1));
        return g0Var.v();
    }
}
