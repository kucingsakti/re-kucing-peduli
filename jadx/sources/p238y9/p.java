package p238y9;

import L8.InterfaceC0276j;
import L8.InterfaceC0285t;
import L8.M;
import O8.N;
import O8.w;
import androidx.datastore.preferences.protobuf.AbstractC0487g;
import com.unity3d.ads.metadata.MediationMetaData;
import p047e9.C0632y;
import p067g9.f;
import p067g9.g;
import p067g9.h;
import p104k9.AbstractC0672a;
import p210v8.i;

/* JADX INFO: loaded from: classes.dex */
public final class p extends N implements b {

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public final C0632y f16109V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public final f f16110W;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public final g f16111X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final h f16112Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public final p029c9.f f16113Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(InterfaceC0276j interfaceC0276j, N n10, M8.h hVar, p096j9.f fVar, int i10, C0632y c0632y, f fVar2, g gVar, h hVar2, p029c9.f fVar3, M m2) {
        super(interfaceC0276j, n10, hVar, fVar, i10, m2 == null ? M.a : m2);
        i.f(interfaceC0276j, "containingDeclaration");
        i.f(hVar, "annotations");
        AbstractC0487g.p(i10, "kind");
        i.f(c0632y, "proto");
        i.f(fVar2, "nameResolver");
        i.f(gVar, "typeTable");
        i.f(hVar2, "versionRequirementTable");
        this.f16109V = c0632y;
        this.f16110W = fVar2;
        this.f16111X = gVar;
        this.f16112Y = hVar2;
        this.f16113Z = fVar3;
    }

    @Override // p238y9.i
    public final h B() {
        return this.f16113Z;
    }

    @Override // p238y9.i
    public final f J0() {
        return this.f16110W;
    }

    @Override // p238y9.i
    public final AbstractC0672a W() {
        return this.f16109V;
    }

    @Override // O8.N, O8.w
    public final w b1(int i10, InterfaceC0276j interfaceC0276j, InterfaceC0285t interfaceC0285t, M m2, M8.h hVar, p096j9.f fVar) {
        p096j9.f fVar2;
        i.f(interfaceC0276j, "newOwner");
        AbstractC0487g.p(i10, "kind");
        i.f(hVar, "annotations");
        N n10 = (N) interfaceC0285t;
        if (fVar == null) {
            p096j9.f name = getName();
            i.e(name, MediationMetaData.KEY_NAME);
            fVar2 = name;
        } else {
            fVar2 = fVar;
        }
        p pVar = new p(interfaceC0276j, n10, hVar, fVar2, i10, this.f16109V, this.f16110W, this.f16111X, this.f16112Y, this.f16113Z, m2);
        pVar.f3778N = this.f3778N;
        return pVar;
    }

    @Override // p238y9.i
    public final g w0() {
        return this.f16111X;
    }
}
