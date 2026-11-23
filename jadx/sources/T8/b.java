package T8;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static final /* synthetic */ b[] f4758A;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final b f4759s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final b f4760t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final b f4761u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final b f4762v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final b f4763w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final b f4764x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final b f4765y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final b f4766z;

    /* JADX INFO: Fake field, exist only in values array */
    b EF6;

    static {
        b bVar = new b("FROM_IDE", 0);
        b bVar2 = new b("FROM_BACKEND", 1);
        b bVar3 = new b("FROM_TEST", 2);
        b bVar4 = new b("FROM_BUILTINS", 3);
        f4759s = bVar4;
        b bVar5 = new b("WHEN_CHECK_DECLARATION_CONFLICTS", 4);
        b bVar6 = new b("WHEN_CHECK_OVERRIDES", 5);
        b bVar7 = new b("FOR_SCRIPT", 6);
        b bVar8 = new b("FROM_REFLECTION", 7);
        f4760t = bVar8;
        b bVar9 = new b("WHEN_RESOLVE_DECLARATION", 8);
        b bVar10 = new b("WHEN_GET_DECLARATION_SCOPE", 9);
        b bVar11 = new b("WHEN_RESOLVING_DEFAULT_TYPE_ARGUMENTS", 10);
        b bVar12 = new b("FOR_ALREADY_TRACKED", 11);
        f4761u = bVar12;
        b bVar13 = new b("WHEN_GET_ALL_DESCRIPTORS", 12);
        f4762v = bVar13;
        b bVar14 = new b("WHEN_TYPING", 13);
        b bVar15 = new b("WHEN_GET_SUPER_MEMBERS", 14);
        f4763w = bVar15;
        b bVar16 = new b("FOR_NON_TRACKED_SCOPE", 15);
        f4764x = bVar16;
        b bVar17 = new b("FROM_SYNTHETIC_SCOPE", 16);
        b bVar18 = new b("FROM_DESERIALIZATION", 17);
        f4765y = bVar18;
        b bVar19 = new b("FROM_JAVA_LOADER", 18);
        f4766z = bVar19;
        f4758A = new b[]{bVar, bVar2, bVar3, bVar4, bVar5, bVar6, bVar7, bVar8, bVar9, bVar10, bVar11, bVar12, bVar13, bVar14, bVar15, bVar16, bVar17, bVar18, bVar19, new b("WHEN_GET_LOCAL_VARIABLE", 19), new b("WHEN_FIND_BY_FQNAME", 20), new b("WHEN_GET_COMPANION_OBJECT", 21), new b("FOR_DEFAULT_IMPORTS", 22)};
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) f4758A.clone();
    }
}
