package i2;

import androidx.datastore.preferences.protobuf.AbstractC0487g;

/* JADX INFO: loaded from: classes.dex */
public final class f implements p004a4.c {
    public static final f a = new f();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final p004a4.b f12169b = new p004a4.b("currentCacheSizeBytes", AbstractC0487g.o(AbstractC0487g.n(p034d4.e.class, new p034d4.a(1))));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final p004a4.b f12170c = new p004a4.b("maxCacheSizeBytes", AbstractC0487g.o(AbstractC0487g.n(p034d4.e.class, new p034d4.a(2))));

    @Override // p004a4.a
    public final void a(Object obj, Object obj2) {
        p108l2.f fVar = (p108l2.f) obj;
        p004a4.d dVar = (p004a4.d) obj2;
        dVar.e(f12169b, fVar.a);
        dVar.e(f12170c, fVar.f12912b);
    }
}
