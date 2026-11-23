package Q3;

/* JADX INFO: renamed from: Q3.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0366a implements p004a4.c {
    public static final C0366a a = new C0366a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final p004a4.b f4162b = p004a4.b.a("arch");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final p004a4.b f4163c = p004a4.b.a("libraryName");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final p004a4.b f4164d = p004a4.b.a("buildId");

    @Override // p004a4.a
    public final void a(Object obj, Object obj2) {
        p004a4.d dVar = (p004a4.d) obj2;
        E e10 = (E) ((p0) obj);
        dVar.a(f4162b, e10.a);
        dVar.a(f4163c, e10.f4070b);
        dVar.a(f4164d, e10.f4071c);
    }
}
