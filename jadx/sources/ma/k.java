package ma;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public abstract class k implements w {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final w f13196s;

    public k(w wVar) {
        p210v8.i.f(wVar, "delegate");
        this.f13196s = wVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f13196s.close();
    }

    @Override // ma.w
    public final y e() {
        return this.f13196s.e();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append((Object) getClass().getSimpleName());
        sb.append('(');
        sb.append(this.f13196s);
        sb.append(')');
        return sb.toString();
    }

    @Override // ma.w
    public long u(f fVar, long j) {
        p210v8.i.f(fVar, "sink");
        return this.f13196s.u(fVar, 8192L);
    }
}
