package o1;

import L8.M;
import N9.AbstractC0342z;
import N9.InterfaceC0341y;
import com.unity3d.ads.metadata.MediationMetaData;
import java.io.InterruptedIOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import javax.inject.Provider;
import kotlinx.coroutines.channels.ClosedSendChannelException;
import p.b1;
import p047e9.C0618j;
import p188t1.G;

/* JADX INFO: loaded from: classes.dex */
public final class m implements k2.b, p220w9.e {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public Object f13641s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public Object f13642t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public Object f13643u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public Object f13644v;

    public /* synthetic */ m(Object obj, Object obj2, Object obj3, Object obj4) {
        this.f13641s = obj;
        this.f13642t = obj2;
        this.f13643u = obj3;
        this.f13644v = obj4;
    }

    @Override // p220w9.e
    public p220w9.d a(p096j9.b bVar) {
        p210v8.i.f(bVar, "classId");
        C0618j c0618j = (C0618j) ((LinkedHashMap) this.f13644v).get(bVar);
        if (c0618j == null) {
            return null;
        }
        ((e2.b) this.f13643u).invoke(bVar);
        return new p220w9.d((c) this.f13641s, c0618j, (p057f9.a) this.f13642t, M.a);
    }

    public synchronized ExecutorService b() {
        ThreadPoolExecutor threadPoolExecutor;
        try {
            if (((ThreadPoolExecutor) this.f13641s) == null) {
                TimeUnit timeUnit = TimeUnit.SECONDS;
                SynchronousQueue synchronousQueue = new SynchronousQueue();
                String strK = p210v8.i.k(" Dispatcher", Y9.c.f5826g);
                p210v8.i.f(strK, MediationMetaData.KEY_NAME);
                this.f13641s = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, timeUnit, synchronousQueue, new Y9.b(strK, false));
            }
            threadPoolExecutor = (ThreadPoolExecutor) this.f13641s;
            p210v8.i.c(threadPoolExecutor);
        } catch (Throwable th) {
            throw th;
        }
        return threadPoolExecutor;
    }

    public void c(ArrayDeque arrayDeque, Object obj) {
        synchronized (this) {
            if (!arrayDeque.remove(obj)) {
                throw new AssertionError("Call wasn't in-flight!");
            }
            e();
        }
        j();
    }

    public void d(p020ba.f fVar) {
        fVar.f7376t.decrementAndGet();
        c((ArrayDeque) this.f13643u, fVar);
    }

    public synchronized void e() {
    }

    public synchronized void f() {
    }

    public synchronized void g() {
    }

    @Override // javax.inject.Provider
    public Object get() {
        return new p138o2.i((Executor) ((Provider) this.f13641s).get(), (p148p2.d) ((Provider) this.f13642t).get(), (p138o2.c) ((Y1.c) this.f13643u).get(), (p158q2.b) ((Provider) this.f13644v).get());
    }

    public boolean h(p238y9.q qVar) {
        p210v8.i.f(qVar, "descriptor");
        if (p210v8.i.a((p238y9.q) this.f13642t, qVar)) {
            return true;
        }
        m mVar = (m) this.f13641s;
        return mVar != null ? mVar.h(qVar) : false;
    }

    public void i(p039e0.l lVar) throws Throwable {
        Object objA = ((P9.a) this.f13643u).a(lVar);
        boolean z6 = objA instanceof P9.f;
        if (z6) {
            P9.f fVar = z6 ? (P9.f) objA : null;
            Throwable th = fVar != null ? fVar.a : null;
            if (th != null) {
                throw th;
            }
            throw new ClosedSendChannelException("Channel was closed normally");
        }
        if (objA instanceof P9.g) {
            throw new IllegalStateException("Check failed.");
        }
        if (((AtomicInteger) this.f13644v).getAndIncrement() == 0) {
            AbstractC0342z.n((InterfaceC0341y) this.f13641s, null, new p039e0.i(this, null), 3);
        }
    }

    public void j() {
        byte[] bArr = Y9.c.a;
        ArrayList arrayList = new ArrayList();
        synchronized (this) {
            try {
                Iterator it = ((ArrayDeque) this.f13642t).iterator();
                p210v8.i.e(it, "readyAsyncCalls.iterator()");
                while (it.hasNext()) {
                    p020ba.f fVar = (p020ba.f) it.next();
                    int size = ((ArrayDeque) this.f13643u).size();
                    f();
                    if (size >= 64) {
                        break;
                    }
                    int i10 = fVar.f7376t.get();
                    g();
                    if (i10 < 5) {
                        it.remove();
                        fVar.f7376t.incrementAndGet();
                        arrayList.add(fVar);
                        ((ArrayDeque) this.f13643u).add(fVar);
                    }
                }
                k();
            } catch (Throwable th) {
                throw th;
            }
        }
        int size2 = arrayList.size();
        int i11 = 0;
        while (i11 < size2) {
            int i12 = i11 + 1;
            p020ba.f fVar2 = (p020ba.f) arrayList.get(i11);
            ExecutorService executorServiceB = b();
            fVar2.getClass();
            p020ba.i iVar = fVar2.f7377u;
            m mVar = iVar.f7387s.f5489s;
            byte[] bArr2 = Y9.c.a;
            try {
                try {
                    ((ThreadPoolExecutor) executorServiceB).execute(fVar2);
                } catch (RejectedExecutionException e10) {
                    InterruptedIOException interruptedIOException = new InterruptedIOException("executor rejected");
                    interruptedIOException.initCause(e10);
                    iVar.k(interruptedIOException);
                    fVar2.f7375s.onFailure(iVar, interruptedIOException);
                    iVar.f7387s.f5489s.d(fVar2);
                }
                i11 = i12;
            } catch (Throwable th2) {
                iVar.f7387s.f5489s.d(fVar2);
                throw th2;
            }
        }
    }

    public synchronized int k() {
        return ((ArrayDeque) this.f13643u).size() + ((ArrayDeque) this.f13644v).size();
    }

    public void l() {
        ArrayList arrayList = (ArrayList) this.f13642t;
        if (arrayList.isEmpty()) {
            return;
        }
        ((HashMap) ((e) this.f13643u).f13628u).put((p029c9.n) this.f13641s, arrayList);
    }

    public b1 m(int i10, p096j9.b bVar, Q8.a aVar) {
        p029c9.n nVar = new p029c9.n(((p029c9.n) this.f13641s).a + '@' + i10);
        e eVar = (e) this.f13644v;
        List arrayList = (List) ((HashMap) eVar.f13628u).get(nVar);
        if (arrayList == null) {
            arrayList = new ArrayList();
            ((HashMap) eVar.f13628u).put(nVar, arrayList);
        }
        return ((G) eVar.f13627t).u(bVar, aVar, arrayList);
    }

    public m(e eVar, p029c9.n nVar) {
        this.f13644v = eVar;
        this.f13643u = eVar;
        this.f13641s = nVar;
        this.f13642t = new ArrayList();
    }
}
