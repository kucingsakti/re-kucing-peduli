package K8;

import O8.C;
import java.util.List;
import p086i8.s;
import p086i8.y;
import p145o9.v;

/* JADX INFO: loaded from: classes.dex */
public final class l extends p210v8.k implements p200u8.a {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f2656s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ n f2657t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(n nVar, int i10) {
        super(0);
        this.f2656s = i10;
        this.f2657t = nVar;
    }

    @Override // p200u8.a
    public final Object invoke() {
        n nVar = this.f2657t;
        switch (this.f2656s) {
            case 0:
                return nVar.a.f3622v.e();
            default:
                C c10 = nVar.a;
                p096j9.f fVar = M8.e.a;
                I8.i iVar = c10.f3622v;
                p210v8.i.f(iVar, "<this>");
                List listU = com.bumptech.glide.d.u(new M8.j(iVar, I8.n.f2175m, y.w(new p076h8.f(M8.e.a, new v("This member is not fully supported by Kotlin compiler, so it may be absent or have different signature in next major version")), new p076h8.f(M8.e.f3196b, new p145o9.a((Object) new M8.j(iVar, I8.n.f2177o, y.w(new p076h8.f(M8.e.f3198d, new v("")), new p076h8.f(M8.e.f3199e, new p145o9.b(s.f12328s, new A0.m(iVar, 12))))))), new p076h8.f(M8.e.f3197c, new p145o9.i(p096j9.b.j(I8.n.f2176n), p096j9.f.j("WARNING"))))));
                return listU.isEmpty() ? M8.g.a : new M8.i(listU, 0);
        }
    }
}
