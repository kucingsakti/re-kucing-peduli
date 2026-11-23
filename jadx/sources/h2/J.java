package h2;

import android.util.SparseArray;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class J {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final J f11659s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ J[] f11660t;

    static {
        J j = new J("DEFAULT", 0);
        f11659s = j;
        J j10 = new J("UNMETERED_ONLY", 1);
        J j11 = new J("UNMETERED_OR_DAILY", 2);
        J j12 = new J("FAST_IF_RADIO_AWAKE", 3);
        J j13 = new J("NEVER", 4);
        J j14 = new J("UNRECOGNIZED", 5);
        f11660t = new J[]{j, j10, j11, j12, j13, j14};
        SparseArray sparseArray = new SparseArray();
        sparseArray.put(0, j);
        sparseArray.put(1, j10);
        sparseArray.put(2, j11);
        sparseArray.put(3, j12);
        sparseArray.put(4, j13);
        sparseArray.put(-1, j14);
    }

    public static J valueOf(String str) {
        return (J) Enum.valueOf(J.class, str);
    }

    public static J[] values() {
        return (J[]) f11660t.clone();
    }
}
