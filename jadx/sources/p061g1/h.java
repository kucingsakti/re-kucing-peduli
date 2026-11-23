package p061g1;

import android.os.Build;
import androidx.work.impl.WorkDatabase;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import o1.o;
import o1.p;
import p050f1.b;
import p050f1.q;

/* JADX INFO: loaded from: classes.dex */
public abstract class h {
    public static final /* synthetic */ int a = 0;

    static {
        q.c("Schedulers");
    }

    public static void a(b bVar, WorkDatabase workDatabase, List list) {
        if (list == null || list.size() == 0) {
            return;
        }
        p pVarV = workDatabase.v();
        workDatabase.c();
        try {
            int i10 = Build.VERSION.SDK_INT;
            int i11 = bVar.f11394h;
            if (i10 == 23) {
                i11 /= 2;
            }
            ArrayList arrayListB = pVarV.b(i11);
            ArrayList arrayListA = pVarV.a();
            if (arrayListB.size() > 0) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                Iterator it = arrayListB.iterator();
                while (it.hasNext()) {
                    pVarV.h(((o) it.next()).a, jCurrentTimeMillis);
                }
            }
            workDatabase.o();
            workDatabase.j();
            if (arrayListB.size() > 0) {
                o[] oVarArr = (o[]) arrayListB.toArray(new o[arrayListB.size()]);
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    g gVar = (g) it2.next();
                    if (gVar.e()) {
                        gVar.b(oVarArr);
                    }
                }
            }
            if (arrayListA.size() > 0) {
                o[] oVarArr2 = (o[]) arrayListA.toArray(new o[arrayListA.size()]);
                Iterator it3 = list.iterator();
                while (it3.hasNext()) {
                    g gVar2 = (g) it3.next();
                    if (!gVar2.e()) {
                        gVar2.b(oVarArr2);
                    }
                }
            }
        } catch (Throwable th) {
            workDatabase.j();
            throw th;
        }
    }
}
