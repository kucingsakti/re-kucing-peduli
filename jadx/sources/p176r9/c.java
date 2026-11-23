package p176r9;

import I8.k;
import com.unity3d.ads.metadata.MediationMetaData;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.HashSet;
import org.chromium.net.UrlRequest;

/* JADX INFO: loaded from: classes.dex */
public enum c {
    BOOLEAN(k.BOOLEAN, "boolean", "Z", "java.lang.Boolean"),
    CHAR(k.CHAR, "char", "C", "java.lang.Character"),
    BYTE(k.BYTE, "byte", "B", "java.lang.Byte"),
    SHORT(k.SHORT, "short", "S", "java.lang.Short"),
    INT(k.INT, "int", "I", "java.lang.Integer"),
    FLOAT(k.FLOAT, "float", "F", "java.lang.Float"),
    LONG(k.LONG, "long", "J", "java.lang.Long"),
    DOUBLE(k.DOUBLE, "double", "D", "java.lang.Double");


    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public static final HashSet f14566E = new HashSet();

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public static final HashMap f14567F = new HashMap();

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public static final EnumMap f14568G = new EnumMap(k.class);

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public static final HashMap f14569H = new HashMap();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final k f14575s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final String f14576t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final String f14577u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final p096j9.c f14578v;

    static {
        for (c cVar : values()) {
            f14566E.add(cVar.j());
            f14567F.put(cVar.f14576t, cVar);
            f14568G.put(cVar.i(), cVar);
            f14569H.put(cVar.h(), cVar);
        }
    }

    c(k kVar, String str, String str2, String str3) {
        if (kVar == null) {
            f(6);
            throw null;
        }
        this.f14575s = kVar;
        this.f14576t = str;
        this.f14577u = str2;
        this.f14578v = new p096j9.c(str3);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x000c  */
    public static /* synthetic */ void f(int i10) {
        String str;
        int i11;
        if (i10 != 2 && i10 != 4) {
            switch (i10) {
                case 10:
                case 11:
                case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                    str = "@NotNull method %s.%s must not return null";
                    break;
                default:
                    str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                    break;
            }
        } else {
            str = "@NotNull method %s.%s must not return null";
        }
        if (i10 != 2 && i10 != 4) {
            switch (i10) {
                case 10:
                case 11:
                case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
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
            case 7:
                objArr[0] = MediationMetaData.KEY_NAME;
                break;
            case 2:
            case 4:
            case 10:
            case 11:
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/jvm/JvmPrimitiveType";
                break;
            case 3:
                objArr[0] = com.onesignal.inAppMessages.internal.display.impl.k.EVENT_TYPE_KEY;
                break;
            case 5:
            case 8:
                objArr[0] = "desc";
                break;
            case 6:
                objArr[0] = "primitiveType";
                break;
            case 9:
                objArr[0] = "wrapperClassName";
                break;
            default:
                objArr[0] = "className";
                break;
        }
        if (i10 != 2 && i10 != 4) {
            switch (i10) {
                case 10:
                    objArr[1] = "getPrimitiveType";
                    break;
                case 11:
                    objArr[1] = "getJavaKeywordName";
                    break;
                case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                    objArr[1] = "getDesc";
                    break;
                case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                    objArr[1] = "getWrapperFqName";
                    break;
                default:
                    objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/jvm/JvmPrimitiveType";
                    break;
            }
        } else {
            objArr[1] = "get";
        }
        switch (i10) {
            case 1:
            case 3:
                objArr[2] = "get";
                break;
            case 2:
            case 4:
            case 10:
            case 11:
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                break;
            case 5:
                objArr[2] = "getByDesc";
                break;
            case 6:
            case 7:
            case 8:
            case 9:
                objArr[2] = "<init>";
                break;
            default:
                objArr[2] = "isWrapperClassName";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i10 != 2 && i10 != 4) {
            switch (i10) {
                case 10:
                case 11:
                case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                    break;
                default:
                    throw new IllegalArgumentException(str2);
            }
        }
        throw new IllegalStateException(str2);
    }

    public static c g(String str) {
        c cVar = (c) f14567F.get(str);
        if (cVar != null) {
            return cVar;
        }
        throw new AssertionError("Non-primitive type name passed: ".concat(str));
    }

    public final String h() {
        String str = this.f14577u;
        if (str != null) {
            return str;
        }
        f(12);
        throw null;
    }

    public final k i() {
        k kVar = this.f14575s;
        if (kVar != null) {
            return kVar;
        }
        f(10);
        throw null;
    }

    public final p096j9.c j() {
        p096j9.c cVar = this.f14578v;
        if (cVar != null) {
            return cVar;
        }
        f(13);
        throw null;
    }
}
