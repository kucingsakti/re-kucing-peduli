package Q3;

/* JADX INFO: renamed from: Q3.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0392n implements p004a4.c {
    public static final C0392n a = new C0392n();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final p004a4.b f4268b = p004a4.b.a(com.onesignal.inAppMessages.internal.display.impl.k.EVENT_TYPE_KEY);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final p004a4.b f4269c = p004a4.b.a("reason");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final p004a4.b f4270d = p004a4.b.a("frames");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final p004a4.b f4271e = p004a4.b.a("causedBy");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final p004a4.b f4272f = p004a4.b.a("overflowCount");

    @Override // p004a4.a
    public final void a(Object obj, Object obj2) {
        p004a4.d dVar = (p004a4.d) obj2;
        U u3 = (U) ((y0) obj);
        dVar.a(f4268b, u3.a);
        dVar.a(f4269c, u3.f4141b);
        dVar.a(f4270d, u3.f4142c);
        dVar.a(f4271e, u3.f4143d);
        dVar.g(f4272f, u3.f4144e);
    }
}
