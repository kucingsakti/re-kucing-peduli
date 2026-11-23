package S9;

import N9.AbstractC0317a;
import N9.AbstractC0342z;

/* JADX INFO: loaded from: classes.dex */
public class r extends AbstractC0317a implements p144o8.d {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final p123m8.d f4575v;

    public r(p123m8.d dVar, p123m8.i iVar) {
        super(iVar, true);
        this.f4575v = dVar;
    }

    @Override // N9.k0
    public final boolean D() {
        return true;
    }

    @Override // N9.k0
    public void d(Object obj) {
        a.g(AbstractC0342z.o(obj), qa.b.q(this.f4575v));
    }

    @Override // N9.k0
    public void e(Object obj) {
        this.f4575v.resumeWith(AbstractC0342z.o(obj));
    }

    @Override // p144o8.d
    public final p144o8.d getCallerFrame() {
        p123m8.d dVar = this.f4575v;
        if (dVar instanceof p144o8.d) {
            return (p144o8.d) dVar;
        }
        return null;
    }
}
