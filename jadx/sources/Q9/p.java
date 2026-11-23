package Q9;

import N9.C0322e;
import N9.C0324g;
import O3.y;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public class p extends R9.a implements b, c {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public int f4392A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public int f4393B;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final int f4394v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final int f4395w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Object[] f4396x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public long f4397y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public long f4398z;

    public p(int i10, int i11) {
        this.f4394v = i10;
        this.f4395w = i11;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0081 A[Catch: all -> 0x0038, TryCatch #1 {all -> 0x0038, blocks: (B:15:0x0031, B:32:0x0079, B:34:0x0081, B:38:0x0094, B:41:0x009b, B:42:0x00a1, B:43:0x00a2, B:22:0x004b), top: B:52:0x0020 }] */
    /* JADX WARN: Code duplicated, block: B:38:0x0094 A[Catch: all -> 0x0038, TryCatch #1 {all -> 0x0038, blocks: (B:15:0x0031, B:32:0x0079, B:34:0x0081, B:38:0x0094, B:41:0x009b, B:42:0x00a1, B:43:0x00a2, B:22:0x004b), top: B:52:0x0020 }] */
    /* JADX WARN: Code duplicated, block: B:56:0x0092 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:60:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v10 */
    /* JADX WARN: Type inference failed for: r10v11 */
    /* JADX WARN: Type inference failed for: r10v12 */
    /* JADX WARN: Type inference failed for: r10v13 */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v4, types: [Q9.c] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r5v1, types: [R9.a] */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v4, types: [Q9.p] */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v19 */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r9v0, types: [Q9.c] */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v12 */
    /* JADX WARN: Type inference failed for: r9v13 */
    /* JADX WARN: Type inference failed for: r9v14 */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v17 */
    /* JADX WARN: Type inference failed for: r9v18 */
    /* JADX WARN: Type inference failed for: r9v2, types: [R9.c] */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5, types: [Q9.r] */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX WARN: Type inference failed for: r9v8, types: [Q9.r] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:44:0x00b0 -> B:16:0x0034). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:56:0x0092
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static void h(Q9.p r8, Q9.c r9, p144o8.c r10) throws java.lang.Throwable {
        /*
            boolean r0 = r10 instanceof Q9.o
            if (r0 == 0) goto L13
            r0 = r10
            Q9.o r0 = (Q9.o) r0
            int r1 = r0.f4391y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f4391y = r1
            goto L18
        L13:
            Q9.o r0 = new Q9.o
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.f4389w
            n8.a r1 = p134n8.a.f13404s
            int r2 = r0.f4391y
            r3 = 3
            r4 = 2
            if (r2 == 0) goto L5e
            r8 = 1
            if (r2 == r8) goto L4f
            if (r2 == r4) goto L43
            if (r2 != r3) goto L3b
            N9.c0 r8 = r0.f4388v
            Q9.r r9 = r0.f4387u
            Q9.c r2 = r0.f4386t
            Q9.p r5 = r0.f4385s
            J7.a.v(r10)     // Catch: java.lang.Throwable -> L38
        L34:
            r10 = r2
            r2 = r8
            r8 = r5
            goto L76
        L38:
            r8 = move-exception
            goto Lb6
        L3b:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L43:
            N9.c0 r8 = r0.f4388v
            Q9.r r9 = r0.f4387u
            Q9.c r2 = r0.f4386t
            Q9.p r5 = r0.f4385s
            J7.a.v(r10)     // Catch: java.lang.Throwable -> L38
            goto L79
        L4f:
            Q9.r r9 = r0.f4387u
            Q9.c r8 = r0.f4386t
            Q9.p r2 = r0.f4385s
            J7.a.v(r10)     // Catch: java.lang.Throwable -> L5b
            r10 = r8
            r8 = r2
            goto L6a
        L5b:
            r8 = move-exception
            r5 = r2
            goto Lb6
        L5e:
            J7.a.v(r10)
            R9.c r10 = r8.b()
            Q9.r r10 = (Q9.r) r10
            r7 = r10
            r10 = r9
            r9 = r7
        L6a:
            m8.i r2 = r0.getContext()     // Catch: java.lang.Throwable -> Lb3
            N9.b0 r5 = N9.b0.f3440s     // Catch: java.lang.Throwable -> Lb3
            m8.g r2 = r2.get(r5)     // Catch: java.lang.Throwable -> Lb3
            N9.c0 r2 = (N9.c0) r2     // Catch: java.lang.Throwable -> Lb3
        L76:
            r5 = r8
            r8 = r2
            r2 = r10
        L79:
            java.lang.Object r10 = r5.q(r9)     // Catch: java.lang.Throwable -> L38
            O3.y r6 = Q9.q.a     // Catch: java.lang.Throwable -> L38
            if (r10 != r6) goto L92
            r0.f4385s = r5     // Catch: java.lang.Throwable -> L38
            r0.f4386t = r2     // Catch: java.lang.Throwable -> L38
            r0.f4387u = r9     // Catch: java.lang.Throwable -> L38
            r0.f4388v = r8     // Catch: java.lang.Throwable -> L38
            r0.f4391y = r4     // Catch: java.lang.Throwable -> L38
            java.lang.Object r10 = r5.f(r9, r0)     // Catch: java.lang.Throwable -> L38
            if (r10 != r1) goto L79
            goto Lb2
        L92:
            if (r8 == 0) goto La2
            boolean r6 = r8.a()     // Catch: java.lang.Throwable -> L38
            if (r6 == 0) goto L9b
            goto La2
        L9b:
            N9.k0 r8 = (N9.k0) r8     // Catch: java.lang.Throwable -> L38
            java.util.concurrent.CancellationException r8 = r8.t()     // Catch: java.lang.Throwable -> L38
            throw r8     // Catch: java.lang.Throwable -> L38
        La2:
            r0.f4385s = r5     // Catch: java.lang.Throwable -> L38
            r0.f4386t = r2     // Catch: java.lang.Throwable -> L38
            r0.f4387u = r9     // Catch: java.lang.Throwable -> L38
            r0.f4388v = r8     // Catch: java.lang.Throwable -> L38
            r0.f4391y = r3     // Catch: java.lang.Throwable -> L38
            java.lang.Object r10 = r2.a(r10, r0)     // Catch: java.lang.Throwable -> L38
            if (r10 != r1) goto L34
        Lb2:
            return
        Lb3:
            r10 = move-exception
            r5 = r8
            r8 = r10
        Lb6:
            r5.e(r9)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: Q9.p.h(Q9.p, Q9.c, o8.c):void");
    }

    @Override // Q9.b
    public final Object A(c cVar, p144o8.c cVar2) throws Throwable {
        h(this, cVar, cVar2);
        return p134n8.a.f13404s;
    }

    @Override // Q9.c
    public final Object a(Object obj, p123m8.d dVar) throws Throwable {
        Throwable th;
        p123m8.d[] dVarArrK;
        n nVar;
        if (n(obj)) {
            return p076h8.m.a;
        }
        C0324g c0324g = new C0324g(1, qa.b.q(dVar));
        c0324g.w();
        p123m8.d[] dVarArrK2 = R9.b.a;
        synchronized (this) {
            try {
                if (o(obj)) {
                    try {
                        c0324g.resumeWith(p076h8.m.a);
                        dVarArrK = k(dVarArrK2);
                        nVar = null;
                    } catch (Throwable th2) {
                        th = th2;
                        throw th;
                    }
                } else {
                    try {
                        n nVar2 = new n(this, l() + ((long) (this.f4392A + this.f4393B)), obj, c0324g);
                        j(nVar2);
                        this.f4393B++;
                        if (this.f4394v == 0) {
                            dVarArrK2 = k(dVarArrK2);
                        }
                        dVarArrK = dVarArrK2;
                        nVar = nVar2;
                    } catch (Throwable th3) {
                        th = th3;
                        th = th;
                        throw th;
                    }
                }
                if (nVar != null) {
                    c0324g.y(new C0322e(nVar, 1));
                }
                for (p123m8.d dVar2 : dVarArrK) {
                    if (dVar2 != null) {
                        dVar2.resumeWith(p076h8.m.a);
                    }
                }
                Object objV = c0324g.v();
                p134n8.a aVar = p134n8.a.f13404s;
                if (objV != aVar) {
                    objV = p076h8.m.a;
                }
                return objV == aVar ? objV : p076h8.m.a;
            } catch (Throwable th4) {
                th = th4;
            }
        }
    }

    @Override // R9.a
    public final R9.c c() {
        r rVar = new r();
        rVar.a = -1L;
        return rVar;
    }

    @Override // R9.a
    public final R9.c[] d() {
        return new r[2];
    }

    public final Object f(r rVar, o oVar) {
        C0324g c0324g = new C0324g(1, qa.b.q(oVar));
        c0324g.w();
        synchronized (this) {
            if (p(rVar) < 0) {
                rVar.f4401b = c0324g;
            } else {
                c0324g.resumeWith(p076h8.m.a);
            }
        }
        Object objV = c0324g.v();
        return objV == p134n8.a.f13404s ? objV : p076h8.m.a;
    }

    public final void g() {
        if (this.f4394v != 0 || this.f4393B > 1) {
            Object[] objArr = this.f4396x;
            p210v8.i.c(objArr);
            while (this.f4393B > 0) {
                long jL = l();
                int i10 = this.f4392A;
                int i11 = this.f4393B;
                if (objArr[((int) ((jL + ((long) (i10 + i11))) - 1)) & (objArr.length - 1)] != q.a) {
                    return;
                }
                this.f4393B = i11 - 1;
                q.b(objArr, l() + ((long) (this.f4392A + this.f4393B)), null);
            }
        }
    }

    public final void i() {
        R9.c[] cVarArr;
        Object[] objArr = this.f4396x;
        p210v8.i.c(objArr);
        q.b(objArr, l(), null);
        this.f4392A--;
        long jL = l() + 1;
        if (this.f4397y < jL) {
            this.f4397y = jL;
        }
        if (this.f4398z < jL) {
            if (this.f4479t != 0 && (cVarArr = this.f4478s) != null) {
                for (R9.c cVar : cVarArr) {
                    if (cVar != null) {
                        r rVar = (r) cVar;
                        long j = rVar.a;
                        if (j >= 0 && j < jL) {
                            rVar.a = jL;
                        }
                    }
                }
            }
            this.f4398z = jL;
        }
    }

    public final void j(Object obj) {
        int i10 = this.f4392A + this.f4393B;
        Object[] objArrM = this.f4396x;
        if (objArrM == null) {
            objArrM = m(0, 2, null);
        } else if (i10 >= objArrM.length) {
            objArrM = m(i10, objArrM.length * 2, objArrM);
        }
        q.b(objArrM, l() + ((long) i10), obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [m8.d[]] */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v10 */
    /* JADX WARN: Type inference failed for: r11v3, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r11v7 */
    /* JADX WARN: Type inference failed for: r11v8 */
    /* JADX WARN: Type inference failed for: r11v9 */
    /* JADX WARN: Type inference failed for: r6v3 */
    public final p123m8.d[] k(p123m8.d[] dVarArr) {
        R9.c[] cVarArr;
        r rVar;
        C0324g c0324g;
        int length = dVarArr.length;
        if (this.f4479t != 0 && (cVarArr = this.f4478s) != null) {
            int length2 = cVarArr.length;
            int i10 = 0;
            while (i10 < length2) {
                R9.c cVar = cVarArr[i10];
                if (cVar == null || (c0324g = (rVar = (r) cVar).f4401b) == null || p(rVar) < 0) {
                    dVarArr = dVarArr;
                } else {
                    if (length >= dVarArr.length) {
                        dVarArr = dVarArr;
                        dVarArr = dVarArr;
                        Object[] objArrCopyOf = Arrays.copyOf((Object[]) dVarArr, Math.max(2, dVarArr.length * 2));
                        p210v8.i.e(objArrCopyOf, "copyOf(this, newSize)");
                        dVarArr = objArrCopyOf;
                    }
                    dVarArr = dVarArr;
                    dVarArr = dVarArr;
                    ((p123m8.d[]) dVarArr)[length] = c0324g;
                    rVar.f4401b = null;
                    length++;
                }
                i10++;
                dVarArr = dVarArr;
            }
            dVarArr = dVarArr;
        }
        return (p123m8.d[]) dVarArr;
    }

    public final long l() {
        return Math.min(this.f4398z, this.f4397y);
    }

    public final Object[] m(int i10, int i11, Object[] objArr) {
        if (i11 <= 0) {
            throw new IllegalStateException("Buffer size overflow");
        }
        Object[] objArr2 = new Object[i11];
        this.f4396x = objArr2;
        if (objArr != null) {
            long jL = l();
            for (int i12 = 0; i12 < i10; i12++) {
                long j = ((long) i12) + jL;
                q.b(objArr2, j, objArr[((int) j) & (objArr.length - 1)]);
            }
        }
        return objArr2;
    }

    public final boolean n(Object obj) {
        int i10;
        boolean z6;
        p123m8.d[] dVarArrK = R9.b.a;
        synchronized (this) {
            if (o(obj)) {
                dVarArrK = k(dVarArrK);
                z6 = true;
            } else {
                z6 = false;
            }
        }
        for (p123m8.d dVar : dVarArrK) {
            if (dVar != null) {
                dVar.resumeWith(p076h8.m.a);
            }
        }
        return z6;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0039  */
    /* JADX WARN: Code duplicated, block: B:22:0x0043  */
    /* JADX WARN: Code duplicated, block: B:25:0x0054  */
    public final boolean o(Object obj) {
        int i10;
        long jL;
        long j;
        if (this.f4479t == 0) {
            j(obj);
            int i11 = this.f4392A + 1;
            this.f4392A = i11;
            if (i11 > 1) {
                i();
            }
            this.f4398z = l() + ((long) this.f4392A);
            return true;
        }
        int i12 = this.f4392A;
        int i13 = this.f4394v;
        if (i12 < i13 || this.f4398z > this.f4397y) {
            j(obj);
            i10 = this.f4392A + 1;
            this.f4392A = i10;
            if (i10 > i13) {
                i();
            }
            jL = l() + ((long) this.f4392A);
            j = this.f4397y;
            if (((int) (jL - j)) > 1) {
                r(1 + j, this.f4398z, l() + ((long) this.f4392A), l() + ((long) this.f4392A) + ((long) this.f4393B));
            }
        } else {
            int iD = p239z.e.d(this.f4395w);
            if (iD == 0) {
                return false;
            }
            if (iD != 2) {
                j(obj);
                i10 = this.f4392A + 1;
                this.f4392A = i10;
                if (i10 > i13) {
                    i();
                }
                jL = l() + ((long) this.f4392A);
                j = this.f4397y;
                if (((int) (jL - j)) > 1) {
                    r(1 + j, this.f4398z, l() + ((long) this.f4392A), l() + ((long) this.f4392A) + ((long) this.f4393B));
                }
            }
        }
        return true;
    }

    public final long p(r rVar) {
        long j = rVar.a;
        if (j < l() + ((long) this.f4392A)) {
            return j;
        }
        if (this.f4394v <= 0 && j <= l() && this.f4393B != 0) {
            return j;
        }
        return -1L;
    }

    public final Object q(r rVar) {
        Object obj;
        p123m8.d[] dVarArrS = R9.b.a;
        synchronized (this) {
            try {
                long jP = p(rVar);
                if (jP < 0) {
                    obj = q.a;
                } else {
                    long j = rVar.a;
                    Object[] objArr = this.f4396x;
                    p210v8.i.c(objArr);
                    Object obj2 = objArr[((int) jP) & (objArr.length - 1)];
                    if (obj2 instanceof n) {
                        obj2 = ((n) obj2).f4383u;
                    }
                    rVar.a = jP + 1;
                    Object obj3 = obj2;
                    dVarArrS = s(j);
                    obj = obj3;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        for (p123m8.d dVar : dVarArrS) {
            if (dVar != null) {
                dVar.resumeWith(p076h8.m.a);
            }
        }
        return obj;
    }

    public final void r(long j, long j10, long j11, long j12) {
        long jMin = Math.min(j10, j);
        for (long jL = l(); jL < jMin; jL++) {
            Object[] objArr = this.f4396x;
            p210v8.i.c(objArr);
            q.b(objArr, jL, null);
        }
        this.f4397y = j;
        this.f4398z = j10;
        this.f4392A = (int) (j11 - jMin);
        this.f4393B = (int) (j12 - j11);
    }

    public final p123m8.d[] s(long j) {
        int i10;
        long j10;
        int i11;
        p123m8.d[] dVarArr;
        p123m8.d[] dVarArr2;
        long j11;
        R9.c[] cVarArr;
        long j12 = this.f4398z;
        p123m8.d[] dVarArr3 = R9.b.a;
        if (j <= j12) {
            long jL = l();
            long j13 = ((long) this.f4392A) + jL;
            int i12 = this.f4394v;
            if (i12 == 0 && this.f4393B > 0) {
                j13++;
            }
            int i13 = 0;
            if (this.f4479t != 0 && (cVarArr = this.f4478s) != null) {
                for (R9.c cVar : cVarArr) {
                    if (cVar != null) {
                        long j14 = ((r) cVar).a;
                        if (j14 >= 0 && j14 < j13) {
                            j13 = j14;
                        }
                    }
                }
            }
            if (j13 > this.f4398z) {
                long jL2 = l() + ((long) this.f4392A);
                int iMin = this.f4479t > 0 ? Math.min(this.f4393B, i12 - ((int) (jL2 - j13))) : this.f4393B;
                long j15 = ((long) this.f4393B) + jL2;
                y yVar = q.a;
                if (iMin > 0) {
                    p123m8.d[] dVarArr4 = new p123m8.d[iMin];
                    Object[] objArr = this.f4396x;
                    p210v8.i.c(objArr);
                    long j16 = jL2;
                    while (true) {
                        if (jL2 >= j15) {
                            i10 = i12;
                            dVarArr2 = dVarArr4;
                            j10 = jL;
                            j11 = j16;
                            i11 = 1;
                            break;
                        }
                        i11 = 1;
                        i10 = i12;
                        Object obj = objArr[(objArr.length - 1) & ((int) jL2)];
                        if (obj != yVar) {
                            p210v8.i.d(obj, "null cannot be cast to non-null type kotlinx.coroutines.flow.SharedFlowImpl.Emitter");
                            n nVar = (n) obj;
                            int i14 = i13 + 1;
                            dVarArr2 = dVarArr4;
                            dVarArr2[i13] = nVar.f4384v;
                            q.b(objArr, jL2, yVar);
                            j10 = jL;
                            long j17 = j16;
                            q.b(objArr, j17, nVar.f4383u);
                            j11 = j17 + 1;
                            if (i14 >= iMin) {
                                break;
                            }
                            i13 = i14;
                            j16 = j11;
                        } else {
                            dVarArr2 = dVarArr4;
                            j10 = jL;
                        }
                        jL2++;
                        i12 = i10;
                        dVarArr4 = dVarArr2;
                        jL = j10;
                    }
                    jL2 = j11;
                    dVarArr = dVarArr2;
                } else {
                    i10 = i12;
                    j10 = jL;
                    i11 = 1;
                    dVarArr = dVarArr3;
                }
                int i15 = (int) (jL2 - j10);
                long j18 = this.f4479t == 0 ? jL2 : j13;
                long jMax = Math.max(this.f4397y, jL2 - ((long) Math.min(i11, i15)));
                if (i10 == 0 && jMax < j15) {
                    Object[] objArr2 = this.f4396x;
                    p210v8.i.c(objArr2);
                    if (p210v8.i.a(objArr2[((int) jMax) & (objArr2.length - 1)], yVar)) {
                        jL2++;
                        jMax++;
                    }
                }
                r(jMax, j18, jL2, j15);
                g();
                return dVarArr.length == 0 ? dVarArr : k(dVarArr);
            }
        }
        return dVarArr3;
    }
}
