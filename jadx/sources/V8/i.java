package V8;

import A0.r;
import C8.u;
import R8.C0409d;
import java.util.Map;
import p210v8.n;
import p210v8.v;
import p247z9.l;

/* JADX INFO: loaded from: classes.dex */
public final class i extends b {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ u[] f5217g;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final p247z9.i f5218f;

    static {
        v vVar = p210v8.u.a;
        f5217g = new u[]{vVar.f(new n(vVar.b(i.class), "allValueArguments", "getAllValueArguments()Ljava/util/Map;"))};
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(C0409d c0409d, Fa.e eVar) {
        super(eVar, c0409d, I8.n.f2185w);
        p210v8.i.f(c0409d, "annotation");
        p210v8.i.f(eVar, "c");
        l lVar = (l) ((I4.a) eVar.f1659t).a;
        r rVar = new r(this, 23);
        lVar.getClass();
        this.f5218f = new p247z9.i(lVar, rVar);
    }

    @Override // V8.b, M8.b
    public final Map b() {
        return (Map) J7.j.o(this.f5218f, f5217g[0]);
    }
}
