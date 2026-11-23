package p086i8;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class D {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final D f12308s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final D f12309t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final D f12310u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final D f12311v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ D[] f12312w;

    static {
        D d3 = new D("Ready", 0);
        f12308s = d3;
        D d8 = new D("NotReady", 1);
        f12309t = d8;
        D d10 = new D("Done", 2);
        f12310u = d10;
        D d11 = new D("Failed", 3);
        f12311v = d11;
        f12312w = new D[]{d3, d8, d10, d11};
    }

    public static D valueOf(String str) {
        return (D) Enum.valueOf(D.class, str);
    }

    public static D[] values() {
        return (D[]) f12312w.clone();
    }
}
