package P3;

/* JADX INFO: loaded from: classes.dex */
public final class a implements p004a4.c {
    public static final a a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final p004a4.b f3862b = p004a4.b.a("rolloutId");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final p004a4.b f3863c = p004a4.b.a("parameterKey");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final p004a4.b f3864d = p004a4.b.a("parameterValue");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final p004a4.b f3865e = p004a4.b.a("variantId");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final p004a4.b f3866f = p004a4.b.a("templateVersion");

    @Override // p004a4.a
    public final void a(Object obj, Object obj2) {
        p004a4.d dVar = (p004a4.d) obj2;
        b bVar = (b) ((m) obj);
        dVar.a(f3862b, bVar.f3867b);
        dVar.a(f3863c, bVar.f3868c);
        dVar.a(f3864d, bVar.f3869d);
        dVar.a(f3865e, bVar.f3870e);
        dVar.e(f3866f, bVar.f3871f);
    }
}
