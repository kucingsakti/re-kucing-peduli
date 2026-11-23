package h2;

import android.util.SparseArray;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class z {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final z f11725s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ z[] f11726t;

    /* JADX INFO: Fake field, exist only in values array */
    z EF2;

    static {
        z zVar = new z("NOT_SET", 0);
        z zVar2 = new z("EVENT_OVERRIDE", 1);
        f11725s = zVar2;
        f11726t = new z[]{zVar, zVar2};
        SparseArray sparseArray = new SparseArray();
        sparseArray.put(0, zVar);
        sparseArray.put(5, zVar2);
    }

    public static z valueOf(String str) {
        return (z) Enum.valueOf(z.class, str);
    }

    public static z[] values() {
        return (z[]) f11726t.clone();
    }
}
