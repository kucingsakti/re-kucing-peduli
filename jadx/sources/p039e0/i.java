package p039e0;

import N9.InterfaceC0341y;
import o1.m;
import p123m8.d;
import p144o8.g;
import p200u8.c;

/* JADX INFO: loaded from: classes.dex */
public final class i extends g implements c {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public n f10623s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f10624t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ m f10625u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(m mVar, d dVar) {
        super(2, dVar);
        this.f10625u = mVar;
    }

    @Override // p144o8.a
    public final d create(Object obj, d dVar) {
        return new i(this.f10625u, dVar);
    }

    @Override // p200u8.c
    public final Object invoke(Object obj, Object obj2) {
        return ((i) create((InterfaceC0341y) obj, (d) obj2)).invokeSuspend(p076h8.m.a);
    }

    /* JADX WARN: Code duplicated, block: B:15:0x004c A[PHI: r1 r7
      0x004c: PHI (r1v1 e0.n) = (r1v3 e0.n), (r1v4 e0.n) binds: [B:13:0x0049, B:9:0x001a] A[DONT_GENERATE, DONT_INLINE]
      0x004c: PHI (r7v5 java.lang.Object) = (r7v13 java.lang.Object), (r7v0 java.lang.Object) binds: [B:13:0x0049, B:9:0x001a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0055, code lost:
    
        if (r1.invoke(r7, r6) == r0) goto L17;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0055 -> B:18:0x0058). Please report as a decompilation issue!!! */
    @Override // p144o8.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) throws java.lang.Throwable {
        /*
            r6 = this;
            n8.a r0 = p134n8.a.f13404s
            int r1 = r6.f10624t
            r2 = 2
            r3 = 1
            o1.m r4 = r6.f10625u
            if (r1 == 0) goto L20
            if (r1 == r3) goto L1a
            if (r1 != r2) goto L12
            J7.a.v(r7)
            goto L58
        L12:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L1a:
            e0.n r1 = r6.f10623s
            J7.a.v(r7)
            goto L4c
        L20:
            J7.a.v(r7)
            java.lang.Object r7 = r4.f13644v
            java.util.concurrent.atomic.AtomicInteger r7 = (java.util.concurrent.atomic.AtomicInteger) r7
            int r7 = r7.get()
            if (r7 <= 0) goto L65
        L2d:
            java.lang.Object r7 = r4.f13641s
            N9.y r7 = (N9.InterfaceC0341y) r7
            m8.i r7 = r7.c()
            N9.AbstractC0342z.f(r7)
            java.lang.Object r7 = r4.f13642t
            r1 = r7
            e0.n r1 = (p039e0.n) r1
            java.lang.Object r7 = r4.f13643u
            P9.a r7 = (P9.a) r7
            r6.f10623s = r1
            r6.f10624t = r3
            java.lang.Object r7 = r7.q(r6)
            if (r7 != r0) goto L4c
            goto L57
        L4c:
            r5 = 0
            r6.f10623s = r5
            r6.f10624t = r2
            java.lang.Object r7 = r1.invoke(r7, r6)
            if (r7 != r0) goto L58
        L57:
            return r0
        L58:
            java.lang.Object r7 = r4.f13644v
            java.util.concurrent.atomic.AtomicInteger r7 = (java.util.concurrent.atomic.AtomicInteger) r7
            int r7 = r7.decrementAndGet()
            if (r7 != 0) goto L2d
            h8.m r7 = p076h8.m.a
            return r7
        L65:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "Check failed."
            r7.<init>(r0)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p039e0.i.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
