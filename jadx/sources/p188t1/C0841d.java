package p188t1;

import E4.B;
import com.kcstream.cing.MainApp;
import p086i8.C;
import p204v1.d;
import p204v1.e;
import p204v1.f;
import p204v1.j;

/* JADX INFO: renamed from: t1.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0841d extends d {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final j f15030g;

    static {
        C.a(C.c("0166B6EC04E4C7AB8373"));
    }

    public C0841d(f fVar, j jVar) {
        super(fVar);
        this.f15030g = jVar;
    }

    @Override // p188t1.Q
    public final void a(MainApp mainApp) {
        F fB = d.b(new B(this, 11, mainApp));
        j jVar = this.f15030g;
        boolean z6 = jVar.f15406b.a.a;
        e(C.a(C.c("0166B6EC04E4C7AB8373")), fB);
        boolean zB = fB.b();
        e eVar = jVar.f15406b;
        if (zB) {
            c(!eVar.a.a ? 0 : 1, C.a(C.c("0166B6EC04E4C7AB8373")));
        }
        if (fB.a()) {
            jVar.a(!eVar.a.a ? 0 : 1, C.a(C.c("0166B6EC04E4C7AB8373")));
        }
    }

    @Override // p188t1.Q
    public final boolean c() {
        return false;
    }
}
