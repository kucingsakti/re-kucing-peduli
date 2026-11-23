package K8;

import L8.D;
import L8.G;
import O8.C;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;
import p086i8.u;

/* JADX INFO: loaded from: classes.dex */
public final class o implements G {
    public final p247z9.l a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C f2666b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public I4.c f2667c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p247z9.j f2668d;

    public o(p247z9.l lVar, p040e1.j jVar, C c10) {
        this.a = lVar;
        this.f2666b = c10;
        this.f2668d = lVar.c(new e2.b(this, 9));
    }

    @Override // L8.G
    public final void a(p096j9.c cVar, ArrayList arrayList) {
        p210v8.i.f(cVar, "fqName");
        J9.l.b(arrayList, this.f2668d.invoke(cVar));
    }

    @Override // L8.G
    public final boolean b(p096j9.c cVar) {
        p210v8.i.f(cVar, "fqName");
        p247z9.j jVar = this.f2668d;
        Object obj = jVar.f16328t.get(cVar);
        return ((obj == null || obj == p247z9.k.f16331t) ? c(cVar) : (D) jVar.invoke(cVar)) == null;
    }

    public final p230x9.c c(p096j9.c cVar) {
        InputStream inputStreamT;
        p210v8.i.f(cVar, "fqName");
        if (cVar.h(I8.o.j)) {
            p230x9.a.f15787m.getClass();
            inputStreamT = p230x9.d.t(p230x9.a.a(cVar));
        } else {
            inputStreamT = null;
        }
        if (inputStreamT != null) {
            return com.bumptech.glide.c.e(cVar, this.a, this.f2666b, inputStreamT);
        }
        return null;
    }

    @Override // L8.G
    public final Collection k(p096j9.c cVar, p200u8.b bVar) {
        p210v8.i.f(cVar, "fqName");
        return u.f12330s;
    }
}
