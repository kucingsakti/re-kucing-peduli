package p247z9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class k {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final k f16330s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final k f16331t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final k f16332u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ k[] f16333v;

    static {
        k kVar = new k("NOT_COMPUTED", 0);
        f16330s = kVar;
        k kVar2 = new k("COMPUTING", 1);
        f16331t = kVar2;
        k kVar3 = new k("RECURSION_WAS_DETECTED", 2);
        f16332u = kVar3;
        f16333v = new k[]{kVar, kVar2, kVar3};
    }

    public static k valueOf(String str) {
        return (k) Enum.valueOf(k.class, str);
    }

    public static k[] values() {
        return (k[]) f16333v.clone();
    }
}
