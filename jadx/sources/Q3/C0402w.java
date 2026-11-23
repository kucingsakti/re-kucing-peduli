package Q3;

/* JADX INFO: renamed from: Q3.w, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0402w implements p004a4.c {
    public static final C0402w a = new C0402w();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final p004a4.b f4318b = p004a4.b.a("rolloutId");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final p004a4.b f4319c = p004a4.b.a("variantId");

    @Override // p004a4.a
    public final void a(Object obj, Object obj2) {
        p004a4.d dVar = (p004a4.d) obj2;
        C0379g0 c0379g0 = (C0379g0) ((H0) obj);
        dVar.a(f4318b, c0379g0.a);
        dVar.a(f4319c, c0379g0.f4218b);
    }
}
