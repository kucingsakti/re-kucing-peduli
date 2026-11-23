package V8;

import C8.u;
import R8.C0409d;
import java.util.Map;
import p210v8.n;
import p210v8.v;
import p247z9.l;

/* JADX INFO: loaded from: classes.dex */
public final class g extends b {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ u[] f5213g;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final p247z9.i f5214f;

    static {
        v vVar = p210v8.u.a;
        f5213g = new u[]{vVar.f(new n(vVar.b(g.class), "allValueArguments", "getAllValueArguments()Ljava/util/Map;"))};
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(C0409d c0409d, Fa.e eVar) {
        super(eVar, c0409d, I8.n.f2175m);
        p210v8.i.f(eVar, "c");
        l lVar = (l) ((I4.a) eVar.f1659t).a;
        f fVar = f.f5212s;
        lVar.getClass();
        this.f5214f = new p247z9.i(lVar, fVar);
    }

    @Override // V8.b, M8.b
    public final Map b() {
        return (Map) J7.j.o(this.f5214f, f5213g[0]);
    }
}
