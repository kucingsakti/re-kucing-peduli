package p238y9;

import A9.AbstractC0135h;
import java.util.Collection;
import p200u8.a;
import p210v8.i;
import p210v8.k;
import t9.f;
import t9.n;

/* JADX INFO: loaded from: classes.dex */
public final class d extends k implements a {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f16057s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ e f16058t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(e eVar, int i10) {
        super(0);
        this.f16057s = i10;
        this.f16058t = eVar;
    }

    @Override // p200u8.a
    public final Object invoke() {
        switch (this.f16057s) {
            case 0:
                f fVar = f.f15238m;
                n.a.getClass();
                return this.f16058t.i(fVar, t9.k.f15254t);
            default:
                e eVar = this.f16058t;
                eVar.f16059g.getClass();
                g gVar = eVar.j;
                i.f(gVar, "classDescriptor");
                Collection collectionT = ((AbstractC0135h) gVar.I()).t();
                i.e(collectionT, "classDescriptor.typeConstructor.supertypes");
                return collectionT;
        }
    }
}
