package A3;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

/* JADX INFO: renamed from: A3.x, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0125x implements BiConsumer {
    public final /* synthetic */ int a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Consumer f289b;

    public /* synthetic */ C0125x(Consumer consumer, int i10) {
        this.a = i10;
        this.f289b = consumer;
    }

    @Override // java.util.function.BiConsumer
    public final void accept(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                this.f289b.accept(obj);
                break;
            default:
                this.f289b.accept(obj2);
                break;
        }
    }
}
