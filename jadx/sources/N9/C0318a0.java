package N9;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: renamed from: N9.a0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0318a0 extends d0 {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f3437x = AtomicIntegerFieldUpdater.newUpdater(C0318a0.class, "_invoked");
    private volatile int _invoked;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final p200u8.b f3438w;

    public C0318a0(p200u8.b bVar) {
        this.f3438w = bVar;
    }

    @Override // p200u8.b
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        n((Throwable) obj);
        return p076h8.m.a;
    }

    @Override // N9.f0
    public final void n(Throwable th) {
        if (f3437x.compareAndSet(this, 0, 1)) {
            this.f3438w.invoke(th);
        }
    }
}
