package p124m9;

import A9.AbstractC0130c;
import A9.AbstractC0151y;
import A9.C0133f;
import A9.N;
import B9.c;
import B9.f;
import B9.g;
import J9.i;
import L8.AbstractC0281o;
import L8.C0280n;
import L8.InterfaceC0268b;
import L8.InterfaceC0269c;
import L8.InterfaceC0271e;
import L8.InterfaceC0276j;
import L8.InterfaceC0285t;
import L8.J;
import L8.K;
import L8.P;
import O8.I;
import O8.M;
import O8.U;
import O8.w;
import O8.x;
import R5.a;
import com.unity3d.ads.metadata.MediationMetaData;
import com.unity3d.services.ads.gmascar.bridges.mobileads.MobileAdsBridge;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.ServiceLoader;
import org.chromium.net.UrlRequest;
import p086i8.k;
import p086i8.m;
import p165q9.d;
import p200u8.b;
import p239z.e;

/* JADX INFO: loaded from: classes.dex */
public final class l {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final List f13173b = k.s0(ServiceLoader.load(f.class, f.class.getClassLoader()));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final l f13174c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final c f13175d;
    public final c a;

    static {
        c cVar = new c();
        f13175d = cVar;
        f13174c = new l(cVar);
    }

    public l(c cVar) {
        if (cVar != null) {
            this.a = cVar;
        } else {
            a(5);
            throw null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:103:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:17:0x0035 A[FALL_THROUGH] */
    public static /* synthetic */ void a(int i10) {
        String str;
        int i11;
        if (i10 != 11 && i10 != 12 && i10 != 16 && i10 != 21 && i10 != 95 && i10 != 98 && i10 != 103 && i10 != 44 && i10 != 45) {
            switch (i10) {
                default:
                    switch (i10) {
                        default:
                            switch (i10) {
                                default:
                                    switch (i10) {
                                        case 90:
                                        case 91:
                                        case 92:
                                            break;
                                        default:
                                            str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                                            break;
                                    }
                                case 80:
                                case 81:
                                case 82:
                                case 83:
                                case 84:
                                    str = "@NotNull method %s.%s must not return null";
                                    break;
                            }
                        case 32:
                        case 33:
                        case 34:
                        case 35:
                        case 36:
                        case 37:
                        case 38:
                        case 39:
                            str = "@NotNull method %s.%s must not return null";
                            break;
                    }
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                    str = "@NotNull method %s.%s must not return null";
                    break;
            }
        } else {
            str = "@NotNull method %s.%s must not return null";
        }
        if (i10 != 11 && i10 != 12 && i10 != 16 && i10 != 21 && i10 != 95 && i10 != 98 && i10 != 103 && i10 != 44 && i10 != 45) {
            switch (i10) {
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                    i11 = 2;
                    break;
                default:
                    switch (i10) {
                        case 32:
                        case 33:
                        case 34:
                        case 35:
                        case 36:
                        case 37:
                        case 38:
                        case 39:
                            i11 = 2;
                            break;
                        default:
                            switch (i10) {
                                case 80:
                                case 81:
                                case 82:
                                case 83:
                                case 84:
                                    i11 = 2;
                                    break;
                                default:
                                    switch (i10) {
                                        case 90:
                                        case 91:
                                        case 92:
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
            case 7:
                objArr[0] = "kotlinTypePreparator";
                break;
            case 2:
                objArr[0] = "customSubtype";
                break;
            case 3:
            case 6:
            default:
                objArr[0] = "kotlinTypeRefiner";
                break;
            case 4:
                objArr[0] = "equalityAxioms";
                break;
            case 5:
                objArr[0] = "axioms";
                break;
            case 8:
            case 9:
                objArr[0] = "candidateSet";
                break;
            case 10:
                objArr[0] = "transformFirst";
                break;
            case 11:
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
            case 16:
            case MobileAdsBridge.CODE_21 /* 21 */:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 44:
            case 45:
            case 80:
            case 81:
            case 82:
            case 83:
            case 84:
            case 90:
            case 91:
            case 92:
            case 95:
            case 98:
            case 103:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/OverridingUtil";
                break;
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                objArr[0] = "f";
                break;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                objArr[0] = "g";
                break;
            case 15:
            case 17:
                objArr[0] = "descriptor";
                break;
            case 18:
                objArr[0] = "result";
                break;
            case 19:
            case 22:
            case 30:
            case 40:
                objArr[0] = "superDescriptor";
                break;
            case 20:
            case 23:
            case 31:
            case 41:
                objArr[0] = "subDescriptor";
                break;
            case 42:
                objArr[0] = "firstParameters";
                break;
            case 43:
                objArr[0] = "secondParameters";
                break;
            case 46:
                objArr[0] = "typeInSuper";
                break;
            case 47:
                objArr[0] = "typeInSub";
                break;
            case 48:
            case 51:
            case 77:
                objArr[0] = "typeCheckerState";
                break;
            case 49:
                objArr[0] = "superTypeParameter";
                break;
            case 50:
                objArr[0] = "subTypeParameter";
                break;
            case 52:
                objArr[0] = MediationMetaData.KEY_NAME;
                break;
            case 53:
                objArr[0] = "membersFromSupertypes";
                break;
            case 54:
                objArr[0] = "membersFromCurrent";
                break;
            case 55:
            case 61:
            case 64:
            case 86:
            case 89:
            case 96:
                objArr[0] = "current";
                break;
            case 56:
            case 62:
            case 66:
            case 87:
            case 106:
                objArr[0] = "strategy";
                break;
            case 57:
                objArr[0] = "overriding";
                break;
            case 58:
                objArr[0] = "fromSuper";
                break;
            case 59:
                objArr[0] = "fromCurrent";
                break;
            case 60:
                objArr[0] = "descriptorsFromSuper";
                break;
            case 63:
            case 65:
                objArr[0] = "notOverridden";
                break;
            case 67:
            case 69:
            case 73:
                objArr[0] = a.PUSH_ADDITIONAL_DATA_KEY;
                break;
            case 68:
            case 70:
            case 75:
                objArr[0] = "b";
                break;
            case 71:
                objArr[0] = "candidate";
                break;
            case 72:
            case 88:
            case 93:
            case 109:
                objArr[0] = "descriptors";
                break;
            case 74:
                objArr[0] = "aReturnType";
                break;
            case 76:
                objArr[0] = "bReturnType";
                break;
            case 78:
            case 85:
                objArr[0] = "overridables";
                break;
            case 79:
            case 101:
                objArr[0] = "descriptorByHandle";
                break;
            case 94:
                objArr[0] = "classModality";
                break;
            case 97:
                objArr[0] = "toFilter";
                break;
            case 99:
            case 104:
                objArr[0] = "overrider";
                break;
            case 100:
            case 105:
                objArr[0] = "extractFrom";
                break;
            case 102:
                objArr[0] = "onConflict";
                break;
            case 107:
            case 108:
                objArr[0] = "memberDescriptor";
                break;
        }
        if (i10 == 11 || i10 == 12) {
            objArr[1] = "filterOverrides";
        } else if (i10 == 16) {
            objArr[1] = "getOverriddenDeclarations";
        } else if (i10 == 21) {
            objArr[1] = "isOverridableBy";
        } else if (i10 == 95) {
            objArr[1] = "getMinimalModality";
        } else if (i10 == 98) {
            objArr[1] = "filterVisibleFakeOverrides";
        } else if (i10 == 103) {
            objArr[1] = "extractMembersOverridableInBothWays";
        } else if (i10 != 44 && i10 != 45) {
            switch (i10) {
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                    objArr[1] = "isOverridableBy";
                    break;
                default:
                    switch (i10) {
                        case 32:
                        case 33:
                        case 34:
                        case 35:
                        case 36:
                        case 37:
                        case 38:
                        case 39:
                            objArr[1] = "isOverridableByWithoutExternalConditions";
                            break;
                        default:
                            switch (i10) {
                                case 80:
                                case 81:
                                case 82:
                                case 83:
                                case 84:
                                    objArr[1] = "selectMostSpecificMember";
                                    break;
                                default:
                                    switch (i10) {
                                        case 90:
                                        case 91:
                                        case 92:
                                            objArr[1] = "determineModalityForFakeOverride";
                                            break;
                                        default:
                                            objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/OverridingUtil";
                                            break;
                                    }
                                    break;
                            }
                            break;
                    }
                    break;
            }
        } else {
            objArr[1] = "createTypeCheckerState";
        }
        switch (i10) {
            case 1:
            case 2:
                objArr[2] = "createWithTypePreparatorAndCustomSubtype";
                break;
            case 3:
            case 4:
                objArr[2] = "create";
                break;
            case 5:
            case 6:
            case 7:
                objArr[2] = "<init>";
                break;
            case 8:
                objArr[2] = "filterOutOverridden";
                break;
            case 9:
            case 10:
                objArr[2] = "filterOverrides";
                break;
            case 11:
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
            case 16:
            case MobileAdsBridge.CODE_21 /* 21 */:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 44:
            case 45:
            case 80:
            case 81:
            case 82:
            case 83:
            case 84:
            case 90:
            case 91:
            case 92:
            case 95:
            case 98:
            case 103:
                break;
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                objArr[2] = "overrides";
                break;
            case 15:
                objArr[2] = "getOverriddenDeclarations";
                break;
            case 17:
            case 18:
                objArr[2] = "collectOverriddenDeclarations";
                break;
            case 19:
            case 20:
            case 22:
            case 23:
                objArr[2] = "isOverridableBy";
                break;
            case 30:
            case 31:
                objArr[2] = "isOverridableByWithoutExternalConditions";
                break;
            case 40:
            case 41:
                objArr[2] = "getBasicOverridabilityProblem";
                break;
            case 42:
            case 43:
                objArr[2] = "createTypeCheckerState";
                break;
            case 46:
            case 47:
            case 48:
                objArr[2] = "areTypesEquivalent";
                break;
            case 49:
            case 50:
            case 51:
                objArr[2] = "areTypeParametersEquivalent";
                break;
            case 52:
            case 53:
            case 54:
            case 55:
            case 56:
                objArr[2] = "generateOverridesInFunctionGroup";
                break;
            case 57:
            case 58:
                objArr[2] = "isVisibleForOverride";
                break;
            case 59:
            case 60:
            case 61:
            case 62:
                objArr[2] = "extractAndBindOverridesForMember";
                break;
            case 63:
                objArr[2] = "allHasSameContainingDeclaration";
                break;
            case 64:
            case 65:
            case 66:
                objArr[2] = "createAndBindFakeOverrides";
                break;
            case 67:
            case 68:
                objArr[2] = "isMoreSpecific";
                break;
            case 69:
            case 70:
                objArr[2] = "isVisibilityMoreSpecific";
                break;
            case 71:
            case 72:
                objArr[2] = "isMoreSpecificThenAllOf";
                break;
            case 73:
            case 74:
            case 75:
            case 76:
            case 77:
                objArr[2] = "isReturnTypeMoreSpecific";
                break;
            case 78:
            case 79:
                objArr[2] = "selectMostSpecificMember";
                break;
            case 85:
            case 86:
            case 87:
                objArr[2] = "createAndBindFakeOverride";
                break;
            case 88:
            case 89:
                objArr[2] = "determineModalityForFakeOverride";
                break;
            case 93:
            case 94:
                objArr[2] = "getMinimalModality";
                break;
            case 96:
            case 97:
                objArr[2] = "filterVisibleFakeOverrides";
                break;
            case 99:
            case 100:
            case 101:
            case 102:
            case 104:
            case 105:
            case 106:
                objArr[2] = "extractMembersOverridableInBothWays";
                break;
            case 107:
                objArr[2] = "resolveUnknownVisibilityForMember";
                break;
            case 108:
                objArr[2] = "computeVisibilityToInherit";
                break;
            case 109:
                objArr[2] = "findMaxVisibility";
                break;
            default:
                objArr[2] = "createWithTypeRefiner";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i10 != 11 && i10 != 12 && i10 != 16 && i10 != 21 && i10 != 95 && i10 != 98 && i10 != 103 && i10 != 44 && i10 != 45) {
            switch (i10) {
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                    break;
                default:
                    switch (i10) {
                        case 32:
                        case 33:
                        case 34:
                        case 35:
                        case 36:
                        case 37:
                        case 38:
                        case 39:
                            break;
                        default:
                            switch (i10) {
                                case 80:
                                case 81:
                                case 82:
                                case 83:
                                case 84:
                                    break;
                                default:
                                    switch (i10) {
                                        case 90:
                                        case 91:
                                        case 92:
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

    public static boolean b(AbstractC0151y abstractC0151y, AbstractC0151y abstractC0151y2, N n10) {
        if (abstractC0151y == null) {
            a(46);
            throw null;
        }
        if (abstractC0151y2 == null) {
            a(47);
            throw null;
        }
        if (AbstractC0130c.j(abstractC0151y) && AbstractC0130c.j(abstractC0151y2)) {
            return true;
        }
        return C0133f.g(n10, abstractC0151y.D0(), abstractC0151y2.D0());
    }

    public static void c(InterfaceC0269c interfaceC0269c, LinkedHashSet linkedHashSet) {
        if (interfaceC0269c == null) {
            a(17);
            throw null;
        }
        if (interfaceC0269c.V() != 2) {
            linkedHashSet.add(interfaceC0269c);
            return;
        }
        if (interfaceC0269c.x().isEmpty()) {
            throw new IllegalStateException("No overridden descriptors found for (fake override) " + interfaceC0269c);
        }
        Iterator it = interfaceC0269c.x().iterator();
        while (it.hasNext()) {
            c((InterfaceC0269c) it.next(), linkedHashSet);
        }
    }

    public static ArrayList d(InterfaceC0268b interfaceC0268b) {
        x xVarR = interfaceC0268b.R();
        ArrayList arrayList = new ArrayList();
        if (xVarR != null) {
            arrayList.add(xVarR.getType());
        }
        Iterator it = interfaceC0268b.H0().iterator();
        while (it.hasNext()) {
            arrayList.add(((U) it.next()).getType());
        }
        return arrayList;
    }

    public static void e(Collection collection, InterfaceC0271e interfaceC0271e, m mVar) {
        if (collection == null) {
            a(85);
            throw null;
        }
        if (interfaceC0271e == null) {
            a(86);
            throw null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = collection.iterator();
        while (true) {
            boolean z6 = false;
            int iM = 1;
            if (!it.hasNext()) {
                boolean zIsEmpty = arrayList.isEmpty();
                if (!zIsEmpty) {
                    collection = arrayList;
                }
                Iterator it2 = collection.iterator();
                boolean z10 = false;
                boolean z11 = false;
                while (true) {
                    if (!it2.hasNext()) {
                        if (interfaceC0271e.i0() && interfaceC0271e.m() != 4 && interfaceC0271e.m() != 2) {
                            z6 = true;
                        }
                        if (z10 && !z11) {
                            iM = 3;
                            break;
                        }
                        if (!z10 && z11) {
                            iM = z6 ? interfaceC0271e.m() : 4;
                            if (iM != 0) {
                                break;
                            }
                            a(92);
                            throw null;
                        }
                        HashSet<InterfaceC0269c> hashSet = new HashSet();
                        for (InterfaceC0269c interfaceC0269c : collection) {
                            if (interfaceC0269c == null) {
                                a(15);
                                throw null;
                            }
                            LinkedHashSet linkedHashSet = new LinkedHashSet();
                            c(interfaceC0269c, linkedHashSet);
                            hashSet.addAll(linkedHashSet);
                        }
                        if (!hashSet.isEmpty() && d.j((InterfaceC0276j) hashSet.iterator().next()).o0(g.a) != null) {
                            throw new ClassCastException();
                        }
                        if (hashSet.size() > 1) {
                            LinkedHashSet linkedHashSet2 = new LinkedHashSet();
                            for (Object obj : hashSet) {
                                Iterator it3 = linkedHashSet2.iterator();
                                while (true) {
                                    if (!it3.hasNext()) {
                                        linkedHashSet2.add(obj);
                                        break;
                                    }
                                    InterfaceC0268b interfaceC0268b = (InterfaceC0268b) obj;
                                    InterfaceC0268b interfaceC0268b2 = (InterfaceC0268b) it3.next();
                                    if (!q(interfaceC0268b, interfaceC0268b2)) {
                                        if (q(interfaceC0268b2, interfaceC0268b)) {
                                            break;
                                        }
                                    } else {
                                        it3.remove();
                                    }
                                }
                            }
                            hashSet = linkedHashSet2;
                        }
                        int iM2 = interfaceC0271e.m();
                        if (iM2 == 0) {
                            a(94);
                            throw null;
                        }
                        iM = 4;
                        for (InterfaceC0269c interfaceC0269c2 : hashSet) {
                            int iM3 = (z6 && interfaceC0269c2.m() == 4) ? iM2 : interfaceC0269c2.m();
                            if (e.a(iM3, iM) < 0) {
                                iM = iM3;
                            }
                        }
                        if (iM != 0) {
                            break;
                        }
                        a(95);
                        throw null;
                    }
                    InterfaceC0269c interfaceC0269c3 = (InterfaceC0269c) it2.next();
                    int iD = e.d(interfaceC0269c3.m());
                    if (iD == 0) {
                        break;
                    }
                    if (iD == 1) {
                        throw new IllegalStateException("Member cannot have SEALED modality: " + interfaceC0269c3);
                    }
                    if (iD == 2) {
                        z10 = true;
                    } else if (iD == 3) {
                        z11 = true;
                    }
                }
                InterfaceC0269c interfaceC0269cS = ((InterfaceC0269c) s(collection, new i(0))).S(interfaceC0271e, iM, zIsEmpty ? AbstractC0281o.f2825h : AbstractC0281o.f2824g);
                mVar.p(interfaceC0269cS, collection);
                mVar.b(interfaceC0269cS);
                return;
            }
            Object next = it.next();
            InterfaceC0269c interfaceC0269c4 = (InterfaceC0269c) next;
            if (!AbstractC0281o.e(interfaceC0269c4.f())) {
                if (interfaceC0269c4 == null) {
                    AbstractC0281o.a(2);
                    throw null;
                }
                if (interfaceC0271e == null) {
                    AbstractC0281o.a(3);
                    throw null;
                }
                if (AbstractC0281o.c(AbstractC0281o.f2828l, interfaceC0269c4, interfaceC0271e) == null) {
                    z6 = true;
                }
            }
            if (z6) {
                arrayList.add(next);
            }
        }
    }

    public static ArrayList g(Object obj, LinkedList linkedList, b bVar, b bVar2) {
        if (obj == null) {
            a(99);
            throw null;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(obj);
        InterfaceC0268b interfaceC0268b = (InterfaceC0268b) bVar.invoke(obj);
        Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            InterfaceC0268b interfaceC0268b2 = (InterfaceC0268b) bVar.invoke(next);
            if (obj == next) {
                it.remove();
            } else {
                int iJ = j(interfaceC0268b, interfaceC0268b2);
                if (iJ == 1) {
                    arrayList.add(next);
                    it.remove();
                } else if (iJ == 3) {
                    bVar2.invoke(next);
                    it.remove();
                }
            }
        }
        return arrayList;
    }

    public static k i(InterfaceC0268b interfaceC0268b, InterfaceC0268b interfaceC0268b2) {
        boolean z6;
        k kVarD;
        if (interfaceC0268b == null) {
            a(40);
            throw null;
        }
        if (interfaceC0268b2 == null) {
            a(41);
            throw null;
        }
        boolean z10 = interfaceC0268b instanceof InterfaceC0285t;
        if ((z10 && !(interfaceC0268b2 instanceof InterfaceC0285t)) || (((z6 = interfaceC0268b instanceof K)) && !(interfaceC0268b2 instanceof K))) {
            return k.d("Member kind mismatch");
        }
        if (!z10 && !z6) {
            throw new IllegalArgumentException("This type of CallableDescriptor cannot be checked for overridability: " + interfaceC0268b);
        }
        if (!interfaceC0268b.getName().equals(interfaceC0268b2.getName())) {
            return k.d("Name mismatch");
        }
        if ((interfaceC0268b.R() == null) != (interfaceC0268b2.R() == null)) {
            kVarD = k.d("Receiver presence mismatch");
        } else {
            kVarD = interfaceC0268b.H0().size() != interfaceC0268b2.H0().size() ? k.d("Value parameter number mismatch") : null;
        }
        if (kVarD != null) {
            return kVarD;
        }
        return null;
    }

    public static int j(InterfaceC0268b interfaceC0268b, InterfaceC0268b interfaceC0268b2) {
        l lVar = f13174c;
        int iC = lVar.l(interfaceC0268b2, interfaceC0268b, null).c();
        int iC2 = lVar.m(interfaceC0268b, interfaceC0268b2, null, false).c();
        if (iC == 1 && iC2 == 1) {
            return 1;
        }
        return (iC == 3 || iC2 == 3) ? 3 : 2;
    }

    public static boolean k(InterfaceC0268b interfaceC0268b, InterfaceC0268b interfaceC0268b2) {
        if (interfaceC0268b == null) {
            a(67);
            throw null;
        }
        if (interfaceC0268b2 == null) {
            a(68);
            throw null;
        }
        AbstractC0151y abstractC0151yW = interfaceC0268b.w();
        AbstractC0151y abstractC0151yW2 = interfaceC0268b2.w();
        if (!p(interfaceC0268b, interfaceC0268b2)) {
            return false;
        }
        N nF = f13174c.f(interfaceC0268b.z(), interfaceC0268b2.z());
        if (interfaceC0268b instanceof InterfaceC0285t) {
            return o(interfaceC0268b, abstractC0151yW, interfaceC0268b2, abstractC0151yW2, nF);
        }
        if (!(interfaceC0268b instanceof K)) {
            throw new IllegalArgumentException("Unexpected callable: " + interfaceC0268b.getClass());
        }
        K k3 = (K) interfaceC0268b;
        K k10 = (K) interfaceC0268b2;
        M mH = k3.h();
        M mH2 = k10.h();
        if (!((mH == null || mH2 == null) ? true : p(mH, mH2))) {
            return false;
        }
        if (k3.P() && k10.P()) {
            return C0133f.g(nF, abstractC0151yW.D0(), abstractC0151yW2.D0());
        }
        return (k3.P() || !k10.P()) && o(interfaceC0268b, abstractC0151yW, interfaceC0268b2, abstractC0151yW2, nF);
    }

    public static boolean o(InterfaceC0268b interfaceC0268b, AbstractC0151y abstractC0151y, InterfaceC0268b interfaceC0268b2, AbstractC0151y abstractC0151y2, N n10) {
        if (interfaceC0268b == null) {
            a(73);
            throw null;
        }
        if (abstractC0151y == null) {
            a(74);
            throw null;
        }
        if (interfaceC0268b2 == null) {
            a(75);
            throw null;
        }
        if (abstractC0151y2 != null) {
            return C0133f.n(C0133f.a, n10, abstractC0151y.D0(), abstractC0151y2.D0());
        }
        a(76);
        throw null;
    }

    public static boolean p(InterfaceC0268b interfaceC0268b, InterfaceC0268b interfaceC0268b2) {
        if (interfaceC0268b == null) {
            a(69);
            throw null;
        }
        if (interfaceC0268b2 != null) {
            Integer numB = AbstractC0281o.b(interfaceC0268b.f(), interfaceC0268b2.f());
            return numB == null || numB.intValue() >= 0;
        }
        a(70);
        throw null;
    }

    public static boolean q(InterfaceC0268b interfaceC0268b, InterfaceC0268b interfaceC0268b2) {
        if (interfaceC0268b == null) {
            a(13);
            throw null;
        }
        if (interfaceC0268b2 == null) {
            a(14);
            throw null;
        }
        boolean zEquals = interfaceC0268b.equals(interfaceC0268b2);
        c cVar = c.a;
        if (!zEquals && cVar.c(interfaceC0268b.c(), interfaceC0268b2.c(), false)) {
            return true;
        }
        InterfaceC0268b interfaceC0268bC = interfaceC0268b2.c();
        int i10 = e.a;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        e.b(interfaceC0268b.c(), linkedHashSet);
        Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            if (cVar.c(interfaceC0268bC, (InterfaceC0268b) it.next(), false)) {
                return true;
            }
        }
        return false;
    }

    public static void r(InterfaceC0269c interfaceC0269c, I8.g gVar) {
        C0280n c0280n;
        C0280n c0280nF;
        C0280n c0280n2;
        if (interfaceC0269c == null) {
            a(107);
            throw null;
        }
        for (InterfaceC0269c interfaceC0269c2 : interfaceC0269c.x()) {
            if (interfaceC0269c2.f() == AbstractC0281o.f2824g) {
                r(interfaceC0269c2, gVar);
            }
        }
        if (interfaceC0269c.f() != AbstractC0281o.f2824g) {
            return;
        }
        Collection<InterfaceC0269c> collectionX = interfaceC0269c.x();
        if (collectionX == null) {
            a(109);
            throw null;
        }
        if (!collectionX.isEmpty()) {
            Iterator it = collectionX.iterator();
            loop3: while (true) {
                c0280n = null;
                while (true) {
                    if (!it.hasNext()) {
                        break loop3;
                    }
                    C0280n c0280nF2 = ((InterfaceC0269c) it.next()).f();
                    if (c0280n != null) {
                        Integer numB = AbstractC0281o.b(c0280nF2, c0280n);
                        if (numB != null) {
                            if (numB.intValue() > 0) {
                            }
                        }
                    }
                    c0280n = c0280nF2;
                }
            }
            if (c0280n == null) {
                c0280nF = null;
                break;
            }
            Iterator it2 = collectionX.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    c0280nF = c0280n;
                    break;
                }
                Integer numB2 = AbstractC0281o.b(c0280n, ((InterfaceC0269c) it2.next()).f());
                if (numB2 == null || numB2.intValue() < 0) {
                    c0280nF = null;
                    break;
                }
            }
        } else {
            c0280nF = AbstractC0281o.j;
        }
        if (c0280nF == null) {
            c0280nF = null;
            break;
        }
        if (interfaceC0269c.V() == 2) {
            for (InterfaceC0269c interfaceC0269c3 : collectionX) {
                if (interfaceC0269c3.m() != 4 && !interfaceC0269c3.f().equals(c0280nF)) {
                    c0280nF = null;
                    break;
                }
            }
        } else {
            c0280nF = AbstractC0281o.f(c0280nF.a.l());
        }
        if (c0280nF == null) {
            if (gVar != null) {
                gVar.invoke(interfaceC0269c);
            }
            c0280n2 = AbstractC0281o.f2822e;
        } else {
            c0280n2 = c0280nF;
        }
        if (interfaceC0269c instanceof O8.K) {
            O8.K k3 = (O8.K) interfaceC0269c;
            if (c0280n2 == null) {
                O8.K.N0(20);
                throw null;
            }
            k3.f3656B = c0280n2;
            Iterator it3 = ((K) interfaceC0269c).A().iterator();
            while (it3.hasNext()) {
                r((J) it3.next(), c0280nF == null ? null : gVar);
            }
            return;
        }
        if (interfaceC0269c instanceof w) {
            w wVar = (w) interfaceC0269c;
            if (c0280n2 != null) {
                wVar.f3768D = c0280n2;
                return;
            } else {
                w.N0(10);
                throw null;
            }
        }
        I i10 = (I) interfaceC0269c;
        i10.f3640C = c0280n2;
        if (c0280n2 != i10.Z0().f()) {
            i10.f3642w = false;
        }
    }

    public static Object s(Collection collection, b bVar) {
        Object next;
        if (collection.size() == 1) {
            Object objS = k.S(collection);
            if (objS != null) {
                return objS;
            }
            a(80);
            throw null;
        }
        ArrayList arrayList = new ArrayList(2);
        ArrayList arrayList2 = new ArrayList(m.H(collection, 10));
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            arrayList2.add(bVar.invoke(it.next()));
        }
        Object objS2 = k.S(collection);
        InterfaceC0268b interfaceC0268b = (InterfaceC0268b) bVar.invoke(objS2);
        for (Object obj : collection) {
            InterfaceC0268b interfaceC0268b2 = (InterfaceC0268b) bVar.invoke(obj);
            if (interfaceC0268b2 == null) {
                a(71);
                throw null;
            }
            Iterator it2 = arrayList2.iterator();
            do {
                if (!it2.hasNext()) {
                    arrayList.add(obj);
                    break;
                }
            } while (k(interfaceC0268b2, (InterfaceC0268b) it2.next()));
            if (k(interfaceC0268b2, interfaceC0268b) && !k(interfaceC0268b, interfaceC0268b2)) {
                objS2 = obj;
            }
        }
        if (arrayList.isEmpty()) {
            if (objS2 != null) {
                return objS2;
            }
            a(81);
            throw null;
        }
        if (arrayList.size() == 1) {
            Object objS3 = k.S(arrayList);
            if (objS3 != null) {
                return objS3;
            }
            a(82);
            throw null;
        }
        Iterator it3 = arrayList.iterator();
        do {
            if (!it3.hasNext()) {
                next = null;
                break;
            }
            next = it3.next();
        } while (AbstractC0130c.k(((InterfaceC0268b) bVar.invoke(next)).w()));
        if (next != null) {
            return next;
        }
        Object objS4 = k.S(arrayList);
        if (objS4 != null) {
            return objS4;
        }
        a(84);
        throw null;
    }

    public final N f(List list, List list2) {
        if (list == null) {
            a(42);
            throw null;
        }
        if (list2 == null) {
            a(43);
            throw null;
        }
        boolean zIsEmpty = list.isEmpty();
        B9.e eVar = B9.e.f778s;
        f fVar = f.a;
        c cVar = this.a;
        if (zIsEmpty) {
            return new N(true, true, new o1.e((HashMap) null, cVar), eVar, fVar);
        }
        HashMap map = new HashMap();
        for (int i10 = 0; i10 < list.size(); i10++) {
            map.put(((P) list.get(i10)).I(), ((P) list2.get(i10)).I());
        }
        return new N(true, true, new o1.e(map, cVar), eVar, fVar);
    }

    public final void h(p096j9.f fVar, Collection collection, Collection collection2, InterfaceC0271e interfaceC0271e, m mVar) {
        Integer numB;
        if (fVar == null) {
            a(52);
            throw null;
        }
        if (collection == null) {
            a(53);
            throw null;
        }
        if (collection2 == null) {
            a(54);
            throw null;
        }
        if (interfaceC0271e == null) {
            a(55);
            throw null;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(collection);
        Iterator it = collection2.iterator();
        while (it.hasNext()) {
            InterfaceC0269c interfaceC0269c = (InterfaceC0269c) it.next();
            if (interfaceC0269c == null) {
                a(59);
                throw null;
            }
            ArrayList arrayList = new ArrayList(collection.size());
            i iVar = new i();
            Iterator it2 = collection.iterator();
            while (it2.hasNext()) {
                InterfaceC0269c interfaceC0269c2 = (InterfaceC0269c) it2.next();
                int iC = l(interfaceC0269c2, interfaceC0269c, interfaceC0271e).c();
                boolean z6 = !AbstractC0281o.e(interfaceC0269c2.f()) && AbstractC0281o.c(AbstractC0281o.f2828l, interfaceC0269c2, interfaceC0269c) == null;
                int iD = e.d(iC);
                if (iD == 0) {
                    if (z6) {
                        iVar.add(interfaceC0269c2);
                    }
                    arrayList.add(interfaceC0269c2);
                } else if (iD == 2) {
                    if (z6) {
                        mVar.d(interfaceC0269c2, interfaceC0269c);
                    }
                    arrayList.add(interfaceC0269c2);
                }
            }
            mVar.p(interfaceC0269c, iVar);
            linkedHashSet.removeAll(arrayList);
        }
        if (linkedHashSet.size() >= 2) {
            InterfaceC0276j interfaceC0276jV = ((InterfaceC0269c) linkedHashSet.iterator().next()).v();
            if (!linkedHashSet.isEmpty()) {
                Iterator it3 = linkedHashSet.iterator();
                while (it3.hasNext()) {
                    if (((InterfaceC0269c) it3.next()).v() != interfaceC0276jV) {
                        LinkedList<InterfaceC0269c> linkedList = new LinkedList(linkedHashSet);
                        while (!linkedList.isEmpty()) {
                            linkedList.isEmpty();
                            InterfaceC0269c interfaceC0269c3 = null;
                            for (InterfaceC0269c interfaceC0269c4 : linkedList) {
                                if (interfaceC0269c3 == null || ((numB = AbstractC0281o.b(interfaceC0269c3.f(), interfaceC0269c4.f())) != null && numB.intValue() < 0)) {
                                    interfaceC0269c3 = interfaceC0269c4;
                                }
                            }
                            p210v8.i.c(interfaceC0269c3);
                            e(g(interfaceC0269c3, linkedList, new i(1), new j(mVar, interfaceC0269c3)), interfaceC0271e, mVar);
                        }
                        return;
                    }
                }
            }
        }
        Iterator it4 = linkedHashSet.iterator();
        while (it4.hasNext()) {
            e(Collections.singleton((InterfaceC0269c) it4.next()), interfaceC0271e, mVar);
        }
    }

    public final k l(InterfaceC0268b interfaceC0268b, InterfaceC0268b interfaceC0268b2, InterfaceC0271e interfaceC0271e) {
        if (interfaceC0268b == null) {
            a(19);
            throw null;
        }
        if (interfaceC0268b2 != null) {
            return m(interfaceC0268b, interfaceC0268b2, interfaceC0271e, false);
        }
        a(20);
        throw null;
    }

    public final k m(InterfaceC0268b interfaceC0268b, InterfaceC0268b interfaceC0268b2, InterfaceC0271e interfaceC0271e, boolean z6) {
        if (interfaceC0268b == null) {
            a(22);
            throw null;
        }
        if (interfaceC0268b2 == null) {
            a(23);
            throw null;
        }
        k kVarN = n(interfaceC0268b, interfaceC0268b2, z6);
        boolean z10 = kVarN.c() == 1;
        List<f> list = f13173b;
        for (f fVar : list) {
            if (fVar.a() != 1 && (!z10 || fVar.a() != 2)) {
                int iD = e.d(fVar.b(interfaceC0268b, interfaceC0268b2, interfaceC0271e));
                if (iD == 0) {
                    z10 = true;
                } else {
                    if (iD == 1) {
                        return k.b("External condition failed");
                    }
                    if (iD == 2) {
                        return k.d("External condition");
                    }
                }
            }
        }
        if (!z10) {
            return kVarN;
        }
        for (f fVar2 : list) {
            if (fVar2.a() == 1) {
                int iD2 = e.d(fVar2.b(interfaceC0268b, interfaceC0268b2, interfaceC0271e));
                if (iD2 == 0) {
                    throw new IllegalStateException("Contract violation in " + fVar2.getClass().getName() + " condition. It's not supposed to end with success");
                }
                if (iD2 == 1) {
                    return k.b("External condition failed");
                }
                if (iD2 == 2) {
                    return k.d("External condition");
                }
            }
        }
        k kVar = k.f13172b;
        if (kVar != null) {
            return kVar;
        }
        k.a(0);
        throw null;
    }

    public final k n(InterfaceC0268b interfaceC0268b, InterfaceC0268b interfaceC0268b2, boolean z6) {
        if (interfaceC0268b == null) {
            a(30);
            throw null;
        }
        if (interfaceC0268b2 == null) {
            a(31);
            throw null;
        }
        k kVarI = i(interfaceC0268b, interfaceC0268b2);
        if (kVarI != null) {
            return kVarI;
        }
        ArrayList arrayListD = d(interfaceC0268b);
        ArrayList arrayListD2 = d(interfaceC0268b2);
        List listZ = interfaceC0268b.z();
        List listZ2 = interfaceC0268b2.z();
        if (listZ.size() != listZ2.size()) {
            for (int i10 = 0; i10 < arrayListD.size(); i10++) {
                if (!B9.d.a.a((AbstractC0151y) arrayListD.get(i10), (AbstractC0151y) arrayListD2.get(i10))) {
                    return k.d("Type parameter number mismatch");
                }
            }
            return k.b("Type parameter number mismatch");
        }
        N nF = f(listZ, listZ2);
        for (int i11 = 0; i11 < listZ.size(); i11++) {
            P p10 = (P) listZ.get(i11);
            P p11 = (P) listZ2.get(i11);
            if (p10 == null) {
                a(49);
                throw null;
            }
            if (p11 == null) {
                a(50);
                throw null;
            }
            List<AbstractC0151y> upperBounds = p10.getUpperBounds();
            ArrayList arrayList = new ArrayList(p11.getUpperBounds());
            if (upperBounds.size() == arrayList.size()) {
                for (AbstractC0151y abstractC0151y : upperBounds) {
                    ListIterator listIterator = arrayList.listIterator();
                    do {
                        if (listIterator.hasNext()) {
                        }
                    } while (!b(abstractC0151y, (AbstractC0151y) listIterator.next(), nF));
                    listIterator.remove();
                }
            }
            return k.d("Type parameter bounds mismatch");
        }
        for (int i12 = 0; i12 < arrayListD.size(); i12++) {
            if (!b((AbstractC0151y) arrayListD.get(i12), (AbstractC0151y) arrayListD2.get(i12), nF)) {
                return k.d("Value parameter type mismatch");
            }
        }
        if ((interfaceC0268b instanceof InterfaceC0285t) && (interfaceC0268b2 instanceof InterfaceC0285t) && ((InterfaceC0285t) interfaceC0268b).t() != ((InterfaceC0285t) interfaceC0268b2).t()) {
            return k.b("Incompatible suspendability");
        }
        if (z6) {
            AbstractC0151y abstractC0151yW = interfaceC0268b.w();
            AbstractC0151y abstractC0151yW2 = interfaceC0268b2.w();
            if (abstractC0151yW != null && abstractC0151yW2 != null && ((!AbstractC0130c.j(abstractC0151yW2) || !AbstractC0130c.j(abstractC0151yW)) && !C0133f.n(C0133f.a, nF, abstractC0151yW2.D0(), abstractC0151yW.D0()))) {
                return k.b("Return type mismatch");
            }
        }
        k kVar = k.f13172b;
        if (kVar != null) {
            return kVar;
        }
        k.a(0);
        throw null;
    }
}
