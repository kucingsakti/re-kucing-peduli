package A9;

import L8.InterfaceC0271e;
import L8.InterfaceC0273g;
import L8.InterfaceC0276j;
import L8.InterfaceC0290y;

/* JADX INFO: renamed from: A9.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0129b extends AbstractC0135h {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC0129b(p247z9.l lVar) {
        super(lVar);
        if (lVar != null) {
        } else {
            h(0);
            throw null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x002f  */
    public static /* synthetic */ void h(int i10) {
        String str = (i10 == 1 || i10 == 3 || i10 == 4) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i10 == 1 || i10 == 3 || i10 == 4) ? 2 : 3];
        if (i10 == 1) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/types/AbstractClassTypeConstructor";
        } else if (i10 == 2) {
            objArr[0] = "classifier";
        } else if (i10 == 3 || i10 == 4) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/types/AbstractClassTypeConstructor";
        } else {
            objArr[0] = "storageManager";
        }
        if (i10 == 1) {
            objArr[1] = "getBuiltIns";
        } else if (i10 == 3 || i10 == 4) {
            objArr[1] = "getAdditionalNeighboursInSupertypeGraph";
        } else {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/types/AbstractClassTypeConstructor";
        }
        if (i10 != 1) {
            if (i10 == 2) {
                objArr[2] = "isSameClassifier";
            } else if (i10 != 3 && i10 != 4) {
                objArr[2] = "<init>";
            }
        }
        String str2 = String.format(str, objArr);
        if (i10 != 1 && i10 != 3 && i10 != 4) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // A9.AbstractC0135h
    public final AbstractC0151y c() {
        InterfaceC0271e interfaceC0271eW = w();
        if (interfaceC0271eW == null) {
            I8.i.a(107);
            throw null;
        }
        p096j9.f fVar = I8.i.f2112e;
        if (I8.i.b(interfaceC0271eW, I8.n.a) || I8.i.b(interfaceC0271eW, I8.n.f2164b)) {
            return null;
        }
        return s().e();
    }

    @Override // A9.AbstractC0135h
    public final boolean f(InterfaceC0273g interfaceC0273g) {
        boolean z6;
        if (interfaceC0273g instanceof InterfaceC0271e) {
            InterfaceC0271e interfaceC0271eW = w();
            p210v8.i.f(interfaceC0271eW, "first");
            if (!p210v8.i.a(interfaceC0271eW.getName(), interfaceC0273g.getName())) {
                z6 = false;
                break;
            }
            InterfaceC0276j interfaceC0276jV = interfaceC0271eW.v();
            InterfaceC0276j interfaceC0276jV2 = interfaceC0273g.v();
            while (true) {
                if (interfaceC0276jV != null && interfaceC0276jV2 != null) {
                    if (!(interfaceC0276jV instanceof InterfaceC0290y)) {
                        if (!(interfaceC0276jV2 instanceof InterfaceC0290y)) {
                            if (interfaceC0276jV instanceof L8.D) {
                                if (!(interfaceC0276jV2 instanceof L8.D) || !p210v8.i.a(((O8.E) ((L8.D) interfaceC0276jV)).f3634w, ((O8.E) ((L8.D) interfaceC0276jV2)).f3634w)) {
                                    break;
                                }
                            } else if (!(interfaceC0276jV2 instanceof L8.D) && p210v8.i.a(interfaceC0276jV.getName(), interfaceC0276jV2.getName())) {
                                interfaceC0276jV = interfaceC0276jV.v();
                                interfaceC0276jV2 = interfaceC0276jV2.v();
                            }
                        }
                        z6 = false;
                        break;
                    }
                    z6 = interfaceC0276jV2 instanceof InterfaceC0290y;
                    break;
                }
                z6 = true;
                break;
            }
            if (z6) {
                return true;
            }
        }
        return false;
    }

    @Override // A9.O
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public abstract InterfaceC0271e w();

    @Override // A9.O
    public final I8.i s() {
        I8.i iVarE = p165q9.d.e(w());
        if (iVarE != null) {
            return iVarE;
        }
        h(1);
        throw null;
    }
}
