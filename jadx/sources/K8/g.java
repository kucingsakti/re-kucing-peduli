package K8;

import A9.A;
import C8.u;
import L8.InterfaceC0271e;
import O8.C;
import O8.C0357m;
import com.unity3d.ads.metadata.MediationMetaData;
import java.util.Collection;
import p210v8.v;

/* JADX INFO: loaded from: classes.dex */
public final class g implements N8.c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final e f2640d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ u[] f2641e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final p096j9.c f2642f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final p096j9.f f2643g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final p096j9.b f2644h;
    public final C a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p200u8.b f2645b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p247z9.i f2646c;

    static {
        v vVar = p210v8.u.a;
        f2641e = new u[]{vVar.f(new p210v8.n(vVar.b(g.class), "cloneable", "getCloneable()Lorg/jetbrains/kotlin/descriptors/impl/ClassDescriptorImpl;"))};
        f2640d = new e();
        f2642f = I8.o.f2197k;
        p096j9.e eVar = I8.n.f2166c;
        p096j9.f fVarF = eVar.f();
        p210v8.i.e(fVarF, "cloneable.shortName()");
        f2643g = fVarF;
        f2644h = p096j9.b.j(eVar.g());
    }

    public g(p247z9.l lVar, C c10) {
        f fVar = f.f2639s;
        this.a = c10;
        this.f2645b = fVar;
        this.f2646c = new p247z9.i(lVar, new A(this, 18, lVar));
    }

    @Override // N8.c
    public final InterfaceC0271e a(p096j9.b bVar) {
        p210v8.i.f(bVar, "classId");
        if (bVar.equals(f2644h)) {
            return (C0357m) J7.j.o(this.f2646c, f2641e[0]);
        }
        return null;
    }

    @Override // N8.c
    public final boolean b(p096j9.c cVar, p096j9.f fVar) {
        p210v8.i.f(cVar, "packageFqName");
        p210v8.i.f(fVar, MediationMetaData.KEY_NAME);
        return fVar.equals(f2643g) && cVar.equals(f2642f);
    }

    @Override // N8.c
    public final Collection c(p096j9.c cVar) {
        p210v8.i.f(cVar, "packageFqName");
        return cVar.equals(f2642f) ? p086i8.C.w((C0357m) J7.j.o(this.f2646c, f2641e[0])) : p086i8.u.f12330s;
    }
}
