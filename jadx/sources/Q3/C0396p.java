package Q3;

import com.unity3d.ads.metadata.MediationMetaData;

/* JADX INFO: renamed from: Q3.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0396p implements p004a4.c {
    public static final C0396p a = new C0396p();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final p004a4.b f4281b = p004a4.b.a(MediationMetaData.KEY_NAME);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final p004a4.b f4282c = p004a4.b.a("importance");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final p004a4.b f4283d = p004a4.b.a("frames");

    @Override // p004a4.a
    public final void a(Object obj, Object obj2) {
        p004a4.d dVar = (p004a4.d) obj2;
        W w2 = (W) ((B0) obj);
        dVar.a(f4281b, w2.a);
        dVar.g(f4282c, w2.f4147b);
        dVar.a(f4283d, w2.f4148c);
    }
}
