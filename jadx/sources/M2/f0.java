package M2;

import com.google.android.gms.measurement.internal.zzfl;
import com.google.android.gms.measurement.internal.zzkx;
import com.google.android.gms.measurement.internal.zzlw;

/* JADX INFO: loaded from: classes.dex */
public final class f0 implements Runnable {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f3004s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ zzfl f3005t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ zzlw f3006u;

    public /* synthetic */ f0(zzlw zzlwVar, zzfl zzflVar, int i10) {
        this.f3004s = i10;
        this.f3005t = zzflVar;
        this.f3006u = zzlwVar;
    }

    private final void a() {
        synchronized (this.f3006u) {
            try {
                this.f3006u.f9250s = false;
                if (!this.f3006u.f9252u.k1()) {
                    this.f3006u.f9252u.i().f9052F.b("Connected to service");
                    zzkx zzkxVar = this.f3006u.f9252u;
                    zzfl zzflVar = this.f3005t;
                    zzkxVar.W0();
                    zzkxVar.f9243v = zzflVar;
                    zzkxVar.o1();
                    zzkxVar.n1();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f3004s) {
            case 0:
                a();
                return;
            default:
                synchronized (this.f3006u) {
                    try {
                        this.f3006u.f9250s = false;
                        if (!this.f3006u.f9252u.k1()) {
                            this.f3006u.f9252u.i().f9051E.b("Connected to remote service");
                            zzkx zzkxVar = this.f3006u.f9252u;
                            zzfl zzflVar = this.f3005t;
                            zzkxVar.W0();
                            zzkxVar.f9243v = zzflVar;
                            zzkxVar.o1();
                            zzkxVar.n1();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                return;
        }
    }
}
