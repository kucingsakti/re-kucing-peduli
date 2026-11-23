package p182s4;

import com.unity3d.services.core.device.reader.JsonStorageKeyNames;
import p004a4.b;
import p004a4.c;
import p004a4.d;

/* JADX INFO: renamed from: s4.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0771h implements c {
    public static final C0771h a = new C0771h();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b f14683b = b.a(JsonStorageKeyNames.SESSION_ID_KEY);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b f14684c = b.a("firstSessionId");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final b f14685d = b.a("sessionIndex");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final b f14686e = b.a("eventTimestampUs");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final b f14687f = b.a("dataCollectionStatus");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final b f14688g = b.a("firebaseInstallationId");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final b f14689h = b.a("firebaseAuthenticationToken");

    @Override // p004a4.a
    public final void a(Object obj, Object obj2) {
        N n10 = (N) obj;
        d dVar = (d) obj2;
        dVar.a(f14683b, n10.a);
        dVar.a(f14684c, n10.f14639b);
        dVar.g(f14685d, n10.f14640c);
        dVar.e(f14686e, n10.f14641d);
        dVar.a(f14687f, n10.f14642e);
        dVar.a(f14688g, n10.f14643f);
        dVar.a(f14689h, n10.f14644g);
    }
}
