package p191t4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final d f15222s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final d f15223t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ d[] f15224u;

    static {
        d dVar = new d("CRASHLYTICS", 0);
        f15222s = dVar;
        d dVar2 = new d("PERFORMANCE", 1);
        f15223t = dVar2;
        f15224u = new d[]{dVar, dVar2, new d("MATT_SAYS_HI", 2)};
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) f15224u.clone();
    }
}
