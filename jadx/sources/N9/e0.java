package N9;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes.dex */
public class e0 extends k0 implements InterfaceC0331n {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final boolean f3446u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0() {
        super(true);
        boolean z6 = true;
        B(null);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = k0.f3470t;
        InterfaceC0327j interfaceC0327j = (InterfaceC0327j) atomicReferenceFieldUpdater.get(this);
        C0328k c0328k = interfaceC0327j instanceof C0328k ? (C0328k) interfaceC0327j : null;
        if (c0328k == null) {
            z6 = false;
            break;
        }
        k0 k0VarM = c0328k.m();
        while (!k0VarM.v()) {
            InterfaceC0327j interfaceC0327j2 = (InterfaceC0327j) atomicReferenceFieldUpdater.get(k0VarM);
            C0328k c0328k2 = interfaceC0327j2 instanceof C0328k ? (C0328k) interfaceC0327j2 : null;
            if (c0328k2 == null) {
                z6 = false;
                break;
            }
            k0VarM = c0328k2.m();
        }
        this.f3446u = z6;
    }

    @Override // N9.k0
    public final boolean v() {
        return this.f3446u;
    }

    @Override // N9.k0
    public final boolean w() {
        return true;
    }
}
