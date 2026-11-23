package p220w9;

import A9.AbstractC0151y;
import I4.c;
import K0.q;
import L8.InterfaceC0276j;
import p047e9.G;
import p145o9.g;
import p200u8.a;
import p210v8.i;
import p210v8.k;
import p247z9.h;
import p247z9.l;

/* JADX INFO: loaded from: classes.dex */
public final class o extends k implements a {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f15674s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ q f15675t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ G f15676u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ p238y9.o f15677v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o(q qVar, G g8, p238y9.o oVar, int i10) {
        super(0);
        this.f15674s = i10;
        this.f15675t = qVar;
        this.f15676u = g8;
        this.f15677v = oVar;
    }

    @Override // p200u8.a
    public final Object invoke() {
        switch (this.f15674s) {
            case 0:
                q qVar = this.f15675t;
                q qVarA = qVar.a((InterfaceC0276j) qVar.a.f5173c);
                i.c(qVarA);
                a aVar = (a) ((c) qVar.a.a).f2082e;
                AbstractC0151y abstractC0151yW = this.f15677v.w();
                i.e(abstractC0151yW, "property.returnType");
                return (g) aVar.o0(qVarA, this.f15676u, abstractC0151yW);
            case 1:
                q qVar2 = this.f15675t;
                l lVar = (l) ((c) qVar2.a.a).a;
                o oVar = new o(qVar2, this.f15676u, this.f15677v, 0);
                lVar.getClass();
                return new h(lVar, oVar);
            case 2:
                q qVar3 = this.f15675t;
                q qVarA2 = qVar3.a((InterfaceC0276j) qVar3.a.f5173c);
                i.c(qVarA2);
                a aVar2 = (a) ((c) qVar3.a.a).f2082e;
                AbstractC0151y abstractC0151yW2 = this.f15677v.w();
                i.e(abstractC0151yW2, "property.returnType");
                return (g) aVar2.y0(qVarA2, this.f15676u, abstractC0151yW2);
            default:
                q qVar4 = this.f15675t;
                l lVar2 = (l) ((c) qVar4.a.a).a;
                o oVar2 = new o(qVar4, this.f15676u, this.f15677v, 2);
                lVar2.getClass();
                return new h(lVar2, oVar2);
        }
    }
}
