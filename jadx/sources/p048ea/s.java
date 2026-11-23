package p048ea;

import E0.a;
import O8.C0352h;
import Y9.c;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import ma.f;
import ma.r;
import p086i8.k;
import p210v8.i;

/* JADX INFO: loaded from: classes.dex */
public final class s implements Closeable {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final Logger f11342v;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final r f11343s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final r f11344t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final c f11345u;

    static {
        Logger logger = Logger.getLogger(f.class.getName());
        i.e(logger, "getLogger(Http2::class.java.name)");
        f11342v = logger;
    }

    public s(r rVar) {
        i.f(rVar, "source");
        this.f11343s = rVar;
        r rVar2 = new r(rVar);
        this.f11344t = rVar2;
        this.f11345u = new c(rVar2);
    }

    public final boolean a(boolean z6, C0352h c0352h) throws IOException {
        a aVar;
        int iJ;
        int i10 = 2;
        int i11 = 0;
        try {
            this.f11343s.p(9L);
            int iT = c.t(this.f11343s);
            if (iT > 16384) {
                throw new IOException(i.k(Integer.valueOf(iT), "FRAME_SIZE_ERROR: "));
            }
            int iC = this.f11343s.c() & 255;
            byte bC = this.f11343s.c();
            int i12 = bC & 255;
            int iJ2 = this.f11343s.j();
            int i13 = Integer.MAX_VALUE & iJ2;
            Logger logger = f11342v;
            if (logger.isLoggable(Level.FINE)) {
                logger.fine(f.a(true, i13, iT, iC, i12));
            }
            if (z6 && iC != 4) {
                String[] strArr = f.f11282b;
                throw new IOException(i.k(iC < strArr.length ? strArr[iC] : c.i("0x%02x", Integer.valueOf(iC)), "Expected a SETTINGS frame but was "));
            }
            switch (iC) {
                case 0:
                    b(c0352h, iT, i12, i13);
                    return true;
                case 1:
                    h(c0352h, iT, i12, i13);
                    return true;
                case 2:
                    if (iT != 5) {
                        throw new IOException(a.g("TYPE_PRIORITY length: ", iT, " != 5"));
                    }
                    if (i13 == 0) {
                        throw new IOException("TYPE_PRIORITY streamId == 0");
                    }
                    r rVar = this.f11343s;
                    rVar.j();
                    rVar.c();
                    return true;
                case 3:
                    if (iT != 4) {
                        throw new IOException(a.g("TYPE_RST_STREAM length: ", iT, " != 4"));
                    }
                    if (i13 == 0) {
                        throw new IOException("TYPE_RST_STREAM streamId == 0");
                    }
                    int iJ3 = this.f11343s.j();
                    a[] aVarArrValues = a.values();
                    int length = aVarArrValues.length;
                    while (true) {
                        if (i11 < length) {
                            aVar = aVarArrValues[i11];
                            if (aVar.f11259s != iJ3) {
                                i11++;
                            }
                        } else {
                            aVar = null;
                        }
                    }
                    if (aVar == null) {
                        throw new IOException(i.k(Integer.valueOf(iJ3), "TYPE_RST_STREAM unexpected error code: "));
                    }
                    o oVar = (o) c0352h.f3708u;
                    oVar.getClass();
                    if (i13 == 0 || (iJ2 & 1) != 0) {
                        v vVarH = oVar.h(i13);
                        if (vVarH != null) {
                            vVarH.k(aVar);
                            return true;
                        }
                        return true;
                    }
                    oVar.f11305A.c(new m(oVar.f11323u + '[' + i13 + "] onReset", oVar, i13, aVar), 0L);
                    return true;
                case 4:
                    if (i13 != 0) {
                        throw new IOException("TYPE_SETTINGS streamId != 0");
                    }
                    if ((bC & 1) != 0) {
                        if (iT != 0) {
                            throw new IOException("FRAME_SIZE_ERROR ack frame should be empty!");
                        }
                        return true;
                    }
                    if (iT % 6 != 0) {
                        throw new IOException(i.k(Integer.valueOf(iT), "TYPE_SETTINGS length % 6 != 0: "));
                    }
                    z zVar = new z();
                    B8.a aVarU = p181s3.a.u(p181s3.a.w(0, iT), 6);
                    int i14 = aVarU.f769s;
                    int i15 = aVarU.f770t;
                    int i16 = aVarU.f771u;
                    if ((i16 > 0 && i14 <= i15) || (i16 < 0 && i15 <= i14)) {
                        while (true) {
                            int i17 = i14 + i16;
                            r rVar2 = this.f11343s;
                            short sN = rVar2.n();
                            byte[] bArr = c.a;
                            int i18 = sN & 65535;
                            iJ = rVar2.j();
                            if (i18 != 2) {
                                if (i18 == 3) {
                                    i18 = 4;
                                } else if (i18 == 4) {
                                    if (iJ < 0) {
                                        throw new IOException("PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1");
                                    }
                                    i18 = 7;
                                } else if (i18 == 5 && (iJ < 16384 || iJ > 16777215)) {
                                }
                            } else if (iJ != 0 && iJ != 1) {
                                throw new IOException("PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1");
                            }
                            zVar.c(i18, iJ);
                            if (i14 != i15) {
                                i14 = i17;
                            }
                        }
                        throw new IOException(i.k(Integer.valueOf(iJ), "PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: "));
                    }
                    o oVar2 = (o) c0352h.f3708u;
                    oVar2.f11328z.c(new i(i.k(" applyAndAckSettings", oVar2.f11323u), c0352h, zVar, i10), 0L);
                    return true;
                case 5:
                    j(c0352h, iT, i12, i13);
                    return true;
                case 6:
                    i(c0352h, iT, i12, i13);
                    return true;
                case 7:
                    c(c0352h, iT, i13);
                    return true;
                case 8:
                    if (iT != 4) {
                        throw new IOException(i.k(Integer.valueOf(iT), "TYPE_WINDOW_UPDATE length !=4: "));
                    }
                    long j = ((long) this.f11343s.j()) & 2147483647L;
                    if (j == 0) {
                        throw new IOException("windowSizeIncrement was 0");
                    }
                    if (i13 == 0) {
                        o oVar3 = (o) c0352h.f3708u;
                        synchronized (oVar3) {
                            oVar3.f11317M += j;
                            oVar3.notifyAll();
                        }
                        return true;
                    }
                    v vVarC = ((o) c0352h.f3708u).c(i13);
                    if (vVarC != null) {
                        synchronized (vVarC) {
                            vVarC.f11360f += j;
                            if (j > 0) {
                                vVarC.notifyAll();
                            }
                            break;
                        }
                        return true;
                    }
                    return true;
                default:
                    this.f11343s.t(iT);
                    return true;
            }
        } catch (EOFException unused) {
            return false;
        }
    }

