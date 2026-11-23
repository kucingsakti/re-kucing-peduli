package p138o2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final d f13682s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final d f13683t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final d f13684u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ d[] f13685v;

    static {
        d dVar = new d("NETWORK_UNMETERED", 0);
        f13682s = dVar;
        d dVar2 = new d("DEVICE_IDLE", 1);
        f13683t = dVar2;
        d dVar3 = new d("DEVICE_CHARGING", 2);
        f13684u = dVar3;
        f13685v = new d[]{dVar, dVar2, dVar3};
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) f13685v.clone();
    }
}
