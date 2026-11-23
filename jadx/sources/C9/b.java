package C9;

import L8.C0280n;
import L8.InterfaceC0267a;
import L8.InterfaceC0269c;
import L8.InterfaceC0271e;
import L8.InterfaceC0276j;
import L8.InterfaceC0284s;
import L8.InterfaceC0285t;
import L8.M;
import O8.N;
import O8.w;
import androidx.datastore.preferences.protobuf.AbstractC0487g;
import java.util.Collection;

/* JADX INFO: loaded from: classes.dex */
public final class b extends N {
    @Override // O8.w, L8.InterfaceC0269c
    public final /* bridge */ /* synthetic */ InterfaceC0269c S(InterfaceC0271e interfaceC0271e, int i10, C0280n c0280n) {
        S(interfaceC0271e, i10, c0280n);
        return this;
    }

    @Override // O8.w
    /* JADX INFO: renamed from: a1 */
    public final N S(InterfaceC0271e interfaceC0271e, int i10, C0280n c0280n) {
        p210v8.i.f(interfaceC0271e, "newOwner");
        AbstractC0487g.p(i10, "modality");
        p210v8.i.f(c0280n, "visibility");
        AbstractC0487g.p(2, "kind");
        return this;
    }

    @Override // O8.N, O8.w
    public final w b1(int i10, InterfaceC0276j interfaceC0276j, InterfaceC0285t interfaceC0285t, M m2, M8.h hVar, p096j9.f fVar) {
        p210v8.i.f(interfaceC0276j, "newOwner");
        AbstractC0487g.p(i10, "kind");
        p210v8.i.f(hVar, "annotations");
        return this;
    }

    @Override // O8.w, L8.InterfaceC0268b
    public final Object c0(InterfaceC0267a interfaceC0267a) {
        return null;
    }

    @Override // O8.w, L8.InterfaceC0269c
    public final void p0(Collection collection) {
        p210v8.i.f(collection, "overriddenDescriptors");
    }

    @Override // O8.w, L8.InterfaceC0285t
    public final boolean t() {
        return false;
    }

    @Override // O8.N, O8.w, L8.InterfaceC0285t
    public final InterfaceC0284s y0() {
        return new p040e1.j(this, 6);
    }
}
