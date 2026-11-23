package O8;

import A9.AbstractC0151y;
import A9.W;
import L8.C0280n;
import L8.InterfaceC0271e;
import L8.InterfaceC0276j;
import L8.InterfaceC0284s;
import L8.InterfaceC0285t;
import com.unity3d.ads.metadata.MediationMetaData;
import com.unity3d.services.ads.gmascar.bridges.mobileads.MobileAdsBridge;
import java.util.LinkedHashMap;
import java.util.List;
import org.chromium.net.UrlRequest;

/* JADX INFO: renamed from: O8.v, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0365v implements InterfaceC0284s {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public x f3742A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public x f3743B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public AbstractC0151y f3744C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public p096j9.f f3745D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public boolean f3746E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public boolean f3747F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public boolean f3748G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public boolean f3749H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public boolean f3750I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public p086i8.s f3751J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public M8.h f3752K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public boolean f3753L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public final LinkedHashMap f3754M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public Boolean f3755N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public boolean f3756O;
    public final /* synthetic */ w P;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public W f3757s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public InterfaceC0276j f3758t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f3759u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public C0280n f3760v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public InterfaceC0285t f3761w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f3762x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public List f3763y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final List f3764z;

    public C0365v(w wVar, W w2, InterfaceC0276j interfaceC0276j, int i10, C0280n c0280n, int i11, List list, List list2, x xVar, AbstractC0151y abstractC0151y) {
        if (w2 == null) {
            a(0);
            throw null;
        }
        if (interfaceC0276j == null) {
            a(1);
            throw null;
        }
        if (i10 == 0) {
            a(2);
            throw null;
        }
        if (c0280n == null) {
            a(3);
            throw null;
        }
        if (i11 == 0) {
            a(4);
            throw null;
        }
        if (list == null) {
            a(5);
            throw null;
        }
        if (list2 == null) {
            a(6);
            throw null;
        }
        if (abstractC0151y == null) {
            a(7);
            throw null;
        }
        this.P = wVar;
        this.f3761w = null;
        this.f3743B = wVar.f3766B;
        this.f3746E = true;
        this.f3747F = false;
        this.f3748G = false;
        this.f3749H = false;
        this.f3750I = wVar.f3775K;
        this.f3751J = null;
        this.f3752K = null;
        this.f3753L = wVar.f3776L;
        this.f3754M = new LinkedHashMap();
        this.f3755N = null;
        this.f3756O = false;
        this.f3757s = w2;
        this.f3758t = interfaceC0276j;
        this.f3759u = i10;
        this.f3760v = c0280n;
        this.f3762x = i11;
        this.f3763y = list;
        this.f3764z = list2;
        this.f3742A = xVar;
        this.f3744C = abstractC0151y;
        this.f3745D = null;
    }

    public static /* synthetic */ void a(int i10) {
        String str;
        int i11;
        switch (i10) {
            case 9:
            case 11:
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
            case 15:
            case 16:
            case 18:
            case 20:
            case 22:
            case 24:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 36:
            case 38:
            case 40:
            case 41:
            case 42:
                str = "@NotNull method %s.%s must not return null";
                break;
            case 10:
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
            case 17:
            case 19:
            case MobileAdsBridge.CODE_21 /* 21 */:
            case 23:
            case 25:
            case 35:
            case 37:
            case 39:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i10) {
            case 9:
            case 11:
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
            case 15:
            case 16:
            case 18:
            case 20:
            case 22:
            case 24:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 36:
            case 38:
            case 40:
            case 41:
            case 42:
                i11 = 2;
                break;
            case 10:
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
            case 17:
            case 19:
            case MobileAdsBridge.CODE_21 /* 21 */:
            case 23:
            case 25:
            case 35:
            case 37:
            case 39:
            default:
                i11 = 3;
                break;
        }
        Object[] objArr = new Object[i11];
        switch (i10) {
            case 1:
                objArr[0] = "newOwner";
                break;
            case 2:
                objArr[0] = "newModality";
                break;
            case 3:
                objArr[0] = "newVisibility";
                break;
            case 4:
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                objArr[0] = "kind";
                break;
            case 5:
                objArr[0] = "newValueParameterDescriptors";
                break;
            case 6:
                objArr[0] = "newContextReceiverParameters";
                break;
            case 7:
                objArr[0] = "newReturnType";
                break;
            case 8:
                objArr[0] = "owner";
                break;
            case 9:
            case 11:
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
            case 15:
            case 16:
            case 18:
            case 20:
            case 22:
            case 24:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 36:
            case 38:
            case 40:
            case 41:
            case 42:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/FunctionDescriptorImpl$CopyConfiguration";
                break;
            case 10:
                objArr[0] = "modality";
                break;
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                objArr[0] = "visibility";
                break;
            case 17:
                objArr[0] = MediationMetaData.KEY_NAME;
                break;
            case 19:
            case MobileAdsBridge.CODE_21 /* 21 */:
                objArr[0] = "parameters";
                break;
            case 23:
                objArr[0] = com.onesignal.inAppMessages.internal.display.impl.k.EVENT_TYPE_KEY;
                break;
            case 25:
                objArr[0] = "contextReceiverParameters";
                break;
            case 35:
                objArr[0] = "additionalAnnotations";
                break;
            case 37:
            default:
                objArr[0] = "substitution";
                break;
            case 39:
                objArr[0] = "userDataKey";
                break;
        }
        switch (i10) {
            case 9:
                objArr[1] = "setOwner";
                break;
            case 10:
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
            case 17:
            case 19:
            case MobileAdsBridge.CODE_21 /* 21 */:
            case 23:
            case 25:
            case 35:
            case 37:
            case 39:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/FunctionDescriptorImpl$CopyConfiguration";
                break;
            case 11:
                objArr[1] = "setModality";
                break;
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                objArr[1] = "setVisibility";
                break;
            case 15:
                objArr[1] = "setKind";
                break;
            case 16:
                objArr[1] = "setCopyOverrides";
                break;
            case 18:
                objArr[1] = "setName";
                break;
            case 20:
                objArr[1] = "setValueParameters";
                break;
            case 22:
                objArr[1] = "setTypeParameters";
                break;
            case 24:
                objArr[1] = "setReturnType";
                break;
            case 26:
                objArr[1] = "setContextReceiverParameters";
                break;
            case 27:
                objArr[1] = "setExtensionReceiverParameter";
                break;
            case 28:
                objArr[1] = "setDispatchReceiverParameter";
                break;
            case 29:
                objArr[1] = "setOriginal";
                break;
            case 30:
                objArr[1] = "setSignatureChange";
                break;
            case 31:
                objArr[1] = "setPreserveSourceElement";
                break;
            case 32:
                objArr[1] = "setDropOriginalInContainingParts";
                break;
            case 33:
                objArr[1] = "setHiddenToOvercomeSignatureClash";
                break;
            case 34:
                objArr[1] = "setHiddenForResolutionEverywhereBesideSupercalls";
                break;
            case 36:
                objArr[1] = "setAdditionalAnnotations";
                break;
            case 38:
                objArr[1] = "setSubstitution";
                break;
            case 40:
                objArr[1] = "putUserData";
                break;
            case 41:
                objArr[1] = "getSubstitution";
                break;
            case 42:
                objArr[1] = "setJustForTypeSubstitution";
                break;
        }
        switch (i10) {
            case 8:
                objArr[2] = "setOwner";
                break;
            case 9:
            case 11:
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
            case 15:
            case 16:
            case 18:
            case 20:
            case 22:
            case 24:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 36:
            case 38:
            case 40:
            case 41:
            case 42:
                break;
            case 10:
                objArr[2] = "setModality";
                break;
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                objArr[2] = "setVisibility";
                break;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                objArr[2] = "setKind";
                break;
            case 17:
                objArr[2] = "setName";
                break;
            case 19:
                objArr[2] = "setValueParameters";
                break;
            case MobileAdsBridge.CODE_21 /* 21 */:
                objArr[2] = "setTypeParameters";
                break;
            case 23:
                objArr[2] = "setReturnType";
                break;
            case 25:
                objArr[2] = "setContextReceiverParameters";
                break;
            case 35:
                objArr[2] = "setAdditionalAnnotations";
                break;
            case 37:
                objArr[2] = "setSubstitution";
                break;
            case 39:
                objArr[2] = "putUserData";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i10) {
            case 9:
            case 11:
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
            case 15:
            case 16:
            case 18:
            case 20:
            case 22:
            case 24:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 36:
            case 38:
            case 40:
            case 41:
            case 42:
                throw new IllegalStateException(str2);
            case 10:
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
            case 17:
            case 19:
            case MobileAdsBridge.CODE_21 /* 21 */:
            case 23:
            case 25:
            case 35:
            case 37:
            case 39:
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    @Override // L8.InterfaceC0284s
    public final InterfaceC0284s B() {
        this.f3754M.put(W8.f.f5364Y, Boolean.TRUE);
        return this;
    }

    @Override // L8.InterfaceC0284s
    public final InterfaceC0284s C() {
        this.f3753L = true;
        return this;
    }

    @Override // L8.InterfaceC0284s
    public final InterfaceC0284s F() {
        this.f3747F = true;
        return this;
    }

    @Override // L8.InterfaceC0284s
    public final InterfaceC0284s b(x xVar) {
        this.f3743B = xVar;
        return this;
    }

    @Override // L8.InterfaceC0284s
    public final InterfaceC0285t build() {
        return this.P.c1(this);
    }

    @Override // L8.InterfaceC0284s
    public final InterfaceC0284s c() {
        this.f3746E = false;
        return this;
    }

    @Override // L8.InterfaceC0284s
    public final InterfaceC0284s d(AbstractC0151y abstractC0151y) {
        if (abstractC0151y != null) {
            this.f3744C = abstractC0151y;
            return this;
        }
        a(23);
        throw null;
    }

    @Override // L8.InterfaceC0284s
    public final InterfaceC0284s e(M8.h hVar) {
        if (hVar != null) {
            this.f3752K = hVar;
            return this;
        }
        a(35);
        throw null;
    }

    @Override // L8.InterfaceC0284s
    public final InterfaceC0284s g(List list) {
        this.f3763y = list;
        return this;
    }

    @Override // L8.InterfaceC0284s
    public final InterfaceC0284s j() {
        this.f3751J = p086i8.s.f12328s;
        return this;
    }

    @Override // L8.InterfaceC0284s
    public final InterfaceC0284s k() {
        this.f3750I = true;
        return this;
    }

    @Override // L8.InterfaceC0284s
    public final InterfaceC0284s l(int i10) {
        if (i10 != 0) {
            this.f3762x = i10;
            return this;
        }
        a(14);
        throw null;
    }

    @Override // L8.InterfaceC0284s
    public final InterfaceC0284s m(InterfaceC0271e interfaceC0271e) {
        if (interfaceC0271e != null) {
            this.f3758t = interfaceC0271e;
            return this;
        }
        a(8);
        throw null;
    }

    @Override // L8.InterfaceC0284s
    public final InterfaceC0284s q(p096j9.f fVar) {
        if (fVar != null) {
            this.f3745D = fVar;
            return this;
        }
        a(17);
        throw null;
    }

    @Override // L8.InterfaceC0284s
    public final InterfaceC0284s r() {
        this.f3748G = true;
        return this;
    }

    @Override // L8.InterfaceC0284s
    public final InterfaceC0284s s(C0280n c0280n) {
        if (c0280n != null) {
            this.f3760v = c0280n;
            return this;
        }
        a(12);
        throw null;
    }

    @Override // L8.InterfaceC0284s
    public final InterfaceC0284s x(int i10) {
        if (i10 != 0) {
            this.f3759u = i10;
            return this;
        }
        a(10);
        throw null;
    }
}
