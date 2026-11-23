package p231y;

import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b f15805c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final b f15806d;
    public final boolean a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CancellationException f15807b;

    static {
        if (h.f15817v) {
            f15806d = null;
            f15805c = null;
        } else {
            f15806d = new b(false, null);
            f15805c = new b(true, null);
        }
    }

    public b(boolean z6, CancellationException cancellationException) {
        this.a = z6;
        this.f15807b = cancellationException;
    }
}
