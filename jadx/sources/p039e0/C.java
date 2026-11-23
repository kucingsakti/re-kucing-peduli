package p039e0;

import C8.E;
import D3.b;
import N9.AbstractC0342z;
import N9.C0330m;
import N9.InterfaceC0341y;
import N9.b0;
import N9.c0;
import N9.k0;
import Q9.q;
import Q9.t;
import V.h;
import V9.d;
import V9.e;
import androidx.datastore.core.CorruptionException;
import c2.a;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import o1.m;
import p040e1.j;
import p086i8.k;
import p200u8.c;
import p210v8.i;

/* JADX INFO: loaded from: classes.dex */
public final class C implements f {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final LinkedHashSet f10600i = new LinkedHashSet();
    public static final Object j = new Object();
    public final a a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h f10601b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j f10602c = new j(new q(this, null), 25);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f10603d = ".tmp";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final p076h8.j f10604e = b.s(new a(this, 6));

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final t f10605f = q.a(E.a);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public List f10606g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final m f10607h;

    public C(a aVar, List list, h hVar, InterfaceC0341y interfaceC0341y) {
        this.a = aVar;
        this.f10601b = hVar;
        this.f10606g = k.s0(list);
        A0.m mVar = new A0.m(this, 29);
        n nVar = new n(this, null);
        m mVar2 = new m();
        mVar2.f13641s = interfaceC0341y;
        mVar2.f13642t = nVar;
        mVar2.f13643u = P9.h.a(Integer.MAX_VALUE);
        mVar2.f13644v = new AtomicInteger(0);
        c0 c0Var = (c0) interfaceC0341y.c().get(b0.f3440s);
        if (c0Var != null) {
            ((k0) c0Var).C(false, true, new E0.b(mVar, 9, mVar2));
        }
        this.f10607h = mVar2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00a9, code lost:
    
        if (r8 == r1) goto L46;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v10, types: [o8.g, u8.c] */
    /* JADX WARN: Type inference failed for: r2v3, types: [o8.g, u8.c] */
    /* JADX WARN: Type inference failed for: r8v0, types: [e0.C, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v10, types: [e0.C] */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v16 */
    /* JADX WARN: Type inference failed for: r8v17 */
    /* JADX WARN: Type inference failed for: r8v23 */
    /* JADX WARN: Type inference failed for: r8v24 */
    /* JADX WARN: Type inference failed for: r8v25 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b(p039e0.C r8, p039e0.k r9, p144o8.c r10) {
        /*
            Method dump skipped, instruction units count: 223
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p039e0.C.b(e0.C, e0.k, o8.c):java.lang.Object");
    }

    @Override // p039e0.f
    public final Object a(c cVar, p144o8.c cVar2) throws Throwable {
        C0330m c0330mA = AbstractC0342z.a();
        this.f10607h.i(new k(cVar, c0330mA, (D) this.f10605f.f(), cVar2.getContext()));
        return c0330mA.Q(cVar2);
    }

    public final File c() {
        return (File) this.f10604e.getValue();
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:42:0x010d  */
    /* JADX WARN: Code duplicated, block: B:46:0x011e  */
    /* JADX WARN: Code duplicated, block: B:47:0x0123  */
    /* JADX WARN: Code duplicated, block: B:56:0x010c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:58:? A[LOOP:0: B:33:0x00cd->B:58:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object d(p144o8.c cVar) throws CorruptionException, FileNotFoundException {
        s sVar;
        V9.a aVarA;
        p210v8.t tVar;
        C c10;
        p210v8.t tVar2;
        C c11;
        p210v8.t tVar3;
        u uVar;
        Iterator it;
        V9.a aVar;
        p210v8.q qVar;
        p210v8.q qVar2;
        C c12;
        d dVar;
        V9.a aVar2;
        p210v8.t tVar4;
        c cVar2;
        Object obj;
        int iHashCode;
        if (cVar instanceof s) {
            sVar = (s) cVar;
            int i10 = sVar.f10648A;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                sVar.f10648A = i10 - Integer.MIN_VALUE;
            } else {
                sVar = new s(this, cVar);
            }
        } else {
            sVar = new s(this, cVar);
        }
        Object objH = sVar.f10655y;
        p134n8.a aVar3 = p134n8.a.f13404s;
        int i11 = sVar.f10648A;
        if (i11 == 0) {
            J7.a.v(objH);
            t tVar5 = this.f10605f;
            if (!i.a(tVar5.f(), E.a) && !(tVar5.f() instanceof h)) {
                throw new IllegalStateException("Check failed.");
            }
            aVarA = e.a();
            tVar = new p210v8.t();
            sVar.f10649s = this;
            sVar.f10650t = aVarA;
            sVar.f10651u = tVar;
            sVar.f10652v = tVar;
            sVar.f10648A = 1;
            objH = h(sVar);
            if (objH != aVar3) {
                c10 = this;
                tVar2 = tVar;
            }
            return aVar3;
        }
        if (i11 == 1) {
            tVar = (p210v8.t) sVar.f10652v;
            tVar2 = (p210v8.t) sVar.f10651u;
            aVarA = (V9.a) sVar.f10650t;
            c10 = sVar.f10649s;
            J7.a.v(objH);
        } else {
            if (i11 == 2) {
                it = sVar.f10654x;
                uVar = sVar.f10653w;
                qVar = (p210v8.q) sVar.f10652v;
                tVar3 = (p210v8.t) sVar.f10651u;
                aVar = (V9.a) sVar.f10650t;
                c11 = sVar.f10649s;
                J7.a.v(objH);
                while (it.hasNext()) {
                    cVar2 = (c) it.next();
                    sVar.f10649s = c11;
                    sVar.f10650t = aVar;
                    sVar.f10651u = tVar3;
                    sVar.f10652v = qVar;
                    sVar.f10653w = uVar;
                    sVar.f10654x = it;
                    sVar.f10648A = 2;
                    if (cVar2.invoke(uVar, sVar) == aVar3) {
                        return aVar3;
                    }
                }
                qVar2 = qVar;
                tVar2 = tVar3;
                aVarA = aVar;
                c12 = c11;
                c12.f10606g = null;
                sVar.f10649s = c12;
                sVar.f10650t = tVar2;
                sVar.f10651u = qVar2;
                sVar.f10652v = aVarA;
                sVar.f10653w = null;
                sVar.f10654x = null;
                sVar.f10648A = 3;
                dVar = (d) aVarA;
                if (dVar.d(sVar) != aVar3) {
                    aVar2 = dVar;
                    tVar4 = tVar2;
                }
                return aVar3;
            }
            if (i11 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aVar2 = (V9.a) sVar.f10652v;
            qVar2 = (p210v8.q) sVar.f10651u;
            tVar4 = (p210v8.t) sVar.f10650t;
            c12 = sVar.f10649s;
            J7.a.v(objH);
        }
        try {
            qVar2.f15463s = true;
            ((d) aVar2).e(null);
            t tVar6 = c12.f10605f;
            obj = tVar4.f15466s;
            if (obj != null) {
                iHashCode = obj.hashCode();
            } else {
                iHashCode = 0;
            }
            C0604a c0604a = new C0604a(obj, iHashCode);
            tVar6.getClass();
            tVar6.h(null, c0604a);
            return p076h8.m.a;
        } catch (Throwable th) {
            ((d) aVar2).e(null);
            throw th;
        }
        tVar.f15466s = objH;
        p210v8.q qVar3 = new p210v8.q();
        u uVar2 = new u(aVarA, qVar3, tVar2, c10);
        List list = c10.f10606g;
        if (list == null) {
            qVar2 = qVar3;
            c12 = c10;
        } else {
            c11 = c10;
            tVar3 = tVar2;
            uVar = uVar2;
            it = list.iterator();
            aVar = aVarA;
            qVar = qVar3;
            while (it.hasNext()) {
                cVar2 = (c) it.next();
                sVar.f10649s = c11;
                sVar.f10650t = aVar;
                sVar.f10651u = tVar3;
                sVar.f10652v = qVar;
                sVar.f10653w = uVar;
                sVar.f10654x = it;
                sVar.f10648A = 2;
                if (cVar2.invoke(uVar, sVar) == aVar3) {
                    return aVar3;
                }
            }
            qVar2 = qVar;
            tVar2 = tVar3;
            aVarA = aVar;
            c12 = c11;
        }
        c12.f10606g = null;
        sVar.f10649s = c12;
        sVar.f10650t = tVar2;
        sVar.f10651u = qVar2;
        sVar.f10652v = aVarA;
        sVar.f10653w = null;
        sVar.f10654x = null;
        sVar.f10648A = 3;
        dVar = (d) aVarA;
        if (dVar.d(sVar) != aVar3) {
            aVar2 = dVar;
            tVar4 = tVar2;
            qVar2.f15463s = true;
            ((d) aVar2).e(null);
            t tVar7 = c12.f10605f;
            obj = tVar4.f15466s;
            if (obj != null) {
                iHashCode = obj.hashCode();
            } else {
                iHashCode = 0;
            }
            C0604a c0604a2 = new C0604a(obj, iHashCode);
            tVar7.getClass();
            tVar7.h(null, c0604a2);
            return p076h8.m.a;
        }
        return aVar3;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object e(p144o8.c cVar) throws Throwable {
        v vVar;
        C c10;
        if (cVar instanceof v) {
            vVar = (v) cVar;
            int i10 = vVar.f10671v;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                vVar.f10671v = i10 - Integer.MIN_VALUE;
            } else {
                vVar = new v(this, cVar);
            }
        } else {
            vVar = new v(this, cVar);
        }
        Object obj = vVar.f10669t;
        p134n8.a aVar = p134n8.a.f13404s;
        int i11 = vVar.f10671v;
        if (i11 != 0) {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c10 = vVar.f10668s;
            try {
                J7.a.v(obj);
                return p076h8.m.a;
            } catch (Throwable th) {
                th = th;
                t tVar = c10.f10605f;
                h hVar = new h(th);
                tVar.getClass();
                tVar.h(null, hVar);
                throw th;
            }
        }
        J7.a.v(obj);
        try {
            vVar.f10668s = this;
            vVar.f10671v = 1;
            if (d(vVar) == aVar) {
                return aVar;
            }
            return p076h8.m.a;
        } catch (Throwable th2) {
            th = th2;
            c10 = this;
            t tVar2 = c10.f10605f;
            h hVar2 = new h(th);
            tVar2.getClass();
            tVar2.h(null, hVar2);
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object f(p144o8.c cVar) {
        w wVar;
        C c10;
        if (cVar instanceof w) {
            wVar = (w) cVar;
            int i10 = wVar.f10675v;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                wVar.f10675v = i10 - Integer.MIN_VALUE;
            } else {
                wVar = new w(this, cVar);
            }
        } else {
            wVar = new w(this, cVar);
        }
        Object obj = wVar.f10673t;
        p134n8.a aVar = p134n8.a.f13404s;
        int i11 = wVar.f10675v;
        if (i11 == 0) {
            J7.a.v(obj);
            try {
                wVar.f10672s = this;
                wVar.f10675v = 1;
                if (d(wVar) == aVar) {
                    return aVar;
                }
            } catch (Throwable th) {
                th = th;
                c10 = this;
                t tVar = c10.f10605f;
                h hVar = new h(th);
                tVar.getClass();
                tVar.h(null, hVar);
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c10 = wVar.f10672s;
            try {
                J7.a.v(obj);
            } catch (Throwable th2) {
                th = th2;
                t tVar2 = c10.f10605f;
                h hVar2 = new h(th);
                tVar2.getClass();
                tVar2.h(null, hVar2);
            }
        }
        return p076h8.m.a;
    }

    /* JADX WARN: Code duplicated, block: B:40:0x0072  */
    /* JADX WARN: Code duplicated, block: B:42:0x0078  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v14, types: [e0.C] */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v2, types: [e0.x] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4, types: [e0.C] */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v9 */
    public final Object g(p144o8.c cVar) throws FileNotFoundException {
        ?? xVar;
        FileInputStream fileInputStream;
        Throwable th;
        if (cVar instanceof x) {
            x xVar2 = (x) cVar;
            int i10 = xVar2.f10680w;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                xVar2.f10680w = i10 - Integer.MIN_VALUE;
                xVar = xVar2;
            } else {
                xVar = new x(this, cVar);
            }
        } else {
            xVar = new x(this, cVar);
        }
        Object obj = xVar.f10678u;
        p134n8.a aVar = p134n8.a.f13404s;
        int i11 = xVar.f10680w;
        try {
            if (i11 != 0) {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                fileInputStream = xVar.f10677t;
                xVar = xVar.f10676s;
                try {
                    J7.a.v(obj);
                    com.bumptech.glide.c.c(fileInputStream, null);
                    return obj;
                } catch (Throwable th2) {
                    th = th2;
                    try {
                        throw th;
                    } catch (Throwable th3) {
                        com.bumptech.glide.c.c(fileInputStream, th);
                        throw th3;
                    }
                }
            }
            J7.a.v(obj);
            try {
                FileInputStream fileInputStream2 = new FileInputStream(c());
                try {
                    p070h0.i iVar = p070h0.i.a;
                    xVar.f10676s = this;
                    xVar.f10677t = fileInputStream2;
                    xVar.f10680w = 1;
                    p070h0.b bVarA = iVar.a(fileInputStream2);
                    if (bVarA == aVar) {
                        return aVar;
                    }
                    fileInputStream = fileInputStream2;
                    obj = bVarA;
                    com.bumptech.glide.c.c(fileInputStream, null);
                    return obj;
                } catch (Throwable th4) {
                    fileInputStream = fileInputStream2;
                    th = th4;
                    xVar = this;
                    throw th;
                }
            } catch (FileNotFoundException e10) {
                e = e10;
                xVar = this;
                if (xVar.c().exists()) {
                    throw e;
                }
                return new p070h0.b(true);
            }
        } catch (FileNotFoundException e11) {
            e = e11;
            if (xVar.c().exists()) {
                return new p070h0.b(true);
            }
            throw e;
        }
    }

