package p096j9;

import java.util.LinkedHashMap;
import java.util.Set;
import p086i8.C;
import p086i8.m;
import p086i8.z;

/* JADX INFO: loaded from: classes.dex */
public final class i {
    public static final c a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final c f12559b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final c f12560c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final c f12561d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final c f12562e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final c f12563f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final c f12564g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final b f12565h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final b f12566i;
    public static final b j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final b f12567k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final b f12568l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final b f12569m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final b f12570n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final Set f12571o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final Set f12572p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final b f12573q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final b f12574r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final b f12575s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final b f12576t;

    static {
        c cVar = new c("kotlin");
        a = cVar;
        c cVarC = cVar.c(f.j("reflect"));
        f12559b = cVarC;
        c cVarC2 = cVar.c(f.j("collections"));
        f12560c = cVarC2;
        c cVarC3 = cVar.c(f.j("ranges"));
        f12561d = cVarC3;
        cVar.c(f.j("jvm")).c(f.j("internal"));
        c cVarC4 = cVar.c(f.j("annotation"));
        f12562e = cVarC4;
        c cVarC5 = cVar.c(f.j("internal"));
        cVarC5.c(f.j("ir"));
        c cVarC6 = cVar.c(f.j("coroutines"));
        f12563f = cVarC6;
        f12564g = cVar.c(f.j("enums"));
        C.x(cVar, cVarC2, cVarC3, cVarC4, cVarC, cVarC5, cVarC6);
        j.a("Nothing");
        j.a("Unit");
        j.a("Any");
        j.a("Enum");
        j.a("Annotation");
        f12565h = j.a("Array");
        b bVarA = j.a("Boolean");
        b bVarA2 = j.a("Char");
        b bVarA3 = j.a("Byte");
        b bVarA4 = j.a("Short");
        b bVarA5 = j.a("Int");
        b bVarA6 = j.a("Long");
        b bVarA7 = j.a("Float");
        b bVarA8 = j.a("Double");
        f12566i = j.f(bVarA3);
        j = j.f(bVarA4);
        f12567k = j.f(bVarA5);
        f12568l = j.f(bVarA6);
        j.a("CharSequence");
        f12569m = j.a("String");
        j.a("Throwable");
        j.a("Cloneable");
        j.e("KProperty");
        j.e("KMutableProperty");
        j.e("KProperty0");
        j.e("KMutableProperty0");
        j.e("KProperty1");
        j.e("KMutableProperty1");
        j.e("KProperty2");
        j.e("KMutableProperty2");
        f12570n = j.e("KFunction");
        j.e("KClass");
        j.e("KCallable");
        j.a("Comparable");
        j.a("Number");
        j.a("Function");
        Set setK = p086i8.i.K(new b[]{bVarA, bVarA2, bVarA3, bVarA4, bVarA5, bVarA6, bVarA7, bVarA8});
        f12571o = setK;
        int iS = z.s(m.H(setK, 10));
        if (iS < 16) {
            iS = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iS);
        for (Object obj : setK) {
            f fVarI = ((b) obj).i();
            p210v8.i.e(fVarI, "id.shortClassName");
            linkedHashMap.put(obj, j.d(fVarI));
        }
        j.c(linkedHashMap);
        Set setK2 = p086i8.i.K(new b[]{f12566i, j, f12567k, f12568l});
        f12572p = setK2;
        int iS2 = z.s(m.H(setK2, 10));
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(iS2 >= 16 ? iS2 : 16);
        for (Object obj2 : setK2) {
            f fVarI2 = ((b) obj2).i();
            p210v8.i.e(fVarI2, "id.shortClassName");
            linkedHashMap2.put(obj2, j.d(fVarI2));
        }
        j.c(linkedHashMap2);
        C.v(C.u(f12571o, f12572p), f12569m);
        c cVar2 = f12563f;
        f fVarJ = f.j("Continuation");
        if (cVar2 == null) {
            b.a(3);
            throw null;
        }
        c.j(fVarJ);
        j.b("Iterator");
        j.b("Iterable");
        j.b("Collection");
        j.b("List");
        j.b("ListIterator");
        j.b("Set");
        b bVarB = j.b("Map");
        j.b("MutableIterator");
        j.b("CharIterator");
        j.b("MutableIterable");
        j.b("MutableCollection");
        f12573q = j.b("MutableList");
        j.b("MutableListIterator");
        f12574r = j.b("MutableSet");
        b bVarB2 = j.b("MutableMap");
        f12575s = bVarB2;
        bVarB.d(f.j("Entry"));
        bVarB2.d(f.j("MutableEntry"));
        j.a("Result");
        c cVar3 = f12561d;
        f fVarJ2 = f.j("IntRange");
        if (cVar3 == null) {
            b.a(3);
            throw null;
        }
        c.j(fVarJ2);
        c.j(f.j("LongRange"));
        c.j(f.j("CharRange"));
        c cVar4 = f12562e;
        f fVarJ3 = f.j("AnnotationRetention");
        if (cVar4 == null) {
            b.a(3);
            throw null;
        }
        c.j(fVarJ3);
        c.j(f.j("AnnotationTarget"));
        f12576t = new b(f12564g, f.j("EnumEntries"));
    }
}
