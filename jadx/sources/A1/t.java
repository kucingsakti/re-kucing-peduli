package A1;

import android.os.SystemClock;
import android.util.Log;
import java.util.HashMap;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class t {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final boolean f170h = Log.isLoggable("Engine", 2);
    public final C a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p053f4.e f171b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C1.f f172c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final T3.c f173d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final J f174e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final q f175f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final o1.h f176g;

    public t(C1.f fVar, p040e1.j jVar, D1.e eVar, D1.e eVar2, D1.e eVar3, D1.e eVar4) throws Throwable {
        this.f172c = fVar;
        s sVar = new s(jVar);
        o1.h hVar = new o1.h(1);
        this.f176g = hVar;
        synchronized (this) {
            try {
                synchronized (hVar) {
                    try {
                        try {
                            hVar.f13635v = this;
                        } catch (Throwable th) {
                            th = th;
                            while (true) {
                                try {
                                    throw th;
                                } catch (Throwable th2) {
                                    th = th2;
                                }
                            }
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        throw th;
                    }
                }
                this.f171b = new p053f4.e(1);
                this.a = new C(0);
                this.f173d = new T3.c(eVar, eVar2, eVar3, eVar4, this, this);
                this.f175f = new q(sVar);
                this.f174e = new J();
                fVar.f931d = this;
            } catch (Throwable th4) {
                th = th4;
            }
        }
    }

    public static void f(F f10) {
        if (!(f10 instanceof z)) {
            throw new IllegalArgumentException("Cannot release anything but an EngineResource");
        }
        ((z) f10).e();
    }

    public final C0099h a(com.bumptech.glide.f fVar, Object obj, p232y1.e eVar, int i10, int i11, Class cls, Class cls2, com.bumptech.glide.g gVar, p pVar, U1.c cVar, boolean z6, boolean z10, p232y1.h hVar, boolean z11, boolean z12, Q1.f fVar2, F3.c cVar2) {
        long jElapsedRealtimeNanos;
        if (f170h) {
            int i12 = U1.h.a;
            jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        } else {
            jElapsedRealtimeNanos = 0;
        }
        this.f171b.getClass();
        y yVar = new y(obj, eVar, i10, i11, cVar, cls, cls2, hVar);
        synchronized (this) {
            try {
                z zVarC = c(yVar, z11, jElapsedRealtimeNanos);
                if (zVarC == null) {
                    return g(fVar, obj, eVar, i10, i11, cls, cls2, gVar, pVar, cVar, z6, z10, hVar, z11, z12, fVar2, cVar2, yVar, jElapsedRealtimeNanos);
                }
                fVar2.f(zVarC, 5, false);
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x0046 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final A1.z b(A1.y r10) throws java.lang.Throwable {
        /*
            r9 = this;
            C1.f r1 = r9.f172c
            monitor-enter(r1)
            java.util.LinkedHashMap r0 = r1.a     // Catch: java.lang.Throwable -> L41
            java.lang.Object r0 = r0.remove(r10)     // Catch: java.lang.Throwable -> L41
            U1.i r0 = (U1.i) r0     // Catch: java.lang.Throwable -> L41
            r2 = 0
            if (r0 != 0) goto L11
            monitor-exit(r1)
            r0 = r2
            goto L1c
        L11:
            long r3 = r1.f4876c     // Catch: java.lang.Throwable -> L41
            int r5 = r0.f4874b     // Catch: java.lang.Throwable -> L41
            long r5 = (long) r5     // Catch: java.lang.Throwable -> L41
            long r3 = r3 - r5
            r1.f4876c = r3     // Catch: java.lang.Throwable -> L41
            java.lang.Object r0 = r0.a     // Catch: java.lang.Throwable -> L41
            monitor-exit(r1)
        L1c:
            r4 = r0
            A1.F r4 = (A1.F) r4
            if (r4 != 0) goto L24
        L21:
            r8 = r9
            r7 = r10
            goto L36
        L24:
            boolean r0 = r4 instanceof A1.z
            if (r0 == 0) goto L2c
            r2 = r4
            A1.z r2 = (A1.z) r2
            goto L21
        L2c:
            A1.z r3 = new A1.z
            r5 = 1
            r6 = 1
            r8 = r9
            r7 = r10
            r3.<init>(r4, r5, r6, r7, r8)
            r2 = r3
        L36:
            if (r2 == 0) goto L40
            r2.d()
            o1.h r10 = r8.f176g
            r10.b(r7, r2)
        L40:
            return r2
        L41:
            r0 = move-exception
            r8 = r9
        L43:
            r10 = r0
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L46
            throw r10
        L46:
            r0 = move-exception
            goto L43
        */
        throw new UnsupportedOperationException("Method not decompiled: A1.t.b(A1.y):A1.z");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final z c(y yVar, boolean z6, long j) throws Throwable {
        z zVar;
        if (z6) {
            o1.h hVar = this.f176g;
            synchronized (hVar) {
                C0095d c0095d = (C0095d) ((HashMap) hVar.f13633t).get(yVar);
                if (c0095d == null) {
                    zVar = null;
                } else {
                    zVar = (z) c0095d.get();
                    if (zVar == null) {
                        hVar.d(c0095d);
                    }
                }
            }
            if (zVar != null) {
                zVar.d();
            }
            if (zVar != null) {
                if (f170h) {
                    int i10 = U1.h.a;
                    SystemClock.elapsedRealtimeNanos();
                    Objects.toString(yVar);
                }
                return zVar;
            }
            z zVarB = b(yVar);
            if (zVarB != null) {
                if (f170h) {
                    int i11 = U1.h.a;
                    SystemClock.elapsedRealtimeNanos();
                    Objects.toString(yVar);
                }
                return zVarB;
            }
        }
        return null;
    }

    public final synchronized void d(x xVar, y yVar, z zVar) {
        if (zVar != null) {
            try {
                if (zVar.f213s) {
                    this.f176g.b(yVar, zVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        C c10 = this.a;
        c10.getClass();
        xVar.getClass();
        HashMap map = c10.a;
        if (xVar.equals(map.get(yVar))) {
            map.remove(yVar);
        }
    }

    public final void e(y yVar, z zVar) {
        o1.h hVar = this.f176g;
        synchronized (hVar) {
            C0095d c0095d = (C0095d) ((HashMap) hVar.f13633t).remove(yVar);
            if (c0095d != null) {
                c0095d.f90c = null;
                c0095d.clear();
            }
        }
        if (zVar.f213s) {
        } else {
            this.f174e.m(zVar, false);
        }
    }

    public final C0099h g(com.bumptech.glide.f fVar, Object obj, p232y1.e eVar, int i10, int i11, Class cls, Class cls2, com.bumptech.glide.g gVar, p pVar, U1.c cVar, boolean z6, boolean z10, p232y1.h hVar, boolean z11, boolean z12, Q1.f fVar2, F3.c cVar2, y yVar, long j) {
        x xVar = (x) this.a.a.get(yVar);
        if (xVar != null) {
            xVar.a(fVar2, cVar2);
            if (f170h) {
                int i12 = U1.h.a;
                SystemClock.elapsedRealtimeNanos();
                Objects.toString(yVar);
            }
            return new C0099h(this, fVar2, xVar);
        }
        x xVar2 = (x) ((C0099h) this.f173d.f4662g).b();
        synchronized (xVar2) {
            xVar2.f185C = yVar;
            xVar2.f186D = z11;
            xVar2.f187E = z12;
        }
        q qVar = this.f175f;
        n nVar = (n) ((C0099h) qVar.f165d).b();
        int i13 = qVar.f163b;
        qVar.f163b = i13 + 1;
        C0102k c0102k = nVar.f147s;
        c0102k.f107c = fVar;
        c0102k.f108d = obj;
        c0102k.f117n = eVar;
        c0102k.f109e = i10;
        c0102k.f110f = i11;
        c0102k.f119p = pVar;
        c0102k.f111g = cls;
        c0102k.f112h = nVar.f150v;
        c0102k.f114k = cls2;
        c0102k.f118o = gVar;
        c0102k.f113i = hVar;
        c0102k.j = cVar;
        c0102k.f120q = z6;
        c0102k.f121r = z10;
        nVar.f154z = fVar;
        nVar.f126A = eVar;
        nVar.f127B = gVar;
        nVar.f128C = yVar;
        nVar.f129D = i10;
        nVar.f130E = i11;
        nVar.f131F = pVar;
        nVar.f132G = hVar;
        nVar.f133H = xVar2;
        nVar.f134I = i13;
        nVar.f145U = 1;
        nVar.f135J = obj;
        C c10 = this.a;
        c10.getClass();
        c10.a.put(yVar, xVar2);
        xVar2.a(fVar2, cVar2);
        xVar2.k(nVar);
        if (f170h) {
            int i14 = U1.h.a;
            SystemClock.elapsedRealtimeNanos();
            Objects.toString(yVar);
        }
        return new C0099h(this, fVar2, xVar2);
    }
}
