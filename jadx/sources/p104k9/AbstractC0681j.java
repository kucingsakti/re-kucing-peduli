package p104k9;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: k9.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0681j extends AbstractC0680i implements t {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public C0679h f12809t = C0679h.f12806c;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f12810u;

    public final void f(AbstractC0682k abstractC0682k) {
        y yVar;
        if (!this.f12810u) {
            this.f12809t = this.f12809t.clone();
            this.f12810u = true;
        }
        C0679h c0679h = this.f12809t;
        C0679h c0679h2 = abstractC0682k.f12811s;
        c0679h.getClass();
        int i10 = 0;
        while (true) {
            int size = c0679h2.a.f12837t.size();
            yVar = c0679h2.a;
            if (i10 >= size) {
                break;
            }
            c0679h.g((Map.Entry) yVar.f12837t.get(i10));
            i10++;
        }
        Iterator it = yVar.c().iterator();
        while (it.hasNext()) {
            c0679h.g((Map.Entry) it.next());
        }
    }
}
