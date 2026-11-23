package A3;

/* JADX INFO: renamed from: A3.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0112j extends AbstractC0119q {
    @Override // A3.AbstractC0119q, A3.AbstractC0113k, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return s().contains(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return s().isEmpty();
    }

    @Override // A3.AbstractC0113k
    public boolean m() {
        return s().m();
    }

    public abstract AbstractC0113k s();

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return s().size();
    }
}
