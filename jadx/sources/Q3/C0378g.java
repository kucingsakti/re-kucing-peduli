package Q3;

import com.unity3d.ads.metadata.MediationMetaData;

/* JADX INFO: renamed from: Q3.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0378g implements p004a4.c {
    public static final C0378g a = new C0378g();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final p004a4.b f4211b = p004a4.b.a("identifier");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final p004a4.b f4212c = p004a4.b.a(MediationMetaData.KEY_VERSION);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final p004a4.b f4213d = p004a4.b.a("displayVersion");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final p004a4.b f4214e = p004a4.b.a("organization");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final p004a4.b f4215f = p004a4.b.a("installationUuid");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final p004a4.b f4216g = p004a4.b.a("developmentPlatform");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final p004a4.b f4217h = p004a4.b.a("developmentPlatformVersion");

    @Override // p004a4.a
    public final void a(Object obj, Object obj2) {
        p004a4.d dVar = (p004a4.d) obj2;
        K k3 = (K) ((v0) obj);
        dVar.a(f4211b, k3.a);
        dVar.a(f4212c, k3.f4096b);
        dVar.a(f4213d, k3.f4097c);
        dVar.a(f4214e, null);
        dVar.a(f4215f, k3.f4098d);
        dVar.a(f4216g, k3.f4099e);
        dVar.a(f4217h, k3.f4100f);
    }
}
