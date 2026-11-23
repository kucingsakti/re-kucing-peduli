package ya;

import X9.InterfaceC0463i;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.net.URI;
import java.util.Map;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: ya.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0893n {
    public final K a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC0463i f16214b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final InterfaceC0890k f16215c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f16216d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final InterfaceC0884e f16217e;

    public C0893n(K k3, InterfaceC0463i interfaceC0463i, InterfaceC0890k interfaceC0890k, InterfaceC0884e interfaceC0884e, int i10) {
        this.f16216d = i10;
        this.a = k3;
        this.f16214b = interfaceC0463i;
        this.f16215c = interfaceC0890k;
        this.f16217e = interfaceC0884e;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$ArrayArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static C0893n a(p188t1.G g8, Method method) {
        Type genericReturnType;
        boolean z6;
        T t7;
        Annotation[][] annotationArr;
        int i10;
        int i11;
        T[] tArr;
        int i12;
        String str;
        T f10;
        T b3;
        v vVar;
        T d3;
        int i13;
        int i14 = -1;
        int i15 = 0;
        int i16 = 1;
        J j = new J(g8, method);
        Annotation[] annotationArr2 = j.f16163c;
        int length = annotationArr2.length;
        int i17 = 0;
        while (true) {
            Method method2 = j.f16162b;
            String str2 = "HEAD";
            if (i17 >= length) {
                if (j.f16173n == null) {
                    throw T.j(method2, null, "HTTP method annotation is required (e.g., @GET, @POST, etc.).", new Object[0]);
                }
                if (!j.f16174o) {
                    if (j.f16176q) {
                        throw T.j(method2, null, "Multipart can only be specified on HTTP methods with request body (e.g., @POST).", new Object[0]);
                    }
                    if (j.f16175p) {
                        throw T.j(method2, null, "FormUrlEncoded can only be specified on HTTP methods with request body (e.g., @POST).", new Object[0]);
                    }
                }
                Annotation[][] annotationArr3 = j.f16164d;
                int length2 = annotationArr3.length;
                j.f16181v = new T[length2];
                int i18 = length2 - 1;
                int i19 = 0;
                while (i19 < length2) {
                    T[] tArr2 = j.f16181v;
                    Type type = j.f16165e[i19];
                    Annotation[] annotationArr4 = annotationArr3[i19];
                    int i20 = i19 == i18 ? i16 : i15;
                    if (annotationArr4 != null) {
                        int length3 = annotationArr4.length;
                        int i21 = 0;
                        t7 = null;
                        while (true) {
                            annotationArr = annotationArr3;
                            if (i21 >= length3) {
                                break;
                            }
                            Annotation annotation = annotationArr4[i21];
                            int i22 = length2;
                            int i23 = length3;
                            if (annotation instanceof Ba.y) {
                                j.c(i19, type);
                                if (j.f16172m) {
                                    throw T.k(method2, i19, "Multiple @Url method annotations found.", new Object[0]);
                                }
                                if (j.f16169i) {
                                    throw T.k(method2, i19, "@Path parameters may not be used with @Url.", new Object[0]);
                                }
                                if (j.j) {
                                    throw T.k(method2, i19, "A @Url parameter must not come after a @Query.", new Object[0]);
                                }
                                if (j.f16170k) {
                                    throw T.k(method2, i19, "A @Url parameter must not come after a @QueryName.", new Object[0]);
                                }
                                if (j.f16171l) {
                                    throw T.k(method2, i19, "A @Url parameter must not come after a @QueryMap.", new Object[0]);
                                }
                                if (j.f16177r != null) {
                                    throw T.k(method2, i19, "@Url cannot be used with @%s URL", j.f16173n);
                                }
                                j.f16172m = true;
                                if (type != X9.y.class && type != String.class && type != URI.class && (!(type instanceof Class) || !"android.net.Uri".equals(((Class) type).getName()))) {
                                    throw T.k(method2, i19, "@Url must be okhttp3.HttpUrl, String, java.net.URI, or android.net.Uri type.", new Object[0]);
                                }
                                f10 = new A(method2, i19, 2);
                                i10 = i21;
                                i11 = i18;
                                str = str2;
                                tArr = tArr2;
                                i12 = i20;
                            } else {
                                i10 = i21;
                                boolean z10 = annotation instanceof Ba.s;
                                p188t1.G g10 = j.a;
                                if (z10) {
                                    j.c(i19, type);
                                    if (j.j) {
                                        throw T.k(method2, i19, "A @Path parameter must not come after a @Query.", new Object[0]);
                                    }
                                    if (j.f16170k) {
                                        throw T.k(method2, i19, "A @Path parameter must not come after a @QueryName.", new Object[0]);
                                    }
                                    if (j.f16171l) {
                                        throw T.k(method2, i19, "A @Path parameter must not come after a @QueryMap.", new Object[0]);
                                    }
                                    if (j.f16172m) {
                                        throw T.k(method2, i19, "@Path parameters may not be used with @Url.", new Object[0]);
                                    }
                                    if (j.f16177r == null) {
                                        throw T.k(method2, i19, "@Path can only be used with relative url on @%s", j.f16173n);
                                    }
                                    j.f16169i = true;
                                    Ba.s sVar = (Ba.s) annotation;
                                    String strValue = sVar.value();
                                    if (!J.f16161y.matcher(strValue).matches()) {
                                        throw T.k(method2, i19, "@Path parameter name must match %s. Found: %s", J.f16160x.pattern(), strValue);
                                    }
                                    if (!j.f16180u.contains(strValue)) {
                                        throw T.k(method2, i19, "URL \"%s\" does not contain \"{%s}\".", j.f16177r, strValue);
                                    }
                                    g10.E(type, annotationArr4);
                                    f10 = new C(method2, i19, strValue, sVar.encoded());
                                    i11 = i18;
                                    str = str2;
                                    tArr = tArr2;
                                    i12 = i20;
                                } else {
                                    i11 = i18;
                                    tArr = tArr2;
                                    if (annotation instanceof Ba.t) {
                                        j.c(i19, type);
                                        Ba.t tVar = (Ba.t) annotation;
                                        String strValue2 = tVar.value();
                                        boolean zEncoded = tVar.encoded();
                                        i12 = i20;
                                        Class clsF = T.f(type);
                                        j.j = true;
                                        if (Iterable.class.isAssignableFrom(clsF)) {
                                            if (!(type instanceof ParameterizedType)) {
                                                throw T.k(method2, i19, clsF.getSimpleName() + " must include generic type (e.g., " + clsF.getSimpleName() + "<String>)", new Object[0]);
                                            }
                                            g10.E(T.e(0, (ParameterizedType) type), annotationArr4);
                                            f10 = new v(new x(strValue2, zEncoded, 1), 0);
                                        } else if (clsF.isArray()) {
                                            g10.E(J.a(clsF.getComponentType()), annotationArr4);
                                            d3 = new v(new x(strValue2, zEncoded, 1), 1);
                                            f10 = d3;
                                        } else {
                                            g10.E(type, annotationArr4);
                                            f10 = new x(strValue2, zEncoded, 1);
                                        }
                                        str = str2;
                                    } else {
                                        i12 = i20;
                                        if (annotation instanceof Ba.v) {
                                            j.c(i19, type);
                                            boolean zEncoded2 = ((Ba.v) annotation).encoded();
                                            Class clsF2 = T.f(type);
                                            j.f16170k = true;
                                            if (Iterable.class.isAssignableFrom(clsF2)) {
                                                if (!(type instanceof ParameterizedType)) {
                                                    throw T.k(method2, i19, clsF2.getSimpleName() + " must include generic type (e.g., " + clsF2.getSimpleName() + "<String>)", new Object[0]);
                                                }
                                                g10.E(T.e(0, (ParameterizedType) type), annotationArr4);
                                                f10 = new v(new D(zEncoded2), 0);
                                            } else if (clsF2.isArray()) {
                                                g10.E(J.a(clsF2.getComponentType()), annotationArr4);
                                                f10 = new v(new D(zEncoded2), 1);
                                            } else {
                                                g10.E(type, annotationArr4);
                                                d3 = new D(zEncoded2);
                                                f10 = d3;
                                            }
                                        } else if (annotation instanceof Ba.u) {
                                            j.c(i19, type);
                                            Class clsF3 = T.f(type);
                                            j.f16171l = true;
                                            if (!Map.class.isAssignableFrom(clsF3)) {
                                                throw T.k(method2, i19, "@QueryMap parameter type must be Map.", new Object[0]);
                                            }
                                            Type typeG = T.g(type, clsF3);
                                            if (!(typeG instanceof ParameterizedType)) {
                                                throw T.k(method2, i19, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                                            }
                                            ParameterizedType parameterizedType = (ParameterizedType) typeG;
                                            Type typeE = T.e(0, parameterizedType);
                                            if (String.class != typeE) {
                                                throw T.k(method2, i19, "@QueryMap keys must be of type String: " + typeE, new Object[0]);
                                            }
                                            g10.E(T.e(1, parameterizedType), annotationArr4);
                                            f10 = new y(method2, i19, ((Ba.u) annotation).encoded(), 1);
                                        } else {
                                            str = str2;
                                            if (annotation instanceof Ba.i) {
                                                j.c(i19, type);
                                                String strValue3 = ((Ba.i) annotation).value();
                                                Class clsF4 = T.f(type);
                                                if (Iterable.class.isAssignableFrom(clsF4)) {
                                                    if (!(type instanceof ParameterizedType)) {
                                                        throw T.k(method2, i19, clsF4.getSimpleName() + " must include generic type (e.g., " + clsF4.getSimpleName() + "<String>)", new Object[0]);
                                                    }
                                                    g10.E(T.e(0, (ParameterizedType) type), annotationArr4);
                                                    f10 = new v(new z(strValue3), 0);
                                                } else if (clsF4.isArray()) {
                                                    g10.E(J.a(clsF4.getComponentType()), annotationArr4);
                                                    f10 = new v(new z(strValue3), 1);
                                                } else {
                                                    g10.E(type, annotationArr4);
                                                    b3 = new z(strValue3);
                                                    f10 = b3;
                                                }
                                            } else if (annotation instanceof Ba.j) {
                                                if (type == X9.w.class) {
                                                    f10 = new A(method2, i19, 1);
                                                } else {
                                                    j.c(i19, type);
                                                    Class clsF5 = T.f(type);
                                                    if (!Map.class.isAssignableFrom(clsF5)) {
                                                        throw T.k(method2, i19, "@HeaderMap parameter type must be Map.", new Object[0]);
                                                    }
                                                    Type typeG2 = T.g(type, clsF5);
                                                    if (!(typeG2 instanceof ParameterizedType)) {
                                                        throw T.k(method2, i19, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                                                    }
                                                    ParameterizedType parameterizedType2 = (ParameterizedType) typeG2;
                                                    Type typeE2 = T.e(0, parameterizedType2);
                                                    if (String.class != typeE2) {
                                                        throw T.k(method2, i19, "@HeaderMap keys must be of type String: " + typeE2, new Object[0]);
                                                    }
                                                    g10.E(T.e(1, parameterizedType2), annotationArr4);
                                                    f10 = new A(method2, i19, 0);
                                                }
                                            } else if (annotation instanceof Ba.c) {
                                                j.c(i19, type);
                                                if (!j.f16175p) {
                                                    throw T.k(method2, i19, "@Field parameters can only be used with form encoding.", new Object[0]);
                                                }
                                                Ba.c cVar = (Ba.c) annotation;
                                                String strValue4 = cVar.value();
                                                boolean zEncoded3 = cVar.encoded();
                                                j.f16166f = true;
                                                Class clsF6 = T.f(type);
                                                if (Iterable.class.isAssignableFrom(clsF6)) {
                                                    if (!(type instanceof ParameterizedType)) {
                                                        throw T.k(method2, i19, clsF6.getSimpleName() + " must include generic type (e.g., " + clsF6.getSimpleName() + "<String>)", new Object[0]);
                                                    }
                                                    g10.E(T.e(0, (ParameterizedType) type), annotationArr4);
                                                    f10 = new v(new x(strValue4, zEncoded3, 0), 0);
                                                } else if (clsF6.isArray()) {
                                                    g10.E(J.a(clsF6.getComponentType()), annotationArr4);
                                                    f10 = new v(new x(strValue4, zEncoded3, 0), 1);
                                                } else {
                                                    g10.E(type, annotationArr4);
                                                    f10 = new x(strValue4, zEncoded3, 0);
                                                }
                                            } else if (annotation instanceof Ba.d) {
                                                j.c(i19, type);
                                                if (!j.f16175p) {
                                                    throw T.k(method2, i19, "@FieldMap parameters can only be used with form encoding.", new Object[0]);
                                                }
                                                Class clsF7 = T.f(type);
                                                if (!Map.class.isAssignableFrom(clsF7)) {
                                                    throw T.k(method2, i19, "@FieldMap parameter type must be Map.", new Object[0]);
                                                }
                                                Type typeG3 = T.g(type, clsF7);
                                                if (!(typeG3 instanceof ParameterizedType)) {
                                                    throw T.k(method2, i19, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                                                }
                                                ParameterizedType parameterizedType3 = (ParameterizedType) typeG3;
                                                Type typeE3 = T.e(0, parameterizedType3);
                                                if (String.class != typeE3) {
                                                    throw T.k(method2, i19, "@FieldMap keys must be of type String: " + typeE3, new Object[0]);
                                                }
                                                g10.E(T.e(1, parameterizedType3), annotationArr4);
                                                j.f16166f = true;
                                                f10 = new y(method2, i19, ((Ba.d) annotation).encoded(), 0);
                                            } else if (annotation instanceof Ba.q) {
                                                j.c(i19, type);
                                                if (!j.f16176q) {
                                                    throw T.k(method2, i19, "@Part parameters can only be used with multipart encoding.", new Object[0]);
                                                }
                                                Ba.q qVar = (Ba.q) annotation;
                                                j.f16167g = true;
                                                String strValue5 = qVar.value();
                                                Class clsF8 = T.f(type);
                                                if (strValue5.isEmpty()) {
                                                    boolean zIsAssignableFrom = Iterable.class.isAssignableFrom(clsF8);
                                                    b3 = E.f16145b;
                                                    if (zIsAssignableFrom) {
                                                        if (!(type instanceof ParameterizedType)) {
                                                            throw T.k(method2, i19, clsF8.getSimpleName() + " must include generic type (e.g., " + clsF8.getSimpleName() + "<String>)", new Object[0]);
                                                        }
                                                        if (!X9.B.class.isAssignableFrom(T.f(T.e(0, (ParameterizedType) type)))) {
                                                            throw T.k(method2, i19, "@Part annotation must supply a name or use MultipartBody.Part parameter type.", new Object[0]);
                                                        }
                                                        f10 = new v(b3, 0);
                                                    } else if (!clsF8.isArray()) {
                                                        if (!X9.B.class.isAssignableFrom(clsF8)) {
                                                            throw T.k(method2, i19, "@Part annotation must supply a name or use MultipartBody.Part parameter type.", new Object[0]);
                                                        }
                                                        f10 = b3;
                                                    } else {
                                                        if (!X9.B.class.isAssignableFrom(clsF8.getComponentType())) {
                                                            throw T.k(method2, i19, "@Part annotation must supply a name or use MultipartBody.Part parameter type.", new Object[0]);
                                                        }
                                                        f10 = new v(b3, 1);
                                                    }
                                                } else {
                                                    X9.w wVarT = p086i8.C.t("Content-Disposition", E0.a.i("form-data; name=\"", strValue5, "\""), "Content-Transfer-Encoding", qVar.encoding());
                                                    if (Iterable.class.isAssignableFrom(clsF8)) {
                                                        if (!(type instanceof ParameterizedType)) {
                                                            throw T.k(method2, i19, clsF8.getSimpleName() + " must include generic type (e.g., " + clsF8.getSimpleName() + "<String>)", new Object[0]);
                                                        }
                                                        Type typeE4 = T.e(0, (ParameterizedType) type);
                                                        if (X9.B.class.isAssignableFrom(T.f(typeE4))) {
                                                            throw T.k(method2, i19, "@Part parameters using the MultipartBody.Part must not include a part name in the annotation.", new Object[0]);
                                                        }
                                                        vVar = new v(new B(method2, i19, wVarT, g10.y(typeE4, annotationArr4, annotationArr2)), 0);
                                                    } else if (clsF8.isArray()) {
                                                        Class clsA = J.a(clsF8.getComponentType());
                                                        if (X9.B.class.isAssignableFrom(clsA)) {
                                                            throw T.k(method2, i19, "@Part parameters using the MultipartBody.Part must not include a part name in the annotation.", new Object[0]);
                                                        }
                                                        vVar = new v(new B(method2, i19, wVarT, g10.y(clsA, annotationArr4, annotationArr2)), 1);
                                                    } else {
                                                        if (X9.B.class.isAssignableFrom(clsF8)) {
                                                            throw T.k(method2, i19, "@Part parameters using the MultipartBody.Part must not include a part name in the annotation.", new Object[0]);
                                                        }
                                                        b3 = new B(method2, i19, wVarT, g10.y(type, annotationArr4, annotationArr2));
                                                        f10 = b3;
                                                    }
                                                    f10 = vVar;
                                                }
                                            } else if (annotation instanceof Ba.r) {
                                                j.c(i19, type);
                                                if (!j.f16176q) {
                                                    throw T.k(method2, i19, "@PartMap parameters can only be used with multipart encoding.", new Object[0]);
                                                }
                                                j.f16167g = true;
                                                Class clsF9 = T.f(type);
                                                if (!Map.class.isAssignableFrom(clsF9)) {
                                                    throw T.k(method2, i19, "@PartMap parameter type must be Map.", new Object[0]);
                                                }
                                                Type typeG4 = T.g(type, clsF9);
                                                if (!(typeG4 instanceof ParameterizedType)) {
                                                    throw T.k(method2, i19, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                                                }
                                                ParameterizedType parameterizedType4 = (ParameterizedType) typeG4;
                                                Type typeE5 = T.e(0, parameterizedType4);
                                                if (String.class != typeE5) {
                                                    throw T.k(method2, i19, "@PartMap keys must be of type String: " + typeE5, new Object[0]);
                                                }
                                                Type typeE6 = T.e(1, parameterizedType4);
                                                if (X9.B.class.isAssignableFrom(T.f(typeE6))) {
                                                    throw T.k(method2, i19, "@PartMap values cannot be MultipartBody.Part. Use @Part List<Part> or a different value type instead.", new Object[0]);
                                                }
                                                f10 = new B(method2, i19, g10.y(typeE6, annotationArr4, annotationArr2), ((Ba.r) annotation).encoding());
                                            } else if (annotation instanceof Ba.a) {
                                                j.c(i19, type);
                                                if (j.f16175p || j.f16176q) {
                                                    throw T.k(method2, i19, "@Body parameters cannot be used with form or multi-part encoding.", new Object[0]);
                                                }
                                                if (j.f16168h) {
                                                    throw T.k(method2, i19, "Multiple @Body method annotations found.", new Object[0]);
                                                }
                                                try {
                                                    InterfaceC0890k interfaceC0890kY = g10.y(type, annotationArr4, annotationArr2);
                                                    j.f16168h = true;
                                                    f10 = new w(method2, i19, interfaceC0890kY);
                                                } catch (RuntimeException e10) {
                                                    throw T.l(method2, e10, i19, "Unable to create @Body converter for %s", type);
                                                }
                                            } else if (annotation instanceof Ba.x) {
                                                j.c(i19, type);
                                                Class clsF10 = T.f(type);
                                                for (int i24 = i19 - 1; i24 >= 0; i24--) {
                                                    T t8 = j.f16181v[i24];
                                                    if ((t8 instanceof F) && ((F) t8).f16146b.equals(clsF10)) {
                                                        throw T.k(method2, i19, "@Tag type " + clsF10.getName() + " is duplicate of parameter #" + (i24 + 1) + " and would always overwrite its value.", new Object[0]);
                                                    }
                                                }
                                                f10 = new F(clsF10);
                                            } else {
                                                f10 = null;
                                            }
                                        }
                                        str = str2;
                                    }
                                }
                            }
                            if (f10 != null) {
                                if (t7 != null) {
                                    throw T.k(method2, i19, "Multiple Retrofit annotations found, only one allowed.", new Object[0]);
                                }
                                t7 = f10;
                            }
                            i21 = i10 + 1;
                            annotationArr3 = annotationArr;
                            length2 = i22;
                            length3 = i23;
                            i20 = i12;
                            i18 = i11;
                            tArr2 = tArr;
                            str2 = str;
                        }
                    } else {
                        t7 = null;
                        annotationArr = annotationArr3;
                    }
                    int i25 = length2;
                    int i26 = i18;
                    String str3 = str2;
                    T[] tArr3 = tArr2;
                    int i27 = i20;
                    if (t7 == null) {
                        if (i27 != 0) {
                            try {
                                if (T.f(type) == p123m8.d.class) {
                                    j.f16182w = true;
                                    t7 = null;
                                }
                            } catch (NoClassDefFoundError unused) {
                            }
                        }
                        throw T.k(method2, i19, "No Retrofit annotation found.", new Object[0]);
                    }
                    tArr3[i19] = t7;
                    i19++;
                    i16 = 1;
                    annotationArr3 = annotationArr;
                    length2 = i25;
                    i18 = i26;
                    str2 = str3;
                    i15 = 0;
                }
                int i28 = i16;
                String str4 = str2;
                if (j.f16177r == null && !j.f16172m) {
                    Object[] objArr = new Object[i28];
                    objArr[0] = j.f16173n;
                    throw T.j(method2, null, "Missing either @%s URL or @Url parameter.", objArr);
                }
                boolean z11 = j.f16175p;
                if (!z11 && !j.f16176q && !j.f16174o && j.f16168h) {
                    throw T.j(method2, null, "Non-body HTTP method cannot contain @Body.", new Object[0]);
                }
                if (z11 && !j.f16166f) {
                    throw T.j(method2, null, "Form-encoded method must contain at least one @Field.", new Object[0]);
                }
                if (j.f16176q && !j.f16167g) {
                    throw T.j(method2, null, "Multipart method must contain at least one @Part.", new Object[0]);
                }
                K k3 = new K(j);
                Type genericReturnType2 = method.getGenericReturnType();
                if (T.h(genericReturnType2)) {
                    throw T.j(method, null, "Method return type must not include a type variable or wildcard: %s", genericReturnType2);
                }
                if (genericReturnType2 == Void.TYPE) {
                    throw T.j(method, null, "Service methods cannot return void.", new Object[0]);
                }
                Annotation[] annotations = method.getAnnotations();
                boolean z12 = k3.f16191k;
                if (z12) {
                    Type[] genericParameterTypes = method.getGenericParameterTypes();
                    Type typeE7 = ((ParameterizedType) genericParameterTypes[genericParameterTypes.length - 1]).getActualTypeArguments()[0];
                    if (typeE7 instanceof WildcardType) {
                        typeE7 = ((WildcardType) typeE7).getLowerBounds()[0];
                    }
                    if (T.f(typeE7) == L.class && (typeE7 instanceof ParameterizedType)) {
                        typeE7 = T.e(0, (ParameterizedType) typeE7);
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    genericReturnType = new Q(null, InterfaceC0882c.class, typeE7);
                    if (!T.i(annotations, N.class)) {
                        Annotation[] annotationArr5 = new Annotation[annotations.length + 1];
                        annotationArr5[0] = O.a;
                        System.arraycopy(annotations, 0, annotationArr5, 1, annotations.length);
                        annotations = annotationArr5;
                    }
                } else {
                    genericReturnType = method.getGenericReturnType();
                    z6 = false;
                }
                try {
                    InterfaceC0884e interfaceC0884eF = g8.f(genericReturnType, annotations);
                    Type typeT = interfaceC0884eF.T();
                    if (typeT == X9.L.class) {
                        throw T.j(method, null, "'" + T.f(typeT).getName() + "' is not a valid response body type. Did you mean ResponseBody?", new Object[0]);
                    }
                    if (typeT == L.class) {
                        throw T.j(method, null, "Response must include generic type (e.g., Response<String>)", new Object[0]);
                    }
                    if (k3.f16184c.equals(str4) && !Void.class.equals(typeT)) {
                        throw T.j(method, null, "HEAD method must use Void as response type.", new Object[0]);
                    }
                    try {
                        InterfaceC0890k interfaceC0890kZ = g8.z(typeT, method.getAnnotations());
                        InterfaceC0463i interfaceC0463i = (InterfaceC0463i) g8.f14979t;
                        if (z12) {
                            return z6 ? new C0893n(k3, interfaceC0463i, interfaceC0890kZ, interfaceC0884eF, 2) : new C0893n(k3, interfaceC0463i, interfaceC0890kZ, interfaceC0884eF, 1);
                        }
                        return new C0893n(k3, interfaceC0463i, interfaceC0890kZ, interfaceC0884eF, 0);
                    } catch (RuntimeException e11) {
                        throw T.j(method, e11, "Unable to create converter for %s", typeT);
                    }
                } catch (RuntimeException e12) {
                    throw T.j(method, e12, "Unable to create call adapter for %s", genericReturnType);
                }
            }
            Annotation annotation2 = annotationArr2[i17];
            if (annotation2 instanceof Ba.b) {
                j.b("DELETE", ((Ba.b) annotation2).value(), false);
            } else if (annotation2 instanceof Ba.f) {
                j.b("GET", ((Ba.f) annotation2).value(), false);
            } else if (annotation2 instanceof Ba.g) {
                j.b("HEAD", ((Ba.g) annotation2).value(), false);
            } else if (annotation2 instanceof Ba.n) {
                j.b("PATCH", ((Ba.n) annotation2).value(), true);
            } else if (annotation2 instanceof Ba.o) {
                j.b("POST", ((Ba.o) annotation2).value(), true);
            } else if (annotation2 instanceof Ba.p) {
                j.b("PUT", ((Ba.p) annotation2).value(), true);
            } else if (annotation2 instanceof Ba.m) {
                j.b("OPTIONS", ((Ba.m) annotation2).value(), false);
            } else {
                if (annotation2 instanceof Ba.h) {
                    Ba.h hVar = (Ba.h) annotation2;
                    j.b(hVar.method(), hVar.path(), hVar.hasBody());
                } else if (annotation2 instanceof Ba.k) {
                    String[] strArrValue = ((Ba.k) annotation2).value();
                    if (strArrValue.length == 0) {
                        throw T.j(method2, null, "@Headers annotation is empty.", new Object[0]);
                    }
                    M1.c cVar2 = new M1.c(3);
                    int length4 = strArrValue.length;
                    int i29 = 0;
                    while (i29 < length4) {
                        String str5 = strArrValue[i29];
                        int iIndexOf = str5.indexOf(58);
                        if (iIndexOf != i14 && iIndexOf != 0) {
                            int i30 = i14;
                            if (iIndexOf != str5.length() - 1) {
                                String strSubstring = str5.substring(0, iIndexOf);
                                String strTrim = str5.substring(iIndexOf + 1).trim();
                                if ("Content-Type".equalsIgnoreCase(strSubstring)) {
                                    try {
                                        Pattern pattern = X9.A.f5431d;
                                        j.f16179t = p068ga.d.k(strTrim);
                                    } catch (IllegalArgumentException e13) {
                                        throw T.j(method2, e13, "Malformed content type: %s", strTrim);
                                    }
                                } else {
                                    cVar2.a(strSubstring, strTrim);
                                }
                                i29++;
                                i14 = i30;
                            }
                        }
                        throw T.j(method2, null, "@Headers value must be in the form \"Name: Value\". Found: \"%s\"", str5);
                    }
                    i13 = i14;
                    j.f16178s = cVar2.d();
                } else {
                    i13 = i14;
                    if (annotation2 instanceof Ba.l) {
                        if (j.f16175p) {
                            throw T.j(method2, null, "Only one encoding annotation is allowed.", new Object[0]);
                        }
                        j.f16176q = true;
                    } else if (!(annotation2 instanceof Ba.e)) {
                        continue;
                    } else {
                        if (j.f16176q) {
                            throw T.j(method2, null, "Only one encoding annotation is allowed.", new Object[0]);
                        }
                        j.f16175p = true;
                    }
                }
                i17++;
                i14 = i13;
            }
            i13 = i14;
            i17++;
            i14 = i13;
        }
    }
}
