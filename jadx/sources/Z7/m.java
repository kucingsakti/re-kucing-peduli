package Z7;

import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: classes.dex */
public final class m extends AtomicReferenceArray implements Runnable, Callable, L7.b {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final Object f5893t = new Object();

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final Object f5894u = new Object();

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final Object f5895v = new Object();

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final Object f5896w = new Object();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Runnable f5897s;

    public m(Runnable runnable, L7.a aVar) {
        super(3);
        this.f5897s = runnable;
        lazySet(0, aVar);
    }

    public final void a(Future future) {
        Object obj;
        do {
            obj = get(1);
            if (obj == f5896w) {
                return;
            }
            if (obj == f5894u) {
                future.cancel(false);
                return;
            } else if (obj == f5895v) {
                future.cancel(true);
                return;
            }
        } while (!compareAndSet(1, obj, future));
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        run();
        return null;
    }

    @Override // L7.b
    public final void f() {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        while (true) {
            Object obj6 = get(1);
            obj = f5896w;
            if (obj6 == obj || obj6 == (obj4 = f5894u) || obj6 == (obj5 = f5895v)) {
                break;
            }
            boolean z6 = get(2) != Thread.currentThread();
            if (z6) {
                obj4 = obj5;
            }
            if (compareAndSet(1, obj6, obj4)) {
                if (obj6 == null) {
                    break;
                }
                ((Future) obj6).cancel(z6);
                break;
            }
        }
        do {
            obj2 = get(0);
            if (obj2 == obj || obj2 == (obj3 = f5893t) || obj2 == null) {
                return;
            }
        } while (!compareAndSet(0, obj2, obj3));
        ((L7.a) obj2).c(this);
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        Object obj2 = f5895v;
        Object obj3 = f5894u;
        Object obj4 = f5893t;
        Object obj5 = f5896w;
        lazySet(2, Thread.currentThread());
        try {
            this.f5897s.run();
        } catch (Throwable th) {
            try {
                J7.j.y(th);
            } finally {
                lazySet(2, null);
                Object obj6 = get(0);
                if (obj6 != obj4 && compareAndSet(0, obj6, obj5) && obj6 != null) {
                    ((L7.a) obj6).c(this);
                }
                do {
                    obj = get(1);
                    if (obj == obj3 || obj == obj2) {
                        break;
                    }
                } while (!compareAndSet(1, obj, obj5));
            }
        }
        lazySet(2, null);
        Object obj7 = get(0);
        if (obj7 != obj4 && compareAndSet(0, obj7, obj5) && obj7 != null) {
            ((L7.a) obj7).c(this);
        }
        while (r2 != obj3 && r2 != obj2 && !compareAndSet(1, get(i), obj5)) {
        }
    }
}
