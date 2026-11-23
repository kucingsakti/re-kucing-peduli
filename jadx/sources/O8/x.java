package O8;

import A9.AbstractC0151y;
import A9.Z;
import L8.AbstractC0281o;
import L8.C0280n;
import L8.InterfaceC0268b;
import L8.InterfaceC0271e;
import L8.InterfaceC0276j;
import L8.InterfaceC0278l;
import com.unity3d.ads.metadata.MediationMetaData;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class x extends AbstractC0359o implements L8.I {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f3789u = 0;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final InterfaceC0276j f3790v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final p201u9.d f3791w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(InterfaceC0271e interfaceC0271e) {
        super(M8.g.a, p096j9.h.f12555d);
        if (interfaceC0271e == null) {
            N0(0);
            throw null;
        }
        this.f3790v = interfaceC0271e;
        this.f3791w = new p201u9.c(interfaceC0271e);
    }

    public static /* synthetic */ void N0(int i10) {
        String str = (i10 == 1 || i10 == 2) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i10 == 1 || i10 == 2) ? 2 : 3];
        if (i10 == 1 || i10 == 2) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/LazyClassReceiverParameterDescriptor";
        } else if (i10 != 3) {
            objArr[0] = "descriptor";
        } else {
            objArr[0] = "newOwner";
        }
        if (i10 == 1) {
            objArr[1] = "getValue";
        } else if (i10 != 2) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/LazyClassReceiverParameterDescriptor";
        } else {
            objArr[1] = "getContainingDeclaration";
        }
        if (i10 != 1 && i10 != 2) {
            if (i10 != 3) {
                objArr[2] = "<init>";
            } else {
                objArr[2] = "copy";
            }
        }
        String str2 = String.format(str, objArr);
        if (i10 != 1 && i10 != 2) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    public static /* synthetic */ void O0(int i10) {
        String str = (i10 == 7 || i10 == 8) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i10 == 7 || i10 == 8) ? 2 : 3];
        switch (i10) {
            case 1:
            case 4:
                objArr[0] = "value";
                break;
            case 2:
            case 5:
                objArr[0] = "annotations";
                break;
            case 3:
            default:
                objArr[0] = "containingDeclaration";
                break;
            case 6:
                objArr[0] = MediationMetaData.KEY_NAME;
                break;
            case 7:
            case 8:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ReceiverParameterDescriptorImpl";
                break;
            case 9:
                objArr[0] = "newOwner";
                break;
            case 10:
                objArr[0] = "outType";
                break;
        }
        if (i10 == 7) {
            objArr[1] = "getValue";
        } else if (i10 != 8) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ReceiverParameterDescriptorImpl";
        } else {
            objArr[1] = "getContainingDeclaration";
        }
        switch (i10) {
            case 7:
            case 8:
                break;
            case 9:
                objArr[2] = "copy";
                break;
            case 10:
                objArr[2] = "setOutType";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i10 != 7 && i10 != 8) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    public static /* synthetic */ void Y0(int i10) {
        String str;
        int i11;
        switch (i10) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                str = "@NotNull method %s.%s must not return null";
                break;
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i10) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                i11 = 2;
                break;
            default:
                i11 = 3;
                break;
        }
        Object[] objArr = new Object[i11];
        switch (i10) {
            case 2:
                objArr[0] = MediationMetaData.KEY_NAME;
                break;
            case 3:
                objArr[0] = "substitutor";
                break;
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractReceiverParameterDescriptor";
                break;
            default:
                objArr[0] = "annotations";
                break;
        }
        switch (i10) {
            case 4:
                objArr[1] = "getContextReceiverParameters";
                break;
            case 5:
                objArr[1] = "getTypeParameters";
                break;
            case 6:
                objArr[1] = "getType";
                break;
            case 7:
                objArr[1] = "getValueParameters";
                break;
            case 8:
                objArr[1] = "getOverriddenDescriptors";
                break;
            case 9:
                objArr[1] = "getVisibility";
                break;
            case 10:
                objArr[1] = "getOriginal";
                break;
            case 11:
                objArr[1] = "getSource";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractReceiverParameterDescriptor";
                break;
        }
        switch (i10) {
            case 3:
                objArr[2] = "substitute";
                break;
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i10) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                throw new IllegalStateException(str2);
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    @Override // L8.InterfaceC0268b
    public final x G() {
        return null;
    }

    @Override // L8.InterfaceC0268b
    public final List H0() {
        List list = Collections.EMPTY_LIST;
        if (list != null) {
            return list;
        }
        Y0(7);
        throw null;
    }

    @Override // L8.InterfaceC0268b
    public final x R() {
        return null;
    }

    @Override // L8.InterfaceC0268b
    public final boolean Z() {
        return false;
    }

    public final p201u9.d Z0() {
        switch (this.f3789u) {
            case 0:
                p201u9.c cVar = (p201u9.c) this.f3791w;
                if (cVar != null) {
                    return cVar;
                }
                N0(1);
                throw null;
            default:
                B1.a aVar = (B1.a) this.f3791w;
                if (aVar != null) {
                    return aVar;
                }
                O0(7);
                throw null;
        }
    }

    @Override // L8.O
    /* JADX INFO: renamed from: a1, reason: merged with bridge method [inline-methods] */
    public final x j(Z z6) {
        if (z6 == null) {
            Y0(3);
            throw null;
        }
        if (!z6.a.e()) {
            AbstractC0151y abstractC0151yI = v() instanceof InterfaceC0271e ? z6.i(3, getType()) : z6.i(1, getType());
            if (abstractC0151yI == null) {
                return null;
            }
            if (abstractC0151yI != getType()) {
                return new x(v(), new p201u9.e(abstractC0151yI), q());
            }
        }
        return this;
    }

    @Override // O8.AbstractC0359o, L8.InterfaceC0276j
    public final InterfaceC0268b c() {
        return this;
    }

    @Override // L8.InterfaceC0279m, L8.InterfaceC0288w
    public final C0280n f() {
        C0280n c0280n = AbstractC0281o.f2823f;
        if (c0280n != null) {
            return c0280n;
        }
        Y0(9);
        throw null;
    }

    @Override // L8.InterfaceC0277k
    public final L8.M g() {
        return L8.M.a;
    }

    @Override // B1.a, p201u9.d
    public final AbstractC0151y getType() {
        AbstractC0151y type = Z0().getType();
        if (type != null) {
            return type;
        }
        Y0(6);
        throw null;
    }

    @Override // L8.InterfaceC0276j
    public final Object k0(InterfaceC0278l interfaceC0278l, Object obj) {
        return interfaceC0278l.G(this, obj);
    }

    @Override // O8.AbstractC0359o
    public String toString() {
        switch (this.f3789u) {
            case 0:
                return "class " + ((InterfaceC0271e) this.f3790v).getName() + "::this";
            default:
                return super.toString();
        }
    }

    @Override // L8.InterfaceC0276j
    public final InterfaceC0276j v() {
        switch (this.f3789u) {
            case 0:
                InterfaceC0271e interfaceC0271e = (InterfaceC0271e) this.f3790v;
                if (interfaceC0271e != null) {
                    return interfaceC0271e;
                }
                N0(2);
                throw null;
            default:
                InterfaceC0276j interfaceC0276j = this.f3790v;
                if (interfaceC0276j != null) {
                    return interfaceC0276j;
                }
                O0(8);
                throw null;
        }
    }

    @Override // L8.InterfaceC0268b
    public final AbstractC0151y w() {
        return getType();
    }

    @Override // L8.InterfaceC0268b
    public final Collection x() {
        Set set = Collections.EMPTY_SET;
        if (set != null) {
            return set;
        }
        Y0(8);
        throw null;
    }

    @Override // L8.InterfaceC0268b
    public final List z() {
        List list = Collections.EMPTY_LIST;
        if (list != null) {
            return list;
        }
        Y0(5);
        throw null;
    }

    @Override // O8.AbstractC0359o, L8.InterfaceC0276j
    public final InterfaceC0276j c() {
        return this;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public x(InterfaceC0276j interfaceC0276j, B1.a aVar, M8.h hVar) {
        this(interfaceC0276j, aVar, hVar, p096j9.h.f12555d);
        if (interfaceC0276j == null) {
            O0(0);
            throw null;
        }
        if (hVar != null) {
        } else {
            O0(2);
            throw null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(InterfaceC0276j interfaceC0276j, B1.a aVar, M8.h hVar, p096j9.f fVar) {
        super(hVar, fVar);
        if (interfaceC0276j == null) {
            O0(3);
            throw null;
        }
        if (hVar == null) {
            O0(5);
            throw null;
        }
        if (fVar != null) {
            this.f3790v = interfaceC0276j;
            this.f3791w = aVar;
            return;
        }
        O0(6);
        throw null;
    }
}
