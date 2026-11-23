package p157q1;

import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f14380c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f14381d;
    public final boolean a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CancellationException f14382b;

    static {
        if (i.f14397v) {
            f14381d = null;
            f14380c = null;
        } else {
            f14381d = new a(false, null);
            f14380c = new a(true, null);
        }
    }

    public a(boolean z6, CancellationException cancellationException) {
        this.a = z6;
        this.f14382b = cancellationException;
    }
}
