package O8;

import L8.InterfaceC0276j;
import com.unity3d.ads.metadata.MediationMetaData;

/* JADX INFO: renamed from: O8.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0359o extends B1.a implements InterfaceC0276j {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final p096j9.f f3727t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC0359o(M8.h hVar, p096j9.f fVar) {
        super(hVar);
        if (hVar == null) {
            N0(0);
            throw null;
        }
        if (fVar == null) {
            N0(1);
            throw null;
        }
        this.f3727t = fVar;
    }

    public static /* synthetic */ void N0(int i10) {
        String str = (i10 == 2 || i10 == 3 || i10 == 5 || i10 == 6) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i10 == 2 || i10 == 3 || i10 == 5 || i10 == 6) ? 2 : 3];
        switch (i10) {
            case 1:
                objArr[0] = MediationMetaData.KEY_NAME;
                break;
            case 2:
            case 3:
            case 5:
            case 6:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/DeclarationDescriptorImpl";
                break;
            case 4:
                objArr[0] = "descriptor";
                break;
            default:
                objArr[0] = "annotations";
                break;
        }
        if (i10 == 2) {
            objArr[1] = "getName";
        } else if (i10 == 3) {
            objArr[1] = "getOriginal";
        } else if (i10 == 5 || i10 == 6) {
            objArr[1] = "toString";
        } else {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/DeclarationDescriptorImpl";
        }
        if (i10 != 2 && i10 != 3) {
            if (i10 == 4) {
                objArr[2] = "toString";
            } else if (i10 != 5 && i10 != 6) {
                objArr[2] = "<init>";
            }
        }
        String str2 = String.format(str, objArr);
        if (i10 != 2 && i10 != 3 && i10 != 5 && i10 != 6) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    public static String X0(InterfaceC0276j interfaceC0276j) {
        try {
            String str = p114l9.g.f12984e.w(interfaceC0276j) + "[" + interfaceC0276j.getClass().getSimpleName() + "@" + Integer.toHexString(System.identityHashCode(interfaceC0276j)) + "]";
            if (str != null) {
                return str;
            }
            N0(5);
            throw null;
        } catch (Throwable unused) {
            String str2 = interfaceC0276j.getClass().getSimpleName() + " " + interfaceC0276j.getName();
            if (str2 != null) {
                return str2;
            }
            N0(6);
            throw null;
        }
    }

    @Override // L8.InterfaceC0276j
    public final p096j9.f getName() {
        p096j9.f fVar = this.f3727t;
        if (fVar != null) {
            return fVar;
        }
        N0(2);
        throw null;
    }

    public String toString() {
        return X0(this);
    }

    public InterfaceC0276j c() {
        return this;
    }
}
