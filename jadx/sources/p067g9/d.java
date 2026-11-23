package p067g9;

/* JADX INFO: loaded from: classes.dex */
public abstract class d {
    public final int a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f11548b;

    public d(int i10, int i11) {
        this.a = i10;
        this.f11548b = i11;
    }

    public static b a(d dVar) {
        return new b(dVar.a + dVar.f11548b, 1);
    }

    public static b b() {
        return new b(0, 1);
    }
}
