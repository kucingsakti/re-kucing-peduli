package p051f2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final d f11424s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final d f11425t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final d f11426u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ d[] f11427v;

    static {
        d dVar = new d("DEFAULT", 0);
        f11424s = dVar;
        d dVar2 = new d("VERY_LOW", 1);
        f11425t = dVar2;
        d dVar3 = new d("HIGHEST", 2);
        f11426u = dVar3;
        f11427v = new d[]{dVar, dVar2, dVar3};
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) f11427v.clone();
    }
}
