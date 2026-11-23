package M2;

import android.os.SystemClock;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.measurement.internal.zznc;

/* JADX INFO: loaded from: classes.dex */
public final class p0 {
    public final String a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f3060b;

    public p0(zznc zzncVar, String str) {
        this.a = str;
        ((DefaultClock) zzncVar.a()).getClass();
        this.f3060b = SystemClock.elapsedRealtime();
    }
}
