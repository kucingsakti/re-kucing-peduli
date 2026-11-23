package p147p1;

import androidx.work.impl.WorkDatabase;
import com.google.android.gms.common.api.internal.zaaw;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.concurrent.locks.ReentrantLock;
import o1.r;
import p050f1.q;
import p050f1.s;
import p050f1.v;
import p061g1.e;
import p061g1.g;
import p061g1.o;
import p061g1.p;
import p224x2.h;

/* JADX INFO: loaded from: classes.dex */
public abstract class c implements Runnable {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f14169s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Object f14170t;

    public /* synthetic */ c(zaaw zaawVar) {
        this.f14169s = 1;
        this.f14170t = zaawVar;
    }

    public static void a(o oVar, String str) {
        p pVar;
        boolean z6;
        WorkDatabase workDatabase = oVar.f11499c;
        o1.p pVarV = workDatabase.v();
        o1.c cVarQ = workDatabase.q();
        LinkedList linkedList = new LinkedList();
        linkedList.add(str);
        while (!linkedList.isEmpty()) {
            String str2 = (String) linkedList.remove();
            int iE = pVarV.e(str2);
            if (iE != 3 && iE != 4) {
                pVarV.k(6, str2);
            }
            linkedList.addAll(cVarQ.q(str2));
        }
        e eVar = oVar.f11502f;
        synchronized (eVar.f11474D) {
            try {
                q.a().getClass();
                eVar.f11472B.add(str);
                pVar = (p) eVar.f11480x.remove(str);
                z6 = pVar != null;
                if (pVar == null) {
                    pVar = (p) eVar.f11481y.remove(str);
                }
                if (pVar != null) {
                    eVar.f11482z.remove(str);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        e.c(pVar);
        if (z6) {
            eVar.l();
        }
        Iterator it = oVar.f11501e.iterator();
        while (it.hasNext()) {
            ((g) it.next()).a(str);
        }
    }

    public abstract void b();

    public abstract void c();

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f14169s) {
            case 0:
                r rVar = (r) this.f14170t;
                try {
                    b();
                    rVar.q(v.f11420q);
                    return;
                } catch (Throwable th) {
                    rVar.q(new s(th));
                    return;
                }
            default:
                zaaw zaawVar = (zaaw) this.f14170t;
                ReentrantLock reentrantLock = zaawVar.f7937b;
                ReentrantLock reentrantLock2 = zaawVar.f7937b;
                reentrantLock.lock();
                try {
                    try {
                        if (!Thread.interrupted()) {
                            c();
                        }
                    } finally {
                        reentrantLock2.unlock();
                    }
                    break;
                } catch (RuntimeException e10) {
                    h hVar = zaawVar.a.f7982f;
                    hVar.sendMessage(hVar.obtainMessage(2, e10));
                }
                return;
        }
    }

    public c() {
        this.f14169s = 0;
        this.f14170t = new r(13);
    }
}
