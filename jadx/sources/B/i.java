package B;

import C.n;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public abstract class i extends d {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public d[] f570q0 = new d[4];

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public int f571r0 = 0;

    public final void R(int i10, n nVar, ArrayList arrayList) {
        for (int i11 = 0; i11 < this.f571r0; i11++) {
            d dVar = this.f570q0[i11];
            ArrayList arrayList2 = nVar.a;
            if (!arrayList2.contains(dVar)) {
                arrayList2.add(dVar);
            }
        }
        for (int i12 = 0; i12 < this.f571r0; i12++) {
            C.h.b(this.f570q0[i12], i10, arrayList, nVar);
        }
    }

    public void S() {
    }
}
