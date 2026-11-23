package X9;

import java.io.Closeable;
import java.io.File;
import java.io.Flushable;

/* JADX INFO: renamed from: X9.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0461g implements Closeable, Flushable {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Z9.g f5585s;

    public C0461g(File file) {
        this.f5585s = new Z9.g(file, p010aa.c.f6023h);
    }

    public final void a(G g8) {
        p210v8.i.f(g8, "request");
        Z9.g gVar = this.f5585s;
        String strO = p181s3.a.o(g8.a);
        synchronized (gVar) {
            p210v8.i.f(strO, "key");
            gVar.h();
            gVar.a();
            Z9.g.B(strO);
            Z9.d dVar = (Z9.d) gVar.f5960y.get(strO);
            if (dVar == null) {
                return;
            }
            gVar.t(dVar);
            if (gVar.f5958w <= 10485760) {
                gVar.f5949E = false;
            }
        }
    }

    public final synchronized void b() {
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f5585s.close();
    }

    @Override // java.io.Flushable
    public final void flush() {
        this.f5585s.flush();
    }
}
