package U9;

import N9.AbstractC0337u;
import N9.U;
import S9.u;
import androidx.datastore.preferences.protobuf.AbstractC0487g;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class c extends U implements Executor {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final c f5044t = new c();

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final AbstractC0337u f5045u;

    static {
        AbstractC0337u hVar;
        k kVar = k.f5058t;
        int i10 = u.a;
        if (64 >= i10) {
            i10 = 64;
        }
        int iJ = S9.a.j(i10, "kotlinx.coroutines.io.parallelism", 12);
        kVar.getClass();
        if (iJ < 1) {
            throw new IllegalArgumentException(AbstractC0487g.g(iJ, "Expected positive parallelism level, but got ").toString());
        }
        if (iJ < j.f5053d) {
            if (iJ < 1) {
                throw new IllegalArgumentException(AbstractC0487g.g(iJ, "Expected positive parallelism level, but got ").toString());
            }
            hVar = new S9.h(kVar, iJ);
        }
        hVar = kVar;
        f5045u = hVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new IllegalStateException("Cannot be invoked on Dispatchers.IO");
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        g(p123m8.j.f13164s, runnable);
    }

    @Override // N9.AbstractC0337u
    public final void g(p123m8.i iVar, Runnable runnable) {
        f5045u.g(iVar, runnable);
    }

    @Override // N9.AbstractC0337u
    public final void n(p123m8.i iVar, Runnable runnable) {
        f5045u.n(iVar, runnable);
    }

    @Override // N9.AbstractC0337u
    public final String toString() {
        return "Dispatchers.IO";
    }

    @Override // N9.U
    public final Executor t() {
        return this;
    }
}
