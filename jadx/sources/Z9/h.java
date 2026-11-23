package Z9;

import java.io.EOFException;
import java.io.IOException;
import ma.j;
import p210v8.i;
import p210v8.k;

/* JADX INFO: loaded from: classes.dex */
public final class h extends j {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final k f5962t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f5963u;

    /* JADX WARN: Multi-variable type inference failed */
    public h(ma.a aVar, p200u8.b bVar) {
        super(aVar);
        this.f5962t = (k) bVar;
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [u8.b, v8.k] */
    @Override // ma.j, ma.v
    public final void C(ma.f fVar, long j) throws EOFException {
        i.f(fVar, "source");
        if (this.f5963u) {
            fVar.X(j);
            return;
        }
        try {
            super.C(fVar, j);
        } catch (IOException e10) {
            this.f5963u = true;
            this.f5962t.invoke(e10);
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [u8.b, v8.k] */
    @Override // ma.j, ma.v, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f5963u) {
            return;
        }
        try {
            super.close();
        } catch (IOException e10) {
            this.f5963u = true;
            this.f5962t.invoke(e10);
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [u8.b, v8.k] */
    @Override // ma.j, ma.v, java.io.Flushable
    public final void flush() {
        if (this.f5963u) {
            return;
        }
        try {
            super.flush();
        } catch (IOException e10) {
            this.f5963u = true;
            this.f5962t.invoke(e10);
        }
    }
}
