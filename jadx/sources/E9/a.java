package E9;

import A9.d0;
import L8.InterfaceC0273g;
import L8.P;
import p200u8.b;
import p210v8.i;
import p210v8.k;
import p238y9.q;

/* JADX INFO: loaded from: classes.dex */
public final class a extends k implements b {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final a f1456t = new a(1, 0);

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final a f1457u = new a(1, 1);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f1458s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(int i10, int i11) {
        super(i10);
        this.f1458s = i11;
    }

    @Override // p200u8.b
    public final Object invoke(Object obj) {
        switch (this.f1458s) {
            case 0:
                d0 d0Var = (d0) obj;
                i.f(d0Var, "it");
                InterfaceC0273g interfaceC0273gW = d0Var.D().w();
                boolean z6 = false;
                if (interfaceC0273gW != null && (interfaceC0273gW instanceof P) && (((P) interfaceC0273gW).v() instanceof q)) {
                    z6 = true;
                }
                return Boolean.valueOf(z6);
            default:
                d0 d0Var2 = (d0) obj;
                i.f(d0Var2, "it");
                InterfaceC0273g interfaceC0273gW2 = d0Var2.D().w();
                boolean z10 = false;
                if (interfaceC0273gW2 != null && ((interfaceC0273gW2 instanceof q) || (interfaceC0273gW2 instanceof P))) {
                    z10 = true;
                }
                return Boolean.valueOf(z10);
        }
    }
}
