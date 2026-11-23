package p167r0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final a f14458s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final a f14459t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final a f14460u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final a f14461v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final a f14462w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final a f14463x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final a f14464y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final /* synthetic */ a[] f14465z;

    /* JADX INFO: Fake field, exist only in values array */
    a EF9;

    static {
        a aVar = new a("PENALTY_LOG", 0);
        a aVar2 = new a("PENALTY_DEATH", 1);
        a aVar3 = new a("DETECT_FRAGMENT_REUSE", 2);
        f14458s = aVar3;
        a aVar4 = new a("DETECT_FRAGMENT_TAG_USAGE", 3);
        f14459t = aVar4;
        a aVar5 = new a("DETECT_WRONG_NESTED_HIERARCHY", 4);
        f14460u = aVar5;
        a aVar6 = new a("DETECT_RETAIN_INSTANCE_USAGE", 5);
        f14461v = aVar6;
        a aVar7 = new a("DETECT_SET_USER_VISIBLE_HINT", 6);
        f14462w = aVar7;
        a aVar8 = new a("DETECT_TARGET_FRAGMENT_USAGE", 7);
        f14463x = aVar8;
        a aVar9 = new a("DETECT_WRONG_FRAGMENT_CONTAINER", 8);
        f14464y = aVar9;
        f14465z = new a[]{aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7, aVar8, aVar9};
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f14465z.clone();
    }
}
