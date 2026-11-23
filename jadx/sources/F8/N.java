package F8;

import B4.C0157e;

/* JADX INFO: loaded from: classes.dex */
public final class N extends p210v8.k implements p200u8.a {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f1529s = 1;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ P f1530t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ S f1531u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public N(P p10, S s9) {
        super(0);
        this.f1530t = p10;
        this.f1531u = s9;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0029  */
    @Override // p200u8.a
    public final Object invoke() {
        String str;
        switch (this.f1529s) {
            case 0:
                P p10 = this.f1530t;
                p10.getClass();
                C8.u uVar = P.f1534g[1];
                Object objInvoke = p10.f1536d.invoke();
                p210v8.i.e(objInvoke, "<get-scope>(...)");
                return this.f1531u.g((t9.n) objInvoke, 1);
            default:
                P p11 = this.f1530t;
                p11.getClass();
                C8.u uVar2 = P.f1534g[0];
                Q8.b bVar = (Q8.b) p11.f1535c.invoke();
                if (bVar != null) {
                    C0157e c0157e = bVar.f4340b;
                    if (((p037d9.a) c0157e.f665b) == p037d9.a.MULTIFILE_CLASS_PART) {
                        str = (String) c0157e.f671h;
                    } else {
                        str = null;
                    }
                } else {
                    str = null;
                }
                if (str == null || str.length() <= 0) {
                    return null;
                }
                return this.f1531u.f1540t.getClassLoader().loadClass(L9.n.F(str, '/', '.'));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public N(S s9, P p10) {
        super(0);
        this.f1531u = s9;
        this.f1530t = p10;
    }
}
