package Q3;

/* JADX INFO: renamed from: Q3.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0370c implements p004a4.c {
    public static final C0370c a = new C0370c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final p004a4.b f4182b = p004a4.b.a("key");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final p004a4.b f4183c = p004a4.b.a("value");

    @Override // p004a4.a
    public final void a(Object obj, Object obj2) {
        p004a4.d dVar = (p004a4.d) obj2;
        F f10 = (F) ((r0) obj);
        dVar.a(f4182b, f10.a);
        dVar.a(f4183c, f10.f4072b);
    }
}
