package O8;

import A9.AbstractC0151y;
import L8.InterfaceC0276j;
import com.unity3d.ads.metadata.MediationMetaData;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class V extends AbstractC0360p implements L8.T {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public AbstractC0151y f3694w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public V(InterfaceC0276j interfaceC0276j, M8.h hVar, p096j9.f fVar, AbstractC0151y abstractC0151y, L8.M m2) {
        super(interfaceC0276j, hVar, fVar, m2);
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
        this.f3694w = abstractC0151y;
    }

    public static /* synthetic */ void N0(int i10) {
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
                i11 = 2;
                break;
            default:
                i11 = 3;
                break;
        }
        Object[] objArr = new Object[i11];
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
            case 7:
            case 8:
            case 9:
            case 10:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/VariableDescriptorImpl";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        switch (i10) {
            case 4:
                objArr[1] = "getType";
                break;
            case 5:
                objArr[1] = "getOriginal";
                break;
            case 6:
                objArr[1] = "getValueParameters";
                break;
            case 7:
                objArr[1] = "getOverriddenDescriptors";
                break;
            case 8:
                objArr[1] = "getTypeParameters";
                break;
            case 9:
                objArr[1] = "getContextReceiverParameters";
                break;
            case 10:
                objArr[1] = "getReturnType";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/VariableDescriptorImpl";
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
                throw new IllegalStateException(str2);
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    public x G() {
        return null;
    }

    @Override // L8.InterfaceC0268b
    public final List H0() {
        List list = Collections.EMPTY_LIST;
        if (list != null) {
            return list;
        }
        N0(6);
        throw null;
    }

    public x R() {
        return null;
    }

    @Override // L8.InterfaceC0268b
    public boolean Z() {
        return false;
    }

    @Override // B1.a, p201u9.d
    public final AbstractC0151y getType() {
        AbstractC0151y abstractC0151y = this.f3694w;
        if (abstractC0151y != null) {
            return abstractC0151y;
        }
        N0(4);
        throw null;
    }

    public AbstractC0151y w() {
        AbstractC0151y type = getType();
        if (type != null) {
            return type;
        }
        N0(10);
        throw null;
    }

    public List z() {
        List list = Collections.EMPTY_LIST;
        if (list != null) {
            return list;
        }
        N0(8);
        throw null;
    }
}
