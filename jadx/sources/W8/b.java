package W8;

import A9.AbstractC0151y;
import L8.InterfaceC0267a;
import L8.InterfaceC0271e;
import L8.InterfaceC0276j;
import L8.InterfaceC0285t;
import L8.M;
import O8.C0355k;
import O8.w;
import java.util.ArrayList;
import org.chromium.net.UrlRequest;
import p086i8.s;
import p124m9.m;

/* JADX INFO: loaded from: classes.dex */
public final class b extends C0355k implements a {

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public Boolean f5361W;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public Boolean f5362X;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(InterfaceC0271e interfaceC0271e, b bVar, M8.h hVar, boolean z6, int i10, M m2) {
        super(interfaceC0271e, bVar, hVar, z6, i10, m2);
        if (interfaceC0271e == null) {
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
        if (m2 == null) {
            N0(3);
            throw null;
        }
        this.f5361W = null;
        this.f5362X = null;
    }

    public static /* synthetic */ void N0(int i10) {
        String str = (i10 == 11 || i10 == 18) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i10 == 11 || i10 == 18) ? 2 : 3];
        switch (i10) {
            case 1:
            case 5:
            case 9:
            case 15:
                objArr[0] = "annotations";
                break;
            case 2:
            case 8:
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                objArr[0] = "kind";
                break;
            case 3:
            case 6:
            case 10:
                objArr[0] = "source";
                break;
            case 4:
            default:
                objArr[0] = "containingDeclaration";
                break;
            case 7:
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                objArr[0] = "newOwner";
                break;
            case 11:
            case 18:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaClassConstructorDescriptor";
                break;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                objArr[0] = "sourceElement";
                break;
            case 16:
                objArr[0] = "enhancedValueParameterTypes";
                break;
            case 17:
                objArr[0] = "enhancedReturnType";
                break;
        }
        if (i10 == 11) {
            objArr[1] = "createSubstitutedCopy";
        } else if (i10 != 18) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaClassConstructorDescriptor";
        } else {
            objArr[1] = "enhance";
        }
        switch (i10) {
            case 4:
            case 5:
            case 6:
                objArr[2] = "createJavaConstructor";
                break;
            case 7:
            case 8:
            case 9:
            case 10:
                objArr[2] = "createSubstitutedCopy";
                break;
            case 11:
            case 18:
                break;
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
            case 15:
                objArr[2] = "createDescriptor";
                break;
            case 16:
            case 17:
                objArr[2] = "enhance";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i10 != 11 && i10 != 18) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    public static b q1(InterfaceC0271e interfaceC0271e, M8.h hVar, boolean z6, Q8.f fVar) {
        if (interfaceC0271e != null) {
            return new b(interfaceC0271e, null, hVar, z6, 1, fVar);
        }
        N0(4);
        throw null;
    }

    @Override // W8.a
    public final a B0(AbstractC0151y abstractC0151y, ArrayList arrayList, AbstractC0151y abstractC0151y2, p076h8.f fVar) {
        b bVarR1 = r1(v(), null, V(), q(), g());
        bVarR1.e1(abstractC0151y == null ? null : m.k(bVarR1, abstractC0151y, M8.g.a), this.f3766B, s.f12328s, z(), xa.d.f(arrayList, H0(), bVarR1), abstractC0151y2, m(), f());
        if (fVar != null) {
            bVarR1.g1((InterfaceC0267a) fVar.f11789s, fVar.f11790t);
        }
        return bVarR1;
    }

    @Override // O8.w, L8.InterfaceC0268b
    public final boolean Z() {
        return this.f5362X.booleanValue();
    }

    @Override // O8.C0355k, O8.w
    public final /* bridge */ /* synthetic */ w b1(int i10, InterfaceC0276j interfaceC0276j, InterfaceC0285t interfaceC0285t, M m2, M8.h hVar, p096j9.f fVar) {
        return r1(interfaceC0276j, interfaceC0285t, i10, hVar, m2);
    }

    @Override // O8.w
    public final void h1(boolean z6) {
        this.f5361W = Boolean.valueOf(z6);
    }

    @Override // O8.w
    public final void i1(boolean z6) {
        this.f5362X = Boolean.valueOf(z6);
    }

    @Override // O8.C0355k
    /* JADX INFO: renamed from: k1 */
    public final /* bridge */ /* synthetic */ C0355k b1(int i10, InterfaceC0276j interfaceC0276j, InterfaceC0285t interfaceC0285t, M m2, M8.h hVar, p096j9.f fVar) {
        return r1(interfaceC0276j, interfaceC0285t, i10, hVar, m2);
    }

    public final b r1(InterfaceC0276j interfaceC0276j, InterfaceC0285t interfaceC0285t, int i10, M8.h hVar, M m2) {
        if (interfaceC0276j == null) {
            N0(7);
            throw null;
        }
        if (i10 == 0) {
            N0(8);
            throw null;
        }
        if (hVar == null) {
            N0(9);
            throw null;
        }
        if (m2 == null) {
            N0(10);
            throw null;
        }
        if (i10 != 1 && i10 != 4) {
            throw new IllegalStateException("Attempt at creating a constructor that is not a declaration: \ncopy from: " + this + "\nnewOwner: " + interfaceC0276j + "\nkind: " + E0.a.s(i10));
        }
        InterfaceC0271e interfaceC0271e = (InterfaceC0271e) interfaceC0276j;
        b bVar = (b) interfaceC0285t;
        if (i10 == 0) {
            N0(13);
            throw null;
        }
        b bVar2 = new b(interfaceC0271e, bVar, hVar, this.f3717V, i10, m2);
        Boolean bool = this.f5361W;
        bool.getClass();
        bVar2.f5361W = bool;
        Boolean bool2 = this.f5362X;
        bool2.getClass();
        bVar2.f5362X = bool2;
        return bVar2;
    }
}
