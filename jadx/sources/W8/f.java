package W8;

import A9.AbstractC0151y;
import A9.Z;
import G9.i;
import G9.s;
import L8.C0280n;
import L8.InterfaceC0267a;
import L8.InterfaceC0276j;
import L8.InterfaceC0285t;
import L8.M;
import O8.C0365v;
import O8.N;
import O8.w;
import O8.x;
import com.unity3d.ads.metadata.MediationMetaData;
import com.unity3d.services.ads.gmascar.bridges.mobileads.MobileAdsBridge;
import com.unity3d.services.ads.gmascar.bridges.mobileads.MobileAdsBridgeBase;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.chromium.net.UrlRequest;
import p086i8.t;
import p124m9.m;

/* JADX INFO: loaded from: classes.dex */
public final class f extends N implements a {

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public static final e f5363X = new e();

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public static final e f5364Y = new e();

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public int f5365V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public final boolean f5366W;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(InterfaceC0276j interfaceC0276j, N n10, M8.h hVar, p096j9.f fVar, int i10, M m2, boolean z6) {
        super(interfaceC0276j, n10, hVar, fVar, i10, m2);
        if (interfaceC0276j == null) {
            N0(0);
            throw null;
        }
        if (hVar == null) {
            N0(1);
            throw null;
        }
        if (fVar == null) {
            N0(2);
            throw null;
        }
        if (i10 == 0) {
            N0(3);
            throw null;
        }
        this.f5365V = 0;
        this.f5366W = z6;
    }

