package Q3;

/* JADX INFO: renamed from: Q3.t, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0399t implements p004a4.c {
    public static final C0399t a = new C0399t();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final p004a4.b f4299b = p004a4.b.a("timestamp");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final p004a4.b f4300c = p004a4.b.a(com.onesignal.inAppMessages.internal.display.impl.k.EVENT_TYPE_KEY);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final p004a4.b f4301d = p004a4.b.a("app");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final p004a4.b f4302e = p004a4.b.a("device");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final p004a4.b f4303f = p004a4.b.a("log");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final p004a4.b f4304g = p004a4.b.a("rollouts");

    @Override // p004a4.a
    public final void a(Object obj, Object obj2) {
        p004a4.d dVar = (p004a4.d) obj2;
        P p10 = (P) ((K0) obj);
        dVar.e(f4299b, p10.a);
        dVar.a(f4300c, p10.f4123b);
        dVar.a(f4301d, p10.f4124c);
        dVar.a(f4302e, p10.f4125d);
        dVar.a(f4303f, p10.f4126e);
        dVar.a(f4304g, p10.f4127f);
    }
}
