package ma;

/* JADX INFO: loaded from: classes.dex */
public abstract class j implements v {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final v f13195s;

    public j(v vVar) {
        p210v8.i.f(vVar, "delegate");
        this.f13195s = vVar;
    }

    @Override // ma.v
    public void C(f fVar, long j) {
        p210v8.i.f(fVar, "source");
        this.f13195s.C(fVar, j);
    }

    @Override // ma.v, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f13195s.close();
    }

    @Override // ma.v
    public final y e() {
        return this.f13195s.e();
    }

    @Override // ma.v, java.io.Flushable
    public void flush() {
        this.f13195s.flush();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append((Object) getClass().getSimpleName());
        sb.append('(');
        sb.append(this.f13195s);
        sb.append(')');
        return sb.toString();
    }
}
