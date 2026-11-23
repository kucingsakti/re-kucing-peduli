package androidx.lifecycle;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: androidx.lifecycle.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC0519n {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final EnumC0519n f6755s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final EnumC0519n f6756t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final EnumC0519n f6757u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final EnumC0519n f6758v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final EnumC0519n f6759w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ EnumC0519n[] f6760x;

    static {
        EnumC0519n enumC0519n = new EnumC0519n("DESTROYED", 0);
        f6755s = enumC0519n;
        EnumC0519n enumC0519n2 = new EnumC0519n("INITIALIZED", 1);
        f6756t = enumC0519n2;
        EnumC0519n enumC0519n3 = new EnumC0519n("CREATED", 2);
        f6757u = enumC0519n3;
        EnumC0519n enumC0519n4 = new EnumC0519n("STARTED", 3);
        f6758v = enumC0519n4;
        EnumC0519n enumC0519n5 = new EnumC0519n("RESUMED", 4);
        f6759w = enumC0519n5;
        f6760x = new EnumC0519n[]{enumC0519n, enumC0519n2, enumC0519n3, enumC0519n4, enumC0519n5};
    }

    public static EnumC0519n valueOf(String str) {
        return (EnumC0519n) Enum.valueOf(EnumC0519n.class, str);
    }

    public static EnumC0519n[] values() {
        return (EnumC0519n[]) f6760x.clone();
    }
}
