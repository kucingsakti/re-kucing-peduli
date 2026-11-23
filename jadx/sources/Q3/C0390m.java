package Q3;

/* JADX INFO: renamed from: Q3.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0390m implements p004a4.c {
    public static final C0390m a = new C0390m();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final p004a4.b f4258b = p004a4.b.a("threads");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final p004a4.b f4259c = p004a4.b.a("exception");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final p004a4.b f4260d = p004a4.b.a("appExitInfo");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final p004a4.b f4261e = p004a4.b.a("signal");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final p004a4.b f4262f = p004a4.b.a("binaries");

    @Override // p004a4.a
    public final void a(Object obj, Object obj2) {
        p004a4.d dVar = (p004a4.d) obj2;
        S s9 = (S) ((C0) obj);
        dVar.a(f4258b, s9.a);
        dVar.a(f4259c, s9.f4134b);
        dVar.a(f4260d, s9.f4135c);
        dVar.a(f4261e, s9.f4136d);
        dVar.a(f4262f, s9.f4137e);
    }
}
