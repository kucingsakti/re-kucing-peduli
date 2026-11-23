package O8;

import A9.AbstractC0151y;
import L8.C0280n;
import L8.InterfaceC0278l;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class L extends I implements L8.J {

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public AbstractC0151y f3675E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public final L f3676F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public L(L8.K k3, M8.h hVar, int i10, C0280n c0280n, boolean z6, boolean z10, boolean z11, int i11, L l4, L8.M m2) {
        super(i10, c0280n, k3, hVar, p096j9.f.l("<get-" + k3.getName() + ">"), z6, z10, z11, i11, m2);
        if (hVar == null) {
            N0(1);
            throw null;
        }
        if (i10 == 0) {
            N0(2);
            throw null;
        }
        if (c0280n == null) {
            N0(3);
            throw null;
        }
        if (i11 == 0) {
            N0(4);
            throw null;
        }
        if (m2 == null) {
            N0(5);
            throw null;
        }
        this.f3676F = l4 != null ? l4 : this;
    }

    public static /* synthetic */ void N0(int i10) {
        String str = (i10 == 6 || i10 == 7 || i10 == 8) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i10 == 6 || i10 == 7 || i10 == 8) ? 2 : 3];
        switch (i10) {
            case 1:
                objArr[0] = "annotations";
                break;
            case 2:
                objArr[0] = "modality";
                break;
            case 3:
                objArr[0] = "visibility";
                break;
            case 4:
                objArr[0] = "kind";
                break;
            case 5:
                objArr[0] = "source";
                break;
            case 6:
            case 7:
            case 8:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyGetterDescriptorImpl";
                break;
            default:
                objArr[0] = "correspondingProperty";
                break;
        }
        if (i10 == 6) {
            objArr[1] = "getOverriddenDescriptors";
        } else if (i10 == 7) {
            objArr[1] = "getValueParameters";
        } else if (i10 != 8) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyGetterDescriptorImpl";
        } else {
            objArr[1] = "getOriginal";
        }
        if (i10 != 6 && i10 != 7 && i10 != 8) {
            objArr[2] = "<init>";
        }
        String str2 = String.format(str, objArr);
        if (i10 != 6 && i10 != 7 && i10 != 8) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // L8.InterfaceC0268b
    public final List H0() {
        List list = Collections.EMPTY_LIST;
        if (list != null) {
            return list;
        }
        N0(7);
        throw null;
    }

    @Override // O8.AbstractC0360p, O8.AbstractC0359o, L8.InterfaceC0276j
    /* JADX INFO: renamed from: b1, reason: merged with bridge method [inline-methods] */
    public final L c() {
        L l4 = this.f3676F;
        if (l4 != null) {
            return l4;
        }
        N0(8);
        throw null;
    }

    public final void c1(AbstractC0151y abstractC0151y) {
        if (abstractC0151y == null) {
            abstractC0151y = Z0().getType();
        }
        this.f3675E = abstractC0151y;
    }

    @Override // L8.InterfaceC0276j
    public final Object k0(InterfaceC0278l interfaceC0278l, Object obj) {
        return interfaceC0278l.j(this, obj);
    }

    @Override // L8.InterfaceC0268b
    public final AbstractC0151y w() {
        return this.f3675E;
    }

    @Override // L8.InterfaceC0269c, L8.InterfaceC0268b
    public final Collection x() {
        return a1(true);
    }
}
