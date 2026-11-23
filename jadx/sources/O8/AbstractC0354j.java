package O8;

import L8.InterfaceC0273g;
import L8.InterfaceC0276j;
import L8.InterfaceC0277k;
import L8.InterfaceC0278l;
import com.unity3d.ads.metadata.MediationMetaData;
import java.util.List;
import org.chromium.net.UrlRequest;

/* JADX INFO: renamed from: O8.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0354j extends AbstractC0360p implements L8.P {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final p247z9.i f3711A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final p247z9.l f3712B;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final int f3713w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final boolean f3714x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final int f3715y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final p247z9.i f3716z;

    /* JADX WARN: Illegal instructions before constructor call */
    public AbstractC0354j(p247z9.o oVar, InterfaceC0276j interfaceC0276j, M8.h hVar, p096j9.f fVar, int i10, boolean z6, int i11, L8.N n10) {
        L8.N n11 = L8.M.a;
        if (oVar == null) {
            N0(0);
            throw null;
        }
        if (interfaceC0276j == null) {
            N0(1);
            throw null;
        }
        if (hVar == null) {
            N0(2);
            throw null;
        }
        if (fVar == null) {
            N0(3);
            throw null;
        }
        if (i10 == 0) {
            N0(4);
            throw null;
        }
        if (n10 == null) {
            N0(6);
            throw null;
        }
        super(interfaceC0276j, hVar, fVar, n11);
        this.f3713w = i10;
        this.f3714x = z6;
        this.f3715y = i11;
        C0350f c0350f = new C0350f(this, oVar, n10);
        p247z9.l lVar = (p247z9.l) oVar;
        this.f3716z = new p247z9.i(lVar, c0350f);
        this.f3711A = new p247z9.i(lVar, new C0352h(this, fVar, 0));
        this.f3712B = lVar;
    }

    public static /* synthetic */ void N0(int i10) {
        String str;
        int i11;
        switch (i10) {
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                str = "@NotNull method %s.%s must not return null";
                break;
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i10) {
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
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
                objArr[0] = "containingDeclaration";
                break;
            case 2:
                objArr[0] = "annotations";
                break;
            case 3:
                objArr[0] = MediationMetaData.KEY_NAME;
                break;
            case 4:
                objArr[0] = "variance";
                break;
            case 5:
                objArr[0] = "source";
                break;
            case 6:
                objArr[0] = "supertypeLoopChecker";
                break;
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractTypeParameterDescriptor";
                break;
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                objArr[0] = "bounds";
                break;
            default:
                objArr[0] = "storageManager";
                break;
        }
        switch (i10) {
            case 7:
                objArr[1] = "getVariance";
                break;
            case 8:
                objArr[1] = "getUpperBounds";
                break;
            case 9:
                objArr[1] = "getTypeConstructor";
                break;
            case 10:
                objArr[1] = "getDefaultType";
                break;
            case 11:
                objArr[1] = "getOriginal";
                break;
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractTypeParameterDescriptor";
                break;
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                objArr[1] = "processBoundsWithoutCycles";
                break;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                objArr[1] = "getStorageManager";
                break;
        }
        switch (i10) {
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                break;
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                objArr[2] = "processBoundsWithoutCycles";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i10) {
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                throw new IllegalStateException(str2);
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    @Override // L8.InterfaceC0273g
    public final A9.O I() {
        A9.O o10 = (A9.O) this.f3716z.invoke();
        if (o10 != null) {
            return o10;
        }
        N0(9);
        throw null;
    }

    @Override // L8.P
    public final p247z9.o L() {
        p247z9.l lVar = this.f3712B;
        if (lVar != null) {
            return lVar;
        }
        N0(14);
        throw null;
    }

    @Override // L8.P
    public final boolean X() {
        return false;
    }

    @Override // L8.P
    public final boolean Y() {
        return this.f3714x;
    }

    public abstract List a1();

    @Override // O8.AbstractC0360p, O8.AbstractC0359o, L8.InterfaceC0276j
    public final InterfaceC0273g c() {
        return this;
    }

    @Override // L8.P
    public final int d0() {
        return this.f3715y;
    }

    @Override // L8.P
    public final List getUpperBounds() {
        List listT = ((C0353i) I()).t();
        if (listT != null) {
            return listT;
        }
        N0(8);
        throw null;
    }

    @Override // L8.P
    public final int j0() {
        int i10 = this.f3713w;
        if (i10 != 0) {
            return i10;
        }
        N0(7);
        throw null;
    }

    @Override // L8.InterfaceC0276j
    public final Object k0(InterfaceC0278l interfaceC0278l, Object obj) {
        return interfaceC0278l.u(this, obj);
    }

    @Override // L8.InterfaceC0273g
    public final A9.D p() {
        A9.D d3 = (A9.D) this.f3711A.invoke();
        if (d3 != null) {
            return d3;
        }
        N0(10);
        throw null;
    }

    @Override // O8.AbstractC0360p, O8.AbstractC0359o, L8.InterfaceC0276j
    public final InterfaceC0276j c() {
        return this;
    }

    @Override // O8.AbstractC0360p, O8.AbstractC0359o, L8.InterfaceC0276j
    public final L8.P c() {
        return this;
    }

    @Override // O8.AbstractC0360p
    /* JADX INFO: renamed from: Y0 */
    public final InterfaceC0277k c() {
        return this;
    }

    public List Z0(List list) {
        return list;
    }
}
