package t9;

import L8.InterfaceC0273g;
import O8.N;
import com.unity3d.ads.metadata.MediationMetaData;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public abstract class o implements n {
    @Override // t9.p
    public InterfaceC0273g a(p096j9.f fVar, T8.b bVar) {
        p210v8.i.f(fVar, MediationMetaData.KEY_NAME);
        p210v8.i.f(bVar, "location");
        return null;
    }

    @Override // t9.n
    public Collection b(p096j9.f fVar, T8.b bVar) {
        p210v8.i.f(fVar, MediationMetaData.KEY_NAME);
        return p086i8.s.f12328s;
    }

    @Override // t9.n
    public Collection c(p096j9.f fVar, T8.b bVar) {
        p210v8.i.f(fVar, MediationMetaData.KEY_NAME);
        return p086i8.s.f12328s;
    }

    @Override // t9.n
    public Set d() {
        Collection collectionF = f(f.f15241p, J9.c.f2464s);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Object obj : collectionF) {
            if (obj instanceof N) {
                p096j9.f name = ((N) obj).getName();
                p210v8.i.e(name, "it.name");
                linkedHashSet.add(name);
            }
        }
        return linkedHashSet;
    }

    @Override // t9.n
    public Set e() {
        Collection collectionF = f(f.f15242q, J9.c.f2464s);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Object obj : collectionF) {
            if (obj instanceof N) {
                p096j9.f name = ((N) obj).getName();
                p210v8.i.e(name, "it.name");
                linkedHashSet.add(name);
            }
        }
        return linkedHashSet;
    }

    @Override // t9.p
    public Collection f(f fVar, p200u8.b bVar) {
        p210v8.i.f(fVar, "kindFilter");
        return p086i8.s.f12328s;
    }

    @Override // t9.n
    public Set g() {
        return null;
    }
}
