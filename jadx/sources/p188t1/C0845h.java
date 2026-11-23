package p188t1;

import E4.B;
import com.kcstream.cing.MainApp;
import p086i8.C;
import p204v1.d;
import p204v1.e;
import p204v1.f;
import p204v1.j;

/* JADX INFO: renamed from: t1.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0845h extends d {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final j f15038g;

    static {
        C.a(C.c("0F60B2DC19E6C4B38F780121885E6131D0"));
    }

    public C0845h(f fVar, j jVar) {
        super(fVar);
        this.f15038g = jVar;
    }

    @Override // p188t1.Q
    public final void a(MainApp mainApp) {
        F fB = d.b(new B(this, 13, mainApp));
        j jVar = this.f15038g;
        d.f(jVar.f15407c, 64);
        e eVar = jVar.f15406b;
        eVar.d();
        e(C.a(C.c("0F60B2DC19E6C4B38F780121885E6131D0")), fB);
        if (fB.b()) {
            c(eVar.d(), C.a(C.c("0F60B2DC19E6C4B38F780121885E6131D0")));
        }
        if (fB.a()) {
            jVar.a(eVar.d(), C.a(C.c("0F60B2DC19E6C4B38F780121885E6131D0")));
        }
    }

    @Override // p188t1.Q
    public final boolean c() {
        return d.g(this.f15038g.f15406b.d());
    }
}
