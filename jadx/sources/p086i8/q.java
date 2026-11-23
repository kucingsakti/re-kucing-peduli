package p086i8;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import p210v8.i;

/* JADX INFO: loaded from: classes.dex */
public abstract class q extends p {
    public static void J(Collection collection, Iterable iterable) {
        i.f(collection, "<this>");
        i.f(iterable, "elements");
        if (iterable instanceof Collection) {
            collection.addAll((Collection) iterable);
            return;
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            collection.add(it.next());
        }
    }

    public static Object K(List list) {
        i.f(list, "<this>");
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.remove(l.B(list));
    }
}
