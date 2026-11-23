package O8;

import L8.AbstractC0287v;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class y extends p210v8.k implements p200u8.a {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f3792s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ z f3793t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y(z zVar, int i10) {
        super(0);
        this.f3792s = i10;
        this.f3793t = zVar;
    }

    @Override // p200u8.a
    public final Object invoke() {
        switch (this.f3792s) {
            case 0:
                z zVar = this.f3793t;
                C c10 = zVar.f3795u;
                c10.Y0();
                return Boolean.valueOf(AbstractC0287v.h((C0358n) c10.f3620C.getValue(), zVar.f3796v));
            case 1:
                z zVar2 = this.f3793t;
                C c11 = zVar2.f3795u;
                c11.Y0();
                return AbstractC0287v.i((C0358n) c11.f3620C.getValue(), zVar2.f3796v);
            default:
                z zVar3 = this.f3793t;
                p247z9.i iVar = zVar3.f3798x;
                C8.u[] uVarArr = z.f3794z;
                if (((Boolean) J7.j.o(iVar, uVarArr[1])).booleanValue()) {
                    return t9.m.f15259b;
                }
                List list = (List) J7.j.o(zVar3.f3797w, uVarArr[0]);
                ArrayList arrayList = new ArrayList(p086i8.m.H(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(((L8.D) it.next()).E0());
                }
                C c12 = zVar3.f3795u;
                p096j9.c cVar = zVar3.f3796v;
                return p068ga.l.b("package view scope for " + cVar + " in " + c12.getName(), p086i8.k.h0(arrayList, new O(c12, cVar)));
        }
    }
}
