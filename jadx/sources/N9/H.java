package N9;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class H implements Executor {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final AbstractC0337u f3413s;

    public H(AbstractC0337u abstractC0337u) {
        this.f3413s = abstractC0337u;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        p123m8.j jVar = p123m8.j.f13164s;
        AbstractC0337u abstractC0337u = this.f3413s;
        if (abstractC0337u.o()) {
            abstractC0337u.g(jVar, runnable);
        } else {
            runnable.run();
        }
    }

    public final String toString() {
        return this.f3413s.toString();
    }
}
