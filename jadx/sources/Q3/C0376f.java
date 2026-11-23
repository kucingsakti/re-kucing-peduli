package Q3;

/* JADX INFO: renamed from: Q3.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0376f implements p004a4.c {
    public static final C0376f a = new C0376f();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final p004a4.b f4206b = p004a4.b.a("filename");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final p004a4.b f4207c = p004a4.b.a("contents");

    @Override // p004a4.a
    public final void a(Object obj, Object obj2) {
        p004a4.d dVar = (p004a4.d) obj2;
        H h10 = (H) ((s0) obj);
        dVar.a(f4206b, h10.a);
        dVar.a(f4207c, h10.f4074b);
    }
}
