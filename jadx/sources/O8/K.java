package O8;

import A9.AbstractC0151y;
import A9.W;
import A9.Z;
import L8.C0280n;
import L8.InterfaceC0267a;
import L8.InterfaceC0271e;
import L8.InterfaceC0276j;
import L8.InterfaceC0278l;
import L8.InterfaceC0285t;
import com.unity3d.ads.metadata.MediationMetaData;
import com.unity3d.services.ads.gmascar.bridges.mobileads.MobileAdsBridge;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import org.chromium.net.UrlRequest;

/* JADX INFO: loaded from: classes.dex */
public class K extends V implements L8.K {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final int f3655A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public C0280n f3656B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public Collection f3657C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final L8.K f3658D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final int f3659E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public final boolean f3660F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public final boolean f3661G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public final boolean f3662H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public final boolean f3663I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public final boolean f3664J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public List f3665K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public x f3666L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public x f3667M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public ArrayList f3668N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public L f3669O;
    public M P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public C0364u f3670Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public C0364u f3671R;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final boolean f3672x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public p247z9.h f3673y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public p210v8.k f3674z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public K(InterfaceC0276j interfaceC0276j, L8.K k3, M8.h hVar, int i10, C0280n c0280n, boolean z6, p096j9.f fVar, int i11, L8.M m2, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14) {
        super(interfaceC0276j, hVar, fVar, null, m2);
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
        if (i11 == 0) {
            N0(5);
            throw null;
        }
        if (m2 == null) {
            N0(6);
            throw null;
        }
        this.f3672x = z6;
        this.f3657C = null;
        this.f3665K = Collections.EMPTY_LIST;
        this.f3655A = i10;
        this.f3656B = c0280n;
        this.f3658D = k3 == null ? this : k3;
        this.f3659E = i11;
        this.f3660F = z10;
        this.f3661G = z11;
        this.f3662H = z12;
        this.f3663I = z13;
        this.f3664J = z14;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x001a  */
    public static /* synthetic */ void N0(int i10) {
        String str;
        int i11;
        if (i10 != 28 && i10 != 38 && i10 != 39 && i10 != 41 && i10 != 42) {
            switch (i10) {
                case MobileAdsBridge.CODE_21 /* 21 */:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                    str = "@NotNull method %s.%s must not return null";
                    break;
                default:
                    str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                    break;
            }
        } else {
            str = "@NotNull method %s.%s must not return null";
        }
        if (i10 != 28 && i10 != 38 && i10 != 39 && i10 != 41 && i10 != 42) {
            switch (i10) {
                case MobileAdsBridge.CODE_21 /* 21 */:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                    i11 = 2;
                    break;
                default:
                    i11 = 3;
                    break;
            }
        } else {
            i11 = 2;
        }
        Object[] objArr = new Object[i11];
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
            case 20:
                objArr[0] = "visibility";
                break;
            case 4:
            case 11:
                objArr[0] = MediationMetaData.KEY_NAME;
                break;
            case 5:
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
            case 35:
                objArr[0] = "kind";
                break;
            case 6:
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
            case 37:
                objArr[0] = "source";
                break;
            case 7:
            default:
                objArr[0] = "containingDeclaration";
                break;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                objArr[0] = "inType";
                break;
            case 15:
            case 17:
                objArr[0] = "outType";
                break;
            case 16:
            case 18:
                objArr[0] = "typeParameters";
                break;
            case 19:
                objArr[0] = "contextReceiverParameters";
                break;
            case MobileAdsBridge.CODE_21 /* 21 */:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 28:
            case 38:
            case 39:
            case 41:
            case 42:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyDescriptorImpl";
                break;
            case 27:
                objArr[0] = "originalSubstitutor";
                break;
            case 29:
                objArr[0] = "copyConfiguration";
                break;
            case 30:
                objArr[0] = "substitutor";
                break;
            case 31:
                objArr[0] = "accessorDescriptor";
                break;
            case 32:
                objArr[0] = "newOwner";
                break;
            case 33:
                objArr[0] = "newModality";
                break;
            case 34:
                objArr[0] = "newVisibility";
                break;
            case 36:
                objArr[0] = "newName";
                break;
            case 40:
                objArr[0] = "overriddenDescriptors";
                break;
        }
        if (i10 == 28) {
            objArr[1] = "getSourceToUseForCopy";
        } else if (i10 == 38) {
            objArr[1] = "getOriginal";
        } else if (i10 == 39) {
            objArr[1] = "getKind";
        } else if (i10 == 41) {
            objArr[1] = "getOverriddenDescriptors";
        } else if (i10 != 42) {
            switch (i10) {
                case MobileAdsBridge.CODE_21 /* 21 */:
                    objArr[1] = "getTypeParameters";
                    break;
                case 22:
                    objArr[1] = "getContextReceiverParameters";
                    break;
                case 23:
                    objArr[1] = "getReturnType";
                    break;
                case 24:
                    objArr[1] = "getModality";
                    break;
                case 25:
                    objArr[1] = "getVisibility";
                    break;
                case 26:
                    objArr[1] = "getAccessors";
                    break;
                default:
                    objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyDescriptorImpl";
                    break;
            }
        } else {
            objArr[1] = "copy";
        }
        switch (i10) {
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                objArr[2] = "create";
                break;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                objArr[2] = "setInType";
                break;
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
                objArr[2] = "setType";
                break;
            case 20:
                objArr[2] = "setVisibility";
                break;
            case MobileAdsBridge.CODE_21 /* 21 */:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 28:
            case 38:
            case 39:
            case 41:
            case 42:
                break;
            case 27:
                objArr[2] = "substitute";
                break;
            case 29:
                objArr[2] = "doSubstitute";
                break;
            case 30:
            case 31:
                objArr[2] = "getSubstitutedInitialSignatureDescriptor";
                break;
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
                objArr[2] = "createSubstitutedCopy";
                break;
            case 40:
                objArr[2] = "setOverriddenDescriptors";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i10 != 28 && i10 != 38 && i10 != 39 && i10 != 41 && i10 != 42) {
            switch (i10) {
                case MobileAdsBridge.CODE_21 /* 21 */:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                    break;
                default:
                    throw new IllegalArgumentException(str2);
            }
        }
        throw new IllegalStateException(str2);
    }

