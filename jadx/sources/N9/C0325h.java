package N9;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: renamed from: N9.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0325h extends C0333p {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f3454c = AtomicIntegerFieldUpdater.newUpdater(C0325h.class, "_resumed");
    private volatile int _resumed;

    public C0325h(C0324g c0324g, Throwable th, boolean z6) {
        if (th == null) {
            th = new CancellationException("Continuation " + c0324g + " was cancelled normally");
        }
        super(th, z6);
        this._resumed = 0;
    }
}
