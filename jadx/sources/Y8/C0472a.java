package Y8;

import com.unity3d.ads.metadata.MediationMetaData;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: renamed from: Y8.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0472a implements InterfaceC0474c {
    public final R8.n a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p210v8.k f5732b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final A0.m f5733c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final LinkedHashMap f5734d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final LinkedHashMap f5735e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final LinkedHashMap f5736f;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v4, types: [u8.b, v8.k] */
    /* JADX WARN: Type inference failed for: r6v6, types: [u8.b, v8.k] */
    public C0472a(R8.n nVar, p200u8.b bVar) {
        p210v8.i.f(nVar, "jClass");
        this.a = nVar;
        this.f5732b = (p210v8.k) bVar;
        A0.m mVar = new A0.m(this, 22);
        this.f5733c = mVar;
        K9.g gVar = new K9.g(p086i8.k.N(nVar.d()), true, mVar);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        K9.f fVar = new K9.f(gVar);
        while (fVar.hasNext()) {
            Object next = fVar.next();
            p096j9.f fVarC = ((R8.w) next).c();
            Object arrayList = linkedHashMap.get(fVarC);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(fVarC, arrayList);
            }
            ((List) arrayList).add(next);
        }
        this.f5734d = linkedHashMap;
        K9.g gVar2 = new K9.g(p086i8.k.N(this.a.b()), true, this.f5732b);
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        K9.f fVar2 = new K9.f(gVar2);
        while (fVar2.hasNext()) {
            Object next2 = fVar2.next();
            linkedHashMap2.put(((R8.t) next2).c(), next2);
        }
        this.f5735e = linkedHashMap2;
        ArrayList arrayListE = this.a.e();
        ?? r10 = this.f5732b;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayListE) {
            if (((Boolean) r10.invoke(obj)).booleanValue()) {
                arrayList2.add(obj);
            }
        }
        int iS = p086i8.z.s(p086i8.m.H(arrayList2, 10));
        LinkedHashMap linkedHashMap3 = new LinkedHashMap(iS < 16 ? 16 : iS);
        for (Object obj2 : arrayList2) {
            linkedHashMap3.put(((R8.z) obj2).c(), obj2);
        }
        this.f5736f = linkedHashMap3;
    }

    @Override // Y8.InterfaceC0474c
    public final Set a() {
        K9.g gVar = new K9.g(p086i8.k.N(this.a.d()), true, this.f5733c);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        K9.f fVar = new K9.f(gVar);
        while (fVar.hasNext()) {
            linkedHashSet.add(((R8.w) fVar.next()).c());
        }
        return linkedHashSet;
    }

    @Override // Y8.InterfaceC0474c
    public final Set b() {
        return this.f5736f.keySet();
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [u8.b, v8.k] */
    @Override // Y8.InterfaceC0474c
    public final Set c() {
        K9.g gVar = new K9.g(p086i8.k.N(this.a.b()), true, this.f5732b);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        K9.f fVar = new K9.f(gVar);
        while (fVar.hasNext()) {
            linkedHashSet.add(((R8.t) fVar.next()).c());
        }
        return linkedHashSet;
    }

    @Override // Y8.InterfaceC0474c
    public final R8.t d(p096j9.f fVar) {
        p210v8.i.f(fVar, MediationMetaData.KEY_NAME);
        return (R8.t) this.f5735e.get(fVar);
    }

    @Override // Y8.InterfaceC0474c
    public final Collection e(p096j9.f fVar) {
        p210v8.i.f(fVar, MediationMetaData.KEY_NAME);
        List list = (List) this.f5734d.get(fVar);
        return list != null ? list : p086i8.s.f12328s;
    }

    @Override // Y8.InterfaceC0474c
    public final R8.z f(p096j9.f fVar) {
        p210v8.i.f(fVar, MediationMetaData.KEY_NAME);
        return (R8.z) this.f5736f.get(fVar);
    }
}
