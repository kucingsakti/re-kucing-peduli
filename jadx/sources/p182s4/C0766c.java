package p182s4;

import android.os.Build;
import p004a4.b;
import p004a4.c;
import p004a4.d;

/* JADX INFO: renamed from: s4.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0766c implements c {
    public static final C0766c a = new C0766c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b f14661b = b.a("packageName");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b f14662c = b.a("versionName");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final b f14663d = b.a("appBuildVersion");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final b f14664e = b.a("deviceManufacturer");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final b f14665f = b.a("currentProcessDetails");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final b f14666g = b.a("appProcessDetails");

    @Override // p004a4.a
    public final void a(Object obj, Object obj2) {
        C0764a c0764a = (C0764a) obj;
        d dVar = (d) obj2;
        dVar.a(f14661b, c0764a.a);
        dVar.a(f14662c, c0764a.f14656b);
        dVar.a(f14663d, c0764a.f14657c);
        dVar.a(f14664e, Build.MANUFACTURER);
        dVar.a(f14665f, c0764a.f14658d);
        dVar.a(f14666g, c0764a.f14659e);
    }
}
