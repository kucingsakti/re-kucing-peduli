package A3;

import java.util.Collection;
import java.util.function.BiConsumer;

/* JADX INFO: loaded from: classes.dex */
public final class W extends AbstractC0121t {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final transient Object f252w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final transient Object f253x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final transient W f254y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public transient W f255z;

    public W(Object obj, Object obj2) {
        C3.a.c(obj, obj2);
        this.f252w = obj;
        this.f253x = obj2;
        this.f254y = null;
    }

    @Override // A3.AbstractC0121t
    public final F b() {
        C0114l c0114l = new C0114l(this.f252w, this.f253x);
        int i10 = F.f227t;
        return new Y(c0114l);
    }

    @Override // A3.AbstractC0121t
    public final F c() {
        int i10 = F.f227t;
        return new Y(this.f252w);
    }

    @Override // A3.AbstractC0121t, java.util.Map
    public final boolean containsKey(Object obj) {
        return this.f252w.equals(obj);
    }

    @Override // A3.AbstractC0121t, java.util.Map
    public final boolean containsValue(Object obj) {
        return this.f253x.equals(obj);
    }

    @Override // A3.AbstractC0121t
    public final AbstractC0113k e() {
        throw new AssertionError("should never be called");
    }

    @Override // java.util.Map
    public final void forEach(BiConsumer biConsumer) {
        biConsumer.getClass();
        AbstractC0106d.t(biConsumer).accept(this.f252w, this.f253x);
    }

    @Override // A3.AbstractC0121t
    /* JADX INFO: renamed from: g */
    public final AbstractC0113k values() {
        W w2 = this.f254y;
        if (w2 == null && (w2 = this.f255z) == null) {
            w2 = new W(this.f253x, this.f252w, this);
            this.f255z = w2;
        }
        F f10 = w2.f284t;
        if (f10 != null) {
            return f10;
        }
        F fC = w2.c();
        w2.f284t = fC;
        return fC;
    }

    @Override // A3.AbstractC0121t, java.util.Map
    public final Object get(Object obj) {
        if (this.f252w.equals(obj)) {
            return this.f253x;
        }
        return null;
    }

    @Override // java.util.Map
    public final int size() {
        return 1;
    }

    @Override // A3.AbstractC0121t, java.util.Map
    public final Collection values() {
        W w2 = this.f254y;
        if (w2 == null && (w2 = this.f255z) == null) {
            w2 = new W(this.f253x, this.f252w, this);
            this.f255z = w2;
        }
        F f10 = w2.f284t;
        if (f10 != null) {
            return f10;
        }
        F fC = w2.c();
        w2.f284t = fC;
        return fC;
    }

    public W(Object obj, Object obj2, W w2) {
        this.f252w = obj;
        this.f253x = obj2;
        this.f254y = w2;
    }
}
