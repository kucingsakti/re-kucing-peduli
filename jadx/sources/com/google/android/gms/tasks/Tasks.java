package com.google.android.gms.tasks;

import F3.c;
import P0.d;
import P2.a;
import P2.f;
import P2.g;
import com.google.android.gms.common.internal.Preconditions;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes.dex */
public final class Tasks {
    private Tasks() {
    }

    public static Object a(Task task) throws InterruptedException {
        Preconditions.h("Must not be called on the main application thread");
        Preconditions.g();
        Preconditions.j(task, "Task must not be null");
        if (task.j()) {
            return g(task);
        }
        d dVar = new d(1);
        c cVar = TaskExecutors.f9397b;
        task.c(cVar, dVar);
        task.b(cVar, dVar);
        task.a(cVar, dVar);
        ((CountDownLatch) dVar.f3811t).await();
        return g(task);
    }

    public static Object b(Task task, long j, TimeUnit timeUnit) {
        Preconditions.h("Must not be called on the main application thread");
        Preconditions.g();
        Preconditions.j(task, "Task must not be null");
        Preconditions.j(timeUnit, "TimeUnit must not be null");
        if (task.j()) {
            return g(task);
        }
        d dVar = new d(1);
        c cVar = TaskExecutors.f9397b;
        task.c(cVar, dVar);
        task.b(cVar, dVar);
        task.a(cVar, dVar);
        if (((CountDownLatch) dVar.f3811t).await(j, timeUnit)) {
            return g(task);
        }
        throw new TimeoutException("Timed out waiting for Task");
    }

    public static f c(Executor executor, Callable callable) {
        Preconditions.j(executor, "Executor must not be null");
        f fVar = new f();
        executor.execute(new g(fVar, 0, callable));
        return fVar;
    }

    public static f d(Exception exc) {
        f fVar = new f();
        fVar.o(exc);
        return fVar;
    }

    public static f e(Object obj) {
        f fVar = new f();
        fVar.p(obj);
        return fVar;
    }

    public static f f(List list) {
        if (list == null || list.isEmpty()) {
            return e(null);
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (((Task) it.next()) == null) {
                throw new NullPointerException("null tasks are not accepted");
            }
        }
        f fVar = new f();
        a aVar = new a(list.size(), fVar);
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            Task task = (Task) it2.next();
            c cVar = TaskExecutors.f9397b;
            task.c(cVar, aVar);
            task.b(cVar, aVar);
            task.a(cVar, aVar);
        }
        return fVar;
    }

    public static Object g(Task task) throws ExecutionException {
        if (task.k()) {
            return task.g();
        }
        if (task.i()) {
            throw new CancellationException("Task is already canceled");
        }
        throw new ExecutionException(task.f());
    }
}
