package B;

import C.n;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f421b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f422c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final d f423d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f424e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public c f425f;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public p239z.f f428i;
    public HashSet a = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f426g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f427h = Integer.MIN_VALUE;

    public c(d dVar, int i10) {
        this.f423d = dVar;
        this.f424e = i10;
    }

    public final void a(c cVar, int i10) {
        b(cVar, i10, Integer.MIN_VALUE, false);
    }

    public final boolean b(c cVar, int i10, int i11, boolean z6) {
        if (cVar == null) {
            j();
            return true;
        }
        if (!z6 && !i(cVar)) {
            return false;
        }
        this.f425f = cVar;
        if (cVar.a == null) {
            cVar.a = new HashSet();
        }
        HashSet hashSet = this.f425f.a;
        if (hashSet != null) {
            hashSet.add(this);
        }
        this.f426g = i10;
        this.f427h = i11;
        return true;
    }

    public final void c(int i10, n nVar, ArrayList arrayList) {
        HashSet hashSet = this.a;
        if (hashSet != null) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                C.h.b(((c) it.next()).f423d, i10, arrayList, nVar);
            }
        }
    }

    public final int d() {
        if (this.f422c) {
            return this.f421b;
        }
        return 0;
    }

    public final int e() {
        c cVar;
        if (this.f423d.f464g0 == 8) {
            return 0;
        }
        int i10 = this.f427h;
        return (i10 == Integer.MIN_VALUE || (cVar = this.f425f) == null || cVar.f423d.f464g0 != 8) ? this.f426g : i10;
    }

    public final c f() {
        int i10 = this.f424e;
        int iD = p239z.e.d(i10);
        d dVar = this.f423d;
        switch (iD) {
            case 0:
            case 5:
            case 6:
            case 7:
            case 8:
                return null;
            case 1:
                return dVar.f439K;
            case 2:
                return dVar.f440L;
            case 3:
                return dVar.f437I;
            case 4:
                return dVar.f438J;
            default:
                throw new AssertionError(E0.a.o(i10));
        }
    }

    public final boolean g() {
        HashSet hashSet = this.a;
        if (hashSet == null) {
            return false;
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            if (((c) it.next()).f().h()) {
                return true;
            }
        }
        return false;
    }

    public final boolean h() {
        return this.f425f != null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:46:0x0063 A[RETURN] */
    public final boolean i(c cVar) {
        if (cVar != null) {
            int i10 = this.f424e;
            d dVar = cVar.f423d;
            int i11 = cVar.f424e;
            if (i11 != i10) {
                switch (p239z.e.d(i10)) {
                    case 0:
                    case 7:
                    case 8:
                        break;
                    case 1:
                    case 3:
                        boolean z6 = i11 == 2 || i11 == 4;
                        if (!(dVar instanceof h)) {
                            return z6;
                        }
                        if (z6 || i11 == 8) {
                            return true;
                        }
                        break;
                    case 2:
                    case 4:
                        boolean z10 = i11 == 3 || i11 == 5;
                        if (!(dVar instanceof h)) {
                            return z10;
                        }
                        if (z10 || i11 == 9) {
                            return true;
                        }
                        break;
                    case 5:
                        if (i11 != 2 && i11 != 4) {
                            return true;
                        }
                        break;
                    case 6:
                        if (i11 != 6 && i11 != 8 && i11 != 9) {
                            return true;
                        }
                        break;
                    default:
                        throw new AssertionError(E0.a.o(i10));
                }
            } else if (i10 != 6 || (dVar.f433E && this.f423d.f433E)) {
                return true;
            }
        }
        return false;
    }

    public final void j() {
        HashSet hashSet;
        c cVar = this.f425f;
        if (cVar != null && (hashSet = cVar.a) != null) {
            hashSet.remove(this);
            if (this.f425f.a.size() == 0) {
                this.f425f.a = null;
            }
        }
        this.a = null;
        this.f425f = null;
        this.f426g = 0;
        this.f427h = Integer.MIN_VALUE;
        this.f422c = false;
        this.f421b = 0;
    }

    public final void k() {
        p239z.f fVar = this.f428i;
        if (fVar == null) {
            this.f428i = new p239z.f(1);
        } else {
            fVar.h();
        }
    }

    public final void l(int i10) {
        this.f421b = i10;
        this.f422c = true;
    }

    public final String toString() {
        return this.f423d.f466h0 + ":" + E0.a.o(this.f424e);
    }
}
