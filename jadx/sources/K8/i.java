package K8;

import A9.A;
import C8.u;
import O8.C;
import androidx.datastore.preferences.protobuf.AbstractC0487g;
import p210v8.v;

/* JADX INFO: loaded from: classes.dex */
public final class i extends I8.i {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ u[] f2647h;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public I8.l f2648f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final p247z9.i f2649g;

    static {
        v vVar = p210v8.u.a;
        f2647h = new u[]{vVar.f(new p210v8.n(vVar.b(i.class), "customizer", "getCustomizer()Lorg/jetbrains/kotlin/builtins/jvm/JvmBuiltInsCustomizer;"))};
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(p247z9.l lVar) {
        super(lVar);
        AbstractC0487g.p(1, "kind");
        this.f2649g = new p247z9.i(lVar, new A(this, 19, lVar));
        int iD = p239z.e.d(1);
        if (iD == 1) {
            c();
        } else {
            if (iD != 2) {
                return;
            }
            c();
        }
    }

    public final n J() {
        return (n) J7.j.o(this.f2649g, f2647h[0]);
    }

    @Override // I8.i
    public final N8.b d() {
        return J();
    }

    @Override // I8.i
    public final Iterable l() {
        Iterable iterableL = super.l();
        p247z9.l lVar = this.f2115d;
        C cK = k();
        p210v8.i.e(cK, "builtInsModule");
        return p086i8.k.f0(iterableL, new g(lVar, cK));
    }

    @Override // I8.i
    public final N8.d p() {
        return J();
    }
}
