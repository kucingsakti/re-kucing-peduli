package p114l9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class o {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final o f13054s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final o f13055t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final o f13056u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ o[] f13057v;

    static {
        o oVar = new o("ALL", 0);
        f13054s = oVar;
        o oVar2 = new o("ONLY_NON_SYNTHESIZED", 1);
        f13055t = oVar2;
        o oVar3 = new o("NONE", 2);
        f13056u = oVar3;
        f13057v = new o[]{oVar, oVar2, oVar3};
    }

    public static o valueOf(String str) {
        return (o) Enum.valueOf(o.class, str);
    }

    public static o[] values() {
        return (o[]) f13057v.clone();
    }
}
