package androidx.recyclerview.widget;

import F8.C0212f;
import J0.C0256f;
import J0.C0257g;
import android.os.Trace;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class m implements Runnable {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final ThreadLocal f7097w = new ThreadLocal();

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final C0212f f7098x = new C0212f(4);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public ArrayList f7099s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public long f7100t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public long f7101u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public ArrayList f7102v;

    public static RecyclerView.a c(RecyclerView recyclerView, int i10, long j) {
        int iH = recyclerView.f6984x.h();
        for (int i11 = 0; i11 < iH; i11++) {
            RecyclerView.a aVarM = RecyclerView.M(recyclerView.f6984x.g(i11));
            if (aVarM.f7005u == i10 && !aVarM.h()) {
                return null;
            }
        }
        A a = recyclerView.f6978u;
        try {
            recyclerView.T();
            RecyclerView.a aVarK = a.k(i10, j);
            if (aVarK != null) {
                if (!aVarK.g() || aVarK.h()) {
                    a.a(aVarK, false);
                } else {
                    a.h(aVarK.f7003s);
                }
            }
            return aVarK;
        } finally {
            recyclerView.U(false);
        }
    }

    public final void a(RecyclerView recyclerView, int i10, int i11) {
        if (recyclerView.f6938K) {
            if (RecyclerView.f6910S0 && !this.f7099s.contains(recyclerView)) {
                throw new IllegalStateException("attempting to post unregistered view!");
            }
            if (this.f7100t == 0) {
                this.f7100t = recyclerView.getNanoTime();
                recyclerView.post(this);
            }
        }
        C0256f c0256f = recyclerView.f6987y0;
        c0256f.a = i10;
        c0256f.f2303b = i11;
    }

    /* JADX WARN: Code duplicated, block: B:46:0x00ca  */
    public final void b(long j) {
        C0257g c0257g;
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        C0257g c0257g2;
        ArrayList arrayList = this.f7099s;
        int size = arrayList.size();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            RecyclerView recyclerView3 = (RecyclerView) arrayList.get(i11);
            if (recyclerView3.getWindowVisibility() == 0) {
                C0256f c0256f = recyclerView3.f6987y0;
                c0256f.d(recyclerView3, false);
                i10 += c0256f.f2304c;
            }
        }
        ArrayList arrayList2 = this.f7102v;
        arrayList2.ensureCapacity(i10);
        int i12 = 0;
        for (int i13 = 0; i13 < size; i13++) {
            RecyclerView recyclerView4 = (RecyclerView) arrayList.get(i13);
            if (recyclerView4.getWindowVisibility() == 0) {
                C0256f c0256f2 = recyclerView4.f6987y0;
                int iAbs = Math.abs(c0256f2.f2303b) + Math.abs(c0256f2.a);
                for (int i14 = 0; i14 < c0256f2.f2304c * 2; i14 += 2) {
                    if (i12 >= arrayList2.size()) {
                        c0257g2 = new C0257g();
                        arrayList2.add(c0257g2);
                    } else {
                        c0257g2 = (C0257g) arrayList2.get(i12);
                    }
                    int[] iArr = (int[]) c0256f2.f2305d;
                    int i15 = iArr[i14 + 1];
                    c0257g2.a = i15 <= iAbs;
                    c0257g2.f2306b = iAbs;
                    c0257g2.f2307c = i15;
                    c0257g2.f2308d = recyclerView4;
                    c0257g2.f2309e = iArr[i14];
                    i12++;
                }
            }
        }
        Collections.sort(arrayList2, f7098x);
        for (int i16 = 0; i16 < arrayList2.size() && (recyclerView = (c0257g = (C0257g) arrayList2.get(i16)).f2308d) != null; i16++) {
            RecyclerView.a aVarC = c(recyclerView, c0257g.f2309e, c0257g.a ? Long.MAX_VALUE : j);
            if (aVarC != null && aVarC.f7004t != null && aVarC.g() && !aVarC.h() && (recyclerView2 = (RecyclerView) aVarC.f7004t.get()) != null) {
                if (recyclerView2.f6956V && recyclerView2.f6984x.h() != 0) {
                    u uVar = recyclerView2.f6963h0;
                    if (uVar != null) {
                        uVar.e();
                    }
                    w wVar = recyclerView2.f6928F;
                    A a = recyclerView2.f6978u;
                    if (wVar != null) {
                        wVar.q0(a);
                        recyclerView2.f6928F.r0(a);
                    }
                    a.a.clear();
                    a.f();
                }
                C0256f c0256f3 = recyclerView2.f6987y0;
                c0256f3.d(recyclerView2, true);
                if (c0256f3.f2304c != 0) {
                    try {
                        int i17 = Q.m.a;
                        Trace.beginSection("RV Nested Prefetch");
                        J0.D d3 = recyclerView2.f6989z0;
                        s sVar = recyclerView2.f6926E;
                        d3.f2226d = 1;
                        d3.f2227e = sVar.a();
                        d3.f2229g = false;
                        d3.f2230h = false;
                        d3.f2231i = false;
                        for (int i18 = 0; i18 < c0256f3.f2304c * 2; i18 += 2) {
                            c(recyclerView2, ((int[]) c0256f3.f2305d)[i18], j);
                        }
                        Trace.endSection();
                    } catch (Throwable th) {
                        int i19 = Q.m.a;
                        Trace.endSection();
                        throw th;
                    }
                }
            }
            c0257g.a = false;
            c0257g.f2306b = 0;
            c0257g.f2307c = 0;
            c0257g.f2308d = null;
            c0257g.f2309e = 0;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            int i10 = Q.m.a;
            Trace.beginSection("RV Prefetch");
            ArrayList arrayList = this.f7099s;
            if (arrayList.isEmpty()) {
                this.f7100t = 0L;
                return;
            }
            int size = arrayList.size();
            long jMax = 0;
            for (int i11 = 0; i11 < size; i11++) {
                RecyclerView recyclerView = (RecyclerView) arrayList.get(i11);
                if (recyclerView.getWindowVisibility() == 0) {
                    jMax = Math.max(recyclerView.getDrawingTime(), jMax);
                }
            }
            if (jMax == 0) {
                this.f7100t = 0L;
            } else {
                b(TimeUnit.MILLISECONDS.toNanos(jMax) + this.f7101u);
                this.f7100t = 0L;
            }
        } finally {
            this.f7100t = 0L;
            int i12 = Q.m.a;
            Trace.endSection();
        }
    }
}
