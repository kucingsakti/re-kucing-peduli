package W6;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final c f5350s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final c f5351t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final c f5352u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ c[] f5353v;

    static {
        c cVar = new c("On", 0);
        f5350s = cVar;
        c cVar2 = new c("Off", 1);
        f5351t = cVar2;
        c cVar3 = new c("Auto", 2);
        f5352u = cVar3;
        f5353v = new c[]{cVar, cVar2, cVar3};
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) f5353v.clone();
    }
}
