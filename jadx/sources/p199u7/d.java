package p199u7;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final d f15353s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final d f15354t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final d f15355u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ d[] f15356v;

    static {
        d dVar = new d("INTERSTITIAL", 0);
        f15353s = dVar;
        d dVar2 = new d("REWARDED", 1);
        f15354t = dVar2;
        d dVar3 = new d("BANNER", 2);
        f15355u = dVar3;
        f15356v = new d[]{dVar, dVar2, dVar3};
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) f15356v.clone();
    }
}
