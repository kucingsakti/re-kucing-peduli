package p071h1;

import C3.a;
import V.h;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.S;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import p050f1.d;
import p050f1.q;
import p061g1.c;
import p061g1.g;
import p061g1.i;
import p061g1.o;
import p140o4.r;
import p147p1.k;

/* JADX INFO: loaded from: classes.dex */
public final class b implements g, k1.b, c {

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public static final String f11645B = q.c("GreedyScheduler");

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public Boolean f11646A;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Context f11647s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final o f11648t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final Y1.c f11649u;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final a f11651w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f11652x;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final HashSet f11650v = new HashSet();

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final S f11654z = new S(14);

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final Object f11653y = new Object();

    public b(Context context, p050f1.b bVar, r rVar, o oVar) {
        this.f11647s = context;
        this.f11648t = oVar;
        this.f11649u = new Y1.c(rVar, this);
        this.f11651w = new a(this, bVar.f11391e);
    }

    @Override // p061g1.g
    public final void a(String str) {
        Runnable runnable;
        Boolean bool = this.f11646A;
        o oVar = this.f11648t;
        if (bool == null) {
            this.f11646A = Boolean.valueOf(k.a(this.f11647s, oVar.f11498b));
        }
        if (!this.f11646A.booleanValue()) {
            q.a().b(f11645B, "Ignoring schedule request in non-main process");
            return;
        }
        if (!this.f11652x) {
            oVar.f11502f.a(this);
            this.f11652x = true;
        }
        q.a().getClass();
        a aVar = this.f11651w;
        if (aVar != null && (runnable = (Runnable) aVar.f11644c.remove(str)) != null) {
            ((Handler) aVar.f11643b.f5078t).removeCallbacks(runnable);
        }
        Iterator it = this.f11654z.w(str).iterator();
        while (it.hasNext()) {
            oVar.g((i) it.next());
        }
    }

    @Override // p061g1.g
    public final void b(o1.o... oVarArr) {
        if (this.f11646A == null) {
            this.f11646A = Boolean.valueOf(k.a(this.f11647s, this.f11648t.f11498b));
        }
        if (!this.f11646A.booleanValue()) {
            q.a().b(f11645B, "Ignoring schedule request in a secondary process");
            return;
        }
        if (!this.f11652x) {
            this.f11648t.f11502f.a(this);
            this.f11652x = true;
        }
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        for (o1.o oVar : oVarArr) {
            if (!this.f11654z.n(a.g(oVar))) {
                long jA = oVar.a();
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (oVar.f13646b == 1) {
                    if (jCurrentTimeMillis < jA) {
                        a aVar = this.f11651w;
                        if (aVar != null) {
                            HashMap map = aVar.f11644c;
                            Runnable runnable = (Runnable) map.remove(oVar.a);
                            h hVar = aVar.f11643b;
                            if (runnable != null) {
                                ((Handler) hVar.f5078t).removeCallbacks(runnable);
                            }
                            P2.g gVar = new P2.g((Object) aVar, (Object) oVar, 9, false);
                            map.put(oVar.a, gVar);
                            ((Handler) hVar.f5078t).postDelayed(gVar, oVar.a() - System.currentTimeMillis());
                        }
                    } else if (oVar.b()) {
                        int i10 = Build.VERSION.SDK_INT;
                        d dVar = oVar.j;
                        if (dVar.f11398c) {
                            q qVarA = q.a();
                            oVar.toString();
                            qVarA.getClass();
                        } else if (i10 < 24 || dVar.f11403h.isEmpty()) {
                            hashSet.add(oVar);
                            hashSet2.add(oVar.a);
                        } else {
                            q qVarA2 = q.a();
                            oVar.toString();
                            qVarA2.getClass();
                        }
                    } else if (!this.f11654z.n(a.g(oVar))) {
                        q.a().getClass();
                        o oVar2 = this.f11648t;
                        S s9 = this.f11654z;
                        s9.getClass();
                        oVar2.f(s9.x(a.g(oVar)), null);
                    }
                }
            }
        }
        synchronized (this.f11653y) {
            try {
                if (!hashSet.isEmpty()) {
                    TextUtils.join(",", hashSet2);
                    q.a().getClass();
                    this.f11650v.addAll(hashSet);
                    this.f11649u.K(this.f11650v);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // k1.b
    public final void c(ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            o1.i iVarG = a.g((o1.o) it.next());
            q qVarA = q.a();
            iVarG.toString();
            qVarA.getClass();
            i iVarV = this.f11654z.v(iVarG);
            if (iVarV != null) {
                this.f11648t.g(iVarV);
            }
        }
    }

    @Override // k1.b
    public final void d(List list) {
        Iterator it = ((ArrayList) list).iterator();
        while (it.hasNext()) {
            o1.i iVarG = a.g((o1.o) it.next());
            S s9 = this.f11654z;
            if (!s9.n(iVarG)) {
                q qVarA = q.a();
                iVarG.toString();
                qVarA.getClass();
                this.f11648t.f(s9.x(iVarG), null);
            }
        }
    }

    @Override // p061g1.g
    public final boolean e() {
        return false;
    }

    @Override // p061g1.c
    public final void f(o1.i iVar, boolean z6) {
        this.f11654z.v(iVar);
        synchronized (this.f11653y) {
            try {
                for (o1.o oVar : this.f11650v) {
                    if (a.g(oVar).equals(iVar)) {
                        q qVarA = q.a();
                        Objects.toString(iVar);
                        qVarA.getClass();
                        this.f11650v.remove(oVar);
                        this.f11649u.K(this.f11650v);
                        break;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
