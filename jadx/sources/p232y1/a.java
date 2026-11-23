package p232y1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final a f16010s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final a f16011t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final a f16012u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ a[] f16013v;

    static {
        a aVar = new a("PREFER_ARGB_8888", 0);
        f16010s = aVar;
        a aVar2 = new a("PREFER_RGB_565", 1);
        f16011t = aVar2;
        f16013v = new a[]{aVar, aVar2};
        f16012u = aVar;
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f16013v.clone();
    }
}
