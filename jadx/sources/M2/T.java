package M2;

import android.os.Bundle;
import com.google.android.gms.measurement.internal.zziv;

/* JADX INFO: loaded from: classes.dex */
public final class T implements Runnable {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ String f2931s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ String f2932t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ long f2933u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Bundle f2934v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ boolean f2935w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ boolean f2936x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ boolean f2937y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final /* synthetic */ zziv f2938z;

    public T(zziv zzivVar, String str, String str2, long j, Bundle bundle, boolean z6, boolean z10, boolean z11) {
        this.f2931s = str;
        this.f2932t = str2;
        this.f2933u = j;
        this.f2934v = bundle;
        this.f2935w = z6;
        this.f2936x = z10;
        this.f2937y = z11;
        this.f2938z = zzivVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f2938z.o1(this.f2931s, this.f2932t, this.f2933u, this.f2934v, this.f2935w, this.f2936x, this.f2937y);
    }
}
