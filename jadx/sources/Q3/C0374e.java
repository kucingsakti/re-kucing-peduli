package Q3;

/* JADX INFO: renamed from: Q3.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0374e implements p004a4.c {
    public static final C0374e a = new C0374e();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final p004a4.b f4200b = p004a4.b.a("files");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final p004a4.b f4201c = p004a4.b.a("orgId");

    @Override // p004a4.a
    public final void a(Object obj, Object obj2) {
        p004a4.d dVar = (p004a4.d) obj2;
        G g8 = (G) ((t0) obj);
        dVar.a(f4200b, g8.a);
        dVar.a(f4201c, g8.f4073b);
    }
}
