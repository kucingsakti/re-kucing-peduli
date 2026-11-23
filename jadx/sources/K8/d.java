package K8;

import androidx.datastore.preferences.protobuf.AbstractC0487g;
import java.lang.annotation.Annotation;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class d {
    public static final String a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f2626b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f2627c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f2628d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final p096j9.b f2629e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final p096j9.c f2630f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final p096j9.b f2631g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final HashMap f2632h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final HashMap f2633i;
    public static final HashMap j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final HashMap f2634k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final HashMap f2635l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final HashMap f2636m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final List f2637n;

    static {
        StringBuilder sb = new StringBuilder();
        J8.e eVar = J8.e.f2454v;
        sb.append(eVar.f2459s.a.toString());
        sb.append('.');
        sb.append(eVar.f2460t);
        a = sb.toString();
        StringBuilder sb2 = new StringBuilder();
        J8.e eVar2 = J8.e.f2456x;
        sb2.append(eVar2.f2459s.a.toString());
        sb2.append('.');
        sb2.append(eVar2.f2460t);
        f2626b = sb2.toString();
        StringBuilder sb3 = new StringBuilder();
        J8.e eVar3 = J8.e.f2455w;
        sb3.append(eVar3.f2459s.a.toString());
        sb3.append('.');
        sb3.append(eVar3.f2460t);
        f2627c = sb3.toString();
        StringBuilder sb4 = new StringBuilder();
        J8.e eVar4 = J8.e.f2457y;
        sb4.append(eVar4.f2459s.a.toString());
        sb4.append('.');
        sb4.append(eVar4.f2460t);
        f2628d = sb4.toString();
        p096j9.b bVarJ = p096j9.b.j(new p096j9.c("kotlin.jvm.functions.FunctionN"));
        f2629e = bVarJ;
        f2630f = bVarJ.b();
        f2631g = p096j9.i.f12570n;
        d(Class.class);
        f2632h = new HashMap();
        f2633i = new HashMap();
        j = new HashMap();
        f2634k = new HashMap();
        f2635l = new HashMap();
        f2636m = new HashMap();
        p096j9.b bVarJ2 = p096j9.b.j(I8.n.f2138A);
        p096j9.c cVar = I8.n.f2146I;
        p096j9.c cVarG = bVarJ2.g();
        p096j9.c cVarG2 = bVarJ2.g();
        p210v8.i.e(cVarG2, "kotlinReadOnly.packageFqName");
        c cVar2 = new c(d(Iterable.class), bVarJ2, new p096j9.b(cVarG, oa.b.p(cVar, cVarG2), false));
        p096j9.b bVarJ3 = p096j9.b.j(I8.n.f2188z);
        p096j9.c cVar3 = I8.n.f2145H;
        p096j9.c cVarG3 = bVarJ3.g();
        p096j9.c cVarG4 = bVarJ3.g();
        p210v8.i.e(cVarG4, "kotlinReadOnly.packageFqName");
        c cVar4 = new c(d(Iterator.class), bVarJ3, new p096j9.b(cVarG3, oa.b.p(cVar3, cVarG4), false));
        p096j9.b bVarJ4 = p096j9.b.j(I8.n.f2139B);
        p096j9.c cVar5 = I8.n.f2147J;
        p096j9.c cVarG5 = bVarJ4.g();
        p096j9.c cVarG6 = bVarJ4.g();
        p210v8.i.e(cVarG6, "kotlinReadOnly.packageFqName");
        c cVar6 = new c(d(Collection.class), bVarJ4, new p096j9.b(cVarG5, oa.b.p(cVar5, cVarG6), false));
        p096j9.b bVarJ5 = p096j9.b.j(I8.n.f2140C);
        p096j9.c cVar7 = I8.n.f2148K;
        p096j9.c cVarG7 = bVarJ5.g();
        p096j9.c cVarG8 = bVarJ5.g();
        p210v8.i.e(cVarG8, "kotlinReadOnly.packageFqName");
        c cVar8 = new c(d(List.class), bVarJ5, new p096j9.b(cVarG7, oa.b.p(cVar7, cVarG8), false));
        p096j9.b bVarJ6 = p096j9.b.j(I8.n.f2142E);
        p096j9.c cVar9 = I8.n.f2150M;
        p096j9.c cVarG9 = bVarJ6.g();
        p096j9.c cVarG10 = bVarJ6.g();
        p210v8.i.e(cVarG10, "kotlinReadOnly.packageFqName");
        c cVar10 = new c(d(Set.class), bVarJ6, new p096j9.b(cVarG9, oa.b.p(cVar9, cVarG10), false));
        p096j9.b bVarJ7 = p096j9.b.j(I8.n.f2141D);
        p096j9.c cVar11 = I8.n.f2149L;
        p096j9.c cVarG11 = bVarJ7.g();
        p096j9.c cVarG12 = bVarJ7.g();
        p210v8.i.e(cVarG12, "kotlinReadOnly.packageFqName");
        c cVar12 = new c(d(ListIterator.class), bVarJ7, new p096j9.b(cVarG11, oa.b.p(cVar11, cVarG12), false));
        p096j9.c cVar13 = I8.n.f2143F;
        p096j9.b bVarJ8 = p096j9.b.j(cVar13);
        p096j9.c cVar14 = I8.n.f2151N;
        p096j9.c cVarG13 = bVarJ8.g();
        p096j9.c cVarG14 = bVarJ8.g();
        p210v8.i.e(cVarG14, "kotlinReadOnly.packageFqName");
        c cVar15 = new c(d(Map.class), bVarJ8, new p096j9.b(cVarG13, oa.b.p(cVar14, cVarG14), false));
        p096j9.b bVarD = p096j9.b.j(cVar13).d(I8.n.f2144G.f());
        p096j9.c cVar16 = I8.n.f2152O;
        p096j9.c cVarG15 = bVarD.g();
        p096j9.c cVarG16 = bVarD.g();
        p210v8.i.e(cVarG16, "kotlinReadOnly.packageFqName");
        List<c> listC = p086i8.l.C(cVar2, cVar4, cVar6, cVar8, cVar10, cVar12, cVar15, new c(d(Map.Entry.class), bVarD, new p096j9.b(cVarG15, oa.b.p(cVar16, cVarG16), false)));
        f2637n = listC;
        c(Object.class, I8.n.a);
        c(String.class, I8.n.f2169f);
        c(CharSequence.class, I8.n.f2168e);
        a(d(Throwable.class), p096j9.b.j(I8.n.f2173k));
        c(Cloneable.class, I8.n.f2166c);
        c(Number.class, I8.n.f2172i);
        a(d(Comparable.class), p096j9.b.j(I8.n.f2174l));
        c(Enum.class, I8.n.j);
        a(d(Annotation.class), p096j9.b.j(I8.n.f2181s));
        for (c cVar17 : listC) {
            p096j9.b bVar = cVar17.a;
            p096j9.b bVar2 = cVar17.f2624b;
            a(bVar, bVar2);
            p096j9.b bVar3 = cVar17.f2625c;
            b(bVar3.b(), bVar);
            f2635l.put(bVar3, bVar2);
            f2636m.put(bVar2, bVar3);
            p096j9.c cVarB = bVar2.b();
            p096j9.c cVarB2 = bVar3.b();
            p096j9.e eVarI = bVar3.b().i();
            p210v8.i.e(eVarI, "mutableClassId.asSingleFqName().toUnsafe()");
            j.put(eVarI, cVarB);
            p096j9.e eVarI2 = cVarB.i();
            p210v8.i.e(eVarI2, "readOnlyFqName.toUnsafe()");
            f2634k.put(eVarI2, cVarB2);
        }
        for (p176r9.c cVar18 : p176r9.c.values()) {
            p096j9.b bVarJ9 = p096j9.b.j(cVar18.j());
            I8.k kVarI = cVar18.i();
            p210v8.i.e(kVarI, "jvmType.primitiveType");
            a(bVarJ9, p096j9.b.j(I8.o.f2197k.c(kVarI.f2128s)));
        }
        for (p096j9.b bVar4 : I8.d.a) {
            a(p096j9.b.j(new p096j9.c("kotlin.jvm.internal." + bVar4.i().g() + "CompanionObject")), bVar4.d(p096j9.h.f12553b));
        }
        for (int i10 = 0; i10 < 23; i10++) {
            a(p096j9.b.j(new p096j9.c(AbstractC0487g.g(i10, "kotlin.jvm.functions.Function"))), new p096j9.b(I8.o.f2197k, p096j9.f.j("Function" + i10)));
            b(new p096j9.c(f2626b + i10), f2631g);
        }
        for (int i11 = 0; i11 < 22; i11++) {
            J8.e eVar5 = J8.e.f2457y;
            b(new p096j9.c((eVar5.f2459s.a.toString() + '.' + eVar5.f2460t) + i11), f2631g);
        }
        p096j9.c cVarG17 = I8.n.f2164b.g();
        p210v8.i.e(cVarG17, "nothing.toSafe()");
        b(cVarG17, d(Void.class));
    }

    public static void a(p096j9.b bVar, p096j9.b bVar2) {
        p096j9.e eVarI = bVar.b().i();
        p210v8.i.e(eVarI, "javaClassId.asSingleFqName().toUnsafe()");
        f2632h.put(eVarI, bVar2);
        b(bVar2.b(), bVar);
    }

    public static void b(p096j9.c cVar, p096j9.b bVar) {
        p096j9.e eVarI = cVar.i();
        p210v8.i.e(eVarI, "kotlinFqNameUnsafe.toUnsafe()");
        f2633i.put(eVarI, bVar);
    }

    public static void c(Class cls, p096j9.e eVar) {
        p096j9.c cVarG = eVar.g();
        p210v8.i.e(cVarG, "kotlinFqName.toSafe()");
        a(d(cls), p096j9.b.j(cVarG));
    }

    public static p096j9.b d(Class cls) {
        if (!cls.isPrimitive()) {
            cls.isArray();
        }
        Class<?> declaringClass = cls.getDeclaringClass();
        return declaringClass == null ? p096j9.b.j(new p096j9.c(cls.getCanonicalName())) : d(declaringClass).d(p096j9.f.j(cls.getSimpleName()));
    }

    public static boolean e(p096j9.e eVar, String str) {
        Integer numZ;
        String str2 = eVar.a;
        if (str2 != null) {
            String strD0 = L9.f.d0(str2, str, "");
            return strD0.length() > 0 && (strD0.length() <= 0 || !D3.b.h(strD0.charAt(0), '0', false)) && (numZ = L9.m.z(strD0)) != null && numZ.intValue() >= 23;
        }
        p096j9.e.a(4);
        throw null;
    }

    public static p096j9.b f(p096j9.e eVar) {
        if (e(eVar, a) || e(eVar, f2627c)) {
            return f2629e;
        }
        return (e(eVar, f2626b) || e(eVar, f2628d)) ? f2631g : (p096j9.b) f2633i.get(eVar);
    }
}
