package N9;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: renamed from: N9.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0333p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f3476b = AtomicIntegerFieldUpdater.newUpdater(C0333p.class, "_handled");
    private volatile int _handled;
    public final Throwable a;

    public C0333p(Throwable th, boolean z6) {
        this.a = th;
        this._handled = z6 ? 1 : 0;
    }

    public final String toString() {
        return getClass().getSimpleName() + '[' + this.a + ']';
    }
}
