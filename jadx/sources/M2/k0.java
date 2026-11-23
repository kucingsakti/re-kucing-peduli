package M2;

import android.os.Bundle;
import android.os.SystemClock;
import com.google.android.gms.measurement.internal.zzbf;
import com.google.android.gms.measurement.internal.zzhj;
import com.google.android.gms.measurement.internal.zzmh;
import com.google.android.gms.measurement.internal.zznp;

/* JADX INFO: loaded from: classes.dex */
public final class k0 {
    public long a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f3043b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l0 f3044c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zzmh f3045d;

    public k0(zzmh zzmhVar) {
        this.f3045d = zzmhVar;
        this.f3044c = new l0(this, (zzhj) zzmhVar.f577s, 0);
        ((zzhj) zzmhVar.f577s).f9120F.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        this.a = jElapsedRealtime;
        this.f3043b = jElapsedRealtime;
    }

    public final boolean a(boolean z6, boolean z10, long j) {
        zzmh zzmhVar = this.f3045d;
        zzmhVar.W0();
        zzmhVar.a1();
        zzhj zzhjVar = (zzhj) zzmhVar.f577s;
        if (zzhjVar.h()) {
            C0313w c0313wU0 = zzmhVar.U0();
            zzhjVar.f9120F.getClass();
            c0313wU0.f3138I.b(System.currentTimeMillis());
        }
        long j10 = j - this.a;
        if (!z6 && j10 < 1000) {
            zzmhVar.i().f9052F.a(Long.valueOf(j10), "Screen exposed for less than 1000 ms. Event not sent. time");
            return false;
        }
        if (!z10) {
            j10 = j - this.f3043b;
            this.f3043b = j;
        }
        zzmhVar.i().f9052F.a(Long.valueOf(j10), "Recording user engagement, ms");
        Bundle bundle = new Bundle();
        bundle.putLong("_et", j10);
        zznp.y1(zzmhVar.Y0().d1(!zzhjVar.f9146y.k1()), bundle, true);
        if (!z10) {
            zzmhVar.X0().B1("auto", "_e", bundle);
        }
        this.a = j;
        l0 l0Var = this.f3044c;
        l0Var.a();
        l0Var.b(((Long) zzbf.f8977b0.a(null)).longValue());
        return true;
    }
}
