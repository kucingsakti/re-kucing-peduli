package p182s4;

import p004a4.b;
import p004a4.c;
import p004a4.d;

/* JADX INFO: renamed from: s4.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0768e implements c {
    public static final C0768e a = new C0768e();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b f14673b = b.a("performance");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b f14674c = b.a("crashlytics");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final b f14675d = b.a("sessionSamplingRate");

    @Override // p004a4.a
    public final void a(Object obj, Object obj2) {
        C0773j c0773j = (C0773j) obj;
        d dVar = (d) obj2;
        dVar.a(f14673b, c0773j.a);
        dVar.a(f14674c, c0773j.f14695b);
        dVar.f(f14675d, c0773j.f14696c);
    }
}
