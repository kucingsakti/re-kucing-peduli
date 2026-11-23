package O8;

import A9.AbstractC0130c;
import L8.InterfaceC0276j;
import com.unity3d.ads.metadata.MediationMetaData;
import com.unity3d.services.ads.gmascar.bridges.mobileads.MobileAdsBridge;
import java.util.ArrayList;
import java.util.List;
import org.chromium.net.UrlRequest;

/* JADX INFO: loaded from: classes.dex */
public final class S extends AbstractC0354j {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final ArrayList f3685C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public boolean f3686D;

    /* JADX WARN: Illegal instructions before constructor call */
    public S(InterfaceC0276j interfaceC0276j, M8.h hVar, boolean z6, int i10, p096j9.f fVar, int i11, p247z9.o oVar) {
        L8.N n10 = L8.N.f2801u;
        if (interfaceC0276j == null) {
            N0(19);
            throw null;
        }
        if (hVar == null) {
            N0(20);
            throw null;
        }
        if (i10 == 0) {
            N0(21);
            throw null;
        }
        if (fVar == null) {
            N0(22);
            throw null;
        }
        if (oVar == null) {
            N0(25);
            throw null;
        }
        super(oVar, interfaceC0276j, hVar, fVar, i10, z6, i11, n10);
        this.f3685C = new ArrayList(1);
        this.f3686D = false;
    }

    public static /* synthetic */ void N0(int i10) {
        String str = (i10 == 5 || i10 == 28) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i10 == 5 || i10 == 28) ? 2 : 3];
        switch (i10) {
            case 1:
            case 7:
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
            case 20:
                objArr[0] = "annotations";
                break;
            case 2:
            case 8:
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
            case MobileAdsBridge.CODE_21 /* 21 */:
                objArr[0] = "variance";
                break;
            case 3:
            case 9:
            case 15:
            case 22:
                objArr[0] = MediationMetaData.KEY_NAME;
                break;
            case 4:
            case 11:
            case 18:
            case 25:
                objArr[0] = "storageManager";
                break;
            case 5:
            case 28:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/TypeParameterDescriptorImpl";
                break;
            case 6:
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
            case 19:
            default:
                objArr[0] = "containingDeclaration";
                break;
            case 10:
            case 16:
            case 23:
                objArr[0] = "source";
                break;
            case 17:
                objArr[0] = "supertypeLoopsResolver";
                break;
            case 24:
                objArr[0] = "supertypeLoopsChecker";
                break;
            case 26:
                objArr[0] = "bound";
                break;
            case 27:
                objArr[0] = com.onesignal.inAppMessages.internal.display.impl.k.EVENT_TYPE_KEY;
                break;
        }
        if (i10 == 5) {
            objArr[1] = "createWithDefaultBound";
        } else if (i10 != 28) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/TypeParameterDescriptorImpl";
        } else {
            objArr[1] = "resolveUpperBounds";
        }
        switch (i10) {
            case 5:
            case 28:
                break;
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
            case 15:
            case 16:
            case 17:
            case 18:
                objArr[2] = "createForFurtherModification";
                break;
            case 19:
            case 20:
            case MobileAdsBridge.CODE_21 /* 21 */:
            case 22:
            case 23:
            case 24:
            case 25:
                objArr[2] = "<init>";
                break;
            case 26:
                objArr[2] = "addUpperBound";
                break;
            case 27:
                objArr[2] = "reportSupertypeLoopError";
                break;
            default:
                objArr[2] = "createWithDefaultBound";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i10 != 5 && i10 != 28) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    public static S b1(InterfaceC0276j interfaceC0276j, M8.h hVar, boolean z6, int i10, p096j9.f fVar, int i11, p247z9.o oVar) {
        if (interfaceC0276j == null) {
            N0(6);
            throw null;
        }
        if (hVar == null) {
            N0(7);
            throw null;
        }
        if (i10 == 0) {
            N0(8);
            throw null;
        }
        if (fVar == null) {
            N0(9);
            throw null;
        }
        if (oVar == null) {
            N0(11);
            throw null;
        }
        if (i10 != 0) {
            return new S(interfaceC0276j, hVar, z6, i10, fVar, i11, oVar);
        }
        N0(14);
        throw null;
    }

    public static S c1(AbstractC0346b abstractC0346b, int i10, p096j9.f fVar, int i11, p247z9.l lVar) {
        M8.f fVar2 = M8.g.a;
        if (abstractC0346b == null) {
            N0(0);
            throw null;
        }
        if (i10 == 0) {
            N0(2);
            throw null;
        }
        if (lVar == null) {
            N0(4);
            throw null;
        }
        S sB1 = b1(abstractC0346b, fVar2, false, i10, fVar, i11, lVar);
        A9.D dM = p165q9.d.e(abstractC0346b).m();
        if (sB1.f3686D) {
            throw new IllegalStateException("Type parameter descriptor is already initialized: " + sB1.d1());
        }
        if (!AbstractC0130c.j(dM)) {
            sB1.f3685C.add(dM);
        }
        if (!sB1.f3686D) {
            sB1.f3686D = true;
            return sB1;
        }
        throw new IllegalStateException("Type parameter descriptor is already initialized: " + sB1.d1());
    }

    @Override // O8.AbstractC0354j
    public final List a1() {
        if (!this.f3686D) {
            throw new IllegalStateException("Type parameter descriptor is not initialized: " + d1());
        }
        ArrayList arrayList = this.f3685C;
        if (arrayList != null) {
            return arrayList;
        }
        N0(28);
        throw null;
    }

    public final String d1() {
        return getName() + " declared in " + p124m9.e.g(v());
    }
}
