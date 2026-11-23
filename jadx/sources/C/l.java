package C;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class l {
    public o a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ArrayList f832b;

    public static long a(f fVar, long j) {
        o oVar = fVar.f822d;
        if (oVar instanceof j) {
            return j;
        }
        ArrayList arrayList = fVar.f828k;
        int size = arrayList.size();
        long jMin = j;
        for (int i10 = 0; i10 < size; i10++) {
            d dVar = (d) arrayList.get(i10);
            if (dVar instanceof f) {
                f fVar2 = (f) dVar;
                if (fVar2.f822d != oVar) {
                    jMin = Math.min(jMin, a(fVar2, ((long) fVar2.f824f) + j));
                }
            }
        }
        if (fVar != oVar.f847i) {
            return jMin;
        }
        long j10 = oVar.j();
        f fVar3 = oVar.f846h;
        long j11 = j - j10;
        return Math.min(Math.min(jMin, a(fVar3, j11)), j11 - ((long) fVar3.f824f));
    }

    public static long b(f fVar, long j) {
        o oVar = fVar.f822d;
        if (oVar instanceof j) {
            return j;
        }
        ArrayList arrayList = fVar.f828k;
        int size = arrayList.size();
        long jMax = j;
        for (int i10 = 0; i10 < size; i10++) {
            d dVar = (d) arrayList.get(i10);
            if (dVar instanceof f) {
                f fVar2 = (f) dVar;
                if (fVar2.f822d != oVar) {
                    jMax = Math.max(jMax, b(fVar2, ((long) fVar2.f824f) + j));
                }
            }
        }
        if (fVar != oVar.f846h) {
            return jMax;
        }
        long j10 = oVar.j();
        f fVar3 = oVar.f847i;
        long j11 = j + j10;
        return Math.max(Math.max(jMax, b(fVar3, j11)), j11 - ((long) fVar3.f824f));
    }
}
