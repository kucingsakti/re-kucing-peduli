package p212w;

import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import p210v8.i;

/* JADX INFO: loaded from: classes.dex */
public final class c implements Iterator, Map.Entry {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f15488s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f15489t = -1;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f15490u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ e f15491v;

    public c(e eVar) {
        this.f15491v = eVar;
        this.f15488s = eVar.f15506u - 1;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (!this.f15490u) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object key = entry.getKey();
        int i10 = this.f15489t;
        e eVar = this.f15491v;
        return i.a(key, eVar.g(i10)) && i.a(entry.getValue(), eVar.k(this.f15489t));
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        if (this.f15490u) {
            return this.f15491v.g(this.f15489t);
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        if (this.f15490u) {
            return this.f15491v.k(this.f15489t);
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f15489t < this.f15488s;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        if (!this.f15490u) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        int i10 = this.f15489t;
        e eVar = this.f15491v;
        Object objG = eVar.g(i10);
        Object objK = eVar.k(this.f15489t);
        return (objG == null ? 0 : objG.hashCode()) ^ (objK != null ? objK.hashCode() : 0);
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f15489t++;
        this.f15490u = true;
        return this;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f15490u) {
            throw new IllegalStateException();
        }
        this.f15491v.i(this.f15489t);
        this.f15489t--;
        this.f15488s--;
        this.f15490u = false;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (this.f15490u) {
            return this.f15491v.j(this.f15489t, obj);
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    public final String toString() {
        return getKey() + "=" + getValue();
    }
}
