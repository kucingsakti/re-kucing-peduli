package p238y9;

import L8.InterfaceC0271e;
import L8.InterfaceC0275i;
import L8.InterfaceC0276j;
import L8.InterfaceC0285t;
import L8.M;
import O8.C0355k;
import O8.w;
import androidx.datastore.preferences.protobuf.AbstractC0487g;
import p047e9.C0620l;
import p067g9.f;
import p067g9.g;
import p067g9.h;
import p104k9.AbstractC0672a;
import p210v8.i;

/* JADX INFO: loaded from: classes.dex */
public final class c extends C0355k implements b {

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public final C0620l f16052W;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public final f f16053X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final g f16054Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public final h f16055Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final p029c9.f f16056a0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(InterfaceC0271e interfaceC0271e, InterfaceC0275i interfaceC0275i, M8.h hVar, boolean z6, int i10, C0620l c0620l, f fVar, g gVar, h hVar2, p029c9.f fVar2, M m2) {
        super(interfaceC0271e, interfaceC0275i, hVar, z6, i10, m2 == null ? M.a : m2);
        i.f(interfaceC0271e, "containingDeclaration");
        i.f(hVar, "annotations");
        AbstractC0487g.p(i10, "kind");
        i.f(c0620l, "proto");
        i.f(fVar, "nameResolver");
        i.f(gVar, "typeTable");
        i.f(hVar2, "versionRequirementTable");
        this.f16052W = c0620l;
        this.f16053X = fVar;
        this.f16054Y = gVar;
        this.f16055Z = hVar2;
        this.f16056a0 = fVar2;
    }

    @Override // p238y9.i
    public final h B() {
        return this.f16056a0;
    }

    @Override // O8.w, L8.InterfaceC0288w
    public final boolean F() {
        return false;
    }

    @Override // p238y9.i
    public final f J0() {
        return this.f16053X;
    }

    @Override // p238y9.i
    public final AbstractC0672a W() {
        return this.f16052W;
    }

    @Override // O8.C0355k, O8.w
    public final /* bridge */ /* synthetic */ w b1(int i10, InterfaceC0276j interfaceC0276j, InterfaceC0285t interfaceC0285t, M m2, M8.h hVar, p096j9.f fVar) {
        return q1(interfaceC0276j, interfaceC0285t, i10, hVar, m2);
    }

    @Override // O8.C0355k
    /* JADX INFO: renamed from: k1 */
    public final /* bridge */ /* synthetic */ C0355k b1(int i10, InterfaceC0276j interfaceC0276j, InterfaceC0285t interfaceC0285t, M m2, M8.h hVar, p096j9.f fVar) {
        return q1(interfaceC0276j, interfaceC0285t, i10, hVar, m2);
    }

    @Override // O8.w, L8.InterfaceC0285t
    public final boolean q0() {
        return false;
    }

    public final c q1(InterfaceC0276j interfaceC0276j, InterfaceC0285t interfaceC0285t, int i10, M8.h hVar, M m2) {
        i.f(interfaceC0276j, "newOwner");
        AbstractC0487g.p(i10, "kind");
        i.f(hVar, "annotations");
        c cVar = new c((InterfaceC0271e) interfaceC0276j, (InterfaceC0275i) interfaceC0285t, hVar, this.f3717V, i10, this.f16052W, this.f16053X, this.f16054Y, this.f16055Z, this.f16056a0, m2);
        cVar.f3778N = this.f3778N;
        return cVar;
    }

    @Override // O8.w, L8.InterfaceC0285t
    public final boolean t() {
        return false;
    }

    @Override // O8.w, L8.InterfaceC0285t
    public final boolean u() {
        return false;
    }

    @Override // p238y9.i
    public final g w0() {
        return this.f16054Y;
    }
}
