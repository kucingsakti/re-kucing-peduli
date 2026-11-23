package O8;

import A9.Z;
import L8.C0280n;
import L8.InterfaceC0267a;
import L8.InterfaceC0269c;
import L8.InterfaceC0271e;
import L8.InterfaceC0277k;
import L8.InterfaceC0285t;
import com.unity3d.ads.metadata.MediationMetaData;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import org.chromium.net.UrlRequest;

/* JADX INFO: loaded from: classes.dex */
public abstract class I extends AbstractC0360p implements L8.J {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final boolean f3638A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final int f3639B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public C0280n f3640C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public InterfaceC0285t f3641D;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f3642w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final boolean f3643x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final int f3644y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final L8.K f3645z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public I(int i10, C0280n c0280n, L8.K k3, M8.h hVar, p096j9.f fVar, boolean z6, boolean z10, boolean z11, int i11, L8.M m2) {
        super(k3.v(), hVar, fVar, m2);
        if (i10 == 0) {
            N0(0);
            throw null;
        }
        if (c0280n == null) {
            N0(1);
            throw null;
        }
        if (hVar == null) {
            N0(3);
            throw null;
        }
        if (m2 == null) {
            N0(5);
            throw null;
        }
        this.f3641D = null;
        this.f3644y = i10;
        this.f3640C = c0280n;
        this.f3645z = k3;
        this.f3642w = z6;
        this.f3643x = z10;
        this.f3638A = z11;
        this.f3639B = i11;
    }

    public static /* synthetic */ void N0(int i10) {
        String str;
        int i11;
        switch (i10) {
            case 6:
            case 8:
            case 9:
            case 10:
            case 11:
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
            case 15:
                str = "@NotNull method %s.%s must not return null";
                break;
            case 7:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i10) {
            case 6:
            case 8:
            case 9:
            case 10:
            case 11:
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
            case 15:
                i11 = 2;
                break;
            case 7:
            default:
                i11 = 3;
                break;
        }
        Object[] objArr = new Object[i11];
        switch (i10) {
            case 1:
                objArr[0] = "visibility";
                break;
            case 2:
                objArr[0] = "correspondingProperty";
                break;
            case 3:
                objArr[0] = "annotations";
                break;
            case 4:
                objArr[0] = MediationMetaData.KEY_NAME;
                break;
            case 5:
                objArr[0] = "source";
                break;
            case 6:
            case 8:
            case 9:
            case 10:
            case 11:
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
            case 15:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyAccessorDescriptorImpl";
                break;
            case 7:
                objArr[0] = "substitutor";
                break;
            case 16:
                objArr[0] = "overriddenDescriptors";
                break;
            default:
                objArr[0] = "modality";
                break;
        }
        switch (i10) {
            case 6:
                objArr[1] = "getKind";
                break;
            case 7:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyAccessorDescriptorImpl";
                break;
            case 8:
                objArr[1] = "substitute";
                break;
            case 9:
                objArr[1] = "getTypeParameters";
                break;
            case 10:
                objArr[1] = "getModality";
                break;
            case 11:
                objArr[1] = "getVisibility";
                break;
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                objArr[1] = "getCorrespondingVariable";
                break;
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                objArr[1] = "getCorrespondingProperty";
                break;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                objArr[1] = "getContextReceiverParameters";
                break;
            case 15:
                objArr[1] = "getOverriddenDescriptors";
                break;
        }
        switch (i10) {
            case 6:
            case 8:
            case 9:
            case 10:
            case 11:
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
            case 15:
                break;
            case 7:
                objArr[2] = "substitute";
                break;
            case 16:
                objArr[2] = "setOverriddenDescriptors";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i10) {
            case 6:
            case 8:
            case 9:
            case 10:
            case 11:
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
            case 15:
                throw new IllegalStateException(str2);
            case 7:
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    @Override // L8.InterfaceC0285t
    public final InterfaceC0285t C() {
        return this.f3641D;
    }

    @Override // L8.InterfaceC0288w
    public final boolean C0() {
        return false;
    }

    @Override // L8.InterfaceC0288w
    public final boolean F() {
        return this.f3643x;
    }

    @Override // L8.InterfaceC0268b
    public final x G() {
        return Z0().G();
    }

    @Override // L8.InterfaceC0285t
    public final boolean I0() {
        return false;
    }

    @Override // L8.InterfaceC0268b
    public final x R() {
        return Z0().R();
    }

    @Override // L8.InterfaceC0269c
    public final InterfaceC0269c S(InterfaceC0271e interfaceC0271e, int i10, C0280n c0280n) {
        throw new UnsupportedOperationException("Accessors must be copied by the corresponding property");
    }

    @Override // L8.InterfaceC0269c
    public final int V() {
        int i10 = this.f3639B;
        if (i10 != 0) {
            return i10;
        }
        N0(6);
        throw null;
    }

    @Override // L8.InterfaceC0268b
    public final boolean Z() {
        return false;
    }

    public final L8.K Z0() {
        L8.K k3 = this.f3645z;
        if (k3 != null) {
            return k3;
        }
        N0(13);
        throw null;
    }

    public final ArrayList a1(boolean z6) {
        ArrayList arrayList = new ArrayList(0);
        for (L8.K k3 : Z0().x()) {
            I iE = z6 ? k3.e() : k3.h();
            if (iE != null) {
                arrayList.add(iE);
            }
        }
        return arrayList;
    }

    @Override // L8.InterfaceC0268b
    public final List b0() {
        List listB0 = Z0().b0();
        if (listB0 != null) {
            return listB0;
        }
        N0(14);
        throw null;
    }

    @Override // L8.InterfaceC0268b
    public final Object c0(InterfaceC0267a interfaceC0267a) {
        return null;
    }

    @Override // L8.InterfaceC0279m, L8.InterfaceC0288w
    public final C0280n f() {
        C0280n c0280n = this.f3640C;
        if (c0280n != null) {
            return c0280n;
        }
        N0(11);
        throw null;
    }

    @Override // L8.InterfaceC0288w
    public final boolean i0() {
        return false;
    }

    @Override // L8.InterfaceC0285t, L8.O
    public final InterfaceC0285t j(Z z6) {
        if (z6 != null) {
            return this;
        }
        N0(7);
        throw null;
    }

    @Override // L8.InterfaceC0288w
    public final int m() {
        int i10 = this.f3644y;
        if (i10 != 0) {
            return i10;
        }
        N0(10);
        throw null;
    }

    @Override // L8.InterfaceC0285t
    public final boolean n0() {
        return false;
    }

    @Override // L8.InterfaceC0269c
    public final void p0(Collection collection) {
        if (collection != null) {
            return;
        }
        N0(16);
        throw null;
    }

    @Override // L8.InterfaceC0285t
    public final boolean q0() {
        return false;
    }

    @Override // L8.InterfaceC0285t
    public final boolean r0() {
        return false;
    }

    @Override // L8.InterfaceC0285t
    public final boolean t() {
        return false;
    }

    @Override // L8.InterfaceC0285t
    public final boolean u() {
        return this.f3638A;
    }

    @Override // L8.InterfaceC0285t
    public final boolean x0() {
        return false;
    }

    @Override // L8.InterfaceC0268b
    public final List z() {
        List list = Collections.EMPTY_LIST;
        if (list != null) {
            return list;
        }
        N0(9);
        throw null;
    }

    @Override // L8.O
    public final /* bridge */ /* synthetic */ InterfaceC0277k j(Z z6) {
        j(z6);
        return this;
    }
}
