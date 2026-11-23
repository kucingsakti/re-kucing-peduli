package p182s4;

import p004a4.b;
import p004a4.c;
import p004a4.d;

/* JADX INFO: renamed from: s4.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0770g implements c {
    public static final C0770g a = new C0770g();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b f14680b = b.a("eventType");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b f14681c = b.a("sessionData");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final b f14682d = b.a("applicationInfo");

    @Override // p004a4.a
    public final void a(Object obj, Object obj2) {
        F f10 = (F) obj;
        d dVar = (d) obj2;
        f10.getClass();
        dVar.a(f14680b, EnumC0774k.SESSION_START);
        dVar.a(f14681c, f10.a);
        dVar.a(f14682d, f10.f14613b);
    }
}
