package U9;

import N9.U;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public abstract class g extends U {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public b f5047t;

    @Override // N9.AbstractC0337u
    public final void g(p123m8.i iVar, Runnable runnable) {
        b.c(this.f5047t, runnable, 6);
    }

    @Override // N9.AbstractC0337u
    public final void n(p123m8.i iVar, Runnable runnable) {
        b.c(this.f5047t, runnable, 2);
    }

    @Override // N9.U
    public final Executor t() {
        return this.f5047t;
    }
}
