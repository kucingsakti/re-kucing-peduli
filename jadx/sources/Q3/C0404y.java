package Q3;

import com.unity3d.ads.metadata.MediationMetaData;

/* JADX INFO: renamed from: Q3.y, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0404y implements p004a4.c {
    public static final C0404y a = new C0404y();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final p004a4.b f4321b = p004a4.b.a("platform");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final p004a4.b f4322c = p004a4.b.a(MediationMetaData.KEY_VERSION);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final p004a4.b f4323d = p004a4.b.a("buildVersion");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final p004a4.b f4324e = p004a4.b.a("jailbroken");

    @Override // p004a4.a
    public final void a(Object obj, Object obj2) {
        p004a4.d dVar = (p004a4.d) obj2;
        C0385j0 c0385j0 = (C0385j0) ((L0) obj);
        dVar.g(f4321b, c0385j0.a);
        dVar.a(f4322c, c0385j0.f4242b);
        dVar.a(f4323d, c0385j0.f4243c);
        dVar.b(f4324e, c0385j0.f4244d);
    }
}
