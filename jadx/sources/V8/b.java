package V8;

import A9.A;
import A9.AbstractC0151y;
import A9.D;
import C8.u;
import L8.M;
import R8.C0409d;
import com.onesignal.inAppMessages.internal.display.impl.k;
import java.util.Map;
import p086i8.t;
import p210v8.n;
import p210v8.v;
import p247z9.l;

/* JADX INFO: loaded from: classes.dex */
public class b implements M8.b, W8.h {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ u[] f5203e;
    public final p096j9.c a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final M f5204b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p247z9.i f5205c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p009a9.a f5206d;

    static {
        v vVar = p210v8.u.a;
        f5203e = new u[]{vVar.f(new n(vVar.b(b.class), k.EVENT_TYPE_KEY, "getType()Lorg/jetbrains/kotlin/types/SimpleType;"))};
    }

    public b(Fa.e eVar, C0409d c0409d, p096j9.c cVar) {
        p210v8.i.f(eVar, "c");
        p210v8.i.f(cVar, "fqName");
        this.a = cVar;
        I4.a aVar = (I4.a) eVar.f1659t;
        this.f5204b = c0409d != null ? ((Q8.d) aVar.j).a(c0409d) : M.a;
        l lVar = (l) aVar.a;
        A a = new A(eVar, 23, this);
        lVar.getClass();
        this.f5205c = new p247z9.i(lVar, a);
        this.f5206d = c0409d != null ? (p009a9.a) p086i8.k.U(c0409d.b()) : null;
    }

    @Override // M8.b
    public final p096j9.c a() {
        return this.a;
    }

    @Override // M8.b
    public Map b() {
        return t.f12329s;
    }

    @Override // M8.b
    public final M g() {
        return this.f5204b;
    }

    @Override // M8.b
    public final AbstractC0151y getType() {
        return (D) J7.j.o(this.f5205c, f5203e[0]);
    }
}