    @Override // p039e0.f
    public final Q9.b getData() {
        return this.f10602c;
    }

    /* JADX WARN: Code duplicated, block: B:37:0x0079  */
    /* JADX WARN: Code duplicated, block: B:40:0x0089 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:41:0x008a A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r4v2, types: [u8.b, v8.k] */
    public final Object h(p144o8.c cVar) throws CorruptionException, FileNotFoundException {
        y yVar;
        C c10;
        Object objInvoke;
        CorruptionException corruptionException;
        C c11;
        CorruptionException corruptionException2;
        if (cVar instanceof y) {
            yVar = (y) cVar;
            int i10 = yVar.f10685w;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                yVar.f10685w = i10 - Integer.MIN_VALUE;
            } else {
                yVar = new y(this, cVar);
            }
        } else {
            yVar = new y(this, cVar);
        }
        Object obj = yVar.f10683u;
        p134n8.a aVar = p134n8.a.f13404s;
        int i11 = yVar.f10685w;
        if (i11 == 0) {
            J7.a.v(obj);
            try {
                yVar.f10681s = this;
                yVar.f10685w = 1;
                Object objG = g(yVar);
                if (objG == aVar) {
                    return aVar;
                }
                return objG;
            } catch (CorruptionException e10) {
                e = e10;
                c10 = this;
                h hVar = c10.f10601b;
                yVar.f10681s = c10;
                yVar.f10682t = e;
                yVar.f10685w = 2;
                objInvoke = ((p210v8.k) hVar.f5078t).invoke(e);
                if (objInvoke != aVar) {
                    C c12 = c10;
                    corruptionException = e;
                    obj = objInvoke;
                    c11 = c12;
                    yVar.f10681s = corruptionException;
                    yVar.f10682t = obj;
                    yVar.f10685w = 3;
                    if (c11.j(obj, yVar) == aVar) {
                        return obj;
                    }
                }
            }
        } else {
            if (i11 != 1) {
                if (i11 == 2) {
                    corruptionException = (CorruptionException) yVar.f10682t;
                    c11 = (C) yVar.f10681s;
                    J7.a.v(obj);
                    try {
                        yVar.f10681s = corruptionException;
                        yVar.f10682t = obj;
                        yVar.f10685w = 3;
                        if (c11.j(obj, yVar) == aVar) {
                            return aVar;
                        }
                        return obj;
                    } catch (IOException e11) {
                        e = e11;
                        corruptionException2 = corruptionException;
                    }
                } else {
                    if (i11 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Object obj2 = yVar.f10682t;
                    corruptionException2 = (CorruptionException) yVar.f10681s;
                    try {
                        J7.a.v(obj);
                        return obj2;
                    } catch (IOException e12) {
                        e = e12;
                    }
                }
                E.e(corruptionException2, e);
                throw corruptionException2;
            }
            c10 = (C) yVar.f10681s;
            try {
                J7.a.v(obj);
                return obj;
            } catch (CorruptionException e13) {
                e = e13;
            }
        }
        h hVar2 = c10.f10601b;
        yVar.f10681s = c10;
        yVar.f10682t = e;
        yVar.f10685w = 2;
        objInvoke = ((p210v8.k) hVar2.f5078t).invoke(e);
        if (objInvoke != aVar) {
            C c13 = c10;
            corruptionException = e;
            obj = objInvoke;
            c11 = c13;
            yVar.f10681s = corruptionException;
            yVar.f10682t = obj;
            yVar.f10685w = 3;
            if (c11.j(obj, yVar) == aVar) {
                return obj;
            }
        }
        return aVar;
    }

