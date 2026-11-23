package p188t1;

import p086i8.C;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class r {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final r f15077s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final r f15078t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ r[] f15079u;

    static {
        r rVar = new r(C.a(C.c("2F49")), 0);
        f15077s = rVar;
        r rVar2 = new r(C.a(C.c("2E4D9F")), 1);
        f15078t = rVar2;
        f15079u = new r[]{rVar, rVar2};
    }

    public static r valueOf(String str) {
        return (r) Enum.valueOf(r.class, str);
    }

    public static r[] values() {
        return (r[]) f15079u.clone();
    }
}
