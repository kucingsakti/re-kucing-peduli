package i2;

import androidx.datastore.preferences.protobuf.AbstractC0487g;

/* JADX INFO: loaded from: classes.dex */
public final class a implements p004a4.c {
    public static final a a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final p004a4.b f12160b = new p004a4.b("window", AbstractC0487g.o(AbstractC0487g.n(p034d4.e.class, new p034d4.a(1))));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final p004a4.b f12161c = new p004a4.b("logSourceMetrics", AbstractC0487g.o(AbstractC0487g.n(p034d4.e.class, new p034d4.a(2))));

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final p004a4.b f12162d = new p004a4.b("globalMetrics", AbstractC0487g.o(AbstractC0487g.n(p034d4.e.class, new p034d4.a(3))));

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final p004a4.b f12163e = new p004a4.b("appNamespace", AbstractC0487g.o(AbstractC0487g.n(p034d4.e.class, new p034d4.a(4))));

    @Override // p004a4.a
    public final void a(Object obj, Object obj2) {
        p108l2.a aVar = (p108l2.a) obj;
        p004a4.d dVar = (p004a4.d) obj2;
        dVar.a(f12160b, aVar.a);
        dVar.a(f12161c, aVar.f12897b);
        dVar.a(f12162d, aVar.f12898c);
        dVar.a(f12163e, aVar.f12899d);
    }
}
