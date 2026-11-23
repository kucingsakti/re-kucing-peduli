package C8;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class k {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final k f958s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final k f959t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final k f960u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ k[] f961v;

    static {
        k kVar = new k("INSTANCE", 0);
        f958s = kVar;
        k kVar2 = new k("EXTENSION_RECEIVER", 1);
        f959t = kVar2;
        k kVar3 = new k("VALUE", 2);
        f960u = kVar3;
        f961v = new k[]{kVar, kVar2, kVar3};
    }

    public static k valueOf(String str) {
        return (k) Enum.valueOf(k.class, str);
    }

    public static k[] values() {
        return (k[]) f961v.clone();
    }
}
