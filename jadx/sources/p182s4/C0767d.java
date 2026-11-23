package p182s4;

import android.os.Build;
import p004a4.b;
import p004a4.c;
import p004a4.d;

/* JADX INFO: renamed from: s4.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0767d implements c {
    public static final C0767d a = new C0767d();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b f14667b = b.a("appId");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b f14668c = b.a("deviceModel");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final b f14669d = b.a("sessionSdkVersion");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final b f14670e = b.a("osVersion");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final b f14671f = b.a("logEnvironment");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final b f14672g = b.a("androidAppInfo");

    @Override // p004a4.a
    public final void a(Object obj, Object obj2) {
        C0765b c0765b = (C0765b) obj;
        d dVar = (d) obj2;
        dVar.a(f14667b, c0765b.a);
        dVar.a(f14668c, Build.MODEL);
        dVar.a(f14669d, "2.0.3");
        dVar.a(f14670e, Build.VERSION.RELEASE);
        dVar.a(f14671f, r.LOG_ENVIRONMENT_PROD);
        dVar.a(f14672g, c0765b.f14660b);
    }
}
