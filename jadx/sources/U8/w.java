package U8;

import com.unity3d.ads.metadata.MediationMetaData;

/* JADX INFO: loaded from: classes.dex */
public abstract class w {
    public static final p096j9.c a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final p096j9.b f4993b;

    static {
        p096j9.c cVar = new p096j9.c("kotlin.jvm.JvmField");
        a = cVar;
        p096j9.b.j(cVar);
        p096j9.b.j(new p096j9.c("kotlin.reflect.jvm.internal.ReflectionFactoryImpl"));
        f4993b = p096j9.b.e("kotlin/jvm/internal/RepeatableContainer", false);
    }

    public static final String a(String str) {
        p210v8.i.f(str, "propertyName");
        if (c(str)) {
            return str;
        }
        return "get" + J7.j.b(str);
    }

    public static final String b(String str) {
        String strB;
        StringBuilder sb = new StringBuilder("set");
        if (c(str)) {
            strB = str.substring(2);
            p210v8.i.e(strB, "this as java.lang.String).substring(startIndex)");
        } else {
            strB = J7.j.b(str);
        }
        sb.append(strB);
        return sb.toString();
    }

    public static final boolean c(String str) {
        p210v8.i.f(str, MediationMetaData.KEY_NAME);
        if (L9.n.I(str, "is", false) && str.length() != 2) {
            char cCharAt = str.charAt(2);
            if (p210v8.i.h(97, cCharAt) > 0 || p210v8.i.h(cCharAt, 122) > 0) {
                return true;
            }
        }
        return false;
    }
}
