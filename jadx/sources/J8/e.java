package J8;

import I8.o;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'x' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final K3.d f2453u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final e f2454v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final e f2455w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final e f2456x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final e f2457y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final /* synthetic */ e[] f2458z;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final p096j9.c f2459s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final String f2460t;

    static {
        e eVar = new e("Function", 0, o.f2197k, "Function");
        f2454v = eVar;
        e eVar2 = new e("SuspendFunction", 1, o.f2192e, "SuspendFunction");
        f2455w = eVar2;
        p096j9.c cVar = o.f2195h;
        e eVar3 = new e("KFunction", 2, cVar, "KFunction");
        f2456x = eVar3;
        e eVar4 = new e("KSuspendFunction", 3, cVar, "KSuspendFunction");
        f2457y = eVar4;
        f2458z = new e[]{eVar, eVar2, eVar3, eVar4};
        f2453u = new K3.d(7);
    }

    public e(String str, int i10, p096j9.c cVar, String str2) {
        super(str, i10);
        this.f2459s = cVar;
        this.f2460t = str2;
    }

    public static e valueOf(String str) {
        return (e) Enum.valueOf(e.class, str);
    }

    public static e[] values() {
        return (e[]) f2458z.clone();
    }

    public final p096j9.f f(int i10) {
        return p096j9.f.j(this.f2460t + i10);
    }
}