    public static K a1(InterfaceC0271e interfaceC0271e, int i10, C0280n c0280n, boolean z6, p096j9.f fVar, int i11, L8.M m2) {
        M8.f fVar2 = M8.g.a;
        if (interfaceC0271e == null) {
            N0(7);
            throw null;
        }
        if (i10 == 0) {
            N0(9);
            throw null;
        }
        if (c0280n == null) {
            N0(10);
            throw null;
        }
        if (fVar == null) {
            N0(11);
            throw null;
        }
        if (i11 == 0) {
            N0(12);
            throw null;
        }
        if (m2 != null) {
            return new K(interfaceC0271e, null, fVar2, i10, c0280n, z6, fVar, i11, m2, false, false, false, false, false);
        }
        N0(13);
        throw null;
    }

    public static InterfaceC0285t c1(Z z6, L8.J j) {
        if (j == null) {
            N0(31);
            throw null;
        }
        InterfaceC0285t interfaceC0285t = ((I) j).f3641D;
        if (interfaceC0285t != null) {
            return interfaceC0285t.j(z6);
        }
        return null;
    }

    @Override // L8.K
    public final ArrayList A() {
        ArrayList arrayList = new ArrayList(2);
        L l4 = this.f3669O;
        if (l4 != null) {
            arrayList.add(l4);
        }
        M m2 = this.P;
        if (m2 != null) {
            arrayList.add(m2);
        }
        return arrayList;
    }

    @Override // L8.T
    public final p145o9.g A0() {
        p247z9.h hVar = this.f3673y;
        if (hVar != null) {
            return (p145o9.g) hVar.invoke();
        }
        return null;
    }

    @Override // L8.InterfaceC0288w
    public final boolean C0() {
        return false;
    }

    @Override // L8.InterfaceC0288w
    public boolean F() {
        return this.f3663I;
    }

    @Override // O8.V, L8.InterfaceC0268b
    public final x G() {
        return this.f3666L;
    }

    @Override // L8.T
    public boolean O() {
        return this.f3661G;
    }

    @Override // L8.T
    public final boolean P() {
        return this.f3672x;
    }

    @Override // O8.V, L8.InterfaceC0268b
    public final x R() {
        return this.f3667M;
    }

    @Override // L8.K
    public final C0364u U() {
        return this.f3671R;
    }

    @Override // L8.InterfaceC0269c
    public final int V() {
        int i10 = this.f3659E;
        if (i10 != 0) {
            return i10;
        }
        N0(39);
        throw null;
    }

    @Override // L8.InterfaceC0269c
    /* JADX INFO: renamed from: Z0, reason: merged with bridge method [inline-methods] */
    public final K S(InterfaceC0271e interfaceC0271e, int i10, C0280n c0280n) {
        J j = new J(this);
        if (interfaceC0271e == null) {
            J.a(0);
            throw null;
        }
        j.a = interfaceC0271e;
        j.f3648d = null;
        if (i10 == 0) {
            J.a(6);
            throw null;
        }
        j.f3646b = i10;
        if (c0280n == null) {
            J.a(8);
            throw null;
        }
        j.f3647c = c0280n;
        j.f3649e = 2;
        j.f3651g = false;
        K kB = j.b();
        if (kB != null) {
            return kB;
        }
        N0(42);
        throw null;
    }

    @Override // L8.K
    public final C0364u a0() {
        return this.f3670Q;
    }

    @Override // L8.InterfaceC0268b
    public final List b0() {
        List list = this.f3665K;
        if (list != null) {
            return list;
        }
        N0(22);
        throw null;
    }

