package p188t1;

import E4.B;
import com.google.android.gms.internal.measurement.S;
import com.kcstream.cing.MainApp;
import p086i8.C;
import p204v1.d;
import p204v1.e;
import p204v1.f;
import p204v1.j;

/* JADX INFO: loaded from: classes.dex */
public final class K extends d {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final S f14984g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final j f14985h;

    static {
        C.a(C.c("0467B6DC0D"));
    }

    public K(f fVar, S s9, j jVar) {
        super(fVar);
        this.f14984g = s9;
        this.f14985h = jVar;
    }

    @Override // p188t1.Q
    public final void a(MainApp mainApp) {
        F fB = d.b(new B(this, 17, mainApp));
        j jVar = this.f14985h;
        d.f(jVar.f15407c, 2);
        e eVar = jVar.f15406b;
        eVar.a();
        this.f14984g.j(EnumC0840c.f15021v, fB.b());
        e(C.a(C.c("0467B6DC0D")), fB);
        if (fB.b()) {
            c(eVar.a(), C.a(C.c("0467B6DC0D")));
        }
        if (fB.a()) {
            jVar.a(eVar.a(), C.a(C.c("0467B6DC0D")));
        }
    }

    @Override // p188t1.Q
    public final boolean c() {
        return d.g(this.f14985h.f15406b.a());
    }
}
