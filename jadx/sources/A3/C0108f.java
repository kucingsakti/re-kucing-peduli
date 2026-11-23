package A3;

import java.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.Function;

/* JADX INFO: renamed from: A3.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0108f implements Spliterator {
    public final /* synthetic */ Spliterator a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function f262b;

    public C0108f(Spliterator spliterator, Function function) {
        this.a = spliterator;
        this.f262b = function;
    }

    @Override // java.util.Spliterator
    public final int characteristics() {
        return this.a.characteristics() & (-262);
    }

    @Override // java.util.Spliterator
    public final long estimateSize() {
        return this.a.estimateSize();
    }

    @Override // java.util.Spliterator
    public final void forEachRemaining(Consumer consumer) {
        this.a.forEachRemaining(new C0107e(consumer, this.f262b, 0));
    }

    @Override // java.util.Spliterator
    public final boolean tryAdvance(Consumer consumer) {
        return this.a.tryAdvance(new C0107e(consumer, this.f262b, 1));
    }

    @Override // java.util.Spliterator
    public final Spliterator trySplit() {
        Spliterator spliteratorTrySplit = this.a.trySplit();
        if (spliteratorTrySplit != null) {
            return new C0108f(spliteratorTrySplit, this.f262b);
        }
        return null;
    }
}
