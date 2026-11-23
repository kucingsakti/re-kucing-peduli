package p106l0;

import C8.E;
import java.util.concurrent.ThreadPoolExecutor;
import o1.h;

/* JADX INFO: loaded from: classes.dex */
public final class i extends E {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ E f12861b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ThreadPoolExecutor f12862c;

    public i(E e10, ThreadPoolExecutor threadPoolExecutor) {
        this.f12861b = e10;
        this.f12862c = threadPoolExecutor;
    }

    @Override // C8.E
    public final void x(Throwable th) {
        ThreadPoolExecutor threadPoolExecutor = this.f12862c;
        try {
            this.f12861b.x(th);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }

    @Override // C8.E
    public final void y(h hVar) {
        ThreadPoolExecutor threadPoolExecutor = this.f12862c;
        try {
            this.f12861b.y(hVar);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }
}
