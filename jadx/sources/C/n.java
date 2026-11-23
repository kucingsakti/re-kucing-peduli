package C;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class n {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static int f835f;
    public ArrayList a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f836b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f837c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ArrayList f838d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f839e;

    public final void a(ArrayList arrayList) {
        int size = this.a.size();
        if (this.f839e != -1 && size > 0) {
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                n nVar = (n) arrayList.get(i10);
                if (this.f839e == nVar.f836b) {
                    c(this.f837c, nVar);
                }
            }
        }
        if (size == 0) {
            arrayList.remove(this);
        }
    }

    public final int b(p239z.c cVar, int i10) {
        int iN;
        int iN2;
        ArrayList arrayList = this.a;
        if (arrayList.size() == 0) {
            return 0;
        }
        B.e eVar = (B.e) ((B.d) arrayList.get(0)).f447T;
        cVar.t();
        eVar.b(cVar, false);
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            ((B.d) arrayList.get(i11)).b(cVar, false);
        }
        if (i10 == 0 && eVar.f513z0 > 0) {
            B.j.a(eVar, cVar, arrayList, 0);
        }
        if (i10 == 1 && eVar.f492A0 > 0) {
            B.j.a(eVar, cVar, arrayList, 1);
        }
        try {
            cVar.p();
        } catch (Exception e10) {
            System.err.println(e10.toString() + "\n" + Arrays.toString(e10.getStackTrace()).replace("[", "   at ").replace(",", "\n   at").replace("]", ""));
        }
        this.f838d = new ArrayList();
        for (int i12 = 0; i12 < arrayList.size(); i12++) {
            B.d dVar = (B.d) arrayList.get(i12);
            p053f4.e eVar2 = new p053f4.e(2);
            new WeakReference(dVar);
            p239z.c.n(dVar.f437I);
            p239z.c.n(dVar.f438J);
            p239z.c.n(dVar.f439K);
            p239z.c.n(dVar.f440L);
            p239z.c.n(dVar.f441M);
            this.f838d.add(eVar2);
        }
        if (i10 == 0) {
            iN = p239z.c.n(eVar.f437I);
            iN2 = p239z.c.n(eVar.f439K);
            cVar.t();
        } else {
            iN = p239z.c.n(eVar.f438J);
            iN2 = p239z.c.n(eVar.f440L);
            cVar.t();
        }
        return iN2 - iN;
    }

    public final void c(int i10, n nVar) {
        for (B.d dVar : this.a) {
            ArrayList arrayList = nVar.a;
            if (!arrayList.contains(dVar)) {
                arrayList.add(dVar);
            }
            int i11 = nVar.f836b;
            if (i10 == 0) {
                dVar.f477n0 = i11;
            } else {
                dVar.f479o0 = i11;
            }
        }
        this.f839e = nVar.f836b;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        int i10 = this.f837c;
        if (i10 == 0) {
            str = "Horizontal";
        } else if (i10 == 1) {
            str = "Vertical";
        } else {
            str = i10 == 2 ? "Both" : "Unknown";
        }
        sb.append(str);
        sb.append(" [");
        String strJ = E0.a.j(sb, this.f836b, "] <");
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            strJ = strJ + " " + ((B.d) it.next()).f466h0;
        }
        return p231y.a.c(strJ, " >");
    }
}
