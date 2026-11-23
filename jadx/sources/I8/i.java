package I8;

import A9.AbstractC0130c;
import A9.AbstractC0151y;
import A9.C0133f;
import A9.O;
import A9.S;
import A9.T;
import A9.b0;
import A9.d0;
import L8.AbstractC0287v;
import L8.D;
import L8.F;
import L8.InterfaceC0271e;
import L8.InterfaceC0273g;
import L8.InterfaceC0276j;
import L8.InterfaceC0285t;
import L8.InterfaceC0290y;
import L8.K;
import O8.C;
import O8.E;
import O8.L;
import O8.M;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.unity3d.ads.metadata.MediationMetaData;
import com.unity3d.services.ads.gmascar.bridges.mobileads.MobileAdsBridge;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.chromium.net.UrlRequest;

/* JADX INFO: loaded from: classes.dex */
public abstract class i {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final p096j9.f f2112e = p096j9.f.l("<built-ins module>");
    public C a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p247z9.i f2113b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p247z9.e f2114c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p247z9.l f2115d;

    public i(p247z9.l lVar) {
        this.f2115d = lVar;
        lVar.a(new f(this, 0));
        this.f2113b = new p247z9.i(lVar, new f(this, 1));
        this.f2114c = lVar.b(new g(this, 0));
    }

    public static boolean A(AbstractC0151y abstractC0151y, p096j9.e eVar) {
        if (abstractC0151y == null) {
            a(97);
            throw null;
        }
        if (eVar != null) {
            return H(abstractC0151y.D(), eVar);
        }
        a(98);
        throw null;
    }

    public static boolean B(AbstractC0151y abstractC0151y, p096j9.e eVar) {
        if (eVar != null) {
            return A(abstractC0151y, eVar) && !abstractC0151y.H();
        }
        a(135);
        throw null;
    }

    public static boolean C(InterfaceC0285t interfaceC0285t) {
        if (interfaceC0285t.c().q().E(n.f2175m)) {
            return true;
        }
        if (!(interfaceC0285t instanceof K)) {
            return false;
        }
        K k3 = (K) interfaceC0285t;
        boolean zP = k3.P();
        L lE = k3.e();
        M mH = k3.h();
        if (lE == null || !C(lE)) {
            return false;
        }
        if (zP) {
            return mH != null && C(mH);
        }
        return true;
    }

    public static boolean D(AbstractC0151y abstractC0151y, p096j9.e eVar) {
        if (abstractC0151y == null) {
            a(105);
            throw null;
        }
        if (eVar != null) {
            return !abstractC0151y.H() && A(abstractC0151y, eVar);
        }
        a(106);
        throw null;
    }

    public static boolean E(AbstractC0151y abstractC0151y) {
        if (abstractC0151y == null) {
            a(136);
            throw null;
        }
        if (abstractC0151y != null) {
            return A(abstractC0151y, n.f2164b) && !b0.e(abstractC0151y);
        }
        a(138);
        throw null;
    }

    public static boolean F(AbstractC0151y abstractC0151y) {
        if (abstractC0151y == null) {
            a(94);
            throw null;
        }
        if (abstractC0151y.H()) {
            return false;
        }
        InterfaceC0273g interfaceC0273gW = abstractC0151y.D().w();
        if (!(interfaceC0273gW instanceof InterfaceC0271e)) {
            return false;
        }
        InterfaceC0271e interfaceC0271e = (InterfaceC0271e) interfaceC0273gW;
        if (interfaceC0271e != null) {
            return t(interfaceC0271e) != null;
        }
        a(96);
        throw null;
    }

    public static boolean G(AbstractC0151y abstractC0151y) {
        return D(abstractC0151y, n.f2169f);
    }

    public static boolean H(O o10, p096j9.e eVar) {
        if (o10 == null) {
            a(101);
            throw null;
        }
        if (eVar != null) {
            InterfaceC0273g interfaceC0273gW = o10.w();
            return (interfaceC0273gW instanceof InterfaceC0271e) && b((InterfaceC0271e) interfaceC0273gW, eVar);
        }
        a(102);
        throw null;
    }

    public static boolean I(InterfaceC0273g interfaceC0273g) {
        if (interfaceC0273g == null) {
            a(10);
            throw null;
        }
        for (InterfaceC0276j interfaceC0276jV = interfaceC0273g; interfaceC0276jV != null; interfaceC0276jV = interfaceC0276jV.v()) {
            if (interfaceC0276jV instanceof D) {
                return ((E) ((D) interfaceC0276jV)).f3634w.h(o.j);
            }
        }
        return false;
    }

