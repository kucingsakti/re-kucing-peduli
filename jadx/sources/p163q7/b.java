package p163q7;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final b f14419s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final b f14420t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ b[] f14421u;

    static {
        b bVar = new b("SEQUENTIAL", 0);
        f14419s = bVar;
        b bVar2 = new b("PARALLEL", 1);
        f14420t = bVar2;
        f14421u = new b[]{bVar, bVar2};
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) f14421u.clone();
    }
}