    /* JADX WARN: Code duplicated, block: B:41:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object i(c cVar, p123m8.i iVar, p144o8.c cVar2) throws Throwable {
        z zVar;
        C c10;
        C0604a c0604a;
        Object obj;
        Object obj2;
        C c11;
        if (cVar2 instanceof z) {
            zVar = (z) cVar2;
            int i10 = zVar.f10691x;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                zVar.f10691x = i10 - Integer.MIN_VALUE;
            } else {
                zVar = new z(this, cVar2);
            }
        } else {
            zVar = new z(this, cVar2);
        }
        Object obj3 = zVar.f10689v;
        p134n8.a aVar = p134n8.a.f13404s;
        int i11 = zVar.f10691x;
        if (i11 != 0) {
            if (i11 == 1) {
                obj = zVar.f10688u;
                c0604a = (C0604a) zVar.f10687t;
                c10 = zVar.f10686s;
                J7.a.v(obj3);
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                obj2 = zVar.f10687t;
                c11 = zVar.f10686s;
                J7.a.v(obj3);
            }
            t tVar = c11.f10605f;
            C0604a c0604a2 = new C0604a(obj2, obj2 != null ? obj2.hashCode() : 0);
            tVar.getClass();
            tVar.h(null, c0604a2);
            return obj2;
        }
        J7.a.v(obj3);
        C0604a c0604a3 = (C0604a) this.f10605f.f();
        Object obj4 = c0604a3.a;
        if ((obj4 != null ? obj4.hashCode() : 0) != c0604a3.f10608b) {
            throw new IllegalStateException("Data in DataStore was mutated but DataStore is only compatible with Immutable types.");
        }
        Object obj5 = c0604a3.a;
        A a = new A(cVar, obj5, null);
        zVar.f10686s = this;
        zVar.f10687t = c0604a3;
        zVar.f10688u = obj5;
        zVar.f10691x = 1;
        Object objW = AbstractC0342z.w(iVar, a, zVar);
        if (objW != aVar) {
            c10 = this;
            c0604a = c0604a3;
            obj3 = objW;
            obj = obj5;
        }
        return aVar;
        Object obj6 = c0604a.a;
        if ((obj6 != null ? obj6.hashCode() : 0) != c0604a.f10608b) {
            throw new IllegalStateException("Data in DataStore was mutated but DataStore is only compatible with Immutable types.");
        }
        if (i.a(obj, obj3)) {
            return obj;
        }
        zVar.f10686s = c10;
        zVar.f10687t = obj3;
        zVar.f10688u = null;
        zVar.f10691x = 2;
        if (c10.j(obj3, zVar) != aVar) {
            obj2 = obj3;
            c11 = c10;
            t tVar2 = c11.f10605f;
            C0604a c0604a4 = new C0604a(obj2, obj2 != null ? obj2.hashCode() : 0);
            tVar2.getClass();
            tVar2.h(null, c0604a4);
            return obj2;
        }
        return aVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [int] */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8, types: [java.io.File, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v9, types: [java.io.File] */
    public final Object j(Object obj, p144o8.c cVar) throws IOException {
        B b3;
        FileOutputStream fileOutputStream;
        C c10;
        FileOutputStream fileOutputStream2;
        if (cVar instanceof B) {
            b3 = (B) cVar;
            int i10 = b3.f10599y;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                b3.f10599y = i10 - Integer.MIN_VALUE;
            } else {
                b3 = new B(this, cVar);
            }
        } else {
            b3 = new B(this, cVar);
        }
        Object obj2 = b3.f10597w;
        p134n8.a aVar = p134n8.a.f13404s;
        File file = b3.f10599y;
        p076h8.m mVar = p076h8.m.a;
        try {
            if (file == 0) {
                J7.a.v(obj2);
                File fileC = c();
                File parentFile = fileC.getCanonicalFile().getParentFile();
                if (parentFile != null) {
                    parentFile.mkdirs();
                    if (!parentFile.isDirectory()) {
                        throw new IOException(i.k(fileC, "Unable to create parent directories of "));
                    }
                }
                file = new File(i.k(this.f10603d, c().getAbsolutePath()));
                FileOutputStream fileOutputStream3 = new FileOutputStream(file);
                try {
                    p070h0.i iVar = p070h0.i.a;
                    m mVar2 = new m(fileOutputStream3);
                    b3.f10593s = this;
                    b3.f10594t = file;
                    b3.f10595u = fileOutputStream3;
                    b3.f10596v = fileOutputStream3;
                    b3.f10599y = 1;
                    iVar.b(obj, mVar2);
                    if (mVar == aVar) {
                        return aVar;
                    }
                    c10 = this;
                    fileOutputStream2 = fileOutputStream3;
                    fileOutputStream = fileOutputStream2;
                    file = file;
                } catch (Throwable th) {
                    th = th;
                    fileOutputStream = fileOutputStream3;
                    throw th;
                }
            } else {
                if (file != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                fileOutputStream2 = b3.f10596v;
                fileOutputStream = b3.f10595u;
                file = b3.f10594t;
                c10 = b3.f10593s;
                try {
                    J7.a.v(obj2);
                    file = file;
                } catch (Throwable th2) {
                    th = th2;
                    try {
                        throw th;
                    } catch (Throwable th3) {
                        com.bumptech.glide.c.c(fileOutputStream, th);
                        throw th3;
                    }
                }
            }
            fileOutputStream2.getFD().sync();
            com.bumptech.glide.c.c(fileOutputStream, null);
            if (file.renameTo(c10.c())) {
                return mVar;
            }
            throw new IOException("Unable to rename " + ((Object) file) + ".This likely means that there are multiple instances of DataStore for this file. Ensure that you are only creating a single instance of datastore for this file.");
        } catch (IOException e10) {
            if (file.exists()) {
                file.delete();
            }
            throw e10;
        }
    }
}
