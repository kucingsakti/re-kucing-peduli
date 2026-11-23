package p238y9;

import I4.c;
import J7.a;
import L8.InterfaceC0276j;
import L8.N;
import M8.f;
import M8.g;
import M8.h;
import O8.AbstractC0347c;
import V3.b;
import com.bumptech.glide.d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import p.b1;
import p047e9.Q;
import p047e9.V;
import p047e9.W;
import p086i8.m;
import p210v8.i;
import p247z9.l;

/* JADX INFO: loaded from: classes.dex */
public final class r extends AbstractC0347c {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final b f16128C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final W f16129D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final a f16130E;

    /* JADX WARN: Illegal instructions before constructor call */
    public r(b bVar, W w2, int i10) {
        int i11;
        i.f(bVar, "c");
        c cVar = (c) bVar.a;
        l lVar = (l) cVar.a;
        f fVar = g.a;
        p096j9.f fVarI = a.i((p067g9.f) bVar.f5172b, w2.f10935w);
        V v4 = w2.f10937y;
        i.e(v4, "proto.variance");
        int iOrdinal = v4.ordinal();
        int i12 = 2;
        if (iOrdinal == 0) {
            i11 = i12;
        } else if (iOrdinal == 1) {
            i12 = 3;
            i11 = i12;
        } else {
            if (iOrdinal != 2) {
                throw new NoWhenBranchMatchedException();
            }
            i11 = 1;
        }
        super(lVar, (InterfaceC0276j) bVar.f5173c, fVar, fVarI, i11, w2.f10936x, i10, N.f2801u);
        this.f16128C = bVar;
        this.f16129D = w2;
        this.f16130E = new a((l) cVar.a, new c2.a(this, 27));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v10, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.util.List] */
    @Override // O8.AbstractC0354j
    public final List a1() {
        b bVar = this.f16128C;
        p067g9.g gVar = (p067g9.g) bVar.f5174d;
        W w2 = this.f16129D;
        i.f(w2, "<this>");
        List list = w2.f10938z;
        boolean zIsEmpty = list.isEmpty();
        ?? arrayList = list;
        if (zIsEmpty) {
            arrayList = 0;
        }
        if (arrayList == 0) {
            List list2 = w2.f10928A;
            i.e(list2, "upperBoundIdList");
            List<Integer> list3 = list2;
            arrayList = new ArrayList(m.H(list3, 10));
            for (Integer num : list3) {
                i.e(num, "it");
                arrayList.add(gVar.a(num.intValue()));
            }
        }
        if (arrayList.isEmpty()) {
            return d.u(p165q9.d.e(this).m());
        }
        Iterable iterable = (Iterable) arrayList;
        ArrayList arrayList2 = new ArrayList(m.H(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList2.add(((b1) bVar.f5178h).h((Q) it.next()));
        }
        return arrayList2;
    }

    @Override // B1.a, M8.a
    public final h q() {
        return this.f16130E;
    }
}
