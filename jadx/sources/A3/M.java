package A3;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

/* JADX INFO: loaded from: classes.dex */
public final class M extends AbstractC0121t {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final transient HashMap f233w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final transient AbstractC0119q f234x;

    public M(HashMap map, AbstractC0119q abstractC0119q) {
        this.f233w = map;
        this.f234x = abstractC0119q;
    }

    @Override // A3.AbstractC0121t
    public final F b() {
        return new C0124w(this, this.f234x);
    }

    @Override // A3.AbstractC0121t
    public final F c() {
        return new C0126y(this, 0);
    }

    @Override // A3.AbstractC0121t
    public final AbstractC0113k e() {
        return new C0127z(this);
    }

    @Override // java.util.Map
    public final void forEach(final BiConsumer biConsumer) {
        biConsumer.getClass();
        this.f234x.forEach(new Consumer() { // from class: A3.L
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                Map.Entry entry = (Map.Entry) obj;
                biConsumer.accept(entry.getKey(), entry.getValue());
            }
        });
    }

    @Override // A3.AbstractC0121t, java.util.Map
    public final Object get(Object obj) {
        return this.f233w.get(obj);
    }

    @Override // java.util.Map
    public final int size() {
        return this.f234x.size();
    }
}
