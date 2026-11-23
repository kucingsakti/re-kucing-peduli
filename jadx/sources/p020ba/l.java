package p020ba;

import X9.C0455a;
import Z9.f;
import java.lang.ref.Reference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;
import p010aa.b;
import p010aa.c;
import p068ga.n;
import p210v8.i;

/* JADX INFO: loaded from: classes.dex */
public final class l {
    public final long a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f7410b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f f7411c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ConcurrentLinkedQueue f7412d;

    public l(c cVar) {
        TimeUnit timeUnit = TimeUnit.MINUTES;
        i.f(cVar, "taskRunner");
        i.f(timeUnit, "timeUnit");
        this.a = timeUnit.toNanos(5L);
        this.f7410b = cVar.e();
        this.f7411c = new f(this, i.k(" ConnectionPool", Y9.c.f5826g), 2);
        this.f7412d = new ConcurrentLinkedQueue();
    }

    public final boolean a(C0455a c0455a, i iVar, List list, boolean z6) {
        i.f(iVar, "call");
        Iterator it = this.f7412d.iterator();
        while (true) {
            if (!it.hasNext()) {
                return false;
            }
            k kVar = (k) it.next();
            i.e(kVar, "connection");
            synchronized (kVar) {
                if (z6) {
                    if (!(kVar.f7400g != null)) {
                    }
                }
                if (kVar.i(c0455a, list)) {
                    iVar.c(kVar);
                    return true;
                }
            }
        }
    }

    public final int b(k kVar, long j) {
        byte[] bArr = Y9.c.a;
        ArrayList arrayList = kVar.f7408p;
        int i10 = 0;
        while (i10 < arrayList.size()) {
            Reference reference = (Reference) arrayList.get(i10);
            if (reference.get() != null) {
                i10++;
            } else {
                String str = "A connection to " + kVar.f7395b.a.f5563h + " was leaked. Did you forget to close a response body?";
                n nVar = n.a;
                n.a.k(((g) reference).a, str);
                arrayList.remove(i10);
                kVar.j = true;
                if (arrayList.isEmpty()) {
                    kVar.f7409q = j - this.a;
                    return 0;
                }
            }
        }
        return arrayList.size();
    }
}
