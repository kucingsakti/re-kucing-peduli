package androidx.datastore.preferences.protobuf;

import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes.dex */
public final class d0 extends AbstractMap {

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final /* synthetic */ int f6452y = 0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final int f6453s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public List f6454t = Collections.EMPTY_LIST;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public Map f6455u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f6456v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public volatile i0 f6457w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Map f6458x;

    public d0(int i10) {
        this.f6453s = i10;
        Map map = Collections.EMPTY_MAP;
        this.f6455u = map;
        this.f6458x = map;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0024  */
    /* JADX WARN: Code duplicated, block: B:17:0x003e  */
    /* JADX WARN: Code duplicated, block: B:21:0x003c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:22:0x0042 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x0038 A[SYNTHETIC] */
    public final int a(Comparable comparable) {
        int i10;
        int i11;
        int i12;
        int iCompareTo;
        int size = this.f6454t.size();
        int i13 = size - 1;
        if (i13 < 0) {
            i10 = 0;
            while (i10 <= i13) {
                i12 = (i10 + i13) / 2;
                iCompareTo = comparable.compareTo(((g0) this.f6454t.get(i12)).f6463s);
                if (iCompareTo < 0) {
                    i13 = i12 - 1;
                } else {
                    if (iCompareTo > 0) {
                        return i12;
                    }
                    i10 = i12 + 1;
                }
            }
            i11 = i10 + 1;
        } else {
            int iCompareTo2 = comparable.compareTo(((g0) this.f6454t.get(i13)).f6463s);
            if (iCompareTo2 > 0) {
                i11 = size + 1;
            } else {
                if (iCompareTo2 == 0) {
                    return i13;
                }
                i10 = 0;
                while (i10 <= i13) {
                    i12 = (i10 + i13) / 2;
                    iCompareTo = comparable.compareTo(((g0) this.f6454t.get(i12)).f6463s);
                    if (iCompareTo < 0) {
                        i13 = i12 - 1;
                    } else {
                        if (iCompareTo > 0) {
                            return i12;
                        }
                        i10 = i12 + 1;
                    }
                }
                i11 = i10 + 1;
            }
        }
        return -i11;
    }

    public final void b() {
        if (this.f6456v) {
            throw new UnsupportedOperationException();
        }
    }

    public final Map.Entry c(int i10) {
        return (Map.Entry) this.f6454t.get(i10);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        b();
        if (!this.f6454t.isEmpty()) {
            this.f6454t.clear();
        }
        if (this.f6455u.isEmpty()) {
            return;
        }
        this.f6455u.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return a(comparable) >= 0 || this.f6455u.containsKey(comparable);
    }

    public final Iterable e() {
        return this.f6455u.isEmpty() ? P.f6421b : this.f6455u.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        if (this.f6457w == null) {
            this.f6457w = new i0(this, 0);
        }
        return this.f6457w;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d0)) {
            return super.equals(obj);
        }
        d0 d0Var = (d0) obj;
        int size = size();
        if (size == d0Var.size()) {
            int size2 = this.f6454t.size();
            if (size2 != d0Var.f6454t.size()) {
                return ((AbstractSet) entrySet()).equals(d0Var.entrySet());
            }
            for (int i10 = 0; i10 < size2; i10++) {
                if (c(i10).equals(d0Var.c(i10))) {
                }
            }
            if (size2 != size) {
                return this.f6455u.equals(d0Var.f6455u);
            }
            return true;
        }
        return false;
    }

    public final SortedMap f() {
        b();
        if (this.f6455u.isEmpty() && !(this.f6455u instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f6455u = treeMap;
            this.f6458x = treeMap.descendingMap();
        }
        return (SortedMap) this.f6455u;
    }

    public final Object g(Comparable comparable, Object obj) {
        b();
        int iA = a(comparable);
        if (iA >= 0) {
            return ((g0) this.f6454t.get(iA)).setValue(obj);
        }
        b();
        boolean zIsEmpty = this.f6454t.isEmpty();
        int i10 = this.f6453s;
        if (zIsEmpty && !(this.f6454t instanceof ArrayList)) {
            this.f6454t = new ArrayList(i10);
        }
        int i11 = -(iA + 1);
        if (i11 >= i10) {
            return f().put(comparable, obj);
        }
        if (this.f6454t.size() == i10) {
            g0 g0Var = (g0) this.f6454t.remove(i10 - 1);
            f().put(g0Var.f6463s, g0Var.f6464t);
        }
        this.f6454t.add(i11, new g0(this, comparable, obj));
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int iA = a(comparable);
        return iA >= 0 ? ((g0) this.f6454t.get(iA)).f6464t : this.f6455u.get(comparable);
    }

    public final Object h(int i10) {
        b();
        Object obj = ((g0) this.f6454t.remove(i10)).f6464t;
        if (!this.f6455u.isEmpty()) {
            Iterator it = f().entrySet().iterator();
            List list = this.f6454t;
            Map.Entry entry = (Map.Entry) it.next();
            list.add(new g0(this, (Comparable) entry.getKey(), entry.getValue()));
            it.remove();
        }
        return obj;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int size = this.f6454t.size();
        int iHashCode = 0;
        for (int i10 = 0; i10 < size; i10++) {
            iHashCode += ((g0) this.f6454t.get(i10)).hashCode();
        }
        return this.f6455u.size() > 0 ? this.f6455u.hashCode() + iHashCode : iHashCode;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* synthetic */ Object put(Object obj, Object obj2) {
        if (obj == null) {
            return g(null, obj2);
        }
        throw new ClassCastException();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        b();
        Comparable comparable = (Comparable) obj;
        int iA = a(comparable);
        if (iA >= 0) {
            return h(iA);
        }
        if (this.f6455u.isEmpty()) {
            return null;
        }
        return this.f6455u.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f6455u.size() + this.f6454t.size();
    }
}
