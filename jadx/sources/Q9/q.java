package Q9;

import O3.y;
import java.util.NoSuchElementException;
import kotlinx.coroutines.flow.internal.AbortFlowException;

/* JADX INFO: loaded from: classes.dex */
public abstract class q {
    public static final y a = new y("NO_VALUE", 1);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final y f4399b = new y("NONE", 1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final y f4400c = new y("PENDING", 1);

    public static final t a(Object obj) {
        if (obj == null) {
            obj = R9.b.f4481b;
        }
        return new t(obj);
    }

    public static final void b(Object[] objArr, long j, Object obj) {
        objArr[((int) j) & (objArr.length - 1)] = obj;
    }

    /* JADX WARN: Code duplicated, block: B:39:0x0082  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x008a, code lost:
    
        if (r7.t().equals(r6) == false) goto L43;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.io.Serializable c(Q9.b r5, Q9.c r6, p144o8.c r7) throws java.lang.Throwable {
        /*
            boolean r0 = r7 instanceof Q9.f
            if (r0 == 0) goto L13
            r0 = r7
            Q9.f r0 = (Q9.f) r0
            int r1 = r0.f4359u
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f4359u = r1
            goto L18
        L13:
            Q9.f r0 = new Q9.f
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f4358t
            n8.a r1 = p134n8.a.f13404s
            int r2 = r0.f4359u
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            v8.t r5 = r0.f4357s
            J7.a.v(r7)     // Catch: java.lang.Throwable -> L29
            goto L4c
        L29:
            r6 = move-exception
            goto L52
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L33:
            J7.a.v(r7)
            v8.t r7 = new v8.t
            r7.<init>()
            Q9.h r2 = new Q9.h     // Catch: java.lang.Throwable -> L50
            r4 = 0
            r2.<init>(r6, r7, r4)     // Catch: java.lang.Throwable -> L50
            r0.f4357s = r7     // Catch: java.lang.Throwable -> L50
            r0.f4359u = r3     // Catch: java.lang.Throwable -> L50
            java.lang.Object r5 = r5.A(r2, r0)     // Catch: java.lang.Throwable -> L50
            if (r5 != r1) goto L4c
            return r1
        L4c:
            r5 = 0
            return r5
        L4e:
            r5 = r7
            goto L52
        L50:
            r6 = move-exception
            goto L4e
        L52:
            java.lang.Object r5 = r5.f15466s
            java.lang.Throwable r5 = (java.lang.Throwable) r5
            if (r5 == 0) goto L5e
            boolean r7 = r5.equals(r6)
            if (r7 != 0) goto L8d
        L5e:
            m8.i r7 = r0.getContext()
            N9.b0 r0 = N9.b0.f3440s
            m8.g r7 = r7.get(r0)
            N9.c0 r7 = (N9.c0) r7
            if (r7 == 0) goto L8e
            N9.k0 r7 = (N9.k0) r7
            java.lang.Object r0 = r7.y()
            boolean r1 = r0 instanceof N9.C0333p
            if (r1 != 0) goto L82
            boolean r1 = r0 instanceof N9.i0
            if (r1 == 0) goto L8e
            N9.i0 r0 = (N9.i0) r0
            boolean r0 = r0.e()
            if (r0 == 0) goto L8e
        L82:
            java.util.concurrent.CancellationException r7 = r7.t()
            boolean r7 = r7.equals(r6)
            if (r7 != 0) goto L8d
            goto L8e
        L8d:
            throw r6
        L8e:
            if (r5 != 0) goto L91
            return r6
        L91:
            boolean r7 = r6 instanceof java.util.concurrent.CancellationException
            if (r7 == 0) goto L99
            C8.E.e(r5, r6)
            throw r5
        L99:
            C8.E.e(r6, r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: Q9.q.c(Q9.b, Q9.c, o8.c):java.io.Serializable");
    }

    /* JADX WARN: Code duplicated, block: B:33:0x006d  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object d(b bVar, p144o8.c cVar) {
        l lVar;
        p210v8.t tVar;
        AbortFlowException e10;
        k kVar;
        if (cVar instanceof l) {
            lVar = (l) cVar;
            int i10 = lVar.f4380v;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                lVar.f4380v = i10 - Integer.MIN_VALUE;
            } else {
                lVar = new l(cVar);
            }
        } else {
            lVar = new l(cVar);
        }
        Object obj = lVar.f4379u;
        Object obj2 = p134n8.a.f13404s;
        int i11 = lVar.f4380v;
        y yVar = R9.b.f4481b;
        if (i11 == 0) {
            J7.a.v(obj);
            p210v8.t tVar2 = new p210v8.t();
            tVar2.f15466s = yVar;
            k kVar2 = new k(tVar2, 0);
            try {
                lVar.f4377s = tVar2;
                lVar.f4378t = kVar2;
                lVar.f4380v = 1;
                if (bVar.A(kVar2, lVar) == obj2) {
                    return obj2;
                }
                tVar = tVar2;
            } catch (AbortFlowException e11) {
                tVar = tVar2;
                e10 = e11;
                kVar = kVar2;
                if (e10.f12844s != kVar) {
                    throw e10;
                }
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kVar = lVar.f4378t;
            tVar = lVar.f4377s;
            try {
                J7.a.v(obj);
            } catch (AbortFlowException e12) {
                e10 = e12;
                if (e10.f12844s != kVar) {
                    throw e10;
                }
            }
        }
        Object obj3 = tVar.f15466s;
        if (obj3 != yVar) {
            return obj3;
        }
        throw new NoSuchElementException("Expected at least one element");
    }
}
