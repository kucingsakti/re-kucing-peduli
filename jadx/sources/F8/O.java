package F8;

import A1.C0099h;
import B4.C0157e;
import L8.InterfaceC0290y;
import R8.AbstractC0408c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;

/* JADX INFO: loaded from: classes.dex */
public final class O extends p210v8.k implements p200u8.a {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f1532s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ P f1533t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ O(P p10, int i10) {
        super(0);
        this.f1532s = i10;
        this.f1533t = p10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v15, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v6, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v7 */
    @Override // p200u8.a
    public final Object invoke() throws InvalidProtocolBufferException {
        String[] strArr;
        ?? U6;
        switch (this.f1532s) {
            case 0:
                P p10 = this.f1533t;
                p10.getClass();
                C8.u uVar = P.f1534g[0];
                Q8.b bVar = (Q8.b) p10.f1535c.invoke();
                if (bVar != null) {
                    C0157e c0157e = bVar.f4340b;
                    String[] strArr2 = (String[]) c0157e.f668e;
                    if (strArr2 != null && (strArr = (String[]) c0157e.f670g) != null) {
                        p076h8.f fVarH = i9.h.h(strArr2, strArr);
                        return new p076h8.k((i9.g) fVarH.f11789s, (p047e9.C) fVarH.f11790t, (i9.f) c0157e.f667d);
                    }
                }
                return null;
            default:
                P p11 = this.f1533t;
                p11.getClass();
                C8.u uVar2 = P.f1534g[0];
                Q8.b bVar2 = (Q8.b) p11.f1535c.invoke();
                if (bVar2 == null) {
                    return t9.m.f15259b;
                }
                C8.u uVar3 = B.f1510b[0];
                Object objInvoke = p11.a.invoke();
                p210v8.i.e(objInvoke, "<get-moduleData>(...)");
                C0099h c0099h = ((Q8.e) objInvoke).f4343b;
                ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) c0099h.f105v;
                Class cls = bVar2.a;
                p096j9.b bVarA = AbstractC0408c.a(cls);
                Object obj = concurrentHashMap.get(bVarA);
                if (obj == null) {
                    p096j9.c cVarG = AbstractC0408c.a(cls).g();
                    p210v8.i.e(cVarG, "fileClass.classId.packageFqName");
                    C0157e c0157e2 = bVar2.f4340b;
                    p037d9.a aVar = p037d9.a.MULTIFILE_CLASS;
                    p029c9.d dVar = (p029c9.d) c0099h.f103t;
                    p037d9.a aVar2 = (p037d9.a) c0157e2.f665b;
                    if (aVar2 == aVar) {
                        String[] strArr3 = aVar2 == aVar ? (String[]) c0157e2.f668e : null;
                        List listL = strArr3 != null ? p086i8.i.l(strArr3) : null;
                        if (listL == null) {
                            listL = p086i8.s.f12328s;
                        }
                        U6 = new ArrayList();
                        Iterator it = listL.iterator();
                        while (it.hasNext()) {
                            p096j9.b bVarJ = p096j9.b.j(new p096j9.c(p176r9.b.d((String) it.next()).a.replace('/', '.')));
                            p210v8.i.f((p220w9.i) dVar.c().f2080c, "<this>");
                            Q8.b bVarD = p068ga.l.d((p040e1.j) c0099h.f104u, bVarJ, i9.f.f12337g);
                            if (bVarD != null) {
                                U6.add(bVarD);
                            }
                        }
                    } else {
                        U6 = com.bumptech.glide.d.u(bVar2);
                    }
                    K8.k kVar = new K8.k((InterfaceC0290y) dVar.c().f2079b, cVarG, 1);
                    ArrayList arrayList = new ArrayList();
                    Iterator it2 = ((Iterable) U6).iterator();
                    while (it2.hasNext()) {
                        p238y9.n nVarA = dVar.a(kVar, (Q8.b) it2.next());
                        if (nVarA != null) {
                            arrayList.add(nVarA);
                        }
                    }
                    t9.n nVarB = p068ga.l.b("package " + cVarG + " (" + bVar2 + ')', p086i8.k.s0(arrayList));
                    Object objPutIfAbsent = concurrentHashMap.putIfAbsent(bVarA, nVarB);
                    obj = objPutIfAbsent == null ? nVarB : objPutIfAbsent;
                }
                p210v8.i.e(obj, "cache.getOrPut(fileClass…ileClass)\", scopes)\n    }");
                return (t9.n) obj;
        }
    }
}
