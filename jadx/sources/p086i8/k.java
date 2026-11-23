package p086i8;

import B8.c;
import J7.a;
import K9.p;
import K9.r;
import androidx.datastore.preferences.protobuf.AbstractC0487g;
import com.bumptech.glide.d;
import java.util.AbstractCollection;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import java.util.Set;
import p076h8.f;
import p200u8.b;
import p210v8.i;

/* JADX INFO: loaded from: classes.dex */
public abstract class k extends q {
    public static final int L(List list, int i10) {
        if (new c(0, l.B(list), 1).f(i10)) {
            return l.B(list) - i10;
        }
        StringBuilder sbL = AbstractC0487g.l("Element index ", i10, " must be in range [");
        sbL.append(new c(0, l.B(list), 1));
        sbL.append("].");
        throw new IndexOutOfBoundsException(sbL.toString());
    }

    public static final int M(List list, int i10) {
        if (new c(0, list.size(), 1).f(i10)) {
            return list.size() - i10;
        }
        StringBuilder sbL = AbstractC0487g.l("Position index ", i10, " must be in range [");
        sbL.append(new c(0, list.size(), 1));
        sbL.append("].");
        throw new IndexOutOfBoundsException(sbL.toString());
    }

    public static p N(Iterable iterable) {
        i.f(iterable, "<this>");
        return new p(iterable, 2);
    }

    public static boolean O(Iterable iterable, Object obj) {
        int iIndexOf;
        i.f(iterable, "<this>");
        if (iterable instanceof Collection) {
            return ((Collection) iterable).contains(obj);
        }
        if (iterable instanceof List) {
            iIndexOf = ((List) iterable).indexOf(obj);
        } else {
            int i10 = 0;
            for (Object obj2 : iterable) {
                if (i10 < 0) {
                    l.G();
                    throw null;
                }
                if (i.a(obj, obj2)) {
                    iIndexOf = i10;
                } else {
                    i10++;
                }
            }
            iIndexOf = -1;
        }
        return iIndexOf >= 0;
    }

