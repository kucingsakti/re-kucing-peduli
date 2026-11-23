package A3;

import java.util.Spliterator;
import java.util.function.Consumer;

/* JADX INFO: loaded from: classes.dex */
public abstract class I extends B {
    @Override // A3.AbstractC0113k
    public final int e(Object[] objArr) {
        return d().e(objArr);
    }

    @Override // java.lang.Iterable
    public void forEach(Consumer consumer) {
        consumer.getClass();
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            consumer.accept(get(i10));
        }
    }

    public abstract Object get(int i10);

    @Override // A3.AbstractC0113k
    /* JADX INFO: renamed from: n */
    public Z iterator() {
        return d().iterator();
    }

    @Override // A3.B
    public final AbstractC0119q s() {
        return new H(this);
    }

    @Override // A3.AbstractC0113k, java.util.Collection, java.lang.Iterable, java.util.Set
    public Spliterator spliterator() {
        return C3.b.D(size(), 1297, new C0116n(this, 1), null);
    }
}
