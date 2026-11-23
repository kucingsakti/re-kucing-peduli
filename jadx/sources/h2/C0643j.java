package h2;

/* JADX INFO: renamed from: h2.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0643j implements p004a4.c {
    public static final C0643j a = new C0643j();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final p004a4.b f11689b = p004a4.b.a("requestTimeMs");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final p004a4.b f11690c = p004a4.b.a("requestUptimeMs");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final p004a4.b f11691d = p004a4.b.a("clientInfo");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final p004a4.b f11692e = p004a4.b.a("logSource");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final p004a4.b f11693f = p004a4.b.a("logSourceName");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final p004a4.b f11694g = p004a4.b.a("logEvent");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final p004a4.b f11695h = p004a4.b.a("qosTier");

    @Override // p004a4.a
    public final void a(Object obj, Object obj2) {
        p004a4.d dVar = (p004a4.d) obj2;
        t tVar = (t) ((F) obj);
        dVar.e(f11689b, tVar.a);
        dVar.e(f11690c, tVar.f11717b);
        dVar.a(f11691d, tVar.f11718c);
        dVar.a(f11692e, tVar.f11719d);
        dVar.a(f11693f, tVar.f11720e);
        dVar.a(f11694g, tVar.f11721f);
        dVar.a(f11695h, J.f11659s);
    }
}
