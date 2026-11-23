package U7;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes.dex */
public final class g extends J7.g implements Callable {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final p027c7.a f4917s;

    public g(p027c7.a aVar) {
        this.f4917s = aVar;
    }

    @Override // J7.g
    public final void b(J7.i iVar) {
        iVar.b(O7.c.f3610s);
        iVar.c(this.f4917s);
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return this.f4917s;
    }
}
