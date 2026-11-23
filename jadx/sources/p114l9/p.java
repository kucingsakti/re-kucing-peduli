package p114l9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class p {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final p f13058s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final p f13059t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ p[] f13060u;

    /* JADX INFO: Fake field, exist only in values array */
    p EF3;

    static {
        p pVar = new p("PRETTY", 0);
        p pVar2 = new p("DEBUG", 1);
        f13058s = pVar2;
        p pVar3 = new p("NONE", 2);
        f13059t = pVar3;
        f13060u = new p[]{pVar, pVar2, pVar3};
    }

    public static p valueOf(String str) {
        return (p) Enum.valueOf(p.class, str);
    }

    public static p[] values() {
        return (p[]) f13060u.clone();
    }
}
