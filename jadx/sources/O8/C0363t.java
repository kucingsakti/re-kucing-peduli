package O8;

import A9.C0138k;
import L8.AbstractC0281o;
import L8.C0280n;
import L8.InterfaceC0271e;
import com.unity3d.ads.metadata.MediationMetaData;
import com.unity3d.services.ads.gmascar.bridges.mobileads.MobileAdsBridge;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import org.chromium.net.UrlRequest;

/* JADX INFO: renamed from: O8.t, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0363t extends AbstractC0356l {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final p247z9.i f3738A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final M8.h f3739B;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final C0138k f3740y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final C0362s f3741z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0363t(p247z9.l lVar, InterfaceC0271e interfaceC0271e, A9.D d3, p096j9.f fVar, p247z9.i iVar, M8.h hVar, L8.M m2) {
        super(lVar, interfaceC0271e, fVar, m2);
        if (lVar == null) {
            d(6);
            throw null;
        }
        if (interfaceC0271e == null) {
            d(7);
            throw null;
        }
        if (d3 == null) {
            d(8);
            throw null;
        }
        if (fVar == null) {
            d(9);
            throw null;
        }
        if (iVar == null) {
            d(10);
            throw null;
        }
        this.f3739B = hVar;
        this.f3740y = new C0138k(this, Collections.EMPTY_LIST, Collections.singleton(d3), lVar);
        this.f3741z = new C0362s(this, lVar);
        this.f3738A = iVar;
    }

    public static /* synthetic */ void d(int i10) {
        String str;
        int i11;
        switch (i10) {
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case MobileAdsBridge.CODE_21 /* 21 */:
            case 22:
            case 23:
                str = "@NotNull method %s.%s must not return null";
                break;
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i10) {
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case MobileAdsBridge.CODE_21 /* 21 */:
            case 22:
            case 23:
                i11 = 2;
                break;
            default:
                i11 = 3;
                break;
        }
        Object[] objArr = new Object[i11];
        switch (i10) {
            case 1:
                objArr[0] = "enumClass";
                break;
            case 2:
            case 9:
                objArr[0] = MediationMetaData.KEY_NAME;
                break;
            case 3:
            case 10:
                objArr[0] = "enumMemberNames";
                break;
            case 4:
            case 11:
                objArr[0] = "annotations";
                break;
            case 5:
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                objArr[0] = "source";
                break;
            case 6:
            default:
                objArr[0] = "storageManager";
                break;
            case 7:
                objArr[0] = "containingClass";
                break;
            case 8:
                objArr[0] = "supertype";
                break;
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                objArr[0] = "kotlinTypeRefiner";
                break;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case MobileAdsBridge.CODE_21 /* 21 */:
            case 22:
            case 23:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/EnumEntrySyntheticClassDescriptor";
                break;
        }
        switch (i10) {
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                objArr[1] = "getUnsubstitutedMemberScope";
                break;
            case 15:
                objArr[1] = "getStaticScope";
                break;
            case 16:
                objArr[1] = "getConstructors";
                break;
            case 17:
                objArr[1] = "getTypeConstructor";
                break;
            case 18:
                objArr[1] = "getKind";
                break;
            case 19:
                objArr[1] = "getModality";
                break;
            case 20:
                objArr[1] = "getVisibility";
                break;
            case MobileAdsBridge.CODE_21 /* 21 */:
                objArr[1] = "getAnnotations";
                break;
            case 22:
                objArr[1] = "getDeclaredTypeParameters";
                break;
            case 23:
                objArr[1] = "getSealedSubclasses";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/EnumEntrySyntheticClassDescriptor";
                break;
        }
        switch (i10) {
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                objArr[2] = "<init>";
                break;
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                objArr[2] = "getUnsubstitutedMemberScope";
                break;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case MobileAdsBridge.CODE_21 /* 21 */:
            case 22:
            case 23:
                break;
            default:
                objArr[2] = "create";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i10) {
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case MobileAdsBridge.CODE_21 /* 21 */:
            case 22:
            case 23:
                throw new IllegalStateException(str2);
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    public static C0363t l(p247z9.l lVar, InterfaceC0271e interfaceC0271e, p096j9.f fVar, p247z9.i iVar, M8.h hVar, L8.M m2) {
        if (lVar == null) {
            d(0);
            throw null;
        }
        if (interfaceC0271e == null) {
            d(1);
            throw null;
        }
        if (fVar == null) {
            d(2);
            throw null;
        }
        if (iVar != null) {
            return new C0363t(lVar, interfaceC0271e, interfaceC0271e.p(), fVar, iVar, hVar, m2);
        }
        d(3);
        throw null;
    }

    @Override // L8.InterfaceC0288w
    public final boolean C0() {
        return false;
    }

    @Override // L8.InterfaceC0273g
    public final A9.O I() {
        C0138k c0138k = this.f3740y;
        if (c0138k != null) {
            return c0138k;
        }
        d(17);
        throw null;
    }

    @Override // L8.InterfaceC0271e
    public final boolean L0() {
        return false;
    }

    @Override // L8.InterfaceC0271e
    public final int M() {
        return 4;
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
        C0362s c0362s = this.f3741z;
        if (c0362s != null) {
            return c0362s;
        }
        d(14);
        throw null;
    }

    @Override // L8.InterfaceC0271e
    public final Collection e0() {
        List list = Collections.EMPTY_LIST;
        if (list != null) {
            return list;
        }
        d(23);
        throw null;
    }

    @Override // L8.InterfaceC0271e, L8.InterfaceC0279m, L8.InterfaceC0288w
    public final C0280n f() {
        C0280n c0280n = AbstractC0281o.f2822e;
        if (c0280n != null) {
            return c0280n;
        }
        d(20);
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

    @Override // L8.InterfaceC0271e, L8.InterfaceC0288w
    public final int m() {
        return 1;
    }

    @Override // L8.InterfaceC0271e
    public final Collection n() {
        List list = Collections.EMPTY_LIST;
        if (list != null) {
            return list;
        }
        d(16);
        throw null;
    }

    @Override // M8.a
    public final M8.h q() {
        M8.h hVar = this.f3739B;
        if (hVar != null) {
            return hVar;
        }
        d(21);
        throw null;
    }

    @Override // L8.InterfaceC0274h
    public final boolean r() {
        return false;
    }

    @Override // L8.InterfaceC0271e
    public final L8.Q t0() {
        return null;
    }

    public final String toString() {
        return "enum entry " + getName();
    }

    @Override // L8.InterfaceC0271e
    public final boolean u() {
        return false;
    }

    @Override // L8.InterfaceC0271e
    public final C0355k u0() {
        return null;
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
        d(22);
        throw null;
    }
}
