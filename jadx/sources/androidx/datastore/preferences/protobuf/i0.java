package androidx.datastore.preferences.protobuf;

import com.google.android.gms.internal.measurement.F0;
import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class i0 extends AbstractSet {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f6482s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Map f6483t;

    public /* synthetic */ i0(Map map, int i10) {
        this.f6482s = i10;
        this.f6483t = map;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean add(Object obj) {
        switch (this.f6482s) {
            case 0:
                Map.Entry entry = (Map.Entry) obj;
                if (contains(entry)) {
                    return false;
                }
                ((d0) this.f6483t).g((Comparable) entry.getKey(), entry.getValue());
                return true;
            case 1:
                Map.Entry entry2 = (Map.Entry) obj;
                if (contains(entry2)) {
                    return false;
                }
                ((F0) this.f6483t).put((Comparable) entry2.getKey(), entry2.getValue());
                return true;
            case 2:
                Map.Entry entry3 = (Map.Entry) obj;
                if (contains(entry3)) {
                    return false;
                }
                ((p104k9.y) this.f6483t).put((Comparable) entry3.getKey(), entry3.getValue());
                return true;
            default:
                return super.add(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        switch (this.f6482s) {
            case 0:
                ((d0) this.f6483t).clear();
                break;
            case 1:
                ((F0) this.f6483t).clear();
                break;
            case 2:
                ((p104k9.y) this.f6483t).clear();
                break;
            default:
                super.clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        switch (this.f6482s) {
            case 0:
                Map.Entry entry = (Map.Entry) obj;
                Object obj2 = ((d0) this.f6483t).get(entry.getKey());
                Object value = entry.getValue();
                return obj2 == value || (obj2 != null && obj2.equals(value));
            case 1:
                Map.Entry entry2 = (Map.Entry) obj;
                Object obj3 = ((F0) this.f6483t).get(entry2.getKey());
                Object value2 = entry2.getValue();
                return obj3 == value2 || (obj3 != null && obj3.equals(value2));
            case 2:
                Map.Entry entry3 = (Map.Entry) obj;
                Object obj4 = ((p104k9.y) this.f6483t).get(entry3.getKey());
                Object value3 = entry3.getValue();
                return obj4 == value3 || (obj4 != null && obj4.equals(value3));
            default:
                return super.contains(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator iterator() {
        switch (this.f6482s) {
            case 0:
                return new h0(0, (d0) this.f6483t);
            case 1:
                return new h0(1, (F0) this.f6483t);
            case 2:
                return new h0(2, (p104k9.y) this.f6483t);
            default:
                return new p212w.c((p212w.e) this.f6483t);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        switch (this.f6482s) {
            case 0:
                Map.Entry entry = (Map.Entry) obj;
                if (!contains(entry)) {
                    return false;
                }
                ((d0) this.f6483t).remove(entry.getKey());
                return true;
            case 1:
                Map.Entry entry2 = (Map.Entry) obj;
                if (!contains(entry2)) {
                    return false;
                }
                ((F0) this.f6483t).remove(entry2.getKey());
                return true;
            case 2:
                Map.Entry entry3 = (Map.Entry) obj;
                if (!contains(entry3)) {
                    return false;
                }
                ((p104k9.y) this.f6483t).remove(entry3.getKey());
                return true;
            default:
                return super.remove(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        switch (this.f6482s) {
            case 0:
                return ((d0) this.f6483t).size();
            case 1:
                return ((F0) this.f6483t).size();
            case 2:
                return ((p104k9.y) this.f6483t).size();
            default:
                return ((p212w.e) this.f6483t).f15506u;
        }
    }
}
