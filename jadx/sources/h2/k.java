package h2;

/* JADX INFO: loaded from: classes.dex */
public final class k implements p004a4.c {
    public static final k a = new k();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final p004a4.b f11696b = p004a4.b.a("networkType");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final p004a4.b f11697c = p004a4.b.a("mobileSubtype");

    @Override // p004a4.a
    public final void a(Object obj, Object obj2) {
        p004a4.d dVar = (p004a4.d) obj2;
        v vVar = (v) ((I) obj);
        dVar.a(f11696b, vVar.a);
        dVar.a(f11697c, vVar.f11722b);
    }
}
