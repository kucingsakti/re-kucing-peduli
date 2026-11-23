package p061g1;

import p050f1.q;
import p210v8.i;

/* JADX INFO: loaded from: classes.dex */
public abstract class l {
    public static final String a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String[] f11492b;

    static {
        String strC = q.c("WrkDbPathHelper");
        i.e(strC, "tagWithPrefix(\"WrkDbPathHelper\")");
        a = strC;
        f11492b = new String[]{"-journal", "-shm", "-wal"};
    }
}
