package p045e7;

import J7.a;
import U7.c;
import U7.i;
import V.h;
import c2.f;
import java.security.SecureRandom;
import java.util.LinkedHashMap;
import o1.e;
import p078i.AbstractActivityC0655l;
import p210v8.r;

/* JADX INFO: loaded from: classes.dex */
public final class b implements p027c7.b {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final SecureRandom f10710u = new SecureRandom();

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final LinkedHashMap f10711v = new LinkedHashMap();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final f f10712s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final AbstractActivityC0655l f10713t;

    public b(AbstractActivityC0655l abstractActivityC0655l) {
        this.f10713t = abstractActivityC0655l;
        this.f10712s = new f(abstractActivityC0655l);
    }

    @Override // p027c7.b
    public final a b() {
        r rVar = new r();
        rVar.f15464s = 0;
        return new U7.f(new i(new c(new e(this, 13, rVar), 0), 0, new h(rVar, 20)), 0);
    }

    @Override // p027c7.b
    public final boolean c() {
        return this.f10712s.a.d();
    }

    @Override // p027c7.b
    public final boolean d() {
        return this.f10712s.a.c();
    }
}
