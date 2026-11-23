package p078i;

import D4.a;
import F3.c;
import P2.g;
import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* JADX INFO: renamed from: i.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class ExecutorC0659p implements Executor {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f12101s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final ArrayDeque f12102t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public Runnable f12103u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final Object f12104v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final Executor f12105w;

    public ExecutorC0659p(ExecutorService executorService) {
        this.f12101s = 1;
        this.f12105w = executorService;
        this.f12102t = new ArrayDeque();
        this.f12104v = new Object();
    }

    private final void a(Runnable runnable) {
        synchronized (this.f12104v) {
            try {
                this.f12102t.add(new a(this, 16, runnable));
                if (this.f12103u == null) {
                    c();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean b() {
        boolean z6;
        synchronized (this.f12104v) {
            z6 = !this.f12102t.isEmpty();
        }
        return z6;
    }

    public final void c() {
        switch (this.f12101s) {
            case 0:
                synchronized (this.f12104v) {
                    try {
                        Runnable runnable = (Runnable) this.f12102t.poll();
                        this.f12103u = runnable;
                        if (runnable != null) {
                            ((c) this.f12105w).execute(runnable);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                return;
            default:
                Runnable runnable2 = (Runnable) this.f12102t.poll();
                this.f12103u = runnable2;
                if (runnable2 != null) {
                    ((ExecutorService) this.f12105w).execute(runnable2);
                    return;
                }
                return;
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.f12101s) {
            case 0:
                a(runnable);
                return;
            default:
                synchronized (this.f12104v) {
                    try {
                        this.f12102t.add(new g(this, 22, runnable));
                        if (this.f12103u == null) {
                            c();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                return;
        }
    }

    public ExecutorC0659p(c cVar) {
        this.f12101s = 0;
        this.f12104v = new Object();
        this.f12102t = new ArrayDeque();
        this.f12105w = cVar;
    }
}
