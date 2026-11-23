package p076h8;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final e f11786s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final e f11787t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ e[] f11788u;

    /* JADX INFO: Fake field, exist only in values array */
    e EF3;

    static {
        e eVar = new e("SYNCHRONIZED", 0);
        e eVar2 = new e("PUBLICATION", 1);
        f11786s = eVar2;
        e eVar3 = new e("NONE", 2);
        f11787t = eVar3;
        f11788u = new e[]{eVar, eVar2, eVar3};
    }

    public static e valueOf(String str) {
        return (e) Enum.valueOf(e.class, str);
    }

    public static e[] values() {
        return (e[]) f11788u.clone();
    }
}
