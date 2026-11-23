package Q3;

import com.unity3d.services.ads.adunit.AdUnitActivity;

/* JADX INFO: renamed from: Q3.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0398s implements p004a4.c {
    public static final C0398s a = new C0398s();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final p004a4.b f4293b = p004a4.b.a("batteryLevel");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final p004a4.b f4294c = p004a4.b.a("batteryVelocity");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final p004a4.b f4295d = p004a4.b.a("proximityOn");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final p004a4.b f4296e = p004a4.b.a(AdUnitActivity.EXTRA_ORIENTATION);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final p004a4.b f4297f = p004a4.b.a("ramUsed");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final p004a4.b f4298g = p004a4.b.a("diskUsed");

    @Override // p004a4.a
    public final void a(Object obj, Object obj2) {
        p004a4.d dVar = (p004a4.d) obj2;
        C0371c0 c0371c0 = (C0371c0) ((F0) obj);
        dVar.a(f4293b, c0371c0.a);
        dVar.g(f4294c, c0371c0.f4184b);
        dVar.b(f4295d, c0371c0.f4185c);
        dVar.g(f4296e, c0371c0.f4186d);
        dVar.e(f4297f, c0371c0.f4187e);
        dVar.e(f4298g, c0371c0.f4188f);
    }
}
