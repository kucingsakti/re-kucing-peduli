package J8;

import A9.AbstractC0129b;
import A9.C0133f;
import A9.K;
import A9.T;
import I8.o;
import L8.AbstractC0287v;
import L8.InterfaceC0271e;
import L8.InterfaceC0273g;
import L8.InterfaceC0290y;
import L8.N;
import L8.P;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import kotlin.NoWhenBranchMatchedException;
import p086i8.k;
import p086i8.l;
import p086i8.m;
import p086i8.s;
import p210v8.i;

/* JADX INFO: loaded from: classes.dex */
public final class b extends AbstractC0129b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ c f2442c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar) {
        super(cVar.f2448w);
        this.f2442c = cVar;
    }

    @Override // A9.AbstractC0135h
    public final Collection b() {
        List listU;
        Iterable iterableU;
        c cVar = this.f2442c;
        int iOrdinal = cVar.f2450y.ordinal();
        if (iOrdinal == 0 || iOrdinal == 1) {
            listU = com.bumptech.glide.d.u(c.f2443D);
        } else {
            int i10 = cVar.f2451z;
            if (iOrdinal == 2) {
                listU = l.C(c.f2444E, new p096j9.b(o.f2197k, e.f2454v.f(i10)));
            } else {
                if (iOrdinal != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                listU = l.C(c.f2444E, new p096j9.b(o.f2192e, e.f2455w.f(i10)));
            }
        }
        InterfaceC0290y interfaceC0290yV = cVar.f2449x.v();
        List<p096j9.b> list = listU;
        ArrayList arrayList = new ArrayList(m.H(list, 10));
        for (p096j9.b bVar : list) {
            InterfaceC0271e interfaceC0271eD = AbstractC0287v.d(interfaceC0290yV, bVar);
            if (interfaceC0271eD == null) {
                throw new IllegalStateException(("Built-in class " + bVar + " not found").toString());
            }
            int size = interfaceC0271eD.I().u().size();
            List list2 = cVar.f2447C;
            i.f(list2, "<this>");
            if (size < 0) {
                throw new IllegalArgumentException(E0.a.g("Requested element count ", size, " is less than zero.").toString());
            }
            if (size == 0) {
                iterableU = s.f12328s;
            } else {
                int size2 = list2.size();
                if (size >= size2) {
                    iterableU = k.s0(list2);
                } else if (size == 1) {
                    iterableU = com.bumptech.glide.d.u(k.b0(list2));
                } else {
                    ArrayList arrayList2 = new ArrayList(size);
                    if (list2 instanceof RandomAccess) {
                        for (int i11 = size2 - size; i11 < size2; i11++) {
                            arrayList2.add(list2.get(i11));
                        }
                    } else {
                        ListIterator listIterator = list2.listIterator(size2 - size);
                        while (listIterator.hasNext()) {
                            arrayList2.add(listIterator.next());
                        }
                    }
                    iterableU = arrayList2;
                }
            }
            Iterable iterable = iterableU;
            ArrayList arrayList3 = new ArrayList(m.H(iterable, 10));
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                arrayList3.add(new T(((P) it.next()).p()));
            }
            K.f338t.getClass();
            arrayList.add(C0133f.q(K.f339u, interfaceC0271eD, arrayList3));
        }
        return k.s0(arrayList);
    }

    @Override // A9.AbstractC0135h
    public final N d() {
        return N.f2801u;
    }

    @Override // A9.AbstractC0129b
    /* JADX INFO: renamed from: i */
    public final InterfaceC0271e w() {
        return this.f2442c;
    }

    public final String toString() {
        return this.f2442c.toString();
    }

    @Override // A9.O
    public final List u() {
        return this.f2442c.f2447C;
    }

    @Override // A9.O
    public final boolean v() {
        return true;
    }

    @Override // A9.AbstractC0129b, A9.O
    public final InterfaceC0273g w() {
        return this.f2442c;
    }
}
