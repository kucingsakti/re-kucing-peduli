package p156q0;

import java.util.concurrent.atomic.AtomicReference;
import p049f.b;

/* JADX INFO: renamed from: q0.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0757p extends b {
    public final /* synthetic */ AtomicReference a;

    public C0757p(AtomicReference atomicReference) {
        this.a = atomicReference;
    }

    @Override // p049f.b
    public final void a(Object obj) {
        b bVar = (b) this.a.get();
        if (bVar == null) {
            throw new IllegalStateException("Operation cannot be started before fragment is in created state");
        }
        bVar.a(obj);
    }
}
