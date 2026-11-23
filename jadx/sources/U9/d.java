package U9;

/* JADX INFO: loaded from: classes.dex */
public final class d extends g {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final d f5046u;

    static {
        int i10 = j.f5052c;
        int i11 = j.f5053d;
        long j = j.f5054e;
        String str = j.a;
        d dVar = new d();
        dVar.f5047t = new b(i10, i11, j, str);
        f5046u = dVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new UnsupportedOperationException("Dispatchers.Default cannot be closed");
    }

    @Override // N9.AbstractC0337u
    public final String toString() {
        return "Dispatchers.Default";
    }
}
