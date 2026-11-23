package B;

import A1.C0099h;
import C.n;
import C.o;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class e extends d {

    /* JADX INFO: renamed from: A0, reason: collision with root package name */
    public int f492A0;

    /* JADX INFO: renamed from: B0, reason: collision with root package name */
    public b[] f493B0;

    /* JADX INFO: renamed from: C0, reason: collision with root package name */
    public b[] f494C0;

    /* JADX INFO: renamed from: D0, reason: collision with root package name */
    public int f495D0;

    /* JADX INFO: renamed from: E0, reason: collision with root package name */
    public boolean f496E0;

    /* JADX INFO: renamed from: F0, reason: collision with root package name */
    public boolean f497F0;

    /* JADX INFO: renamed from: G0, reason: collision with root package name */
    public WeakReference f498G0;

    /* JADX INFO: renamed from: H0, reason: collision with root package name */
    public WeakReference f499H0;

    /* JADX INFO: renamed from: I0, reason: collision with root package name */
    public WeakReference f500I0;

    /* JADX INFO: renamed from: J0, reason: collision with root package name */
    public WeakReference f501J0;

    /* JADX INFO: renamed from: K0, reason: collision with root package name */
    public final HashSet f502K0;

    /* JADX INFO: renamed from: L0, reason: collision with root package name */
    public final C.b f503L0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public ArrayList f504q0 = new ArrayList();

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final C0099h f505r0 = new C0099h(this);

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final C.e f506s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public int f507t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public E.f f508u0;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public boolean f509v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public final p239z.c f510w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public int f511x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public int f512y0;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public int f513z0;

    public e() {
        C.e eVar = new C.e();
        eVar.f813b = true;
        eVar.f814c = true;
        eVar.f816e = new ArrayList();
        new ArrayList();
        eVar.f817f = null;
        eVar.f818g = new C.b();
        eVar.f819h = new ArrayList();
        eVar.a = this;
        eVar.f815d = this;
        this.f506s0 = eVar;
        this.f508u0 = null;
        this.f509v0 = false;
        this.f510w0 = new p239z.c();
        this.f513z0 = 0;
        this.f492A0 = 0;
        this.f493B0 = new b[4];
        this.f494C0 = new b[4];
        this.f495D0 = 257;
        this.f496E0 = false;
        this.f497F0 = false;
        this.f498G0 = null;
        this.f499H0 = null;
        this.f500I0 = null;
        this.f501J0 = null;
        this.f502K0 = new HashSet();
        this.f503L0 = new C.b();
    }

    public static void V(d dVar, E.f fVar, C.b bVar) {
        int i10;
        int i11;
        if (fVar == null) {
            return;
        }
        if (dVar.f464g0 == 8 || (dVar instanceof h) || (dVar instanceof a)) {
            bVar.f806e = 0;
            bVar.f807f = 0;
            return;
        }
        int[] iArr = dVar.f481p0;
        bVar.a = iArr[0];
        bVar.f803b = iArr[1];
        bVar.f804c = dVar.q();
        bVar.f805d = dVar.k();
        bVar.f810i = false;
        bVar.j = 0;
        boolean z6 = bVar.a == 3;
        boolean z10 = bVar.f803b == 3;
        boolean z11 = z6 && dVar.f450W > 0.0f;
        boolean z12 = z10 && dVar.f450W > 0.0f;
        if (z6 && dVar.t(0) && dVar.f483r == 0 && !z11) {
            bVar.a = 2;
            if (z10 && dVar.f484s == 0) {
                bVar.a = 1;
            }
            z6 = false;
        }
        if (z10 && dVar.t(1) && dVar.f484s == 0 && !z12) {
            bVar.f803b = 2;
            if (z6 && dVar.f483r == 0) {
                bVar.f803b = 1;
            }
            z10 = false;
        }
        if (dVar.A()) {
            bVar.a = 1;
            z6 = false;
        }
        if (dVar.B()) {
            bVar.f803b = 1;
            z10 = false;
        }
        int[] iArr2 = dVar.f485t;
        if (z11) {
            if (iArr2[0] == 4) {
                bVar.a = 1;
            } else if (!z10) {
                if (bVar.f803b == 1) {
                    i11 = bVar.f805d;
                } else {
                    bVar.a = 2;
                    fVar.b(dVar, bVar);
                    i11 = bVar.f807f;
                }
                bVar.a = 1;
                bVar.f804c = (int) (dVar.f450W * i11);
            }
        }
        if (z12) {
            if (iArr2[1] == 4) {
                bVar.f803b = 1;
            } else if (!z6) {
                if (bVar.a == 1) {
                    i10 = bVar.f804c;
                } else {
                    bVar.f803b = 2;
                    fVar.b(dVar, bVar);
                    i10 = bVar.f806e;
                }
                bVar.f803b = 1;
                if (dVar.f451X == -1) {
                    bVar.f805d = (int) (i10 / dVar.f450W);
                } else {
                    bVar.f805d = (int) (dVar.f450W * i10);
                }
            }
        }
        fVar.b(dVar, bVar);
        dVar.O(bVar.f806e);
        dVar.L(bVar.f807f);
        dVar.f433E = bVar.f809h;
        dVar.I(bVar.f808g);
        bVar.j = 0;
    }

    @Override // B.d
    public final void C() {
        this.f510w0.t();
        this.f511x0 = 0;
        this.f512y0 = 0;
        this.f504q0.clear();
        super.C();
    }

    @Override // B.d
    public final void F(wa.a aVar) {
        super.F(aVar);
        int size = this.f504q0.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((d) this.f504q0.get(i10)).F(aVar);
        }
    }

    @Override // B.d
    public final void P(boolean z6, boolean z10) {
        super.P(z6, z10);
        int size = this.f504q0.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((d) this.f504q0.get(i10)).P(z6, z10);
        }
    }

    public final void R(d dVar, int i10) {
        if (i10 == 0) {
            int i11 = this.f513z0 + 1;
            b[] bVarArr = this.f494C0;
            if (i11 >= bVarArr.length) {
                this.f494C0 = (b[]) Arrays.copyOf(bVarArr, bVarArr.length * 2);
            }
            b[] bVarArr2 = this.f494C0;
            int i12 = this.f513z0;
            bVarArr2[i12] = new b(dVar, 0, this.f509v0);
            this.f513z0 = i12 + 1;
            return;
        }
        if (i10 == 1) {
            int i13 = this.f492A0 + 1;
            b[] bVarArr3 = this.f493B0;
            if (i13 >= bVarArr3.length) {
                this.f493B0 = (b[]) Arrays.copyOf(bVarArr3, bVarArr3.length * 2);
            }
            b[] bVarArr4 = this.f493B0;
            int i14 = this.f492A0;
            bVarArr4[i14] = new b(dVar, 1, this.f509v0);
            this.f492A0 = i14 + 1;
        }
    }

    public final void S(p239z.c cVar) {
        e eVar;
        p239z.c cVar2;
        boolean zW = W(64);
        b(cVar, zW);
        int size = this.f504q0.size();
        boolean z6 = false;
        for (int i10 = 0; i10 < size; i10++) {
            d dVar = (d) this.f504q0.get(i10);
            boolean[] zArr = dVar.f446S;
            zArr[0] = false;
            zArr[1] = false;
            if (dVar instanceof a) {
                z6 = true;
            }
        }
        if (z6) {
            for (int i11 = 0; i11 < size; i11++) {
                d dVar2 = (d) this.f504q0.get(i11);
                if (dVar2 instanceof a) {
                    a aVar = (a) dVar2;
                    for (int i12 = 0; i12 < aVar.f571r0; i12++) {
                        d dVar3 = aVar.f570q0[i12];
                        if (aVar.f403t0 || dVar3.c()) {
                            int i13 = aVar.f402s0;
                            if (i13 == 0 || i13 == 1) {
                                dVar3.f446S[0] = true;
                            } else if (i13 == 2 || i13 == 3) {
                                dVar3.f446S[1] = true;
                            }
                        }
                    }
                }
            }
        }
        HashSet hashSet = this.f502K0;
        hashSet.clear();
        for (int i14 = 0; i14 < size; i14++) {
            d dVar4 = (d) this.f504q0.get(i14);
            dVar4.getClass();
            boolean z10 = dVar4 instanceof g;
            if (z10 || (dVar4 instanceof h)) {
                if (z10) {
                    hashSet.add(dVar4);
                } else {
                    dVar4.b(cVar, zW);
                }
            }
        }
        while (hashSet.size() > 0) {
            int size2 = hashSet.size();
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                g gVar = (g) ((d) it.next());
                for (int i15 = 0; i15 < gVar.f571r0; i15++) {
                    if (hashSet.contains(gVar.f570q0[i15])) {
                        gVar.b(cVar, zW);
                        hashSet.remove(gVar);
                        break;
                    }
                }
            }
            if (size2 == hashSet.size()) {
                Iterator it2 = hashSet.iterator();
                while (it2.hasNext()) {
                    ((d) it2.next()).b(cVar, zW);
                }
                hashSet.clear();
            }
        }
        if (p239z.c.f16263q) {
            HashSet<d> hashSet2 = new HashSet();
            for (int i16 = 0; i16 < size; i16++) {
                d dVar5 = (d) this.f504q0.get(i16);
                dVar5.getClass();
                if (!(dVar5 instanceof g) && !(dVar5 instanceof h)) {
                    hashSet2.add(dVar5);
                }
            }
            eVar = this;
            cVar2 = cVar;
            eVar.a(this, cVar2, hashSet2, this.f481p0[0] == 2 ? 0 : 1, false);
            for (d dVar6 : hashSet2) {
                j.b(this, cVar2, dVar6);
                dVar6.b(cVar2, zW);
            }
        } else {
            eVar = this;
            cVar2 = cVar;
            for (int i17 = 0; i17 < size; i17++) {
                d dVar7 = (d) eVar.f504q0.get(i17);
                if (dVar7 instanceof e) {
                    int[] iArr = dVar7.f481p0;
                    int i18 = iArr[0];
                    int i19 = iArr[1];
                    if (i18 == 2) {
                        dVar7.M(1);
                    }
                    if (i19 == 2) {
                        dVar7.N(1);
                    }
                    dVar7.b(cVar2, zW);
                    if (i18 == 2) {
                        dVar7.M(i18);
                    }
                    if (i19 == 2) {
                        dVar7.N(i19);
                    }
                } else {
                    j.b(this, cVar2, dVar7);
                    if (!(dVar7 instanceof g) && !(dVar7 instanceof h)) {
                        dVar7.b(cVar2, zW);
                    }
                }
            }
        }
        if (eVar.f513z0 > 0) {
            j.a(this, cVar2, null, 0);
        }
        if (eVar.f492A0 > 0) {
            j.a(this, cVar2, null, 1);
        }
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0097  */
    public final boolean T(int i10, boolean z6) {
        boolean z10;
        C.e eVar = this.f506s0;
        e eVar2 = eVar.a;
        boolean z11 = false;
        int iJ = eVar2.j(0);
        int iJ2 = eVar2.j(1);
        int iR = eVar2.r();
        int iS = eVar2.s();
        ArrayList<o> arrayList = eVar.f816e;
        if (z6 && (iJ == 2 || iJ2 == 2)) {
            for (o oVar : arrayList) {
                if (oVar.f844f == i10 && !oVar.k()) {
                    z6 = false;
                    break;
                }
            }
            if (i10 == 0) {
                if (z6 && iJ == 2) {
                    eVar2.M(1);
                    eVar2.O(eVar.d(eVar2, 0));
                    eVar2.f458d.f843e.d(eVar2.q());
                }
            } else if (z6 && iJ2 == 2) {
                eVar2.N(1);
                eVar2.L(eVar.d(eVar2, 1));
                eVar2.f460e.f843e.d(eVar2.k());
            }
        }
        int[] iArr = eVar2.f481p0;
        if (i10 == 0) {
            int i11 = iArr[0];
            if (i11 == 1 || i11 == 4) {
                int iQ = eVar2.q() + iR;
                eVar2.f458d.f847i.d(iQ);
                eVar2.f458d.f843e.d(iQ - iR);
                z10 = true;
            } else {
                z10 = false;
            }
        } else {
            int i12 = iArr[1];
            if (i12 == 1 || i12 == 4) {
                int iK = eVar2.k() + iS;
                eVar2.f460e.f847i.d(iK);
                eVar2.f460e.f843e.d(iK - iS);
                z10 = true;
            } else {
                z10 = false;
            }
        }
        eVar.g();
        for (o oVar2 : arrayList) {
            if (oVar2.f844f == i10 && (oVar2.f840b != eVar2 || oVar2.f845g)) {
                oVar2.e();
            }
        }
        for (o oVar3 : arrayList) {
            if (oVar3.f844f == i10 && (z10 || oVar3.f840b != eVar2)) {
                if (!oVar3.f846h.j || !oVar3.f847i.j || (!(oVar3 instanceof C.c) && !oVar3.f843e.j)) {
                    eVar2.M(iJ);
                    eVar2.N(iJ2);
                    return z11;
                }
            }
        }
        z11 = true;
        eVar2.M(iJ);
        eVar2.N(iJ2);
        return z11;
    }

    /* JADX WARN: Code duplicated, block: B:227:0x03a1  */
    /* JADX WARN: Code duplicated, block: B:365:0x061f  */
    /* JADX WARN: Code duplicated, block: B:368:0x062b  */
    /* JADX WARN: Code duplicated, block: B:376:0x0643  */
    /* JADX WARN: Code duplicated, block: B:377:0x064a  */
    /* JADX WARN: Code duplicated, block: B:382:0x0652  */
    /* JADX WARN: Code duplicated, block: B:386:0x0661  */
    /* JADX WARN: Code duplicated, block: B:389:0x0668  */
    /* JADX WARN: Code duplicated, block: B:393:0x0677  */
    /* JADX WARN: Code duplicated, block: B:402:0x0695  */
    /* JADX WARN: Code duplicated, block: B:407:0x06a6  */
    /* JADX WARN: Code duplicated, block: B:414:0x06b5  */
    /* JADX WARN: Code duplicated, block: B:417:0x06bd  */
    /* JADX WARN: Code duplicated, block: B:419:0x06c9  */
    /* JADX WARN: Code duplicated, block: B:423:0x06da  */
    /* JADX WARN: Code duplicated, block: B:426:0x06ec A[Catch: Exception -> 0x06fa, LOOP:12: B:425:0x06ea->B:426:0x06ec, LOOP_END, TryCatch #4 {Exception -> 0x06fa, blocks: (B:424:0x06de, B:426:0x06ec, B:429:0x0703), top: B:551:0x06de }] */
    /* JADX WARN: Code duplicated, block: B:442:0x073b  */
    /* JADX WARN: Code duplicated, block: B:445:0x0743 A[Catch: Exception -> 0x072f, TryCatch #1 {Exception -> 0x072f, blocks: (B:436:0x0728, B:443:0x073f, B:445:0x0743, B:447:0x0749, B:448:0x0765, B:450:0x0769, B:452:0x076f, B:456:0x0787, B:459:0x0792, B:461:0x0796, B:463:0x079c), top: B:545:0x0728 }] */
    /* JADX WARN: Code duplicated, block: B:450:0x0769 A[Catch: Exception -> 0x072f, TryCatch #1 {Exception -> 0x072f, blocks: (B:436:0x0728, B:443:0x073f, B:445:0x0743, B:447:0x0749, B:448:0x0765, B:450:0x0769, B:452:0x076f, B:456:0x0787, B:459:0x0792, B:461:0x0796, B:463:0x079c), top: B:545:0x0728 }] */
    /* JADX WARN: Code duplicated, block: B:459:0x0792 A[Catch: Exception -> 0x072f, PHI: r25
      0x0792: PHI (r25v7 B.c) = (r25v2 B.c), (r25v2 B.c), (r25v9 B.c) binds: [B:449:0x0767, B:451:0x076d, B:456:0x0787] A[DONT_GENERATE, DONT_INLINE], TryCatch #1 {Exception -> 0x072f, blocks: (B:436:0x0728, B:443:0x073f, B:445:0x0743, B:447:0x0749, B:448:0x0765, B:450:0x0769, B:452:0x076f, B:456:0x0787, B:459:0x0792, B:461:0x0796, B:463:0x079c), top: B:545:0x0728 }] */
    /* JADX WARN: Code duplicated, block: B:461:0x0796 A[Catch: Exception -> 0x072f, TryCatch #1 {Exception -> 0x072f, blocks: (B:436:0x0728, B:443:0x073f, B:445:0x0743, B:447:0x0749, B:448:0x0765, B:450:0x0769, B:452:0x076f, B:456:0x0787, B:459:0x0792, B:461:0x0796, B:463:0x079c), top: B:545:0x0728 }] */
    /* JADX WARN: Code duplicated, block: B:475:0x07c3  */
    /* JADX WARN: Code duplicated, block: B:481:0x07e4  */
    /* JADX WARN: Code duplicated, block: B:483:0x07fe  */
    /* JADX WARN: Code duplicated, block: B:485:0x0812  */
    /* JADX WARN: Code duplicated, block: B:487:0x0816  */
    /* JADX WARN: Code duplicated, block: B:490:0x0825  */
    /* JADX WARN: Code duplicated, block: B:492:0x082e A[LOOP:15: B:491:0x082c->B:492:0x082e, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:496:0x0842 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:501:0x084f A[LOOP:14: B:500:0x084d->B:501:0x084f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:504:0x0883  */
    /* JADX WARN: Code duplicated, block: B:508:0x0895  */
    /* JADX WARN: Code duplicated, block: B:513:0x08b5  */
    /* JADX WARN: Code duplicated, block: B:514:0x08c2  */
    /* JADX WARN: Code duplicated, block: B:517:0x08d5  */
    /* JADX WARN: Code duplicated, block: B:518:0x08de  */
    /* JADX WARN: Code duplicated, block: B:520:0x08e2  */
    /* JADX WARN: Code duplicated, block: B:522:0x08e9 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:525:0x08f1  */
    /* JADX WARN: Code duplicated, block: B:528:0x0900 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:533:0x091a  */
    /* JADX WARN: Code duplicated, block: B:535:0x091e  */
    /* JADX WARN: Code duplicated, block: B:536:0x0920  */
    /* JADX WARN: Code duplicated, block: B:540:0x092e  */
    /* JADX WARN: Code duplicated, block: B:601:0x06ce A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:62:0x0127  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v23 */
    /* JADX WARN: Type inference failed for: r0v25 */
    /* JADX WARN: Type inference failed for: r0v26 */
    /* JADX WARN: Type inference failed for: r0v81 */
    /* JADX WARN: Type inference failed for: r0v82 */
    /* JADX WARN: Type inference failed for: r0v83 */
    /* JADX WARN: Type inference failed for: r0v84 */
    /* JADX WARN: Type inference failed for: r0v85 */
    /* JADX WARN: Type inference failed for: r0v86 */
    /* JADX WARN: Type inference failed for: r0v87 */
    /* JADX WARN: Type inference failed for: r0v88 */
    /* JADX WARN: Type inference failed for: r0v89 */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v23 */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r13v21 */
    /* JADX WARN: Type inference failed for: r13v22 */
    /* JADX WARN: Type inference failed for: r13v23 */
    /* JADX WARN: Type inference failed for: r13v3 */
    /* JADX WARN: Type inference failed for: r13v4 */
    /* JADX WARN: Type inference failed for: r13v5 */
    /* JADX WARN: Type inference failed for: r13v6 */
    /* JADX WARN: Type inference failed for: r13v7 */
    /* JADX WARN: Type inference failed for: r13v8 */
    /* JADX WARN: Type inference failed for: r13v9 */
    /* JADX WARN: Type inference failed for: r14v3 */
    /* JADX WARN: Type inference failed for: r14v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r14v8 */
    /* JADX WARN: Type inference failed for: r18v2 */
    /* JADX WARN: Type inference failed for: r18v3 */
    /* JADX WARN: Type inference failed for: r18v4 */
    /* JADX WARN: Type inference failed for: r22v0 */
    /* JADX WARN: Type inference failed for: r22v1 */
    /* JADX WARN: Type inference failed for: r22v2 */
    /* JADX WARN: Type inference failed for: r32v0, types: [B.d, B.e] */
    /* JADX WARN: Type inference failed for: r5v13, types: [int] */
    /* JADX WARN: Type inference failed for: r6v124, types: [int] */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v67 */
    /* JADX WARN: Type inference failed for: r6v68 */
    /* JADX WARN: Type inference failed for: r6v92, types: [int] */
    /* JADX WARN: Type inference failed for: r9v69, types: [int] */
    public final void U() {
        ?? r22;
        c cVar;
        int i10;
        int i11;
        boolean z6;
        boolean z10;
        char c10;
        boolean z11;
        int i12;
        boolean zW;
        ?? r13;
        int i13;
        boolean z12;
        int i14;
        c cVar2;
        boolean z13;
        boolean z14;
        boolean[] zArr;
        boolean[] zArr2;
        int i15;
        boolean z15;
        int iMax;
        ?? r14;
        ?? r18;
        boolean z16;
        int iMax2;
        ?? r10;
        boolean z17;
        boolean z18;
        ?? r11;
        ?? r15;
        boolean z19;
        int i16;
        boolean z20;
        boolean z21;
        ?? r12;
        ?? r16;
        int i17;
        int iMax3;
        int iMax4;
        int iMax5;
        int iMax6;
        boolean zW2;
        int size;
        int i18;
        boolean z22;
        d dVar;
        boolean z23;
        int i19;
        WeakReference weakReference;
        WeakReference weakReference2;
        WeakReference weakReference3;
        WeakReference weakReference4;
        d dVar2;
        char c11;
        n nVar;
        n nVar2;
        int i20;
        int iB;
        int iB2;
        int i21;
        n nVar3;
        n nVar4;
        boolean z24;
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        int i22;
        boolean z25;
        this.f452Y = 0;
        this.f453Z = 0;
        this.f496E0 = false;
        this.f497F0 = false;
        int size2 = this.f504q0.size();
        int iMax7 = Math.max(0, q());
        int iMax8 = Math.max(0, k());
        int[] iArr = this.f481p0;
        int i23 = iArr[1];
        int i24 = iArr[0];
        int i25 = this.f507t0;
        c cVar3 = this.f438J;
        c cVar4 = this.f437I;
        if (i25 == 0 && j.c(this.f495D0, 1)) {
            E.f fVar = this.f508u0;
            int i26 = iArr[0];
            int i27 = iArr[1];
            E();
            ArrayList arrayList4 = this.f504q0;
            int size3 = arrayList4.size();
            for (int i28 = 0; i28 < size3; i28++) {
                ((d) arrayList4.get(i28)).E();
            }
            boolean z26 = this.f509v0;
            if (i26 == 1) {
                J(0, q());
            } else {
                cVar4.l(0);
                this.f452Y = 0;
            }
            int i29 = 0;
            boolean z27 = false;
            boolean z28 = false;
            while (i29 < size3) {
                int[] iArr2 = iArr;
                d dVar3 = (d) arrayList4.get(i29);
                int i30 = i29;
                if (dVar3 instanceof h) {
                    h hVar = (h) dVar3;
                    z25 = z27;
                    if (hVar.f568u0 == 1) {
                        int i31 = hVar.f565r0;
                        if (i31 != -1) {
                            hVar.R(i31);
                        } else if (hVar.f566s0 != -1 && A()) {
                            hVar.R(q() - hVar.f566s0);
                        } else if (A()) {
                            hVar.R((int) ((hVar.f564q0 * q()) + 0.5f));
                        }
                        z25 = true;
                    }
                } else {
                    z25 = z27;
                    if ((dVar3 instanceof a) && ((a) dVar3).U() == 0) {
                        z27 = z25;
                        z28 = true;
                    }
                    i29 = i30 + 1;
                    iArr = iArr2;
                }
                z27 = z25;
                i29 = i30 + 1;
                iArr = iArr2;
            }
            r22 = iArr;
            if (z27) {
                for (int i32 = 0; i32 < size3; i32 = i22 + 1) {
                    d dVar4 = (d) arrayList4.get(i32);
                    if (dVar4 instanceof h) {
                        h hVar2 = (h) dVar4;
                        i22 = i32;
                        if (hVar2.f568u0 == 1) {
                            C.h.c(0, hVar2, fVar, z26);
                        }
                    } else {
                        i22 = i32;
                    }
                }
            }
            C.h.c(0, this, fVar, z26);
            if (z28) {
                for (int i33 = 0; i33 < size3; i33++) {
                    d dVar5 = (d) arrayList4.get(i33);
                    if (dVar5 instanceof a) {
                        a aVar = (a) dVar5;
                        if (aVar.U() == 0 && aVar.T()) {
                            C.h.c(1, aVar, fVar, z26);
                        }
                    }
                }
            }
            if (i27 == 1) {
                K(0, k());
            } else {
                cVar3.l(0);
                this.f453Z = 0;
            }
            int i34 = 0;
            boolean z29 = false;
            boolean z30 = false;
            while (i34 < size3) {
                d dVar6 = (d) arrayList4.get(i34);
                int i35 = i34;
                if (dVar6 instanceof h) {
                    h hVar3 = (h) dVar6;
                    if (hVar3.f568u0 == 0) {
                        int i36 = hVar3.f565r0;
                        if (i36 != -1) {
                            hVar3.R(i36);
                        } else if (hVar3.f566s0 != -1 && B()) {
                            hVar3.R(k() - hVar3.f566s0);
                        } else if (B()) {
                            hVar3.R((int) ((hVar3.f564q0 * k()) + 0.5f));
                        }
                        z29 = true;
                    }
                } else if ((dVar6 instanceof a) && ((a) dVar6).U() == 1) {
                    z30 = true;
                }
                i34 = i35 + 1;
            }
            if (z29) {
                for (int i37 = 0; i37 < size3; i37++) {
                    d dVar7 = (d) arrayList4.get(i37);
                    if (dVar7 instanceof h) {
                        h hVar4 = (h) dVar7;
                        if (hVar4.f568u0 == 0) {
                            C.h.i(1, hVar4, fVar);
                        }
                    }
                }
            }
            C.h.i(0, this, fVar);
            if (z30) {
                for (int i38 = 0; i38 < size3; i38++) {
                    d dVar8 = (d) arrayList4.get(i38);
                    if (dVar8 instanceof a) {
                        a aVar2 = (a) dVar8;
                        if (aVar2.U() == 1 && aVar2.T()) {
                            C.h.i(1, aVar2, fVar);
                        }
                    }
                }
            }
            for (int i39 = 0; i39 < size3; i39++) {
                d dVar9 = (d) arrayList4.get(i39);
                if (dVar9.z() && C.h.a(dVar9)) {
                    V(dVar9, fVar, C.h.a);
                    if (!(dVar9 instanceof h)) {
                        C.h.c(0, dVar9, fVar, z26);
                        C.h.i(0, dVar9, fVar);
                    } else if (((h) dVar9).f568u0 == 0) {
                        C.h.i(0, dVar9, fVar);
                    } else {
                        C.h.c(0, dVar9, fVar, z26);
                    }
                }
            }
            for (int i40 = 0; i40 < size2; i40++) {
                d dVar10 = (d) this.f504q0.get(i40);
                if (dVar10.z() && !(dVar10 instanceof h) && !(dVar10 instanceof a) && !(dVar10 instanceof g) && !dVar10.f434F) {
                    int iJ = dVar10.j(0);
                    int iJ2 = dVar10.j(1);
                    if (iJ != 3 || dVar10.f483r == 1 || iJ2 != 3 || dVar10.f484s == 1) {
                        V(dVar10, this.f508u0, new C.b());
                    }
                }
            }
        } else {
            r22 = iArr;
        }
        p239z.c cVar5 = this.f510w0;
        if (size2 > 2 && ((i24 == 2 || i23 == 2) && j.c(this.f495D0, 1024))) {
            E.f fVar2 = this.f508u0;
            ArrayList arrayList5 = this.f504q0;
            int size4 = arrayList5.size();
            int i41 = 0;
            while (true) {
                if (i41 >= size4) {
                    cVar = cVar4;
                    int i42 = 0;
                    ArrayList arrayList6 = null;
                    ArrayList arrayList7 = null;
                    ArrayList arrayList8 = null;
                    ArrayList arrayList9 = null;
                    ArrayList arrayList10 = null;
                    ArrayList arrayList11 = null;
                    while (i42 < size4) {
                        int i43 = i42;
                        d dVar11 = (d) arrayList5.get(i42);
                        ArrayList arrayList12 = arrayList6;
                        ?? r17 = r22[0];
                        ArrayList arrayList13 = arrayList7;
                        ?? r19 = r22[1];
                        ArrayList arrayList14 = arrayList8;
                        int[] iArr3 = dVar11.f481p0;
                        ArrayList arrayList15 = arrayList9;
                        if (!C.h.h(r17, r19, iArr3[0], iArr3[1])) {
                            V(dVar11, fVar2, this.f503L0);
                        }
                        boolean z31 = dVar11 instanceof h;
                        if (z31) {
                            h hVar5 = (h) dVar11;
                            if (hVar5.f568u0 == 0) {
                                arrayList2 = arrayList14 == null ? new ArrayList() : arrayList14;
                                arrayList2.add(hVar5);
                            } else {
                                arrayList2 = arrayList14;
                            }
                            z24 = z31;
                            if (hVar5.f568u0 == 1) {
                                arrayList = arrayList12 == null ? new ArrayList() : arrayList12;
                                arrayList.add(hVar5);
                            } else {
                                arrayList = arrayList12;
                            }
                        } else {
                            z24 = z31;
                            arrayList = arrayList12;
                            arrayList2 = arrayList14;
                        }
                        if (dVar11 instanceof i) {
                            if (dVar11 instanceof a) {
                                a aVar3 = (a) dVar11;
                                if (aVar3.U() == 0) {
                                    arrayList3 = arrayList13 == null ? new ArrayList() : arrayList13;
                                    arrayList3.add(aVar3);
                                } else {
                                    arrayList3 = arrayList13;
                                }
                                if (aVar3.U() == 1) {
                                    ArrayList arrayList16 = arrayList15 == null ? new ArrayList() : arrayList15;
                                    arrayList16.add(aVar3);
                                    arrayList15 = arrayList16;
                                }
                                arrayList7 = arrayList3;
                            } else {
                                arrayList = arrayList;
                                arrayList2 = arrayList2;
                                i iVar = (i) dVar11;
                                arrayList7 = arrayList13 == null ? new ArrayList() : arrayList13;
                                arrayList7.add(iVar);
                                arrayList9 = arrayList15 == null ? new ArrayList() : arrayList15;
                                arrayList9.add(iVar);
                            }
                            if (dVar11.f437I.f425f == null && dVar11.f439K.f425f == null && !z24 && !(dVar11 instanceof a)) {
                                if (arrayList10 == null) {
                                    arrayList10 = new ArrayList();
                                }
                                ArrayList arrayList17 = arrayList10;
                                arrayList17.add(dVar11);
                                arrayList10 = arrayList17;
                            }
                            if (dVar11.f438J.f425f != null && dVar11.f440L.f425f == null && dVar11.f441M.f425f == null && !z24 && !(dVar11 instanceof a)) {
                                if (arrayList11 == null) {
                                    arrayList11 = new ArrayList();
                                }
                                ArrayList arrayList18 = arrayList11;
                                arrayList18.add(dVar11);
                                arrayList11 = arrayList18;
                            }
                            i42 = i43 + 1;
                            arrayList6 = arrayList;
                            arrayList8 = arrayList2;
                        } else {
                            arrayList7 = arrayList13;
                        }
                        arrayList9 = arrayList15;
                        if (dVar11.f437I.f425f == null) {
                            if (arrayList10 == null) {
                                arrayList10 = new ArrayList();
                            }
                            ArrayList arrayList19 = arrayList10;
                            arrayList19.add(dVar11);
                            arrayList10 = arrayList19;
                        }
                        if (dVar11.f438J.f425f != null) {
                        }
                        i42 = i43 + 1;
                        arrayList6 = arrayList;
                        arrayList8 = arrayList2;
                    }
                    ArrayList arrayList20 = arrayList6;
                    ArrayList<i> arrayList21 = arrayList7;
                    ArrayList arrayList22 = arrayList8;
                    ArrayList<i> arrayList23 = arrayList9;
                    ArrayList<n> arrayList24 = new ArrayList();
                    if (arrayList20 != null) {
                        Iterator it = arrayList20.iterator();
                        while (it.hasNext()) {
                            C.h.b((h) it.next(), 0, arrayList24, null);
                        }
                    }
                    int i44 = 0;
                    n nVar5 = null;
                    if (arrayList21 != null) {
                        for (i iVar2 : arrayList21) {
                            n nVarB = C.h.b(iVar2, i44, arrayList24, nVar5);
                            iVar2.R(i44, nVarB, arrayList24);
                            nVarB.a(arrayList24);
                            i44 = 0;
                            nVar5 = null;
                        }
                    }
                    HashSet hashSet = i(2).a;
                    if (hashSet != null) {
                        Iterator it2 = hashSet.iterator();
                        while (it2.hasNext()) {
                            C.h.b(((c) it2.next()).f423d, 0, arrayList24, null);
                        }
                    }
                    HashSet hashSet2 = i(4).a;
                    if (hashSet2 != null) {
                        Iterator it3 = hashSet2.iterator();
                        while (it3.hasNext()) {
                            C.h.b(((c) it3.next()).f423d, 0, arrayList24, null);
                        }
                    }
                    HashSet hashSet3 = i(7).a;
                    if (hashSet3 != null) {
                        Iterator it4 = hashSet3.iterator();
                        while (it4.hasNext()) {
                            C.h.b(((c) it4.next()).f423d, 0, arrayList24, null);
                        }
                    }
                    n nVar6 = null;
                    if (arrayList10 != null) {
                        Iterator it5 = arrayList10.iterator();
                        while (it5.hasNext()) {
                            C.h.b((d) it5.next(), 0, arrayList24, null);
                        }
                    }
                    if (arrayList22 != null) {
                        Iterator it6 = arrayList22.iterator();
                        while (it6.hasNext()) {
                            C.h.b((h) it6.next(), 1, arrayList24, null);
                        }
                    }
                    int i45 = 1;
                    if (arrayList23 != null) {
                        for (i iVar3 : arrayList23) {
                            n nVarB2 = C.h.b(iVar3, i45, arrayList24, nVar6);
                            iVar3.R(i45, nVarB2, arrayList24);
                            nVarB2.a(arrayList24);
                            i45 = 1;
                            nVar6 = null;
                        }
                    }
                    HashSet hashSet4 = i(3).a;
                    if (hashSet4 != null) {
                        Iterator it7 = hashSet4.iterator();
                        while (it7.hasNext()) {
                            C.h.b(((c) it7.next()).f423d, 1, arrayList24, null);
                        }
                    }
                    HashSet hashSet5 = i(6).a;
                    if (hashSet5 != null) {
                        Iterator it8 = hashSet5.iterator();
                        while (it8.hasNext()) {
                            C.h.b(((c) it8.next()).f423d, 1, arrayList24, null);
                        }
                    }
                    HashSet hashSet6 = i(5).a;
                    if (hashSet6 != null) {
                        Iterator it9 = hashSet6.iterator();
                        while (it9.hasNext()) {
                            C.h.b(((c) it9.next()).f423d, 1, arrayList24, null);
                        }
                    }
                    HashSet hashSet7 = i(7).a;
                    if (hashSet7 != null) {
                        Iterator it10 = hashSet7.iterator();
                        while (it10.hasNext()) {
                            C.h.b(((c) it10.next()).f423d, 1, arrayList24, null);
                        }
                    }
                    if (arrayList11 != null) {
                        Iterator it11 = arrayList11.iterator();
                        while (it11.hasNext()) {
                            C.h.b((d) it11.next(), 1, arrayList24, null);
                        }
                    }
                    int i46 = 0;
                    while (i46 < size4) {
                        d dVar12 = (d) arrayList5.get(i46);
                        int[] iArr4 = dVar12.f481p0;
                        if (iArr4[0] == 3 && iArr4[1] == 3) {
                            int i47 = dVar12.f477n0;
                            int size5 = arrayList24.size();
                            int i48 = 0;
                            while (true) {
                                if (i48 >= size5) {
                                    i21 = i46;
                                    nVar3 = null;
                                    break;
                                }
                                i21 = i46;
                                nVar3 = (n) arrayList24.get(i48);
                                int i49 = size5;
                                if (i47 == nVar3.f836b) {
                                    break;
                                }
                                i48++;
                                size5 = i49;
                                i46 = i21;
                            }
                            int i50 = dVar12.f479o0;
                            int size6 = arrayList24.size();
                            int i51 = 0;
                            while (true) {
                                if (i51 >= size6) {
                                    nVar4 = null;
                                    break;
                                }
                                nVar4 = (n) arrayList24.get(i51);
                                int i52 = size6;
                                if (i50 == nVar4.f836b) {
                                    break;
                                }
                                i51++;
                                size6 = i52;
                            }
                            if (nVar3 != null && nVar4 != null) {
                                nVar3.c(0, nVar4);
                                nVar4.f837c = 2;
                                arrayList24.remove(nVar3);
                            }
                        } else {
                            i21 = i46;
                        }
                        i46 = i21 + 1;
                    }
                    if (arrayList24.size() > 1) {
                        if (r22[0] == 2) {
                            int i53 = 0;
                            nVar = null;
                            for (n nVar7 : arrayList24) {
                                if (nVar7.f837c != 1 && (iB2 = nVar7.b(cVar5, 0)) > i53) {
                                    nVar = nVar7;
                                    i53 = iB2;
                                }
                            }
                            c11 = 1;
                            if (nVar != null) {
                                M(1);
                                O(i53);
                            }
                            if (r22[c11] == 2) {
                                i20 = 0;
                                nVar2 = null;
                                for (n nVar8 : arrayList24) {
                                    if (nVar8.f837c != 0 && (iB = nVar8.b(cVar5, 1)) > i20) {
                                        nVar2 = nVar8;
                                        i20 = iB;
                                    }
                                }
                                if (nVar2 != null) {
                                    N(1);
                                    L(i20);
                                } else {
                                    nVar2 = null;
                                }
                            } else {
                                nVar2 = null;
                            }
                            if (nVar == null || nVar2 != null) {
                                if (i24 == 2) {
                                    if (iMax7 < q() || iMax7 <= 0) {
                                        iMax7 = q();
                                    } else {
                                        O(iMax7);
                                        this.f496E0 = true;
                                    }
                                }
                                if (i23 == 2) {
                                    if (iMax8 < k() || iMax8 <= 0) {
                                        iMax8 = k();
                                    } else {
                                        L(iMax8);
                                        this.f497F0 = true;
                                    }
                                }
                                i10 = iMax8;
                                i11 = iMax7;
                                z6 = true;
                                break;
                            }
                        } else {
                            c11 = 1;
                        }
                        nVar = null;
                        if (r22[c11] == 2) {
                            i20 = 0;
                            nVar2 = null;
                            while (r5.hasNext()) {
                                if (nVar8.f837c != 0) {
                                    nVar2 = nVar8;
                                    i20 = iB;
                                }
                            }
                            if (nVar2 != null) {
                                N(1);
                                L(i20);
                            } else {
                                nVar2 = null;
                            }
                        } else {
                            nVar2 = null;
                        }
                        if (nVar == null) {
                        }
                        if (i24 == 2) {
                            if (iMax7 < q()) {
                                iMax7 = q();
                            } else {
                                iMax7 = q();
                            }
                        }
                        if (i23 == 2) {
                            if (iMax8 < k()) {
                                iMax8 = k();
                            } else {
                                iMax8 = k();
                            }
                        }
                        i10 = iMax8;
                        i11 = iMax7;
                        z6 = true;
                        break;
                    }
                } else {
                    d dVar13 = (d) arrayList5.get(i41);
                    ?? r20 = r22[0];
                    ?? r21 = r22[1];
                    int i54 = i41;
                    int[] iArr5 = dVar13.f481p0;
                    cVar = cVar4;
                    if (C.h.h(r20, r21, iArr5[0], iArr5[1]) && !(dVar13 instanceof g)) {
                        i41 = i54 + 1;
                        cVar4 = cVar;
                    }
                }
            }
            if (!W(64) || W(128)) {
                z10 = true;
            } else {
                z10 = false;
            }
            cVar5.getClass();
            cVar5.f16270h = false;
            if (this.f495D0 == 0 && z10) {
                c10 = 1;
                cVar5.f16270h = true;
            } else {
                c10 = 1;
            }
            ArrayList arrayList25 = this.f504q0;
            if (r22[0] != 2 || r22[c10] == 2) {
                z11 = true;
            } else {
                z11 = false;
            }
            this.f513z0 = 0;
            this.f492A0 = 0;
            for (i12 = 0; i12 < size2; i12++) {
                dVar2 = (d) this.f504q0.get(i12);
                if (dVar2 instanceof e) {
                    ((e) dVar2).U();
                }
            }
            zW = W(64);
            r13 = z6;
            i13 = 0;
            z12 = true;
            while (z12) {
                i14 = i13 + 1;
                try {
                    cVar5.t();
                    this.f513z0 = 0;
                    this.f492A0 = 0;
                    g(cVar5);
                    for (i19 = 0; i19 < size2; i19++) {
                        ((d) this.f504q0.get(i19)).g(cVar5);
                    }
                    S(cVar5);
                    try {
                        weakReference = this.f498G0;
                        if (weakReference != null || weakReference.get() == null) {
                            cVar2 = cVar3;
                            z13 = z11;
                        } else {
                            c cVar6 = (c) this.f498G0.get();
                            p239z.f fVarK = cVar5.k(cVar3);
                            p239z.c cVar7 = this.f510w0;
                            cVar2 = cVar3;
                            z13 = z11;
                            try {
                                cVar7.f(cVar7.k(cVar6), fVarK, 0, 5);
                                this.f498G0 = null;
                            } catch (Exception e10) {
                                e = e10;
                                z23 = true;
                                e.printStackTrace();
                                System.out.println("EXCEPTION : " + e);
                                z14 = z23;
                                zArr = j.a;
                                if (z14) {
                                    zArr[2] = false;
                                    zW2 = W(64);
                                    Q(cVar5, zW2);
                                    size = this.f504q0.size();
                                    i18 = 0;
                                    z22 = false;
                                    while (i18 < size) {
                                        dVar = (d) this.f504q0.get(i18);
                                        dVar.Q(cVar5, zW2);
                                        boolean[] zArr3 = zArr;
                                        boolean z32 = zW2;
                                        if (dVar.f465h == -1) {
                                            z22 = true;
                                        } else {
                                            z22 = true;
                                        }
                                        i18++;
                                        zArr = zArr3;
                                        zW2 = z32;
                                        z22 = z22;
                                    }
                                    zArr2 = zArr;
                                    z15 = z22;
                                } else {
                                    zArr2 = zArr;
                                    Q(cVar5, zW);
                                    for (i15 = 0; i15 < size2; i15++) {
                                        ((d) this.f504q0.get(i15)).Q(cVar5, zW);
                                    }
                                    z15 = false;
                                }
                                if (z13) {
                                    iMax3 = 0;
                                    iMax4 = 0;
                                    for (i17 = 0; i17 < size2; i17++) {
                                        d dVar14 = (d) this.f504q0.get(i17);
                                        iMax3 = Math.max(iMax3, dVar14.q() + dVar14.f452Y);
                                        iMax4 = Math.max(iMax4, dVar14.k() + dVar14.f453Z);
                                    }
                                    iMax5 = Math.max(this.f456b0, iMax3);
                                    iMax6 = Math.max(this.c0, iMax4);
                                    r13 = r13;
                                    z15 = z15;
                                    if (i24 == 2) {
                                        r13 = r13;
                                        z15 = z15;
                                        O(iMax5);
                                        r22[0] = 2;
                                        r13 = 1;
                                        z15 = true;
                                    }
                                    if (i23 == 2) {
                                        L(iMax6);
                                        r22[1] = 2;
                                        r13 = 1;
                                        z15 = true;
                                    }
                                }
                                iMax = Math.max(this.f456b0, q());
                                if (iMax > q()) {
                                    O(iMax);
                                    r14 = 1;
                                    r22[0] = 1;
                                    z16 = true;
                                    r18 = 1;
                                } else {
                                    r14 = 1;
                                    r18 = r13;
                                    z16 = z15;
                                }
                                iMax2 = Math.max(this.c0, k());
                                if (iMax2 > k()) {
                                    L(iMax2);
                                    r22[r14] = r14;
                                    r16 = r14;
                                    z17 = r16 == true ? 1 : 0;
                                } else {
                                    r10 = r18;
                                }
                                if (r10 == 0) {
                                    z17 = z16;
                                    if (r22[0] == 2) {
                                        r12 = r10;
                                        z21 = z17;
                                        if (q() > i11) {
                                            this.f496E0 = r14;
                                            r22[0] = r14;
                                            O(i11);
                                            ?? r23 = r14;
                                            z21 = r23 == true ? 1 : 0;
                                            r12 = r23;
                                        }
                                    }
                                    r10 = r16;
                                    r12 = r10;
                                    r12 = r10;
                                    z21 = z17;
                                    z21 = z17;
                                    r11 = r12;
                                    r11 = r12;
                                    z18 = z21;
                                    z18 = z21;
                                    if (r22[r14] != 2) {
                                    }
                                    if (i14 > i16) {
                                        r11 = r12;
                                        z18 = z21;
                                        z20 = false;
                                    } else {
                                        r11 = r12;
                                        z18 = z21;
                                        z20 = z19;
                                    }
                                    i13 = i14;
                                    cVar3 = cVar2;
                                    z11 = z13;
                                    r13 = r15;
                                    z12 = z20;
                                } else {
                                    z17 = z16;
                                    r10 = r16;
                                    r11 = r10;
                                    z18 = z17;
                                }
                                r11 = r12;
                                z18 = z21;
                                r15 = r11;
                                z19 = z18;
                                i16 = 8;
                                if (i14 > i16) {
                                    r11 = r12;
                                    z18 = z21;
                                    z20 = false;
                                } else {
                                    r11 = r12;
                                    z18 = z21;
                                    z20 = z19;
                                }
                                i13 = i14;
                                cVar3 = cVar2;
                                z11 = z13;
                                r13 = r15;
                                z12 = z20;
                            }
                        }
                        weakReference2 = this.f500I0;
                        if (weakReference2 != null && weakReference2.get() != null) {
                            c cVar8 = (c) this.f500I0.get();
                            p239z.f fVarK2 = cVar5.k(this.f440L);
                            p239z.c cVar9 = this.f510w0;
                            cVar9.f(fVarK2, cVar9.k(cVar8), 0, 5);
                            this.f500I0 = null;
                        }
                        weakReference3 = this.f499H0;
                        if (weakReference3 != null || weakReference3.get() == null) {
                            weakReference4 = this.f501J0;
                            if (weakReference4 == null && weakReference4.get() != null) {
                                c cVar10 = (c) this.f501J0.get();
                                p239z.f fVarK3 = cVar5.k(this.f439K);
                                try {
                                    p239z.c cVar11 = this.f510w0;
                                    try {
                                        cVar11.f(fVarK3, cVar11.k(cVar10), 0, 5);
                                        try {
                                            this.f501J0 = null;
                                        } catch (Exception e11) {
                                            e = e11;
                                            z23 = true;
                                            e.printStackTrace();
                                            System.out.println("EXCEPTION : " + e);
                                            z14 = z23;
                                        }
                                    } catch (Exception e12) {
                                        e = e12;
                                    }
                                } catch (Exception e13) {
                                    e = e13;
                                    z23 = true;
                                    e.printStackTrace();
                                    System.out.println("EXCEPTION : " + e);
                                    z14 = z23;
                                    zArr = j.a;
                                    if (z14) {
                                        zArr[2] = false;
                                        zW2 = W(64);
                                        Q(cVar5, zW2);
                                        size = this.f504q0.size();
                                        i18 = 0;
                                        z22 = false;
                                        while (i18 < size) {
                                            dVar = (d) this.f504q0.get(i18);
                                            dVar.Q(cVar5, zW2);
                                            boolean[] zArr4 = zArr;
                                            boolean z33 = zW2;
                                            if (dVar.f465h == -1) {
                                                z22 = true;
                                            } else {
                                                z22 = true;
                                            }
                                            i18++;
                                            zArr = zArr4;
                                            zW2 = z33;
                                            z22 = z22;
                                        }
                                        zArr2 = zArr;
                                        z15 = z22;
                                    } else {
                                        zArr2 = zArr;
                                        Q(cVar5, zW);
                                        while (i15 < size2) {
                                            ((d) this.f504q0.get(i15)).Q(cVar5, zW);
                                        }
                                        z15 = false;
                                    }
                                    if (z13) {
                                        iMax3 = 0;
                                        iMax4 = 0;
                                        while (i17 < size2) {
                                            d dVar15 = (d) this.f504q0.get(i17);
                                            iMax3 = Math.max(iMax3, dVar15.q() + dVar15.f452Y);
                                            iMax4 = Math.max(iMax4, dVar15.k() + dVar15.f453Z);
                                        }
                                        iMax5 = Math.max(this.f456b0, iMax3);
                                        iMax6 = Math.max(this.c0, iMax4);
                                        r13 = r13;
                                        z15 = z15;
                                        if (i24 == 2) {
                                            r13 = r13;
                                            z15 = z15;
                                            O(iMax5);
                                            r22[0] = 2;
                                            r13 = 1;
                                            z15 = true;
                                        }
                                        if (i23 == 2) {
                                            L(iMax6);
                                            r22[1] = 2;
                                            r13 = 1;
                                            z15 = true;
                                        }
                                    }
                                    iMax = Math.max(this.f456b0, q());
                                    if (iMax > q()) {
                                        O(iMax);
                                        r14 = 1;
                                        r22[0] = 1;
                                        z16 = true;
                                        r18 = 1;
                                    } else {
                                        r14 = 1;
                                        r18 = r13;
                                        z16 = z15;
                                    }
                                    iMax2 = Math.max(this.c0, k());
                                    if (iMax2 > k()) {
                                        L(iMax2);
                                        r22[r14] = r14;
                                        r16 = r14;
                                        z17 = r16 == true ? 1 : 0;
                                    } else {
                                        r10 = r18;
                                    }
                                    if (r10 == 0) {
                                        z17 = z16;
                                        if (r22[0] == 2) {
                                            r12 = r10;
                                            z21 = z17;
                                            if (q() > i11) {
                                                this.f496E0 = r14;
                                                r22[0] = r14;
                                                O(i11);
                                                ?? r24 = r14;
                                                z21 = r24 == true ? 1 : 0;
                                                r12 = r24;
                                            }
                                        }
                                        r10 = r16;
                                        r12 = r10;
                                        r12 = r10;
                                        z21 = z17;
                                        z21 = z17;
                                        r11 = r12;
                                        r11 = r12;
                                        z18 = z21;
                                        z18 = z21;
                                        if (r22[r14] != 2) {
                                        }
                                        if (i14 > i16) {
                                            r11 = r12;
                                            z18 = z21;
                                            z20 = false;
                                        } else {
                                            r11 = r12;
                                            z18 = z21;
                                            z20 = z19;
                                        }
                                        i13 = i14;
                                        cVar3 = cVar2;
                                        z11 = z13;
                                        r13 = r15;
                                        z12 = z20;
                                    } else {
                                        z17 = z16;
                                        r10 = r16;
                                        r11 = r10;
                                        z18 = z17;
                                    }
                                    r11 = r12;
                                    z18 = z21;
                                    r15 = r11;
                                    z19 = z18;
                                    i16 = 8;
                                    if (i14 > i16) {
                                        r11 = r12;
                                        z18 = z21;
                                        z20 = false;
                                    } else {
                                        r11 = r12;
                                        z18 = z21;
                                        z20 = z19;
                                    }
                                    i13 = i14;
                                    cVar3 = cVar2;
                                    z11 = z13;
                                    r13 = r15;
                                    z12 = z20;
                                }
                            }
                            cVar5.p();
                            z14 = true;
                        } else {
                            c cVar12 = (c) this.f499H0.get();
                            c cVar13 = cVar;
                            try {
                                p239z.f fVarK4 = cVar5.k(cVar13);
                                p239z.c cVar14 = this.f510w0;
                                cVar = cVar13;
                                cVar14.f(cVar14.k(cVar12), fVarK4, 0, 5);
                                this.f499H0 = null;
                                weakReference4 = this.f501J0;
                                if (weakReference4 == null) {
                                }
                                cVar5.p();
                                z14 = true;
                            } catch (Exception e14) {
                                e = e14;
                                cVar = cVar13;
                                z23 = true;
                                e.printStackTrace();
                                System.out.println("EXCEPTION : " + e);
                                z14 = z23;
                                zArr = j.a;
                                if (z14) {
                                    zArr[2] = false;
                                    zW2 = W(64);
                                    Q(cVar5, zW2);
                                    size = this.f504q0.size();
                                    i18 = 0;
                                    z22 = false;
                                    while (i18 < size) {
                                        dVar = (d) this.f504q0.get(i18);
                                        dVar.Q(cVar5, zW2);
                                        boolean[] zArr5 = zArr;
                                        boolean z34 = zW2;
                                        if (dVar.f465h == -1) {
                                            z22 = true;
                                        } else {
                                            z22 = true;
                                        }
                                        i18++;
                                        zArr = zArr5;
                                        zW2 = z34;
                                        z22 = z22;
                                    }
                                    zArr2 = zArr;
                                    z15 = z22;
                                } else {
                                    zArr2 = zArr;
                                    Q(cVar5, zW);
                                    while (i15 < size2) {
                                        ((d) this.f504q0.get(i15)).Q(cVar5, zW);
                                    }
                                    z15 = false;
                                }
                                if (z13) {
                                    iMax3 = 0;
                                    iMax4 = 0;
                                    while (i17 < size2) {
                                        d dVar16 = (d) this.f504q0.get(i17);
                                        iMax3 = Math.max(iMax3, dVar16.q() + dVar16.f452Y);
                                        iMax4 = Math.max(iMax4, dVar16.k() + dVar16.f453Z);
                                    }
                                    iMax5 = Math.max(this.f456b0, iMax3);
                                    iMax6 = Math.max(this.c0, iMax4);
                                    r13 = r13;
                                    z15 = z15;
                                    if (i24 == 2) {
                                        r13 = r13;
                                        z15 = z15;
                                        O(iMax5);
                                        r22[0] = 2;
                                        r13 = 1;
                                        z15 = true;
                                    }
                                    if (i23 == 2) {
                                        L(iMax6);
                                        r22[1] = 2;
                                        r13 = 1;
                                        z15 = true;
                                    }
                                }
                                iMax = Math.max(this.f456b0, q());
                                if (iMax > q()) {
                                    O(iMax);
                                    r14 = 1;
                                    r22[0] = 1;
                                    z16 = true;
                                    r18 = 1;
                                } else {
                                    r14 = 1;
                                    r18 = r13;
                                    z16 = z15;
                                }
                                iMax2 = Math.max(this.c0, k());
                                if (iMax2 > k()) {
                                    L(iMax2);
                                    r22[r14] = r14;
                                    r16 = r14;
                                    z17 = r16 == true ? 1 : 0;
                                } else {
                                    r10 = r18;
                                }
                                if (r10 == 0) {
                                    z17 = z16;
                                    if (r22[0] == 2) {
                                        r12 = r10;
                                        z21 = z17;
                                        if (q() > i11) {
                                            this.f496E0 = r14;
                                            r22[0] = r14;
                                            O(i11);
                                            ?? r25 = r14;
                                            z21 = r25 == true ? 1 : 0;
                                            r12 = r25;
                                        }
                                    }
                                    r10 = r16;
                                    r12 = r10;
                                    r12 = r10;
                                    z21 = z17;
                                    z21 = z17;
                                    r11 = r12;
                                    r11 = r12;
                                    z18 = z21;
                                    z18 = z21;
                                    if (r22[r14] != 2) {
                                    }
                                    if (i14 > i16) {
                                        r11 = r12;
                                        z18 = z21;
                                        z20 = false;
                                    } else {
                                        r11 = r12;
                                        z18 = z21;
                                        z20 = z19;
                                    }
                                    i13 = i14;
                                    cVar3 = cVar2;
                                    z11 = z13;
                                    r13 = r15;
                                    z12 = z20;
                                } else {
                                    z17 = z16;
                                    r10 = r16;
                                    r11 = r10;
                                    z18 = z17;
                                }
                                r11 = r12;
                                z18 = z21;
                                r15 = r11;
                                z19 = z18;
                                i16 = 8;
                                if (i14 > i16) {
                                    r11 = r12;
                                    z18 = z21;
                                    z20 = false;
                                } else {
                                    r11 = r12;
                                    z18 = z21;
                                    z20 = z19;
                                }
                                i13 = i14;
                                cVar3 = cVar2;
                                z11 = z13;
                                r13 = r15;
                                z12 = z20;
                            }
                        }
                    } catch (Exception e15) {
                        e = e15;
                        cVar2 = cVar3;
                        z13 = z11;
                    }
                } catch (Exception e16) {
                    e = e16;
                    cVar2 = cVar3;
                    z13 = z11;
                    z23 = z12;
                }
                zArr = j.a;
                if (z14) {
                    zArr[2] = false;
                    zW2 = W(64);
                    Q(cVar5, zW2);
                    size = this.f504q0.size();
                    i18 = 0;
                    z22 = false;
                    while (i18 < size) {
                        dVar = (d) this.f504q0.get(i18);
                        dVar.Q(cVar5, zW2);
                        boolean[] zArr6 = zArr;
                        boolean z35 = zW2;
                        if (dVar.f465h == -1 || dVar.f467i != -1) {
                            z22 = true;
                        }
                        i18++;
                        zArr = zArr6;
                        zW2 = z35;
                        z22 = z22;
                    }
                    zArr2 = zArr;
                    z15 = z22;
                } else {
                    zArr2 = zArr;
                    Q(cVar5, zW);
                    while (i15 < size2) {
                        ((d) this.f504q0.get(i15)).Q(cVar5, zW);
                    }
                    z15 = false;
                }
                if (z13 && i14 < 8 && zArr2[2]) {
                    iMax3 = 0;
                    iMax4 = 0;
                    while (i17 < size2) {
                        d dVar17 = (d) this.f504q0.get(i17);
                        iMax3 = Math.max(iMax3, dVar17.q() + dVar17.f452Y);
                        iMax4 = Math.max(iMax4, dVar17.k() + dVar17.f453Z);
                    }
                    iMax5 = Math.max(this.f456b0, iMax3);
                    iMax6 = Math.max(this.c0, iMax4);
                    r13 = r13;
                    z15 = z15;
                    if (i24 == 2 && q() < iMax5) {
                        r13 = r13;
                        z15 = z15;
                        O(iMax5);
                        r22[0] = 2;
                        r13 = 1;
                        z15 = true;
                    }
                    if (i23 == 2 && k() < iMax6) {
                        L(iMax6);
                        r22[1] = 2;
                        r13 = 1;
                        z15 = true;
                    }
                }
                iMax = Math.max(this.f456b0, q());
                if (iMax > q()) {
                    O(iMax);
                    r14 = 1;
                    r22[0] = 1;
                    z16 = true;
                    r18 = 1;
                } else {
                    r14 = 1;
                    r18 = r13;
                    z16 = z15;
                }
                iMax2 = Math.max(this.c0, k());
                if (iMax2 > k()) {
                    L(iMax2);
                    r22[r14] = r14;
                    r16 = r14;
                    z17 = r16 == true ? 1 : 0;
                } else {
                    r10 = r18;
                }
                if (r10 == 0) {
                    z17 = z16;
                    if (r22[0] == 2 && i11 > 0) {
                        r12 = r10;
                        z21 = z17;
                        if (q() > i11) {
                            this.f496E0 = r14;
                            r22[0] = r14;
                            O(i11);
                            ?? r26 = r14;
                            z21 = r26 == true ? 1 : 0;
                            r12 = r26;
                        }
                    }
                    r10 = r16;
                    r12 = r10;
                    r12 = r10;
                    z21 = z17;
                    z21 = z17;
                    r11 = r12;
                    r11 = r12;
                    z18 = z21;
                    z18 = z21;
                    if (r22[r14] != 2 && i10 > 0 && k() > i10) {
                        this.f497F0 = r14;
                        r22[r14] = r14;
                        L(i10);
                        i16 = 8;
                        z19 = true;
                        r15 = 1;
                    }
                    if (i14 > i16) {
                        r11 = r12;
                        z18 = z21;
                        z20 = false;
                    } else {
                        r11 = r12;
                        z18 = z21;
                        z20 = z19;
                    }
                    i13 = i14;
                    cVar3 = cVar2;
                    z11 = z13;
                    r13 = r15;
                    z12 = z20;
                } else {
                    z17 = z16;
                    r10 = r16;
                    r11 = r10;
                    z18 = z17;
                }
                r11 = r12;
                z18 = z21;
                r15 = r11;
                z19 = z18;
                i16 = 8;
                if (i14 > i16) {
                    r11 = r12;
                    z18 = z21;
                    z20 = false;
                } else {
                    r11 = r12;
                    z18 = z21;
                    z20 = z19;
                }
                i13 = i14;
                cVar3 = cVar2;
                z11 = z13;
                r13 = r15;
                z12 = z20;
            }
            this.f504q0 = arrayList25;
            if (r13 != 0) {
                r22[0] = i24;
                r22[1] = i23;
            }
            F(cVar5.f16274m);
        }
        cVar = cVar4;
        i10 = iMax8;
        i11 = iMax7;
        z6 = false;
        if (W(64)) {
            z10 = true;
        } else {
            z10 = true;
        }
        cVar5.getClass();
        cVar5.f16270h = false;
        if (this.f495D0 == 0) {
            c10 = 1;
        } else {
            c10 = 1;
        }
        ArrayList arrayList26 = this.f504q0;
        if (r22[0] != 2) {
            z11 = true;
        } else {
            z11 = true;
        }
        this.f513z0 = 0;
        this.f492A0 = 0;
        while (i12 < size2) {
            dVar2 = (d) this.f504q0.get(i12);
            if (dVar2 instanceof e) {
                ((e) dVar2).U();
            }
        }
        zW = W(64);
        r13 = z6;
        i13 = 0;
        z12 = true;
        while (z12) {
            i14 = i13 + 1;
            cVar5.t();
            this.f513z0 = 0;
            this.f492A0 = 0;
            g(cVar5);
            while (i19 < size2) {
                ((d) this.f504q0.get(i19)).g(cVar5);
            }
            S(cVar5);
            weakReference = this.f498G0;
            if (weakReference != null) {
                cVar2 = cVar3;
                z13 = z11;
                weakReference2 = this.f500I0;
                if (weakReference2 != null) {
                    c cVar15 = (c) this.f500I0.get();
                    p239z.f fVarK5 = cVar5.k(this.f440L);
                    p239z.c cVar16 = this.f510w0;
                    cVar16.f(fVarK5, cVar16.k(cVar15), 0, 5);
                    this.f500I0 = null;
                }
                weakReference3 = this.f499H0;
                if (weakReference3 != null) {
                    weakReference4 = this.f501J0;
                    if (weakReference4 == null) {
                    }
                    cVar5.p();
                    z14 = true;
                } else {
                    weakReference4 = this.f501J0;
                    if (weakReference4 == null) {
                    }
                    cVar5.p();
                    z14 = true;
                }
            } else {
                cVar2 = cVar3;
                z13 = z11;
                weakReference2 = this.f500I0;
                if (weakReference2 != null) {
                    c cVar17 = (c) this.f500I0.get();
                    p239z.f fVarK6 = cVar5.k(this.f440L);
                    p239z.c cVar18 = this.f510w0;
                    cVar18.f(fVarK6, cVar18.k(cVar17), 0, 5);
                    this.f500I0 = null;
                }
                weakReference3 = this.f499H0;
                if (weakReference3 != null) {
                    weakReference4 = this.f501J0;
                    if (weakReference4 == null) {
                    }
                    cVar5.p();
                    z14 = true;
                } else {
                    weakReference4 = this.f501J0;
                    if (weakReference4 == null) {
                    }
                    cVar5.p();
                    z14 = true;
                }
            }
            zArr = j.a;
            if (z14) {
                zArr[2] = false;
                zW2 = W(64);
                Q(cVar5, zW2);
                size = this.f504q0.size();
                i18 = 0;
                z22 = false;
                while (i18 < size) {
                    dVar = (d) this.f504q0.get(i18);
                    dVar.Q(cVar5, zW2);
                    boolean[] zArr7 = zArr;
                    boolean z36 = zW2;
                    if (dVar.f465h == -1) {
                        z22 = true;
                    } else {
                        z22 = true;
                    }
                    i18++;
                    zArr = zArr7;
                    zW2 = z36;
                    z22 = z22;
                }
                zArr2 = zArr;
                z15 = z22;
            } else {
                zArr2 = zArr;
                Q(cVar5, zW);
                while (i15 < size2) {
                    ((d) this.f504q0.get(i15)).Q(cVar5, zW);
                }
                z15 = false;
            }
            if (z13) {
                iMax3 = 0;
                iMax4 = 0;
                while (i17 < size2) {
                    d dVar18 = (d) this.f504q0.get(i17);
                    iMax3 = Math.max(iMax3, dVar18.q() + dVar18.f452Y);
                    iMax4 = Math.max(iMax4, dVar18.k() + dVar18.f453Z);
                }
                iMax5 = Math.max(this.f456b0, iMax3);
                iMax6 = Math.max(this.c0, iMax4);
                r13 = r13;
                z15 = z15;
                if (i24 == 2) {
                    r13 = r13;
                    z15 = z15;
                    O(iMax5);
                    r22[0] = 2;
                    r13 = 1;
                    z15 = true;
                }
                if (i23 == 2) {
                    L(iMax6);
                    r22[1] = 2;
                    r13 = 1;
                    z15 = true;
                }
            }
            iMax = Math.max(this.f456b0, q());
            if (iMax > q()) {
                O(iMax);
                r14 = 1;
                r22[0] = 1;
                z16 = true;
                r18 = 1;
            } else {
                r14 = 1;
                r18 = r13;
                z16 = z15;
            }
            iMax2 = Math.max(this.c0, k());
            if (iMax2 > k()) {
                L(iMax2);
                r22[r14] = r14;
                r16 = r14;
                z17 = r16 == true ? 1 : 0;
            } else {
                r10 = r18;
            }
            if (r10 == 0) {
                z17 = z16;
                if (r22[0] == 2) {
                    r12 = r10;
                    z21 = z17;
                    if (q() > i11) {
                        this.f496E0 = r14;
                        r22[0] = r14;
                        O(i11);
                        ?? r27 = r14;
                        z21 = r27 == true ? 1 : 0;
                        r12 = r27;
                    }
                }
                r10 = r16;
                r12 = r10;
                r12 = r10;
                z21 = z17;
                z21 = z17;
                r11 = r12;
                r11 = r12;
                z18 = z21;
                z18 = z21;
                if (r22[r14] != 2) {
                }
                if (i14 > i16) {
                    r11 = r12;
                    z18 = z21;
                    z20 = false;
                } else {
                    r11 = r12;
                    z18 = z21;
                    z20 = z19;
                }
                i13 = i14;
                cVar3 = cVar2;
                z11 = z13;
                r13 = r15;
                z12 = z20;
            } else {
                z17 = z16;
                r10 = r16;
                r11 = r10;
                z18 = z17;
            }
            r11 = r12;
            z18 = z21;
            r15 = r11;
            z19 = z18;
            i16 = 8;
            if (i14 > i16) {
                r11 = r12;
                z18 = z21;
                z20 = false;
            } else {
                r11 = r12;
                z18 = z21;
                z20 = z19;
            }
            i13 = i14;
            cVar3 = cVar2;
            z11 = z13;
            r13 = r15;
            z12 = z20;
        }
        this.f504q0 = arrayList26;
        if (r13 != 0) {
            r22[0] = i24;
            r22[1] = i23;
        }
        F(cVar5.f16274m);
    }

    public final boolean W(int i10) {
        return (this.f495D0 & i10) == i10;
    }

    @Override // B.d
    public final void n(StringBuilder sb) {
        sb.append(this.j + ":{\n");
        StringBuilder sb2 = new StringBuilder("  actualWidth:");
        sb2.append(this.f448U);
        sb.append(sb2.toString());
        sb.append("\n");
        sb.append("  actualHeight:" + this.f449V);
        sb.append("\n");
        Iterator it = this.f504q0.iterator();
        while (it.hasNext()) {
            ((d) it.next()).n(sb);
            sb.append(",\n");
        }
        sb.append("}");
    }
}
