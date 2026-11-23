package p232y1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final i f16019s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ i[] f16020t;

    /* JADX INFO: Fake field, exist only in values array */
    i EF2;

    static {
        i iVar = new i("SRGB", 0);
        i iVar2 = new i("DISPLAY_P3", 1);
        f16019s = iVar2;
        f16020t = new i[]{iVar, iVar2};
    }

    public static i valueOf(String str) {
        return (i) Enum.valueOf(i.class, str);
    }

    public static i[] values() {
        return (i[]) f16020t.clone();
    }
}
