package p039e0;

import V9.a;
import V9.d;
import p144o8.c;
import p210v8.i;
import p210v8.q;
import p210v8.t;

/* JADX INFO: loaded from: classes.dex */
public final class u {
    public final /* synthetic */ a a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q f10665b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ t f10666c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C f10667d;

    public u(a aVar, q qVar, t tVar, C c10) {
        this.a = aVar;
        this.f10665b = qVar;
        this.f10666c = tVar;
        this.f10667d = c10;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00b6 A[Catch: all -> 0x0054, TRY_LEAVE, TryCatch #0 {all -> 0x0054, blocks: (B:21:0x0050, B:36:0x00ae, B:38:0x00b6), top: B:53:0x0050 }] */
    /* JADX WARN: Code duplicated, block: B:41:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:43:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(C0608e c0608e, c cVar) throws Throwable {
        t tVar;
        C c10;
        q qVar;
        t tVar2;
        a aVar;
        p200u8.c cVar2;
        a aVar2;
        a aVar3;
        C c11;
        Object obj;
        t tVar3;
        a aVar4;
        if (cVar instanceof t) {
            tVar = (t) cVar;
            int i10 = tVar.f10664z;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                tVar.f10664z = i10 - Integer.MIN_VALUE;
            } else {
                tVar = new t(this, cVar);
            }
        } else {
            tVar = new t(this, cVar);
        }
        Object obj2 = tVar.f10662x;
        p134n8.a aVar5 = p134n8.a.f13404s;
        int i11 = tVar.f10664z;
        try {
            if (i11 == 0) {
                J7.a.v(obj2);
                tVar.f10657s = c0608e;
                a aVar6 = this.a;
                tVar.f10658t = aVar6;
                q qVar2 = this.f10665b;
                tVar.f10659u = qVar2;
                t tVar4 = this.f10666c;
                tVar.f10660v = tVar4;
                c10 = this.f10667d;
                tVar.f10661w = c10;
                tVar.f10664z = 1;
                d dVar = (d) aVar6;
                if (dVar.d(tVar) != aVar5) {
                    qVar = qVar2;
                    tVar2 = tVar4;
                    cVar2 = c0608e;
                    aVar = dVar;
                }
                return aVar5;
            }
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    obj = tVar.f10659u;
                    tVar3 = (t) tVar.f10658t;
                    aVar2 = (a) tVar.f10657s;
                    try {
                        J7.a.v(obj2);
                        aVar4 = aVar2;
                        tVar3.f15466s = obj;
                        tVar2 = tVar3;
                        aVar2 = aVar4;
                        Object obj3 = tVar2.f15466s;
                        ((d) aVar2).e(null);
                        return obj3;
                    } catch (Throwable th) {
                        th = th;
                        ((d) aVar2).e(null);
                        throw th;
                    }
                }
                c11 = (C) tVar.f10659u;
                tVar2 = (t) tVar.f10658t;
                aVar3 = (a) tVar.f10657s;
                try {
                    J7.a.v(obj2);
                    aVar3 = aVar3;
                    if (!i.a(obj2, tVar2.f15466s)) {
                        tVar.f10657s = aVar3;
                        tVar.f10658t = tVar2;
                        tVar.f10659u = obj2;
                        tVar.f10664z = 3;
                        if (c11.j(obj2, tVar) != aVar5) {
                            obj = obj2;
                            tVar3 = tVar2;
                            aVar4 = aVar3;
                            tVar3.f15466s = obj;
                            tVar2 = tVar3;
                            aVar2 = aVar4;
                        }
                        return aVar5;
                    }
                    aVar2 = aVar3;
                    Object obj4 = tVar2.f15466s;
                    ((d) aVar2).e(null);
                    return obj4;
                } catch (Throwable th2) {
                    th = th2;
                    aVar2 = aVar3;
                    ((d) aVar2).e(null);
                    throw th;
                }
            }
            C c12 = tVar.f10661w;
            tVar2 = tVar.f10660v;
            qVar = (q) tVar.f10659u;
            a aVar7 = (a) tVar.f10658t;
            p200u8.c cVar3 = (p200u8.c) tVar.f10657s;
            J7.a.v(obj2);
            c10 = c12;
            cVar2 = cVar3;
            aVar = aVar7;
            if (qVar.f15463s) {
                throw new IllegalStateException("InitializerApi.updateData should not be called after initialization is complete.");
            }
            Object obj5 = tVar2.f15466s;
            tVar.f10657s = aVar;
            tVar.f10658t = tVar2;
            tVar.f10659u = c10;
            tVar.f10660v = null;
            tVar.f10661w = null;
            tVar.f10664z = 2;
            Object objInvoke = cVar2.invoke(obj5, tVar);
            if (objInvoke != aVar5) {
                aVar3 = aVar;
                obj2 = objInvoke;
                c11 = c10;
                if (!i.a(obj2, tVar2.f15466s)) {
                    tVar.f10657s = aVar3;
                    tVar.f10658t = tVar2;
                    tVar.f10659u = obj2;
                    tVar.f10664z = 3;
                    if (c11.j(obj2, tVar) != aVar5) {
                        obj = obj2;
                        tVar3 = tVar2;
                        aVar4 = aVar3;
                        tVar3.f15466s = obj;
                        tVar2 = tVar3;
                        aVar2 = aVar4;
                    }
                } else {
                    aVar2 = aVar3;
                }
                Object obj6 = tVar2.f15466s;
                ((d) aVar2).e(null);
                return obj6;
            }
            return aVar5;
        } catch (Throwable th3) {
            th = th3;
            aVar2 = aVar;
            ((d) aVar2).e(null);
            throw th;
        }
    }
}
