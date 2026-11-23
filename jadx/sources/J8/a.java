package J8;

import J7.j;
import L8.InterfaceC0271e;
import L9.n;
import O8.C;
import O8.z;
import com.unity3d.ads.metadata.MediationMetaData;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import p086i8.k;
import p086i8.u;
import p210v8.i;
import p247z9.l;

/* JADX INFO: loaded from: classes.dex */
public final class a implements N8.c {
    public final l a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C f2441b;

    public a(l lVar, C c10) {
        i.f(c10, "module");
        this.a = lVar;
        this.f2441b = c10;
    }

    @Override // N8.c
    public final InterfaceC0271e a(p096j9.b bVar) {
        i.f(bVar, "classId");
        if (bVar.f12542c || !bVar.f12541b.e().d()) {
            return null;
        }
        String strB = bVar.h().b();
        if (!L9.f.J(strB, "Function", false)) {
            return null;
        }
        p096j9.c cVarG = bVar.g();
        i.e(cVarG, "classId.packageFqName");
        e.f2453u.getClass();
        d dVarU = K3.d.u(strB, cVarG);
        if (dVarU == null) {
            return null;
        }
        List list = (List) j.o(((z) this.f2441b.K(cVarG)).f3797w, z.f3794z[0]);
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof p230x9.c) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            it.next();
        }
        if (k.V(arrayList2) != null) {
            throw new ClassCastException();
        }
        return new c(this.a, (p230x9.c) k.T(arrayList), dVarU.a, dVarU.f2452b);
    }

    @Override // N8.c
    public final boolean b(p096j9.c cVar, p096j9.f fVar) {
        i.f(cVar, "packageFqName");
        i.f(fVar, MediationMetaData.KEY_NAME);
        String strG = fVar.g();
        i.e(strG, "name.asString()");
        if (n.I(strG, "Function", false) || n.I(strG, "KFunction", false) || n.I(strG, "SuspendFunction", false) || n.I(strG, "KSuspendFunction", false)) {
            e.f2453u.getClass();
            if (K3.d.u(strG, cVar) != null) {
                return true;
            }
        }
        return false;
    }

    @Override // N8.c
    public final Collection c(p096j9.c cVar) {
        i.f(cVar, "packageFqName");
        return u.f12330s;
    }
}
