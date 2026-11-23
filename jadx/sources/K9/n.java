package K9;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public abstract class n extends o {
    public static g A(l lVar, p200u8.b bVar) {
        return new g(new u(lVar, bVar), false, q.f2702v);
    }

    public static List B(l lVar) {
        Iterator it = lVar.iterator();
        if (!it.hasNext()) {
            return p086i8.s.f12328s;
        }
        Object next = it.next();
        if (!it.hasNext()) {
            return com.bumptech.glide.d.u(next);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(next);
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }

    public static l s(Iterator it) {
        p210v8.i.f(it, "<this>");
        return new a(new p(it, 0));
    }

    public static int t(l lVar) {
        Iterator it = lVar.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            it.next();
            i10++;
            if (i10 < 0) {
                throw new ArithmeticException("Count overflow has happened.");
            }
        }
        return i10;
    }

    public static l u(l lVar, int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException(E0.a.g("Requested element count ", i10, " is less than zero.").toString());
        }
        if (i10 == 0) {
            return lVar;
        }
        return lVar instanceof d ? ((d) lVar).a(i10) : new c(lVar, i10);
    }

    public static Object v(g gVar) {
        f fVar = new f(gVar);
        if (fVar.hasNext()) {
            return fVar.next();
        }
        return null;
    }

    public static final i w(l lVar) {
        q qVar = q.f2700t;
        if (!(lVar instanceof u)) {
            return new i(lVar, q.f2701u, qVar);
        }
        u uVar = (u) lVar;
        return new i(uVar.a, uVar.f2710b, qVar);
    }

    public static l x(Object obj, p200u8.b bVar) {
        p210v8.i.f(bVar, "nextFunction");
        return obj == null ? e.a : new k(new A0.r(obj, 17), bVar);
    }

    public static Object y(l lVar) {
        Iterator it = lVar.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException("Sequence is empty.");
        }
        Object next = it.next();
        while (it.hasNext()) {
            next = it.next();
        }
        return next;
    }

    public static u z(l lVar, p200u8.b bVar) {
        p210v8.i.f(bVar, "transform");
        return new u(lVar, bVar);
    }
}
