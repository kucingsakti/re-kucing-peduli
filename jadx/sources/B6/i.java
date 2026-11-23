package B6;

import E4.S;
import android.os.Build;
import java.util.HashSet;
import java.util.LinkedHashSet;
import p078i.AbstractActivityC0655l;
import p156q0.C0742a;
import p156q0.M;

/* JADX INFO: loaded from: classes.dex */
public final class i {
    public AbstractActivityC0655l a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f749b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public LinkedHashSet f750c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public LinkedHashSet f751d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public LinkedHashSet f752e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public LinkedHashSet f753f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public LinkedHashSet f754g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public LinkedHashSet f755h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public LinkedHashSet f756i;
    public S j;

    public final AbstractActivityC0655l a() {
        AbstractActivityC0655l abstractActivityC0655l = this.a;
        if (abstractActivityC0655l != null) {
            return abstractActivityC0655l;
        }
        p210v8.i.n("activity");
        throw null;
    }

    public final androidx.fragment.app.e b() {
        M m2 = a().m();
        p210v8.i.e(m2, "activity.supportFragmentManager");
        return m2;
    }

    public final h c() {
        androidx.fragment.app.b bVarE = b().E("InvisibleFragment");
        if (bVarE != null) {
            return (h) bVarE;
        }
        h hVar = new h();
        C0742a c0742a = new C0742a(b());
        c0742a.j(0, hVar, "InvisibleFragment", 1);
        if (c0742a.f14299g) {
            throw new IllegalStateException("This transaction is already being added to the back stack");
        }
        c0742a.f14300h = false;
        c0742a.f14309r.A(c0742a, true);
        return hVar;
    }

    public final int d() {
        return a().getApplicationInfo().targetSdkVersion;
    }

    public final void e(S s9) {
        this.j = s9;
        if (Build.VERSION.SDK_INT != 26) {
            this.f749b = a().getRequestedOrientation();
            int i10 = a().getResources().getConfiguration().orientation;
            if (i10 == 1) {
                a().setRequestedOrientation(7);
            } else if (i10 == 2) {
                a().setRequestedOrientation(6);
            }
        }
        j jVar = new j(this, 4);
        j jVar2 = new j(this, 0);
        jVar.f726t = jVar2;
        j jVar3 = new j(this, 6);
        jVar2.f726t = jVar3;
        j jVar4 = new j(this, 7);
        jVar3.f726t = jVar4;
        j jVar5 = new j(this, 3);
        jVar4.f726t = jVar5;
        j jVar6 = new j(this, 2);
        jVar5.f726t = jVar6;
        j jVar7 = new j(this, 5);
        jVar6.f726t = jVar7;
        jVar7.f726t = new j(this, 1);
        jVar.p();
    }

    public final void f(HashSet hashSet, j jVar) {
        p210v8.i.f(hashSet, "permissions");
        h hVarC = c();
        hVarC.f743u0 = this;
        hVarC.f744v0 = jVar;
        Object[] array = hashSet.toArray(new String[0]);
        p210v8.i.d(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        hVarC.f745w0.a(array);
    }
}
