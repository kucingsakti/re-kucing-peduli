package A3;

import java.util.function.Consumer;
import java.util.function.Function;

/* JADX INFO: renamed from: A3.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0107e implements Consumer {
    public final /* synthetic */ int a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Consumer f260b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Function f261c;

    public /* synthetic */ C0107e(Consumer consumer, Function function, int i10) {
        this.a = i10;
        this.f260b = consumer;
        this.f261c = function;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        switch (this.a) {
            case 0:
                this.f260b.accept(this.f261c.apply(obj));
                break;
            default:
                this.f260b.accept(this.f261c.apply(obj));
                break;
        }
    }
}
