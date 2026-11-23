package t9;

import C8.u;
import L8.InterfaceC0273g;
import L8.K;
import O8.N;
import com.unity3d.ads.metadata.MediationMetaData;
import java.util.Collection;
import java.util.List;
import p210v8.v;

/* JADX INFO: loaded from: classes.dex */
public final class r extends o {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ u[] f15262e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p238y9.g f15263b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p247z9.i f15264c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p247z9.i f15265d;

    static {
        v vVar = p210v8.u.a;
        f15262e = new u[]{vVar.f(new p210v8.n(vVar.b(r.class), "functions", "getFunctions()Ljava/util/List;")), vVar.f(new p210v8.n(vVar.b(r.class), "properties", "getProperties()Ljava/util/List;"))};
    }

    public r(p247z9.l lVar, p238y9.g gVar) {
        p210v8.i.f(lVar, "storageManager");
        this.f15263b = gVar;
        this.f15264c = new p247z9.i(lVar, new q(this, 0));
        this.f15265d = new p247z9.i(lVar, new q(this, 1));
    }

    @Override // t9.o, t9.p
    public final InterfaceC0273g a(p096j9.f fVar, T8.b bVar) {
        p210v8.i.f(fVar, MediationMetaData.KEY_NAME);
        p210v8.i.f(bVar, "location");
        return null;
    }

    @Override // t9.o, t9.n
    public final Collection b(p096j9.f fVar, T8.b bVar) {
        p210v8.i.f(fVar, MediationMetaData.KEY_NAME);
        List list = (List) J7.j.o(this.f15265d, f15262e[1]);
        J9.g gVar = new J9.g();
        for (Object obj : list) {
            if (p210v8.i.a(((K) obj).getName(), fVar)) {
                gVar.add(obj);
            }
        }
        return gVar;
    }

    @Override // t9.o, t9.n
    public final Collection c(p096j9.f fVar, T8.b bVar) {
        p210v8.i.f(fVar, MediationMetaData.KEY_NAME);
        List list = (List) J7.j.o(this.f15264c, f15262e[0]);
        J9.g gVar = new J9.g();
        for (Object obj : list) {
            if (p210v8.i.a(((N) obj).getName(), fVar)) {
                gVar.add(obj);
            }
        }
        return gVar;
    }

    @Override // t9.o, t9.p
    public final Collection f(f fVar, p200u8.b bVar) {
        p210v8.i.f(fVar, "kindFilter");
        p247z9.i iVar = this.f15264c;
        u[] uVarArr = f15262e;
        return p086i8.k.g0((List) J7.j.o(iVar, uVarArr[0]), (List) J7.j.o(this.f15265d, uVarArr[1]));
    }
}
