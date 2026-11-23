package A1;

import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.internal.measurement.S;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class K implements InterfaceC0101j, InterfaceC0100i {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final C0102k f77s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final n f78t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public volatile int f79u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public volatile C0097f f80v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public volatile Object f81w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public volatile E1.q f82x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public volatile C0098g f83y;

    public K(C0102k c0102k, n nVar) {
        this.f77s = c0102k;
        this.f78t = nVar;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0017  */
    @Override // A1.InterfaceC0101j
    public final boolean a() {
        boolean z6;
        if (this.f81w == null) {
            if (this.f80v != null) {
            }
            this.f80v = null;
            this.f82x = null;
            z6 = false;
            while (!z6) {
                ArrayList arrayListB = this.f77s.b();
                int i10 = this.f79u;
                this.f79u = i10 + 1;
                this.f82x = (E1.q) arrayListB.get(i10);
                if (this.f82x == null) {
                }
            }
            return z6;
        }
        Object obj = this.f81w;
        this.f81w = null;
        try {
            if (b(obj)) {
                if (this.f80v != null || !this.f80v.a()) {
                    this.f80v = null;
                    this.f82x = null;
                    z6 = false;
                    while (!z6 && this.f79u < this.f77s.b().size()) {
                        ArrayList arrayListB2 = this.f77s.b();
                        int i11 = this.f79u;
                        this.f79u = i11 + 1;
                        this.f82x = (E1.q) arrayListB2.get(i11);
                        if (this.f82x == null && (this.f77s.f119p.a(this.f82x.f1326c.c()) || this.f77s.c(this.f82x.f1326c.a()) != null)) {
                            this.f82x.f1326c.d(this.f77s.f118o, new S(this, 1, this.f82x));
                            z6 = true;
                        }
                    }
                    return z6;
                }
            }
        } catch (IOException unused) {
            Log.isLoggable("SourceGenerator", 3);
        }
        return true;
    }

    public final boolean b(Object obj) throws Throwable {
        Throwable th;
        boolean z6 = false;
        int i10 = U1.h.a;
        SystemClock.elapsedRealtimeNanos();
        try {
            com.bumptech.glide.load.data.g gVarH = this.f77s.f107c.a().h(obj);
            Object objA = gVarH.a();
            p232y1.b bVarD = this.f77s.d(objA);
            C0099h c0099h = new C0099h(bVarD, objA, this.f77s.f113i, 0);
            p232y1.e eVar = this.f82x.a;
            C0102k c0102k = this.f77s;
            C0098g c0098g = new C0098g(eVar, c0102k.f117n);
            C1.a aVarA = c0102k.f112h.a();
            aVarA.d(c0098g, c0099h);
            if (Log.isLoggable("SourceGenerator", 2)) {
                c0098g.toString();
                obj.toString();
                bVarD.toString();
                SystemClock.elapsedRealtimeNanos();
            }
            if (aVarA.a(c0098g) != null) {
                this.f83y = c0098g;
                this.f80v = new C0097f(Collections.singletonList(this.f82x.a), this.f77s, this);
                this.f82x.f1326c.b();
                return true;
            }
            if (Log.isLoggable("SourceGenerator", 3)) {
                Objects.toString(this.f83y);
                obj.toString();
            }
            try {
                this.f78t.f(this.f82x.a, gVarH.a(), this.f82x.f1326c, this.f82x.f1326c.c(), this.f82x.a);
                return false;
            } catch (Throwable th2) {
                th = th2;
                z6 = true;
                if (z6) {
                    throw th;
                }
                this.f82x.f1326c.b();
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    @Override // A1.InterfaceC0101j
    public final void cancel() {
        E1.q qVar = this.f82x;
        if (qVar != null) {
            qVar.f1326c.cancel();
        }
    }

    @Override // A1.InterfaceC0100i
    public final void f(p232y1.e eVar, Object obj, com.bumptech.glide.load.data.e eVar2, int i10, p232y1.e eVar3) {
        this.f78t.f(eVar, obj, eVar2, this.f82x.f1326c.c(), eVar);
    }

    @Override // A1.InterfaceC0100i
    public final void k(p232y1.e eVar, Exception exc, com.bumptech.glide.load.data.e eVar2, int i10) {
        this.f78t.k(eVar, exc, eVar2, this.f82x.f1326c.c());
    }
}
