package A3;

import java.util.HashSet;

/* JADX INFO: loaded from: classes.dex */
public final class N extends I {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final HashSet f235v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final AbstractC0119q f236w;

    public N(HashSet hashSet, AbstractC0119q abstractC0119q) {
        this.f235v = hashSet;
        this.f236w = abstractC0119q;
    }

    @Override // A3.AbstractC0113k, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f235v.contains(obj);
    }

    @Override // A3.I
    public final Object get(int i10) {
        return this.f236w.get(i10);
    }

    @Override // A3.AbstractC0113k
    public final boolean m() {
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f236w.size();
    }
}
