package U4;

import java.util.ArrayList;
import java.util.List;
import p210v8.i;

/* JADX INFO: loaded from: classes.dex */
public final class c implements a {
    private final List<e> registrations = new ArrayList();

    @Override // U4.a
    public d build() {
        return new d(this.registrations);
    }

    @Override // U4.a
    public <T> e register(Class<T> cls) {
        i.f(cls, "c");
        g gVar = new g(cls);
        this.registrations.add(gVar);
        return gVar;
    }

    @Override // U4.a
    public <T> e register(p200u8.b bVar) {
        i.f(bVar, "create");
        f fVar = new f(bVar);
        this.registrations.add(fVar);
        return fVar;
    }

    @Override // U4.a
    public <T> e register(T t7) {
        h hVar = new h(t7);
        this.registrations.add(hVar);
        return hVar;
    }

    public final <T> e register() {
        i.m();
        throw null;
    }
}
