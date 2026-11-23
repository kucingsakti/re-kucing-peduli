package Q3;

/* JADX INFO: renamed from: Q3.v, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0401v implements p004a4.c {
    public static final C0401v a = new C0401v();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final p004a4.b f4314b = p004a4.b.a("rolloutVariant");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final p004a4.b f4315c = p004a4.b.a("parameterKey");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final p004a4.b f4316d = p004a4.b.a("parameterValue");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final p004a4.b f4317e = p004a4.b.a("templateVersion");

    @Override // p004a4.a
    public final void a(Object obj, Object obj2) {
        p004a4.d dVar = (p004a4.d) obj2;
        C0377f0 c0377f0 = (C0377f0) ((I0) obj);
        dVar.a(f4314b, c0377f0.a);
        dVar.a(f4315c, c0377f0.f4208b);
        dVar.a(f4316d, c0377f0.f4209c);
        dVar.e(f4317e, c0377f0.f4210d);
    }
}
