package V0;

import android.animation.TimeInterpolator;
import android.util.AndroidRuntimeException;
import android.view.View;
import android.view.ViewGroup;
import androidx.datastore.preferences.protobuf.AbstractC0487g;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: V0.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0446a extends p {

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public int f5101W;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public ArrayList f5099U = new ArrayList();

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public boolean f5100V = true;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public boolean f5102X = false;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public int f5103Y = 0;

    public C0446a() {
        S(1);
        P(new C0453h(2));
        P(new C0451f());
        P(new C0453h(1));
    }

    @Override // V0.p
    public final void A(ViewGroup viewGroup) {
        super.A(viewGroup);
        int size = this.f5099U.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((p) this.f5099U.get(i10)).A(viewGroup);
        }
    }

    @Override // V0.p
    public final void B() {
        this.f5148O = 0L;
        int i10 = 0;
        u uVar = new u(this, i10);
        while (i10 < this.f5099U.size()) {
            p pVar = (p) this.f5099U.get(i10);
            pVar.a(uVar);
            pVar.B();
            long j = pVar.f5148O;
            if (this.f5100V) {
                this.f5148O = Math.max(this.f5148O, j);
            } else {
                long j10 = this.f5148O;
                pVar.P = j10;
                this.f5148O = j10 + j;
            }
            i10++;
        }
    }

    @Override // V0.p
    public final p C(n nVar) {
        super.C(nVar);
        return this;
    }

    @Override // V0.p
    public final void D(View view) {
        super.D(view);
        int size = this.f5099U.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((p) this.f5099U.get(i10)).D(view);
        }
    }

    @Override // V0.p
    public final void E() {
        if (this.f5099U.isEmpty()) {
            N();
            p();
            return;
        }
        u uVar = new u();
        uVar.f5162b = this;
        Iterator it = this.f5099U.iterator();
        while (it.hasNext()) {
            ((p) it.next()).a(uVar);
        }
        this.f5101W = this.f5099U.size();
        if (this.f5100V) {
            Iterator it2 = this.f5099U.iterator();
            while (it2.hasNext()) {
                ((p) it2.next()).E();
            }
            return;
        }
        for (int i10 = 1; i10 < this.f5099U.size(); i10++) {
            ((p) this.f5099U.get(i10 - 1)).a(new u((p) this.f5099U.get(i10), 2));
        }
        p pVar = (p) this.f5099U.get(0);
        if (pVar != null) {
            pVar.E();
        }
    }

    /* JADX WARN: Code duplicated, block: B:55:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:63:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:74:? A[RETURN, SYNTHETIC] */
    @Override // V0.p
    public final void F(long j, long j10) {
        long j11;
        long j12 = this.f5148O;
        long j13 = 0;
        if (this.f5134A != null) {
            if (j < 0 && j10 < 0) {
                return;
            }
            if (j > j12 && j10 > j12) {
                return;
            }
        }
        boolean z6 = j < j10;
        if ((j >= 0 && j10 < 0) || (j <= j12 && j10 > j12)) {
            this.f5143J = false;
            z(this, o.f5125c, z6);
        }
        if (!this.f5100V) {
            int size = 1;
            while (true) {
                if (size >= this.f5099U.size()) {
                    size = this.f5099U.size();
                    break;
                } else if (((p) this.f5099U.get(size)).P > j10) {
                    break;
                } else {
                    size++;
                }
            }
            int i10 = size - 1;
            if (j >= j10) {
                while (true) {
                    if (i10 < this.f5099U.size()) {
                        p pVar = (p) this.f5099U.get(i10);
                        long j14 = pVar.P;
                        j11 = j13;
                        long j15 = j - j14;
                        if (j15 < j11) {
                            break;
                        }
                        pVar.F(j15, j10 - j14);
                        i10++;
                        j13 = j11;
                    }
                }
            } else {
                j11 = 0;
                while (i10 >= 0) {
                    p pVar2 = (p) this.f5099U.get(i10);
                    long j16 = pVar2.P;
                    long j17 = j - j16;
                    pVar2.F(j17, j10 - j16);
                    if (j17 >= 0) {
                        break;
                    } else {
                        i10--;
                    }
                }
            }
            if (this.f5134A != null) {
                if ((j > j12 || j10 > j12) && (j >= 0 || j10 < j11)) {
                    return;
                }
                if (j > j12) {
                    this.f5143J = true;
                }
                z(this, o.f5126d, z6);
            }
        }
        for (int i11 = 0; i11 < this.f5099U.size(); i11++) {
            ((p) this.f5099U.get(i11)).F(j, j10);
        }
        j11 = j13;
        if (this.f5134A != null) {
            if (j > j12) {
                return;
            } else {
                return;
            }
            if (j > j12) {
                this.f5143J = true;
            }
            z(this, o.f5126d, z6);
        }
    }

    @Override // V0.p
    public final void H(o1.f fVar) {
        this.f5103Y |= 8;
        int size = this.f5099U.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((p) this.f5099U.get(i10)).H(fVar);
        }
    }

    @Override // V0.p
    public final void J(p204v1.g gVar) {
        super.J(gVar);
        this.f5103Y |= 4;
        if (this.f5099U != null) {
            for (int i10 = 0; i10 < this.f5099U.size(); i10++) {
                ((p) this.f5099U.get(i10)).J(gVar);
            }
        }
    }

    @Override // V0.p
    public final void L() {
        this.f5103Y |= 2;
        int size = this.f5099U.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((p) this.f5099U.get(i10)).L();
        }
    }

    @Override // V0.p
    public final void M(long j) {
        this.f5150t = j;
    }

    @Override // V0.p
    public final String O(String str) {
        String strO = super.O(str);
        for (int i10 = 0; i10 < this.f5099U.size(); i10++) {
            StringBuilder sb = new StringBuilder();
            sb.append(strO);
            sb.append("\n");
            sb.append(((p) this.f5099U.get(i10)).O(str + "  "));
            strO = sb.toString();
        }
        return strO;
    }

    public final void P(p pVar) {
        this.f5099U.add(pVar);
        pVar.f5134A = this;
        long j = this.f5151u;
        if (j >= 0) {
            pVar.G(j);
        }
        if ((this.f5103Y & 1) != 0) {
            pVar.I(this.f5152v);
        }
        if ((this.f5103Y & 2) != 0) {
            pVar.L();
        }
        if ((this.f5103Y & 4) != 0) {
            pVar.J(this.f5147N);
        }
        if ((this.f5103Y & 8) != 0) {
            pVar.H(null);
        }
    }

    @Override // V0.p
    /* JADX INFO: renamed from: Q, reason: merged with bridge method [inline-methods] */
    public final void G(long j) {
        ArrayList arrayList;
        this.f5151u = j;
        if (j < 0 || (arrayList = this.f5099U) == null) {
            return;
        }
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((p) this.f5099U.get(i10)).G(j);
        }
    }

    @Override // V0.p
    /* JADX INFO: renamed from: R, reason: merged with bridge method [inline-methods] */
    public final void I(TimeInterpolator timeInterpolator) {
        this.f5103Y |= 1;
        ArrayList arrayList = this.f5099U;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                ((p) this.f5099U.get(i10)).I(timeInterpolator);
            }
        }
        this.f5152v = timeInterpolator;
    }

    public final void S(int i10) {
        if (i10 == 0) {
            this.f5100V = true;
        } else {
            if (i10 != 1) {
                throw new AndroidRuntimeException(AbstractC0487g.g(i10, "Invalid parameter for TransitionSet ordering: "));
            }
            this.f5100V = false;
        }
    }

    @Override // V0.p
    public final void cancel() {
        super.cancel();
        int size = this.f5099U.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((p) this.f5099U.get(i10)).cancel();
        }
    }

    @Override // V0.p
    public final void d(x xVar) {
        if (x(xVar.f5163b)) {
            for (p pVar : this.f5099U) {
                if (pVar.x(xVar.f5163b)) {
                    pVar.d(xVar);
                    xVar.f5164c.add(pVar);
                }
            }
        }
    }

    @Override // V0.p
    public final void f(x xVar) {
        int size = this.f5099U.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((p) this.f5099U.get(i10)).f(xVar);
        }
    }

    @Override // V0.p
    public final void h(x xVar) {
        if (x(xVar.f5163b)) {
            for (p pVar : this.f5099U) {
                if (pVar.x(xVar.f5163b)) {
                    pVar.h(xVar);
                    xVar.f5164c.add(pVar);
                }
            }
        }
    }

    @Override // V0.p
    /* JADX INFO: renamed from: k */
    public final p clone() {
        C0446a c0446a = (C0446a) super.clone();
        c0446a.f5099U = new ArrayList();
        int size = this.f5099U.size();
        for (int i10 = 0; i10 < size; i10++) {
            p pVarClone = ((p) this.f5099U.get(i10)).clone();
            c0446a.f5099U.add(pVarClone);
            pVarClone.f5134A = c0446a;
        }
        return c0446a;
    }

    @Override // V0.p
    public final void m(ViewGroup viewGroup, p140o4.r rVar, p140o4.r rVar2, ArrayList arrayList, ArrayList arrayList2) {
        long j = this.f5150t;
        int size = this.f5099U.size();
        for (int i10 = 0; i10 < size; i10++) {
            p pVar = (p) this.f5099U.get(i10);
            if (j > 0 && (this.f5100V || i10 == 0)) {
                long j10 = pVar.f5150t;
                if (j10 > 0) {
                    pVar.M(j10 + j);
                } else {
                    pVar.M(j);
                }
            }
            pVar.m(viewGroup, rVar, rVar2, arrayList, arrayList2);
        }
    }

    @Override // V0.p
    public final boolean v() {
        for (int i10 = 0; i10 < this.f5099U.size(); i10++) {
            if (((p) this.f5099U.get(i10)).v()) {
                return true;
            }
        }
        return false;
    }
}
