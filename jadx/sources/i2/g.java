package i2;

import androidx.datastore.preferences.protobuf.AbstractC0487g;

/* JADX INFO: loaded from: classes.dex */
public final class g implements p004a4.c {
    public static final g a = new g();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final p004a4.b f12171b = new p004a4.b("startMs", AbstractC0487g.o(AbstractC0487g.n(p034d4.e.class, new p034d4.a(1))));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final p004a4.b f12172c = new p004a4.b("endMs", AbstractC0487g.o(AbstractC0487g.n(p034d4.e.class, new p034d4.a(2))));

    @Override // p004a4.a
    public final void a(Object obj, Object obj2) {
        p108l2.g gVar = (p108l2.g) obj;
        p004a4.d dVar = (p004a4.d) obj2;
        dVar.e(f12171b, gVar.a);
        dVar.e(f12172c, gVar.f12913b);
    }
}
