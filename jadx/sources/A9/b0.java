package A9;

import L8.InterfaceC0271e;
import com.unity3d.services.ads.gmascar.bridges.mobileads.MobileAdsBridge;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import org.chromium.net.UrlRequest;

/* JADX INFO: loaded from: classes.dex */
public abstract class b0 {
    public static final C9.f a = C9.i.c(C9.h.DONT_CARE, new String[0]);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C9.f f359b = C9.i.c(C9.h.UNINFERRED_LAMBDA_PARAMETER_TYPE, new String[0]);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a0 f360c = new a0("NO_EXPECTED_TYPE");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a0 f361d = new a0("UNIT_EXPECTED_TYPE");

    /* JADX WARN: Code duplicated, block: B:17:0x0035  */
    /* JADX WARN: Code duplicated, block: B:75:0x010b  */
    /* JADX WARN: Code duplicated, block: B:82:0x0120  */
    public static /* synthetic */ void a(int i10) {
        String str;
        int i11;
        if (i10 != 4 && i10 != 9 && i10 != 11 && i10 != 15 && i10 != 17 && i10 != 19 && i10 != 26 && i10 != 35 && i10 != 48 && i10 != 53 && i10 != 6 && i10 != 7) {
            switch (i10) {
                case 56:
                case 57:
                case 58:
                case 59:
                    str = "@NotNull method %s.%s must not return null";
                    break;
                default:
                    str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                    break;
            }
        } else {
            str = "@NotNull method %s.%s must not return null";
        }
        if (i10 != 4 && i10 != 9 && i10 != 11 && i10 != 15 && i10 != 17 && i10 != 19 && i10 != 26 && i10 != 35 && i10 != 48 && i10 != 53 && i10 != 6 && i10 != 7) {
            switch (i10) {
                case 56:
                case 57:
                case 58:
                case 59:
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
            case 4:
            case 6:
            case 7:
            case 9:
            case 11:
            case 15:
            case 17:
            case 19:
            case 26:
            case 35:
            case 48:
            case 53:
            case 56:
            case 57:
            case 58:
            case 59:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/types/TypeUtils";
                break;
            case 5:
            case 8:
            case 10:
            case 18:
            case 23:
            case 25:
            case 27:
            case 28:
            case 29:
            case 30:
            case 38:
            case 40:
            default:
                objArr[0] = com.onesignal.inAppMessages.internal.display.impl.k.EVENT_TYPE_KEY;
                break;
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                objArr[0] = "typeConstructor";
                break;
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                objArr[0] = "unsubstitutedMemberScope";
                break;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                objArr[0] = "refinedTypeFactory";
                break;
            case 16:
                objArr[0] = "parameters";
                break;
            case 20:
                objArr[0] = "subType";
                break;
            case MobileAdsBridge.CODE_21 /* 21 */:
                objArr[0] = "superType";
                break;
            case 22:
                objArr[0] = "substitutor";
                break;
            case 24:
                objArr[0] = "result";
                break;
            case 31:
            case 33:
                objArr[0] = "clazz";
                break;
            case 32:
                objArr[0] = "typeArguments";
                break;
            case 34:
                objArr[0] = "projections";
                break;
            case 36:
                objArr[0] = R5.a.PUSH_ADDITIONAL_DATA_KEY;
                break;
            case 37:
                objArr[0] = "b";
                break;
            case 39:
                objArr[0] = "typeParameters";
                break;
            case 41:
                objArr[0] = "typeParameterConstructors";
                break;
            case 42:
                objArr[0] = "specialType";
                break;
            case 43:
            case 44:
                objArr[0] = "isSpecialType";
                break;
            case 45:
            case 46:
                objArr[0] = "parameterDescriptor";
                break;
            case 47:
            case 51:
                objArr[0] = "numberValueTypeConstructor";
                break;
            case 49:
            case 50:
                objArr[0] = "supertypes";
                break;
            case 52:
            case 55:
                objArr[0] = "expectedType";
                break;
            case 54:
                objArr[0] = "literalTypeConstructor";
                break;
        }
        if (i10 == 4) {
            objArr[1] = "makeNullableAsSpecified";
        } else if (i10 == 9) {
            objArr[1] = "makeNullableIfNeeded";
        } else if (i10 == 11 || i10 == 15) {
            objArr[1] = "makeUnsubstitutedType";
        } else if (i10 == 17) {
            objArr[1] = "getDefaultTypeProjections";
        } else if (i10 == 19) {
            objArr[1] = "getImmediateSupertypes";
        } else if (i10 == 26) {
            objArr[1] = "getAllSupertypes";
        } else if (i10 == 35) {
            objArr[1] = "substituteProjectionsForParameters";
        } else if (i10 == 48) {
            objArr[1] = "getDefaultPrimitiveNumberType";
        } else if (i10 != 53) {
            if (i10 != 6 && i10 != 7) {
                switch (i10) {
                    case 56:
                    case 57:
                    case 58:
                    case 59:
                        objArr[1] = "getPrimitiveNumberType";
                        break;
                    default:
                        objArr[1] = "kotlin/reflect/jvm/internal/impl/types/TypeUtils";
                        break;
                }
            } else {
                objArr[1] = "makeNullableIfNeeded";
            }
        } else {
            objArr[1] = "getPrimitiveNumberType";
        }
        switch (i10) {
            case 1:
                objArr[2] = "makeNullable";
                break;
            case 2:
                objArr[2] = "makeNotNullable";
                break;
            case 3:
                objArr[2] = "makeNullableAsSpecified";
                break;
            case 4:
            case 6:
            case 7:
            case 9:
            case 11:
            case 15:
            case 17:
            case 19:
            case 26:
            case 35:
            case 48:
            case 53:
            case 56:
            case 57:
            case 58:
            case 59:
                break;
            case 5:
            case 8:
                objArr[2] = "makeNullableIfNeeded";
                break;
            case 10:
                objArr[2] = "canHaveSubtypes";
                break;
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                objArr[2] = "makeUnsubstitutedType";
                break;
            case 16:
                objArr[2] = "getDefaultTypeProjections";
                break;
            case 18:
                objArr[2] = "getImmediateSupertypes";
                break;
            case 20:
            case MobileAdsBridge.CODE_21 /* 21 */:
            case 22:
                objArr[2] = "createSubstitutedSupertype";
                break;
            case 23:
            case 24:
                objArr[2] = "collectAllSupertypes";
                break;
            case 25:
                objArr[2] = "getAllSupertypes";
                break;
            case 27:
                objArr[2] = "isNullableType";
                break;
            case 28:
                objArr[2] = "acceptsNullable";
                break;
            case 29:
                objArr[2] = "hasNullableSuperType";
                break;
            case 30:
                objArr[2] = "getClassDescriptor";
                break;
            case 31:
            case 32:
                objArr[2] = "substituteParameters";
                break;
            case 33:
            case 34:
                objArr[2] = "substituteProjectionsForParameters";
                break;
            case 36:
            case 37:
                objArr[2] = "equalTypes";
                break;
            case 38:
            case 39:
                objArr[2] = "dependsOnTypeParameters";
                break;
            case 40:
            case 41:
                objArr[2] = "dependsOnTypeConstructors";
                break;
            case 42:
            case 43:
            case 44:
                objArr[2] = "contains";
                break;
            case 45:
            case 46:
                objArr[2] = "makeStarProjection";
                break;
            case 47:
            case 49:
                objArr[2] = "getDefaultPrimitiveNumberType";
                break;
            case 50:
                objArr[2] = "findByFqName";
                break;
            case 51:
            case 52:
            case 54:
            case 55:
                objArr[2] = "getPrimitiveNumberType";
                break;
            case 60:
                objArr[2] = "isTypeParameter";
                break;
            case 61:
                objArr[2] = "isReifiedTypeParameter";
                break;
            case 62:
                objArr[2] = "isNonReifiedTypeParameter";
                break;
            case 63:
                objArr[2] = "getTypeParameterDescriptorOrNull";
                break;
            default:
                objArr[2] = "noExpectedType";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i10 != 4 && i10 != 9 && i10 != 11 && i10 != 15 && i10 != 17 && i10 != 19 && i10 != 26 && i10 != 35 && i10 != 48 && i10 != 53 && i10 != 6 && i10 != 7) {
            switch (i10) {
                case 56:
                case 57:
                case 58:
                case 59:
                    break;
                default:
                    throw new IllegalArgumentException(str2);
            }
        }
        throw new IllegalStateException(str2);
    }

    public static boolean b(AbstractC0151y abstractC0151y) {
        if (abstractC0151y == null) {
            a(28);
            throw null;
        }
        if (abstractC0151y.H()) {
            return true;
        }
        return AbstractC0130c.k(abstractC0151y) && b(((r) abstractC0151y.D0()).f384u);
    }

    public static boolean c(AbstractC0151y abstractC0151y, p200u8.b bVar, J9.i iVar) {
        if (abstractC0151y == null) {
            return false;
        }
        d0 d0VarD0 = abstractC0151y.D0();
        if (l(abstractC0151y)) {
            return ((Boolean) bVar.invoke(d0VarD0)).booleanValue();
        }
        if (iVar != null && iVar.contains(abstractC0151y)) {
            return false;
        }
        if (((Boolean) bVar.invoke(d0VarD0)).booleanValue()) {
            return true;
        }
        if (iVar == null) {
            iVar = new J9.i();
        }
        iVar.add(abstractC0151y);
        r rVar = d0VarD0 instanceof r ? (r) d0VarD0 : null;
        if (rVar != null && (c(rVar.f383t, bVar, iVar) || c(rVar.f384u, bVar, iVar))) {
            return true;
        }
        if ((d0VarD0 instanceof C0141n) && c(((C0141n) d0VarD0).f378t, bVar, iVar)) {
            return true;
        }
        O oD = abstractC0151y.D();
        if (oD instanceof C0150x) {
            Iterator it = ((C0150x) oD).f392b.iterator();
            while (it.hasNext()) {
                if (c((AbstractC0151y) it.next(), bVar, iVar)) {
                    return true;
                }
            }
            return false;
        }
        for (S s9 : abstractC0151y.l()) {
            if (!s9.c()) {
                if (c(s9.b(), bVar, iVar)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static List d(List list) {
        if (list == null) {
            a(16);
            throw null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new T(((L8.P) it.next()).p()));
        }
        return p086i8.k.s0(arrayList);
    }

    public static boolean e(AbstractC0151y abstractC0151y) {
        if (abstractC0151y == null) {
            a(27);
            throw null;
        }
        if (!abstractC0151y.H() && (!AbstractC0130c.k(abstractC0151y) || !e(((r) abstractC0151y.D0()).f384u))) {
            if (!(abstractC0151y.D0() instanceof C0141n)) {
                if (f(abstractC0151y)) {
                    if (!(abstractC0151y.D().w() instanceof InterfaceC0271e)) {
                        Z zD = Z.d(abstractC0151y);
                        Collection<AbstractC0151y> collectionT = abstractC0151y.D().t();
                        ArrayList arrayList = new ArrayList(collectionT.size());
                        for (AbstractC0151y abstractC0151y2 : collectionT) {
                            if (abstractC0151y2 == null) {
                                a(21);
                                throw null;
                            }
                            AbstractC0151y abstractC0151yI = zD.i(1, abstractC0151y2);
                            AbstractC0151y abstractC0151yH = abstractC0151yI != null ? h(abstractC0151yI, abstractC0151y.H()) : null;
                            if (abstractC0151yH != null) {
                                arrayList.add(abstractC0151yH);
                            }
                        }
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            if (e((AbstractC0151y) it.next())) {
                                return true;
                            }
                        }
                    }
                    return false;
                }
                O oD = abstractC0151y.D();
                if (oD instanceof C0150x) {
                    Iterator it2 = ((C0150x) oD).f392b.iterator();
                    while (it2.hasNext()) {
                        if (e((AbstractC0151y) it2.next())) {
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public static boolean f(AbstractC0151y abstractC0151y) {
        if (abstractC0151y == null) {
            a(60);
            throw null;
        }
        if ((abstractC0151y.D().w() instanceof L8.P ? (L8.P) abstractC0151y.D().w() : null) != null) {
            return true;
        }
        abstractC0151y.D();
        return false;
    }

    public static d0 g(AbstractC0151y abstractC0151y, boolean z6) {
        if (abstractC0151y == null) {
            a(3);
            throw null;
        }
        d0 d0VarG0 = abstractC0151y.D0().G0(z6);
        if (d0VarG0 != null) {
            return d0VarG0;
        }
        a(4);
        throw null;
    }

    public static AbstractC0151y h(AbstractC0151y abstractC0151y, boolean z6) {
        if (abstractC0151y != null) {
            return z6 ? g(abstractC0151y, true) : abstractC0151y;
        }
        a(8);
        throw null;
    }

    public static D i(D d3, boolean z6) {
        if (d3 == null) {
            a(5);
            throw null;
        }
        if (!z6) {
            return d3;
        }
        D dG0 = d3.G0(true);
        if (dG0 != null) {
            return dG0;
        }
        a(6);
        throw null;
    }

    public static I j(L8.P p10) {
        if (p10 != null) {
            return new I(p10);
        }
        a(45);
        throw null;
    }

    public static S k(L8.P p10, Z8.a aVar) {
        if (p10 != null) {
            return aVar.a == 1 ? new T(1, AbstractC0130c.s(p10)) : new I(p10);
        }
        a(46);
        throw null;
    }

    public static boolean l(AbstractC0151y abstractC0151y) {
        if (abstractC0151y != null) {
            return abstractC0151y == f360c || abstractC0151y == f361d;
        }
        a(0);
        throw null;
    }
}
