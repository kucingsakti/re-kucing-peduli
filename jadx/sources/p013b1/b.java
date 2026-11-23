package p013b1;

import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import p022c1.i;

/* JADX INFO: loaded from: classes.dex */
public final class b extends i {
    public final /* synthetic */ int a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f7244b;

    public b() {
        this.a = 1;
        this.f7244b = new ArrayList(3);
    }

    @Override // p022c1.i
    public final void a(int i10) {
        switch (this.a) {
            case 0:
                ((d) this.f7244b).b(false);
                return;
            default:
                try {
                    Iterator it = ((ArrayList) this.f7244b).iterator();
                    while (it.hasNext()) {
                        ((i) it.next()).a(i10);
                    }
                    return;
                } catch (ConcurrentModificationException e10) {
                    throw new IllegalStateException("Adding and removing callbacks during dispatch to callbacks is not supported", e10);
                }
        }
    }

    @Override // p022c1.i
    public void b(int i10, float f10, int i11) {
        switch (this.a) {
            case 1:
                try {
                    Iterator it = ((ArrayList) this.f7244b).iterator();
                    while (it.hasNext()) {
                        ((i) it.next()).b(i10, f10, i11);
                    }
                    return;
                } catch (ConcurrentModificationException e10) {
                    throw new IllegalStateException("Adding and removing callbacks during dispatch to callbacks is not supported", e10);
                }
            default:
                return;
        }
    }

    @Override // p022c1.i
    public final void c(int i10) {
        switch (this.a) {
            case 0:
                ((d) this.f7244b).b(false);
                return;
            default:
                try {
                    Iterator it = ((ArrayList) this.f7244b).iterator();
                    while (it.hasNext()) {
                        ((i) it.next()).c(i10);
                    }
                    return;
                } catch (ConcurrentModificationException e10) {
                    throw new IllegalStateException("Adding and removing callbacks during dispatch to callbacks is not supported", e10);
                }
        }
    }

    public b(d dVar) {
        this.a = 0;
        this.f7244b = dVar;
    }
}
