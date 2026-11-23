package h2;

/* JADX INFO: renamed from: h2.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0639f implements p004a4.c {
    public static final C0639f a = new C0639f();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final p004a4.b f11677b = p004a4.b.a("clearBlob");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final p004a4.b f11678c = p004a4.b.a("encryptedBlob");

    @Override // p004a4.a
    public final void a(Object obj, Object obj2) {
        p004a4.d dVar = (p004a4.d) obj2;
        p pVar = (p) ((B) obj);
        dVar.a(f11677b, pVar.a);
        dVar.a(f11678c, pVar.f11708b);
    }
}
