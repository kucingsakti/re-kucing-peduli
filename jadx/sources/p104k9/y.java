package p104k9;

import androidx.datastore.preferences.protobuf.i0;
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
public final class y extends AbstractMap {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ int f12835x = 0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final int f12836s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public List f12837t = Collections.EMPTY_LIST;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public Map f12838u = Collections.EMPTY_MAP;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f12839v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public volatile i0 f12840w;

    public y(int i10) {
        this.f12836s = i10;
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
        int size = this.f12837t.size();
        int i13 = size - 1;
        if (i13 < 0) {
            i10 = 0;
            while (i10 <= i13) {
                i12 = (i10 + i13) / 2;
                iCompareTo = comparable.compareTo(((C) this.f12837t.get(i12)).f12765s);
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
            int iCompareTo2 = comparable.compareTo(((C) this.f12837t.get(i13)).f12765s);
            if (iCompareTo2 > 0) {
                i11 = size + 1;
            } else {
                if (iCompareTo2 == 0) {
                    return i13;
                }
                i10 = 0;
                while (i10 <= i13) {
                    i12 = (i10 + i13) / 2;
                    iCompareTo = comparable.compareTo(((C) this.f12837t.get(i12)).f12765s);
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
        if (this.f12839v) {
            throw new UnsupportedOperationException();
        }
    }

    public final Iterable c() {
        return this.f12838u.isEmpty() ? B.f12764b : this.f12838u.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        b();
        if (!this.f12837t.isEmpty()) {
            this.f12837t.clear();
        }
        if (this.f12838u.isEmpty()) {
            return;
        }
        this.f12838u.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return a(comparable) >= 0 || this.f12838u.containsKey(comparable);
    }

    public final SortedMap e() {
        b();
        if (this.f12838u.isEmpty() && !(this.f12838u instanceof TreeMap)) {
            this.f12838u = new TreeMap();
        }
        return (SortedMap) this.f12838u;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        if (this.f12840w == null) {
            this.f12840w = new i0(this, 2);
        }
        return this.f12840w;
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public final Object put(Comparable comparable, Object obj) {
        b();
        int iA = a(comparable);
        if (iA >= 0) {
            return ((C) this.f12837t.get(iA)).setValue(obj);
        }
        b();
        boolean zIsEmpty = this.f12837t.isEmpty();
        int i10 = this.f12836s;
        if (zIsEmpty && !(this.f12837t instanceof ArrayList)) {
            this.f12837t = new ArrayList(i10);
        }
        int i11 = -(iA + 1);
        if (i11 >= i10) {
            return e().put(comparable, obj);
        }
        if (this.f12837t.size() == i10) {
            C c10 = (C) this.f12837t.remove(i10 - 1);
            e().put(c10.f12765s, c10.f12766t);
        }
        this.f12837t.add(i11, new C(this, comparable, obj));
        return null;
    }

    public final Object g(int i10) {
        b();
        Object obj = ((C) this.f12837t.remove(i10)).f12766t;
        if (!this.f12838u.isEmpty()) {
            Iterator it = e().entrySet().iterator();
            List list = this.f12837t;
            Map.Entry entry = (Map.Entry) it.next();
            list.add(new C(this, (Comparable) entry.getKey(), entry.getValue()));
            it.remove();
        }
        return obj;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int iA = a(comparable);
        return iA >= 0 ? ((C) this.f12837t.get(iA)).f12766t : this.f12838u.get(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        b();
        Comparable comparable = (Comparable) obj;
        int iA = a(comparable);
        if (iA >= 0) {
            return g(iA);
        }
        if (this.f12838u.isEmpty()) {
            return null;
        }
        return this.f12838u.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f12838u.size() + this.f12837t.size();
    }
}