    public static /* synthetic */ void N0(int i10) {
        String str = (i10 == 13 || i10 == 18 || i10 == 21) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i10 == 13 || i10 == 18 || i10 == 21) ? 2 : 3];
        switch (i10) {
            case 1:
            case 6:
            case 16:
                objArr[0] = "annotations";
                break;
            case 2:
            case 7:
                objArr[0] = MediationMetaData.KEY_NAME;
                break;
            case 3:
            case 15:
                objArr[0] = "kind";
                break;
            case 4:
            case 8:
            case 17:
                objArr[0] = "source";
                break;
            case 5:
            default:
                objArr[0] = "containingDeclaration";
                break;
            case 9:
                objArr[0] = "contextReceiverParameters";
                break;
            case 10:
                objArr[0] = "typeParameters";
                break;
            case 11:
                objArr[0] = "unsubstitutedValueParameters";
                break;
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                objArr[0] = "visibility";
                break;
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
            case 18:
            case MobileAdsBridge.CODE_21 /* 21 */:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaMethodDescriptor";
                break;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                objArr[0] = "newOwner";
                break;
            case 19:
                objArr[0] = "enhancedValueParameterTypes";
                break;
            case 20:
                objArr[0] = "enhancedReturnType";
                break;
        }
        if (i10 == 13) {
            objArr[1] = MobileAdsBridgeBase.initializeMethodName;
        } else if (i10 == 18) {
            objArr[1] = "createSubstitutedCopy";
        } else if (i10 != 21) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaMethodDescriptor";
        } else {
            objArr[1] = "enhance";
        }
        switch (i10) {
            case 5:
            case 6:
            case 7:
            case 8:
                objArr[2] = "createJavaMethod";
                break;
            case 9:
            case 10:
            case 11:
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                objArr[2] = MobileAdsBridgeBase.initializeMethodName;
                break;
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
            case 18:
            case MobileAdsBridge.CODE_21 /* 21 */:
                break;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
            case 15:
            case 16:
            case 17:
                objArr[2] = "createSubstitutedCopy";
                break;
            case 19:
            case 20:
                objArr[2] = "enhance";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i10 != 13 && i10 != 18 && i10 != 21) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    public static f o1(InterfaceC0276j interfaceC0276j, X8.b bVar, p096j9.f fVar, Q8.f fVar2, boolean z6) {
        if (interfaceC0276j == null) {
            N0(5);
            throw null;
        }
        if (fVar != null) {
            return new f(interfaceC0276j, null, bVar, fVar, 1, fVar2, z6);
        }
        N0(7);
        throw null;
    }

    @Override // W8.a
    public final a B0(AbstractC0151y abstractC0151y, ArrayList arrayList, AbstractC0151y abstractC0151y2, p076h8.f fVar) {
        ArrayList arrayListF = xa.d.f(arrayList, H0(), this);
        x xVarK = abstractC0151y == null ? null : m.k(this, abstractC0151y, M8.g.a);
        C0365v c0365vF1 = f1(Z.f355b);
        c0365vF1.f3763y = arrayListF;
        c0365vF1.f3744C = abstractC0151y2;
        c0365vF1.f3742A = xVarK;
        c0365vF1.f3749H = true;
        c0365vF1.f3748G = true;
        f fVar2 = (f) c0365vF1.P.c1(c0365vF1);
        if (fVar != null) {
            fVar2.g1((InterfaceC0267a) fVar.f11789s, fVar.f11790t);
        }
        if (fVar2 != null) {
            return fVar2;
        }
        N0(21);
        throw null;
    }

    @Override // O8.w, L8.InterfaceC0268b
    public final boolean Z() {
        return E0.a.d(this.f5365V);
    }

    @Override // O8.N, O8.w
    public final w b1(int i10, InterfaceC0276j interfaceC0276j, InterfaceC0285t interfaceC0285t, M m2, M8.h hVar, p096j9.f fVar) {
        if (interfaceC0276j == null) {
            N0(14);
            throw null;
        }
        if (i10 == 0) {
            N0(15);
            throw null;
        }
        if (hVar == null) {
            N0(16);
            throw null;
        }
        N n10 = (N) interfaceC0285t;
        if (fVar == null) {
            fVar = getName();
        }
        f fVar2 = new f(interfaceC0276j, n10, hVar, fVar, i10, m2, this.f5366W);
        int i11 = this.f5365V;
        boolean z6 = false;
        if (i11 != 1) {
            if (i11 == 2) {
                z6 = true;
            } else if (i11 != 3) {
                if (i11 != 4) {
                    throw null;
                }
                z6 = true;
            }
        }
        fVar2.p1(z6, E0.a.d(i11));
        return fVar2;
    }

    @Override // O8.N
    public final N n1(x xVar, x xVar2, List list, List list2, List list3, AbstractC0151y abstractC0151y, int i10, C0280n c0280n, t tVar) {
        G9.f fVar;
        if (list == null) {
            N0(9);
            throw null;
        }
        if (list2 == null) {
            N0(10);
            throw null;
        }
        if (list3 == null) {
            N0(11);
            throw null;
        }
        if (c0280n == null) {
            N0(12);
            throw null;
        }
        super.n1(xVar, xVar2, list, list2, list3, abstractC0151y, i10, c0280n, tVar);
        for (i iVar : s.f1781b) {
            iVar.getClass();
            p096j9.f fVar2 = iVar.a;
            if (fVar2 == null || p210v8.i.a(getName(), fVar2)) {
                L9.e eVar = iVar.f1765b;
                if (eVar != null) {
                    String strG = getName().g();
                    p210v8.i.e(strG, "functionDescriptor.name.asString()");
                    if (!eVar.a(strG)) {
                        continue;
                    }
                }
                Collection collection = iVar.f1766c;
                if (collection == null || collection.contains(getName())) {
                    for (G9.e eVar2 : iVar.f1768e) {
                        if (eVar2.b(this) != null) {
                            fVar = new G9.f(false);
                            this.f3769E = fVar.a;
                            return this;
                        }
                    }
                    fVar = ((String) iVar.f1767d.invoke(this)) != null ? new G9.f(false) : G9.f.f1754c;
                    this.f3769E = fVar.a;
                    return this;
                }
            }
        }
        fVar = G9.f.f1753b;
        this.f3769E = fVar.a;
        return this;
    }

    public final void p1(boolean z6, boolean z10) {
        int i10;
        if (z6) {
            i10 = z10 ? 4 : 2;
        } else {
            i10 = z10 ? 3 : 1;
        }
        this.f5365V = i10;
    }
}
