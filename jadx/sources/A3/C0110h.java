package A3;

import java.util.Comparator;
import java.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.IntConsumer;
import java.util.function.IntFunction;

/* JADX INFO: renamed from: A3.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0110h implements Spliterator {
    public final Spliterator.OfInt a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ IntFunction f265b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f266c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Comparator f267d;

    public C0110h(Spliterator.OfInt ofInt, IntFunction intFunction, int i10, Comparator comparator) {
        this.f265b = intFunction;
        this.f266c = i10;
        this.f267d = comparator;
        this.a = ofInt;
    }

    @Override // java.util.Spliterator
    public final int characteristics() {
        return this.f266c | 16464;
    }

    @Override // java.util.Spliterator
    public final long estimateSize() {
        return this.a.estimateSize();
    }

    @Override // java.util.Spliterator
    public final void forEachRemaining(Consumer consumer) {
        this.a.forEachRemaining((IntConsumer) new C0109g(consumer, this.f265b, 0));
    }

    @Override // java.util.Spliterator
    public final Comparator getComparator() {
        if (hasCharacteristics(4)) {
            return this.f267d;
        }
        throw new IllegalStateException();
    }

    @Override // java.util.Spliterator
    public final boolean tryAdvance(Consumer consumer) {
        return this.a.tryAdvance((IntConsumer) new C0109g(consumer, this.f265b, 1));
    }

    @Override // java.util.Spliterator
    public final Spliterator trySplit() {
        Spliterator.OfInt ofIntTrySplit = this.a.trySplit();
        if (ofIntTrySplit == null) {
            return null;
        }
        return new C0110h(ofIntTrySplit, this.f265b, this.f266c, this.f267d);
    }
}
