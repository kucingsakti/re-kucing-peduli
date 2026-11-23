package O8;

import A9.C0138k;
import L8.AbstractC0281o;
import L8.C0280n;
import L8.InterfaceC0276j;
import com.unity3d.ads.metadata.MediationMetaData;
import com.unity3d.services.ads.gmascar.bridges.mobileads.MobileAdsBridgeBase;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import org.chromium.net.UrlRequest;

/* JADX INFO: renamed from: O8.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0357m extends AbstractC0356l {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final C0138k f3720A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public t9.n f3721B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public Set f3722C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public C0355k f3723D;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final int f3724y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final int f3725z;

    /* JADX WARN: Illegal instructions before constructor call */
    public C0357m(InterfaceC0276j interfaceC0276j, p096j9.f fVar, int i10, int i11, Collection collection, p247z9.l lVar) {
        L8.N n10 = L8.M.a;
        if (interfaceC0276j == null) {
            d(0);
            throw null;
        }
        if (fVar == null) {
            d(1);
            throw null;
        }
        if (i10 == 0) {
            d(2);
            throw null;
        }
        if (i11 == 0) {
            d(3);
            throw null;
        }
        if (lVar == null) {
            d(6);
            throw null;
        }
        super(lVar, interfaceC0276j, fVar, n10);
        this.f3724y = i10;
        this.f3725z = i11;
        this.f3720A = new C0138k(this, Collections.EMPTY_LIST, collection, lVar);
    }

    public static /* synthetic */ void d(int i10) {
        String str;
        int i11;
        switch (i10) {
            case 9:
            case 10:
            case 11:
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
                str = "@NotNull method %s.%s must not return null";
                break;
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i10) {
            case 9:
            case 10:
            case 11:
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
                i11 = 2;
                break;
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
            default:
                i11 = 3;
                break;
        }
        Object[] objArr = new Object[i11];
        switch (i10) {
            case 1:
                objArr[0] = MediationMetaData.KEY_NAME;
                break;
            case 2:
                objArr[0] = "modality";
                break;
            case 3:
                objArr[0] = "kind";
                break;
            case 4:
                objArr[0] = "supertypes";
                break;
            case 5:
                objArr[0] = "source";
                break;
            case 6:
                objArr[0] = "storageManager";
                break;
            case 7:
                objArr[0] = "unsubstitutedMemberScope";
                break;
            case 8:
                objArr[0] = "constructors";
                break;
            case 9:
            case 10:
            case 11:
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ClassDescriptorImpl";
                break;
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                objArr[0] = "kotlinTypeRefiner";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        switch (i10) {
            case 9:
                objArr[1] = "getAnnotations";
                break;
            case 10:
                objArr[1] = "getTypeConstructor";
                break;
            case 11:
                objArr[1] = "getConstructors";
                break;
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ClassDescriptorImpl";
                break;
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                objArr[1] = "getUnsubstitutedMemberScope";
                break;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                objArr[1] = "getStaticScope";
                break;
            case 15:
                objArr[1] = "getKind";
                break;
            case 16:
                objArr[1] = "getModality";
                break;
            case 17:
                objArr[1] = "getVisibility";
                break;
            case 18:
                objArr[1] = "getDeclaredTypeParameters";
                break;
            case 19:
                objArr[1] = "getSealedSubclasses";
                break;
        }
        switch (i10) {
            case 7:
            case 8:
                objArr[2] = MobileAdsBridgeBase.initializeMethodName;
                break;
            case 9:
            case 10:
            case 11:
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
                break;
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                objArr[2] = "getUnsubstitutedMemberScope";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i10) {
            case 9:
            case 10:
            case 11:
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
                throw new IllegalStateException(str2);
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    @Override // L8.InterfaceC0288w
    public final boolean C0() {
        return false;
    }

    @Override // L8.InterfaceC0273g
    public final A9.O I() {
        C0138k c0138k = this.f3720A;
        if (c0138k != null) {
            return c0138k;
        }
        d(10);
        throw null;
    }

    @Override // L8.InterfaceC0271e
    public final boolean L0() {
        return false;
    }

    @Override // L8.InterfaceC0271e
    public final int M() {
        int i10 = this.f3725z;
        if (i10 != 0) {
            return i10;
        }
        d(15);
        throw null;
    }

    @Override // L8.InterfaceC0271e
    public final boolean N() {
        return false;
    }

    @Override // L8.InterfaceC0271e
    public final boolean T() {
        return false;
    }

    @Override // O8.B
    public final t9.n b(B9.f fVar) {
        t9.n nVar = this.f3721B;
        if (nVar != null) {
            return nVar;
        }
        d(13);
        throw null;
    }

    @Override // L8.InterfaceC0271e
    public final Collection e0() {
        List list = Collections.EMPTY_LIST;
        if (list != null) {
            return list;
        }
        d(19);
        throw null;
    }

    @Override // L8.InterfaceC0271e, L8.InterfaceC0279m, L8.InterfaceC0288w
    public final C0280n f() {
        C0280n c0280n = AbstractC0281o.f2822e;
        if (c0280n != null) {
            return c0280n;
        }
        d(17);
        throw null;
    }

    @Override // L8.InterfaceC0271e
    public final boolean h0() {
        return false;
    }

    @Override // L8.InterfaceC0288w
    public final boolean i0() {
        return false;
    }

    public final void l(t9.n nVar, Set set, C0355k c0355k) {
        this.f3721B = nVar;
        this.f3722C = set;
        this.f3723D = c0355k;
    }

    @Override // L8.InterfaceC0271e, L8.InterfaceC0288w
    public final int m() {
        int i10 = this.f3724y;
        if (i10 != 0) {
            return i10;
        }
        d(16);
        throw null;
    }

    @Override // L8.InterfaceC0271e
    public final Collection n() {
        Set set = this.f3722C;
        if (set != null) {
            return set;
        }
        d(11);
        throw null;
    }

    @Override // M8.a
    public final M8.h q() {
        return M8.g.a;
    }

    @Override // L8.InterfaceC0274h
    public final boolean r() {
        return false;
    }

    @Override // L8.InterfaceC0271e
    public final L8.Q t0() {
        return null;
    }

    public String toString() {
        return "class " + getName();
    }

    @Override // L8.InterfaceC0271e
    public final boolean u() {
        return false;
    }

    @Override // L8.InterfaceC0271e
    public final C0355k u0() {
        return this.f3723D;
    }

    @Override // L8.InterfaceC0271e
    public final t9.n v0() {
        return t9.m.f15259b;
    }

    @Override // L8.InterfaceC0271e, L8.InterfaceC0274h
    public final List y() {
        List list = Collections.EMPTY_LIST;
        if (list != null) {
            return list;
        }
        d(18);
        throw null;
    }
}
