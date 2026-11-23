package S7;

import J7.p;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class b extends AtomicReference implements L7.b, Runnable {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f4545s = 0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Object f4546t;

    /* JADX WARN: Multi-variable type inference failed */
    public b(J7.b bVar) {
        this.f4546t = (AtomicReference) bVar;
    }

    @Override // L7.b
    public final void f() {
        switch (this.f4545s) {
            case 0:
                O7.b.g(this);
                break;
            default:
                O7.b.g(this);
                break;
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [J7.b, java.util.concurrent.atomic.AtomicReference] */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f4545s) {
            case 0:
                ((AtomicReference) this.f4546t).a();
                break;
            default:
                ((p) this.f4546t).c(0L);
                break;
        }
    }

    public b(p pVar) {
        this.f4546t = pVar;
    }
}
