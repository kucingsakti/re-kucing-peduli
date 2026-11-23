package A9;

import androidx.datastore.preferences.protobuf.AbstractC0487g;
import com.unity3d.services.ads.gmascar.bridges.mobileads.MobileAdsBridge;
import java.util.ArrayList;
import java.util.List;
import org.chromium.net.UrlRequest;

/* JADX INFO: loaded from: classes.dex */
public final class Z {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Z f355b = new Z(W.a);
    public final W a;

    public Z(W w2) {
        this.a = w2;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0021 A[FALL_THROUGH] */
    /* JADX WARN: Code duplicated, block: B:56:0x00b8  */
    public static /* synthetic */ void a(int i10) {
        String str;
        int i11;
        if (i10 != 1 && i10 != 2 && i10 != 8 && i10 != 34 && i10 != 37) {
            switch (i10) {
                default:
                    switch (i10) {
                        default:
                            switch (i10) {
                                default:
                                    switch (i10) {
                                        case 40:
                                        case 41:
                                        case 42:
                                            break;
                                        default:
                                            str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                                            break;
                                    }
                                case 29:
                                case 30:
                                case 31:
                                case 32:
                                    str = "@NotNull method %s.%s must not return null";
                                    break;
                            }
                        case 19:
                        case 20:
                        case MobileAdsBridge.CODE_21 /* 21 */:
                        case 22:
                        case 23:
                        case 24:
                        case 25:
                            str = "@NotNull method %s.%s must not return null";
                            break;
                    }
                case 11:
                case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                    str = "@NotNull method %s.%s must not return null";
                    break;
            }
        } else {
            str = "@NotNull method %s.%s must not return null";
        }
        if (i10 != 1 && i10 != 2 && i10 != 8 && i10 != 34 && i10 != 37) {
            switch (i10) {
                case 11:
                case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                    i11 = 2;
                    break;
                default:
                    switch (i10) {
                        case 19:
                        case 20:
                        case MobileAdsBridge.CODE_21 /* 21 */:
                        case 22:
                        case 23:
                        case 24:
                        case 25:
                            i11 = 2;
                            break;
                        default:
                            switch (i10) {
                                case 29:
                                case 30:
                                case 31:
                                case 32:
                                    i11 = 2;
                                    break;
                                default:
                                    switch (i10) {
                                        case 40:
                                        case 41:
                                        case 42:
                                            i11 = 2;
                                            break;
                                        default:
                                            i11 = 3;
                                            break;
                                    }
                                    break;
                            }
                            break;
                    }
                    break;
            }
        } else {
            i11 = 2;
        }
        Object[] objArr = new Object[i11];
        switch (i10) {
            case 1:
            case 2:
            case 8:
            case 11:
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
            case 19:
            case 20:
            case MobileAdsBridge.CODE_21 /* 21 */:
            case 22:
            case 23:
            case 24:
            case 25:
            case 29:
            case 30:
            case 31:
            case 32:
            case 34:
            case 37:
            case 40:
            case 41:
            case 42:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/types/TypeSubstitutor";
                break;
            case 3:
                objArr[0] = "first";
                break;
            case 4:
                objArr[0] = "second";
                break;
            case 5:
                objArr[0] = "substitutionContext";
                break;
            case 6:
                objArr[0] = "context";
                break;
            case 7:
            default:
                objArr[0] = "substitution";
                break;
            case 9:
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                objArr[0] = com.onesignal.inAppMessages.internal.display.impl.k.EVENT_TYPE_KEY;
                break;
            case 10:
            case 15:
                objArr[0] = "howThisTypeIsUsed";
                break;
            case 16:
            case 17:
            case 36:
                objArr[0] = "typeProjection";
                break;
            case 18:
            case 28:
                objArr[0] = "originalProjection";
                break;
            case 26:
                objArr[0] = "originalType";
                break;
            case 27:
                objArr[0] = "substituted";
                break;
            case 33:
                objArr[0] = "annotations";
                break;
            case 35:
            case 38:
                objArr[0] = "typeParameterVariance";
                break;
            case 39:
                objArr[0] = "projectionKind";
                break;
        }
        if (i10 == 1) {
            objArr[1] = "replaceWithNonApproximatingSubstitution";
        } else if (i10 == 2) {
            objArr[1] = "replaceWithContravariantApproximatingSubstitution";
        } else if (i10 == 8) {
            objArr[1] = "getSubstitution";
        } else if (i10 == 34) {
            objArr[1] = "filterOutUnsafeVariance";
        } else if (i10 != 37) {
            switch (i10) {
                case 11:
                case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                    objArr[1] = "safeSubstitute";
                    break;
                default:
                    switch (i10) {
                        case 19:
                        case 20:
                        case MobileAdsBridge.CODE_21 /* 21 */:
                        case 22:
                        case 23:
                        case 24:
                        case 25:
                            objArr[1] = "unsafeSubstitute";
                            break;
                        default:
                            switch (i10) {
                                case 29:
                                case 30:
                                case 31:
                                case 32:
                                    objArr[1] = "projectedTypeForConflictedTypeWithUnsafeVariance";
                                    break;
                                default:
                                    switch (i10) {
                                        case 40:
                                        case 41:
                                        case 42:
                                            objArr[1] = "combine";
                                            break;
                                        default:
                                            objArr[1] = "kotlin/reflect/jvm/internal/impl/types/TypeSubstitutor";
                                            break;
                                    }
                                    break;
                            }
                            break;
                    }
                    break;
            }
        } else {
            objArr[1] = "combine";
        }
        switch (i10) {
            case 1:
            case 2:
            case 8:
            case 11:
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
            case 19:
            case 20:
            case MobileAdsBridge.CODE_21 /* 21 */:
            case 22:
            case 23:
            case 24:
            case 25:
            case 29:
            case 30:
            case 31:
            case 32:
            case 34:
            case 37:
            case 40:
            case 41:
            case 42:
                break;
            case 3:
            case 4:
                objArr[2] = "createChainedSubstitutor";
                break;
            case 5:
            case 6:
            default:
                objArr[2] = "create";
                break;
            case 7:
                objArr[2] = "<init>";
                break;
            case 9:
            case 10:
                objArr[2] = "safeSubstitute";
                break;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
            case 15:
            case 16:
                objArr[2] = "substitute";
                break;
            case 17:
                objArr[2] = "substituteWithoutApproximation";
                break;
            case 18:
                objArr[2] = "unsafeSubstitute";
                break;
            case 26:
            case 27:
            case 28:
                objArr[2] = "projectedTypeForConflictedTypeWithUnsafeVariance";
                break;
            case 33:
                objArr[2] = "filterOutUnsafeVariance";
                break;
            case 35:
            case 36:
            case 38:
            case 39:
                objArr[2] = "combine";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i10 != 1 && i10 != 2 && i10 != 8 && i10 != 34 && i10 != 37) {
            switch (i10) {
                case 11:
                case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                    break;
                default:
                    switch (i10) {
                        case 19:
                        case 20:
                        case MobileAdsBridge.CODE_21 /* 21 */:
                        case 22:
                        case 23:
                        case 24:
                        case 25:
                            break;
                        default:
                            switch (i10) {
                                case 29:
                                case 30:
                                case 31:
                                case 32:
                                    break;
                                default:
                                    switch (i10) {
                                        case 40:
                                        case 41:
                                        case 42:
                                            break;
                                        default:
                                            throw new IllegalArgumentException(str2);
                                    }
                                    break;
                            }
                            break;
                    }
                    break;
            }
        }
        throw new IllegalStateException(str2);
    }

    public static int b(int i10, int i11) {
        if (i10 == 0) {
            a(38);
            throw null;
        }
        if (i11 == 0) {
            a(39);
            throw null;
        }
        if (i10 == 1) {
            if (i11 == 0) {
                a(40);
                throw null;
            }
        } else {
            if (i11 == 1) {
                if (i10 != 0) {
                    return i10;
                }
                a(41);
                throw null;
            }
            if (i10 != i11) {
                throw new AssertionError("Variance conflict: type parameter variance '" + E0.a.r(i10) + "' and projection kind '" + E0.a.r(i11) + "' cannot be combined");
            }
            if (i11 == 0) {
                a(42);
                throw null;
            }
        }
        return i11;
    }

    public static int c(int i10, int i11) {
        if (i10 == 2 && i11 == 3) {
            return 3;
        }
        return (i10 == 3 && i11 == 2) ? 2 : 1;
    }

    public static Z d(AbstractC0151y abstractC0151y) {
        if (abstractC0151y == null) {
            a(6);
            throw null;
        }
        return new Z(P.f350b.f(abstractC0151y.D(), abstractC0151y.l()));
    }

    public static Z e(W w2, W w10) {
        if (w2 == null) {
            a(3);
            throw null;
        }
        if (w10 == null) {
            a(4);
            throw null;
        }
        if (w2.e()) {
            w2 = w10;
        } else if (!w10.e()) {
            w2 = new C0144q(w2, w10);
        }
        return new Z(w2);
    }

    public static String h(Object obj) {
        try {
            return obj.toString();
        } catch (Throwable th) {
            if (J9.l.j(th)) {
                throw th;
            }
            return "[Exception while computing toString(): " + th + "]";
        }
    }

    public final W f() {
        W w2 = this.a;
        if (w2 != null) {
            return w2;
        }
        a(8);
        throw null;
    }

    public final AbstractC0151y g(int i10, AbstractC0151y abstractC0151y) {
        if (abstractC0151y == null) {
            a(9);
            throw null;
        }
        if (i10 == 0) {
            a(10);
            throw null;
        }
        if (this.a.e()) {
            return abstractC0151y;
        }
        try {
            AbstractC0151y abstractC0151yB = j(new T(i10, abstractC0151y), null, 0).b();
            if (abstractC0151yB != null) {
                return abstractC0151yB;
            }
            a(12);
            throw null;
        } catch (Y e10) {
            return C9.i.c(C9.h.UNABLE_TO_SUBSTITUTE_TYPE, e10.getMessage());
        }
    }

    public final AbstractC0151y i(int i10, AbstractC0151y abstractC0151y) {
        if (abstractC0151y == null) {
            a(14);
            throw null;
        }
        if (i10 == 0) {
            a(15);
            throw null;
        }
        S t7 = new T(i10, f().f(i10, abstractC0151y));
        W w2 = this.a;
        if (!w2.e()) {
            try {
                t7 = j(t7, null, 0);
            } catch (Y unused) {
                t7 = null;
            }
        }
        if (w2.a() || w2.b()) {
            boolean zB = w2.b();
            if (t7 == null) {
                t7 = null;
            } else if (!t7.c()) {
                AbstractC0151y abstractC0151yB = t7.b();
                p210v8.i.e(abstractC0151yB, "typeProjection.type");
                if (b0.c(abstractC0151yB, F9.b.f1653s, null)) {
                    int iA = t7.a();
                    AbstractC0487g.u(iA, "typeProjection.projectionKind");
                    if (iA == 3) {
                        t7 = new T(iA, (AbstractC0151y) p188t1.Y.c(abstractC0151yB).f1652b);
                    } else if (zB) {
                        t7 = new T(iA, (AbstractC0151y) p188t1.Y.c(abstractC0151yB).a);
                    } else {
                        F9.c cVar = new F9.c();
                        Z z6 = new Z(cVar);
                        if (!cVar.e()) {
                            try {
                                t7 = z6.j(t7, null, 0);
                            } catch (Y unused2) {
                                t7 = null;
                            }
                        }
                    }
                }
            }
        }
        if (t7 == null) {
            return null;
        }
        return t7.b();
    }

    /* JADX WARN: Code duplicated, block: B:101:0x01fa  */
    /* JADX WARN: Code duplicated, block: B:104:0x0210  */
    /* JADX WARN: Code duplicated, block: B:106:0x0218  */
    /* JADX WARN: Code duplicated, block: B:107:0x021b  */
    /* JADX WARN: Code duplicated, block: B:109:0x021e  */
    /* JADX WARN: Code duplicated, block: B:110:0x0221  */
    /* JADX WARN: Code duplicated, block: B:112:0x0224  */
    /* JADX WARN: Code duplicated, block: B:118:0x0241  */
    /* JADX WARN: Code duplicated, block: B:123:0x0262  */
    /* JADX WARN: Code duplicated, block: B:125:0x0286  */
    /* JADX WARN: Code duplicated, block: B:127:0x0289  */
    /* JADX WARN: Code duplicated, block: B:130:0x028d  */
    /* JADX WARN: Code duplicated, block: B:133:0x0294  */
    /* JADX WARN: Code duplicated, block: B:139:0x02ae  */
    /* JADX WARN: Code duplicated, block: B:143:0x02b9  */
    /* JADX WARN: Code duplicated, block: B:158:0x02af A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:55:0x0131  */
    /* JADX WARN: Code duplicated, block: B:61:0x0141  */
    /* JADX WARN: Code duplicated, block: B:63:0x0151  */
    /* JADX WARN: Code duplicated, block: B:65:0x0157 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:67:0x015a  */
    /* JADX WARN: Code duplicated, block: B:69:0x0162  */
    /* JADX WARN: Code duplicated, block: B:73:0x017c  */
    /* JADX WARN: Code duplicated, block: B:74:0x017f  */
    /* JADX WARN: Code duplicated, block: B:79:0x0189  */
    /* JADX WARN: Code duplicated, block: B:82:0x0190 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:83:0x0191 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:84:0x0193  */
    /* JADX WARN: Code duplicated, block: B:85:0x019c  */
    /* JADX WARN: Code duplicated, block: B:88:0x01b2  */
    /* JADX WARN: Code duplicated, block: B:90:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:93:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:95:0x01e4  */
    /* JADX WARN: Code duplicated, block: B:98:0x01ec  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final S j(S s9, L8.P p10, int i10) throws Y {
        AbstractC0151y abstractC0151yB;
        int iA;
        d0 d0VarD0;
        C0128a c0128a;
        D d3;
        List listU;
        List listL;
        ArrayList arrayList;
        int i11;
        AbstractC0151y abstractC0151yP;
        L8.P p11;
        S s10;
        S sJ;
        int iD;
        char c10;
        int iJ0;
        int i12;
        Z z6;
        int iC;
        D9.c cVarD0;
        InterfaceC0139l interfaceC0139l;
        AbstractC0151y abstractC0151yH;
        M8.h hVarC;
        int iD2;
        int i13 = 0;
        AbstractC0151y abstractC0151yI = null;
        if (s9 == null) {
            a(18);
            throw null;
        }
        W w2 = this.a;
        if (i10 > 100) {
            throw new IllegalStateException("Recursion too deep. Most likely infinite loop while substituting " + h(s9) + "; substitution: " + h(w2));
        }
        if (!s9.c()) {
            AbstractC0151y abstractC0151yB2 = s9.b();
            if (abstractC0151yB2 instanceof c0) {
                c0 c0Var = (c0) abstractC0151yB2;
                d0 d0VarI = c0Var.i();
                AbstractC0151y abstractC0151yA = c0Var.a();
                S sJ2 = j(new T(s9.a(), d0VarI), p10, i10 + 1);
                return sJ2.c() ? sJ2 : new T(sJ2.a(), AbstractC0130c.B(sJ2.b().D0(), i(s9.a(), abstractC0151yA)));
            }
            p210v8.i.f(abstractC0151yB2, "<this>");
            abstractC0151yB2.D0();
            if (!(abstractC0151yB2.D0() instanceof Z8.f)) {
                S sD = w2.d(abstractC0151yB2);
                if (sD == null) {
                    sD = null;
                } else if (abstractC0151yB2.q().E(I8.n.f2187y)) {
                    O oD = sD.b().D();
                    if (oD instanceof B9.j) {
                        S s11 = ((B9.j) oD).a;
                        int iA2 = s11.a();
                        if (c(s9.a(), iA2) == 3) {
                            sD = new T(s11.b());
                        } else if (p10 != null && c(p10.j0(), iA2) == 3) {
                            sD = new T(s11.b());
                        }
                    }
                }
                int iA3 = s9.a();
                if (sD == null && AbstractC0130c.k(abstractC0151yB2)) {
                    D9.c cVarD1 = abstractC0151yB2.D0();
                    InterfaceC0139l interfaceC0139l2 = cVarD1 instanceof InterfaceC0139l ? (InterfaceC0139l) cVarD1 : null;
                    if (!(interfaceC0139l2 != null ? interfaceC0139l2.b() : false)) {
                        r rVar = (r) abstractC0151yB2.D0();
                        D d8 = rVar.f383t;
                        int i14 = i10 + 1;
                        S sJ3 = j(new T(iA3, d8), p10, i14);
                        D d10 = rVar.f384u;
                        S sJ4 = j(new T(iA3, d10), p10, i14);
                        int iA4 = sJ3.a();
                        if (sJ3.b() != d8 || sJ4.b() != d10) {
                            return new T(iA4, C0133f.j(AbstractC0130c.b(sJ3.b()), AbstractC0130c.b(sJ4.b())));
                        }
                    } else if (!I8.i.E(abstractC0151yB2)) {
                        if (sD != null) {
                            iC = c(iA3, sD.a());
                            if (!(abstractC0151yB2.D() instanceof p135n9.b)) {
                                iD2 = p239z.e.d(iC);
                                if (iD2 != 1) {
                                    return new T(3, abstractC0151yB2.D().s().o());
                                }
                                if (iD2 == 2) {
                                    throw new Y("Out-projection in in-position");
                                }
                            }
                            cVarD0 = abstractC0151yB2.D0();
                            if (cVarD0 instanceof InterfaceC0139l) {
                                interfaceC0139l = (InterfaceC0139l) cVarD0;
                            } else {
                                interfaceC0139l = null;
                            }
                            if (interfaceC0139l != null) {
                                interfaceC0139l = null;
                            } else {
                                interfaceC0139l = null;
                            }
                            if (sD.c()) {
                                return sD;
                            }
                            if (interfaceC0139l != null) {
                                abstractC0151yH = interfaceC0139l.d(sD.b());
                            } else {
                                abstractC0151yH = b0.h(sD.b(), abstractC0151yB2.H());
                            }
                            if (!abstractC0151yB2.q().isEmpty()) {
                                hVarC = w2.c(abstractC0151yB2.q());
                                if (hVarC != null) {
                                    a(33);
                                    throw null;
                                }
                                if (hVarC.E(I8.n.f2187y)) {
                                    hVarC = new M8.l(hVarC, new X());
                                }
                                abstractC0151yH = qa.b.x(abstractC0151yH, new M8.i(new M8.h[]{abstractC0151yH.q(), hVarC}));
                            }
                            if (iC == 1) {
                                iA3 = b(iA3, sD.a());
                            }
                            return new T(iA3, abstractC0151yH);
                        }
                        abstractC0151yB = s9.b();
                        iA = s9.a();
                        if (!(abstractC0151yB.D().w() instanceof L8.P)) {
                            d0VarD0 = abstractC0151yB.D0();
                            if (d0VarD0 instanceof C0128a) {
                                c0128a = (C0128a) d0VarD0;
                            } else {
                                c0128a = null;
                            }
                            if (c0128a != null) {
                                d3 = c0128a.f357u;
                            } else {
                                d3 = null;
                            }
                            if (d3 != null) {
                                if (w2 instanceof C0147u) {
                                    z6 = this;
                                } else {
                                    z6 = this;
                                }
                                abstractC0151yI = z6.i(1, d3);
                            }
                            listU = abstractC0151yB.D().u();
                            listL = abstractC0151yB.l();
                            arrayList = new ArrayList(listU.size());
                            i11 = 0;
                            while (i13 < listU.size()) {
                                p11 = (L8.P) listU.get(i13);
                                s10 = (S) listL.get(i13);
                                sJ = j(s10, p11, i10 + 1);
                                iD = p239z.e.d(c(p11.j0(), sJ.a()));
                                if (iD != 0) {
                                    if (iD != 1) {
                                        c10 = 2;
                                        if (iD == 2) {
                                        }
                                        i12 = 1;
                                    } else {
                                        c10 = 2;
                                    }
                                    sJ = b0.j(p11);
                                    i12 = 1;
                                } else {
                                    c10 = 2;
                                    iJ0 = p11.j0();
                                    i12 = 1;
                                    if (iJ0 != 1) {
                                        sJ = new T(1, sJ.b());
                                    }
                                }
                                if (sJ != s10) {
                                    i11 = i12;
                                }
                                arrayList.add(sJ);
                                i13 += i12;
                            }
                            if (i11 != 0) {
                                listL = arrayList;
                            }
                            M8.h hVarC2 = w2.c(abstractC0151yB.q());
                            p210v8.i.f(listL, "newArguments");
                            p210v8.i.f(hVarC2, "newAnnotations");
                            abstractC0151yP = AbstractC0130c.p(abstractC0151yB, listL, hVarC2, 4);
                            if (abstractC0151yP instanceof D) {
                                abstractC0151yP = AbstractC0130c.A((D) abstractC0151yP, (D) abstractC0151yI);
                            }
                            return new T(iA, abstractC0151yP);
                        }
                    }
                } else if (!I8.i.E(abstractC0151yB2) && !AbstractC0130c.j(abstractC0151yB2)) {
                    if (sD != null) {
                        iC = c(iA3, sD.a());
                        if (!(abstractC0151yB2.D() instanceof p135n9.b)) {
                            iD2 = p239z.e.d(iC);
                            if (iD2 != 1) {
                                return new T(3, abstractC0151yB2.D().s().o());
                            }
                            if (iD2 == 2) {
                                throw new Y("Out-projection in in-position");
                            }
                        }
                        cVarD0 = abstractC0151yB2.D0();
                        if (cVarD0 instanceof InterfaceC0139l) {
                            interfaceC0139l = (InterfaceC0139l) cVarD0;
                        } else {
                            interfaceC0139l = null;
                        }
                        if (interfaceC0139l != null || !interfaceC0139l.b()) {
                            interfaceC0139l = null;
                        }
                        if (sD.c()) {
                            return sD;
                        }
                        if (interfaceC0139l != null) {
                            abstractC0151yH = interfaceC0139l.d(sD.b());
                        } else {
                            abstractC0151yH = b0.h(sD.b(), abstractC0151yB2.H());
                        }
                        if (!abstractC0151yB2.q().isEmpty()) {
                            hVarC = w2.c(abstractC0151yB2.q());
                            if (hVarC != null) {
                                a(33);
                                throw null;
                            }
                            if (hVarC.E(I8.n.f2187y)) {
                                hVarC = new M8.l(hVarC, new X());
                            }
                            abstractC0151yH = qa.b.x(abstractC0151yH, new M8.i(new M8.h[]{abstractC0151yH.q(), hVarC}));
                        }
                        if (iC == 1) {
                            iA3 = b(iA3, sD.a());
                        }
                        return new T(iA3, abstractC0151yH);
                    }
                    abstractC0151yB = s9.b();
                    iA = s9.a();
                    if (!(abstractC0151yB.D().w() instanceof L8.P)) {
                        d0VarD0 = abstractC0151yB.D0();
                        if (d0VarD0 instanceof C0128a) {
                            c0128a = (C0128a) d0VarD0;
                        } else {
                            c0128a = null;
                        }
                        if (c0128a != null) {
                            d3 = c0128a.f357u;
                        } else {
                            d3 = null;
                        }
                        if (d3 != null) {
                            if ((w2 instanceof C0147u) || !w2.b()) {
                                z6 = this;
                            } else {
                                C0147u c0147u = (C0147u) w2;
                                z6 = new Z(new C0147u(c0147u.f387b, c0147u.f388c, false));
                            }
                            abstractC0151yI = z6.i(1, d3);
                        }
                        listU = abstractC0151yB.D().u();
                        listL = abstractC0151yB.l();
                        arrayList = new ArrayList(listU.size());
                        i11 = 0;
                        while (i13 < listU.size()) {
                            p11 = (L8.P) listU.get(i13);
                            s10 = (S) listL.get(i13);
                            sJ = j(s10, p11, i10 + 1);
                            iD = p239z.e.d(c(p11.j0(), sJ.a()));
                            if (iD != 0) {
                                if (iD != 1) {
                                    c10 = 2;
                                    if (iD == 2) {
                                    }
                                    i12 = 1;
                                } else {
                                    c10 = 2;
                                }
                                sJ = b0.j(p11);
                                i12 = 1;
                            } else {
                                c10 = 2;
                                iJ0 = p11.j0();
                                i12 = 1;
                                if (iJ0 != 1 && !sJ.c()) {
                                    sJ = new T(1, sJ.b());
                                }
                            }
                            if (sJ != s10) {
                                i11 = i12;
                            }
                            arrayList.add(sJ);
                            i13 += i12;
                        }
                        if (i11 != 0) {
                            listL = arrayList;
                        }
                        M8.h hVarC3 = w2.c(abstractC0151yB.q());
                        p210v8.i.f(listL, "newArguments");
                        p210v8.i.f(hVarC3, "newAnnotations");
                        abstractC0151yP = AbstractC0130c.p(abstractC0151yB, listL, hVarC3, 4);
                        if ((abstractC0151yP instanceof D) && (abstractC0151yI instanceof D)) {
                            abstractC0151yP = AbstractC0130c.A((D) abstractC0151yP, (D) abstractC0151yI);
                        }
                        return new T(iA, abstractC0151yP);
                    }
                }
            }
        }
        return s9;
    }
}
