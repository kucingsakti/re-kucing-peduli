package W6;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final b f5347s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final b f5348t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ b[] f5349u;

    static {
        b bVar = new b("HORIZONTAL", 0);
        f5347s = bVar;
        b bVar2 = new b("VERTICAL", 1);
        f5348t = bVar2;
        f5349u = new b[]{bVar, bVar2};
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) f5349u.clone();
    }
}
