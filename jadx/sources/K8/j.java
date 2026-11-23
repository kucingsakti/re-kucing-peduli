package K8;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final j f2650s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final j f2651t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final j f2652u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final j f2653v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ j[] f2654w;

    static {
        j jVar = new j("HIDDEN", 0);
        f2650s = jVar;
        j jVar2 = new j("VISIBLE", 1);
        f2651t = jVar2;
        j jVar3 = new j("NOT_CONSIDERED", 2);
        f2652u = jVar3;
        j jVar4 = new j("DROP", 3);
        f2653v = jVar4;
        f2654w = new j[]{jVar, jVar2, jVar3, jVar4};
    }

    public static j valueOf(String str) {
        return (j) Enum.valueOf(j.class, str);
    }

    public static j[] values() {
        return (j[]) f2654w.clone();
    }
}
