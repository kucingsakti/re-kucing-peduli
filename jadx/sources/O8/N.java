package O8;

import A9.AbstractC0151y;
import A9.Z;
import L8.C0280n;
import L8.InterfaceC0271e;
import L8.InterfaceC0276j;
import L8.InterfaceC0284s;
import L8.InterfaceC0285t;
import com.unity3d.ads.metadata.MediationMetaData;
import com.unity3d.services.ads.gmascar.bridges.mobileads.MobileAdsBridge;
import com.unity3d.services.ads.gmascar.bridges.mobileads.MobileAdsBridgeBase;
import java.util.List;
import org.chromium.net.UrlRequest;

/* JADX INFO: loaded from: classes.dex */
public class N extends w {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public N(InterfaceC0276j interfaceC0276j, N n10, M8.h hVar, p096j9.f fVar, int i10, L8.M m2) {
        super(i10, interfaceC0276j, n10, m2, hVar, fVar);
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
        if (i10 == 0) {
            N0(3);
            throw null;
        }
        if (m2 != null) {
        } else {
            N0(4);
            throw null;
        }
    }

    public static /* synthetic */ void N0(int i10) {
        String str = (i10 == 13 || i10 == 18 || i10 == 23 || i10 == 24 || i10 == 29 || i10 == 30) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i10 == 13 || i10 == 18 || i10 == 23 || i10 == 24 || i10 == 29 || i10 == 30) ? 2 : 3];
        switch (i10) {
            case 1:
            case 6:
            case 27:
                objArr[0] = "annotations";
                break;
            case 2:
            case 7:
                objArr[0] = MediationMetaData.KEY_NAME;
                break;
            case 3:
            case 8:
            case 26:
                objArr[0] = "kind";
                break;
            case 4:
            case 9:
            case 28:
                objArr[0] = "source";
                break;
            case 5:
            default:
                objArr[0] = "containingDeclaration";
                break;
            case 10:
            case 15:
            case 20:
                objArr[0] = "typeParameters";
                break;
            case 11:
            case 16:
            case MobileAdsBridge.CODE_21 /* 21 */:
                objArr[0] = "unsubstitutedValueParameters";
                break;
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
            case 17:
            case 22:
                objArr[0] = "visibility";
                break;
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
            case 18:
            case 23:
            case 24:
            case 29:
            case 30:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/SimpleFunctionDescriptorImpl";
                break;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
            case 19:
                objArr[0] = "contextReceiverParameters";
                break;
            case 25:
                objArr[0] = "newOwner";
                break;
        }
        if (i10 == 13 || i10 == 18 || i10 == 23) {
            objArr[1] = MobileAdsBridgeBase.initializeMethodName;
        } else if (i10 == 24) {
            objArr[1] = "getOriginal";
        } else if (i10 == 29) {
            objArr[1] = "copy";
        } else if (i10 != 30) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/SimpleFunctionDescriptorImpl";
        } else {
            objArr[1] = "newCopyBuilder";
        }
        switch (i10) {
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                objArr[2] = "create";
                break;
            case 10:
            case 11:
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
            case 15:
            case 16:
            case 17:
            case 19:
            case 20:
            case MobileAdsBridge.CODE_21 /* 21 */:
            case 22:
                objArr[2] = MobileAdsBridgeBase.initializeMethodName;
                break;
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
            case 18:
            case 23:
            case 24:
            case 29:
            case 30:
                break;
            case 25:
            case 26:
            case 27:
            case 28:
                objArr[2] = "createSubstitutedCopy";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i10 != 13 && i10 != 18 && i10 != 23 && i10 != 24 && i10 != 29 && i10 != 30) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    public static N k1(InterfaceC0271e interfaceC0271e, p096j9.f fVar, int i10, L8.M m2) {
        M8.f fVar2 = M8.g.a;
        if (interfaceC0271e == null) {
            N0(5);
            throw null;
        }
        if (fVar == null) {
            N0(7);
            throw null;
        }
        if (i10 == 0) {
            N0(8);
            throw null;
        }
        if (m2 != null) {
            return new N(interfaceC0271e, null, fVar2, fVar, i10, m2);
        }
        N0(9);
        throw null;
    }

    @Override // O8.w
    public w b1(int i10, InterfaceC0276j interfaceC0276j, InterfaceC0285t interfaceC0285t, L8.M m2, M8.h hVar, p096j9.f fVar) {
        if (interfaceC0276j == null) {
            N0(25);
            throw null;
        }
        if (i10 == 0) {
            N0(26);
            throw null;
        }
        if (hVar == null) {
            N0(27);
            throw null;
        }
        N n10 = (N) interfaceC0285t;
        if (fVar == null) {
            fVar = getName();
        }
        return new N(interfaceC0276j, n10, hVar, fVar, i10, m2);
    }

    @Override // O8.w, O8.AbstractC0360p, O8.AbstractC0359o, L8.InterfaceC0276j
    /* JADX INFO: renamed from: l1, reason: merged with bridge method [inline-methods] */
    public final N c() {
        N n10 = (N) super.c();
        if (n10 != null) {
            return n10;
        }
        N0(24);
        throw null;
    }

    @Override // O8.w
    /* JADX INFO: renamed from: m1, reason: merged with bridge method [inline-methods] */
    public final N e1(x xVar, x xVar2, List list, List list2, List list3, AbstractC0151y abstractC0151y, int i10, C0280n c0280n) {
        if (list == null) {
            N0(14);
            throw null;
        }
        if (list2 == null) {
            N0(15);
            throw null;
        }
        if (list3 == null) {
            N0(16);
            throw null;
        }
        if (c0280n != null) {
            return n1(xVar, xVar2, list, list2, list3, abstractC0151y, i10, c0280n, null);
        }
        N0(17);
        throw null;
    }

    public N n1(x xVar, x xVar2, List list, List list2, List list3, AbstractC0151y abstractC0151y, int i10, C0280n c0280n, p086i8.t tVar) {
        if (list == null) {
            N0(19);
            throw null;
        }
        if (list2 == null) {
            N0(20);
            throw null;
        }
        if (list3 == null) {
            N0(21);
            throw null;
        }
        if (c0280n != null) {
            super.e1(xVar, xVar2, list, list2, list3, abstractC0151y, i10, c0280n);
            return this;
        }
        N0(22);
        throw null;
    }

    @Override // O8.w, L8.InterfaceC0285t
    public InterfaceC0284s y0() {
        return f1(Z.f355b);
    }
}
