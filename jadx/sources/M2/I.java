package M2;

import android.util.Log;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.measurement.internal.zzaj;
import com.google.android.gms.measurement.internal.zzhn;
import com.google.android.gms.measurement.internal.zzin;
import com.google.android.gms.measurement.internal.zznc;
import com.google.android.gms.measurement.internal.zzo;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import java.io.File;
import java.util.Iterator;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes.dex */
public final class I implements Callable {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f2909s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f2910t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Object f2911u;

    public /* synthetic */ I(Object obj, int i10, Object obj2) {
        this.f2909s = i10;
        this.f2911u = obj2;
        this.f2910t = obj;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f2909s) {
            case 0:
                zzhn zzhnVar = (zzhn) this.f2910t;
                zzhnVar.f9150b.b0();
                return new zzaj(zzhnVar.f9150b.f(((zzo) this.f2911u).f9350s));
            case 1:
                zznc zzncVar = ((zzhn) this.f2910t).f9150b;
                zzncVar.b0();
                C0298g c0298g = zzncVar.f9306u;
                zznc.n(c0298g);
                return c0298g.U1((String) this.f2911u);
            case 2:
                zzo zzoVar = (zzo) this.f2911u;
                String str = zzoVar.f9350s;
                Preconditions.i(str);
                zznc zzncVar2 = (zznc) this.f2910t;
                zzin zzinVarI = zzncVar2.I(str);
                zzin.zza zzaVar = zzin.zza.ANALYTICS_STORAGE;
                if (zzinVarI.i(zzaVar) && zzin.e(100, zzoVar.f9340N).i(zzaVar)) {
                    return zzncVar2.e(zzoVar).g();
                }
                zzncVar2.i().f9052F.b("Analytics storage consent denied. Returning null app instance id");
                return null;
            case 3:
                Boolean bool = (Boolean) this.f2911u;
                boolean zBooleanValue = bool.booleanValue();
                o1.c cVar = (o1.c) this.f2910t;
                if (zBooleanValue) {
                    Log.isLoggable("FirebaseCrashlytics", 3);
                    boolean zBooleanValue2 = bool.booleanValue();
                    Fa.e eVar = ((O3.o) cVar.f13624u).f3543b;
                    if (!zBooleanValue2) {
                        eVar.getClass();
                        throw new IllegalStateException("An invalid data collection token was used.");
                    }
                    ((TaskCompletionSource) eVar.f1663x).d(null);
                    ExecutorService executorService = (ExecutorService) ((O3.o) cVar.f13624u).f3546e.f13632s;
                    return ((P2.f) cVar.f13623t).l(executorService, new com.google.android.gms.internal.measurement.S(this, 8, executorService));
                }
                Log.isLoggable("FirebaseCrashlytics", 2);
                O3.o oVar = (O3.o) cVar.f13624u;
                Iterator it = T3.c.e(((File) oVar.f3548g.f4658c).listFiles(O3.o.f3542r)).iterator();
                while (it.hasNext()) {
                    ((File) it.next()).delete();
                }
                O3.o oVar2 = (O3.o) cVar.f13624u;
                T3.c cVar2 = ((T3.a) oVar2.f3553m.f14979t).f4654b;
                T3.a.a(T3.c.e(((File) cVar2.f4660e).listFiles()));
                T3.a.a(T3.c.e(((File) cVar2.f4661f).listFiles()));
                T3.a.a(T3.c.e(((File) cVar2.f4662g).listFiles()));
                oVar2.f3557q.d(null);
                return Tasks.e(null);
            case 4:
                O3.o.a((O3.o) this.f2910t, (String) this.f2911u, Boolean.FALSE);
                return null;
            default:
                return O3.r.a((O3.r) this.f2910t, (V3.b) this.f2911u);
        }
    }
}
