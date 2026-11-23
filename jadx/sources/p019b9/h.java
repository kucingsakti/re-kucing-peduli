package p019b9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final h f7333s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final h f7334t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final h f7335u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ h[] f7336v;

    static {
        h hVar = new h("FORCE_FLEXIBILITY", 0);
        f7333s = hVar;
        h hVar2 = new h("NULLABLE", 1);
        f7334t = hVar2;
        h hVar3 = new h("NOT_NULL", 2);
        f7335u = hVar3;
        f7336v = new h[]{hVar, hVar2, hVar3};
    }

    public static h valueOf(String str) {
        return (h) Enum.valueOf(h.class, str);
    }

    public static h[] values() {
        return (h[]) f7336v.clone();
    }
}
