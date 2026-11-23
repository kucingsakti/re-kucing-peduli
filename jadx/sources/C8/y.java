package C8;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class y {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final y f964s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final y f965t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final y f966u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ y[] f967v;

    static {
        y yVar = new y("INVARIANT", 0);
        f964s = yVar;
        y yVar2 = new y("IN", 1);
        f965t = yVar2;
        y yVar3 = new y("OUT", 2);
        f966u = yVar3;
        f967v = new y[]{yVar, yVar2, yVar3};
    }

    public static y valueOf(String str) {
        return (y) Enum.valueOf(y.class, str);
    }

    public static y[] values() {
        return (y[]) f967v.clone();
    }
}
