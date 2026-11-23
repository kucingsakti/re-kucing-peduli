package p095j8;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import p210v8.i;

/* JADX INFO: loaded from: classes.dex */
public final class f extends p086i8.f {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f12535s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final e f12536t;

    public /* synthetic */ f(e eVar, int i10) {
        this.f12535s = i10;
        this.f12536t = eVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        switch (this.f12535s) {
            case 0:
                i.f((Map.Entry) obj, "element");
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        switch (this.f12535s) {
            case 0:
                i.f(collection, "elements");
                throw new UnsupportedOperationException();
            default:
                i.f(collection, "elements");
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        switch (this.f12535s) {
            case 0:
                this.f12536t.clear();
                break;
            default:
                this.f12536t.clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        switch (this.f12535s) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                i.f(entry, "element");
                return this.f12536t.f(entry);
            default:
                return this.f12536t.containsKey(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean containsAll(Collection collection) {
        switch (this.f12535s) {
            case 0:
                i.f(collection, "elements");
                return this.f12536t.e(collection);
            default:
                return super.containsAll(collection);
        }
    }

    @Override // p086i8.f
    public final int e() {
        switch (this.f12535s) {
            case 0:
                break;
        }
        return this.f12536t.f12522A;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        switch (this.f12535s) {
            case 0:
                break;
        }
        return this.f12536t.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        switch (this.f12535s) {
            case 0:
                e eVar = this.f12536t;
                eVar.getClass();
                return new c(eVar, 0);
            default:
                e eVar2 = this.f12536t;
                eVar2.getClass();
                return new c(eVar2, 1);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        switch (this.f12535s) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                i.f(entry, "element");
                e eVar = this.f12536t;
                eVar.getClass();
                eVar.c();
                int iH = eVar.h(entry.getKey());
                if (iH < 0) {
                    return false;
                }
                Object[] objArr = eVar.f12528t;
                i.c(objArr);
                if (!i.a(objArr[iH], entry.getValue())) {
                    return false;
                }
                eVar.l(iH);
                return true;
            default:
                e eVar2 = this.f12536t;
                eVar2.c();
                int iH2 = eVar2.h(obj);
                if (iH2 < 0) {
                    iH2 = -1;
                } else {
                    eVar2.l(iH2);
                }
                return iH2 >= 0;
        }
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        switch (this.f12535s) {
            case 0:
                i.f(collection, "elements");
                this.f12536t.c();
                break;
            default:
                i.f(collection, "elements");
                this.f12536t.c();
                break;
        }
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        switch (this.f12535s) {
            case 0:
                i.f(collection, "elements");
                this.f12536t.c();
                break;
            default:
                i.f(collection, "elements");
                this.f12536t.c();
                break;
        }
        return super.retainAll(collection);
    }
}
