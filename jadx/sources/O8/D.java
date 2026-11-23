package O8;

import A9.C0138k;
import L8.C0280n;
import com.unity3d.ads.metadata.MediationMetaData;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import org.chromium.net.UrlRequest;

/* JADX INFO: loaded from: classes.dex */
public final class D extends AbstractC0356l {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public C0280n f3627A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public C0138k f3628B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public ArrayList f3629C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final ArrayList f3630D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final p247z9.b f3631E;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final int f3632y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f3633z;

    /* JADX WARN: Illegal instructions before constructor call */
    public D(K8.k kVar, p096j9.f fVar, p247z9.b bVar) {
        L8.N n10 = L8.M.a;
        if (fVar == null) {
            d(2);
            throw null;
        }
        if (bVar == null) {
            d(4);
            throw null;
        }
        super(bVar, kVar, fVar, n10);
        this.f3630D = new ArrayList();
        this.f3631E = bVar;
        this.f3632y = 2;
    }

    public static /* synthetic */ void d(int i10) {
        String str;
        int i11;
        switch (i10) {
            case 5:
            case 7:
            case 8:
            case 10:
            case 11:
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
            case 15:
            case 17:
            case 18:
            case 19:
                str = "@NotNull method %s.%s must not return null";
                break;
            case 6:
            case 9:
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
            case 16:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i10) {
            case 5:
            case 7:
            case 8:
            case 10:
            case 11:
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
            case 15:
            case 17:
            case 18:
            case 19:
                i11 = 2;
                break;
            case 6:
            case 9:
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
            case 16:
            default:
                i11 = 3;
                break;
        }
        Object[] objArr = new Object[i11];
        switch (i10) {
            case 1:
                objArr[0] = "kind";
                break;
            case 2:
                objArr[0] = MediationMetaData.KEY_NAME;
                break;
            case 3:
                objArr[0] = "source";
                break;
            case 4:
                objArr[0] = "storageManager";
                break;
            case 5:
            case 7:
            case 8:
            case 10:
            case 11:
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
            case 15:
            case 17:
            case 18:
            case 19:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/MutableClassDescriptor";
                break;
            case 6:
                objArr[0] = "modality";
                break;
            case 9:
                objArr[0] = "visibility";
                break;
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                objArr[0] = "supertype";
                break;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                objArr[0] = "typeParameters";
                break;
            case 16:
                objArr[0] = "kotlinTypeRefiner";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        switch (i10) {
            case 5:
                objArr[1] = "getAnnotations";
                break;
            case 6:
            case 9:
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
            case 16:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/MutableClassDescriptor";
                break;
            case 7:
                objArr[1] = "getModality";
                break;
            case 8:
                objArr[1] = "getKind";
                break;
            case 10:
                objArr[1] = "getVisibility";
                break;
            case 11:
                objArr[1] = "getTypeConstructor";
                break;
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                objArr[1] = "getConstructors";
                break;
            case 15:
                objArr[1] = "getDeclaredTypeParameters";
                break;
            case 17:
                objArr[1] = "getUnsubstitutedMemberScope";
                break;
            case 18:
                objArr[1] = "getStaticScope";
                break;
            case 19:
                objArr[1] = "getSealedSubclasses";
                break;
        }
        switch (i10) {
            case 5:
            case 7:
            case 8:
            case 10:
            case 11:
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
            case 15:
            case 17:
            case 18:
            case 19:
                break;
            case 6:
                objArr[2] = "setModality";
                break;
            case 9:
                objArr[2] = "setVisibility";
                break;
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                objArr[2] = "addSupertype";
                break;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                objArr[2] = "setTypeParameterDescriptors";
                break;
            case 16:
                objArr[2] = "getUnsubstitutedMemberScope";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i10) {
            case 5:
            case 7:
            case 8:
            case 10:
            case 11:
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
            case 15:
            case 17:
            case 18:
            case 19:
                throw new IllegalStateException(str2);
            case 6:
            case 9:
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
            case 16:
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
        C0138k c0138k = this.f3628B;
        if (c0138k != null) {
            return c0138k;
        }
        d(11);
        throw null;
    }

    @Override // L8.InterfaceC0271e
    public final boolean L0() {
        return false;
    }

    @Override // L8.InterfaceC0271e
    public final int M() {
        int i10 = this.f3632y;
        if (i10 != 0) {
            return i10;
        }
        d(8);
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
        return t9.m.f15259b;
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
        C0280n c0280n = this.f3627A;
        if (c0280n != null) {
            return c0280n;
        }
        d(10);
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
        int i10 = this.f3633z;
        if (i10 != 0) {
            return i10;
        }
        d(7);
        throw null;
    }

    @Override // L8.InterfaceC0271e
    public final Collection n() {
        Set set = Collections.EMPTY_SET;
        if (set != null) {
            return set;
        }
        d(13);
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

    public final String toString() {
        return AbstractC0359o.X0(this);
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
        ArrayList arrayList = this.f3629C;
        if (arrayList != null) {
            return arrayList;
        }
        d(15);
        throw null;
    }
}
