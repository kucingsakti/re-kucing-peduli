package O8;

import L8.InterfaceC0276j;
import com.unity3d.ads.metadata.MediationMetaData;

/* JADX INFO: renamed from: O8.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0347c extends AbstractC0354j {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC0347c(p247z9.l lVar, InterfaceC0276j interfaceC0276j, M8.h hVar, p096j9.f fVar, int i10, boolean z6, int i11, L8.N n10) {
        super(lVar, interfaceC0276j, hVar, fVar, i10, z6, i11, n10);
        if (lVar == null) {
            N0(0);
            throw null;
        }
        if (interfaceC0276j == null) {
            N0(1);
            throw null;
        }
        if (i10 == 0) {
            N0(4);
            throw null;
        }
        if (n10 != null) {
        } else {
            N0(6);
            throw null;
        }
    }

    public static /* synthetic */ void N0(int i10) {
        Object[] objArr = new Object[3];
        switch (i10) {
            case 1:
                objArr[0] = "containingDeclaration";
                break;
            case 2:
                objArr[0] = "annotations";
                break;
            case 3:
                objArr[0] = MediationMetaData.KEY_NAME;
                break;
            case 4:
                objArr[0] = "variance";
                break;
            case 5:
                objArr[0] = "source";
                break;
            case 6:
                objArr[0] = "supertypeLoopChecker";
                break;
            default:
                objArr[0] = "storageManager";
                break;
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractLazyTypeParameterDescriptor";
        objArr[2] = "<init>";
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    @Override // O8.AbstractC0359o
    public final String toString() {
        return (this.f3714x ? "reified " : "") + (j0() != 1 ? E0.a.r(j0()).concat(" ") : "") + getName();
    }
}
