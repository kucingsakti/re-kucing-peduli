package p114l9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public abstract class s {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final r f13061s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final q f13062t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ s[] f13063u;

    static {
        r rVar = new r();
        f13061s = rVar;
        q qVar = new q();
        f13062t = qVar;
        f13063u = new s[]{rVar, qVar};
    }

    public static s valueOf(String str) {
        return (s) Enum.valueOf(s.class, str);
    }

    public static s[] values() {
        return (s[]) f13063u.clone();
    }

    public abstract String f(String str);
}
