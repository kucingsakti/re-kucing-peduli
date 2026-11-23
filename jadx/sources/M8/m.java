package M8;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class m {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final m f3208s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final m f3209t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final m f3210u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ m[] f3211v;

    static {
        m mVar = new m("RUNTIME", 0);
        f3208s = mVar;
        m mVar2 = new m("BINARY", 1);
        f3209t = mVar2;
        m mVar3 = new m("SOURCE", 2);
        f3210u = mVar3;
        f3211v = new m[]{mVar, mVar2, mVar3};
    }

    public static m valueOf(String str) {
        return (m) Enum.valueOf(m.class, str);
    }

    public static m[] values() {
        return (m[]) f3211v.clone();
    }
}
