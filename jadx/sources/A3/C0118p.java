package A3;

import java.util.Iterator;
import java.util.ListIterator;

/* JADX INFO: renamed from: A3.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0118p extends AbstractC0119q {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final transient int f276u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final transient int f277v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ AbstractC0119q f278w;

    public C0118p(AbstractC0119q abstractC0119q, int i10, int i11) {
        this.f278w = abstractC0119q;
        this.f276u = i10;
        this.f277v = i11;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        C4.a.c(i10, this.f277v);
        return this.f278w.get(i10 + this.f276u);
    }

    @Override // A3.AbstractC0113k, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    @Override // A3.AbstractC0119q, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // A3.AbstractC0113k
    public final boolean m() {
        return true;
    }

    @Override // A3.AbstractC0119q, java.util.List
    /* JADX INFO: renamed from: r */
    public final AbstractC0119q subList(int i10, int i11) {
        C4.a.e(i10, i11, this.f277v);
        int i12 = this.f276u;
        return this.f278w.subList(i10 + i12, i11 + i12);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f277v;
    }

    @Override // A3.AbstractC0119q, java.util.List
    public final /* bridge */ /* synthetic */ ListIterator listIterator(int i10) {
        return listIterator(i10);
    }
}
