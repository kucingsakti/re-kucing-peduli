package Q3;

/* JADX INFO: loaded from: classes.dex */
public final class r implements p004a4.c {
    public static final r a = new r();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final p004a4.b f4289b = p004a4.b.a("processName");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final p004a4.b f4290c = p004a4.b.a("pid");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final p004a4.b f4291d = p004a4.b.a("importance");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final p004a4.b f4292e = p004a4.b.a("defaultProcess");

    @Override // p004a4.a
    public final void a(Object obj, Object obj2) {
        p004a4.d dVar = (p004a4.d) obj2;
        C0367a0 c0367a0 = (C0367a0) ((D0) obj);
        dVar.a(f4289b, c0367a0.a);
        dVar.g(f4290c, c0367a0.f4165b);
        dVar.g(f4291d, c0367a0.f4166c);
        dVar.b(f4292e, c0367a0.f4167d);
    }
}
