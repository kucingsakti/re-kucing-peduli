package t9;

import L8.InterfaceC0271e;
import L8.InterfaceC0273g;
import L8.InterfaceC0274h;
import com.unity3d.ads.metadata.MediationMetaData;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class i extends o {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n f15251b;

    public i(n nVar) {
        p210v8.i.f(nVar, "workerScope");
        this.f15251b = nVar;
    }

    @Override // t9.o, t9.p
    public final InterfaceC0273g a(p096j9.f fVar, T8.b bVar) {
        p210v8.i.f(fVar, MediationMetaData.KEY_NAME);
        p210v8.i.f(bVar, "location");
        InterfaceC0273g interfaceC0273gA = this.f15251b.a(fVar, bVar);
        if (interfaceC0273gA != null) {
            InterfaceC0271e interfaceC0271e = interfaceC0273gA instanceof InterfaceC0271e ? (InterfaceC0271e) interfaceC0273gA : null;
            if (interfaceC0271e != null) {
                return interfaceC0271e;
            }
            if (interfaceC0273gA instanceof p238y9.q) {
                return (p238y9.q) interfaceC0273gA;
            }
        }
        return null;
    }

    @Override // t9.o, t9.n
    public final Set d() {
        return this.f15251b.d();
    }

    @Override // t9.o, t9.n
    public final Set e() {
        return this.f15251b.e();
    }

    @Override // t9.o, t9.p
    public final Collection f(f fVar, p200u8.b bVar) {
        Collection collection;
        p210v8.i.f(fVar, "kindFilter");
        int i10 = f.f15237l & fVar.f15245b;
        f fVar2 = i10 == 0 ? null : new f(fVar.a, i10);
        if (fVar2 == null) {
            collection = p086i8.s.f12328s;
        } else {
            Collection collectionF = this.f15251b.f(fVar2, bVar);
            ArrayList arrayList = new ArrayList();
            for (Object obj : collectionF) {
                if (obj instanceof InterfaceC0274h) {
                    arrayList.add(obj);
                }
            }
            collection = arrayList;
        }
        return collection;
    }

    @Override // t9.o, t9.n
    public final Set g() {
        return this.f15251b.g();
    }

    public final String toString() {
        return "Classes from " + this.f15251b;
    }
}
