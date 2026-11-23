package O8;

import A9.AbstractC0151y;
import L8.C0280n;
import L8.InterfaceC0278l;
import com.unity3d.services.ads.gmascar.bridges.mobileads.MobileAdsBridgeBase;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import org.chromium.net.UrlRequest;

/* JADX INFO: loaded from: classes.dex */
public final class M extends I implements L8.J {

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public U f3677E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public final M f3678F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public M(L8.K k3, M8.h hVar, int i10, C0280n c0280n, boolean z6, boolean z10, boolean z11, int i11, M m2, L8.M m10) {
        super(i10, c0280n, k3, hVar, p096j9.f.l("<set-" + k3.getName() + ">"), z6, z10, z11, i11, m10);
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
        if (m10 == null) {
            N0(5);
            throw null;
        }
        this.f3678F = m2 != null ? m2 : this;
    }

    public static /* synthetic */ void N0(int i10) {
        String str;
        int i11;
        switch (i10) {
            case 10:
            case 11:
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                str = "@NotNull method %s.%s must not return null";
                break;
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i10) {
            case 10:
            case 11:
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                i11 = 2;
                break;
            default:
                i11 = 3;
                break;
        }
        Object[] objArr = new Object[i11];
        switch (i10) {
            case 1:
            case 9:
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
                objArr[0] = "parameter";
                break;
            case 7:
                objArr[0] = "setterDescriptor";
                break;
            case 8:
                objArr[0] = com.onesignal.inAppMessages.internal.display.impl.k.EVENT_TYPE_KEY;
                break;
            case 10:
            case 11:
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertySetterDescriptorImpl";
                break;
            default:
                objArr[0] = "correspondingProperty";
                break;
        }
        switch (i10) {
            case 10:
                objArr[1] = "getOverriddenDescriptors";
                break;
            case 11:
                objArr[1] = "getValueParameters";
                break;
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                objArr[1] = "getReturnType";
                break;
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                objArr[1] = "getOriginal";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertySetterDescriptorImpl";
                break;
        }
        switch (i10) {
            case 6:
                objArr[2] = MobileAdsBridgeBase.initializeMethodName;
                break;
            case 7:
            case 8:
            case 9:
                objArr[2] = "createSetterParameter";
                break;
            case 10:
            case 11:
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i10) {
            case 10:
            case 11:
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                throw new IllegalStateException(str2);
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    public static U b1(M m2, AbstractC0151y abstractC0151y, M8.h hVar) {
        if (abstractC0151y == null) {
            N0(8);
            throw null;
        }
        if (hVar != null) {
            return new U(m2, null, 0, hVar, p096j9.h.f12558g, abstractC0151y, false, false, false, null, L8.M.a);
        }
        N0(9);
        throw null;
    }

    @Override // L8.InterfaceC0268b
    public final List H0() {
        U u3 = this.f3677E;
        if (u3 == null) {
            throw new IllegalStateException();
        }
        List listSingletonList = Collections.singletonList(u3);
        if (listSingletonList != null) {
            return listSingletonList;
        }
        N0(11);
        throw null;
    }

    @Override // O8.AbstractC0360p, O8.AbstractC0359o, L8.InterfaceC0276j
    /* JADX INFO: renamed from: c1, reason: merged with bridge method [inline-methods] */
    public final M c() {
        M m2 = this.f3678F;
        if (m2 != null) {
            return m2;
        }
        N0(13);
        throw null;
    }

    @Override // L8.InterfaceC0276j
    public final Object k0(InterfaceC0278l interfaceC0278l, Object obj) {
        return interfaceC0278l.A(this, obj);
    }

    @Override // L8.InterfaceC0268b
    public final AbstractC0151y w() {
        return p165q9.d.e(this).w();
    }

    @Override // L8.InterfaceC0269c, L8.InterfaceC0268b
    public final Collection x() {
        return a1(false);
    }
}
