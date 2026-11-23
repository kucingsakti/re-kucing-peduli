package androidx.fragment.app;

import A0.q;
import A1.C0099h;
import C8.InterfaceC0175c;
import I.C0248l;
import I.K;
import I.L;
import I.M;
import J.j;
import U.InterfaceC0426l;
import android.app.Activity;
import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.e;
import androidx.lifecycle.C0525u;
import androidx.lifecycle.EnumC0519n;
import androidx.lifecycle.InterfaceC0523s;
import androidx.lifecycle.V;
import androidx.lifecycle.W;
import com.kcstream.cing.R;
import com.unity3d.services.core.request.metrics.AdOperationMetric;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.ListIterator;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import p031d.u;
import p031d.w;
import p031d.x;
import p078i.AbstractActivityC0655l;
import p140o4.r;
import p156q0.A;
import p156q0.B;
import p156q0.C;
import p156q0.C0742a;
import p156q0.C0752k;
import p156q0.C0760t;
import p156q0.C0763w;
import p156q0.D;
import p156q0.E;
import p156q0.F;
import p156q0.G;
import p156q0.H;
import p156q0.I;
import p156q0.J;
import p156q0.N;
import p156q0.O;
import p156q0.P;
import p156q0.S;
import p156q0.U;
import p156q0.y;
import p204v1.g;
import p210v8.i;

/* JADX INFO: loaded from: classes.dex */
public abstract class e {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final F f6661A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final g f6662B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public p049f.d f6663C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public p049f.d f6664D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public p049f.d f6665E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public ArrayDeque f6666F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public boolean f6667G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public boolean f6668H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public boolean f6669I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public boolean f6670J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public boolean f6671K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public ArrayList f6672L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public ArrayList f6673M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public ArrayList f6674N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public N f6675O;
    public final p122m7.d P;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f6676b;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ArrayList f6679e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public x f6681g;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final ArrayList f6687n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final o1.e f6688o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final CopyOnWriteArrayList f6689p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final C f6690q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final C f6691r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final C f6692s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final C f6693t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final E f6694u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f6695v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public C0763w f6696w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public y f6697x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public b f6698y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public b f6699z;
    public final ArrayList a = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final r f6677c = new r(9);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ArrayList f6678d = new ArrayList();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final A f6680f = new A(this);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public C0742a f6682h = null;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f6683i = false;
    public final D j = new D(this, 0);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final AtomicInteger f6684k = new AtomicInteger();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Map f6685l = Collections.synchronizedMap(new HashMap());

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Map f6686m = Collections.synchronizedMap(new HashMap());

