package p095j8;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import p086i8.f;
import p210v8.i;

/* JADX INFO: loaded from: classes.dex */
public final class h extends f implements Serializable {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final h f12538t;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final e f12539s;

    static {
        e eVar = e.f12521F;
        f12538t = new h(e.f12521F);
    }

    public h() {
        this(new e());
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        return this.f12539s.a(obj) >= 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        i.f(collection, "elements");
        this.f12539s.c();
        return super.addAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f12539s.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f12539s.containsKey(obj);
    }

    @Override // p086i8.f
    public final int e() {
        return this.f12539s.f12522A;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.f12539s.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        e eVar = this.f12539s;
        eVar.getClass();
        return new c(eVar, 1);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        e eVar = this.f12539s;
        eVar.c();
        int iH = eVar.h(obj);
        if (iH < 0) {
            iH = -1;
        } else {
            eVar.l(iH);
        }
        return iH >= 0;
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        i.f(collection, "elements");
        this.f12539s.c();
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        i.f(collection, "elements");
        this.f12539s.c();
        return super.retainAll(collection);
    }

    public h(e eVar) {
        i.f(eVar, "backing");
        this.f12539s = eVar;
    }
}
