package p050f1;

import K3.d;
import V.h;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import p053f4.e;

/* JADX INFO: loaded from: classes.dex */
public final class b {
    public final ExecutorService a = Executors.newFixedThreadPool(Math.max(2, Math.min(Runtime.getRuntime().availableProcessors() - 1, 4)), new a(false));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ExecutorService f11388b = Executors.newFixedThreadPool(Math.max(2, Math.min(Runtime.getRuntime().availableProcessors() - 1, 4)), new a(true));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final x f11389c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final e f11390d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final h f11391e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f11392f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f11393g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f11394h;

    public b(d dVar) {
        int i10 = y.a;
        this.f11389c = new x();
        this.f11390d = new e(21);
        this.f11391e = new h();
        this.f11392f = 4;
        this.f11393g = Integer.MAX_VALUE;
        this.f11394h = 20;
    }
}
