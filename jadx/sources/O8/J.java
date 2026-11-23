package O8;

import A9.AbstractC0130c;
import A9.AbstractC0151y;
import A9.W;
import A9.Z;
import L8.AbstractC0281o;
import L8.C0280n;
import L8.InterfaceC0268b;
import L8.InterfaceC0276j;
import com.unity3d.ads.metadata.MediationMetaData;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.chromium.net.UrlRequest;

/* JADX INFO: loaded from: classes.dex */
public final class J {
    public InterfaceC0276j a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f3646b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public C0280n f3647c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f3649e;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final x f3652h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final p096j9.f f3653i;
    public final AbstractC0151y j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ K f3654k;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public L8.K f3648d = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public W f3650f = W.a;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f3651g = true;

    public J(K k3) {
        this.f3654k = k3;
        this.a = k3.v();
        this.f3646b = k3.m();
        this.f3647c = k3.f();
        this.f3649e = k3.V();
        this.f3652h = k3.f3666L;
        this.f3653i = k3.getName();
        this.j = k3.getType();
    }

    public static /* synthetic */ void a(int i10) {
        String str = (i10 == 1 || i10 == 2 || i10 == 3 || i10 == 5 || i10 == 7 || i10 == 9 || i10 == 11 || i10 == 19 || i10 == 13 || i10 == 14 || i10 == 16 || i10 == 17) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i10 == 1 || i10 == 2 || i10 == 3 || i10 == 5 || i10 == 7 || i10 == 9 || i10 == 11 || i10 == 19 || i10 == 13 || i10 == 14 || i10 == 16 || i10 == 17) ? 2 : 3];
        switch (i10) {
            case 1:
            case 2:
            case 3:
            case 5:
            case 7:
            case 9:
            case 11:
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
            case 16:
            case 17:
            case 19:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyDescriptorImpl$CopyConfiguration";
                break;
            case 4:
                objArr[0] = com.onesignal.inAppMessages.internal.display.impl.k.EVENT_TYPE_KEY;
                break;
            case 6:
                objArr[0] = "modality";
                break;
            case 8:
                objArr[0] = "visibility";
                break;
            case 10:
                objArr[0] = "kind";
                break;
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                objArr[0] = "typeParameters";
                break;
            case 15:
                objArr[0] = "substitution";
                break;
            case 18:
                objArr[0] = MediationMetaData.KEY_NAME;
                break;
            default:
                objArr[0] = "owner";
                break;
        }
        if (i10 == 1) {
            objArr[1] = "setOwner";
        } else if (i10 == 2) {
            objArr[1] = "setOriginal";
        } else if (i10 == 3) {
            objArr[1] = "setPreserveSourceElement";
        } else if (i10 == 5) {
            objArr[1] = "setReturnType";
        } else if (i10 == 7) {
            objArr[1] = "setModality";
        } else if (i10 == 9) {
            objArr[1] = "setVisibility";
        } else if (i10 == 11) {
            objArr[1] = "setKind";
        } else if (i10 == 19) {
            objArr[1] = "setName";
        } else if (i10 == 13) {
            objArr[1] = "setTypeParameters";
        } else if (i10 == 14) {
            objArr[1] = "setDispatchReceiverParameter";
        } else if (i10 == 16) {
            objArr[1] = "setSubstitution";
        } else if (i10 != 17) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyDescriptorImpl$CopyConfiguration";
        } else {
            objArr[1] = "setCopyOverrides";
        }
        switch (i10) {
            case 1:
            case 2:
            case 3:
            case 5:
            case 7:
            case 9:
            case 11:
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
            case 16:
            case 17:
            case 19:
                break;
            case 4:
                objArr[2] = "setReturnType";
                break;
            case 6:
                objArr[2] = "setModality";
                break;
            case 8:
                objArr[2] = "setVisibility";
                break;
            case 10:
                objArr[2] = "setKind";
                break;
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                objArr[2] = "setTypeParameters";
                break;
            case 15:
                objArr[2] = "setSubstitution";
                break;
            case 18:
                objArr[2] = "setName";
                break;
            default:
                objArr[2] = "setOwner";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i10 != 1 && i10 != 2 && i10 != 3 && i10 != 5 && i10 != 7 && i10 != 9 && i10 != 11 && i10 != 19 && i10 != 13 && i10 != 14 && i10 != 16 && i10 != 17) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v5, types: [L8.t, O8.I, O8.M] */
    /* JADX WARN: Type inference failed for: r11v6 */
    /* JADX WARN: Type inference failed for: r16v0 */
    /* JADX WARN: Type inference failed for: r16v1, types: [O8.L] */
    /* JADX WARN: Type inference failed for: r16v2 */
    /* JADX WARN: Type inference failed for: r16v3 */
    /* JADX WARN: Type inference failed for: r16v4, types: [O8.M] */
    /* JADX WARN: Type inference failed for: r16v5 */
    /* JADX WARN: Type inference failed for: r18v0, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r2v9, types: [u8.a, v8.k] */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v18, types: [O8.I, O8.L] */
    /* JADX WARN: Type inference failed for: r3v21 */
    /* JADX WARN: Type inference failed for: r4v16, types: [O8.u] */
    /* JADX WARN: Type inference failed for: r4v21 */
    /* JADX WARN: Type inference failed for: r4v26 */
    /* JADX WARN: Type inference failed for: r4v27, types: [A9.y] */
    /* JADX WARN: Type inference failed for: r4v32 */
    /* JADX WARN: Type inference failed for: r4v33 */
    /* JADX WARN: Type inference failed for: r5v11, types: [O8.u] */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v25 */
    /* JADX WARN: Type inference failed for: r8v0, types: [L8.K, L8.b, L8.j, O8.K] */
    public final K b() {
        x xVar;
        x xVar2;
        ?? l4;
        ?? m2;
        Z z6;
        ?? r10;
        x xVar3;
        x xVar4;
        AbstractC0151y abstractC0151yI;
        K k3 = this.f3654k;
        k3.getClass();
        InterfaceC0276j interfaceC0276j = this.a;
        int i10 = this.f3646b;
        C0280n c0280n = this.f3647c;
        L8.K k10 = this.f3648d;
        int i11 = this.f3649e;
        L8.N n10 = L8.M.a;
        ?? B10 = k3.b1(interfaceC0276j, i10, c0280n, k10, i11, this.f3653i);
        List listZ = k3.z();
        ArrayList arrayList = new ArrayList(((ArrayList) listZ).size());
        Z zV = AbstractC0130c.v(listZ, this.f3650f, B10, arrayList);
        AbstractC0151y abstractC0151y = this.j;
        AbstractC0151y abstractC0151yI2 = zV.i(3, abstractC0151y);
        x xVar5 = null;
        if (abstractC0151yI2 != null) {
            AbstractC0151y abstractC0151yI3 = zV.i(2, abstractC0151y);
            if (abstractC0151yI3 != null) {
                B10.f1(abstractC0151yI3);
            }
            x xVar6 = this.f3652h;
            if (xVar6 != null) {
                x xVarJ = xVar6.j(zV);
                xVar = xVarJ != null ? xVarJ : null;
            }
            x xVar7 = k3.f3667M;
            if (xVar7 == null || (abstractC0151yI = zV.i(2, xVar7.getType())) == null) {
                xVar2 = null;
            } else {
                xVar7.Z0();
                xVar2 = new x(B10, new p201u9.b(B10, abstractC0151yI), xVar7.q());
            }
            ArrayList arrayList2 = new ArrayList();
            for (x xVar8 : k3.f3665K) {
                AbstractC0151y abstractC0151yI4 = zV.i(2, xVar8.getType());
                if (abstractC0151yI4 == null) {
                    xVar3 = xVar5;
                    xVar4 = xVar3;
                } else {
                    xVar4 = xVar5;
                    p096j9.f fVarX0 = ((p201u9.a) xVar8.Z0()).X0();
                    xVar8.Z0();
                    xVar3 = new x(B10, new p201u9.a((InterfaceC0268b) B10, abstractC0151yI4, fVarX0), xVar8.q());
                }
                if (xVar3 != null) {
                    arrayList2.add(xVar3);
                }
                xVar5 = xVar4;
            }
            ?? r18 = xVar5;
            B10.g1(abstractC0151yI2, arrayList, xVar, xVar2, arrayList2);
            L l10 = k3.f3669O;
            if (l10 == null) {
                l4 = r18;
            } else {
                M8.h hVarQ = l10.q();
                int i12 = this.f3646b;
                C0280n c0280nF = k3.f3669O.f();
                if (this.f3649e == 2 && AbstractC0281o.e(AbstractC0281o.f(c0280nF.a.l()))) {
                    c0280nF = AbstractC0281o.f2825h;
                }
                C0280n c0280n2 = c0280nF;
                L l11 = k3.f3669O;
                boolean z10 = l11.f3642w;
                int i13 = this.f3649e;
                L8.K k11 = this.f3648d;
                l4 = new L(B10, hVarQ, i12, c0280n2, z10, l11.f3643x, l11.f3638A, i13, k11 == null ? r18 : k11.e(), n10);
            }
            if (l4 != 0) {
                L l12 = k3.f3669O;
                AbstractC0151y abstractC0151y2 = l12.f3675E;
                l4.f3641D = K.c1(zV, l12);
                l4.c1(abstractC0151y2 != null ? zV.i(3, abstractC0151y2) : r18);
            }
            M m10 = k3.P;
            if (m10 == null) {
                m2 = r18;
            } else {
                M8.h hVarQ2 = m10.q();
                int i14 = this.f3646b;
                C0280n c0280nF2 = k3.P.f();
                if (this.f3649e == 2 && AbstractC0281o.e(AbstractC0281o.f(c0280nF2.a.l()))) {
                    c0280nF2 = AbstractC0281o.f2825h;
                }
                C0280n c0280n3 = c0280nF2;
                M m11 = k3.P;
                boolean z11 = m11.f3642w;
                int i15 = this.f3649e;
                L8.K k12 = this.f3648d;
                m2 = new M(B10, hVarQ2, i14, c0280n3, z11, m11.f3643x, m11.f3638A, i15, k12 == null ? r18 : k12.h(), n10);
            }
            if (m2 != 0) {
                z6 = zV;
                List listD1 = w.d1(m2, k3.P.H0(), z6, false, false, null);
                if (listD1 == null) {
                    listD1 = Collections.singletonList(M.b1(m2, p165q9.d.e(this.a).n(), ((U) k3.P.H0().get(0)).q()));
                }
                if (listD1.size() != 1) {
                    throw new IllegalStateException();
                }
                m2.f3641D = K.c1(z6, k3.P);
                U u3 = (U) listD1.get(0);
                if (u3 == null) {
                    M.N0(6);
                    throw r18;
                }
                m2.f3677E = u3;
            } else {
                z6 = zV;
            }
            C0364u c0364u = k3.f3670Q;
            ?? c0364u2 = c0364u == null ? r18 : new C0364u(c0364u.q(), B10);
            C0364u c0364u3 = k3.f3671R;
            B10.d1(l4, m2, c0364u2, c0364u3 == null ? r18 : new C0364u(c0364u3.q(), B10));
            if (this.f3651g) {
                J9.i iVar = new J9.i();
                Iterator it = k3.x().iterator();
                while (it.hasNext()) {
                    iVar.add(((L8.K) it.next()).j(z6));
                }
                B10.f3657C = iVar;
            }
            if (k3.O() && (r10 = k3.f3674z) != 0) {
                B10.e1(k3.f3673y, r10);
            }
            return B10;
        }
        return null;
    }
}