    public final void b(C0352h c0352h, int i10, int i11, int i12) throws IOException {
        int i13;
        boolean z6;
        boolean z10;
        long j;
        if (i12 == 0) {
            throw new IOException("PROTOCOL_ERROR: TYPE_DATA streamId == 0");
        }
        boolean z11 = (i11 & 1) != 0;
        if ((i11 & 32) != 0) {
            throw new IOException("PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA");
        }
        if ((i11 & 8) != 0) {
            byte bC = this.f11343s.c();
            byte[] bArr = c.a;
            i13 = bC & 255;
        } else {
            i13 = 0;
        }
        int iA = q.a(i10, i11, i13);
        r rVar = this.f11343s;
        i.f(rVar, "source");
        ((o) c0352h.f3708u).getClass();
        if (i12 != 0 && (i12 & 1) == 0) {
            o oVar = (o) c0352h.f3708u;
            oVar.getClass();
            f fVar = new f();
            long j10 = iA;
            rVar.p(j10);
            rVar.u(fVar, j10);
            oVar.f11305A.c(new k(oVar.f11323u + '[' + i12 + "] onData", oVar, i12, fVar, iA, z11), 0L);
        } else {
            v vVarC = ((o) c0352h.f3708u).c(i12);
            if (vVarC == null) {
                ((o) c0352h.f3708u).n(i12, a.PROTOCOL_ERROR);
                long j11 = iA;
                ((o) c0352h.f3708u).j(j11);
                rVar.t(j11);
            } else {
                byte[] bArr2 = c.a;
                u uVar = vVarC.f11363i;
                long j12 = iA;
                uVar.getClass();
                while (j12 > 0) {
                    synchronized (uVar.f11355x) {
                        z6 = uVar.f11351t;
                        z10 = uVar.f11353v.f13190t + j12 > uVar.f11350s;
                    }
                    if (z10) {
                        rVar.t(j12);
                        uVar.f11355x.e(a.FLOW_CONTROL_ERROR);
                        break;
                    }
                    if (z6) {
                        rVar.t(j12);
                        break;
                    }
                    long jU = rVar.u(uVar.f11352u, j12);
                    if (jU == -1) {
                        throw new EOFException();
                    }
                    j12 -= jU;
                    v vVar = uVar.f11355x;
                    synchronized (vVar) {
                        try {
                            if (uVar.f11354w) {
                                f fVar2 = uVar.f11352u;
                                j = fVar2.f13190t;
                                fVar2.a();
                            } else {
                                f fVar3 = uVar.f11353v;
                                boolean z12 = fVar3.f13190t == 0;
                                fVar3.c0(uVar.f11352u);
                                if (z12) {
                                    vVar.notifyAll();
                                }
                                j = 0;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    if (j > 0) {
                        uVar.a(j);
                    }
                }
                if (z11) {
                    vVarC.j(c.f5821b, true);
                }
            }
        }
        this.f11343s.t(i13);
    }

    public final void c(C0352h c0352h, int i10, int i11) throws IOException {
        a aVar;
        Object[] array;
        if (i10 < 8) {
            throw new IOException(i.k(Integer.valueOf(i10), "TYPE_GOAWAY length < 8: "));
        }
        if (i11 != 0) {
            throw new IOException("TYPE_GOAWAY streamId != 0");
        }
        int iJ = this.f11343s.j();
        int iJ2 = this.f11343s.j();
        int i12 = i10 - 8;
        a[] aVarArrValues = a.values();
        int length = aVarArrValues.length;
        int i13 = 0;
        int i14 = 0;
        while (true) {
            if (i14 >= length) {
                aVar = null;
                break;
            }
            aVar = aVarArrValues[i14];
            if (aVar.f11259s == iJ2) {
                break;
            } else {
                i14++;
            }
        }
        if (aVar == null) {
            throw new IOException(i.k(Integer.valueOf(iJ2), "TYPE_GOAWAY unexpected error code: "));
        }
        ma.i iVarG = ma.i.f13191v;
        if (i12 > 0) {
            iVarG = this.f11343s.g(i12);
        }
        i.f(iVarG, "debugData");
        iVarG.h();
        o oVar = (o) c0352h.f3708u;
        synchronized (oVar) {
            array = oVar.f11322t.values().toArray(new v[0]);
            if (array == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
            }
            oVar.f11326x = true;
        }
        v[] vVarArr = (v[]) array;
        int length2 = vVarArr.length;
        while (i13 < length2) {
            v vVar = vVarArr[i13];
            i13++;
            if (vVar.a > iJ && vVar.h()) {
                vVar.k(a.REFUSED_STREAM);
                ((o) c0352h.f3708u).h(vVar.a);
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f11343s.close();
    }

    public final List g(int i10, int i11, int i12, int i13) throws IOException {
        r rVar = this.f11344t;
        rVar.f11340w = i10;
        rVar.f11337t = i10;
        rVar.f11341x = i11;
        rVar.f11338u = i12;
        rVar.f11339v = i13;
        while (true) {
            c cVar = this.f11345u;
            r rVar2 = cVar.f11269c;
            boolean zA = rVar2.a();
            ArrayList arrayList = cVar.f11268b;
            if (zA) {
                List listS0 = k.s0(arrayList);
                arrayList.clear();
                return listS0;
            }
            byte bC = rVar2.c();
            byte[] bArr = c.a;
            int i14 = bC & 255;
            if (i14 == 128) {
                throw new IOException("index == 0");
            }
            if ((bC & 128) == 128) {
                int iE = cVar.e(i14, 127);
                int i15 = iE - 1;
                if (i15 >= 0) {
                    b[] bVarArr = e.a;
                    if (i15 <= bVarArr.length - 1) {
                        arrayList.add(bVarArr[i15]);
                    }
                }
                int length = cVar.f11271e + 1 + (i15 - e.a.length);
                if (length >= 0) {
                    b[] bVarArr2 = cVar.f11270d;
                    if (length < bVarArr2.length) {
                        b bVar = bVarArr2[length];
                        i.c(bVar);
                        arrayList.add(bVar);
                    }
                }
                throw new IOException(i.k(Integer.valueOf(iE), "Header index too large "));
            }
            if (i14 == 64) {
                b[] bVarArr3 = e.a;
                ma.i iVarD = cVar.d();
                e.a(iVarD);
                cVar.c(new b(iVarD, cVar.d()));
            } else if ((bC & 64) == 64) {
                cVar.c(new b(cVar.b(cVar.e(i14, 63) - 1), cVar.d()));
            } else if ((bC & 32) == 32) {
                int iE2 = cVar.e(i14, 31);
                cVar.a = iE2;
                if (iE2 < 0 || iE2 > 4096) {
                    throw new IOException(i.k(Integer.valueOf(cVar.a), "Invalid dynamic table size update "));
                }
                int i16 = cVar.f11273g;
                if (iE2 < i16) {
                    if (iE2 == 0) {
                        b[] bVarArr4 = cVar.f11270d;
                        p086i8.i.t(0, bVarArr4.length, bVarArr4);
                        cVar.f11271e = cVar.f11270d.length - 1;
                        cVar.f11272f = 0;
                        cVar.f11273g = 0;
                    } else {
                        cVar.a(i16 - iE2);
                    }
                }
            } else if (i14 == 16 || i14 == 0) {
                b[] bVarArr5 = e.a;
                ma.i iVarD2 = cVar.d();
                e.a(iVarD2);
                arrayList.add(new b(iVarD2, cVar.d()));
            } else {
                arrayList.add(new b(cVar.b(cVar.e(i14, 15) - 1), cVar.d()));
            }
        }
    }

    public final void h(C0352h c0352h, int i10, int i11, int i12) throws IOException {
        int i13;
        int i14 = 1;
        if (i12 == 0) {
            throw new IOException("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0");
        }
        boolean z6 = false;
        boolean z10 = (i11 & 1) != 0;
        if ((i11 & 8) != 0) {
            byte bC = this.f11343s.c();
            byte[] bArr = c.a;
            i13 = bC & 255;
        } else {
            i13 = 0;
        }
        if ((i11 & 32) != 0) {
            r rVar = this.f11343s;
            rVar.j();
            rVar.c();
            byte[] bArr2 = c.a;
            i10 -= 5;
        }
        List listG = g(q.a(i10, i11, i13), i13, i11, i12);
        ((o) c0352h.f3708u).getClass();
        if (i12 != 0 && (i12 & 1) == 0) {
            z6 = true;
        }
        if (z6) {
            o oVar = (o) c0352h.f3708u;
            oVar.getClass();
            oVar.f11305A.c(new l(oVar.f11323u + '[' + i12 + "] onHeaders", oVar, i12, listG, z10), 0L);
            return;
        }
        o oVar2 = (o) c0352h.f3708u;
        synchronized (oVar2) {
            v vVarC = oVar2.c(i12);
            if (vVarC != null) {
                vVarC.j(c.v(listG), z10);
                return;
            }
            if (oVar2.f11326x) {
                return;
            }
            if (i12 <= oVar2.f11324v) {
                return;
            }
            if (i12 % 2 == oVar2.f11325w % 2) {
                return;
            }
            v vVar = new v(i12, oVar2, false, z10, c.v(listG));
            oVar2.f11324v = i12;
            oVar2.f11322t.put(Integer.valueOf(i12), vVar);
            oVar2.f11327y.e().c(new i(oVar2.f11323u + '[' + i12 + "] onStream", oVar2, vVar, i14), 0L);
        }
    }

    public final void i(C0352h c0352h, int i10, int i11, int i12) throws IOException {
        if (i10 != 8) {
            throw new IOException(i.k(Integer.valueOf(i10), "TYPE_PING length != 8: "));
        }
        if (i12 != 0) {
            throw new IOException("TYPE_PING streamId != 0");
        }
        int iJ = this.f11343s.j();
        int iJ2 = this.f11343s.j();
        if ((i11 & 1) == 0) {
            o oVar = (o) c0352h.f3708u;
            oVar.f11328z.c(new j(i.k(" ping", oVar.f11323u), (o) c0352h.f3708u, iJ, iJ2), 0L);
            return;
        }
        o oVar2 = (o) c0352h.f3708u;
        synchronized (oVar2) {
            try {
                if (iJ == 1) {
                    oVar2.f11308D++;
                } else if (iJ == 2) {
                    oVar2.f11310F++;
                } else if (iJ == 3) {
                    oVar2.notifyAll();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void j(C0352h c0352h, int i10, int i11, int i12) throws IOException {
        int i13;
        if (i12 == 0) {
            throw new IOException("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0");
        }
        if ((i11 & 8) != 0) {
            byte bC = this.f11343s.c();
            byte[] bArr = c.a;
            i13 = bC & 255;
        } else {
            i13 = 0;
        }
        int iJ = this.f11343s.j() & Integer.MAX_VALUE;
        List listG = g(q.a(i10 - 4, i11, i13), i13, i11, i12);
        o oVar = (o) c0352h.f3708u;
        oVar.getClass();
        synchronized (oVar) {
            if (oVar.f11320Q.contains(Integer.valueOf(iJ))) {
                oVar.n(iJ, a.PROTOCOL_ERROR);
                return;
            }
            oVar.f11320Q.add(Integer.valueOf(iJ));
            oVar.f11305A.c(new l(oVar.f11323u + '[' + iJ + "] onRequest", oVar, iJ, listG, 1), 0L);
        }
    }
}
