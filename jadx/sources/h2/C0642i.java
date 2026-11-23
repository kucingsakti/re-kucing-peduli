package h2;

/* JADX INFO: renamed from: h2.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0642i implements p004a4.c {
    public static final C0642i a = new C0642i();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final p004a4.b f11681b = p004a4.b.a("eventTimeMs");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final p004a4.b f11682c = p004a4.b.a("eventCode");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final p004a4.b f11683d = p004a4.b.a("complianceData");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final p004a4.b f11684e = p004a4.b.a("eventUptimeMs");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final p004a4.b f11685f = p004a4.b.a("sourceExtension");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final p004a4.b f11686g = p004a4.b.a("sourceExtensionJsonProto3");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final p004a4.b f11687h = p004a4.b.a("timezoneOffsetSeconds");

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final p004a4.b f11688i = p004a4.b.a("networkConnectionInfo");
    public static final p004a4.b j = p004a4.b.a("experimentIds");

    @Override // p004a4.a
    public final void a(Object obj, Object obj2) {
        p004a4.d dVar = (p004a4.d) obj2;
        s sVar = (s) ((E) obj);
        dVar.e(f11681b, sVar.a);
        dVar.a(f11682c, sVar.f11709b);
        dVar.a(f11683d, sVar.f11710c);
        dVar.e(f11684e, sVar.f11711d);
        dVar.a(f11685f, sVar.f11712e);
        dVar.a(f11686g, sVar.f11713f);
        dVar.e(f11687h, sVar.f11714g);
        dVar.a(f11688i, sVar.f11715h);
        dVar.a(j, sVar.f11716i);
    }
}
