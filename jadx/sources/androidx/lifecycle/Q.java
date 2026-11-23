package androidx.lifecycle;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public abstract class Q {
    public final p203v0.a a = new p203v0.a();

    public final void a(K k3) {
        AutoCloseable autoCloseable;
        p203v0.a aVar = this.a;
        if (aVar != null) {
            if (aVar.f15380d) {
                p203v0.a.a(k3);
                return;
            }
            synchronized (aVar.a) {
                autoCloseable = (AutoCloseable) aVar.f15378b.put("androidx.lifecycle.savedstate.vm.tag", k3);
            }
            p203v0.a.a(autoCloseable);
        }
    }

    public final void b() {
        p203v0.a aVar = this.a;
        if (aVar != null && !aVar.f15380d) {
            aVar.f15380d = true;
            synchronized (aVar.a) {
                try {
                    Iterator it = aVar.f15378b.values().iterator();
                    while (it.hasNext()) {
                        p203v0.a.a((AutoCloseable) it.next());
                    }
                    Iterator it2 = aVar.f15379c.iterator();
                    while (it2.hasNext()) {
                        p203v0.a.a((AutoCloseable) it2.next());
                    }
                    aVar.f15379c.clear();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        c();
    }

    public void c() {
    }
}
