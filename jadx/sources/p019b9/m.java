package p019b9;

import A9.AbstractC0151y;
import A9.d0;
import K8.d;
import L8.InterfaceC0269c;
import L8.InterfaceC0273g;
import O8.x;
import p096j9.c;
import p096j9.f;
import p200u8.b;
import p210v8.i;
import p210v8.k;

/* JADX INFO: loaded from: classes.dex */
public final class m extends k implements b {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final m f7345t = new m(1, 0);

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final m f7346u = new m(1, 1);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final m f7347v = new m(1, 2);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final m f7348w = new m(1, 3);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f7349s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m(int i10, int i11) {
        super(i10);
        this.f7349s = i11;
    }

    @Override // p200u8.b
    public final Object invoke(Object obj) {
        switch (this.f7349s) {
            case 0:
                InterfaceC0273g interfaceC0273gW = ((d0) obj).D().w();
                if (interfaceC0273gW == null) {
                    return Boolean.FALSE;
                }
                f name = interfaceC0273gW.getName();
                c cVar = d.f2630f;
                return Boolean.valueOf(i.a(name, cVar.f()) && i.a(p165q9.d.c(interfaceC0273gW), cVar));
            case 1:
                InterfaceC0269c interfaceC0269c = (InterfaceC0269c) obj;
                i.f(interfaceC0269c, "it");
                x xVarR = interfaceC0269c.R();
                i.c(xVarR);
                return xVarR.getType();
            case 2:
                InterfaceC0269c interfaceC0269c2 = (InterfaceC0269c) obj;
                i.f(interfaceC0269c2, "it");
                AbstractC0151y abstractC0151yW = interfaceC0269c2.w();
                i.c(abstractC0151yW);
                return abstractC0151yW;
            case 3:
                d0 d0Var = (d0) obj;
                i.f(d0Var, "it");
                return Boolean.valueOf(d0Var instanceof Z8.f);
            default:
                n nVar = (n) obj;
                i.f(nVar, "$this$function");
                String strConcat = "java/util/".concat("Spliterator");
                e eVar = k.f7341b;
                nVar.b(strConcat, eVar, eVar);
                return p076h8.m.a;
        }
    }
}
