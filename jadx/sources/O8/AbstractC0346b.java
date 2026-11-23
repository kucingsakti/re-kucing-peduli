package O8;

import A9.W;
import A9.Z;
import L8.InterfaceC0271e;
import L8.InterfaceC0273g;
import L8.InterfaceC0276j;
import L8.InterfaceC0278l;
import com.unity3d.ads.metadata.MediationMetaData;
import java.util.Collections;
import java.util.List;
import org.chromium.net.UrlRequest;

/* JADX INFO: renamed from: O8.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0346b extends B {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final p096j9.f f3697s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final p247z9.i f3698t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final p247z9.i f3699u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final p247z9.i f3700v;

    public AbstractC0346b(p247z9.l lVar, p096j9.f fVar) {
        if (lVar == null) {
            d(0);
            throw null;
        }
        if (fVar == null) {
            d(1);
            throw null;
        }
        this.f3697s = fVar;
        this.f3698t = new p247z9.i(lVar, new C0345a(this, 0));
        this.f3699u = new p247z9.i(lVar, new C0345a(this, 1));
        this.f3700v = new p247z9.i(lVar, new C0345a(this, 2));
    }

    public static /* synthetic */ void d(int i10) {
        String str = (i10 == 2 || i10 == 3 || i10 == 4 || i10 == 5 || i10 == 6 || i10 == 9 || i10 == 12 || i10 == 14 || i10 == 16 || i10 == 17 || i10 == 19 || i10 == 20) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i10 == 2 || i10 == 3 || i10 == 4 || i10 == 5 || i10 == 6 || i10 == 9 || i10 == 12 || i10 == 14 || i10 == 16 || i10 == 17 || i10 == 19 || i10 == 20) ? 2 : 3];
        switch (i10) {
            case 1:
                objArr[0] = MediationMetaData.KEY_NAME;
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 9:
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
            case 16:
            case 17:
            case 19:
            case 20:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractClassDescriptor";
                break;
            case 7:
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                objArr[0] = "typeArguments";
                break;
            case 8:
            case 11:
                objArr[0] = "kotlinTypeRefiner";
                break;
            case 10:
            case 15:
                objArr[0] = "typeSubstitution";
                break;
            case 18:
                objArr[0] = "substitutor";
                break;
            default:
                objArr[0] = "storageManager";
                break;
        }
        if (i10 == 2) {
            objArr[1] = "getName";
        } else if (i10 == 3) {
            objArr[1] = "getOriginal";
        } else if (i10 == 4) {
            objArr[1] = "getUnsubstitutedInnerClassesScope";
        } else if (i10 == 5) {
            objArr[1] = "getThisAsReceiverParameter";
        } else if (i10 == 6) {
            objArr[1] = "getContextReceivers";
        } else if (i10 == 9 || i10 == 12 || i10 == 14 || i10 == 16) {
            objArr[1] = "getMemberScope";
        } else if (i10 == 17) {
            objArr[1] = "getUnsubstitutedMemberScope";
        } else if (i10 == 19) {
            objArr[1] = "substitute";
        } else if (i10 != 20) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractClassDescriptor";
        } else {
            objArr[1] = "getDefaultType";
        }
        switch (i10) {
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 9:
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
            case 16:
            case 17:
            case 19:
            case 20:
                break;
            case 7:
            case 8:
            case 10:
            case 11:
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
            case 15:
                objArr[2] = "getMemberScope";
                break;
            case 18:
                objArr[2] = "substitute";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i10 != 2 && i10 != 3 && i10 != 4 && i10 != 5 && i10 != 6 && i10 != 9 && i10 != 12 && i10 != 14 && i10 != 16 && i10 != 17 && i10 != 19 && i10 != 20) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // L8.InterfaceC0271e
    public final t9.n E(W w2) {
        p165q9.d.i(p124m9.e.d(this));
        t9.n nVarA = a(w2, B9.f.a);
        if (nVarA != null) {
            return nVarA;
        }
        d(16);
        throw null;
    }

    @Override // L8.InterfaceC0271e
    public List F0() {
        List list = Collections.EMPTY_LIST;
        if (list != null) {
            return list;
        }
        d(6);
        throw null;
    }

    @Override // L8.InterfaceC0271e
    public final x M0() {
        x xVar = (x) this.f3700v.invoke();
        if (xVar != null) {
            return xVar;
        }
        d(5);
        throw null;
    }

    @Override // O8.B
    public t9.n a(W w2, B9.f fVar) {
        if (!w2.e()) {
            return new t9.s(b(fVar), new Z(w2));
        }
        t9.n nVarB = b(fVar);
        if (nVarB != null) {
            return nVarB;
        }
        d(12);
        throw null;
    }

    @Override // O8.B, L8.InterfaceC0271e, L8.InterfaceC0276j
    public final InterfaceC0273g c() {
        return this;
    }

    @Override // L8.InterfaceC0276j
    public final p096j9.f getName() {
        p096j9.f fVar = this.f3697s;
        if (fVar != null) {
            return fVar;
        }
        d(2);
        throw null;
    }

    @Override // L8.O
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public InterfaceC0271e j(Z z6) {
        if (z6 != null) {
            return z6.a.e() ? this : new A(this, z6);
        }
        d(18);
        throw null;
    }

    @Override // L8.InterfaceC0276j
    public final Object k0(InterfaceC0278l interfaceC0278l, Object obj) {
        return interfaceC0278l.b(this, obj);
    }

    @Override // L8.InterfaceC0271e, L8.InterfaceC0273g
    public final A9.D p() {
        A9.D d3 = (A9.D) this.f3698t.invoke();
        if (d3 != null) {
            return d3;
        }
        d(20);
        throw null;
    }

    @Override // L8.InterfaceC0271e
    public t9.n s0() {
        t9.n nVar = (t9.n) this.f3699u.invoke();
        if (nVar != null) {
            return nVar;
        }
        d(4);
        throw null;
    }

    @Override // L8.InterfaceC0271e
    public t9.n z0() {
        p165q9.d.i(p124m9.e.d(this));
        t9.n nVarB = b(B9.f.a);
        if (nVarB != null) {
            return nVarB;
        }
        d(17);
        throw null;
    }

    @Override // O8.B, L8.InterfaceC0276j
    public final InterfaceC0276j c() {
        return this;
    }

    @Override // O8.B, L8.InterfaceC0271e, L8.InterfaceC0276j
    public final InterfaceC0271e c() {
        return this;
    }
}
