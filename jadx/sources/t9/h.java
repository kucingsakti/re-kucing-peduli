package t9;

import C8.u;
import L8.K;
import O8.AbstractC0346b;
import O8.N;
import com.unity3d.ads.metadata.MediationMetaData;
import java.util.Collection;
import java.util.List;
import p210v8.v;

/* JADX INFO: loaded from: classes.dex */
public abstract class h extends o {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ u[] f15248d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AbstractC0346b f15249b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p247z9.i f15250c;

    static {
        v vVar = p210v8.u.a;
        f15248d = new u[]{vVar.f(new p210v8.n(vVar.b(h.class), "allDescriptors", "getAllDescriptors()Ljava/util/List;"))};
    }

    public h(p247z9.l lVar, AbstractC0346b abstractC0346b) {
        this.f15249b = abstractC0346b;
        this.f15250c = new p247z9.i(lVar, new c2.a(this, 17));
    }

    @Override // t9.o, t9.n
    public final Collection b(p096j9.f fVar, T8.b bVar) {
        p210v8.i.f(fVar, MediationMetaData.KEY_NAME);
        List list = (List) J7.j.o(this.f15250c, f15248d[0]);
        J9.g gVar = new J9.g();
        for (Object obj : list) {
            if ((obj instanceof K) && p210v8.i.a(((K) obj).getName(), fVar)) {
                gVar.add(obj);
            }
        }
        return gVar;
    }

    @Override // t9.o, t9.n
    public final Collection c(p096j9.f fVar, T8.b bVar) {
        p210v8.i.f(fVar, MediationMetaData.KEY_NAME);
        List list = (List) J7.j.o(this.f15250c, f15248d[0]);
        J9.g gVar = new J9.g();
        for (Object obj : list) {
            if ((obj instanceof N) && p210v8.i.a(((N) obj).getName(), fVar)) {
                gVar.add(obj);
            }
        }
        return gVar;
    }

    @Override // t9.o, t9.p
    public final Collection f(f fVar, p200u8.b bVar) {
        p210v8.i.f(fVar, "kindFilter");
        return !fVar.a(f.f15239n.f15245b) ? p086i8.s.f12328s : (List) J7.j.o(this.f15250c, f15248d[0]);
    }

    public abstract List h();
}
