package F8;

import A1.C0099h;
import A9.C0140m;
import O8.C0358n;
import R8.AbstractC0408c;
import U8.C0442c;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class q0 {
    public static final ConcurrentHashMap a = new ConcurrentHashMap();

    public static final Q8.e a(Class cls) {
        N8.b bVarJ;
        N8.d dVarJ;
        int i10 = 1;
        p210v8.i.f(cls, "<this>");
        ClassLoader classLoaderD = AbstractC0408c.d(cls);
        z0 z0Var = new z0(classLoaderD);
        ConcurrentHashMap concurrentHashMap = a;
        WeakReference weakReference = (WeakReference) concurrentHashMap.get(z0Var);
        if (weakReference != null) {
            Q8.e eVar = (Q8.e) weakReference.get();
            if (eVar != null) {
                return eVar;
            }
            concurrentHashMap.remove(z0Var, weakReference);
        }
        p040e1.j jVar = new p040e1.j(classLoaderD, 24);
        ClassLoader classLoader = p076h8.m.class.getClassLoader();
        p210v8.i.e(classLoader, "Unit::class.java.classLoader");
        p040e1.j jVar2 = new p040e1.j(classLoader, 24);
        P0.d dVar = new P0.d(classLoaderD, 2);
        String str = "runtime module for " + classLoaderD;
        Q8.d dVar2 = Q8.d.f4341b;
        Q8.d dVar3 = Q8.d.f4342c;
        p210v8.i.f(str, "moduleName");
        p247z9.l lVar = new p247z9.l("DeserializationComponentsForJava.ModuleData");
        K8.i iVar = new K8.i(lVar);
        O8.C c10 = new O8.C(p096j9.f.l("<" + str + '>'), lVar, iVar, 56);
        p247z9.n nVar = lVar.a;
        nVar.lock();
        try {
            if (iVar.a != null) {
                throw new AssertionError("Built-ins module is already set: " + iVar.a + " (attempting to reset to " + c10 + ")");
            }
            iVar.a = c10;
            nVar.unlock();
            iVar.f2648f = new I8.l(c10, i10);
            p029c9.d dVar4 = new p029c9.d();
            V.h hVar = new V.h(3);
            p140o4.r rVar = new p140o4.r(lVar, c10);
            p029c9.e eVar2 = p029c9.e.f7547c;
            V8.h hVar2 = V8.h.f5216c;
            V8.h hVar3 = V8.h.a;
            p086i8.s sVar = p086i8.s.f12328s;
            p170r3.e eVar3 = new p170r3.e(lVar);
            L8.N n10 = L8.N.f2801u;
            T8.a aVar = T8.a.a;
            I8.m mVar = new I8.m(c10, rVar);
            U8.t tVar = U8.t.f4988c;
            C0442c c0442c = new C0442c(tVar);
            X8.a aVar2 = X8.a.a;
            p019b9.d dVar5 = new p019b9.d();
            U8.m mVar2 = U8.m.a;
            B9.l.f793b.getClass();
            B9.m mVar3 = B9.k.f792b;
            X8.c cVar = new X8.c(new I4.a(lVar, dVar, jVar, dVar4, hVar2, dVar2, hVar3, eVar3, dVar3, hVar, eVar2, n10, aVar, c10, mVar, c0442c, dVar5, mVar2, aVar2, mVar3, tVar, new p029c9.e()));
            i9.f fVar = i9.f.f12337g;
            p210v8.i.f(fVar, "jvmMetadataVersion");
            o1.k kVar = new o1.k(jVar, dVar4);
            p188t1.G g8 = new p188t1.G(c10, rVar, lVar, jVar);
            g8.f14983x = fVar;
            List listU = com.bumptech.glide.d.u(C0140m.a);
            I8.i iVar2 = c10.f3622v;
            K8.i iVar3 = iVar2 instanceof K8.i ? (K8.i) iVar2 : null;
            p029c9.e eVar4 = p029c9.e.f7546b;
            if (iVar3 == null || (bVarJ = iVar3.J()) == null) {
                bVarJ = N8.a.f3403b;
            }
            N8.b bVar = bVarJ;
            if (iVar3 == null || (dVarJ = iVar3.J()) == null) {
                dVarJ = N8.a.f3405d;
            }
            I4.c cVar2 = new I4.c(lVar, c10, kVar, g8, cVar, dVar2, eVar4, sVar, rVar, bVar, dVarJ, i9.h.a, mVar3, new p170r3.e(lVar), listU, 262144);
            dVar4.a = cVar2;
            hVar.f5078t = new p081i3.b(cVar, 17);
            K8.n nVarJ = iVar.J();
            K8.n nVarJ2 = iVar.J();
            p170r3.e eVar5 = new p170r3.e(lVar);
            p210v8.i.f(nVarJ, "additionalClassPartsProvider");
            p210v8.i.f(nVarJ2, "platformDependentDeclarationFilter");
            K8.o oVar = new K8.o(lVar, jVar2, c10);
            p081i3.b bVar2 = new p081i3.b(oVar, 21);
            p230x9.a aVar3 = p230x9.a.f15787m;
            oVar.f2667c = new I4.c(lVar, c10, bVar2, new o1.e(c10, rVar, aVar3), oVar, p220w9.j.a, p220w9.i.f15660c, p086i8.l.C(new J8.a(lVar, c10), new K8.g(lVar, c10)), rVar, nVarJ, nVarJ2, aVar3.a, mVar3, eVar5, null, 786432);
            c10.f3625y = new p040e1.j(p086i8.i.H(new O8.C[]{c10}), 22);
            c10.f3626z = new C0358n(p086i8.l.C(cVar, oVar), "CompositeProvider@RuntimeModuleData for " + c10);
            Q8.e eVar6 = new Q8.e(cVar2, new C0099h(dVar4, jVar));
            while (true) {
                WeakReference weakReference2 = (WeakReference) concurrentHashMap.putIfAbsent(z0Var, new WeakReference(eVar6));
                if (weakReference2 == null) {
                    return eVar6;
                }
                Q8.e eVar7 = (Q8.e) weakReference2.get();
                if (eVar7 != null) {
                    return eVar7;
                }
                concurrentHashMap.remove(z0Var, weakReference2);
            }
        } catch (Throwable th) {
            try {
                lVar.f16336b.getClass();
                throw th;
            } catch (Throwable th2) {
                nVar.unlock();
                throw th2;
            }
        }
    }
}
