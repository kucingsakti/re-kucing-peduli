package A3;

import java.util.function.Consumer;
import java.util.function.IntConsumer;
import java.util.function.IntFunction;

/* JADX INFO: renamed from: A3.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0109g implements IntConsumer {
    public final /* synthetic */ int a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Consumer f263b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ IntFunction f264c;

    public /* synthetic */ C0109g(Consumer consumer, IntFunction intFunction, int i10) {
        this.a = i10;
        this.f263b = consumer;
        this.f264c = intFunction;
    }

    @Override // java.util.function.IntConsumer
    public final void accept(int i10) {
        switch (this.a) {
            case 0:
                this.f263b.accept(this.f264c.apply(i10));
                break;
            default:
                this.f263b.accept(this.f264c.apply(i10));
                break;
        }
    }
}
