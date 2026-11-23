package s8;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final g f14737s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ g[] f14738t;

    /* JADX INFO: Fake field, exist only in values array */
    g EF2;

    static {
        g gVar = new g("TOP_DOWN", 0);
        g gVar2 = new g("BOTTOM_UP", 1);
        f14737s = gVar2;
        f14738t = new g[]{gVar, gVar2};
    }

    public static g valueOf(String str) {
        return (g) Enum.valueOf(g.class, str);
    }

    public static g[] values() {
        return (g[]) f14738t.clone();
    }
}
