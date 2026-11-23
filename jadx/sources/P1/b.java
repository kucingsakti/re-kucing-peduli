package P1;

import A1.D;
import A1.o;
import U1.l;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicReference;
import p212w.e;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final D f3833c = new D(Object.class, Object.class, Object.class, Collections.singletonList(new o(Object.class, Object.class, Object.class, Collections.EMPTY_LIST, new M1.d(0), null)), null);
    public final e a = new e(0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicReference f3834b = new AtomicReference();

    public final void a(Class cls, Class cls2, Class cls3, D d3) {
        synchronized (this.a) {
            e eVar = this.a;
            l lVar = new l(cls, cls2, cls3);
            if (d3 == null) {
                d3 = f3833c;
            }
            eVar.put(lVar, d3);
        }
    }
}