    public static List P(Iterable iterable) {
        ArrayList arrayList;
        i.f(iterable, "<this>");
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            int size = collection.size() - 1;
            if (size <= 0) {
                return s.f12328s;
            }
            if (size == 1) {
                return d.u(a0(iterable));
            }
            arrayList = new ArrayList(size);
            if (iterable instanceof List) {
                if (iterable instanceof RandomAccess) {
                    int size2 = collection.size();
                    for (int i10 = 1; i10 < size2; i10++) {
                        arrayList.add(((List) iterable).get(i10));
                    }
                } else {
                    ListIterator listIterator = ((List) iterable).listIterator(1);
                    while (listIterator.hasNext()) {
                        arrayList.add(listIterator.next());
                    }
                }
                return arrayList;
            }
        } else {
            arrayList = new ArrayList();
        }
        int i11 = 0;
        for (Object obj : iterable) {
            if (i11 >= 1) {
                arrayList.add(obj);
            } else {
                i11++;
            }
        }
        return l.F(arrayList);
    }

    public static List Q(List list) {
        i.f(list, "<this>");
        List list2 = list;
        int size = list.size() - 1;
        if (size < 0) {
            size = 0;
        }
        return p0(list2, size);
    }

    public static ArrayList R(Iterable iterable) {
        i.f(iterable, "<this>");
        ArrayList arrayList = new ArrayList();
        for (Object obj : iterable) {
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static Object S(Iterable iterable) {
        i.f(iterable, "<this>");
        if (iterable instanceof List) {
            return T((List) iterable);
        }
        Iterator it = iterable.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        throw new NoSuchElementException("Collection is empty.");
    }

    public static Object T(List list) {
        i.f(list, "<this>");
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.get(0);
    }

    public static Object U(Iterable iterable) {
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (list.isEmpty()) {
                return null;
            }
            return list.get(0);
        }
        Iterator it = iterable.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        return null;
    }

    public static Object V(List list) {
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    public static Object W(List list, int i10) {
        i.f(list, "<this>");
        if (i10 < 0 || i10 > l.B(list)) {
            return null;
        }
        return list.get(i10);
    }

    public static final void X(Iterable iterable, StringBuilder sb, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, CharSequence charSequence4, b bVar) {
        i.f(iterable, "<this>");
        i.f(sb, "buffer");
        i.f(charSequence2, "prefix");
        i.f(charSequence3, "postfix");
        sb.append(charSequence2);
        int i10 = 0;
        for (Object obj : iterable) {
            i10++;
            if (i10 > 1) {
                sb.append(charSequence);
            }
            a.a(sb, obj, bVar);
        }
        sb.append(charSequence3);
    }

    public static /* synthetic */ void Y(Iterable iterable, StringBuilder sb, String str, String str2, String str3, b bVar, int i10) {
        if ((i10 & 4) != 0) {
            str2 = "";
        }
        if ((i10 & 8) != 0) {
            str3 = "";
        }
        if ((i10 & 64) != 0) {
            bVar = null;
        }
        X(iterable, sb, str, str2, str3, "...", bVar);
    }

    public static String Z(Iterable iterable, String str, String str2, String str3, b bVar, int i10) {
        if ((i10 & 1) != 0) {
            str = ", ";
        }
        String str4 = str;
        String str5 = (i10 & 2) != 0 ? "" : str2;
        String str6 = (i10 & 4) != 0 ? "" : str3;
        if ((i10 & 32) != 0) {
            bVar = null;
        }
        i.f(iterable, "<this>");
        i.f(str5, "prefix");
        StringBuilder sb = new StringBuilder();
        X(iterable, sb, str4, str5, str6, "...", bVar);
        String string = sb.toString();
        i.e(string, "toString(...)");
        return string;
    }

    public static Object a0(Iterable iterable) {
        i.f(iterable, "<this>");
        if (iterable instanceof List) {
            return b0((List) iterable);
        }
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException("Collection is empty.");
        }
        Object next = it.next();
        while (it.hasNext()) {
            next = it.next();
        }
        return next;
    }

    public static Object b0(List list) {
        i.f(list, "<this>");
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.get(l.B(list));
    }

    public static Object c0(List list) {
        i.f(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return list.get(list.size() - 1);
    }

    public static Comparable d0(ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            return null;
        }
        Comparable comparable = (Comparable) it.next();
        while (it.hasNext()) {
            Comparable comparable2 = (Comparable) it.next();
            if (comparable.compareTo(comparable2) < 0) {
                comparable = comparable2;
            }
        }
        return comparable;
    }

    public static ArrayList e0(Iterable iterable, Iterable iterable2) {
        i.f(iterable, "<this>");
        if (iterable instanceof Collection) {
            return g0((Collection) iterable, iterable2);
        }
        ArrayList arrayList = new ArrayList();
        q.J(arrayList, iterable);
        q.J(arrayList, iterable2);
        return arrayList;
    }

    public static ArrayList f0(Iterable iterable, Object obj) {
        if (iterable instanceof Collection) {
            return h0((Collection) iterable, obj);
        }
        ArrayList arrayList = new ArrayList();
        q.J(arrayList, iterable);
        arrayList.add(obj);
        return arrayList;
    }

    public static ArrayList g0(Collection collection, Iterable iterable) {
        i.f(collection, "<this>");
        i.f(iterable, "elements");
        if (!(iterable instanceof Collection)) {
            ArrayList arrayList = new ArrayList(collection);
            q.J(arrayList, iterable);
            return arrayList;
        }
        Collection collection2 = (Collection) iterable;
        ArrayList arrayList2 = new ArrayList(collection2.size() + collection.size());
        arrayList2.addAll(collection);
        arrayList2.addAll(collection2);
        return arrayList2;
    }

    public static ArrayList h0(Collection collection, Object obj) {
        i.f(collection, "<this>");
        ArrayList arrayList = new ArrayList(collection.size() + 1);
        arrayList.addAll(collection);
        arrayList.add(obj);
        return arrayList;
    }

    public static List i0(Iterable iterable) {
        i.f(iterable, "<this>");
        if ((iterable instanceof Collection) && ((Collection) iterable).size() <= 1) {
            return s0(iterable);
        }
        List listU0 = u0(iterable);
        Collections.reverse(listU0);
        return listU0;
    }

    public static Object j0(Iterable iterable) {
        i.f(iterable, "<this>");
        if (iterable instanceof List) {
            return k0((List) iterable);
        }
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException("Collection is empty.");
        }
        Object next = it.next();
        if (it.hasNext()) {
            throw new IllegalArgumentException("Collection has more than one element.");
        }
        return next;
    }

    public static Object k0(List list) {
        i.f(list, "<this>");
        int size = list.size();
        if (size == 0) {
            throw new NoSuchElementException("List is empty.");
        }
        if (size == 1) {
            return list.get(0);
        }
        throw new IllegalArgumentException("List has more than one element.");
    }

    public static Object l0(Iterable iterable) {
        i.f(iterable, "<this>");
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (list.size() == 1) {
                return list.get(0);
            }
            return null;
        }
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        Object next = it.next();
        if (it.hasNext()) {
            return null;
        }
        return next;
    }

    public static Object m0(List list) {
        i.f(list, "<this>");
        if (list.size() == 1) {
            return list.get(0);
        }
        return null;
    }

    public static List n0(AbstractList abstractList) {
        i.f(abstractList, "<this>");
        if (abstractList.size() <= 1) {
            return s0(abstractList);
        }
        Object[] array = abstractList.toArray(new Comparable[0]);
        Comparable[] comparableArr = (Comparable[]) array;
        i.f(comparableArr, "<this>");
        if (comparableArr.length > 1) {
            Arrays.sort(comparableArr);
        }
        return i.l(array);
    }

    public static List o0(Iterable iterable, Comparator comparator) {
        i.f(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            List listU0 = u0(iterable);
            p.I(listU0, comparator);
            return listU0;
        }
        Collection collection = (Collection) iterable;
        if (collection.size() <= 1) {
            return s0(iterable);
        }
        Object[] array = collection.toArray(new Object[0]);
        i.f(array, "<this>");
        if (array.length > 1) {
            Arrays.sort(array, comparator);
        }
        return i.l(array);
    }

    public static List p0(Iterable iterable, int i10) {
        i.f(iterable, "<this>");
        if (i10 < 0) {
            throw new IllegalArgumentException(E0.a.g("Requested element count ", i10, " is less than zero.").toString());
        }
        if (i10 == 0) {
            return s.f12328s;
        }
        if (iterable instanceof Collection) {
            if (i10 >= ((Collection) iterable).size()) {
                return s0(iterable);
            }
            if (i10 == 1) {
                return d.u(S(iterable));
            }
        }
        ArrayList arrayList = new ArrayList(i10);
        Iterator it = iterable.iterator();
        int i11 = 0;
        while (it.hasNext()) {
            arrayList.add(it.next());
            i11++;
            if (i11 == i10) {
                break;
            }
        }
        return l.F(arrayList);
    }

    public static final void q0(Iterable iterable, AbstractCollection abstractCollection) {
        i.f(iterable, "<this>");
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            abstractCollection.add(it.next());
        }
    }

    public static int[] r0(Collection collection) {
        i.f(collection, "<this>");
        int[] iArr = new int[collection.size()];
        Iterator it = collection.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            iArr[i10] = ((Number) it.next()).intValue();
            i10++;
        }
        return iArr;
    }

    public static List s0(Iterable iterable) {
        i.f(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            return l.F(u0(iterable));
        }
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            return s.f12328s;
        }
        if (size != 1) {
            return t0(collection);
        }
        return d.u(iterable instanceof List ? ((List) iterable).get(0) : iterable.iterator().next());
    }

    public static ArrayList t0(Collection collection) {
        i.f(collection, "<this>");
        return new ArrayList(collection);
    }

    public static final List u0(Iterable iterable) {
        i.f(iterable, "<this>");
        if (iterable instanceof Collection) {
            return t0((Collection) iterable);
        }
        ArrayList arrayList = new ArrayList();
        q0(iterable, arrayList);
        return arrayList;
    }

    public static Set v0(Iterable iterable) {
        i.f(iterable, "<this>");
        if (iterable instanceof Collection) {
            return new LinkedHashSet((Collection) iterable);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        q0(iterable, linkedHashSet);
        return linkedHashSet;
    }

    public static Set w0(Iterable iterable) {
        i.f(iterable, "<this>");
        boolean z6 = iterable instanceof Collection;
        u uVar = u.f12330s;
        if (z6) {
            Collection collection = (Collection) iterable;
            int size = collection.size();
            if (size != 0) {
                if (size == 1) {
                    return C.w(iterable instanceof List ? ((List) iterable).get(0) : iterable.iterator().next());
                }
                LinkedHashSet linkedHashSet = new LinkedHashSet(z.s(collection.size()));
                q0(iterable, linkedHashSet);
                return linkedHashSet;
            }
        } else {
            LinkedHashSet linkedHashSet2 = new LinkedHashSet();
            q0(iterable, linkedHashSet2);
            int size2 = linkedHashSet2.size();
            if (size2 != 0) {
                return size2 != 1 ? linkedHashSet2 : C.w(linkedHashSet2.iterator().next());
            }
        }
        return uVar;
    }

    public static ArrayList x0(ArrayList arrayList, b bVar) {
        int size = arrayList.size();
        ArrayList arrayList2 = new ArrayList((size % 1 == 0 ? 0 : 1) + size);
        C0664c c0664c = new C0664c(arrayList);
        for (int i10 = 0; i10 >= 0 && i10 < size; i10++) {
            int i11 = size - i10;
            if (2 <= i11) {
                i11 = 2;
            }
            if (i11 < 2) {
                break;
            }
            int i12 = i11 + i10;
            p181s3.a.c(i10, i12, c0664c.f12319v.size());
            c0664c.f12317t = i10;
            c0664c.f12318u = i12 - i10;
            arrayList2.add(bVar.invoke(c0664c));
        }
        return arrayList2;
    }

    public static r y0(Iterable iterable) {
        i.f(iterable, "<this>");
        return new r(new c2.a(iterable, 9));
    }

    public static ArrayList z0(Iterable iterable, Iterable iterable2) {
        i.f(iterable, "<this>");
        i.f(iterable2, "other");
        Iterator it = iterable.iterator();
        Iterator it2 = iterable2.iterator();
        ArrayList arrayList = new ArrayList(Math.min(m.H(iterable, 10), m.H(iterable2, 10)));
        while (it.hasNext() && it2.hasNext()) {
            arrayList.add(new f(it.next(), it2.next()));
        }
        return arrayList;
    }
}
