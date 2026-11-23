package O8;

import A9.AbstractC0135h;
import A9.AbstractC0151y;
import L8.InterfaceC0273g;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: O8.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0353i extends AbstractC0135h {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final L8.N f3709c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ AbstractC0354j f3710d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0353i(AbstractC0354j abstractC0354j, p247z9.o oVar, L8.N n10) {
        super(oVar);
        if (oVar == null) {
            h(0);
            throw null;
        }
        this.f3710d = abstractC0354j;
        this.f3709c = n10;
    }

    public static /* synthetic */ void h(int i10) {
        String str = (i10 == 1 || i10 == 2 || i10 == 3 || i10 == 4 || i10 == 5 || i10 == 8) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i10 == 1 || i10 == 2 || i10 == 3 || i10 == 4 || i10 == 5 || i10 == 8) ? 2 : 3];
        switch (i10) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 8:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractTypeParameterDescriptor$TypeParameterTypeConstructor";
                break;
            case 6:
                objArr[0] = com.onesignal.inAppMessages.internal.display.impl.k.EVENT_TYPE_KEY;
                break;
            case 7:
                objArr[0] = "supertypes";
                break;
            case 9:
                objArr[0] = "classifier";
                break;
            default:
                objArr[0] = "storageManager";
                break;
        }
        if (i10 == 1) {
            objArr[1] = "computeSupertypes";
        } else if (i10 == 2) {
            objArr[1] = "getParameters";
        } else if (i10 == 3) {
            objArr[1] = "getDeclarationDescriptor";
        } else if (i10 == 4) {
            objArr[1] = "getBuiltIns";
        } else if (i10 == 5) {
            objArr[1] = "getSupertypeLoopChecker";
        } else if (i10 != 8) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractTypeParameterDescriptor$TypeParameterTypeConstructor";
        } else {
            objArr[1] = "processSupertypesWithoutCycles";
        }
        switch (i10) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 8:
                break;
            case 6:
                objArr[2] = "reportSupertypeLoopError";
                break;
            case 7:
                objArr[2] = "processSupertypesWithoutCycles";
                break;
            case 9:
                objArr[2] = "isSameClassifier";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i10 != 1 && i10 != 2 && i10 != 3 && i10 != 4 && i10 != 5 && i10 != 8) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // A9.AbstractC0135h
    public final Collection b() {
        List listA1 = this.f3710d.a1();
        if (listA1 != null) {
            return listA1;
        }
        h(1);
        throw null;
    }

    @Override // A9.AbstractC0135h
    public final AbstractC0151y c() {
        return C9.i.c(C9.h.CYCLIC_UPPER_BOUNDS, new String[0]);
    }

    @Override // A9.AbstractC0135h
    public final L8.N d() {
        L8.N n10 = this.f3709c;
        if (n10 != null) {
            return n10;
        }
        h(5);
        throw null;
    }

    @Override // A9.AbstractC0135h
    public final boolean f(InterfaceC0273g interfaceC0273g) {
        if (!(interfaceC0273g instanceof L8.P)) {
            return false;
        }
        AbstractC0354j abstractC0354j = this.f3710d;
        p210v8.i.f(abstractC0354j, R5.a.PUSH_ADDITIONAL_DATA_KEY);
        return p124m9.c.a.d(abstractC0354j, (L8.P) interfaceC0273g, true, p124m9.b.f13167s);
    }

    @Override // A9.AbstractC0135h
    public final List g(List list) {
        List listZ0 = this.f3710d.Z0(list);
        if (listZ0 != null) {
            return listZ0;
        }
        h(8);
        throw null;
    }

    @Override // A9.O
    public final I8.i s() {
        I8.i iVarE = p165q9.d.e(this.f3710d);
        if (iVarE != null) {
            return iVarE;
        }
        h(4);
        throw null;
    }

    public final String toString() {
        return this.f3710d.getName().f12551s;
    }

    @Override // A9.O
    public final List u() {
        List list = Collections.EMPTY_LIST;
        if (list != null) {
            return list;
        }
        h(2);
        throw null;
    }

    @Override // A9.O
    public final boolean v() {
        return true;
    }

    @Override // A9.O
    public final InterfaceC0273g w() {
        AbstractC0354j abstractC0354j = this.f3710d;
        if (abstractC0354j != null) {
            return abstractC0354j;
        }
        h(3);
        throw null;
    }
}
