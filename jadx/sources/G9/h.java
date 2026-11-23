package G9;

import A9.AbstractC0151y;
import A9.D;
import A9.d0;
import L8.AbstractC0287v;
import L8.InterfaceC0271e;
import L8.InterfaceC0273g;
import L8.InterfaceC0276j;
import L8.InterfaceC0285t;
import O8.AbstractC0359o;
import O8.U;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class h extends p210v8.k implements p200u8.b {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f1764s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final h f1757t = new h(1, 0);

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final h f1758u = new h(1, 1);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final h f1759v = new h(1, 2);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final h f1760w = new h(1, 3);

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final h f1761x = new h(1, 4);

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final h f1762y = new h(1, 5);

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final h f1763z = new h(1, 6);

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static final h f1755A = new h(1, 7);

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public static final h f1756B = new h(1, 8);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(int i10, int i11) {
        super(i10);
        this.f1764s = i11;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x0099  */
    /* JADX WARN: Code duplicated, block: B:41:0x009d  */
    /* JADX WARN: Code duplicated, block: B:50:0x00c5  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // p200u8.b
    public final Object invoke(Object obj) {
        boolean z6;
        D dP;
        d0 d0VarY;
        AbstractC0151y abstractC0151yW;
        boolean zB;
        p096j9.b bVarF;
        AbstractC0151y abstractC0151yW2;
        boolean z10 = true;
        switch (this.f1764s) {
            case 0:
                p210v8.i.f((InterfaceC0285t) obj, "$this$null");
                return null;
            case 1:
                p210v8.i.f((InterfaceC0285t) obj, "$this$null");
                return null;
            case 2:
                p210v8.i.f((InterfaceC0285t) obj, "$this$null");
                return null;
            case 3:
                InterfaceC0285t interfaceC0285t = (InterfaceC0285t) obj;
                p210v8.i.f(interfaceC0285t, "$this$$receiver");
                List listH0 = interfaceC0285t.H0();
                p210v8.i.e(listH0, "valueParameters");
                U u3 = (U) p086i8.k.c0(listH0);
                z10 = (u3 == null || p165q9.d.a(u3) || u3.f3689B != null) ? false : true;
                List list = s.f1781b;
                if (z10) {
                    return null;
                }
                return "last parameter should not have a default value or be a vararg";
            case 4:
                InterfaceC0285t interfaceC0285t2 = (InterfaceC0285t) obj;
                p210v8.i.f(interfaceC0285t2, "$this$$receiver");
                List list2 = s.f1781b;
                InterfaceC0276j interfaceC0276jV = interfaceC0285t2.v();
                p210v8.i.e(interfaceC0276jV, "containingDeclaration");
                if (interfaceC0276jV instanceof InterfaceC0271e) {
                    p096j9.f fVar = I8.i.f2112e;
                    if (I8.i.b((InterfaceC0271e) interfaceC0276jV, I8.n.a)) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                } else {
                    z6 = false;
                }
                if (z6) {
                    return null;
                }
                Collection collectionX = interfaceC0285t2.x();
                p210v8.i.e(collectionX, "overriddenDescriptors");
                Collection collection = collectionX;
                if (!collection.isEmpty()) {
                    Iterator it = collection.iterator();
                    while (it.hasNext()) {
                        InterfaceC0276j interfaceC0276jV2 = ((InterfaceC0285t) it.next()).v();
                        p210v8.i.e(interfaceC0276jV2, "it.containingDeclaration");
                        if (interfaceC0276jV2 instanceof InterfaceC0271e) {
                            p096j9.f fVar2 = I8.i.f2112e;
                            if (I8.i.b((InterfaceC0271e) interfaceC0276jV2, I8.n.a)) {
                                return null;
                            }
                        }
                    }
                }
                InterfaceC0276j interfaceC0276jV3 = interfaceC0285t2.v();
                InterfaceC0271e interfaceC0271e = interfaceC0276jV3 instanceof InterfaceC0271e ? (InterfaceC0271e) interfaceC0276jV3 : null;
                if (interfaceC0271e != null) {
                    if (!p124m9.g.e(interfaceC0271e)) {
                        interfaceC0271e = null;
                    }
                    if (interfaceC0271e != null && (dP = interfaceC0271e.p()) != null && (d0VarY = qa.b.y(dP)) != null && (abstractC0151yW = interfaceC0285t2.w()) != null && p210v8.i.a(((AbstractC0359o) interfaceC0285t2).getName(), t.f1784d)) {
                        p096j9.f fVar3 = I8.i.f2112e;
                        if ((I8.i.B(abstractC0151yW, I8.n.f2171h) || I8.i.E(abstractC0151yW)) && interfaceC0285t2.H0().size() == 1) {
                            AbstractC0151y type = ((U) interfaceC0285t2.H0().get(0)).getType();
                            p210v8.i.e(type, "valueParameters[0].type");
                            if (p210v8.i.a(qa.b.y(type), d0VarY) && interfaceC0285t2.b0().isEmpty() && interfaceC0285t2.R() == null) {
                                return null;
                            }
                        }
                    }
                }
                StringBuilder sb = new StringBuilder("must override ''equals()'' in Any");
                InterfaceC0276j interfaceC0276jV4 = interfaceC0285t2.v();
                p210v8.i.e(interfaceC0276jV4, "containingDeclaration");
                if (p124m9.g.e(interfaceC0276jV4)) {
                    p114l9.g gVar = p114l9.g.f12983d;
                    InterfaceC0276j interfaceC0276jV5 = interfaceC0285t2.v();
                    p210v8.i.d(interfaceC0276jV5, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                    D dP2 = ((InterfaceC0271e) interfaceC0276jV5).p();
                    p210v8.i.e(dP2, "containingDeclaration as…ssDescriptor).defaultType");
                    sb.append(" or define ''equals(other: " + gVar.Y(qa.b.y(dP2)) + "): Boolean''");
                }
                String string = sb.toString();
                p210v8.i.e(string, "StringBuilder().apply(builderAction).toString()");
                return string;
            case 5:
                InterfaceC0285t interfaceC0285t3 = (InterfaceC0285t) obj;
                p210v8.i.f(interfaceC0285t3, "$this$$receiver");
                O8.x xVarG = interfaceC0285t3.G();
                if (xVarG == null) {
                    xVarG = interfaceC0285t3.R();
                }
                List list3 = s.f1781b;
                if (xVarG == null) {
                    z10 = false;
                } else {
                    AbstractC0151y abstractC0151yW3 = interfaceC0285t3.w();
                    if (!(abstractC0151yW3 != null ? B9.d.a.b(abstractC0151yW3, xVarG.getType()) : false)) {
                        p201u9.d dVarZ0 = xVarG.Z0();
                        p210v8.i.e(dVarZ0, "receiver.value");
                        if (dVarZ0 instanceof p201u9.c) {
                            InterfaceC0271e interfaceC0271e2 = ((p201u9.c) dVarZ0).f15361s;
                            if (interfaceC0271e2.i0() && (bVarF = p165q9.d.f(interfaceC0271e2)) != null) {
                                InterfaceC0273g interfaceC0273gE = AbstractC0287v.e(p165q9.d.j(interfaceC0271e2), bVarF);
                                p238y9.q qVar = interfaceC0273gE instanceof p238y9.q ? (p238y9.q) interfaceC0273gE : null;
                                if (qVar == null || (abstractC0151yW2 = interfaceC0285t3.w()) == null) {
                                    zB = false;
                                } else {
                                    zB = B9.d.a.b(abstractC0151yW2, qVar.a1());
                                }
                            } else {
                                zB = false;
                            }
                        } else {
                            zB = false;
                        }
                        if (!zB) {
                            z10 = false;
                        }
                    }
                }
                if (z10) {
                    return null;
                }
                return "receiver must be a supertype of the return type";
            case 6:
                I8.i iVar = (I8.i) obj;
                p210v8.i.f(iVar, "$this$null");
                return iVar.s(I8.k.BOOLEAN);
            case 7:
                I8.i iVar2 = (I8.i) obj;
                p210v8.i.f(iVar2, "$this$null");
                return iVar2.s(I8.k.INT);
            default:
                I8.i iVar3 = (I8.i) obj;
                p210v8.i.f(iVar3, "$this$null");
                return iVar3.w();
        }
    }
}