    public K b1(InterfaceC0276j interfaceC0276j, int i10, C0280n c0280n, L8.K k3, int i11, p096j9.f fVar) {
        L8.N n10 = L8.M.a;
        if (interfaceC0276j == null) {
            N0(32);
            throw null;
        }
        if (i10 == 0) {
            N0(33);
            throw null;
        }
        if (c0280n == null) {
            N0(34);
            throw null;
        }
        if (i11 == 0) {
            N0(35);
            throw null;
        }
        if (fVar == null) {
            N0(36);
            throw null;
        }
        M8.h hVarQ = q();
        boolean zO = O();
        boolean zF = F();
        return new K(interfaceC0276j, k3, hVarQ, i10, c0280n, this.f3672x, fVar, i11, n10, this.f3660F, zO, this.f3662H, zF, this.f3664J);
    }

    @Override // L8.InterfaceC0268b
    public Object c0(InterfaceC0267a interfaceC0267a) {
        return null;
    }

    public final void d1(L l4, M m2, C0364u c0364u, C0364u c0364u2) {
        this.f3669O = l4;
        this.P = m2;
        this.f3670Q = c0364u;
        this.f3671R = c0364u2;
    }

    @Override // L8.K
    public final L e() {
        return this.f3669O;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void e1(p247z9.h hVar, p200u8.a aVar) {
        if (aVar == 0) {
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "compileTimeInitializerFactory", "kotlin/reflect/jvm/internal/impl/descriptors/impl/VariableDescriptorWithInitializerImpl", "setCompileTimeInitializer"));
        }
        this.f3674z = (p210v8.k) aVar;
        if (hVar == null) {
            hVar = (p247z9.h) aVar.invoke();
        }
        this.f3673y = hVar;
    }

    @Override // L8.InterfaceC0279m, L8.InterfaceC0288w
    public final C0280n f() {
        C0280n c0280n = this.f3656B;
        if (c0280n != null) {
            return c0280n;
        }
        N0(25);
        throw null;
    }

    @Override // L8.T
    public final boolean f0() {
        return this.f3660F;
    }

    public final void g1(AbstractC0151y abstractC0151y, List list, x xVar, x xVar2, List list2) {
        if (abstractC0151y == null) {
            N0(17);
            throw null;
        }
        if (list == null) {
            N0(18);
            throw null;
        }
        if (list2 == null) {
            N0(19);
            throw null;
        }
        this.f3694w = abstractC0151y;
        this.f3668N = new ArrayList(list);
        this.f3667M = xVar2;
        this.f3666L = xVar;
        this.f3665K = list2;
    }

    @Override // L8.K
    public final M h() {
        return this.P;
    }

    @Override // L8.InterfaceC0288w
    public final boolean i0() {
        return this.f3662H;
    }

    @Override // L8.InterfaceC0276j
    public final Object k0(InterfaceC0278l interfaceC0278l, Object obj) {
        return interfaceC0278l.F(this, obj);
    }

    @Override // L8.InterfaceC0288w
    public final int m() {
        int i10 = this.f3655A;
        if (i10 != 0) {
            return i10;
        }
        N0(24);
        throw null;
    }

    @Override // L8.K
    public final boolean m0() {
        return this.f3664J;
    }

    @Override // L8.InterfaceC0269c
    public final void p0(Collection collection) {
        if (collection != null) {
            this.f3657C = collection;
        } else {
            N0(40);
            throw null;
        }
    }

    @Override // O8.V, L8.InterfaceC0268b
    public final AbstractC0151y w() {
        AbstractC0151y type = getType();
        if (type != null) {
            return type;
        }
        N0(23);
        throw null;
    }

    @Override // L8.InterfaceC0268b
    public final Collection x() {
        Collection collection = this.f3657C;
        if (collection == null) {
            collection = Collections.EMPTY_LIST;
        }
        if (collection != null) {
            return collection;
        }
        N0(41);
        throw null;
    }

    @Override // O8.V, L8.InterfaceC0268b
    public final List z() {
        ArrayList arrayList = this.f3668N;
        if (arrayList != null) {
            return arrayList;
        }
        throw new IllegalStateException("typeParameters == null for ".concat(AbstractC0359o.X0(this)));
    }

    @Override // L8.O
    public final L8.K j(Z z6) {
        if (z6 == null) {
            N0(27);
            throw null;
        }
        if (z6.a.e()) {
            return this;
        }
        J j = new J(this);
        W wF = z6.f();
        if (wF == null) {
            J.a(15);
            throw null;
        }
        j.f3650f = wF;
        j.f3648d = c();
        return j.b();
    }

    @Override // O8.AbstractC0360p, O8.AbstractC0359o, L8.InterfaceC0276j
    public final L8.K c() {
        L8.K k3 = this.f3658D;
        L8.K kC = k3 == this ? this : k3.c();
        if (kC != null) {
            return kC;
        }
        N0(38);
        throw null;
    }

    public void f1(AbstractC0151y abstractC0151y) {
    }
}
