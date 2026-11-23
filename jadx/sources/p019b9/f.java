package p019b9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final f f7329s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final f f7330t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ f[] f7331u;

    static {
        f fVar = new f("READ_ONLY", 0);
        f7329s = fVar;
        f fVar2 = new f("MUTABLE", 1);
        f7330t = fVar2;
        f7331u = new f[]{fVar, fVar2};
    }

    public static f valueOf(String str) {
        return (f) Enum.valueOf(f.class, str);
    }

    public static f[] values() {
        return (f[]) f7331u.clone();
    }
}
