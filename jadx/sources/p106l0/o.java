package p106l0;

import android.util.SparseArray;

/* JADX INFO: loaded from: classes.dex */
public final class o {
    public final SparseArray a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public r f12877b;

    public o(int i10) {
        this.a = new SparseArray(i10);
    }

    public final void a(r rVar, int i10, int i11) {
        int iA = rVar.a(i10);
        SparseArray sparseArray = this.a;
        o oVar = sparseArray == null ? null : (o) sparseArray.get(iA);
        if (oVar == null) {
            oVar = new o(1);
            sparseArray.put(rVar.a(i10), oVar);
        }
        if (i11 > i10) {
            oVar.a(rVar, i10 + 1, i11);
        } else {
            oVar.f12877b = rVar;
        }
    }
}
