package Q3;

import com.unity3d.ads.metadata.MediationMetaData;

/* JADX INFO: renamed from: Q3.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0394o implements p004a4.c {
    public static final C0394o a = new C0394o();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final p004a4.b f4278b = p004a4.b.a(MediationMetaData.KEY_NAME);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final p004a4.b f4279c = p004a4.b.a("code");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final p004a4.b f4280d = p004a4.b.a("address");

    @Override // p004a4.a
    public final void a(Object obj, Object obj2) {
        p004a4.d dVar = (p004a4.d) obj2;
        V v4 = (V) ((z0) obj);
        dVar.a(f4278b, v4.a);
        dVar.a(f4279c, v4.f4145b);
        dVar.e(f4280d, v4.f4146c);
    }
}
