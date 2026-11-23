package ya;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.LinkedHashSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public final class J {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final Pattern f16160x = Pattern.compile("\\{([a-zA-Z][a-zA-Z0-9_-]*)\\}");

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final Pattern f16161y = Pattern.compile("[a-zA-Z][a-zA-Z0-9_-]*");
    public final p188t1.G a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Method f16162b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Annotation[] f16163c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Annotation[][] f16164d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Type[] f16165e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f16166f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f16167g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f16168h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f16169i;
    public boolean j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f16170k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f16171l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f16172m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public String f16173n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f16174o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f16175p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f16176q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public String f16177r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public X9.w f16178s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public X9.A f16179t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public LinkedHashSet f16180u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public T[] f16181v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f16182w;

    public J(p188t1.G g8, Method method) {
        this.a = g8;
        this.f16162b = method;
        this.f16163c = method.getAnnotations();
        this.f16165e = method.getGenericParameterTypes();
        this.f16164d = method.getParameterAnnotations();
    }

    public static Class a(Class cls) {
        if (Boolean.TYPE == cls) {
            return Boolean.class;
        }
        if (Byte.TYPE == cls) {
            return Byte.class;
        }
        if (Character.TYPE == cls) {
            return Character.class;
        }
        if (Double.TYPE == cls) {
            return Double.class;
        }
        if (Float.TYPE == cls) {
            return Float.class;
        }
        if (Integer.TYPE == cls) {
            return Integer.class;
        }
        if (Long.TYPE == cls) {
            return Long.class;
        }
        return Short.TYPE == cls ? Short.class : cls;
    }

    public final void b(String str, String str2, boolean z6) {
        String str3 = this.f16173n;
        Method method = this.f16162b;
        if (str3 != null) {
            throw T.j(method, null, "Only one HTTP method is allowed. Found: %s and %s.", str3, str);
        }
        this.f16173n = str;
        this.f16174o = z6;
        if (str2.isEmpty()) {
            return;
        }
        int iIndexOf = str2.indexOf(63);
        Pattern pattern = f16160x;
        if (iIndexOf != -1 && iIndexOf < str2.length() - 1) {
            String strSubstring = str2.substring(iIndexOf + 1);
            if (pattern.matcher(strSubstring).find()) {
                throw T.j(method, null, "URL query string \"%s\" must not have replace block. For dynamic query parameters use @Query.", strSubstring);
            }
        }
        this.f16177r = str2;
        Matcher matcher = pattern.matcher(str2);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        while (matcher.find()) {
            linkedHashSet.add(matcher.group(1));
        }
        this.f16180u = linkedHashSet;
    }

    public final void c(int i10, Type type) {
        if (T.h(type)) {
            throw T.k(this.f16162b, i10, "Parameter type must not include a type variable or wildcard: %s", type);
        }
    }
}
