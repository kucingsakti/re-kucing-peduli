package P9;

/* JADX INFO: loaded from: classes.dex */
public abstract class h {
    public static final g a = new g();

    public static a a(int i10) {
        if (i10 == -2) {
            e.a.getClass();
            return new a(d.f3928b);
        }
        if (i10 == -1) {
            return new j(1, 2);
        }
        if (i10 != 0) {
            return i10 != Integer.MAX_VALUE ? new a(i10) : new a(Integer.MAX_VALUE);
        }
        return new a(0);
    }
}