    /* JADX WARN: Type inference failed for: r0v16, types: [q0.C] */
    /* JADX WARN: Type inference failed for: r0v17, types: [q0.C] */
    /* JADX WARN: Type inference failed for: r0v18, types: [q0.C] */
    /* JADX WARN: Type inference failed for: r0v19, types: [q0.C] */
    public e() {
        final int i10 = 0;
        Collections.synchronizedMap(new HashMap());
        this.f6687n = new ArrayList();
        this.f6688o = new o1.e(this);
        this.f6689p = new CopyOnWriteArrayList();
        this.f6690q = new T.a(this) { // from class: q0.C

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e f14253b;

            {
                this.f14253b = this;
            }

            @Override // T.a
            public final void accept(Object obj) {
                switch (i10) {
                    case 0:
                        e eVar = this.f14253b;
                        if (eVar.M()) {
                            eVar.i(false);
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        e eVar2 = this.f14253b;
                        if (eVar2.M() && num.intValue() == 80) {
                            eVar2.m(false);
                            break;
                        }
                        break;
                    case 2:
                        C0248l c0248l = (C0248l) obj;
                        e eVar3 = this.f14253b;
                        if (eVar3.M()) {
                            boolean z6 = c0248l.a;
                            eVar3.n(false);
                        }
                        break;
                    default:
                        M m2 = (M) obj;
                        e eVar4 = this.f14253b;
                        if (eVar4.M()) {
                            boolean z10 = m2.a;
                            eVar4.s(false);
                        }
                        break;
                }
            }
        };
        final int i11 = 1;
        this.f6691r = new T.a(this) { // from class: q0.C

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e f14253b;

            {
                this.f14253b = this;
            }

            @Override // T.a
            public final void accept(Object obj) {
                switch (i11) {
                    case 0:
                        e eVar = this.f14253b;
                        if (eVar.M()) {
                            eVar.i(false);
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        e eVar2 = this.f14253b;
                        if (eVar2.M() && num.intValue() == 80) {
                            eVar2.m(false);
                            break;
                        }
                        break;
                    case 2:
                        C0248l c0248l = (C0248l) obj;
                        e eVar3 = this.f14253b;
                        if (eVar3.M()) {
                            boolean z6 = c0248l.a;
                            eVar3.n(false);
                        }
                        break;
                    default:
                        M m2 = (M) obj;
                        e eVar4 = this.f14253b;
                        if (eVar4.M()) {
                            boolean z10 = m2.a;
                            eVar4.s(false);
                        }
                        break;
                }
            }
        };
        final int i12 = 2;
        this.f6692s = new T.a(this) { // from class: q0.C

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e f14253b;

            {
                this.f14253b = this;
            }

            @Override // T.a
            public final void accept(Object obj) {
                switch (i12) {
                    case 0:
                        e eVar = this.f14253b;
                        if (eVar.M()) {
                            eVar.i(false);
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        e eVar2 = this.f14253b;
                        if (eVar2.M() && num.intValue() == 80) {
                            eVar2.m(false);
                            break;
                        }
                        break;
                    case 2:
                        C0248l c0248l = (C0248l) obj;
                        e eVar3 = this.f14253b;
                        if (eVar3.M()) {
                            boolean z6 = c0248l.a;
                            eVar3.n(false);
                        }
                        break;
                    default:
                        M m2 = (M) obj;
                        e eVar4 = this.f14253b;
                        if (eVar4.M()) {
                            boolean z10 = m2.a;
                            eVar4.s(false);
                        }
                        break;
                }
            }
        };
        final int i13 = 3;
        this.f6693t = new T.a(this) { // from class: q0.C

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e f14253b;

            {
                this.f14253b = this;
            }

            @Override // T.a
            public final void accept(Object obj) {
                switch (i13) {
                    case 0:
                        e eVar = this.f14253b;
                        if (eVar.M()) {
                            eVar.i(false);
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        e eVar2 = this.f14253b;
                        if (eVar2.M() && num.intValue() == 80) {
                            eVar2.m(false);
                            break;
                        }
                        break;
                    case 2:
                        C0248l c0248l = (C0248l) obj;
                        e eVar3 = this.f14253b;
                        if (eVar3.M()) {
                            boolean z6 = c0248l.a;
                            eVar3.n(false);
                        }
                        break;
                    default:
                        M m2 = (M) obj;
                        e eVar4 = this.f14253b;
                        if (eVar4.M()) {
                            boolean z10 = m2.a;
                            eVar4.s(false);
                        }
                        break;
                }
            }
        };
        this.f6694u = new E(this);
        this.f6695v = -1;
        this.f6661A = new F(this);
        this.f6662B = new g(25);
        this.f6666F = new ArrayDeque();
        this.P = new p122m7.d(this, 6);
    }

    public static HashSet G(C0742a c0742a) {
        HashSet hashSet = new HashSet();
        for (int i10 = 0; i10 < c0742a.a.size(); i10++) {
            b bVar = ((P) c0742a.a.get(i10)).f14269b;
            if (bVar != null && c0742a.f14299g) {
                hashSet.add(bVar);
            }
        }
        return hashSet;
    }

    public static boolean K(int i10) {
        return Log.isLoggable("FragmentManager", i10);
    }

    public static boolean L(b bVar) {
        if (bVar.f6632Y && bVar.f6633Z) {
            return true;
        }
        boolean zL = false;
        for (b bVar2 : bVar.P.f6677c.k()) {
            if (bVar2 != null) {
                zL = L(bVar2);
            }
            if (zL) {
                return true;
            }
        }
        return false;
    }

    public static boolean N(b bVar) {
        if (bVar == null) {
            return true;
        }
        if (bVar.f6633Z) {
            return bVar.f6622N == null || N(bVar.f6624Q);
        }
        return false;
    }

    public static boolean O(b bVar) {
        if (bVar == null) {
            return true;
        }
        e eVar = bVar.f6622N;
        return bVar.equals(eVar.f6699z) && O(eVar.f6698y);
    }

    public final void A(C0742a c0742a, boolean z6) {
        if (z6 && (this.f6696w == null || this.f6670J)) {
            return;
        }
        y(z6);
        C0742a c0742a2 = this.f6682h;
        if (c0742a2 != null) {
            c0742a2.f14310s = false;
            c0742a2.e();
            if (K(3)) {
                Objects.toString(this.f6682h);
                Objects.toString(c0742a);
            }
            this.f6682h.g(false, false);
            this.f6682h.a(this.f6672L, this.f6673M);
            Iterator it = this.f6682h.a.iterator();
            while (it.hasNext()) {
                b bVar = ((P) it.next()).f14269b;
                if (bVar != null) {
                    bVar.f6614F = false;
                }
            }
            this.f6682h = null;
        }
        c0742a.a(this.f6672L, this.f6673M);
        this.f6676b = true;
        try {
            W(this.f6672L, this.f6673M);
            d();
            h0();
            if (this.f6671K) {
                this.f6671K = false;
                e0();
            }
            ((HashMap) this.f6677c.f13783u).values().removeAll(Collections.singleton(null));
        } catch (Throwable th) {
            d();
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:114:0x022c A[PHI: r14
      0x022c: PHI (r14v14 int) = (r14v13 int), (r14v15 int) binds: [B:107:0x021c, B:112:0x0228] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:66:0x0175  */
    public final void B(ArrayList arrayList, ArrayList arrayList2, int i10, int i11) {
        Object objPrevious;
        int i12;
        boolean z6;
        int i13;
        boolean z10;
        int i14;
        int i15;
        int i16 = i10;
        boolean z11 = ((C0742a) arrayList.get(i16)).f14307p;
        ArrayList arrayList3 = this.f6674N;
        if (arrayList3 == null) {
            this.f6674N = new ArrayList();
        } else {
            arrayList3.clear();
        }
        ArrayList arrayList4 = this.f6674N;
        r rVar = this.f6677c;
        arrayList4.addAll(rVar.m());
        b bVar = this.f6699z;
        int i17 = i16;
        boolean z12 = false;
        while (true) {
            int i18 = 1;
            if (i17 >= i11) {
                boolean z13 = z11;
                boolean z14 = z12;
                this.f6674N.clear();
                if (!z13 && this.f6695v >= 1) {
                    for (int i19 = i16; i19 < i11; i19++) {
                        Iterator it = ((C0742a) arrayList.get(i19)).a.iterator();
                        while (it.hasNext()) {
                            b bVar2 = ((P) it.next()).f14269b;
                            if (bVar2 != null && bVar2.f6622N != null) {
                                rVar.x(g(bVar2));
                            }
                        }
                    }
                }
                int i20 = i16;
                while (i20 < i11) {
                    C0742a c0742a = (C0742a) arrayList.get(i20);
                    if (((Boolean) arrayList2.get(i20)).booleanValue()) {
                        c0742a.d(-1);
                        ArrayList arrayList5 = c0742a.a;
                        for (int size = arrayList5.size() - 1; size >= 0; size--) {
                            P p10 = (P) arrayList5.get(size);
                            b bVar3 = p10.f14269b;
                            if (bVar3 != null) {
                                bVar3.f6615G = c0742a.f14312u;
                                if (bVar3.f0 != null) {
                                    bVar3.j().a = true;
                                }
                                int i21 = c0742a.f14298f;
                                int i22 = 8194;
                                int i23 = 4097;
                                if (i21 != 4097) {
                                    if (i21 != 8194) {
                                        i22 = 4100;
                                        i23 = 8197;
                                        if (i21 != 8197) {
                                            if (i21 == 4099) {
                                                i22 = 4099;
                                            } else if (i21 != 4100) {
                                                i22 = 0;
                                            } else {
                                                i22 = i23;
                                            }
                                        }
                                    } else {
                                        i22 = i23;
                                    }
                                }
                                if (bVar3.f0 != null || i22 != 0) {
                                    bVar3.j();
                                    bVar3.f0.f14362f = i22;
                                }
                                bVar3.j();
                                bVar3.f0.getClass();
                            }
                            int i24 = p10.a;
                            e eVar = c0742a.f14309r;
                            switch (i24) {
                                case 1:
                                    bVar3.a0(p10.f14271d, p10.f14272e, p10.f14273f, p10.f14274g);
                                    eVar.a0(bVar3, true);
                                    eVar.V(bVar3);
                                    break;
                                case 2:
                                default:
                                    throw new IllegalArgumentException("Unknown cmd: " + p10.a);
                                case 3:
                                    bVar3.a0(p10.f14271d, p10.f14272e, p10.f14273f, p10.f14274g);
                                    eVar.a(bVar3);
                                    break;
                                case 4:
                                    bVar3.a0(p10.f14271d, p10.f14272e, p10.f14273f, p10.f14274g);
                                    eVar.getClass();
                                    if (K(2)) {
                                        Objects.toString(bVar3);
                                    }
                                    if (bVar3.f6628U) {
                                        bVar3.f6628U = false;
                                        bVar3.f6638g0 = !bVar3.f6638g0;
                                    }
                                    break;
                                case 5:
                                    bVar3.a0(p10.f14271d, p10.f14272e, p10.f14273f, p10.f14274g);
                                    eVar.a0(bVar3, true);
                                    if (K(2)) {
                                        Objects.toString(bVar3);
                                    }
                                    if (!bVar3.f6628U) {
                                        bVar3.f6628U = true;
                                        bVar3.f6638g0 = !bVar3.f6638g0;
                                        eVar.d0(bVar3);
                                    }
                                    break;
                                case 6:
                                    bVar3.a0(p10.f14271d, p10.f14272e, p10.f14273f, p10.f14274g);
                                    eVar.c(bVar3);
                                    break;
                                case 7:
                                    bVar3.a0(p10.f14271d, p10.f14272e, p10.f14273f, p10.f14274g);
                                    eVar.a0(bVar3, true);
                                    eVar.h(bVar3);
                                    break;
                                case 8:
                                    eVar.c0(null);
                                    break;
                                case 9:
                                    eVar.c0(bVar3);
                                    break;
                                case 10:
                                    eVar.b0(bVar3, p10.f14275h);
                                    break;
                            }
                        }
                    } else {
                        c0742a.d(1);
                        ArrayList arrayList6 = c0742a.a;
                        int size2 = arrayList6.size();
                        int i25 = 0;
                        while (i25 < size2) {
                            P p11 = (P) arrayList6.get(i25);
                            b bVar4 = p11.f14269b;
                            if (bVar4 != null) {
                                bVar4.f6615G = c0742a.f14312u;
                                if (bVar4.f0 != null) {
                                    bVar4.j().a = false;
                                }
                                int i26 = c0742a.f14298f;
                                if (bVar4.f0 != null || i26 != 0) {
                                    bVar4.j();
                                    bVar4.f0.f14362f = i26;
                                }
                                bVar4.j();
                                bVar4.f0.getClass();
                            }
                            int i27 = p11.a;
                            e eVar2 = c0742a.f14309r;
                            switch (i27) {
                                case 1:
                                    i12 = i20;
                                    bVar4.a0(p11.f14271d, p11.f14272e, p11.f14273f, p11.f14274g);
                                    eVar2.a0(bVar4, false);
                                    eVar2.a(bVar4);
                                    i25++;
                                    i20 = i12;
                                    break;
                                case 2:
                                default:
                                    throw new IllegalArgumentException("Unknown cmd: " + p11.a);
                                case 3:
                                    i12 = i20;
                                    bVar4.a0(p11.f14271d, p11.f14272e, p11.f14273f, p11.f14274g);
                                    eVar2.V(bVar4);
                                    i25++;
                                    i20 = i12;
                                    break;
                                case 4:
                                    i12 = i20;
                                    bVar4.a0(p11.f14271d, p11.f14272e, p11.f14273f, p11.f14274g);
                                    eVar2.getClass();
                                    if (K(2)) {
                                        Objects.toString(bVar4);
                                    }
                                    if (!bVar4.f6628U) {
                                        bVar4.f6628U = true;
                                        bVar4.f6638g0 = !bVar4.f6638g0;
                                        eVar2.d0(bVar4);
                                    }
                                    i25++;
                                    i20 = i12;
                                    break;
                                case 5:
                                    i12 = i20;
                                    bVar4.a0(p11.f14271d, p11.f14272e, p11.f14273f, p11.f14274g);
                                    eVar2.a0(bVar4, false);
                                    if (K(2)) {
                                        Objects.toString(bVar4);
                                    }
                                    if (bVar4.f6628U) {
                                        bVar4.f6628U = false;
                                        bVar4.f6638g0 = !bVar4.f6638g0;
                                    }
                                    i25++;
                                    i20 = i12;
                                    break;
                                case 6:
                                    i12 = i20;
                                    bVar4.a0(p11.f14271d, p11.f14272e, p11.f14273f, p11.f14274g);
                                    eVar2.h(bVar4);
                                    i25++;
                                    i20 = i12;
                                    break;
                                case 7:
                                    i12 = i20;
                                    bVar4.a0(p11.f14271d, p11.f14272e, p11.f14273f, p11.f14274g);
                                    eVar2.a0(bVar4, false);
                                    eVar2.c(bVar4);
                                    i25++;
                                    i20 = i12;
                                    break;
                                case 8:
                                    eVar2.c0(bVar4);
                                    i12 = i20;
                                    i25++;
                                    i20 = i12;
                                    break;
                                case 9:
                                    eVar2.c0(null);
                                    i12 = i20;
                                    i25++;
                                    i20 = i12;
                                    break;
                                case 10:
                                    eVar2.b0(bVar4, p11.f14276i);
                                    i12 = i20;
                                    i25++;
                                    i20 = i12;
                                    break;
                            }
                        }
                    }
                    i20++;
                }
                boolean zBooleanValue = ((Boolean) arrayList2.get(i11 - 1)).booleanValue();
                ArrayList<I> arrayList7 = this.f6687n;
                if (z14 && !arrayList7.isEmpty()) {
                    LinkedHashSet linkedHashSet = new LinkedHashSet();
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        linkedHashSet.addAll(G((C0742a) it2.next()));
                    }
                    if (this.f6682h == null) {
                        for (I i28 : arrayList7) {
                            Iterator it3 = linkedHashSet.iterator();
                            while (it3.hasNext()) {
                                i28.c((b) it3.next(), zBooleanValue);
                            }
                        }
                        for (I i29 : arrayList7) {
                            Iterator it4 = linkedHashSet.iterator();
                            while (it4.hasNext()) {
                                i29.a((b) it4.next(), zBooleanValue);
                            }
                        }
                    }
                }
                for (int i30 = i16; i30 < i11; i30++) {
                    C0742a c0742a2 = (C0742a) arrayList.get(i30);
                    if (zBooleanValue) {
                        for (int size3 = c0742a2.a.size() - 1; size3 >= 0; size3--) {
                            b bVar5 = ((P) c0742a2.a.get(size3)).f14269b;
                            if (bVar5 != null) {
                                g(bVar5).k();
                            }
                        }
                    } else {
                        Iterator it5 = c0742a2.a.iterator();
                        while (it5.hasNext()) {
                            b bVar6 = ((P) it5.next()).f14269b;
                            if (bVar6 != null) {
                                g(bVar6).k();
                            }
                        }
                    }
                }
                Q(this.f6695v, true);
                for (C0752k c0752k : f(arrayList, i16, i11)) {
                    c0752k.f14332e = zBooleanValue;
                    synchronized (c0752k.f14329b) {
                        try {
                            c0752k.l();
                            ArrayList arrayList8 = c0752k.f14329b;
                            ListIterator listIterator = arrayList8.listIterator(arrayList8.size());
                            while (true) {
                                if (listIterator.hasPrevious()) {
                                    objPrevious = listIterator.previous();
                                    U u3 = (U) objPrevious;
                                    View view = u3.f14285c.c0;
                                    i.e(view, "operation.fragment.mView");
                                    char c10 = 4;
                                    if (view.getAlpha() != 0.0f || view.getVisibility() != 0) {
                                        int visibility = view.getVisibility();
                                        if (visibility == 0) {
                                            c10 = 2;
                                        } else if (visibility != 4) {
                                            if (visibility != 8) {
                                                throw new IllegalArgumentException("Unknown visibility " + visibility);
                                            }
                                            c10 = 3;
                                        }
                                    }
                                    if (u3.a != 2 || c10 == 2) {
                                    }
                                } else {
                                    objPrevious = null;
                                }
                            }
                            c0752k.f14333f = false;
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    c0752k.e();
                }
                while (i16 < i11) {
                    C0742a c0742a3 = (C0742a) arrayList.get(i16);
                    if (((Boolean) arrayList2.get(i16)).booleanValue() && c0742a3.f14311t >= 0) {
                        c0742a3.f14311t = -1;
                    }
                    if (c0742a3.f14308q != null) {
                        for (int i31 = 0; i31 < c0742a3.f14308q.size(); i31++) {
                            ((Runnable) c0742a3.f14308q.get(i31)).run();
                        }
                        c0742a3.f14308q = null;
                    }
                    i16++;
                }
                if (z14) {
                    for (int i32 = 0; i32 < arrayList7.size(); i32++) {
                        ((I) arrayList7.get(i32)).b();
                    }
                    return;
                }
                return;
            }
            C0742a c0742a4 = (C0742a) arrayList.get(i17);
            if (((Boolean) arrayList2.get(i17)).booleanValue()) {
                z6 = z11;
                i13 = i17;
                z10 = z12;
                int i33 = 1;
                ArrayList arrayList9 = this.f6674N;
                ArrayList arrayList10 = c0742a4.a;
                int size4 = arrayList10.size() - 1;
                while (size4 >= 0) {
                    P p12 = (P) arrayList10.get(size4);
                    int i34 = p12.a;
                    if (i34 != i33) {
                        if (i34 != 3) {
                            switch (i34) {
                                case 6:
                                    arrayList9.add(p12.f14269b);
                                    break;
                                case 8:
                                    bVar = null;
                                    break;
                                case 9:
                                    bVar = p12.f14269b;
                                    break;
                                case 10:
                                    p12.f14276i = p12.f14275h;
                                    break;
                            }
                        } else {
                            arrayList9.add(p12.f14269b);
                        }
                        size4--;
                        i33 = 1;
                    }
                    arrayList9.remove(p12.f14269b);
                    size4--;
                    i33 = 1;
                }
            } else {
                ArrayList arrayList11 = this.f6674N;
                int i35 = 0;
                while (true) {
                    ArrayList arrayList12 = c0742a4.a;
                    if (i35 < arrayList12.size()) {
                        P p13 = (P) arrayList12.get(i35);
                        boolean z15 = z11;
                        int i36 = p13.a;
                        if (i36 != i18) {
                            if (i36 != 2) {
                                if (i36 == 3 || i36 == 6) {
                                    i17 = i17;
                                    arrayList11.remove(p13.f14269b);
                                    b bVar7 = p13.f14269b;
                                    if (bVar7 == bVar) {
                                        arrayList12.add(i35, new P(9, bVar7));
                                        i35++;
                                        bVar = null;
                                    }
                                    i14 = 1;
                                } else if (i36 == 7) {
                                    i14 = 1;
                                } else if (i36 != 8) {
                                    i17 = i17;
                                } else {
                                    i17 = i17;
                                    arrayList12.add(i35, new P(9, bVar, 0));
                                    p13.f14270c = true;
                                    i35++;
                                    bVar = p13.f14269b;
                                }
                                i14 = 1;
                            } else {
                                i17 = i17;
                                b bVar8 = p13.f14269b;
                                int i37 = bVar8.f6626S;
                                int size5 = arrayList11.size() - 1;
                                boolean z16 = false;
                                while (size5 >= 0) {
                                    boolean z17 = z12;
                                    b bVar9 = (b) arrayList11.get(size5);
                                    int i38 = size5;
                                    if (bVar9.f6626S != i37) {
                                        i37 = i37;
                                    } else if (bVar9 == bVar8) {
                                        i37 = i37;
                                        z16 = true;
                                    } else {
                                        if (bVar9 == bVar) {
                                            i15 = 0;
                                            arrayList12.add(i35, new P(9, bVar9, 0));
                                            i35++;
                                            bVar = null;
                                        } else {
                                            i15 = 0;
                                        }
                                        P p14 = new P(3, bVar9, i15);
                                        p14.f14271d = p13.f14271d;
                                        p14.f14273f = p13.f14273f;
                                        p14.f14272e = p13.f14272e;
                                        p14.f14274g = p13.f14274g;
                                        arrayList12.add(i35, p14);
                                        arrayList11.remove(bVar9);
                                        i35++;
                                        bVar = bVar;
                                    }
                                    size5 = i38 - 1;
                                    i37 = i37;
                                    z12 = z17;
                                }
                                z12 = z12;
                                i14 = 1;
                                if (z16) {
                                    arrayList12.remove(i35);
                                    i35--;
                                } else {
                                    p13.a = 1;
                                    p13.f14270c = true;
                                    arrayList11.add(bVar8);
                                }
                            }
                            i35 += i14;
                            i18 = i14;
                            z11 = z15;
                            i17 = i17;
                            z12 = z12;
                        } else {
                            i14 = i18;
                        }
                        z12 = z12;
                        arrayList11.add(p13.f14269b);
                        i35 += i14;
                        i18 = i14;
                        z11 = z15;
                        i17 = i17;
                        z12 = z12;
                    } else {
                        z6 = z11;
                        i13 = i17;
                        z10 = z12;
                    }
                }
            }
            z12 = z10 || c0742a4.f14299g;
            i17 = i13 + 1;
            z11 = z6;
        }
    }

    public final int C(String str, boolean z6, int i10) {
        if (this.f6678d.isEmpty()) {
            return -1;
        }
        if (str == null && i10 < 0) {
            if (z6) {
                return 0;
            }
            return this.f6678d.size() - 1;
        }
        int size = this.f6678d.size() - 1;
        while (size >= 0) {
            C0742a c0742a = (C0742a) this.f6678d.get(size);
            if ((str != null && str.equals(c0742a.f14301i)) || (i10 >= 0 && i10 == c0742a.f14311t)) {
                break;
            }
            size--;
        }
        if (size < 0) {
            return size;
        }
        if (!z6) {
            if (size == this.f6678d.size() - 1) {
                return -1;
            }
            return size + 1;
        }
        while (size > 0) {
            C0742a c0742a2 = (C0742a) this.f6678d.get(size - 1);
            if ((str == null || !str.equals(c0742a2.f14301i)) && (i10 < 0 || i10 != c0742a2.f14311t)) {
                break;
            }
            size--;
        }
        return size;
    }

    public final b D(int i10) {
        r rVar = this.f6677c;
        ArrayList arrayList = (ArrayList) rVar.f13782t;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            b bVar = (b) arrayList.get(size);
            if (bVar != null && bVar.f6625R == i10) {
                return bVar;
            }
        }
        for (f fVar : ((HashMap) rVar.f13783u).values()) {
            if (fVar != null) {
                b bVar2 = fVar.f6701c;
                if (bVar2.f6625R == i10) {
                    return bVar2;
                }
            }
        }
        return null;
    }

    public final b E(String str) {
        r rVar = this.f6677c;
        if (str != null) {
            ArrayList arrayList = (ArrayList) rVar.f13782t;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                b bVar = (b) arrayList.get(size);
                if (bVar != null && str.equals(bVar.f6627T)) {
                    return bVar;
                }
            }
        }
        if (str == null) {
            rVar.getClass();
            return null;
        }
        for (f fVar : ((HashMap) rVar.f13783u).values()) {
            if (fVar != null) {
                b bVar2 = fVar.f6701c;
                if (str.equals(bVar2.f6627T)) {
                    return bVar2;
                }
            }
        }
        return null;
    }

    public final void F() {
        for (C0752k c0752k : e()) {
            if (c0752k.f14333f) {
                K(2);
                c0752k.f14333f = false;
                c0752k.e();
            }
        }
    }

    public final ViewGroup H(b bVar) {
        ViewGroup viewGroup = bVar.f6635b0;
        if (viewGroup != null) {
            return viewGroup;
        }
        if (bVar.f6626S <= 0 || !this.f6697x.d()) {
            return null;
        }
        View viewC = this.f6697x.c(bVar.f6626S);
        if (viewC instanceof ViewGroup) {
            return (ViewGroup) viewC;
        }
        return null;
    }

    public final F I() {
        b bVar = this.f6698y;
        return bVar != null ? bVar.f6622N.I() : this.f6661A;
    }

    public final g J() {
        b bVar = this.f6698y;
        return bVar != null ? bVar.f6622N.J() : this.f6662B;
    }

    public final boolean M() {
        b bVar = this.f6698y;
        if (bVar == null) {
            return true;
        }
        return bVar.v() && this.f6698y.p().M();
    }

    public final boolean P() {
        return this.f6668H || this.f6669I;
    }

    public final void Q(int i10, boolean z6) {
        HashMap map;
        C0763w c0763w;
        if (this.f6696w == null && i10 != -1) {
            throw new IllegalStateException("No activity");
        }
        if (z6 || i10 != this.f6695v) {
            this.f6695v = i10;
            r rVar = this.f6677c;
            Iterator it = ((ArrayList) rVar.f13782t).iterator();
            while (true) {
                boolean zHasNext = it.hasNext();
                map = (HashMap) rVar.f13783u;
                if (!zHasNext) {
                    break;
                }
                f fVar = (f) map.get(((b) it.next()).f6655x);
                if (fVar != null) {
                    fVar.k();
                }
            }
            for (f fVar2 : map.values()) {
                if (fVar2 != null) {
                    fVar2.k();
                    b bVar = fVar2.f6701c;
                    if (bVar.f6613E && !bVar.x()) {
                        if (bVar.f6615G && !((HashMap) rVar.f13784v).containsKey(bVar.f6655x)) {
                            rVar.A(bVar.f6655x, fVar2.o());
                        }
                        rVar.y(fVar2);
                    }
                }
            }
            e0();
            if (this.f6667G && (c0763w = this.f6696w) != null && this.f6695v == 7) {
                c0763w.f14372w.invalidateOptionsMenu();
                this.f6667G = false;
            }
        }
    }

    public final void R() {
        if (this.f6696w == null) {
            return;
        }
        this.f6668H = false;
        this.f6669I = false;
        this.f6675O.f14268g = false;
        for (b bVar : this.f6677c.m()) {
            if (bVar != null) {
                bVar.P.R();
            }
        }
    }

    public final boolean S() {
        return T(-1, 0);
    }

    public final boolean T(int i10, int i11) {
        z(false);
        y(true);
        b bVar = this.f6699z;
        if (bVar != null && i10 < 0 && bVar.l().S()) {
            return true;
        }
        boolean zU = U(this.f6672L, this.f6673M, null, i10, i11);
        if (zU) {
            this.f6676b = true;
            try {
                W(this.f6672L, this.f6673M);
                d();
            } catch (Throwable th) {
                d();
                throw th;
            }
        }
        h0();
        if (this.f6671K) {
            this.f6671K = false;
            e0();
        }
        ((HashMap) this.f6677c.f13783u).values().removeAll(Collections.singleton(null));
        return zU;
    }

    public final boolean U(ArrayList arrayList, ArrayList arrayList2, String str, int i10, int i11) {
        int iC = C(str, (i11 & 1) != 0, i10);
        if (iC < 0) {
            return false;
        }
        for (int size = this.f6678d.size() - 1; size >= iC; size--) {
            arrayList.add((C0742a) this.f6678d.remove(size));
            arrayList2.add(Boolean.TRUE);
        }
        return true;
    }

    public final void V(b bVar) {
        if (K(2)) {
            Objects.toString(bVar);
        }
        boolean zX = bVar.x();
        if (bVar.f6629V && zX) {
            return;
        }
        r rVar = this.f6677c;
        synchronized (((ArrayList) rVar.f13782t)) {
            ((ArrayList) rVar.f13782t).remove(bVar);
        }
        bVar.f6612D = false;
        if (L(bVar)) {
            this.f6667G = true;
        }
        bVar.f6613E = true;
        d0(bVar);
    }

    public final void W(ArrayList arrayList, ArrayList arrayList2) {
        if (arrayList.isEmpty()) {
            return;
        }
        if (arrayList.size() != arrayList2.size()) {
            throw new IllegalStateException("Internal error with the back stack records");
        }
        int size = arrayList.size();
        int i10 = 0;
        int i11 = 0;
        while (i10 < size) {
            if (!((C0742a) arrayList.get(i10)).f14307p) {
                if (i11 != i10) {
                    B(arrayList, arrayList2, i11, i10);
                }
                i11 = i10 + 1;
                if (((Boolean) arrayList2.get(i10)).booleanValue()) {
                    while (i11 < size && ((Boolean) arrayList2.get(i11)).booleanValue() && !((C0742a) arrayList.get(i11)).f14307p) {
                        i11++;
                    }
                }
                B(arrayList, arrayList2, i10, i11);
                i10 = i11 - 1;
            }
            i10++;
        }
        if (i11 != size) {
            B(arrayList, arrayList2, i11, size);
        }
    }

    public final void X(Bundle bundle) {
        o1.e eVar;
        f fVar;
        Bundle bundle2;
        Bundle bundle3;
        for (String str : bundle.keySet()) {
            if (str.startsWith("result_") && (bundle3 = bundle.getBundle(str)) != null) {
                bundle3.setClassLoader(this.f6696w.f14369t.getClassLoader());
                this.f6686m.put(str.substring(7), bundle3);
            }
        }
        HashMap map = new HashMap();
        for (String str2 : bundle.keySet()) {
            if (str2.startsWith("fragment_") && (bundle2 = bundle.getBundle(str2)) != null) {
                bundle2.setClassLoader(this.f6696w.f14369t.getClassLoader());
                map.put(str2.substring(9), bundle2);
            }
        }
        r rVar = this.f6677c;
        HashMap map2 = (HashMap) rVar.f13784v;
        map2.clear();
        map2.putAll(map);
        FragmentManagerState fragmentManagerState = (FragmentManagerState) bundle.getParcelable(AdOperationMetric.INIT_STATE);
        if (fragmentManagerState == null) {
            return;
        }
        HashMap map3 = (HashMap) rVar.f13783u;
        map3.clear();
        Iterator it = fragmentManagerState.f6585s.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            eVar = this.f6688o;
            if (!zHasNext) {
                break;
            }
            Bundle bundleA = rVar.A((String) it.next(), null);
            if (bundleA != null) {
                b bVar = (b) this.f6675O.f14263b.get(((FragmentState) bundleA.getParcelable(AdOperationMetric.INIT_STATE)).f6601t);
                if (bVar != null) {
                    if (K(2)) {
                        bVar.toString();
                    }
                    fVar = new f(eVar, rVar, bVar, bundleA);
                } else {
                    fVar = new f(this.f6688o, this.f6677c, this.f6696w.f14369t.getClassLoader(), I(), bundleA);
                }
                b bVar2 = fVar.f6701c;
                bVar2.f6651t = bundleA;
                bVar2.f6622N = this;
                if (K(2)) {
                    bVar2.toString();
                }
                fVar.m(this.f6696w.f14369t.getClassLoader());
                rVar.x(fVar);
                fVar.f6703e = this.f6695v;
            }
        }
        N n10 = this.f6675O;
        n10.getClass();
        for (b bVar3 : new ArrayList(n10.f14263b.values())) {
            if (map3.get(bVar3.f6655x) == null) {
                if (K(2)) {
                    bVar3.toString();
                    Objects.toString(fragmentManagerState.f6585s);
                }
                this.f6675O.f(bVar3);
                bVar3.f6622N = this;
                f fVar2 = new f(eVar, rVar, bVar3);
                fVar2.f6703e = 1;
                fVar2.k();
                bVar3.f6613E = true;
                fVar2.k();
            }
        }
        ArrayList<String> arrayList = fragmentManagerState.f6586t;
        ((ArrayList) rVar.f13782t).clear();
        if (arrayList != null) {
            for (String str3 : arrayList) {
                b bVarG = rVar.g(str3);
                if (bVarG == null) {
                    throw new IllegalStateException(E0.a.i("No instantiated fragment for (", str3, ")"));
                }
                if (K(2)) {
                    bVarG.toString();
                }
                rVar.b(bVarG);
            }
        }
        if (fragmentManagerState.f6587u != null) {
            this.f6678d = new ArrayList(fragmentManagerState.f6587u.length);
            int i10 = 0;
            while (true) {
                BackStackRecordState[] backStackRecordStateArr = fragmentManagerState.f6587u;
                if (i10 >= backStackRecordStateArr.length) {
                    break;
                }
                BackStackRecordState backStackRecordState = backStackRecordStateArr[i10];
                backStackRecordState.getClass();
                C0742a c0742a = new C0742a(this);
                backStackRecordState.a(c0742a);
                c0742a.f14311t = backStackRecordState.f6574y;
                int i11 = 0;
                while (true) {
                    ArrayList arrayList2 = backStackRecordState.f6569t;
                    if (i11 >= arrayList2.size()) {
                        break;
                    }
                    String str4 = (String) arrayList2.get(i11);
                    if (str4 != null) {
                        ((P) c0742a.a.get(i11)).f14269b = rVar.g(str4);
                    }
                    i11++;
                }
                c0742a.d(1);
                if (K(2)) {
                    c0742a.toString();
                    PrintWriter printWriter = new PrintWriter(new S());
                    c0742a.k("  ", printWriter, false);
                    printWriter.close();
                }
                this.f6678d.add(c0742a);
                i10++;
            }
        } else {
            this.f6678d = new ArrayList();
        }
        this.f6684k.set(fragmentManagerState.f6588v);
        String str5 = fragmentManagerState.f6589w;
        if (str5 != null) {
            b bVarG2 = rVar.g(str5);
            this.f6699z = bVarG2;
            r(bVarG2);
        }
        ArrayList arrayList3 = fragmentManagerState.f6590x;
        if (arrayList3 != null) {
            for (int i12 = 0; i12 < arrayList3.size(); i12++) {
                this.f6685l.put((String) arrayList3.get(i12), (BackStackState) fragmentManagerState.f6591y.get(i12));
            }
        }
        this.f6666F = new ArrayDeque(fragmentManagerState.f6592z);
    }

    public final Bundle Y() {
        ArrayList arrayList;
        BackStackRecordState[] backStackRecordStateArr;
        Bundle bundle = new Bundle();
        F();
        w();
        z(true);
        this.f6668H = true;
        this.f6675O.f14268g = true;
        r rVar = this.f6677c;
        rVar.getClass();
        HashMap map = (HashMap) rVar.f13783u;
        ArrayList arrayList2 = new ArrayList(map.size());
        for (f fVar : map.values()) {
            if (fVar != null) {
                b bVar = fVar.f6701c;
                rVar.A(bVar.f6655x, fVar.o());
                arrayList2.add(bVar.f6655x);
                if (K(2)) {
                    bVar.toString();
                    Objects.toString(bVar.f6651t);
                }
            }
        }
        HashMap map2 = (HashMap) this.f6677c.f13784v;
        if (map2.isEmpty()) {
            K(2);
            return bundle;
        }
        r rVar2 = this.f6677c;
        synchronized (((ArrayList) rVar2.f13782t)) {
            try {
                if (((ArrayList) rVar2.f13782t).isEmpty()) {
                    arrayList = null;
                } else {
                    arrayList = new ArrayList(((ArrayList) rVar2.f13782t).size());
                    for (b bVar2 : (ArrayList) rVar2.f13782t) {
                        arrayList.add(bVar2.f6655x);
                        if (K(2)) {
                            bVar2.toString();
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        int size = this.f6678d.size();
        if (size > 0) {
            backStackRecordStateArr = new BackStackRecordState[size];
            for (int i10 = 0; i10 < size; i10++) {
                backStackRecordStateArr[i10] = new BackStackRecordState((C0742a) this.f6678d.get(i10));
                if (K(2)) {
                    Objects.toString(this.f6678d.get(i10));
                }
            }
        } else {
            backStackRecordStateArr = null;
        }
        FragmentManagerState fragmentManagerState = new FragmentManagerState();
        fragmentManagerState.f6589w = null;
        ArrayList arrayList3 = new ArrayList();
        fragmentManagerState.f6590x = arrayList3;
        ArrayList arrayList4 = new ArrayList();
        fragmentManagerState.f6591y = arrayList4;
        fragmentManagerState.f6585s = arrayList2;
        fragmentManagerState.f6586t = arrayList;
        fragmentManagerState.f6587u = backStackRecordStateArr;
        fragmentManagerState.f6588v = this.f6684k.get();
        b bVar3 = this.f6699z;
        if (bVar3 != null) {
            fragmentManagerState.f6589w = bVar3.f6655x;
        }
        arrayList3.addAll(this.f6685l.keySet());
        arrayList4.addAll(this.f6685l.values());
        fragmentManagerState.f6592z = new ArrayList(this.f6666F);
        bundle.putParcelable(AdOperationMetric.INIT_STATE, fragmentManagerState);
        for (String str : this.f6686m.keySet()) {
            bundle.putBundle(E0.a.h("result_", str), (Bundle) this.f6686m.get(str));
        }
        for (String str2 : map2.keySet()) {
            bundle.putBundle(E0.a.h("fragment_", str2), (Bundle) map2.get(str2));
        }
        return bundle;
    }

    public final void Z() {
        synchronized (this.a) {
            try {
                if (this.a.size() == 1) {
                    this.f6696w.f14370u.removeCallbacks(this.P);
                    this.f6696w.f14370u.post(this.P);
                    h0();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final f a(b bVar) {
        String str = bVar.f6641j0;
        if (str != null) {
            p167r0.c.c(bVar, str);
        }
        if (K(2)) {
            bVar.toString();
        }
        f fVarG = g(bVar);
        bVar.f6622N = this;
        r rVar = this.f6677c;
        rVar.x(fVarG);
        if (!bVar.f6629V) {
            rVar.b(bVar);
            bVar.f6613E = false;
            if (bVar.c0 == null) {
                bVar.f6638g0 = false;
            }
            if (L(bVar)) {
                this.f6667G = true;
            }
        }
        return fVarG;
    }

    public final void a0(b bVar, boolean z6) {
        ViewGroup viewGroupH = H(bVar);
        if (viewGroupH == null || !(viewGroupH instanceof FragmentContainerView)) {
            return;
        }
        ((FragmentContainerView) viewGroupH).setDrawDisappearingViewsLast(!z6);
    }

    public final void b(C0763w c0763w, y yVar, b bVar) {
        if (this.f6696w != null) {
            throw new IllegalStateException("Already attached");
        }
        this.f6696w = c0763w;
        this.f6697x = yVar;
        this.f6698y = bVar;
        CopyOnWriteArrayList copyOnWriteArrayList = this.f6689p;
        if (bVar != null) {
            copyOnWriteArrayList.add(new G(bVar));
        } else if (c0763w instanceof O) {
            copyOnWriteArrayList.add(c0763w);
        }
        if (this.f6698y != null) {
            h0();
        }
        if (c0763w instanceof p031d.y) {
            x xVarJ = c0763w.f14372w.j();
            this.f6681g = xVarJ;
            InterfaceC0523s interfaceC0523s = bVar != null ? bVar : c0763w;
            xVarJ.getClass();
            D d3 = this.j;
            i.f(d3, "onBackPressedCallback");
            C0525u c0525uG = interfaceC0523s.g();
            if (c0525uG.f6763c != EnumC0519n.f6755s) {
                d3.f14254b.add(new u(xVarJ, c0525uG, d3));
                xVarJ.c();
                d3.f14255c = new w(0, xVarJ, x.class, "updateEnabledCallbacks", "updateEnabledCallbacks()V", 0, 0);
            }
        }
        if (bVar != null) {
            N n10 = bVar.f6622N.f6675O;
            HashMap map = n10.f14264c;
            N n11 = (N) map.get(bVar.f6655x);
            if (n11 == null) {
                n11 = new N(n10.f14266e);
                map.put(bVar.f6655x, n11);
            }
            this.f6675O = n11;
        } else if (c0763w instanceof W) {
            V vE = c0763w.f14372w.e();
            p230x9.d dVar = N.f14262h;
            i.f(vE, "store");
            u0.a aVar = u0.a.f15287t;
            i.f(aVar, "defaultCreationExtras");
            Y1.c cVar = new Y1.c(vE, dVar, aVar);
            InterfaceC0175c interfaceC0175cR = p068ga.d.r(N.class);
            String strS = interfaceC0175cR.s();
            if (strS == null) {
                throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
            }
            this.f6675O = (N) cVar.A("androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strS), interfaceC0175cR);
        } else {
            this.f6675O = new N(false);
        }
        this.f6675O.f14268g = P();
        this.f6677c.f13785w = this.f6675O;
        C0763w c0763w2 = this.f6696w;
        if ((c0763w2 instanceof N0.f) && bVar == null) {
            N0.e eVarA = c0763w2.a();
            eVarA.f("android:support:fragments", new q(this, 3));
            Bundle bundleC = eVarA.c("android:support:fragments");
            if (bundleC != null) {
                X(bundleC);
            }
        }
        C0763w c0763w3 = this.f6696w;
        if (c0763w3 instanceof p049f.g) {
            AbstractActivityC0655l abstractActivityC0655l = c0763w3.f14372w;
            String strH = E0.a.h("FragmentManager:", bVar != null ? E0.a.l(new StringBuilder(), bVar.f6655x, ":") : "");
            String strC = p231y.a.c(strH, "StartActivityForResult");
            p059g.a aVar2 = new p059g.a(2);
            c cVar2 = new c(this, 1);
            p031d.g gVar = abstractActivityC0655l.f10458B;
            this.f6663C = gVar.c(strC, aVar2, cVar2);
            this.f6664D = gVar.c(p231y.a.c(strH, "StartIntentSenderForResult"), new p059g.a(3), new c(this, 2));
            this.f6665E = gVar.c(p231y.a.c(strH, "RequestPermissions"), new p059g.a(0), new c(this, 0));
        }
        C0763w c0763w4 = this.f6696w;
        if (c0763w4 instanceof J.i) {
            c0763w4.f14372w.h(this.f6690q);
        }
        C0763w c0763w5 = this.f6696w;
        if (c0763w5 instanceof j) {
            c0763w5.f14372w.f10460D.add(this.f6691r);
        }
        C0763w c0763w6 = this.f6696w;
        if (c0763w6 instanceof K) {
            c0763w6.f14372w.f10462F.add(this.f6692s);
        }
        C0763w c0763w7 = this.f6696w;
        if (c0763w7 instanceof L) {
            c0763w7.f14372w.f10463G.add(this.f6693t);
        }
        C0763w c0763w8 = this.f6696w;
        if ((c0763w8 instanceof InterfaceC0426l) && bVar == null) {
            AbstractActivityC0655l abstractActivityC0655l2 = c0763w8.f14372w;
            E e10 = this.f6694u;
            C0099h c0099h = abstractActivityC0655l2.f10467u;
            ((CopyOnWriteArrayList) c0099h.f104u).add(e10);
            ((Runnable) c0099h.f103t).run();
        }
    }

    public final void b0(b bVar, EnumC0519n enumC0519n) {
        if (bVar.equals(this.f6677c.g(bVar.f6655x)) && (bVar.f6623O == null || bVar.f6622N == this)) {
            bVar.f6642k0 = enumC0519n;
            return;
        }
        throw new IllegalArgumentException("Fragment " + bVar + " is not an active fragment of FragmentManager " + this);
    }

    public final void c(b bVar) {
        if (K(2)) {
            Objects.toString(bVar);
        }
        if (bVar.f6629V) {
            bVar.f6629V = false;
            if (bVar.f6612D) {
                return;
            }
            this.f6677c.b(bVar);
            if (K(2)) {
                bVar.toString();
            }
            if (L(bVar)) {
                this.f6667G = true;
            }
        }
    }

    public final void c0(b bVar) {
        if (bVar != null) {
            if (!bVar.equals(this.f6677c.g(bVar.f6655x)) || (bVar.f6623O != null && bVar.f6622N != this)) {
                throw new IllegalArgumentException("Fragment " + bVar + " is not an active fragment of FragmentManager " + this);
            }
        }
        b bVar2 = this.f6699z;
        this.f6699z = bVar;
        r(bVar2);
        r(this.f6699z);
    }

    public final void d() {
        this.f6676b = false;
        this.f6673M.clear();
        this.f6672L.clear();
    }

    public final void d0(b bVar) {
        ViewGroup viewGroupH = H(bVar);
        if (viewGroupH != null) {
            C0760t c0760t = bVar.f0;
            if ((c0760t == null ? 0 : c0760t.f14361e) + (c0760t == null ? 0 : c0760t.f14360d) + (c0760t == null ? 0 : c0760t.f14359c) + (c0760t == null ? 0 : c0760t.f14358b) > 0) {
                if (viewGroupH.getTag(R.id.visible_removing_fragment_view_tag) == null) {
                    viewGroupH.setTag(R.id.visible_removing_fragment_view_tag, bVar);
                }
                b bVar2 = (b) viewGroupH.getTag(R.id.visible_removing_fragment_view_tag);
                C0760t c0760t2 = bVar.f0;
                boolean z6 = c0760t2 != null ? c0760t2.a : false;
                if (bVar2.f0 == null) {
                    return;
                }
                bVar2.j().a = z6;
            }
        }
    }

    public final HashSet e() {
        C0752k c0752k;
        HashSet hashSet = new HashSet();
        Iterator it = this.f6677c.j().iterator();
        while (it.hasNext()) {
            ViewGroup viewGroup = ((f) it.next()).f6701c.f6635b0;
            if (viewGroup != null) {
                i.f(J(), "factory");
                Object tag = viewGroup.getTag(R.id.special_effects_controller_view_tag);
                if (tag instanceof C0752k) {
                    c0752k = (C0752k) tag;
                } else {
                    c0752k = new C0752k(viewGroup);
                    viewGroup.setTag(R.id.special_effects_controller_view_tag, c0752k);
                }
                hashSet.add(c0752k);
            }
        }
        return hashSet;
    }

    public final void e0() {
        for (f fVar : this.f6677c.j()) {
            b bVar = fVar.f6701c;
            if (bVar.f6636d0) {
                if (this.f6676b) {
                    this.f6671K = true;
                } else {
                    bVar.f6636d0 = false;
                    fVar.k();
                }
            }
        }
    }

    public final HashSet f(ArrayList arrayList, int i10, int i11) {
        ViewGroup viewGroup;
        HashSet hashSet = new HashSet();
        while (i10 < i11) {
            Iterator it = ((C0742a) arrayList.get(i10)).a.iterator();
            while (it.hasNext()) {
                b bVar = ((P) it.next()).f14269b;
                if (bVar != null && (viewGroup = bVar.f6635b0) != null) {
                    hashSet.add(C0752k.i(viewGroup, this));
                }
            }
            i10++;
        }
        return hashSet;
    }

    public final void f0(RuntimeException runtimeException) {
        runtimeException.getMessage();
        PrintWriter printWriter = new PrintWriter(new S());
        C0763w c0763w = this.f6696w;
        try {
            if (c0763w != null) {
                c0763w.f14372w.dump("  ", null, printWriter, new String[0]);
            } else {
                v("  ", null, printWriter, new String[0]);
            }
            throw runtimeException;
        } catch (Exception unused) {
            throw runtimeException;
        }
    }

    public final f g(b bVar) {
        String str = bVar.f6655x;
        r rVar = this.f6677c;
        f fVar = (f) ((HashMap) rVar.f13783u).get(str);
        if (fVar != null) {
            return fVar;
        }
        f fVar2 = new f(this.f6688o, rVar, bVar);
        fVar2.m(this.f6696w.f14369t.getClassLoader());
        fVar2.f6703e = this.f6695v;
        return fVar2;
    }

    public final void g0(H h10) {
        o1.e eVar = this.f6688o;
        eVar.getClass();
        synchronized (((CopyOnWriteArrayList) eVar.f13628u)) {
            int size = ((CopyOnWriteArrayList) eVar.f13628u).size();
            for (int i10 = 0; i10 < size; i10++) {
                if (((B) ((CopyOnWriteArrayList) eVar.f13628u).get(i10)).a == h10) {
                    ((CopyOnWriteArrayList) eVar.f13628u).remove(i10);
                    break;
                }
            }
        }
    }

    public final void h(b bVar) {
        if (K(2)) {
            Objects.toString(bVar);
        }
        if (bVar.f6629V) {
            return;
        }
        bVar.f6629V = true;
        if (bVar.f6612D) {
            if (K(2)) {
                bVar.toString();
            }
            r rVar = this.f6677c;
            synchronized (((ArrayList) rVar.f13782t)) {
                ((ArrayList) rVar.f13782t).remove(bVar);
            }
            bVar.f6612D = false;
            if (L(bVar)) {
                this.f6667G = true;
            }
            d0(bVar);
        }
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [u8.a, v8.h] */
    /* JADX WARN: Type inference failed for: r1v8, types: [u8.a, v8.h] */
    public final void h0() {
        synchronized (this.a) {
            try {
                if (!this.a.isEmpty()) {
                    D d3 = this.j;
                    d3.a = true;
                    ?? r10 = d3.f14255c;
                    if (r10 != 0) {
                        r10.invoke();
                    }
                    if (K(3)) {
                        toString();
                    }
                    return;
                }
                boolean z6 = this.f6678d.size() + (this.f6682h != null ? 1 : 0) > 0 && O(this.f6698y);
                if (K(3)) {
                    toString();
                }
                D d8 = this.j;
                d8.a = z6;
                ?? r11 = d8.f14255c;
                if (r11 != 0) {
                    r11.invoke();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void i(boolean z6) {
        if (z6 && (this.f6696w instanceof J.i)) {
            f0(new IllegalStateException("Do not call dispatchConfigurationChanged() on host. Host implements OnConfigurationChangedProvider and automatically dispatches configuration changes to fragments."));
            throw null;
        }
        for (b bVar : this.f6677c.m()) {
            if (bVar != null) {
                bVar.f6634a0 = true;
                if (z6) {
                    bVar.P.i(true);
                }
            }
        }
    }

    public final boolean j() {
        if (this.f6695v >= 1) {
            for (b bVar : this.f6677c.m()) {
                if (bVar != null) {
                    if (!bVar.f6628U ? bVar.P.j() : false) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final boolean k(Menu menu, MenuInflater menuInflater) {
        boolean zK;
        boolean z6;
        if (this.f6695v < 1) {
            return false;
        }
        ArrayList arrayList = null;
        boolean z10 = false;
        for (b bVar : this.f6677c.m()) {
            if (bVar != null && N(bVar)) {
                if (bVar.f6628U) {
                    zK = false;
                } else {
                    if (bVar.f6632Y && bVar.f6633Z) {
                        bVar.D(menu, menuInflater);
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    zK = z6 | bVar.P.k(menu, menuInflater);
                }
                if (zK) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(bVar);
                    z10 = true;
                }
            }
        }
        if (this.f6679e != null) {
            for (int i10 = 0; i10 < this.f6679e.size(); i10++) {
                b bVar2 = (b) this.f6679e.get(i10);
                if (arrayList == null || !arrayList.contains(bVar2)) {
                    bVar2.getClass();
                }
            }
        }
        this.f6679e = arrayList;
        return z10;
    }

    public final void l() {
        boolean zIsChangingConfigurations = true;
        this.f6670J = true;
        z(true);
        w();
        C0763w c0763w = this.f6696w;
        boolean z6 = c0763w instanceof W;
        r rVar = this.f6677c;
        if (z6) {
            zIsChangingConfigurations = ((N) rVar.f13785w).f14267f;
        } else {
            AbstractActivityC0655l abstractActivityC0655l = c0763w.f14369t;
            if (abstractActivityC0655l instanceof Activity) {
                zIsChangingConfigurations = true ^ abstractActivityC0655l.isChangingConfigurations();
            }
        }
        if (zIsChangingConfigurations) {
            Iterator it = this.f6685l.values().iterator();
            while (it.hasNext()) {
                for (String str : ((BackStackState) it.next()).f6576s) {
                    N n10 = (N) rVar.f13785w;
                    n10.getClass();
                    K(3);
                    n10.e(str, false);
                }
            }
        }
        u(-1);
        C0763w c0763w2 = this.f6696w;
        if (c0763w2 instanceof j) {
            AbstractActivityC0655l abstractActivityC0655l2 = c0763w2.f14372w;
            abstractActivityC0655l2.f10460D.remove(this.f6691r);
        }
        C0763w c0763w3 = this.f6696w;
        if (c0763w3 instanceof J.i) {
            AbstractActivityC0655l abstractActivityC0655l3 = c0763w3.f14372w;
            abstractActivityC0655l3.f10459C.remove(this.f6690q);
        }
        C0763w c0763w4 = this.f6696w;
        if (c0763w4 instanceof K) {
            AbstractActivityC0655l abstractActivityC0655l4 = c0763w4.f14372w;
            abstractActivityC0655l4.f10462F.remove(this.f6692s);
        }
        C0763w c0763w5 = this.f6696w;
        if (c0763w5 instanceof L) {
            AbstractActivityC0655l abstractActivityC0655l5 = c0763w5.f14372w;
            abstractActivityC0655l5.f10463G.remove(this.f6693t);
        }
        C0763w c0763w6 = this.f6696w;
        if ((c0763w6 instanceof InterfaceC0426l) && this.f6698y == null) {
            AbstractActivityC0655l abstractActivityC0655l6 = c0763w6.f14372w;
            E e10 = this.f6694u;
            C0099h c0099h = abstractActivityC0655l6.f10467u;
            ((CopyOnWriteArrayList) c0099h.f104u).remove(e10);
            if (((HashMap) c0099h.f105v).remove(e10) != null) {
                throw new ClassCastException();
            }
            ((Runnable) c0099h.f103t).run();
        }
        this.f6696w = null;
        this.f6697x = null;
        this.f6698y = null;
        if (this.f6681g != null) {
            Iterator it2 = this.j.f14254b.iterator();
            while (it2.hasNext()) {
                ((p031d.c) it2.next()).cancel();
            }
            this.f6681g = null;
        }
        p049f.d dVar = this.f6663C;
        if (dVar != null) {
            dVar.b();
            this.f6664D.b();
            this.f6665E.b();
        }
    }

    public final void m(boolean z6) {
        if (z6 && (this.f6696w instanceof j)) {
            f0(new IllegalStateException("Do not call dispatchLowMemory() on host. Host implements OnTrimMemoryProvider and automatically dispatches low memory callbacks to fragments."));
            throw null;
        }
        for (b bVar : this.f6677c.m()) {
            if (bVar != null) {
                bVar.f6634a0 = true;
                if (z6) {
                    bVar.P.m(true);
                }
            }
        }
    }

    public final void n(boolean z6) {
        if (z6 && (this.f6696w instanceof K)) {
            f0(new IllegalStateException("Do not call dispatchMultiWindowModeChanged() on host. Host implements OnMultiWindowModeChangedProvider and automatically dispatches multi-window mode changes to fragments."));
            throw null;
        }
        for (b bVar : this.f6677c.m()) {
            if (bVar != null && z6) {
                bVar.P.n(true);
            }
        }
    }

    public final void o() {
        for (b bVar : this.f6677c.k()) {
            if (bVar != null) {
                bVar.w();
                bVar.P.o();
            }
        }
    }

    public final boolean p(MenuItem menuItem) {
        if (this.f6695v >= 1) {
            for (b bVar : this.f6677c.m()) {
                if (bVar != null) {
                    if (bVar.f6628U ? false : (bVar.f6632Y && bVar.f6633Z && bVar.K(menuItem)) ? true : bVar.P.p(menuItem)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final void q() {
        if (this.f6695v < 1) {
            return;
        }
        for (b bVar : this.f6677c.m()) {
            if (bVar != null && !bVar.f6628U) {
                bVar.P.q();
            }
        }
    }

    public final void r(b bVar) {
        if (bVar != null) {
            if (bVar.equals(this.f6677c.g(bVar.f6655x))) {
                bVar.f6622N.getClass();
                boolean zO = O(bVar);
                Boolean bool = bVar.f6611C;
                if (bool == null || bool.booleanValue() != zO) {
                    bVar.f6611C = Boolean.valueOf(zO);
                    p156q0.M m2 = bVar.P;
                    m2.h0();
                    m2.r(m2.f6699z);
                }
            }
        }
    }

    public final void s(boolean z6) {
        if (z6 && (this.f6696w instanceof L)) {
            f0(new IllegalStateException("Do not call dispatchPictureInPictureModeChanged() on host. Host implements OnPictureInPictureModeChangedProvider and automatically dispatches picture-in-picture mode changes to fragments."));
            throw null;
        }
        for (b bVar : this.f6677c.m()) {
            if (bVar != null && z6) {
                bVar.P.s(true);
            }
        }
    }

    public final boolean t() {
        if (this.f6695v < 1) {
            return false;
        }
        boolean z6 = false;
        for (b bVar : this.f6677c.m()) {
            if (bVar != null && N(bVar)) {
                if (bVar.f6628U ? false : bVar.P.t() | (bVar.f6632Y && bVar.f6633Z)) {
                    z6 = true;
                }
            }
        }
        return z6;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        b bVar = this.f6698y;
        if (bVar != null) {
            sb.append(bVar.getClass().getSimpleName());
            sb.append("{");
            sb.append(Integer.toHexString(System.identityHashCode(this.f6698y)));
            sb.append("}");
        } else {
            C0763w c0763w = this.f6696w;
            if (c0763w != null) {
                sb.append(c0763w.getClass().getSimpleName());
                sb.append("{");
                sb.append(Integer.toHexString(System.identityHashCode(this.f6696w)));
                sb.append("}");
            } else {
                sb.append("null");
            }
        }
        sb.append("}}");
        return sb.toString();
    }

    public final void u(int i10) {
        try {
            this.f6676b = true;
            for (f fVar : ((HashMap) this.f6677c.f13783u).values()) {
                if (fVar != null) {
                    fVar.f6703e = i10;
                }
            }
            Q(i10, false);
            Iterator it = e().iterator();
            while (it.hasNext()) {
                ((C0752k) it.next()).h();
            }
            this.f6676b = false;
            z(true);
        } catch (Throwable th) {
            this.f6676b = false;
            throw th;
        }
    }

    public final void v(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int size;
        String strC = p231y.a.c(str, "    ");
        r rVar = this.f6677c;
        rVar.getClass();
        String str2 = str + "    ";
        HashMap map = (HashMap) rVar.f13783u;
        if (!map.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Active Fragments:");
            for (f fVar : map.values()) {
                printWriter.print(str);
                if (fVar != null) {
                    b bVar = fVar.f6701c;
                    printWriter.println(bVar);
                    bVar.i(str2, fileDescriptor, printWriter, strArr);
                } else {
                    printWriter.println("null");
                }
            }
        }
        ArrayList arrayList = (ArrayList) rVar.f13782t;
        int size2 = arrayList.size();
        if (size2 > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            for (int i10 = 0; i10 < size2; i10++) {
                b bVar2 = (b) arrayList.get(i10);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i10);
                printWriter.print(": ");
                printWriter.println(bVar2.toString());
            }
        }
        ArrayList arrayList2 = this.f6679e;
        if (arrayList2 != null && (size = arrayList2.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Fragments Created Menus:");
            for (int i11 = 0; i11 < size; i11++) {
                b bVar3 = (b) this.f6679e.get(i11);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i11);
                printWriter.print(": ");
                printWriter.println(bVar3.toString());
            }
        }
        int size3 = this.f6678d.size();
        if (size3 > 0) {
            printWriter.print(str);
            printWriter.println("Back Stack:");
            for (int i12 = 0; i12 < size3; i12++) {
                C0742a c0742a = (C0742a) this.f6678d.get(i12);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i12);
                printWriter.print(": ");
                printWriter.println(c0742a.toString());
                c0742a.k(strC, printWriter, true);
            }
        }
        printWriter.print(str);
        printWriter.println("Back Stack Index: " + this.f6684k.get());
        synchronized (this.a) {
            try {
                int size4 = this.a.size();
                if (size4 > 0) {
                    printWriter.print(str);
                    printWriter.println("Pending Actions:");
                    for (int i13 = 0; i13 < size4; i13++) {
                        Object obj = (J) this.a.get(i13);
                        printWriter.print(str);
                        printWriter.print("  #");
                        printWriter.print(i13);
                        printWriter.print(": ");
                        printWriter.println(obj);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        printWriter.print(str);
        printWriter.println("FragmentManager misc state:");
        printWriter.print(str);
        printWriter.print("  mHost=");
        printWriter.println(this.f6696w);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.f6697x);
        if (this.f6698y != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.f6698y);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.f6695v);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.f6668H);
        printWriter.print(" mStopped=");
        printWriter.print(this.f6669I);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.f6670J);
        if (this.f6667G) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.f6667G);
        }
    }

    public final void w() {
        Iterator it = e().iterator();
        while (it.hasNext()) {
            ((C0752k) it.next()).h();
        }
    }

    public final void x(J j, boolean z6) {
        if (!z6) {
            if (this.f6696w == null) {
                if (!this.f6670J) {
                    throw new IllegalStateException("FragmentManager has not been attached to a host.");
                }
                throw new IllegalStateException("FragmentManager has been destroyed");
            }
            if (P()) {
                throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
            }
        }
        synchronized (this.a) {
            try {
                if (this.f6696w == null) {
                    if (!z6) {
                        throw new IllegalStateException("Activity has been destroyed");
                    }
                } else {
                    this.a.add(j);
                    Z();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void y(boolean z6) {
        if (this.f6676b) {
            throw new IllegalStateException("FragmentManager is already executing transactions");
        }
        if (this.f6696w == null) {
            if (!this.f6670J) {
                throw new IllegalStateException("FragmentManager has not been attached to a host.");
            }
            throw new IllegalStateException("FragmentManager has been destroyed");
        }
        if (Looper.myLooper() != this.f6696w.f14370u.getLooper()) {
            throw new IllegalStateException("Must be called from main thread of fragment host");
        }
        if (!z6 && P()) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
        if (this.f6672L == null) {
            this.f6672L = new ArrayList();
            this.f6673M = new ArrayList();
        }
    }

    public final boolean z(boolean z6) {
        boolean zA;
        C0742a c0742a;
        y(z6);
        if (!this.f6683i && (c0742a = this.f6682h) != null) {
            c0742a.f14310s = false;
            c0742a.e();
            if (K(3)) {
                Objects.toString(this.f6682h);
                Objects.toString(this.a);
            }
            this.f6682h.g(false, false);
            this.a.add(0, this.f6682h);
            Iterator it = this.f6682h.a.iterator();
            while (it.hasNext()) {
                b bVar = ((P) it.next()).f14269b;
                if (bVar != null) {
                    bVar.f6614F = false;
                }
            }
            this.f6682h = null;
        }
        boolean z10 = false;
        while (true) {
            ArrayList arrayList = this.f6672L;
            ArrayList arrayList2 = this.f6673M;
            synchronized (this.a) {
                if (this.a.isEmpty()) {
                    zA = false;
                } else {
                    try {
                        int size = this.a.size();
                        zA = false;
                        for (int i10 = 0; i10 < size; i10++) {
                            zA |= ((J) this.a.get(i10)).a(arrayList, arrayList2);
                        }
                        this.a.clear();
                        this.f6696w.f14370u.removeCallbacks(this.P);
                    } catch (Throwable th) {
                        this.a.clear();
                        this.f6696w.f14370u.removeCallbacks(this.P);
                        throw th;
                    }
                }
            }
            if (!zA) {
                break;
            }
            z10 = true;
            this.f6676b = true;
            try {
                W(this.f6672L, this.f6673M);
                d();
            } catch (Throwable th2) {
                d();
                throw th2;
            }
        }
        h0();
        if (this.f6671K) {
            this.f6671K = false;
            e0();
        }
        ((HashMap) this.f6677c.f13783u).values().removeAll(Collections.singleton(null));
        return z10;
    }
}
