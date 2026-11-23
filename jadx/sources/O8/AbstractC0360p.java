package O8;

import L8.InterfaceC0276j;
import L8.InterfaceC0277k;
import com.unity3d.ads.metadata.MediationMetaData;

/* JADX INFO: renamed from: O8.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0360p extends AbstractC0359o implements InterfaceC0277k {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final InterfaceC0276j f3728u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final L8.M f3729v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC0360p(InterfaceC0276j interfaceC0276j, M8.h hVar, p096j9.f fVar, L8.M m2) {
        super(hVar, fVar);
        if (interfaceC0276j == null) {
            N0(0);
            throw null;
        }
        if (hVar == null) {
            N0(1);
            throw null;
        }
        if (fVar == null) {
            N0(2);
            throw null;
        }
        if (m2 == null) {
            N0(3);
            throw null;
        }
        this.f3728u = interfaceC0276j;
        this.f3729v = m2;
    }

    public static /* synthetic */ void N0(int i10) {
        String str = (i10 == 4 || i10 == 5 || i10 == 6) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i10 == 4 || i10 == 5 || i10 == 6) ? 2 : 3];
        switch (i10) {
            case 1:
                objArr[0] = "annotations";
                break;
            case 2:
                objArr[0] = MediationMetaData.KEY_NAME;
                break;
            case 3:
                objArr[0] = "source";
                break;
            case 4:
            case 5:
            case 6:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/DeclarationDescriptorNonRootImpl";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        if (i10 == 4) {
            objArr[1] = "getOriginal";
        } else if (i10 == 5) {
            objArr[1] = "getContainingDeclaration";
        } else if (i10 != 6) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/DeclarationDescriptorNonRootImpl";
        } else {
            objArr[1] = "getSource";
        }
        if (i10 != 4 && i10 != 5 && i10 != 6) {
            objArr[2] = "<init>";
        }
        String str2 = String.format(str, objArr);
        if (i10 != 4 && i10 != 5 && i10 != 6) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    public L8.M g() {
        L8.M m2 = this.f3729v;
        if (m2 != null) {
            return m2;
        }
        N0(6);
        throw null;
    }

    public InterfaceC0276j v() {
        InterfaceC0276j interfaceC0276j = this.f3728u;
        if (interfaceC0276j != null) {
            return interfaceC0276j;
        }
        N0(5);
        throw null;
    }

    @Override // O8.AbstractC0359o, L8.InterfaceC0276j
    /* JADX INFO: renamed from: Y0 */
    public InterfaceC0277k c() {
        return this;
    }
}
