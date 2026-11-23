package p238y9;

import L8.C0280n;
import L8.InterfaceC0276j;
import L8.M;
import O8.K;
import androidx.datastore.preferences.protobuf.AbstractC0487g;
import com.unity3d.ads.metadata.MediationMetaData;
import p047e9.G;
import p067g9.e;
import p067g9.f;
import p067g9.g;
import p067g9.h;
import p104k9.AbstractC0672a;
import p210v8.i;

/* JADX INFO: loaded from: classes.dex */
public final class o extends K implements b {

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public final G f16104S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public final f f16105T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public final g f16106U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public final h f16107V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public final p029c9.f f16108W;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(InterfaceC0276j interfaceC0276j, L8.K k3, M8.h hVar, int i10, C0280n c0280n, boolean z6, p096j9.f fVar, int i11, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, G g8, f fVar2, g gVar, h hVar2, p029c9.f fVar3) {
        super(interfaceC0276j, k3, hVar, i10, c0280n, z6, fVar, i11, M.a, z10, z11, z14, z12, z13);
        i.f(interfaceC0276j, "containingDeclaration");
        i.f(hVar, "annotations");
        AbstractC0487g.p(i10, "modality");
        i.f(c0280n, "visibility");
        i.f(fVar, MediationMetaData.KEY_NAME);
        AbstractC0487g.p(i11, "kind");
        i.f(g8, "proto");
        i.f(fVar2, "nameResolver");
        i.f(gVar, "typeTable");
        i.f(hVar2, "versionRequirementTable");
        this.f16104S = g8;
        this.f16105T = fVar2;
        this.f16106U = gVar;
        this.f16107V = hVar2;
        this.f16108W = fVar3;
    }

    @Override // p238y9.i
    public final h B() {
        return this.f16108W;
    }

    @Override // O8.K, L8.InterfaceC0288w
    public final boolean F() {
        return e.f11552D.c(this.f16104S.f10800v).booleanValue();
    }

    @Override // p238y9.i
    public final f J0() {
        return this.f16105T;
    }

    @Override // p238y9.i
    public final AbstractC0672a W() {
        return this.f16104S;
    }

    @Override // O8.K
    public final K b1(InterfaceC0276j interfaceC0276j, int i10, C0280n c0280n, L8.K k3, int i11, p096j9.f fVar) {
        i.f(interfaceC0276j, "newOwner");
        AbstractC0487g.p(i10, "newModality");
        i.f(c0280n, "newVisibility");
        AbstractC0487g.p(i11, "kind");
        i.f(fVar, "newName");
        return new o(interfaceC0276j, k3, q(), i10, c0280n, this.f3672x, fVar, i11, this.f3660F, this.f3661G, F(), this.f3664J, this.f3662H, this.f16104S, this.f16105T, this.f16106U, this.f16107V, this.f16108W);
    }

    @Override // p238y9.i
    public final g w0() {
        return this.f16106U;
    }
}
