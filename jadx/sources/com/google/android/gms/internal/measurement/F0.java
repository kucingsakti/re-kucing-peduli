package com.google.android.gms.internal.measurement;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes.dex */
public final class F0 extends AbstractMap {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ int f8338x = 0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public List f8339s = Collections.EMPTY_LIST;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public Map f8340t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f8341u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public volatile androidx.datastore.preferences.protobuf.i0 f8342v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Map f8343w;

    public F0() {
        Map map = Collections.EMPTY_MAP;
        this.f8340t = map;
        this.f8343w = map;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0024  */
    /* JADX WARN: Code duplicated, block: B:17:0x003d  */
    /* JADX WARN: Code duplicated, block: B:21:0x003b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:22:0x0040 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x0038 A[SYNTHETIC] */
    public final int a(Comparable comparable) {
        int i10;
        int i11;
        int i12;
        int iCompareTo;
        int size = this.f8339s.size();
        int i13 = size - 1;
        if (i13 < 0) {
            i10 = 0;
            while (i10 <= i13) {
                i12 = (i10 + i13) / 2;
                iCompareTo = comparable.compareTo(((G0) this.f8339s.get(i12)).f8344s);
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
            int iCompareTo2 = comparable.compareTo(((G0) this.f8339s.get(i13)).f8344s);
            if (iCompareTo2 > 0) {
                i11 = size + 1;
            } else {
                if (iCompareTo2 == 0) {
                    return i13;
                }
                i10 = 0;
                while (i10 <= i13) {
                    i12 = (i10 + i13) / 2;
                    iCompareTo = comparable.compareTo(((G0) this.f8339s.get(i12)).f8344s);
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

    @Override // java.util.AbstractMap, java.util.Map
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Object put(Comparable comparable, Object obj) {
        h();
        int iA = a(comparable);
        if (iA >= 0) {
            return ((G0) this.f8339s.get(iA)).setValue(obj);
        }
        h();
        if (this.f8339s.isEmpty() && !(this.f8339s instanceof ArrayList)) {
            this.f8339s = new ArrayList(16);
        }
        int i10 = -(iA + 1);
        if (i10 >= 16) {
            return g().put(comparable, obj);
        }
        if (this.f8339s.size() == 16) {
            G0 g8 = (G0) this.f8339s.remove(15);
            g().put(g8.f8344s, g8.f8345t);
        }
        this.f8339s.add(i10, new G0(this, comparable, obj));
        return null;
    }

    public final Map.Entry c(int i10) {
        return (Map.Entry) this.f8339s.get(i10);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        h();
        if (!this.f8339s.isEmpty()) {
            this.f8339s.clear();
        }
        if (this.f8340t.isEmpty()) {
            return;
        }
        this.f8340t.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return a(comparable) >= 0 || this.f8340t.containsKey(comparable);
    }

    public final Object e(int i10) {
        h();
        Object obj = ((G0) this.f8339s.remove(i10)).f8345t;
        if (!this.f8340t.isEmpty()) {
            Iterator it = g().entrySet().iterator();
            List list = this.f8339s;
            Map.Entry entry = (Map.Entry) it.next();
            list.add(new G0(this, (Comparable) entry.getKey(), entry.getValue()));
            it.remove();
        }
        return obj;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        if (this.f8342v == null) {
            this.f8342v = new androidx.datastore.preferences.protobuf.i0(this, 1);
        }
        return this.f8342v;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof F0)) {
            return super.equals(obj);
        }
        F0 f0 = (F0) obj;
        int size = size();
        if (size == f0.size()) {
            int size2 = this.f8339s.size();
            if (size2 != f0.f8339s.size()) {
                return entrySet().equals(f0.entrySet());
            }
            for (int i10 = 0; i10 < size2; i10++) {
                if (c(i10).equals(f0.c(i10))) {
                }
            }
            if (size2 != size) {
                return this.f8340t.equals(f0.f8340t);
            }
            return true;
        }
        return false;
    }

    public final Set f() {
        return this.f8340t.isEmpty() ? Collections.EMPTY_SET : this.f8340t.entrySet();
    }

    public final SortedMap g() {
        h();
        if (this.f8340t.isEmpty() && !(this.f8340t instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f8340t = treeMap;
            this.f8343w = treeMap.descendingMap();
        }
        return (SortedMap) this.f8340t;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int iA = a(comparable);
        return iA >= 0 ? ((G0) this.f8339s.get(iA)).f8345t : this.f8340t.get(comparable);
    }

    public final void h() {
        if (this.f8341u) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int size = this.f8339s.size();
        int iHashCode = 0;
        for (int i10 = 0; i10 < size; i10++) {
            iHashCode += ((G0) this.f8339s.get(i10)).hashCode();
        }
        return this.f8340t.size() > 0 ? this.f8340t.hashCode() + iHashCode : iHashCode;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        h();
        Comparable comparable = (Comparable) obj;
        int iA = a(comparable);
        if (iA >= 0) {
            return e(iA);
        }
        if (this.f8340t.isEmpty()) {
            return null;
        }
        return this.f8340t.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f8340t.size() + this.f8339s.size();
    }
}
