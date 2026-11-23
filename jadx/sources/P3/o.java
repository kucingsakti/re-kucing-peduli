package P3;

import androidx.work.impl.WorkDatabase;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicMarkableReference;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o implements Callable {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f3894s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f3895t;

    public /* synthetic */ o(Object obj, int i10) {
        this.f3894s = i10;
        this.f3895t = obj;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() throws Throwable {
        Map mapA;
        switch (this.f3894s) {
            case 0:
                K0.g gVar = (K0.g) this.f3895t;
                ((AtomicReference) gVar.f2527d).set(null);
                synchronized (gVar) {
                    try {
                        if (((AtomicMarkableReference) gVar.f2526c).isMarked()) {
                            mapA = ((d) ((AtomicMarkableReference) gVar.f2526c).getReference()).a();
                            AtomicMarkableReference atomicMarkableReference = (AtomicMarkableReference) gVar.f2526c;
                            atomicMarkableReference.set((d) atomicMarkableReference.getReference(), false);
                        } else {
                            mapA = null;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                if (mapA != null) {
                    T3.c cVar = (T3.c) gVar.f2528e;
                    ((g) cVar.f4657b).g((String) cVar.a, mapA, gVar.f2525b);
                }
                return null;
            default:
                WorkDatabase workDatabase = (WorkDatabase) ((p102k7.e) this.f3895t).f12743s;
                Long lU0 = workDatabase.r().U0("next_alarm_manager_id");
                int iLongValue = lU0 != null ? (int) lU0.longValue() : 0;
                workDatabase.r().W0(new o1.d("next_alarm_manager_id", Long.valueOf(iLongValue != Integer.MAX_VALUE ? iLongValue + 1 : 0)));
                return Integer.valueOf(iLongValue);
        }
    }
}
