package p124m9;

import A9.AbstractC0151y;
import A9.O;
import C9.i;
import L8.AbstractC0281o;
import L8.D;
import L8.H;
import L8.InterfaceC0268b;
import L8.InterfaceC0269c;
import L8.InterfaceC0271e;
import L8.InterfaceC0273g;
import L8.InterfaceC0276j;
import L8.InterfaceC0277k;
import L8.InterfaceC0279m;
import L8.InterfaceC0290y;
import L8.N;
import O8.E;
import O8.M;
import O8.z;
import com.onesignal.inAppMessages.internal.display.impl.k;
import com.unity3d.ads.metadata.MediationMetaData;
import com.unity3d.services.ads.gmascar.bridges.mobileads.MobileAdsBridge;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import org.chromium.net.UrlRequest;
import p096j9.c;
import p096j9.h;

/* JADX INFO: loaded from: classes.dex */
public abstract class e {
    public static final /* synthetic */ int a = 0;

    static {
        new c("kotlin.jvm.JvmName");
    }

    public static /* synthetic */ void a(int i10) {
        String str;
        int i11;
        switch (i10) {
            case 4:
            case 7:
            case 9:
            case 10:
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
            case 22:
            case 40:
            case 42:
            case 43:
            case 47:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 60:
            case 62:
            case 63:
            case 65:
            case 72:
            case 76:
            case 83:
            case 84:
            case 86:
            case 89:
            case 94:
            case 96:
                str = "@NotNull method %s.%s must not return null";
                break;
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i10) {
            case 4:
            case 7:
            case 9:
            case 10:
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
            case 22:
            case 40:
            case 42:
            case 43:
            case 47:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 60:
            case 62:
            case 63:
            case 65:
            case 72:
            case 76:
            case 83:
            case 84:
            case 86:
            case 89:
            case 94:
            case 96:
                i11 = 2;
                break;
            default:
                i11 = 3;
                break;
        }
        Object[] objArr = new Object[i11];
        switch (i10) {
            case 1:
            case 2:
            case 3:
            case 5:
            case 6:
            case 8:
            case 11:
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
            case 15:
            case MobileAdsBridge.CODE_21 /* 21 */:
            case 23:
            case 24:
            case 34:
            case 35:
            case 36:
            case 57:
            case 58:
            case 59:
            case 61:
            case 64:
            case 82:
            case 95:
            case 97:
                objArr[0] = "descriptor";
                break;
            case 4:
            case 7:
            case 9:
            case 10:
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
            case 22:
            case 40:
            case 42:
            case 43:
            case 47:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 60:
            case 62:
            case 63:
            case 65:
            case 72:
            case 76:
            case 83:
            case 84:
            case 86:
            case 89:
            case 94:
            case 96:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/DescriptorUtils";
                break;
            case 16:
                objArr[0] = "first";
                break;
            case 17:
                objArr[0] = "second";
                break;
            case 18:
            case 19:
                objArr[0] = "aClass";
                break;
            case 20:
                objArr[0] = "kotlinType";
                break;
            case 25:
                objArr[0] = "declarationDescriptor";
                break;
            case 26:
            case 28:
                objArr[0] = "subClass";
                break;
            case 27:
            case 29:
            case 33:
                objArr[0] = "superClass";
                break;
            case 30:
            case 32:
            case 45:
            case 67:
                objArr[0] = k.EVENT_TYPE_KEY;
                break;
            case 31:
                objArr[0] = "other";
                break;
            case 37:
                objArr[0] = "classKind";
                break;
            case 38:
            case 39:
            case 41:
            case 44:
            case 48:
            case 54:
            case 68:
            case 69:
            case 70:
            case 77:
            case 78:
                objArr[0] = "classDescriptor";
                break;
            case 46:
                objArr[0] = "typeConstructor";
                break;
            case 55:
                objArr[0] = "innerClassName";
                break;
            case 56:
                objArr[0] = "location";
                break;
            case 66:
                objArr[0] = "variable";
                break;
            case 71:
                objArr[0] = "f";
                break;
            case 73:
                objArr[0] = "current";
                break;
            case 74:
                objArr[0] = "result";
                break;
            case 75:
                objArr[0] = "memberDescriptor";
                break;
            case 79:
            case 80:
            case 81:
                objArr[0] = "annotated";
                break;
            case 85:
            case 87:
            case 90:
            case 92:
                objArr[0] = "scope";
                break;
            case 88:
            case 91:
            case 93:
                objArr[0] = MediationMetaData.KEY_NAME;
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        switch (i10) {
            case 4:
                objArr[1] = "getFqNameSafe";
                break;
            case 7:
                objArr[1] = "getFqNameUnsafe";
                break;
            case 9:
            case 10:
                objArr[1] = "getFqNameFromTopLevelClass";
                break;
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                objArr[1] = "getClassIdForNonLocalClass";
                break;
            case 22:
                objArr[1] = "getContainingModule";
                break;
            case 40:
                objArr[1] = "getSuperclassDescriptors";
                break;
            case 42:
            case 43:
                objArr[1] = "getSuperClassType";
                break;
            case 47:
                objArr[1] = "getClassDescriptorForTypeConstructor";
                break;
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
                objArr[1] = "getDefaultConstructorVisibility";
                break;
            case 60:
                objArr[1] = "unwrapFakeOverride";
                break;
            case 62:
            case 63:
                objArr[1] = "unwrapSubstitutionOverride";
                break;
            case 65:
                objArr[1] = "unwrapFakeOverrideToAnyDeclaration";
                break;
            case 72:
                objArr[1] = "getAllOverriddenDescriptors";
                break;
            case 76:
                objArr[1] = "getAllOverriddenDeclarations";
                break;
            case 83:
            case 84:
                objArr[1] = "getContainingSourceFile";
                break;
            case 86:
                objArr[1] = "getAllDescriptors";
                break;
            case 89:
                objArr[1] = "getFunctionByName";
                break;
            case 94:
                objArr[1] = "getPropertyByName";
                break;
            case 96:
                objArr[1] = "getDirectMember";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/DescriptorUtils";
                break;
        }
        switch (i10) {
            case 1:
                objArr[2] = "isLocal";
                break;
            case 2:
                objArr[2] = "getFqName";
                break;
            case 3:
                objArr[2] = "getFqNameSafe";
                break;
            case 4:
            case 7:
            case 9:
            case 10:
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
            case 22:
            case 40:
            case 42:
            case 43:
            case 47:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 60:
            case 62:
            case 63:
            case 65:
            case 72:
            case 76:
            case 83:
            case 84:
            case 86:
            case 89:
            case 94:
            case 96:
                break;
            case 5:
                objArr[2] = "getFqNameSafeIfPossible";
                break;
            case 6:
                objArr[2] = "getFqNameUnsafe";
                break;
            case 8:
                objArr[2] = "getFqNameFromTopLevelClass";
                break;
            case 11:
                objArr[2] = "getClassIdForNonLocalClass";
                break;
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                objArr[2] = "isExtension";
                break;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                objArr[2] = "isOverride";
                break;
            case 15:
                objArr[2] = "isStaticDeclaration";
                break;
            case 16:
            case 17:
                objArr[2] = "areInSameModule";
                break;
            case 18:
            case 19:
                objArr[2] = "getParentOfType";
                break;
            case 20:
            case 23:
                objArr[2] = "getContainingModuleOrNull";
                break;
            case MobileAdsBridge.CODE_21 /* 21 */:
                objArr[2] = "getContainingModule";
                break;
            case 24:
                objArr[2] = "getContainingClass";
                break;
            case 25:
                objArr[2] = "isAncestor";
                break;
            case 26:
            case 27:
                objArr[2] = "isDirectSubclass";
                break;
            case 28:
            case 29:
                objArr[2] = "isSubclass";
                break;
            case 30:
            case 31:
                objArr[2] = "isSameClass";
                break;
            case 32:
            case 33:
                objArr[2] = "isSubtypeOfClass";
                break;
            case 34:
                objArr[2] = "isAnonymousObject";
                break;
            case 35:
                objArr[2] = "isAnonymousFunction";
                break;
            case 36:
                objArr[2] = "isEnumEntry";
                break;
            case 37:
                objArr[2] = "isKindOf";
                break;
            case 38:
                objArr[2] = "hasAbstractMembers";
                break;
            case 39:
                objArr[2] = "getSuperclassDescriptors";
                break;
            case 41:
                objArr[2] = "getSuperClassType";
                break;
            case 44:
                objArr[2] = "getSuperClassDescriptor";
                break;
            case 45:
                objArr[2] = "getClassDescriptorForType";
                break;
            case 46:
                objArr[2] = "getClassDescriptorForTypeConstructor";
                break;
            case 48:
                objArr[2] = "getDefaultConstructorVisibility";
                break;
            case 54:
            case 55:
            case 56:
                objArr[2] = "getInnerClassByName";
                break;
            case 57:
                objArr[2] = "isStaticNestedClass";
                break;
            case 58:
                objArr[2] = "isTopLevelOrInnerClass";
                break;
            case 59:
                objArr[2] = "unwrapFakeOverride";
                break;
            case 61:
                objArr[2] = "unwrapSubstitutionOverride";
                break;
            case 64:
                objArr[2] = "unwrapFakeOverrideToAnyDeclaration";
                break;
            case 66:
            case 67:
                objArr[2] = "shouldRecordInitializerForProperty";
                break;
            case 68:
                objArr[2] = "classCanHaveAbstractFakeOverride";
                break;
            case 69:
                objArr[2] = "classCanHaveAbstractDeclaration";
                break;
            case 70:
                objArr[2] = "classCanHaveOpenMembers";
                break;
            case 71:
                objArr[2] = "getAllOverriddenDescriptors";
                break;
            case 73:
            case 74:
                objArr[2] = "collectAllOverriddenDescriptors";
                break;
            case 75:
                objArr[2] = "getAllOverriddenDeclarations";
                break;
            case 77:
                objArr[2] = "isSingletonOrAnonymousObject";
                break;
            case 78:
                objArr[2] = "canHaveDeclaredConstructors";
                break;
            case 79:
                objArr[2] = "getJvmName";
                break;
            case 80:
                objArr[2] = "findJvmNameAnnotation";
                break;
            case 81:
                objArr[2] = "hasJvmNameAnnotation";
                break;
            case 82:
                objArr[2] = "getContainingSourceFile";
                break;
            case 85:
                objArr[2] = "getAllDescriptors";
                break;
            case 87:
            case 88:
                objArr[2] = "getFunctionByName";
                break;
            case 90:
            case 91:
                objArr[2] = "getFunctionByNameOrNull";
                break;
            case 92:
            case 93:
                objArr[2] = "getPropertyByName";
                break;
            case 95:
                objArr[2] = "getDirectMember";
                break;
            case 97:
                objArr[2] = "isMethodOfAny";
                break;
            default:
                objArr[2] = "getDispatchReceiverParameterIfNeeded";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i10) {
            case 4:
            case 7:
            case 9:
            case 10:
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
            case 22:
            case 40:
            case 42:
            case 43:
            case 47:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 60:
            case 62:
            case 63:
            case 65:
            case 72:
            case 76:
            case 83:
            case 84:
            case 86:
            case 89:
            case 94:
            case 96:
                throw new IllegalStateException(str2);
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    public static void b(InterfaceC0268b interfaceC0268b, LinkedHashSet linkedHashSet) {
        if (interfaceC0268b == null) {
            a(73);
            throw null;
        }
        if (linkedHashSet.contains(interfaceC0268b)) {
            return;
        }
        Iterator it = interfaceC0268b.c().x().iterator();
        while (it.hasNext()) {
            InterfaceC0268b interfaceC0268bC = ((InterfaceC0268b) it.next()).c();
            b(interfaceC0268bC, linkedHashSet);
            linkedHashSet.add(interfaceC0268bC);
        }
    }

    public static InterfaceC0271e c(AbstractC0151y abstractC0151y) {
        if (abstractC0151y == null) {
            a(45);
            throw null;
        }
        O oD = abstractC0151y.D();
        if (oD == null) {
            a(46);
            throw null;
        }
        InterfaceC0271e interfaceC0271e = (InterfaceC0271e) oD.w();
        if (interfaceC0271e != null) {
            return interfaceC0271e;
        }
        a(47);
        throw null;
    }

    public static InterfaceC0290y d(InterfaceC0276j interfaceC0276j) {
        if (interfaceC0276j == null) {
            a(21);
            throw null;
        }
        InterfaceC0290y interfaceC0290yE = e(interfaceC0276j);
        if (interfaceC0290yE != null) {
            return interfaceC0290yE;
        }
        a(22);
        throw null;
    }

    public static InterfaceC0290y e(InterfaceC0276j interfaceC0276j) {
        if (interfaceC0276j == null) {
            a(23);
            throw null;
        }
        while (interfaceC0276j != null) {
            if (interfaceC0276j instanceof InterfaceC0290y) {
                return (InterfaceC0290y) interfaceC0276j;
            }
            if (interfaceC0276j instanceof H) {
                return ((z) ((H) interfaceC0276j)).f3795u;
            }
            interfaceC0276j = interfaceC0276j.v();
        }
        return null;
    }

    public static N f(InterfaceC0276j interfaceC0276j) {
        if (interfaceC0276j == null) {
            a(82);
            throw null;
        }
        if (interfaceC0276j instanceof M) {
            interfaceC0276j = ((M) interfaceC0276j).Z0();
        }
        boolean z6 = interfaceC0276j instanceof InterfaceC0277k;
        N n10 = N.f2800t;
        if (z6) {
            ((InterfaceC0277k) interfaceC0276j).g().getClass();
        }
        return n10;
    }

    public static p096j9.e g(InterfaceC0276j interfaceC0276j) {
        if (interfaceC0276j != null) {
            c cVarH = h(interfaceC0276j);
            return cVarH != null ? cVarH.i() : g(interfaceC0276j.v()).b(interfaceC0276j.getName());
        }
        a(2);
        throw null;
    }

    public static c h(InterfaceC0276j interfaceC0276j) {
        if (interfaceC0276j == null) {
            a(5);
            throw null;
        }
        if ((interfaceC0276j instanceof InterfaceC0290y) || i.f(interfaceC0276j)) {
            return c.f12543c;
        }
        if (interfaceC0276j instanceof H) {
            return ((z) ((H) interfaceC0276j)).f3796v;
        }
        if (interfaceC0276j instanceof D) {
            return ((E) ((D) interfaceC0276j)).f3634w;
        }
        return null;
    }

    public static InterfaceC0276j i(InterfaceC0276j interfaceC0276j, Class cls, boolean z6) {
        if (interfaceC0276j == null) {
            return null;
        }
        if (z6) {
            interfaceC0276j = interfaceC0276j.v();
        }
        while (interfaceC0276j != null) {
            if (cls.isInstance(interfaceC0276j)) {
                return interfaceC0276j;
            }
            interfaceC0276j = interfaceC0276j.v();
        }
        return null;
    }

    public static InterfaceC0271e j(InterfaceC0271e interfaceC0271e) {
        if (interfaceC0271e == null) {
            a(44);
            throw null;
        }
        Iterator it = interfaceC0271e.I().t().iterator();
        while (it.hasNext()) {
            InterfaceC0271e interfaceC0271eC = c((AbstractC0151y) it.next());
            if (interfaceC0271eC.M() != 2) {
                return interfaceC0271eC;
            }
        }
        return null;
    }

    public static boolean k(InterfaceC0276j interfaceC0276j) {
        if (interfaceC0276j != null) {
            return n(interfaceC0276j, 1) && interfaceC0276j.getName().equals(h.a);
        }
        a(34);
        throw null;
    }

    public static boolean l(InterfaceC0276j interfaceC0276j) {
        return n(interfaceC0276j, 6) && ((InterfaceC0271e) interfaceC0276j).N();
    }

    public static boolean m(InterfaceC0276j interfaceC0276j) {
        if (interfaceC0276j != null) {
            return n(interfaceC0276j, 4);
        }
        a(36);
        throw null;
    }

    public static boolean n(InterfaceC0276j interfaceC0276j, int i10) {
        if (i10 != 0) {
            return (interfaceC0276j instanceof InterfaceC0271e) && ((InterfaceC0271e) interfaceC0276j).M() == i10;
        }
        a(37);
        throw null;
    }

    public static boolean o(InterfaceC0276j interfaceC0276j) {
        if (interfaceC0276j == null) {
            a(1);
            throw null;
        }
        while (interfaceC0276j != null) {
            if (k(interfaceC0276j) || ((interfaceC0276j instanceof InterfaceC0279m) && ((InterfaceC0279m) interfaceC0276j).f() == AbstractC0281o.f2823f)) {
                return true;
            }
            interfaceC0276j = interfaceC0276j.v();
        }
        return false;
    }

    public static boolean p(AbstractC0151y abstractC0151y, InterfaceC0271e interfaceC0271e) {
        if (abstractC0151y == null) {
            a(30);
            throw null;
        }
        if (interfaceC0271e == null) {
            a(31);
            throw null;
        }
        InterfaceC0273g interfaceC0273gW = abstractC0151y.D().w();
        if (interfaceC0273gW == null) {
            return false;
        }
        InterfaceC0276j interfaceC0276jC = interfaceC0273gW.c();
        return (interfaceC0276jC instanceof InterfaceC0273g) && interfaceC0271e.I().equals(((InterfaceC0273g) interfaceC0276jC).I());
    }

    public static boolean q(InterfaceC0276j interfaceC0276j) {
        return (n(interfaceC0276j, 1) || n(interfaceC0276j, 2)) && ((InterfaceC0271e) interfaceC0276j).m() == 2;
    }

    public static boolean r(AbstractC0151y abstractC0151y, InterfaceC0271e interfaceC0271e) {
        if (abstractC0151y == null) {
            a(32);
            throw null;
        }
        if (interfaceC0271e == null) {
            a(33);
            throw null;
        }
        if (p(abstractC0151y, interfaceC0271e)) {
            return true;
        }
        Iterator it = abstractC0151y.D().t().iterator();
        while (it.hasNext()) {
            if (r((AbstractC0151y) it.next(), interfaceC0271e)) {
                return true;
            }
        }
        return false;
    }

    public static boolean s(InterfaceC0276j interfaceC0276j) {
        return interfaceC0276j != null && (interfaceC0276j.v() instanceof D);
    }

    public static InterfaceC0269c t(InterfaceC0269c interfaceC0269c) {
        if (interfaceC0269c == null) {
            a(59);
            throw null;
        }
        while (interfaceC0269c.V() == 2) {
            Collection collectionX = interfaceC0269c.x();
            if (collectionX.isEmpty()) {
                throw new IllegalStateException("Fake override should have at least one overridden descriptor: " + interfaceC0269c);
            }
            interfaceC0269c = (InterfaceC0269c) collectionX.iterator().next();
        }
        return interfaceC0269c;
    }
}
