package i2;

import androidx.datastore.preferences.protobuf.AbstractC0487g;

/* JADX INFO: loaded from: classes.dex */
public final class c implements p004a4.c {
    public static final c a = new c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final p004a4.b f12165b = new p004a4.b("eventsDroppedCount", AbstractC0487g.o(AbstractC0487g.n(p034d4.e.class, new p034d4.a(1))));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final p004a4.b f12166c = new p004a4.b("reason", AbstractC0487g.o(AbstractC0487g.n(p034d4.e.class, new p034d4.a(3))));

    @Override // p004a4.a
    public final void a(Object obj, Object obj2) {
        p108l2.d dVar = (p108l2.d) obj;
        p004a4.d dVar2 = (p004a4.d) obj2;
        dVar2.e(f12165b, dVar.a);
        dVar2.a(f12166c, dVar.f12909b);
    }
}
