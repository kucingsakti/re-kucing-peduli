package A1;

import android.os.Build;
import android.os.SystemClock;
import android.util.Log;
import com.bumptech.glide.load.engine.GlideException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class n implements InterfaceC0100i, Runnable, Comparable, V1.b {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public p232y1.e f126A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public com.bumptech.glide.g f127B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public y f128C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public int f129D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public int f130E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public p f131F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public p232y1.h f132G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public x f133H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public int f134I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public Object f135J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public Thread f136K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public p232y1.e f137L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public p232y1.e f138M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public Object f139N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public com.bumptech.glide.load.data.e f140O;
    public volatile InterfaceC0101j P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public volatile boolean f141Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public volatile boolean f142R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public boolean f143S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public int f144T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public int f145U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public int f146V;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final s f150v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final C0099h f151w;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public com.bumptech.glide.f f154z;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final C0102k f147s = new C0102k();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final ArrayList f148t = new ArrayList();

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final V1.e f149u = new V1.e();

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final C0099h f152x = new C0099h(1, false);

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final m f153y = new m();

    public n(s sVar, C0099h c0099h) {
        this.f150v = sVar;
        this.f151w = c0099h;
    }

    public final void A() {
        Throwable th;
        this.f149u.a();
        if (!this.f141Q) {
            this.f141Q = true;
            return;
        }
        if (this.f148t.isEmpty()) {
            th = null;
        } else {
            ArrayList arrayList = this.f148t;
            th = (Throwable) arrayList.get(arrayList.size() - 1);
        }
        throw new IllegalStateException("Already notified", th);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        n nVar = (n) obj;
        int iOrdinal = this.f127B.ordinal() - nVar.f127B.ordinal();
        return iOrdinal == 0 ? this.f134I - nVar.f134I : iOrdinal;
    }

    @Override // A1.InterfaceC0100i
    public final void f(p232y1.e eVar, Object obj, com.bumptech.glide.load.data.e eVar2, int i10, p232y1.e eVar3) {
        this.f137L = eVar;
        this.f139N = obj;
        this.f140O = eVar2;
        this.f146V = i10;
        this.f138M = eVar3;
        this.f143S = eVar != this.f147s.a().get(0);
        if (Thread.currentThread() != this.f136K) {
            x(3);
        } else {
            o();
        }
    }

    @Override // V1.b
    public final V1.e g() {
        return this.f149u;
    }

    @Override // A1.InterfaceC0100i
    public final void k(p232y1.e eVar, Exception exc, com.bumptech.glide.load.data.e eVar2, int i10) {
        eVar2.b();
        GlideException glideException = new GlideException("Fetching data failed", Collections.singletonList(exc));
        Class clsA = eVar2.a();
        glideException.f7666t = eVar;
        glideException.f7667u = i10;
        glideException.f7668v = clsA;
        this.f148t.add(glideException);
        if (Thread.currentThread() != this.f136K) {
            x(2);
        } else {
            y();
        }
    }

    public final F m(com.bumptech.glide.load.data.e eVar, Object obj, int i10) {
        if (obj == null) {
            eVar.b();
            return null;
        }
        try {
            int i11 = U1.h.a;
            SystemClock.elapsedRealtimeNanos();
            F fN = n(i10, obj);
            if (Log.isLoggable("DecodeJob", 2)) {
                fN.toString();
                SystemClock.elapsedRealtimeNanos();
                Objects.toString(this.f128C);
                Thread.currentThread().getName();
            }
            return fN;
        } finally {
            eVar.b();
        }
    }

    public final F n(int i10, Object obj) {
        Class<?> cls = obj.getClass();
        C0102k c0102k = this.f147s;
        D dC = c0102k.c(cls);
        p232y1.h hVar = this.f132G;
        if (Build.VERSION.SDK_INT >= 26) {
            boolean z6 = i10 == 4 || c0102k.f121r;
            p232y1.g gVar = H1.o.f1884i;
            Boolean bool = (Boolean) hVar.c(gVar);
            if (bool == null || (bool.booleanValue() && !z6)) {
                hVar = new p232y1.h();
                p232y1.h hVar2 = this.f132G;
                U1.c cVar = hVar.f16018b;
                cVar.h(hVar2.f16018b);
                cVar.put(gVar, Boolean.valueOf(z6));
            }
        }
        p232y1.h hVar3 = hVar;
        com.bumptech.glide.load.data.g gVarH = this.f154z.a().h(obj);
        try {
            return dC.a(this.f129D, this.f130E, new l(this, i10), gVarH, hVar3);
        } finally {
            gVarH.b();
        }
    }

    public final void o() {
        F fM;
        if (Log.isLoggable("DecodeJob", 2)) {
            String str = "data: " + this.f139N + ", cache key: " + this.f137L + ", fetcher: " + this.f140O;
            int i10 = U1.h.a;
            SystemClock.elapsedRealtimeNanos();
            Objects.toString(this.f128C);
            if (str != null) {
                ", ".concat(str);
            }
            Thread.currentThread().getName();
        }
        E e10 = null;
        try {
            fM = m(this.f140O, this.f139N, this.f146V);
        } catch (GlideException e11) {
            p232y1.e eVar = this.f138M;
            int i11 = this.f146V;
            e11.f7666t = eVar;
            e11.f7667u = i11;
            e11.f7668v = null;
            this.f148t.add(e11);
            fM = null;
        }
        if (fM == null) {
            y();
            return;
        }
        int i12 = this.f146V;
        boolean z6 = this.f143S;
        if (fM instanceof B) {
            ((B) fM).initialize();
        }
        boolean z10 = true;
        if (((E) this.f152x.f105v) != null) {
            e10 = (E) E.f50w.b();
            e10.f54v = false;
            e10.f53u = true;
            e10.f52t = fM;
            fM = e10;
        }
        A();
        x xVar = this.f133H;
        synchronized (xVar) {
            xVar.f188F = fM;
            xVar.f189G = i12;
            xVar.f196N = z6;
        }
        xVar.h();
        this.f144T = 5;
        try {
            C0099h c0099h = this.f152x;
            if (((E) c0099h.f105v) == null) {
                z10 = false;
            }
            if (z10) {
                s sVar = this.f150v;
                p232y1.h hVar = this.f132G;
                c0099h.getClass();
                try {
                    sVar.a().d((p232y1.e) c0099h.f103t, new C0099h((p232y1.k) c0099h.f104u, (E) c0099h.f105v, hVar, 0));
                    ((E) c0099h.f105v).d();
                } catch (Throwable th) {
                    ((E) c0099h.f105v).d();
                    throw th;
                }
            }
            if (e10 != null) {
                e10.d();
            }
            t();
        } catch (Throwable th2) {
            if (e10 != null) {
                e10.d();
            }
            throw th2;
        }
    }

    public final InterfaceC0101j q() {
        int iD = p239z.e.d(this.f144T);
        C0102k c0102k = this.f147s;
        if (iD == 1) {
            return new G(c0102k, this);
        }
        if (iD == 2) {
            return new C0097f(c0102k.a(), c0102k, this);
        }
        if (iD == 3) {
            return new K(c0102k, this);
        }
        if (iD == 5) {
            return null;
        }
        throw new IllegalStateException("Unrecognized stage: ".concat(E0.a.p(this.f144T)));
    }

    public final int r(int i10) {
        boolean z6;
        boolean z10;
        int iD = p239z.e.d(i10);
        if (iD == 0) {
            switch (this.f131F.a) {
                case 0:
                default:
                    z6 = true;
                    break;
                case 1:
                case 2:
                    z6 = false;
                    break;
            }
            if (z6) {
                return 2;
            }
            return r(2);
        }
        if (iD != 1) {
            if (iD == 2) {
                return 4;
            }
            if (iD == 3 || iD == 5) {
                return 6;
            }
            throw new IllegalArgumentException("Unrecognized stage: ".concat(E0.a.p(i10)));
        }
        switch (this.f131F.a) {
            case 0:
            case 2:
            default:
                z10 = true;
                break;
            case 1:
                z10 = false;
                break;
        }
        if (z10) {
            return 3;
        }
        return r(3);
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.bumptech.glide.load.data.e eVar = this.f140O;
        try {
            try {
                try {
                    if (this.f142R) {
                        s();
                        if (eVar != null) {
                            eVar.b();
                            return;
                        }
                        return;
                    }
                    z();
                    if (eVar != null) {
                        eVar.b();
                    }
                } catch (C0096e e10) {
                    throw e10;
                }
            } catch (Throwable th) {
                Log.isLoggable("DecodeJob", 3);
                if (this.f144T != 5) {
                    this.f148t.add(th);
                    s();
                }
                if (!this.f142R) {
                    throw th;
                }
                throw th;
            }
        } catch (Throwable th2) {
            if (eVar != null) {
                eVar.b();
            }
            throw th2;
        }
    }

    public final void s() {
        A();
        GlideException glideException = new GlideException("Failed to load resource", new ArrayList(this.f148t));
        x xVar = this.f133H;
        synchronized (xVar) {
            xVar.f191I = glideException;
        }
        xVar.f();
        u();
    }

    public final void t() {
        boolean zA;
        m mVar = this.f153y;
        synchronized (mVar) {
            mVar.f124b = true;
            zA = mVar.a();
        }
        if (zA) {
            w();
        }
    }

    public final void u() {
        boolean zA;
        m mVar = this.f153y;
        synchronized (mVar) {
            mVar.f125c = true;
            zA = mVar.a();
        }
        if (zA) {
            w();
        }
    }

    public final void v() {
        boolean zA;
        m mVar = this.f153y;
        synchronized (mVar) {
            mVar.a = true;
            zA = mVar.a();
        }
        if (zA) {
            w();
        }
    }

    public final void w() {
        m mVar = this.f153y;
        synchronized (mVar) {
            mVar.f124b = false;
            mVar.a = false;
            mVar.f125c = false;
        }
        C0099h c0099h = this.f152x;
        c0099h.f103t = null;
        c0099h.f104u = null;
        c0099h.f105v = null;
        C0102k c0102k = this.f147s;
        c0102k.f107c = null;
        c0102k.f108d = null;
        c0102k.f117n = null;
        c0102k.f111g = null;
        c0102k.f114k = null;
        c0102k.f113i = null;
        c0102k.f118o = null;
        c0102k.j = null;
        c0102k.f119p = null;
        c0102k.a.clear();
        c0102k.f115l = false;
        c0102k.f106b.clear();
        c0102k.f116m = false;
        this.f141Q = false;
        this.f154z = null;
        this.f126A = null;
        this.f132G = null;
        this.f127B = null;
        this.f128C = null;
        this.f133H = null;
        this.f144T = 0;
        this.P = null;
        this.f136K = null;
        this.f137L = null;
        this.f139N = null;
        this.f146V = 0;
        this.f140O = null;
        this.f142R = false;
        this.f135J = null;
        this.f148t.clear();
        this.f151w.q(this);
    }

    public final void x(int i10) {
        this.f145U = i10;
        x xVar = this.f133H;
        (xVar.f187E ? xVar.f183A : xVar.f204z).execute(this);
    }

    public final void y() {
        this.f136K = Thread.currentThread();
        int i10 = U1.h.a;
        SystemClock.elapsedRealtimeNanos();
        boolean zA = false;
        while (!this.f142R && this.P != null && !(zA = this.P.a())) {
            this.f144T = r(this.f144T);
            this.P = q();
            if (this.f144T == 4) {
                x(2);
                return;
            }
        }
        if ((this.f144T == 6 || this.f142R) && !zA) {
            s();
        }
    }

    public final void z() {
        String str;
        int iD = p239z.e.d(this.f145U);
        if (iD == 0) {
            this.f144T = r(1);
            this.P = q();
            y();
        } else {
            if (iD == 1) {
                y();
                return;
            }
            if (iD == 2) {
                o();
                return;
            }
            int i10 = this.f145U;
            if (i10 == 1) {
                str = "INITIALIZE";
            } else if (i10 != 2) {
                str = i10 != 3 ? "null" : "DECODE_DATA";
            } else {
                str = "SWITCH_TO_SOURCE_SERVICE";
            }
            throw new IllegalStateException("Unrecognized run reason: ".concat(str));
        }
    }
}
