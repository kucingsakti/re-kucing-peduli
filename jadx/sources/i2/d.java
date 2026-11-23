package i2;

import androidx.datastore.preferences.protobuf.AbstractC0487g;

/* JADX INFO: loaded from: classes.dex */
public final class d implements p004a4.c {
    public static final d a = new d();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final p004a4.b f12167b = new p004a4.b("logSource", AbstractC0487g.o(AbstractC0487g.n(p034d4.e.class, new p034d4.a(1))));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final p004a4.b f12168c = new p004a4.b("logEventDropped", AbstractC0487g.o(AbstractC0487g.n(p034d4.e.class, new p034d4.a(2))));

    @Override // p004a4.a
    public final void a(Object obj, Object obj2) {
        p108l2.e eVar = (p108l2.e) obj;
        p004a4.d dVar = (p004a4.d) obj2;
        dVar.a(f12167b, eVar.a);
        dVar.a(f12168c, eVar.f12911b);
    }
}
