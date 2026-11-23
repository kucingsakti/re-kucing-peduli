package Q3;

import com.unity3d.ads.metadata.MediationMetaData;

/* JADX INFO: renamed from: Q3.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0388l implements p004a4.c {
    public static final C0388l a = new C0388l();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final p004a4.b f4252b = p004a4.b.a("baseAddress");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final p004a4.b f4253c = p004a4.b.a("size");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final p004a4.b f4254d = p004a4.b.a(MediationMetaData.KEY_NAME);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final p004a4.b f4255e = p004a4.b.a("uuid");

    @Override // p004a4.a
    public final void a(Object obj, Object obj2) {
        p004a4.d dVar = (p004a4.d) obj2;
        T t7 = (T) ((x0) obj);
        dVar.e(f4252b, t7.a);
        dVar.e(f4253c, t7.f4138b);
        dVar.a(f4254d, t7.f4139c);
        String str = t7.f4140d;
        dVar.a(f4255e, str != null ? str.getBytes(O0.a) : null);
    }
}
