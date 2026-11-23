package p188t1;

import E4.B;
import com.kcstream.cing.MainApp;
import p086i8.C;
import p204v1.d;
import p204v1.e;
import p204v1.f;
import p204v1.j;

/* JADX INFO: renamed from: t1.y, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0861y extends d {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final j f15137g;

    static {
        C.a(C.c("137BA7DD0FE8F397A8"));
    }

    public C0861y(f fVar, j jVar) {
        super(fVar);
        this.f15137g = jVar;
    }

    @Override // p188t1.Q
    public final void a(MainApp mainApp) {
        F fB = d.b(new B(this, 16, mainApp));
        j jVar = this.f15137g;
        jVar.f15406b.getClass();
        e(C.a(C.c("137BA7DD0FE8F397A8")), fB);
        boolean zB = fB.b();
        e eVar = jVar.f15406b;
        if (zB) {
            String strA = C.a(C.c("137BA7DD0FE8F397A8"));
            eVar.getClass();
            c(1, strA);
        }
        if (fB.a()) {
            eVar.getClass();
            jVar.a(1, C.a(C.c("137BA7DD0FE8F397A8")));
        }
    }

    @Override // p188t1.Q
    public final boolean c() {
        return false;
    }
}
