package com.google.android.gms.internal.measurement;

import java.util.Collections;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class zzb {
    public final zzf a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public zzh f8478b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final zzac f8479c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final zzaa f8480d;

    public zzb() {
        zzf zzfVar = new zzf();
        this.a = zzfVar;
        this.f8478b = zzfVar.f8573b.d();
        this.f8479c = new zzac();
        this.f8480d = new zzaa();
        zza zzaVar = new zza();
        zzaVar.f8449s = this;
        zzl zzlVar = zzfVar.f8575d;
        zzlVar.a.put("internal.registerCallback", zzaVar);
        zzd zzdVar = new zzd();
        zzdVar.f8554s = this;
        zzlVar.a.put("internal.eventLogger", zzdVar);
    }

    public final void a(zzft.zzc zzcVar) throws zzc {
        zzal zzalVar;
        zzf zzfVar = this.a;
        try {
            this.f8478b = zzfVar.f8573b.d();
            if (zzfVar.a(this.f8478b, (zzft.zzd[]) zzcVar.B().toArray(new zzft.zzd[0])) instanceof zzaj) {
                throw new IllegalStateException("Program loading failed");
            }
            for (zzft.zzb zzbVar : zzcVar.z().C()) {
                zzjt zzjtVarB = zzbVar.B();
                String strA = zzbVar.A();
                Iterator<E> it = zzjtVarB.iterator();
                while (it.hasNext()) {
                    zzaq zzaqVarA = zzfVar.a(this.f8478b, (zzft.zzd) it.next());
                    if (!(zzaqVarA instanceof zzap)) {
                        throw new IllegalArgumentException("Invalid rule definition");
                    }
                    zzh zzhVar = this.f8478b;
                    if (zzhVar.f(strA)) {
                        zzaq zzaqVarC = zzhVar.c(strA);
                        if (!(zzaqVarC instanceof zzal)) {
                            throw new IllegalStateException("Invalid function name: " + strA);
                        }
                        zzalVar = (zzal) zzaqVarC;
                    } else {
                        zzalVar = null;
                    }
                    if (zzalVar == null) {
                        throw new IllegalStateException("Rule function is undefined: " + strA);
                    }
                    zzalVar.a(this.f8478b, Collections.singletonList(zzaqVarA));
                }
            }
        } catch (Throwable th) {
            throw new zzc(th);
        }
    }

    public final boolean b(zzad zzadVar) throws zzc {
        zzac zzacVar = this.f8479c;
        try {
            zzacVar.a = zzadVar;
            zzacVar.f8451b = (zzad) zzadVar.clone();
            zzacVar.f8452c.clear();
            this.a.f8574c.g("runtime.counter", new zzai(Double.valueOf(0.0d)));
            this.f8480d.a(this.f8478b.d(), zzacVar);
            zzac zzacVar2 = this.f8479c;
            return (zzacVar2.f8451b.equals(zzacVar2.a) && this.f8479c.f8452c.isEmpty()) ? false : true;
        } catch (Throwable th) {
            throw new zzc(th);
        }
    }
}
