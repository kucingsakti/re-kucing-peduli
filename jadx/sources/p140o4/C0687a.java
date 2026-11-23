package p140o4;

import androidx.datastore.preferences.protobuf.AbstractC0487g;
import p004a4.b;
import p004a4.c;
import p034d4.a;
import p034d4.e;
import p150p4.d;

/* JADX INFO: renamed from: o4.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0687a implements c {
    public static final C0687a a = new C0687a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b f13736b = new b("projectNumber", AbstractC0487g.o(AbstractC0487g.n(e.class, new a(1))));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b f13737c = new b("messageId", AbstractC0487g.o(AbstractC0487g.n(e.class, new a(2))));

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final b f13738d = new b("instanceId", AbstractC0487g.o(AbstractC0487g.n(e.class, new a(3))));

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final b f13739e = new b("messageType", AbstractC0487g.o(AbstractC0487g.n(e.class, new a(4))));

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final b f13740f = new b("sdkPlatform", AbstractC0487g.o(AbstractC0487g.n(e.class, new a(5))));

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final b f13741g = new b("packageName", AbstractC0487g.o(AbstractC0487g.n(e.class, new a(6))));

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final b f13742h = new b("collapseKey", AbstractC0487g.o(AbstractC0487g.n(e.class, new a(7))));

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final b f13743i = new b("priority", AbstractC0487g.o(AbstractC0487g.n(e.class, new a(8))));
    public static final b j = new b("ttl", AbstractC0487g.o(AbstractC0487g.n(e.class, new a(9))));

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final b f13744k = new b("topic", AbstractC0487g.o(AbstractC0487g.n(e.class, new a(10))));

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final b f13745l = new b("bulkId", AbstractC0487g.o(AbstractC0487g.n(e.class, new a(11))));

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final b f13746m = new b("event", AbstractC0487g.o(AbstractC0487g.n(e.class, new a(12))));

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final b f13747n = new b("analyticsLabel", AbstractC0487g.o(AbstractC0487g.n(e.class, new a(13))));

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final b f13748o = new b("campaignId", AbstractC0487g.o(AbstractC0487g.n(e.class, new a(14))));

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final b f13749p = new b("composerLabel", AbstractC0487g.o(AbstractC0487g.n(e.class, new a(15))));

    @Override // p004a4.a
    public final void a(Object obj, Object obj2) {
        d dVar = (d) obj;
        p004a4.d dVar2 = (p004a4.d) obj2;
        dVar2.e(f13736b, dVar.a);
        dVar2.a(f13737c, dVar.f14235b);
        dVar2.a(f13738d, dVar.f14236c);
        dVar2.a(f13739e, dVar.f14237d);
        dVar2.a(f13740f, p150p4.c.ANDROID);
        dVar2.a(f13741g, dVar.f14238e);
        dVar2.a(f13742h, dVar.f14239f);
        dVar2.g(f13743i, 0);
        dVar2.g(j, dVar.f14240g);
        dVar2.a(f13744k, dVar.f14241h);
        dVar2.e(f13745l, 0L);
        dVar2.a(f13746m, p150p4.a.MESSAGE_DELIVERED);
        dVar2.a(f13747n, dVar.f14242i);
        dVar2.e(f13748o, 0L);
        dVar2.a(f13749p, dVar.j);
    }
}
