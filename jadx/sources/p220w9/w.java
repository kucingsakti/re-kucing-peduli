package p220w9;

import I4.c;
import J7.a;
import L8.AbstractC0287v;
import L8.InterfaceC0273g;
import L8.InterfaceC0290y;
import p.b1;
import p047e9.Q;
import p067g9.f;
import p067g9.g;
import p200u8.b;
import p210v8.i;
import p210v8.k;
import p238y9.q;

/* JADX INFO: loaded from: classes.dex */
public final class w extends k implements b {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f15693s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ b1 f15694t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w(b1 b1Var, int i10) {
        super(1);
        this.f15693s = i10;
        this.f15694t = b1Var;
    }

    @Override // p200u8.b
    public final Object invoke(Object obj) {
        switch (this.f15693s) {
            case 0:
                int iIntValue = ((Number) obj).intValue();
                V3.b bVar = (V3.b) this.f15694t.f14037t;
                p096j9.b bVarE = a.e((f) bVar.f5172b, iIntValue);
                boolean z6 = bVarE.f12542c;
                c cVar = (c) bVar.a;
                return z6 ? cVar.b(bVarE) : AbstractC0287v.e((InterfaceC0290y) cVar.f2079b, bVarE);
            case 1:
                int iIntValue2 = ((Number) obj).intValue();
                V3.b bVar2 = (V3.b) this.f15694t.f14037t;
                p096j9.b bVarE2 = a.e((f) bVar2.f5172b, iIntValue2);
                if (!bVarE2.f12542c) {
                    InterfaceC0290y interfaceC0290y = (InterfaceC0290y) ((c) bVar2.a).f2079b;
                    i.f(interfaceC0290y, "<this>");
                    InterfaceC0273g interfaceC0273gE = AbstractC0287v.e(interfaceC0290y, bVarE2);
                    if (interfaceC0273gE instanceof q) {
                        return (q) interfaceC0273gE;
                    }
                }
                return null;
            default:
                Q q10 = (Q) obj;
                i.f(q10, "it");
                return C3.a.k(q10, (g) ((V3.b) this.f15694t.f14037t).f5174d);
        }
    }
}
