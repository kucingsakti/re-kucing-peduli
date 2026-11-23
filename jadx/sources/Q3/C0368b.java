package Q3;

/* JADX INFO: renamed from: Q3.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0368b implements p004a4.c {
    public static final C0368b a = new C0368b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final p004a4.b f4168b = p004a4.b.a("pid");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final p004a4.b f4169c = p004a4.b.a("processName");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final p004a4.b f4170d = p004a4.b.a("reasonCode");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final p004a4.b f4171e = p004a4.b.a("importance");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final p004a4.b f4172f = p004a4.b.a("pss");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final p004a4.b f4173g = p004a4.b.a("rss");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final p004a4.b f4174h = p004a4.b.a("timestamp");

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final p004a4.b f4175i = p004a4.b.a("traceFile");
    public static final p004a4.b j = p004a4.b.a("buildIdMappingForArch");

    @Override // p004a4.a
    public final void a(Object obj, Object obj2) {
        p004a4.d dVar = (p004a4.d) obj2;
        D d3 = (D) ((q0) obj);
        dVar.g(f4168b, d3.a);
        dVar.a(f4169c, d3.f4062b);
        dVar.g(f4170d, d3.f4063c);
        dVar.g(f4171e, d3.f4064d);
        dVar.e(f4172f, d3.f4065e);
        dVar.e(f4173g, d3.f4066f);
        dVar.e(f4174h, d3.f4067g);
        dVar.a(f4175i, d3.f4068h);
        dVar.a(j, d3.f4069i);
    }
}
