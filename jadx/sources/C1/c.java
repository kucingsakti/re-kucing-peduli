package C1;

import U1.n;
import java.util.ArrayDeque;

/* JADX INFO: loaded from: classes.dex */
public final class c {
    public final ArrayDeque a;

    public c(int i10) {
        switch (i10) {
            case 1:
                char[] cArr = n.a;
                this.a = new ArrayDeque(0);
                break;
            default:
                this.a = new ArrayDeque();
                break;
        }
    }

    public b a() {
        b bVar;
        synchronized (this.a) {
            bVar = (b) this.a.poll();
        }
        return bVar == null ? new b() : bVar;
    }

    public void b(b bVar) {
        synchronized (this.a) {
            try {
                if (this.a.size() < 10) {
                    this.a.offer(bVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public synchronized void c(p223x1.c cVar) {
        cVar.f15729b = null;
        cVar.f15730c = null;
        this.a.offer(cVar);
    }
}
