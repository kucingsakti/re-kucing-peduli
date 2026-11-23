package androidx.recyclerview.widget;

import J0.C0252b;
import J0.C0256f;
import U.C0410a;
import U.C0412b;
import U.U;
import android.os.Trace;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import androidx.datastore.preferences.protobuf.AbstractC0487g;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class A {
    public final ArrayList a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ArrayList f6874b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f6875c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f6876d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f6877e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f6878f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public z f6879g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ RecyclerView f6880h;

    public A(RecyclerView recyclerView) {
        this.f6880h = recyclerView;
        ArrayList arrayList = new ArrayList();
        this.a = arrayList;
        this.f6874b = null;
        this.f6875c = new ArrayList();
        this.f6876d = Collections.unmodifiableList(arrayList);
        this.f6877e = 2;
        this.f6878f = 2;
    }

    public final void a(RecyclerView.a aVar, boolean z6) {
        RecyclerView.l(aVar);
        RecyclerView recyclerView = this.f6880h;
        J0.I i10 = recyclerView.f6931G0;
        View view = aVar.f7003s;
        if (i10 != null) {
            C0412b c0412bJ = i10.j();
            U.n(view, c0412bJ instanceof J0.H ? (C0412b) ((J0.H) c0412bJ).f2244e.remove(view) : null);
        }
        if (z6) {
            ArrayList arrayList = recyclerView.f6930G;
            if (arrayList.size() > 0) {
                arrayList.get(0).getClass();
                throw new ClassCastException();
            }
            s sVar = recyclerView.f6926E;
            if (sVar != null) {
                sVar.k(aVar);
            }
            if (recyclerView.f6989z0 != null) {
                recyclerView.f6986y.d(aVar);
            }
            if (RecyclerView.f6911T0) {
                Objects.toString(aVar);
            }
        }
        aVar.f7002K = null;
        aVar.f7001J = null;
        z zVarC = c();
        zVarC.getClass();
        int i11 = aVar.f7008x;
        ArrayList arrayList2 = zVarC.a(i11).a;
        if (((y) zVarC.a.get(i11)).f7139b <= arrayList2.size()) {
            com.bumptech.glide.c.b(view);
        } else {
            if (RecyclerView.f6910S0 && arrayList2.contains(aVar)) {
                throw new IllegalArgumentException("this scrap item already exists");
            }
            aVar.o();
            arrayList2.add(aVar);
        }
    }

    public final int b(int i10) {
        RecyclerView recyclerView = this.f6880h;
        if (i10 >= 0 && i10 < recyclerView.f6989z0.b()) {
            return !recyclerView.f6989z0.f2229g ? i10 : recyclerView.f6982w.f(i10, 0);
        }
        StringBuilder sbL = AbstractC0487g.l("invalid position ", i10, ". State item count is ");
        sbL.append(recyclerView.f6989z0.b());
        sbL.append(recyclerView.C());
        throw new IndexOutOfBoundsException(sbL.toString());
    }

    public final z c() {
        if (this.f6879g == null) {
            z zVar = new z();
            zVar.a = new SparseArray();
            zVar.f7142b = 0;
            zVar.f7143c = Collections.newSetFromMap(new IdentityHashMap());
            this.f6879g = zVar;
            d();
        }
        return this.f6879g;
    }

    public final void d() {
        RecyclerView recyclerView;
        s sVar;
        z zVar = this.f6879g;
        if (zVar == null || (sVar = (recyclerView = this.f6880h).f6926E) == null || !recyclerView.f6938K) {
            return;
        }
        zVar.f7143c.add(sVar);
    }

    public final void e(s sVar, boolean z6) {
        z zVar = this.f6879g;
        if (zVar == null) {
            return;
        }
        Set set = zVar.f7143c;
        set.remove(sVar);
        if (set.size() != 0 || z6) {
            return;
        }
        int i10 = 0;
        while (true) {
            SparseArray sparseArray = zVar.a;
            if (i10 >= sparseArray.size()) {
                return;
            }
            ArrayList arrayList = ((y) sparseArray.get(sparseArray.keyAt(i10))).a;
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                com.bumptech.glide.c.b(((RecyclerView.a) arrayList.get(i11)).f7003s);
            }
            i10++;
        }
    }

    public final void f() {
        ArrayList arrayList = this.f6875c;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            g(size);
        }
        arrayList.clear();
        if (RecyclerView.Y0) {
            C0256f c0256f = this.f6880h.f6987y0;
            int[] iArr = (int[]) c0256f.f2305d;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            c0256f.f2304c = 0;
        }
    }

    public final void g(int i10) {
        boolean z6 = RecyclerView.f6910S0;
        ArrayList arrayList = this.f6875c;
        RecyclerView.a aVar = (RecyclerView.a) arrayList.get(i10);
        if (RecyclerView.f6911T0) {
            Objects.toString(aVar);
        }
        a(aVar, true);
        arrayList.remove(i10);
    }

    public final void h(View view) {
        RecyclerView.a aVarM = RecyclerView.M(view);
        boolean zL = aVarM.l();
        RecyclerView recyclerView = this.f6880h;
        if (zL) {
            recyclerView.removeDetachedView(view, false);
        }
        if (aVarM.k()) {
            aVarM.f6997F.l(aVarM);
        } else if (aVarM.r()) {
            aVarM.f6993B &= -33;
        }
        i(aVarM);
        if (recyclerView.f6963h0 == null || aVarM.i()) {
            return;
        }
        recyclerView.f6963h0.d(aVarM);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0030  */
    /* JADX WARN: Code duplicated, block: B:61:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:63:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:65:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:68:0x00d6 A[LOOP:2: B:64:0x00c9->B:68:0x00d6, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:93:0x00d9 A[EDGE_INSN: B:93:0x00d9->B:69:0x00d9 BREAK  A[LOOP:1: B:60:0x00b2->B:67:0x00d3, LOOP_LABEL: LOOP:1: B:60:0x00b2->B:67:0x00d3], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:95:0x00d9 A[EDGE_INSN: B:95:0x00d9->B:69:0x00d9 BREAK  A[LOOP:1: B:60:0x00b2->B:67:0x00d3], SYNTHETIC] */
    public final void i(RecyclerView.a aVar) {
        boolean z6;
        boolean z10;
        int i10;
        int i11;
        C0256f c0256f;
        int i12;
        int i13;
        boolean zK = aVar.k();
        View view = aVar.f7003s;
        boolean z11 = false;
        boolean z12 = true;
        RecyclerView recyclerView = this.f6880h;
        if (zK || view.getParent() != null) {
            StringBuilder sb = new StringBuilder("Scrapped or attached views may not be recycled. isScrap:");
            sb.append(aVar.k());
            sb.append(" isAttached:");
            sb.append(view.getParent() != null);
            sb.append(recyclerView.C());
            throw new IllegalArgumentException(sb.toString());
        }
        if (aVar.l()) {
            StringBuilder sb2 = new StringBuilder("Tmp detached view should be removed from RecyclerView before it can be recycled: ");
            sb2.append(aVar);
            throw new IllegalArgumentException(E0.a.f(recyclerView, sb2));
        }
        if (aVar.q()) {
            throw new IllegalArgumentException(E0.a.f(recyclerView, new StringBuilder("Trying to recycle an ignored view holder. You should first call stopIgnoringView(view) before calling recycle.")));
        }
        if ((aVar.f6993B & 16) == 0) {
            WeakHashMap weakHashMap = U.a;
            if (view.hasTransientState()) {
                z6 = true;
            } else {
                z6 = false;
            }
        } else {
            z6 = false;
        }
        s sVar = recyclerView.f6926E;
        boolean z13 = sVar != null && z6 && sVar.h(aVar);
        boolean z14 = RecyclerView.f6910S0;
        ArrayList arrayList = this.f6875c;
        if (z14 && arrayList.contains(aVar)) {
            StringBuilder sb3 = new StringBuilder("cached view received recycle internal? ");
            sb3.append(aVar);
            throw new IllegalArgumentException(E0.a.f(recyclerView, sb3));
        }
        if (z13 || aVar.i()) {
            if (this.f6878f <= 0 || (aVar.f6993B & 526) != 0) {
                z10 = false;
            } else {
                int size = arrayList.size();
                if (size >= this.f6878f && size > 0) {
                    g(0);
                    size--;
                }
                if (RecyclerView.Y0 && size > 0) {
                    C0256f c0256f2 = recyclerView.f6987y0;
                    int i14 = aVar.f7005u;
                    if (((int[]) c0256f2.f2305d) != null) {
                        int i15 = c0256f2.f2304c * 2;
                        int i16 = 0;
                        while (true) {
                            if (i16 >= i15) {
                                i10 = size - 1;
                                loop1: while (i10 >= 0) {
                                    i11 = ((RecyclerView.a) arrayList.get(i10)).f7005u;
                                    c0256f = recyclerView.f6987y0;
                                    if (((int[]) c0256f.f2305d) != null) {
                                        break;
                                    }
                                    i12 = c0256f.f2304c * 2;
                                    i13 = 0;
                                    while (true) {
                                        if (i13 < i12) {
                                            break loop1;
                                        } else if (((int[]) c0256f.f2305d)[i13] == i11) {
                                            break;
                                        } else {
                                            i13 += 2;
                                        }
                                    }
                                    i10--;
                                }
                                size = i10 + 1;
                            } else if (((int[]) c0256f2.f2305d)[i16] != i14) {
                                i16 += 2;
                            }
                        }
                    } else {
                        i10 = size - 1;
                        loop1: while (i10 >= 0) {
                            i11 = ((RecyclerView.a) arrayList.get(i10)).f7005u;
                            c0256f = recyclerView.f6987y0;
                            if (((int[]) c0256f.f2305d) != null) {
                                break;
                                break;
                            }
                            i12 = c0256f.f2304c * 2;
                            i13 = 0;
                            while (true) {
                                if (i13 < i12) {
                                    break loop1;
                                    break loop1;
                                } else if (((int[]) c0256f.f2305d)[i13] == i11) {
                                    break;
                                } else {
                                    i13 += 2;
                                }
                            }
                            i10--;
                        }
                        size = i10 + 1;
                    }
                }
                arrayList.add(size, aVar);
                z10 = true;
            }
            if (z10) {
                z12 = false;
            } else {
                a(aVar, true);
            }
            z11 = z10;
        } else {
            if (RecyclerView.f6911T0) {
                recyclerView.C();
            }
            z12 = false;
        }
        recyclerView.f6986y.d(aVar);
        if (z11 || z12 || !z6) {
            return;
        }
        com.bumptech.glide.c.b(view);
        aVar.f7002K = null;
        aVar.f7001J = null;
    }

    public final void j(View view) {
        u uVar;
        RecyclerView.a aVarM = RecyclerView.M(view);
        boolean z6 = (aVarM.f6993B & 12) != 0;
        RecyclerView recyclerView = this.f6880h;
        if (!z6 && aVarM.m() && (uVar = recyclerView.f6963h0) != null) {
            l lVar = (l) uVar;
            if (aVarM.e().isEmpty() && lVar.f6881g && !aVarM.h()) {
                if (this.f6874b == null) {
                    this.f6874b = new ArrayList();
                }
                aVarM.f6997F = this;
                aVarM.f6998G = true;
                this.f6874b.add(aVarM);
                return;
            }
        }
        if (aVarM.h() && !aVarM.j() && !recyclerView.f6926E.f7113b) {
            throw new IllegalArgumentException(E0.a.f(recyclerView, new StringBuilder("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool.")));
        }
        aVarM.f6997F = this;
        aVarM.f6998G = false;
        this.a.add(aVarM);
    }

    /* JADX WARN: Code duplicated, block: B:120:0x01ea  */
    /* JADX WARN: Code duplicated, block: B:188:0x0334 A[EDGE_INSN: B:188:0x0334->B:189:0x0335 BREAK  A[LOOP:3: B:183:0x031c->B:187:0x0331]] */
    /* JADX WARN: Code duplicated, block: B:270:0x049a  */
    /* JADX WARN: Code duplicated, block: B:272:0x04a0  */
    /* JADX WARN: Code duplicated, block: B:273:0x04ae  */
    /* JADX WARN: Code duplicated, block: B:276:0x04b8  */
    /* JADX WARN: Code duplicated, block: B:277:0x04bb  */
    /* JADX WARN: Code duplicated, block: B:279:0x04be  */
    /* JADX WARN: Code duplicated, block: B:281:0x04c6  */
    /* JADX WARN: Code duplicated, block: B:283:0x04dc  */
    /* JADX WARN: Code duplicated, block: B:286:0x04e4  */
    /* JADX WARN: Code duplicated, block: B:288:0x04ea  */
    /* JADX WARN: Code duplicated, block: B:291:0x04f7  */
    /* JADX WARN: Code duplicated, block: B:295:0x0529  */
    /* JADX WARN: Code duplicated, block: B:298:0x0532  */
    /* JADX WARN: Code duplicated, block: B:302:0x054e  */
    /* JADX WARN: Code duplicated, block: B:304:0x0552  */
    /* JADX WARN: Code duplicated, block: B:307:0x0563  */
    /* JADX WARN: Code duplicated, block: B:310:0x0570  */
    /* JADX WARN: Code duplicated, block: B:314:0x0588  */
    /* JADX WARN: Code duplicated, block: B:320:0x059d  */
    /* JADX WARN: Code duplicated, block: B:322:0x05a0  */
    /* JADX WARN: Code duplicated, block: B:324:0x05a9  */
    /* JADX WARN: Code duplicated, block: B:328:0x05b1  */
    /* JADX WARN: Code duplicated, block: B:330:0x05b9  */
    /* JADX WARN: Code duplicated, block: B:333:0x05c6  */
    /* JADX WARN: Code duplicated, block: B:335:0x05ca  */
    /* JADX WARN: Code duplicated, block: B:336:0x05d0  */
    /* JADX WARN: Code duplicated, block: B:341:0x05e3  */
    /* JADX WARN: Code duplicated, block: B:344:0x05e8  */
    /* JADX WARN: Code duplicated, block: B:348:0x05f1  */
    /* JADX WARN: Code duplicated, block: B:349:0x05fb  */
    /* JADX WARN: Code duplicated, block: B:351:0x0601  */
    /* JADX WARN: Code duplicated, block: B:352:0x060b  */
    /* JADX WARN: Code duplicated, block: B:355:0x0611 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:357:0x0615  */
    /* JADX WARN: Code duplicated, block: B:35:0x007d A[EDGE_INSN: B:35:0x007d->B:36:0x007e BREAK  A[LOOP:0: B:14:0x0027->B:20:0x0041]] */
    /* JADX WARN: Code duplicated, block: B:77:0x0126  */
    /* JADX WARN: Instruction removed from duplicated block: B:291:0x04f7, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:298:0x0532, please report this as an issue */
    public final RecyclerView.a k(int i10, long j) {
        boolean z6;
        RecyclerView.a aVarF;
        boolean z10;
        long j10;
        long j11;
        boolean z11;
        s sVar;
        boolean z12;
        long nanoTime;
        long j12;
        AccessibilityManager accessibilityManager;
        boolean z13;
        boolean z14;
        boolean z15;
        J0.I i11;
        C0412b c0412bJ;
        J0.H h10;
        View.AccessibilityDelegate accessibilityDelegateD;
        ArrayList arrayList;
        ViewGroup.LayoutParams layoutParams;
        ViewGroup.LayoutParams layoutParams2;
        x xVar;
        boolean z16;
        RecyclerView recyclerViewH;
        RecyclerView.a aVar;
        View view;
        int iB;
        boolean z17;
        int size;
        int iF;
        boolean z18 = true;
        RecyclerView recyclerView = this.f6880h;
        if (i10 < 0 || i10 >= recyclerView.f6989z0.b()) {
            throw new IndexOutOfBoundsException("Invalid item position " + i10 + "(" + i10 + "). Item count:" + recyclerView.f6989z0.b() + recyclerView.C());
        }
        J0.D d3 = recyclerView.f6989z0;
        if (d3.f2229g) {
            ArrayList arrayList2 = this.f6874b;
            if (arrayList2 != null && (size = arrayList2.size()) != 0) {
                int i12 = 0;
                while (true) {
                    if (i12 >= size) {
                        if (recyclerView.f6926E.f7113b && (iF = recyclerView.f6982w.f(i10, 0)) > 0 && iF < recyclerView.f6926E.a()) {
                            long jB = recyclerView.f6926E.b(iF);
                            int i13 = 0;
                            while (true) {
                                if (i13 >= size) {
                                    aVarF = null;
                                    break;
                                }
                                RecyclerView.a aVar2 = (RecyclerView.a) this.f6874b.get(i13);
                                if (!aVar2.r() && aVar2.f7007w == jB) {
                                    aVar2.b(32);
                                    aVarF = aVar2;
                                    break;
                                }
                                i13++;
                            }
                        } else {
                            aVarF = null;
                            break;
                        }
                    } else {
                        aVarF = (RecyclerView.a) this.f6874b.get(i12);
                        if (!aVarF.r() && aVarF.d() == i10) {
                            aVarF.b(32);
                            break;
                        }
                        i12++;
                    }
                }
            } else {
                aVarF = null;
                break;
            }
            z6 = aVarF != null;
        } else {
            z6 = false;
            aVarF = null;
        }
        ArrayList arrayList3 = this.f6875c;
        ArrayList arrayList4 = this.a;
        if (aVarF == null) {
            int size2 = arrayList4.size();
            int i14 = 0;
            while (true) {
                if (i14 >= size2) {
                    ArrayList arrayList5 = recyclerView.f6984x.f7053c;
                    int size3 = arrayList5.size();
                    int i15 = 0;
                    while (true) {
                        if (i15 >= size3) {
                            z10 = z18;
                            view = null;
                            break;
                        }
                        view = (View) arrayList5.get(i15);
                        RecyclerView.a aVarM = RecyclerView.M(view);
                        z10 = z18;
                        if (aVarM.d() == i10 && !aVarM.h() && !aVarM.j()) {
                            break;
                        }
                        i15++;
                        z18 = z10;
                    }
                    if (view == null) {
                        int size4 = arrayList3.size();
                        int i16 = 0;
                        while (true) {
                            if (i16 >= size4) {
                                aVarF = null;
                                break;
                            }
                            RecyclerView.a aVar3 = (RecyclerView.a) arrayList3.get(i16);
                            if (!aVar3.h() && aVar3.d() == i10 && !aVar3.f()) {
                                arrayList3.remove(i16);
                                if (RecyclerView.f6911T0) {
                                    aVar3.toString();
                                }
                                aVarF = aVar3;
                                break;
                            }
                            i16++;
                        }
                    } else {
                        RecyclerView.a aVarM2 = RecyclerView.M(view);
                        C0529b c0529b = recyclerView.f6984x;
                        int iIndexOfChild = c0529b.a.a.indexOfChild(view);
                        if (iIndexOfChild < 0) {
                            throw new IllegalArgumentException("view is not a child, cannot hide " + view);
                        }
                        C0252b c0252b = c0529b.f7052b;
                        if (!c0252b.d(iIndexOfChild)) {
                            throw new RuntimeException("trying to unhide a view that was not hidden" + view);
                        }
                        c0252b.a(iIndexOfChild);
                        c0529b.k(view);
                        C0529b c0529b2 = recyclerView.f6984x;
                        int iIndexOfChild2 = c0529b2.a.a.indexOfChild(view);
                        if (iIndexOfChild2 == -1) {
                            iB = -1;
                        } else {
                            C0252b c0252b2 = c0529b2.f7052b;
                            if (c0252b2.d(iIndexOfChild2)) {
                                iB = -1;
                            } else {
                                iB = iIndexOfChild2 - c0252b2.b(iIndexOfChild2);
                            }
                        }
                        if (iB == -1) {
                            StringBuilder sb = new StringBuilder("layout index should not be -1 after unhiding a view:");
                            sb.append(aVarM2);
                            throw new IllegalStateException(E0.a.f(recyclerView, sb));
                        }
                        recyclerView.f6984x.c(iB);
                        j(view);
                        aVarM2.b(8224);
                        aVarF = aVarM2;
                        break;
                    }
                } else {
                    RecyclerView.a aVar4 = (RecyclerView.a) arrayList4.get(i14);
                    if (!aVar4.r() && aVar4.d() == i10 && !aVar4.h() && (d3.f2229g || !aVar4.j())) {
                        aVar4.b(32);
                        z10 = true;
                        aVarF = aVar4;
                        break;
                    }
                    i14++;
                }
            }
            if (aVarF != null) {
                if (!aVarF.j()) {
                    int i17 = aVarF.f7005u;
                    if (i17 < 0 || i17 >= recyclerView.f6926E.a()) {
                        StringBuilder sb2 = new StringBuilder("Inconsistency detected. Invalid view holder adapter position");
                        sb2.append(aVarF);
                        throw new IndexOutOfBoundsException(E0.a.f(recyclerView, sb2));
                    }
                    if (d3.f2229g || recyclerView.f6926E.c(aVarF.f7005u) == aVarF.f7008x) {
                        s sVar2 = recyclerView.f6926E;
                        if (!sVar2.f7113b || aVarF.f7007w == sVar2.b(aVarF.f7005u)) {
                            z17 = z10;
                        } else {
                            z17 = false;
                        }
                    } else {
                        z17 = false;
                    }
                } else {
                    if (RecyclerView.f6910S0 && !d3.f2229g) {
                        throw new IllegalStateException(E0.a.f(recyclerView, new StringBuilder("should not receive a removed view unless it is pre layout")));
                    }
                    z17 = d3.f2229g;
                }
                if (z17) {
                    z6 = z10;
                } else {
                    aVarF.b(4);
                    if (aVarF.k()) {
                        recyclerView.removeDetachedView(aVarF.f7003s, false);
                        aVarF.f6997F.l(aVarF);
                    } else if (aVarF.r()) {
                        aVarF.f6993B &= -33;
                    }
                    i(aVarF);
                    aVarF = null;
                }
            }
        } else {
            z10 = true;
        }
        if (aVarF == null) {
            int iF2 = recyclerView.f6982w.f(i10, 0);
            if (iF2 < 0 || iF2 >= recyclerView.f6926E.a()) {
                throw new IndexOutOfBoundsException("Inconsistency detected. Invalid item position " + i10 + "(offset:" + iF2 + ").state:" + d3.b() + recyclerView.C());
            }
            int iC = recyclerView.f6926E.c(iF2);
            j10 = 3;
            s sVar3 = recyclerView.f6926E;
            if (sVar3.f7113b) {
                long jB2 = sVar3.b(iF2);
                int size5 = arrayList4.size() - 1;
                while (true) {
                    if (size5 < 0) {
                        j11 = 4;
                        int size6 = arrayList3.size() - 1;
                        while (true) {
                            if (size6 >= 0) {
                                RecyclerView.a aVar5 = (RecyclerView.a) arrayList3.get(size6);
                                if (aVar5.f7007w != jB2 || aVar5.f()) {
                                    size6--;
                                } else {
                                    if (iC == aVar5.f7008x) {
                                        arrayList3.remove(size6);
                                        aVarF = aVar5;
                                        break;
                                    }
                                    g(size6);
                                }
                            }
                            aVarF = null;
                            break;
                        }
                    }
                    j11 = 4;
                    RecyclerView.a aVar6 = (RecyclerView.a) arrayList4.get(size5);
                    if (aVar6.f7007w == jB2 && !aVar6.r()) {
                        if (iC == aVar6.f7008x) {
                            aVar6.b(32);
                            if (aVar6.j() && !d3.f2229g) {
                                aVar6.f6993B = (aVar6.f6993B & (-15)) | 2;
                            }
                            aVarF = aVar6;
                            break;
                        }
                        arrayList4.remove(size5);
                        View view2 = aVar6.f7003s;
                        recyclerView.removeDetachedView(view2, false);
                        RecyclerView.a aVarM3 = RecyclerView.M(view2);
                        aVarM3.f6997F = null;
                        aVarM3.f6998G = false;
                        aVarM3.f6993B &= -33;
                        i(aVarM3);
                    }
                    size5--;
                }
                if (aVarF != null) {
                    aVarF.f7005u = iF2;
                    z6 = z10;
                }
            } else {
                j11 = 4;
            }
            if (aVarF == null) {
                boolean z19 = RecyclerView.f6910S0;
                y yVar = (y) c().a.get(iC);
                if (yVar == null) {
                    aVar = null;
                    break;
                }
                ArrayList arrayList6 = yVar.a;
                if (!arrayList6.isEmpty()) {
                    int size7 = arrayList6.size() - 1;
                    while (true) {
                        if (size7 < 0) {
                            aVar = null;
                            break;
                        }
                        if (!((RecyclerView.a) arrayList6.get(size7)).f()) {
                            aVar = (RecyclerView.a) arrayList6.remove(size7);
                            break;
                        }
                        size7--;
                    }
                } else {
                    aVar = null;
                    break;
                }
                if (aVar != null) {
                    aVar.o();
                    boolean z20 = RecyclerView.f6910S0;
                }
                aVarF = aVar;
            }
            if (aVarF == null) {
                long nanoTime2 = recyclerView.getNanoTime();
                if (j != Long.MAX_VALUE) {
                    long j13 = this.f6879g.a(iC).f7140c;
                    if (!((j13 == 0 || j13 + nanoTime2 < j) ? z10 : false)) {
                        return null;
                    }
                }
                s sVar4 = recyclerView.f6926E;
                sVar4.getClass();
                try {
                    int i18 = Q.m.a;
                    Trace.beginSection("RV CreateView");
                    aVarF = sVar4.f(recyclerView, iC);
                    if (aVarF.f7003s.getParent() != null) {
                        throw new IllegalStateException("ViewHolder views must not be attached when created. Ensure that you are not passing 'true' to the attachToRoot parameter of LayoutInflater.inflate(..., boolean attachToRoot)");
                    }
                    aVarF.f7008x = iC;
                    Trace.endSection();
                    if (RecyclerView.Y0 && (recyclerViewH = RecyclerView.H(aVarF.f7003s)) != null) {
                        aVarF.f7004t = new WeakReference(recyclerViewH);
                    }
                    long nanoTime3 = recyclerView.getNanoTime() - nanoTime2;
                    y yVarA = this.f6879g.a(iC);
                    long j14 = yVarA.f7140c;
                    if (j14 != 0) {
                        nanoTime3 = (nanoTime3 / j11) + ((j14 / j11) * 3);
                    }
                    yVarA.f7140c = nanoTime3;
                } catch (Throwable th) {
                    int i19 = Q.m.a;
                    Trace.endSection();
                    throw th;
                }
            }
        } else {
            j10 = 3;
            j11 = 4;
        }
        if (z6 && !d3.f2229g) {
            int i20 = aVarF.f6993B;
            if ((i20 & 8192) != 0 ? z10 : false) {
                aVarF.f6993B = i20 & (-8193);
                if (d3.j) {
                    u.b(aVarF);
                    u uVar = recyclerView.f6963h0;
                    aVarF.e();
                    uVar.getClass();
                    t tVar = new t();
                    tVar.a(aVarF);
                    recyclerView.Z(aVarF, tVar);
                }
            }
        }
        boolean z21 = d3.f2229g;
        View view3 = aVarF.f7003s;
        if (!z21 || !aVarF.g()) {
            if (aVarF.g()) {
                if (((aVarF.f6993B & 2) != 0 ? z10 : false) || aVarF.h()) {
                }
                layoutParams2 = view3.getLayoutParams();
                if (layoutParams2 == null) {
                    xVar = (x) recyclerView.generateDefaultLayoutParams();
                    view3.setLayoutParams(xVar);
                } else if (recyclerView.checkLayoutParams(layoutParams2)) {
                    xVar = (x) layoutParams2;
                } else {
                    xVar = (x) recyclerView.generateLayoutParams(layoutParams2);
                    view3.setLayoutParams(xVar);
                }
                xVar.f7135s = aVarF;
                if (z6 || !z15) {
                    z16 = false;
                } else {
                    z16 = z14;
                }
                xVar.f7138v = z16;
                return aVarF;
            }
            if (RecyclerView.f6910S0 && aVarF.j()) {
                StringBuilder sb3 = new StringBuilder("Removed holder should be bound and it should come here only in pre-layout. Holder: ");
                sb3.append(aVarF);
                throw new IllegalStateException(E0.a.f(recyclerView, sb3));
            }
            int iF3 = recyclerView.f6982w.f(i10, 0);
            C0412b c0412b = null;
            aVarF.f7002K = null;
            aVarF.f7001J = recyclerView;
            int i21 = aVarF.f7008x;
            long nanoTime4 = recyclerView.getNanoTime();
            if (j != Long.MAX_VALUE) {
                long j15 = this.f6879g.a(i21).f7141d;
                if (j15 == 0 || j15 + nanoTime4 < j) {
                    if (aVarF.l()) {
                        recyclerView.attachViewToParent(view3, recyclerView.getChildCount(), view3.getLayoutParams());
                        z11 = z10;
                    } else {
                        z11 = false;
                    }
                    sVar = recyclerView.f6926E;
                    sVar.getClass();
                    if (aVarF.f7002K == null) {
                        z12 = z10;
                    } else {
                        z12 = false;
                    }
                    if (z12) {
                        aVarF.f7005u = iF3;
                        if (sVar.f7113b) {
                            aVarF.f7007w = sVar.b(iF3);
                        }
                        aVarF.f6993B = (aVarF.f6993B & (-520)) | 1;
                        int i22 = Q.m.a;
                        Trace.beginSection("RV OnBindView");
                    }
                    aVarF.f7002K = sVar;
                    if (RecyclerView.f6910S0) {
                        if (view3.getParent() == null) {
                            WeakHashMap weakHashMap = U.a;
                            if (view3.isAttachedToWindow() != aVarF.l()) {
                                throw new IllegalStateException("Temp-detached state out of sync with reality. holder.isTmpDetached(): " + aVarF.l() + ", attached to window: " + view3.isAttachedToWindow() + ", holder: " + aVarF);
                            }
                        }
                        if (view3.getParent() == null) {
                            WeakHashMap weakHashMap2 = U.a;
                            if (view3.isAttachedToWindow()) {
                                throw new IllegalStateException("Attempting to bind attached holder with no parent (AKA temp detached): " + aVarF);
                            }
                        }
                    }
                    aVarF.e();
                    sVar.e(aVarF, iF3);
                    if (z12) {
                        arrayList = aVarF.f6994C;
                        if (arrayList != null) {
                            arrayList.clear();
                        }
                        aVarF.f6993B &= -1025;
                        layoutParams = view3.getLayoutParams();
                        if (layoutParams instanceof x) {
                            ((x) layoutParams).f7137u = z10;
                        }
                        int i23 = Q.m.a;
                        Trace.endSection();
                    }
                    if (z11) {
                        recyclerView.detachViewFromParent(view3);
                    }
                    nanoTime = recyclerView.getNanoTime() - nanoTime4;
                    y yVarA2 = this.f6879g.a(aVarF.f7008x);
                    j12 = yVarA2.f7141d;
                    if (j12 != 0) {
                        nanoTime = (nanoTime / j11) + ((j12 / j11) * j10);
                    }
                    yVarA2.f7141d = nanoTime;
                    accessibilityManager = recyclerView.f6954T;
                    if (accessibilityManager == null && accessibilityManager.isEnabled()) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    if (z13) {
                        WeakHashMap weakHashMap3 = U.a;
                        z14 = true;
                        if (view3.getImportantForAccessibility() == 0) {
                            view3.setImportantForAccessibility(1);
                        }
                        i11 = recyclerView.f6931G0;
                        if (i11 != null) {
                            c0412bJ = i11.j();
                            if (c0412bJ instanceof J0.H) {
                                h10 = (J0.H) c0412bJ;
                                h10.getClass();
                                accessibilityDelegateD = U.d(view3);
                                if (accessibilityDelegateD != null) {
                                    if (accessibilityDelegateD instanceof C0410a) {
                                        c0412b = ((C0410a) accessibilityDelegateD).a;
                                    } else {
                                        c0412b = new C0412b(accessibilityDelegateD);
                                    }
                                }
                                if (c0412b != null && c0412b != h10) {
                                    h10.f2244e.put(view3, c0412b);
                                }
                            }
                            U.n(view3, c0412bJ);
                        }
                    } else {
                        z14 = true;
                    }
                    if (d3.f2229g) {
                        aVarF.f7009y = i10;
                    }
                    z15 = z14;
                } else {
                    z15 = false;
                    z14 = z10;
                }
            } else {
                if (aVarF.l()) {
                    recyclerView.attachViewToParent(view3, recyclerView.getChildCount(), view3.getLayoutParams());
                    z11 = z10;
                } else {
                    z11 = false;
                }
                sVar = recyclerView.f6926E;
                sVar.getClass();
                if (aVarF.f7002K == null) {
                    z12 = z10;
                } else {
                    z12 = false;
                }
                if (z12) {
                    aVarF.f7005u = iF3;
                    if (sVar.f7113b) {
                        aVarF.f7007w = sVar.b(iF3);
                    }
                    aVarF.f6993B = (aVarF.f6993B & (-520)) | 1;
                    int i24 = Q.m.a;
                    Trace.beginSection("RV OnBindView");
                }
                aVarF.f7002K = sVar;
                if (RecyclerView.f6910S0) {
                    if (view3.getParent() == null) {
                        WeakHashMap weakHashMap4 = U.a;
                        if (view3.isAttachedToWindow() != aVarF.l()) {
                            throw new IllegalStateException("Temp-detached state out of sync with reality. holder.isTmpDetached(): " + aVarF.l() + ", attached to window: " + view3.isAttachedToWindow() + ", holder: " + aVarF);
                        }
                    }
                    if (view3.getParent() == null) {
                        WeakHashMap weakHashMap5 = U.a;
                        if (view3.isAttachedToWindow()) {
                            throw new IllegalStateException("Attempting to bind attached holder with no parent (AKA temp detached): " + aVarF);
                        }
                    }
                }
                aVarF.e();
                sVar.e(aVarF, iF3);
                if (z12) {
                    arrayList = aVarF.f6994C;
                    if (arrayList != null) {
                        arrayList.clear();
                    }
                    aVarF.f6993B &= -1025;
                    layoutParams = view3.getLayoutParams();
                    if (layoutParams instanceof x) {
                        ((x) layoutParams).f7137u = z10;
                    }
                    int i25 = Q.m.a;
                    Trace.endSection();
                }
                if (z11) {
                    recyclerView.detachViewFromParent(view3);
                }
                nanoTime = recyclerView.getNanoTime() - nanoTime4;
                y yVarA3 = this.f6879g.a(aVarF.f7008x);
                j12 = yVarA3.f7141d;
                if (j12 != 0) {
                    nanoTime = (nanoTime / j11) + ((j12 / j11) * j10);
                }
                yVarA3.f7141d = nanoTime;
                accessibilityManager = recyclerView.f6954T;
                if (accessibilityManager == null) {
                    z13 = false;
                } else {
                    z13 = false;
                }
                if (z13) {
                    WeakHashMap weakHashMap6 = U.a;
                    z14 = true;
                    if (view3.getImportantForAccessibility() == 0) {
                        view3.setImportantForAccessibility(1);
                    }
                    i11 = recyclerView.f6931G0;
                    if (i11 != null) {
                        c0412bJ = i11.j();
                        if (c0412bJ instanceof J0.H) {
                            h10 = (J0.H) c0412bJ;
                            h10.getClass();
                            accessibilityDelegateD = U.d(view3);
                            if (accessibilityDelegateD != null) {
                                if (accessibilityDelegateD instanceof C0410a) {
                                    c0412b = ((C0410a) accessibilityDelegateD).a;
                                } else {
                                    c0412b = new C0412b(accessibilityDelegateD);
                                }
                            }
                            if (c0412b != null) {
                                h10.f2244e.put(view3, c0412b);
                            }
                        }
                        U.n(view3, c0412bJ);
                    }
                } else {
                    z14 = true;
                }
                if (d3.f2229g) {
                    aVarF.f7009y = i10;
                }
                z15 = z14;
            }
            layoutParams2 = view3.getLayoutParams();
            if (layoutParams2 == null) {
                xVar = (x) recyclerView.generateDefaultLayoutParams();
                view3.setLayoutParams(xVar);
            } else if (recyclerView.checkLayoutParams(layoutParams2)) {
                xVar = (x) recyclerView.generateLayoutParams(layoutParams2);
                view3.setLayoutParams(xVar);
            } else {
                xVar = (x) layoutParams2;
            }
            xVar.f7135s = aVarF;
            if (z6) {
                z16 = false;
            } else {
                z16 = false;
            }
            xVar.f7138v = z16;
            return aVarF;
        }
        aVarF.f7009y = i10;
        z14 = z10;
        z15 = false;
        layoutParams2 = view3.getLayoutParams();
        if (layoutParams2 == null) {
            xVar = (x) recyclerView.generateDefaultLayoutParams();
            view3.setLayoutParams(xVar);
        } else if (recyclerView.checkLayoutParams(layoutParams2)) {
            xVar = (x) recyclerView.generateLayoutParams(layoutParams2);
            view3.setLayoutParams(xVar);
        } else {
            xVar = (x) layoutParams2;
        }
        xVar.f7135s = aVarF;
        if (z6) {
            z16 = false;
        } else {
            z16 = false;
        }
        xVar.f7138v = z16;
        return aVarF;
    }

    public final void l(RecyclerView.a aVar) {
        if (aVar.f6998G) {
            this.f6874b.remove(aVar);
        } else {
            this.a.remove(aVar);
        }
        aVar.f6997F = null;
        aVar.f6998G = false;
        aVar.f6993B &= -33;
    }

    public final void m() {
        w wVar = this.f6880h.f6928F;
        this.f6878f = this.f6877e + (wVar != null ? wVar.f7129k : 0);
        ArrayList arrayList = this.f6875c;
        for (int size = arrayList.size() - 1; size >= 0 && arrayList.size() > this.f6878f; size--) {
            g(size);
        }
    }
}
