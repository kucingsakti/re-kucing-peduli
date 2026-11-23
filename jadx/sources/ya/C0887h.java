package ya;

import java.util.concurrent.CompletableFuture;

/* JADX INFO: renamed from: ya.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0887h extends CompletableFuture {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final C0898t f16210s;

    public C0887h(C0898t c0898t) {
        this.f16210s = c0898t;
    }

    @Override // java.util.concurrent.CompletableFuture, java.util.concurrent.Future
    public final boolean cancel(boolean z6) {
        if (z6) {
            this.f16210s.cancel();
        }
        return super.cancel(z6);
    }
}