    public static /* synthetic */ void a(int i10) {
        String str;
        int i11;
        switch (i10) {
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 11:
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
            case 15:
            case 18:
            case 19:
            case 20:
            case MobileAdsBridge.CODE_21 /* 21 */:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 47:
            case 48:
            case 49:
            case 50:
            case 51:
            case 52:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 68:
            case 69:
            case 70:
            case 74:
            case 81:
            case 84:
            case 86:
            case 87:
                str = "@NotNull method %s.%s must not return null";
                break;
            case 9:
            case 10:
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
            case 16:
            case 17:
            case 46:
            case 53:
            case 67:
            case 71:
            case 72:
            case 73:
            case 75:
            case 76:
            case 77:
            case 78:
            case 79:
            case 80:
            case 82:
            case 83:
            case 85:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i10) {
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 11:
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
            case 15:
            case 18:
            case 19:
            case 20:
            case MobileAdsBridge.CODE_21 /* 21 */:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 47:
            case 48:
            case 49:
            case 50:
            case 51:
            case 52:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 68:
            case 69:
            case 70:
            case 74:
            case 81:
            case 84:
            case 86:
            case 87:
                i11 = 2;
                break;
            case 9:
            case 10:
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
            case 16:
            case 17:
            case 46:
            case 53:
            case 67:
            case 71:
            case 72:
            case 73:
            case 75:
            case 76:
            case 77:
            case 78:
            case 79:
            case 80:
            case 82:
            case 83:
            case 85:
            default:
                i11 = 3;
                break;
        }
        Object[] objArr = new Object[i11];
        switch (i10) {
            case 1:
            case 72:
                objArr[0] = "module";
                break;
            case 2:
                objArr[0] = "computation";
                break;
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 11:
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
            case 15:
            case 18:
            case 19:
            case 20:
            case MobileAdsBridge.CODE_21 /* 21 */:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 47:
            case 48:
            case 49:
            case 50:
            case 51:
            case 52:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 68:
            case 69:
            case 70:
            case 74:
            case 81:
            case 84:
            case 86:
            case 87:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/builtins/KotlinBuiltIns";
                break;
            case 9:
            case 10:
            case 76:
            case 77:
            case 89:
            case 96:
            case 103:
            case 107:
            case 108:
            case 143:
            case 146:
            case 147:
            case 149:
            case 157:
            case 158:
            case 159:
            case 160:
                objArr[0] = "descriptor";
                break;
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
            case 98:
            case 100:
            case 102:
            case 104:
            case 106:
            case 135:
                objArr[0] = "fqName";
                break;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                objArr[0] = "simpleName";
                break;
            case 16:
            case 17:
            case 53:
            case 88:
            case 90:
            case 91:
            case 92:
            case 93:
            case 94:
            case 95:
            case 97:
            case 99:
            case 105:
            case 109:
            case 110:
            case 111:
            case 113:
            case 114:
            case 115:
            case 116:
            case ModuleDescriptor.MODULE_VERSION /* 117 */:
            case 118:
            case 119:
            case 120:
            case 121:
            case 122:
            case 123:
            case 124:
            case 125:
            case 126:
            case 127:
            case 128:
            case 129:
            case 130:
            case 131:
            case 132:
            case 133:
            case 134:
            case 136:
            case 137:
            case 138:
            case 139:
            case 140:
            case 141:
            case 142:
            case 144:
            case 145:
            case 148:
            case 150:
            case 151:
            case 152:
            case 153:
            case 154:
            case 155:
            case 156:
            case 162:
                objArr[0] = com.onesignal.inAppMessages.internal.display.impl.k.EVENT_TYPE_KEY;
                break;
            case 46:
                objArr[0] = "classSimpleName";
                break;
            case 67:
                objArr[0] = "arrayType";
                break;
            case 71:
                objArr[0] = "notNullArrayType";
                break;
            case 73:
                objArr[0] = "primitiveType";
                break;
            case 75:
                objArr[0] = "kotlinType";
                break;
            case 78:
            case 82:
                objArr[0] = "projectionType";
                break;
            case 79:
            case 83:
            case 85:
                objArr[0] = "argument";
                break;
            case 80:
                objArr[0] = "annotations";
                break;
            case 101:
                objArr[0] = "typeConstructor";
                break;
            case 112:
                objArr[0] = "classDescriptor";
                break;
            case 161:
                objArr[0] = "declarationDescriptor";
                break;
            default:
                objArr[0] = "storageManager";
                break;
        }
        switch (i10) {
            case 3:
                objArr[1] = "getAdditionalClassPartsProvider";
                break;
            case 4:
                objArr[1] = "getPlatformDependentDeclarationFilter";
                break;
            case 5:
                objArr[1] = "getClassDescriptorFactories";
                break;
            case 6:
                objArr[1] = "getStorageManager";
                break;
            case 7:
                objArr[1] = "getBuiltInsModule";
                break;
            case 8:
                objArr[1] = "getBuiltInPackagesImportedByDefault";
                break;
            case 9:
            case 10:
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
            case 16:
            case 17:
            case 46:
            case 53:
            case 67:
            case 71:
            case 72:
            case 73:
            case 75:
            case 76:
            case 77:
            case 78:
            case 79:
            case 80:
            case 82:
            case 83:
            case 85:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/builtins/KotlinBuiltIns";
                break;
            case 11:
                objArr[1] = "getBuiltInsPackageScope";
                break;
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                objArr[1] = "getBuiltInClassByFqName";
                break;
            case 15:
                objArr[1] = "getBuiltInClassByName";
                break;
            case 18:
                objArr[1] = "getSuspendFunction";
                break;
            case 19:
                objArr[1] = "getKFunction";
                break;
            case 20:
                objArr[1] = "getKSuspendFunction";
                break;
            case MobileAdsBridge.CODE_21 /* 21 */:
                objArr[1] = "getKClass";
                break;
            case 22:
                objArr[1] = "getKCallable";
                break;
            case 23:
                objArr[1] = "getKProperty";
                break;
            case 24:
                objArr[1] = "getKProperty0";
                break;
            case 25:
                objArr[1] = "getKProperty1";
                break;
            case 26:
                objArr[1] = "getKProperty2";
                break;
            case 27:
                objArr[1] = "getKMutableProperty0";
                break;
            case 28:
                objArr[1] = "getKMutableProperty1";
                break;
            case 29:
                objArr[1] = "getKMutableProperty2";
                break;
            case 30:
                objArr[1] = "getIterator";
                break;
            case 31:
                objArr[1] = "getIterable";
                break;
            case 32:
                objArr[1] = "getMutableIterable";
                break;
            case 33:
                objArr[1] = "getMutableIterator";
                break;
            case 34:
                objArr[1] = "getCollection";
                break;
            case 35:
                objArr[1] = "getMutableCollection";
                break;
            case 36:
                objArr[1] = "getList";
                break;
            case 37:
                objArr[1] = "getMutableList";
                break;
            case 38:
                objArr[1] = "getSet";
                break;
            case 39:
                objArr[1] = "getMutableSet";
                break;
            case 40:
                objArr[1] = "getMap";
                break;
            case 41:
                objArr[1] = "getMutableMap";
                break;
            case 42:
                objArr[1] = "getMapEntry";
                break;
            case 43:
                objArr[1] = "getMutableMapEntry";
                break;
            case 44:
                objArr[1] = "getListIterator";
                break;
            case 45:
                objArr[1] = "getMutableListIterator";
                break;
            case 47:
                objArr[1] = "getBuiltInTypeByClassName";
                break;
            case 48:
                objArr[1] = "getNothingType";
                break;
            case 49:
                objArr[1] = "getNullableNothingType";
                break;
            case 50:
                objArr[1] = "getAnyType";
                break;
            case 51:
                objArr[1] = "getNullableAnyType";
                break;
            case 52:
                objArr[1] = "getDefaultBound";
                break;
            case 54:
                objArr[1] = "getPrimitiveKotlinType";
                break;
            case 55:
                objArr[1] = "getNumberType";
                break;
            case 56:
                objArr[1] = "getByteType";
                break;
            case 57:
                objArr[1] = "getShortType";
                break;
            case 58:
                objArr[1] = "getIntType";
                break;
            case 59:
                objArr[1] = "getLongType";
                break;
            case 60:
                objArr[1] = "getFloatType";
                break;
            case 61:
                objArr[1] = "getDoubleType";
                break;
            case 62:
                objArr[1] = "getCharType";
                break;
            case 63:
                objArr[1] = "getBooleanType";
                break;
            case 64:
                objArr[1] = "getUnitType";
                break;
            case 65:
                objArr[1] = "getStringType";
                break;
            case 66:
                objArr[1] = "getIterableType";
                break;
            case 68:
            case 69:
            case 70:
                objArr[1] = "getArrayElementType";
                break;
            case 74:
                objArr[1] = "getPrimitiveArrayKotlinType";
                break;
            case 81:
            case 84:
                objArr[1] = "getArrayType";
                break;
            case 86:
                objArr[1] = "getEnumType";
                break;
            case 87:
                objArr[1] = "getAnnotationType";
                break;
        }
        switch (i10) {
            case 1:
                objArr[2] = "setBuiltInsModule";
                break;
            case 2:
                objArr[2] = "setPostponedBuiltinsModuleComputation";
                break;
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 11:
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
            case 15:
            case 18:
            case 19:
            case 20:
            case MobileAdsBridge.CODE_21 /* 21 */:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 47:
            case 48:
            case 49:
            case 50:
            case 51:
            case 52:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 68:
            case 69:
            case 70:
            case 74:
            case 81:
            case 84:
            case 86:
            case 87:
                break;
            case 9:
                objArr[2] = "isBuiltIn";
                break;
            case 10:
                objArr[2] = "isUnderKotlinPackage";
                break;
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                objArr[2] = "getBuiltInClassByFqName";
                break;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                objArr[2] = "getBuiltInClassByName";
                break;
            case 16:
                objArr[2] = "getPrimitiveClassDescriptor";
                break;
            case 17:
                objArr[2] = "getPrimitiveArrayClassDescriptor";
                break;
            case 46:
                objArr[2] = "getBuiltInTypeByClassName";
                break;
            case 53:
                objArr[2] = "getPrimitiveKotlinType";
                break;
            case 67:
                objArr[2] = "getArrayElementType";
                break;
            case 71:
            case 72:
                objArr[2] = "getElementTypeForUnsignedArray";
                break;
            case 73:
                objArr[2] = "getPrimitiveArrayKotlinType";
                break;
            case 75:
                objArr[2] = "getPrimitiveArrayKotlinTypeByPrimitiveKotlinType";
                break;
            case 76:
            case 93:
                objArr[2] = "getPrimitiveType";
                break;
            case 77:
                objArr[2] = "getPrimitiveArrayType";
                break;
            case 78:
            case 79:
            case 80:
            case 82:
            case 83:
                objArr[2] = "getArrayType";
                break;
            case 85:
                objArr[2] = "getEnumType";
                break;
            case 88:
                objArr[2] = "isArray";
                break;
            case 89:
            case 90:
                objArr[2] = "isArrayOrPrimitiveArray";
                break;
            case 91:
                objArr[2] = "isPrimitiveArray";
                break;
            case 92:
                objArr[2] = "getPrimitiveArrayElementType";
                break;
            case 94:
                objArr[2] = "isPrimitiveType";
                break;
            case 95:
                objArr[2] = "isPrimitiveTypeOrNullablePrimitiveType";
                break;
            case 96:
                objArr[2] = "isPrimitiveClass";
                break;
            case 97:
            case 98:
            case 99:
            case 100:
                objArr[2] = "isConstructedFromGivenClass";
                break;
            case 101:
            case 102:
                objArr[2] = "isTypeConstructorForGivenClass";
                break;
            case 103:
            case 104:
                objArr[2] = "classFqNameEquals";
                break;
            case 105:
            case 106:
                objArr[2] = "isNotNullConstructedFromGivenClass";
                break;
            case 107:
                objArr[2] = "isSpecialClassWithNoSupertypes";
                break;
            case 108:
            case 109:
                objArr[2] = "isAny";
                break;
            case 110:
            case 112:
                objArr[2] = "isBoolean";
                break;
            case 111:
                objArr[2] = "isBooleanOrNullableBoolean";
                break;
            case 113:
                objArr[2] = "isNumber";
                break;
            case 114:
                objArr[2] = "isChar";
                break;
            case 115:
                objArr[2] = "isCharOrNullableChar";
                break;
            case 116:
                objArr[2] = "isInt";
                break;
            case ModuleDescriptor.MODULE_VERSION /* 117 */:
                objArr[2] = "isByte";
                break;
            case 118:
                objArr[2] = "isLong";
                break;
            case 119:
                objArr[2] = "isLongOrNullableLong";
                break;
            case 120:
                objArr[2] = "isShort";
                break;
            case 121:
                objArr[2] = "isFloat";
                break;
            case 122:
                objArr[2] = "isFloatOrNullableFloat";
                break;
            case 123:
                objArr[2] = "isDouble";
                break;
            case 124:
                objArr[2] = "isUByte";
                break;
            case 125:
                objArr[2] = "isUShort";
                break;
            case 126:
                objArr[2] = "isUInt";
                break;
            case 127:
                objArr[2] = "isULong";
                break;
            case 128:
                objArr[2] = "isUByteArray";
                break;
            case 129:
                objArr[2] = "isUShortArray";
                break;
            case 130:
                objArr[2] = "isUIntArray";
                break;
            case 131:
                objArr[2] = "isULongArray";
                break;
            case 132:
                objArr[2] = "isUnsignedArrayType";
                break;
            case 133:
                objArr[2] = "isDoubleOrNullableDouble";
                break;
            case 134:
            case 135:
                objArr[2] = "isConstructedFromGivenClassAndNotNullable";
                break;
            case 136:
                objArr[2] = "isNothing";
                break;
            case 137:
                objArr[2] = "isNullableNothing";
                break;
            case 138:
                objArr[2] = "isNothingOrNullableNothing";
                break;
            case 139:
                objArr[2] = "isAnyOrNullableAny";
                break;
            case 140:
                objArr[2] = "isNullableAny";
                break;
            case 141:
                objArr[2] = "isDefaultBound";
                break;
            case 142:
                objArr[2] = "isUnit";
                break;
            case 143:
                objArr[2] = "mayReturnNonUnitValue";
                break;
            case 144:
                objArr[2] = "isUnitOrNullableUnit";
                break;
            case 145:
                objArr[2] = "isBooleanOrSubtype";
                break;
            case 146:
                objArr[2] = "isMemberOfAny";
                break;
            case 147:
            case 148:
                objArr[2] = "isEnum";
                break;
            case 149:
            case 150:
                objArr[2] = "isComparable";
                break;
            case 151:
                objArr[2] = "isCollectionOrNullableCollection";
                break;
            case 152:
                objArr[2] = "isListOrNullableList";
                break;
            case 153:
                objArr[2] = "isSetOrNullableSet";
                break;
            case 154:
                objArr[2] = "isMapOrNullableMap";
                break;
            case 155:
                objArr[2] = "isIterableOrNullableIterable";
                break;
            case 156:
                objArr[2] = "isThrowableOrNullableThrowable";
                break;
            case 157:
                objArr[2] = "isThrowable";
                break;
            case 158:
                objArr[2] = "isKClass";
                break;
            case 159:
                objArr[2] = "isNonPrimitiveArray";
                break;
            case 160:
                objArr[2] = "isCloneable";
                break;
            case 161:
                objArr[2] = "isDeprecated";
                break;
            case 162:
                objArr[2] = "isNotNullOrNullableFunctionSupertype";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i10) {
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 11:
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
            case 15:
            case 18:
            case 19:
            case 20:
            case MobileAdsBridge.CODE_21 /* 21 */:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 47:
            case 48:
            case 49:
            case 50:
            case 51:
            case 52:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 68:
            case 69:
            case 70:
            case 74:
            case 81:
            case 84:
            case 86:
            case 87:
                throw new IllegalStateException(str2);
            case 9:
            case 10:
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
            case 16:
            case 17:
            case 46:
            case 53:
            case 67:
            case 71:
            case 72:
            case 73:
            case 75:
            case 76:
            case 77:
            case 78:
            case 79:
            case 80:
            case 82:
            case 83:
            case 85:
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    public static boolean b(InterfaceC0271e interfaceC0271e, p096j9.e eVar) {
        if (interfaceC0271e == null) {
            a(103);
            throw null;
        }
        if (eVar != null) {
            return interfaceC0271e.getName().equals(eVar.f()) && eVar.equals(p124m9.e.g(interfaceC0271e));
        }
        a(104);
        throw null;
    }

    public static k r(InterfaceC0273g interfaceC0273g) {
        if (interfaceC0273g == null) {
            a(77);
            throw null;
        }
        if (n.f2163a0.contains(interfaceC0273g.getName())) {
            return (k) n.c0.get(p124m9.e.g(interfaceC0273g));
        }
        return null;
    }

    public static k t(InterfaceC0271e interfaceC0271e) {
        if (interfaceC0271e == null) {
            a(76);
            throw null;
        }
        if (n.f2162Z.contains(interfaceC0271e.getName())) {
            return (k) n.f2165b0.get(p124m9.e.g(interfaceC0271e));
        }
        return null;
    }

    public static boolean x(AbstractC0151y abstractC0151y) {
        if (abstractC0151y != null) {
            return A(abstractC0151y, n.a);
        }
        a(139);
        throw null;
    }

    public static boolean y(AbstractC0151y abstractC0151y) {
        if (abstractC0151y != null) {
            return A(abstractC0151y, n.f2170g);
        }
        a(88);
        throw null;
    }

    public static boolean z(InterfaceC0276j interfaceC0276j) {
        if (interfaceC0276j != null) {
            return p124m9.e.i(interfaceC0276j, p230x9.c.class, false) != null;
        }
        a(9);
        throw null;
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [h8.d, java.lang.Object] */
    public final void c() {
        p096j9.f fVar = f2112e;
        p210v8.i.f(fVar, "moduleName");
        p247z9.l lVar = this.f2115d;
        C c10 = new C(fVar, lVar, this, 48);
        this.a = c10;
        c.a.getClass();
        c cVar = (c) b.f2105b.getValue();
        C c11 = this.a;
        Iterable iterableL = l();
        N8.d dVarP = p();
        N8.b bVarD = d();
        ((p230x9.b) cVar).getClass();
        p210v8.i.f(c11, "builtInsModule");
        p210v8.i.f(iterableL, "classDescriptorFactories");
        p210v8.i.f(dVarP, "platformDependentDeclarationFilter");
        p210v8.i.f(bVarD, "additionalClassPartsProvider");
        Set<p096j9.c> set = o.f2202p;
        p210v8.i.f(set, "packageFqNames");
        ArrayList arrayList = new ArrayList(p086i8.m.H(set, 10));
        for (p096j9.c cVar2 : set) {
            p230x9.a.f15787m.getClass();
            String strA = p230x9.a.a(cVar2);
            p210v8.i.f(strA, "p0");
            InputStream inputStreamT = p230x9.d.t(strA);
            if (inputStreamT == null) {
                throw new IllegalStateException(E0.a.h("Resource not found in classpath: ", strA));
            }
            arrayList.add(com.bumptech.glide.c.e(cVar2, lVar, c11, inputStreamT));
        }
        F f10 = new F(arrayList);
        p140o4.r rVar = new p140o4.r(lVar, c11);
        p081i3.b bVar = new p081i3.b(f10, 21);
        p230x9.a aVar = p230x9.a.f15787m;
        I4.c cVar3 = new I4.c(lVar, c11, bVar, new o1.e(c11, rVar, aVar), f10, p220w9.j.a, p220w9.i.f15660c, iterableL, rVar, bVarD, dVarP, aVar.a, null, new p170r3.e(lVar), null, 851968);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((p230x9.c) it.next()).a1(cVar3);
        }
        c10.f3626z = f10;
        C c12 = this.a;
        c12.getClass();
        c12.f3625y = new p040e1.j(p086i8.i.H(new C[]{c12}), 22);
    }

    public N8.b d() {
        return N8.a.f3403b;
    }

    public final A9.D e() {
        A9.D dP = j("Any").p();
        if (dP != null) {
            return dP;
        }
        a(50);
        throw null;
    }

    public final AbstractC0151y f(AbstractC0151y abstractC0151y) {
        p096j9.b bVarF;
        p096j9.b bVar;
        InterfaceC0271e interfaceC0271eD;
        A9.D dP = null;
        if (abstractC0151y == null) {
            a(67);
            throw null;
        }
        if (y(abstractC0151y)) {
            if (abstractC0151y.l().size() != 1) {
                throw new IllegalStateException();
            }
            AbstractC0151y abstractC0151yB = ((S) abstractC0151y.l().get(0)).b();
            if (abstractC0151yB != null) {
                return abstractC0151yB;
            }
            a(68);
            throw null;
        }
        d0 d0VarG = b0.g(abstractC0151y, false);
        AbstractC0151y abstractC0151y2 = (AbstractC0151y) ((h) this.f2113b.invoke()).f2111b.get(d0VarG);
        if (abstractC0151y2 != null) {
            return abstractC0151y2;
        }
        int i10 = p124m9.e.a;
        InterfaceC0273g interfaceC0273gW = d0VarG.D().w();
        InterfaceC0290y interfaceC0290yE = interfaceC0273gW == null ? null : p124m9.e.e(interfaceC0273gW);
        if (interfaceC0290yE != null) {
            InterfaceC0273g interfaceC0273gW2 = d0VarG.D().w();
            if (interfaceC0273gW2 != null) {
                Set set = s.a;
                p096j9.f name = interfaceC0273gW2.getName();
                p210v8.i.f(name, MediationMetaData.KEY_NAME);
                if (s.f2215d.contains(name) && (bVarF = p165q9.d.f(interfaceC0273gW2)) != null && (bVar = (p096j9.b) s.f2213b.get(bVarF)) != null && (interfaceC0271eD = AbstractC0287v.d(interfaceC0290yE, bVar)) != null) {
                    dP = interfaceC0271eD.p();
                }
            }
            if (dP != null) {
                return dP;
            }
        }
        throw new IllegalStateException("not array: " + abstractC0151y);
    }

    public final A9.D g(int i10, AbstractC0151y abstractC0151y, M8.h hVar) {
        if (i10 == 0) {
            a(78);
            throw null;
        }
        if (abstractC0151y != null) {
            return C0133f.q(AbstractC0130c.x(hVar), j("Array"), Collections.singletonList(new T(i10, abstractC0151y)));
        }
        a(79);
        throw null;
    }

    public final A9.D h(d0 d0Var) {
        if (d0Var != null) {
            return g(1, d0Var, M8.g.a);
        }
        a(83);
        throw null;
    }

    public final InterfaceC0271e i(p096j9.c cVar) {
        if (cVar == null) {
            a(12);
            throw null;
        }
        InterfaceC0271e interfaceC0271eJ = AbstractC0287v.j(k(), cVar);
        if (interfaceC0271eJ != null) {
            return interfaceC0271eJ;
        }
        a(13);
        throw null;
    }

    public final InterfaceC0271e j(String str) {
        if (str != null) {
            return (InterfaceC0271e) this.f2114c.invoke(p096j9.f.j(str));
        }
        a(14);
        throw null;
    }

    public final C k() {
        this.a.getClass();
        C c10 = this.a;
        if (c10 != null) {
            return c10;
        }
        a(7);
        throw null;
    }

    public Iterable l() {
        List listSingletonList = Collections.singletonList(new J8.a(this.f2115d, k()));
        if (listSingletonList != null) {
            return listSingletonList;
        }
        a(5);
        throw null;
    }

    public final A9.D m() {
        A9.D dO = o();
        if (dO != null) {
            return dO;
        }
        a(52);
        throw null;
    }

    public final A9.D n() {
        A9.D dP = j("Nothing").p();
        if (dP != null) {
            return dP;
        }
        a(48);
        throw null;
    }

    public final A9.D o() {
        A9.D dO0 = e().G0(true);
        if (dO0 != null) {
            return dO0;
        }
        a(51);
        throw null;
    }

    public N8.d p() {
        return N8.a.f3405d;
    }

    public final A9.D q(k kVar) {
        if (kVar == null) {
            a(73);
            throw null;
        }
        A9.D d3 = (A9.D) ((h) this.f2113b.invoke()).a.get(kVar);
        if (d3 != null) {
            return d3;
        }
        a(74);
        throw null;
    }

    public final A9.D s(k kVar) {
        if (kVar == null) {
            a(53);
            throw null;
        }
        A9.D dP = j(kVar.f2128s.g()).p();
        if (dP != null) {
            return dP;
        }
        a(54);
        throw null;
    }

    public final A9.D u() {
        A9.D dP = j("String").p();
        if (dP != null) {
            return dP;
        }
        a(65);
        throw null;
    }

    public final InterfaceC0271e v(int i10) {
        return i(o.f2192e.c(p096j9.f.j(J8.e.f2455w.f2460t + i10)));
    }

    public final A9.D w() {
        A9.D dP = j("Unit").p();
        if (dP != null) {
            return dP;
        }
        a(64);
        throw null;
    }
}
