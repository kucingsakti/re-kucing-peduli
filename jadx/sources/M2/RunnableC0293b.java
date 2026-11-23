package M2;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.measurement.internal.zzb;
import com.google.android.gms.measurement.internal.zzhj;
import com.google.android.gms.measurement.internal.zzkp;
import com.google.android.gms.measurement.internal.zzks;
import com.google.android.gms.measurement.internal.zzkx;

/* JADX INFO: renamed from: M2.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0293b implements Runnable {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f2970s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f2971t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ long f2972u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ AbstractC0306o f2973v;

    public /* synthetic */ RunnableC0293b(AbstractC0306o abstractC0306o, Object obj, long j, int i10) {
        this.f2970s = i10;
        this.f2971t = obj;
        this.f2972u = j;
        this.f2973v = abstractC0306o;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2970s) {
            case 0:
                zzb zzbVar = (zzb) this.f2973v;
                zzbVar.W0();
                String str = (String) this.f2971t;
                Preconditions.e(str);
                p212w.e eVar = zzbVar.f8915u;
                boolean zIsEmpty = eVar.isEmpty();
                long j = this.f2972u;
                if (zIsEmpty) {
                    zzbVar.f8916v = j;
                }
                Integer num = (Integer) eVar.get(str);
                if (num != null) {
                    eVar.put(str, Integer.valueOf(num.intValue() + 1));
                } else if (eVar.f15506u < 100) {
                    eVar.put(str, 1);
                    zzbVar.f8914t.put(str, Long.valueOf(j));
                } else {
                    zzbVar.i().f9047A.b("Too many ads visible");
                }
                break;
            case 1:
                zzb zzbVar2 = (zzb) this.f2973v;
                zzbVar2.W0();
                String str2 = (String) this.f2971t;
                Preconditions.e(str2);
                p212w.e eVar2 = zzbVar2.f8915u;
                Integer num2 = (Integer) eVar2.get(str2);
                if (num2 == null) {
                    zzbVar2.i().f9056x.a(str2, "Call to endAdUnitExposure for unknown ad unit id");
                } else {
                    zzkp zzkpVarD1 = zzbVar2.Y0().d1(false);
                    int iIntValue = num2.intValue() - 1;
                    if (iIntValue != 0) {
                        eVar2.put(str2, Integer.valueOf(iIntValue));
                    } else {
                        eVar2.remove(str2);
                        p212w.e eVar3 = zzbVar2.f8914t;
                        Long l4 = (Long) eVar3.get(str2);
                        long j10 = this.f2972u;
                        if (l4 == null) {
                            zzbVar2.i().f9056x.b("First ad unit exposure time was never set");
                        } else {
                            long jLongValue = j10 - l4.longValue();
                            eVar3.remove(str2);
                            zzbVar2.d1(str2, jLongValue, zzkpVarD1);
                        }
                        if (eVar2.isEmpty()) {
                            long j11 = zzbVar2.f8916v;
                            if (j11 != 0) {
                                zzbVar2.b1(j10 - j11, zzkpVarD1);
                                zzbVar2.f8916v = 0L;
                            } else {
                                zzbVar2.i().f9056x.b("First ad exposure time was never set");
                            }
                        }
                    }
                }
                break;
            default:
                zzks zzksVar = (zzks) this.f2973v;
                zzksVar.i1((zzkp) this.f2971t, false, this.f2972u);
                zzksVar.f9237w = null;
                zzkx zzkxVarR = ((zzhj) zzksVar.f577s).r();
                zzkxVarR.W0();
                zzkxVarR.a1();
                zzkxVarR.f1(new C3.c(zzkxVarR, null, 18, false));
                break;
        }
    }
}
