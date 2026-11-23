package O8;

import L8.InterfaceC0276j;
import com.unity3d.ads.metadata.MediationMetaData;

/* JADX INFO: renamed from: O8.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0356l extends AbstractC0346b {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final InterfaceC0276j f3718w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final L8.M f3719x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC0356l(p247z9.l lVar, InterfaceC0276j interfaceC0276j, p096j9.f fVar, L8.M m2) {
        super(lVar, fVar);
        if (lVar == null) {
            d(0);
            throw null;
        }
        if (interfaceC0276j == null) {
            d(1);
            throw null;
        }
        if (fVar == null) {
            d(2);
            throw null;
        }
        this.f3718w = interfaceC0276j;
        this.f3719x = m2;
    }

    public static /* synthetic */ void d(int i10) {
        String str = (i10 == 4 || i10 == 5) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i10 == 4 || i10 == 5) ? 2 : 3];
        if (i10 == 1) {
            objArr[0] = "containingDeclaration";
        } else if (i10 == 2) {
            objArr[0] = MediationMetaData.KEY_NAME;
        } else if (i10 == 3) {
            objArr[0] = "source";
        } else if (i10 == 4 || i10 == 5) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ClassDescriptorBase";
        } else {
            objArr[0] = "storageManager";
        }
        if (i10 == 4) {
            objArr[1] = "getContainingDeclaration";
        } else if (i10 != 5) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ClassDescriptorBase";
        } else {
            objArr[1] = "getSource";
        }
        if (i10 != 4 && i10 != 5) {
            objArr[2] = "<init>";
        }
        String str2 = String.format(str, objArr);
        if (i10 != 4 && i10 != 5) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    public boolean F() {
        return false;
    }

    @Override // L8.InterfaceC0277k
    public final L8.M g() {
        L8.M m2 = this.f3719x;
        if (m2 != null) {
            return m2;
        }
        d(5);
        throw null;
    }

    @Override // L8.InterfaceC0276j
    public final InterfaceC0276j v() {
        InterfaceC0276j interfaceC0276j = this.f3718w;
        if (interfaceC0276j != null) {
            return interfaceC0276j;
        }
        d(4);
        throw null;
    }
}
