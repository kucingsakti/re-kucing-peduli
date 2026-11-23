package p031d;

import p200u8.a;
import p210v8.k;

/* JADX INFO: loaded from: classes.dex */
public final class p extends k implements a {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f10478s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ x f10479t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p(x xVar, int i10) {
        super(0);
        this.f10478s = i10;
        this.f10479t = xVar;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r3v4 java.lang.Object, still in use, count: 2, list:
          (r3v4 java.lang.Object) from 0x0031: PHI (r3 I:??) = (r3v2 java.lang.Object), (r3v4 java.lang.Object) binds: [B:14:0x0030, B:24:0x0031] A[DONT_GENERATE, DONT_INLINE]
          (r3v4 java.lang.Object) from 0x0029: CHECK_CAST (q0.D) (r3v4 java.lang.Object)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:132)
        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:67)
        	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:50)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:96)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:36)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:44)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
        */
    @Override // p200u8.a
    public final java.lang.Object invoke() {
        /*
            r5 = this;
            int r0 = r5.f10478s
            switch(r0) {
                case 0: goto L3e;
                case 1: goto Ld;
                default: goto L5;
            }
        L5:
            d.x r0 = r5.f10479t
            r0.a()
            h8.m r0 = p076h8.m.a
            return r0
        Ld:
            d.x r0 = r5.f10479t
            q0.D r1 = r0.f10492c
            r2 = 0
            if (r1 != 0) goto L34
            i8.h r1 = r0.f10491b
            int r3 = r1.e()
            java.util.ListIterator r1 = r1.listIterator(r3)
        L1e:
            boolean r3 = r1.hasPrevious()
            if (r3 == 0) goto L30
            java.lang.Object r3 = r1.previous()
            r4 = r3
            q0.D r4 = (p156q0.D) r4
            boolean r4 = r4.a
            if (r4 == 0) goto L1e
            goto L31
        L30:
            r3 = r2
        L31:
            r1 = r3
            q0.D r1 = (p156q0.D) r1
        L34:
            r0.f10492c = r2
            if (r1 == 0) goto L3b
            r1.a()
        L3b:
            h8.m r0 = p076h8.m.a
            return r0
        L3e:
            d.x r0 = r5.f10479t
            r0.a()
            h8.m r0 = p076h8.m.a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p031d.p.invoke():java.lang.Object");
    }
}
