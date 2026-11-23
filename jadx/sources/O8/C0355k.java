package O8;

import A9.Z;
import L8.C0280n;
import L8.InterfaceC0269c;
import L8.InterfaceC0271e;
import L8.InterfaceC0275i;
import L8.InterfaceC0276j;
import L8.InterfaceC0278l;
import L8.InterfaceC0285t;
import com.unity3d.services.ads.gmascar.bridges.mobileads.MobileAdsBridge;
import com.unity3d.services.ads.gmascar.bridges.mobileads.MobileAdsBridgeBase;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import org.chromium.net.UrlRequest;

/* JADX INFO: renamed from: O8.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0355k extends w implements InterfaceC0275i {

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public final boolean f3717V;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0355k(InterfaceC0271e interfaceC0271e, InterfaceC0275i interfaceC0275i, M8.h hVar, boolean z6, int i10, L8.M m2) {
        super(i10, interfaceC0271e, interfaceC0275i, m2, hVar, p096j9.h.f12556e);
        if (interfaceC0271e == null) {
            N0(0);
            throw null;
        }
        if (hVar == null) {
            N0(1);
            throw null;
        }
        if (i10 == 0) {
            N0(2);
            throw null;
        }
        if (m2 == null) {
            N0(3);
            throw null;
        }
        this.f3717V = z6;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x000e  */
    public static /* synthetic */ void N0(int i10) {
        String str;
        int i11;
        if (i10 != 21 && i10 != 27) {
            switch (i10) {
                case 15:
                case 16:
                case 17:
                case 18:
                case 19:
                    str = "@NotNull method %s.%s must not return null";
                    break;
                default:
                    str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                    break;
            }
        } else {
            str = "@NotNull method %s.%s must not return null";
        }
        if (i10 != 21 && i10 != 27) {
            switch (i10) {
                case 15:
                case 16:
                case 17:
                case 18:
                case 19:
                    i11 = 2;
                    break;
                default:
                    i11 = 3;
                    break;
            }
        } else {
            i11 = 2;
        }
        Object[] objArr = new Object[i11];
        switch (i10) {
            case 1:
            case 5:
            case 8:
            case 25:
                objArr[0] = "annotations";
                break;
            case 2:
            case 24:
                objArr[0] = "kind";
                break;
            case 3:
            case 6:
            case 9:
            case 26:
                objArr[0] = "source";
                break;
            case 4:
            case 7:
            default:
                objArr[0] = "containingDeclaration";
                break;
            case 10:
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                objArr[0] = "unsubstitutedValueParameters";
                break;
            case 11:
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                objArr[0] = "visibility";
                break;
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                objArr[0] = "typeParameterDescriptors";
                break;
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case MobileAdsBridge.CODE_21 /* 21 */:
            case 27:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ClassConstructorDescriptorImpl";
                break;
            case 20:
                objArr[0] = "originalSubstitutor";
                break;
            case 22:
                objArr[0] = "overriddenDescriptors";
                break;
            case 23:
                objArr[0] = "newOwner";
                break;
        }
        if (i10 == 21) {
            objArr[1] = "getOverriddenDescriptors";
        } else if (i10 != 27) {
            switch (i10) {
                case 15:
                case 16:
                    objArr[1] = "calculateContextReceiverParameters";
                    break;
                case 17:
                    objArr[1] = "getContainingDeclaration";
                    break;
                case 18:
                    objArr[1] = "getConstructedClass";
                    break;
                case 19:
                    objArr[1] = "getOriginal";
                    break;
                default:
                    objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ClassConstructorDescriptorImpl";
                    break;
            }
        } else {
            objArr[1] = "copy";
        }
        switch (i10) {
            case 4:
            case 5:
            case 6:
                objArr[2] = "create";
                break;
            case 7:
            case 8:
            case 9:
                objArr[2] = "createSynthesized";
                break;
            case 10:
            case 11:
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                objArr[2] = MobileAdsBridgeBase.initializeMethodName;
                break;
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case MobileAdsBridge.CODE_21 /* 21 */:
            case 27:
                break;
            case 20:
                objArr[2] = "substitute";
                break;
            case 22:
                objArr[2] = "setOverriddenDescriptors";
                break;
            case 23:
            case 24:
            case 25:
            case 26:
                objArr[2] = "createSubstitutedCopy";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i10 != 21 && i10 != 27) {
            switch (i10) {
                case 15:
                case 16:
                case 17:
                case 18:
                case 19:
                    break;
                default:
                    throw new IllegalArgumentException(str2);
            }
        }
        throw new IllegalStateException(str2);
    }

    @Override // L8.InterfaceC0275i
    public final InterfaceC0271e Q() {
        InterfaceC0271e interfaceC0271eV = v();
        if (interfaceC0271eV != null) {
            return interfaceC0271eV;
        }
        N0(18);
        throw null;
    }

    @Override // O8.w, L8.InterfaceC0269c
    public final InterfaceC0269c S(InterfaceC0271e interfaceC0271e, int i10, C0280n c0280n) {
        return (C0355k) Z0(interfaceC0271e, i10, c0280n);
    }

    @Override // O8.w, L8.InterfaceC0276j
    public final Object k0(InterfaceC0278l interfaceC0278l, Object obj) {
        return interfaceC0278l.c(this, obj);
    }

    @Override // O8.w
    /* JADX INFO: renamed from: k1, reason: merged with bridge method [inline-methods] */
    public C0355k b1(int i10, InterfaceC0276j interfaceC0276j, InterfaceC0285t interfaceC0285t, L8.M m2, M8.h hVar, p096j9.f fVar) {
        if (interfaceC0276j == null) {
            N0(23);
            throw null;
        }
        if (i10 == 0) {
            N0(24);
            throw null;
        }
        if (hVar == null) {
            N0(25);
            throw null;
        }
        if (i10 == 1 || i10 == 4) {
            return new C0355k((InterfaceC0271e) interfaceC0276j, this, hVar, this.f3717V, 1, m2);
        }
        throw new IllegalStateException("Attempt at creating a constructor that is not a declaration: \ncopy from: " + this + "\nnewOwner: " + interfaceC0276j + "\nkind: " + E0.a.s(i10));
    }

    @Override // O8.AbstractC0360p, L8.InterfaceC0276j
    /* JADX INFO: renamed from: l1, reason: merged with bridge method [inline-methods] */
    public final InterfaceC0271e v() {
        InterfaceC0271e interfaceC0271e = (InterfaceC0271e) super.v();
        if (interfaceC0271e != null) {
            return interfaceC0271e;
        }
        N0(17);
        throw null;
    }

    @Override // O8.w, O8.AbstractC0360p, O8.AbstractC0359o, L8.InterfaceC0276j
    /* JADX INFO: renamed from: m1, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final C0355k c() {
        C0355k c0355k = (C0355k) super.c();
        if (c0355k != null) {
            return c0355k;
        }
        N0(19);
        throw null;
    }

    public final void n1(List list, C0280n c0280n) {
        if (list == null) {
            N0(13);
            throw null;
        }
        if (c0280n != null) {
            o1(list, c0280n, v().y());
        } else {
            N0(14);
            throw null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0021  */
    public final void o1(List list, C0280n c0280n, List list2) {
        x xVarM0;
        List listF0;
        if (list == null) {
            N0(10);
            throw null;
        }
        if (c0280n == null) {
            N0(11);
            throw null;
        }
        if (list2 == null) {
            N0(12);
            throw null;
        }
        InterfaceC0271e interfaceC0271eV = v();
        if (interfaceC0271eV.r()) {
            InterfaceC0276j interfaceC0276jV = interfaceC0271eV.v();
            if (interfaceC0276jV instanceof InterfaceC0271e) {
                xVarM0 = ((InterfaceC0271e) interfaceC0276jV).M0();
            } else {
                xVarM0 = null;
            }
        } else {
            xVarM0 = null;
        }
        InterfaceC0271e interfaceC0271eV2 = v();
        if (interfaceC0271eV2.F0().isEmpty()) {
            listF0 = Collections.EMPTY_LIST;
            if (listF0 == null) {
                N0(16);
                throw null;
            }
        } else {
            listF0 = interfaceC0271eV2.F0();
            if (listF0 == null) {
                N0(15);
                throw null;
            }
        }
        e1(null, xVarM0, listF0, list2, list, null, 1, c0280n);
    }

    @Override // O8.w, L8.InterfaceC0269c
    public final void p0(Collection collection) {
        if (collection != null) {
            return;
        }
        N0(22);
        throw null;
    }

    @Override // O8.w, L8.InterfaceC0285t, L8.O
    /* JADX INFO: renamed from: p1, reason: merged with bridge method [inline-methods] */
    public final C0355k j(Z z6) {
        if (z6 != null) {
            return (C0355k) super.j(z6);
        }
        N0(20);
        throw null;
    }

    @Override // O8.w, L8.InterfaceC0269c, L8.InterfaceC0268b
    public final Collection x() {
        Set set = Collections.EMPTY_SET;
        if (set != null) {
            return set;
        }
        N0(21);
        throw null;
    }
}
