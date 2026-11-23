package U4;

import java.util.LinkedHashSet;
import java.util.Set;
import p210v8.i;

/* JADX INFO: loaded from: classes.dex */
public abstract class e {
    private final Set<Class<?>> services = new LinkedHashSet();

    public final Set<Class<?>> getServices() {
        return this.services;
    }

    public final <TService> e provides(Class<TService> cls) {
        i.f(cls, "c");
        this.services.add(cls);
        return this;
    }

    public abstract Object resolve(b bVar);

    public final <TService> e provides() {
        i.m();
        throw null;
    }
}
