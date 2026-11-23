package Q3;

/* JADX INFO: renamed from: Q3.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0384j implements p004a4.c {
    public static final C0384j a = new C0384j();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final p004a4.b f4231b = p004a4.b.a("generator");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final p004a4.b f4232c = p004a4.b.a("identifier");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final p004a4.b f4233d = p004a4.b.a("appQualitySessionId");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final p004a4.b f4234e = p004a4.b.a("startedAt");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final p004a4.b f4235f = p004a4.b.a("endedAt");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final p004a4.b f4236g = p004a4.b.a("crashed");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final p004a4.b f4237h = p004a4.b.a("app");

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final p004a4.b f4238i = p004a4.b.a("user");
    public static final p004a4.b j = p004a4.b.a("os");

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final p004a4.b f4239k = p004a4.b.a("device");

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final p004a4.b f4240l = p004a4.b.a("events");

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final p004a4.b f4241m = p004a4.b.a("generatorType");

    @Override // p004a4.a
    public final void a(Object obj, Object obj2) {
        p004a4.d dVar = (p004a4.d) obj2;
        J j10 = (J) ((N0) obj);
        dVar.a(f4231b, j10.a);
        dVar.a(f4232c, j10.f4086b.getBytes(O0.a));
        dVar.a(f4233d, j10.f4087c);
        dVar.e(f4234e, j10.f4088d);
        dVar.a(f4235f, j10.f4089e);
        dVar.b(f4236g, j10.f4090f);
        dVar.a(f4237h, j10.f4091g);
        dVar.a(f4238i, j10.f4092h);
        dVar.a(j, j10.f4093i);
        dVar.a(f4239k, j10.j);
        dVar.a(f4240l, j10.f4094k);
        dVar.g(f4241m, j10.f4095l);
    }
}
