package W8;

import A9.AbstractC0151y;
import A9.b0;
import L8.C0280n;
import L8.InterfaceC0267a;
import L8.InterfaceC0276j;
import L8.M;
import L8.N;
import O8.K;
import O8.L;
import O8.U;
import U8.x;
import com.onesignal.inAppMessages.internal.display.impl.k;
import com.unity3d.ads.metadata.MediationMetaData;
import com.unity3d.services.ads.gmascar.bridges.mobileads.MobileAdsBridge;
import java.util.ArrayList;
import org.chromium.net.UrlRequest;
import p019b9.r;
import p086i8.s;
import p124m9.m;
import p210v8.i;

/* JADX INFO: loaded from: classes.dex */
public class g extends K implements a {

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public final boolean f5367S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public final p076h8.f f5368T;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(InterfaceC0276j interfaceC0276j, M8.h hVar, int i10, C0280n c0280n, boolean z6, p096j9.f fVar, M m2, L8.K k3, int i11, boolean z10, p076h8.f fVar2) {
        super(interfaceC0276j, k3, hVar, i10, c0280n, z6, fVar, i11, m2, false, false, false, false, false);
        if (interfaceC0276j == null) {
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
        if (c0280n == null) {
            N0(3);
            throw null;
        }
        if (fVar == null) {
            N0(4);
            throw null;
        }
        if (m2 == null) {
            N0(5);
            throw null;
        }
        if (i11 == 0) {
            N0(6);
            throw null;
        }
        this.f5367S = z10;
        this.f5368T = fVar2;
    }

    public static /* synthetic */ void N0(int i10) {
        String str = i10 != 21 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        Object[] objArr = new Object[i10 != 21 ? 3 : 2];
        switch (i10) {
            case 1:
            case 8:
                objArr[0] = "annotations";
                break;
            case 2:
            case 9:
                objArr[0] = "modality";
                break;
            case 3:
            case 10:
                objArr[0] = "visibility";
                break;
            case 4:
            case 11:
                objArr[0] = MediationMetaData.KEY_NAME;
                break;
            case 5:
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
            case 18:
                objArr[0] = "source";
                break;
            case 6:
            case 16:
                objArr[0] = "kind";
                break;
            case 7:
            default:
                objArr[0] = "containingDeclaration";
                break;
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                objArr[0] = "newOwner";
                break;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                objArr[0] = "newModality";
                break;
            case 15:
                objArr[0] = "newVisibility";
                break;
            case 17:
                objArr[0] = "newName";
                break;
            case 19:
                objArr[0] = "enhancedValueParameterTypes";
                break;
            case 20:
                objArr[0] = "enhancedReturnType";
                break;
            case MobileAdsBridge.CODE_21 /* 21 */:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaPropertyDescriptor";
                break;
            case 22:
                objArr[0] = "inType";
                break;
        }
        if (i10 != 21) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaPropertyDescriptor";
        } else {
            objArr[1] = "enhance";
        }
        switch (i10) {
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                objArr[2] = "create";
                break;
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
            case 15:
            case 16:
            case 17:
            case 18:
                objArr[2] = "createSubstitutedCopy";
                break;
            case 19:
            case 20:
                objArr[2] = "enhance";
                break;
            case MobileAdsBridge.CODE_21 /* 21 */:
                break;
            case 22:
                objArr[2] = "setInType";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i10 == 21) {
            throw new IllegalStateException(str2);
        }
    }

    public static g h1(InterfaceC0276j interfaceC0276j, X8.b bVar, C0280n c0280n, boolean z6, p096j9.f fVar, Q8.f fVar2, boolean z10) {
        if (interfaceC0276j == null) {
            N0(7);
            throw null;
        }
        if (fVar != null) {
            return new g(interfaceC0276j, bVar, 1, c0280n, z6, fVar, fVar2, null, 1, z10, null);
        }
        N0(11);
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v5, types: [u8.a, v8.k] */
    @Override // W8.a
    public final a B0(AbstractC0151y abstractC0151y, ArrayList arrayList, AbstractC0151y abstractC0151y2, p076h8.f fVar) {
        AbstractC0151y abstractC0151y3;
        L l4;
        O8.M m2;
        L8.K kC = c() == this ? null : c();
        g gVar = new g(v(), q(), m(), f(), this.f3672x, getName(), g(), kC, V(), this.f5367S, fVar);
        L l10 = this.f3669O;
        if (l10 != null) {
            L l11 = new L(gVar, l10.q(), l10.m(), l10.f(), l10.f3642w, l10.f3643x, l10.f3638A, V(), kC == null ? null : kC.e(), l10.g());
            l11.f3641D = l10.f3641D;
            abstractC0151y3 = abstractC0151y2;
            l11.f3675E = abstractC0151y3;
            l4 = l11;
        } else {
            abstractC0151y3 = abstractC0151y2;
            l4 = null;
        }
        O8.M m10 = this.P;
        if (m10 != null) {
            m2 = new O8.M(gVar, m10.q(), m10.m(), m10.f(), m10.f3642w, m10.f3643x, m10.f3638A, V(), kC == null ? null : kC.h(), m10.g());
            m2.f3641D = m2.f3641D;
            U u3 = (U) m10.H0().get(0);
            if (u3 == null) {
                O8.M.N0(6);
                throw null;
            }
            m2.f3677E = u3;
        } else {
            m2 = null;
        }
        gVar.d1(l4, m2, this.f3670Q, this.f3671R);
        ?? r10 = this.f3674z;
        if (r10 != 0) {
            gVar.e1(this.f3673y, r10);
        }
        gVar.p0(x());
        gVar.g1(abstractC0151y3, z(), this.f3666L, abstractC0151y != null ? m.k(this, abstractC0151y, M8.g.a) : null, s.f12328s);
        return gVar;
    }

    @Override // O8.K, L8.T
    public final boolean O() {
        AbstractC0151y type = getType();
        if (!this.f5367S) {
            return false;
        }
        i.f(type, k.EVENT_TYPE_KEY);
        if (((!I8.i.F(type) && !I8.s.a(type)) || b0.e(type)) && !I8.i.G(type)) {
            return false;
        }
        M8.i iVar = r.a;
        p096j9.c cVar = x.f5007p;
        i.e(cVar, "ENHANCED_NULLABILITY_ANNOTATION");
        return !B9.g.u(type, cVar) || I8.i.G(type);
    }

    @Override // O8.V, L8.InterfaceC0268b
    public final boolean Z() {
        return false;
    }

    @Override // O8.K
    public final K b1(InterfaceC0276j interfaceC0276j, int i10, C0280n c0280n, L8.K k3, int i11, p096j9.f fVar) {
        N n10 = M.a;
        if (interfaceC0276j == null) {
            N0(13);
            throw null;
        }
        if (i10 == 0) {
            N0(14);
            throw null;
        }
        if (c0280n == null) {
            N0(15);
            throw null;
        }
        if (i11 == 0) {
            N0(16);
            throw null;
        }
        if (fVar == null) {
            N0(17);
            throw null;
        }
        return new g(interfaceC0276j, q(), i10, c0280n, this.f3672x, fVar, n10, k3, i11, this.f5367S, this.f5368T);
    }

    @Override // O8.K, L8.InterfaceC0268b
    public final Object c0(InterfaceC0267a interfaceC0267a) {
        p076h8.f fVar = this.f5368T;
        if (fVar == null || !((InterfaceC0267a) fVar.f11789s).equals(interfaceC0267a)) {
            return null;
        }
        return fVar.f11790t;
    }

    @Override // O8.K
    public final void f1(AbstractC0151y abstractC0151y) {
    }
}
