package p182s4;

import p004a4.b;
import p004a4.c;
import p004a4.d;

/* JADX INFO: renamed from: s4.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0769f implements c {
    public static final C0769f a = new C0769f();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b f14676b = b.a("processName");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b f14677c = b.a("pid");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final b f14678d = b.a("importance");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final b f14679e = b.a("defaultProcess");

    @Override // p004a4.a
    public final void a(Object obj, Object obj2) {
        C0781s c0781s = (C0781s) obj;
        d dVar = (d) obj2;
        dVar.a(f14676b, c0781s.a);
        dVar.g(f14677c, c0781s.f14714b);
        dVar.g(f14678d, c0781s.f14715c);
        dVar.b(f14679e, c0781s.f14716d);
    }
}
