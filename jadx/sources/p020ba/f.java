package p020ba;

import C8.E;
import X9.InterfaceC0465k;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicInteger;
import o1.m;
import p068ga.n;
import p210v8.i;

/* JADX INFO: loaded from: classes.dex */
public final class f implements Runnable {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final InterfaceC0465k f7375s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public volatile AtomicInteger f7376t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ i f7377u;

    public f(i iVar, InterfaceC0465k interfaceC0465k) {
        i.f(iVar, "this$0");
        this.f7377u = iVar;
        this.f7375s = interfaceC0465k;
        this.f7376t = new AtomicInteger(0);
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z6;
        Throwable th;
        IOException e10;
        m mVar;
        String strK = i.k(this.f7377u.f7388t.a.g(), "OkHttp ");
        i iVar = this.f7377u;
        Thread threadCurrentThread = Thread.currentThread();
        String name = threadCurrentThread.getName();
        threadCurrentThread.setName(strK);
        try {
            iVar.f7390v.h();
            try {
                try {
                    z6 = true;
                    try {
                        this.f7375s.onResponse(iVar, iVar.i());
                        mVar = iVar.f7387s.f5489s;
                    } catch (IOException e11) {
                        e10 = e11;
                        if (z6) {
                            n nVar = n.a;
                            n nVar2 = n.a;
                            String strK2 = i.k(i.a(iVar), "Callback failure for ");
                            nVar2.getClass();
                            n.i(strK2, 4, e10);
                        } else {
                            this.f7375s.onFailure(iVar, e10);
                        }
                        mVar = iVar.f7387s.f5489s;
                    } catch (Throwable th2) {
                        th = th2;
                        iVar.cancel();
                        if (!z6) {
                            IOException iOException = new IOException(i.k(th, "canceled due to "));
                            E.e(iOException, th);
                            this.f7375s.onFailure(iVar, iOException);
                        }
                        throw th;
                    }
                } catch (Throwable th3) {
                    iVar.f7387s.f5489s.d(this);
                    throw th3;
                }
            } catch (IOException e12) {
                z6 = false;
                e10 = e12;
            } catch (Throwable th4) {
                z6 = false;
                th = th4;
            }
            mVar.d(this);
            threadCurrentThread.setName(name);
        } catch (Throwable th5) {
            threadCurrentThread.setName(name);
            throw th5;
        }
    }
}
